package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifo {
    private static final Map a = new EnumMap(aifn.class);

    static {
        for (aifn aifnVar : aifn.values()) {
            a.put(aifnVar, amyi.n(aifnVar.c));
        }
    }

    public static void a(aifn aifnVar, String str, Object... objArr) {
        amyi amyiVar = (amyi) a.get(aifnVar);
        if (amyiVar != null) {
            ((amyf) ((amyf) amyiVar.g()).i("com/google/android/libraries/youtube/player/internal/utils/PlayerLog", "w", 92, "PlayerLog.java")).w(str, objArr);
        }
    }
}
