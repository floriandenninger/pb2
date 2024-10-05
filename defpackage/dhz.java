package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhz {
    public static volatile dhy a;

    private dhz() {
    }

    public static void a(int i, String str, String str2) {
        c().a(i, str, str2);
    }

    public static void b(String str, String str2) {
        c().b(2, str, str2);
    }

    private static dhy c() {
        if (a == null) {
            synchronized (dhz.class) {
                if (a == null) {
                    a = new dig();
                }
            }
        }
        return a;
    }
}
