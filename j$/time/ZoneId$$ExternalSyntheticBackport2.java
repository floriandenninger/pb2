package j$.time;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class ZoneId$$ExternalSyntheticBackport2 {
    public static /* synthetic */ Map m(Map.Entry[] entryArr) {
        HashMap hashMap = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
