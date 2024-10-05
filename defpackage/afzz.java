package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzz {
    public static final amrz a = amrz.m(0, "ACTION1_CLICKED", 1, "ACTION2_CLICKED", 2, "ACTION3_CLICKED");

    public static void a(azrw azrwVar, String str, aaea aaeaVar) {
        if (d(aaeaVar, azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).j.get()).b(str);
        }
    }

    public static void b(azrw azrwVar, String str, aaea aaeaVar) {
        if (d(aaeaVar, azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).m.get()).b(str);
        }
    }

    public static void c(azrw azrwVar, String str, boolean z, aaea aaeaVar) {
        if (d(aaeaVar, azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).n.get()).b(str, Boolean.valueOf(z));
        }
    }

    public static boolean d(aaea aaeaVar, azrw azrwVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return false;
        }
        atog atogVar = aaeaVar.a().p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        return atogVar != null && atogVar.l && g(azrwVar);
    }

    public static void e(azrw azrwVar, String str) {
        if (g(azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).l.get()).b(str, false);
        }
    }

    public static void f(azrw azrwVar, String str, aaea aaeaVar) {
        if (d(aaeaVar, azrwVar)) {
            e(azrwVar, str);
        }
    }

    private static boolean g(azrw azrwVar) {
        return azrwVar != null;
    }
}
