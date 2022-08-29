package fsynth.program.db.record;

import fsynth.program.subject.Subjects;
import org.json.JSONObject;

/**
 * @author anonymous
 * @since 2020-05-07
 **/
public class SubjectStringPropertyRecord extends PropertyRecord<Subjects, String> {
    public SubjectStringPropertyRecord(String defaultValue) {
        super(() -> defaultValue);
    }

    @Override
    String getJsonKey(Subjects key) {
        return key.getJsonKey();
    }

    @Override
    Subjects fromJsonKey(String key, JSONObject source) {
        return Subjects.fromJSONKey(key);
    }

    @Override
    Object getJsonValue(String value) {
        return value;
    }

    @Override
    String fromJsonValue(String key, JSONObject source) {
        return source.getString(key);
    }
}
