package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afid {
    public static final Map a = new EnumMap(afic.class);

    static {
        for (afic aficVar : afic.values()) {
            a.put(aficVar, amyi.n(aficVar.p));
        }
    }

    public static void a(afic aficVar, Object obj) {
        b(aficVar, "%s", obj);
    }

    public static void b(afic aficVar, String str, Object... objArr) {
        ((amyf) ((amyf) ((amyi) a.get(aficVar)).f()).i("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 159, "MediaLog.java")).w(str, objArr);
    }

    public static void c(afic aficVar, Throwable th, String str, Object... objArr) {
        ((amyf) ((amyf) ((amyf) ((amyi) a.get(aficVar)).f()).h(th)).i("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 153, "MediaLog.java")).w(str, objArr);
    }

    public static void d(afic aficVar, Object obj) {
        e(aficVar, "%s", obj);
    }

    public static void e(afic aficVar, String str, Object... objArr) {
        ((amyf) ((amyf) ((amyi) a.get(aficVar)).g()).i("com/google/android/libraries/youtube/media/utils/MediaLog", "w", 130, "MediaLog.java")).w(str, objArr);
    }

    public static afic f() {
        return afic.MEDIAFETCH;
    }

    public static void g(amxk amxkVar) {
        anaf.d(amxkVar, "lazy arg");
    }
}
