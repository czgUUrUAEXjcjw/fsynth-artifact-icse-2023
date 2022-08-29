package fsynth.program.db.record;

import fsynth.program.Algorithm;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * This class represents a property record that maps an algorithm to a type T
 *
 * @author anonymous
 * @since 2020-05-07
 **/
public abstract class AlgorithmPropertyRecord<T extends Serializable> extends PropertyRecord<Algorithm, T> {
    AlgorithmPropertyRecord(Supplier<T> defaultValue) {
        super(defaultValue);
    }

    @Override
    String getJsonKey(Algorithm key) {
        return key.getJsonKey();
    }

    @Override
    Algorithm fromJsonKey(String key, JSONObject source) {
        return Algorithm.fromJSONKey(key);
    }
}
