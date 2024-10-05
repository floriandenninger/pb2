package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aiui {
    UNKNOWN,
    OFF,
    ON,
    ON_RECOMMENDED;

    public static final Map e;
    public static final Map f;

    static {
        aiui aiuiVar = UNKNOWN;
        aiui aiuiVar2 = OFF;
        aiui aiuiVar3 = ON;
        aiui aiuiVar4 = ON_RECOMMENDED;
        HashMap hashMap = new HashMap();
        hashMap.put(apnr.CAPTIONS_INITIAL_STATE_UNKNOWN, aiuiVar);
        hashMap.put(apnr.CAPTIONS_INITIAL_STATE_ON_REQUIRED, aiuiVar3);
        hashMap.put(apnr.CAPTIONS_INITIAL_STATE_ON_RECOMMENDED, aiuiVar4);
        hashMap.put(apnr.CAPTIONS_INITIAL_STATE_OFF_REQUIRED, aiuiVar2);
        hashMap.put(apnr.CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED, aiuiVar);
        f = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(atyc.UNKNOWN, aiuiVar);
        hashMap2.put(atyc.ON, aiuiVar3);
        hashMap2.put(atyc.OFF, aiuiVar2);
        hashMap2.put(atyc.ON_WEAK, aiuiVar);
        hashMap2.put(atyc.OFF_WEAK, aiuiVar);
        hashMap2.put(atyc.FORCED_ON, aiuiVar3);
        e = Collections.unmodifiableMap(hashMap2);
    }
}
