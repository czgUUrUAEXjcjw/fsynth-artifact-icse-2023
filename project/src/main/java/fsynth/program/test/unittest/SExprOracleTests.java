package fsynth.program.test.unittest;

import fsynth.program.InputFormat;
import fsynth.program.subject.Subjects;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

/**
 * System tests for the SExpr Oracles Return Status
 *
 * @author anonymous
 * @since 2021-06-29
 */
public abstract class SExprOracleTests extends OracleTestHelper {
    /**
     * Instantiate test class with the correct suffix
     */
    public SExprOracleTests() {
        super(InputFormat.SEXP.getSuffix().substring(1));
    }

    /**
     * Get the JUnit Parameters, i.e. the subjects to test
     *
     * @return all subjects that should be unit-tested
     */
    static Stream<Arguments> localParameters() {
        return Stream.of(
                Arguments.of(Subjects.SEXP_PARSER)

        );
    }
}