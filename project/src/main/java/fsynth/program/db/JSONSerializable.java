package fsynth.program.db;

import org.json.JSONObject;

/**
 * @author anonymous
 * @since 2020-05-07
 **/
public interface JSONSerializable {
    JSONObject toJSON();

    void fromJSON(JSONObject jsonObject);
}
