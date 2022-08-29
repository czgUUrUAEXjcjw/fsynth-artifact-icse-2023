package fsynth.program.repairer;

import fsynth.program.Parsing;
import fsynth.program.subject.Subject;

import java.nio.file.Path;

/**
 * @author anonymous
 * @since 2021-03-22
 **/
public abstract class DDRepairer extends Repairer {
    /**
     * Instantiate a DeltaDebugging-repairer that repairs the given file
     *
     * @param file File to repair
     */
    public DDRepairer(Path file) {
        super(file);
    }

    abstract String runDeltaDebugging(Path file, Subject subject);

    @Override
    protected Path repair(Path file, Subject subject) {
        String ddmaxresult;

        //Check if the file is corrupted
        final boolean isCorrupted = !subject.run(file.normalize().toString(), null).wasSuccessful();
        this.incrementSubjectRuns(subject.getKind());
        if (isCorrupted) {
            ddmaxresult = this.runDeltaDebugging(file, subject);
        } else {
            ddmaxresult = Parsing.readStringFromFile(file);
        }
        final Path ddmaxRepairedFile = getResultPathFor(subject.getKind(), file);
        Parsing.writeStringToFile(ddmaxRepairedFile, ddmaxresult);
        return ddmaxRepairedFile;
    }
}
