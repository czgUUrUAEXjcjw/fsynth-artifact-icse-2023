package fsynth.program.db.record;

import org.json.JSONObject;

/**
 * @author anonymous
 * @since 2020-05-07
 **/
public class StringPropertyRecord extends PropertyRecord<String, String> {
    public StringPropertyRecord(String defaultValue) {
        super(() -> defaultValue);
    }

    @Override
    String getJsonKey(String key) {
        return key;
    }

    @Override
    String fromJsonKey(String key, JSONObject source) {
        return key;
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
