package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqm {
    public static final azqm a;
    private static final /* synthetic */ azqm[] b;

    static {
        azqm azqmVar = new azqm();
        a = azqmVar;
        b = new azqm[]{azqmVar};
    }

    private azqm() {
    }

    public static Object a(ayqx ayqxVar) {
        return new azqj(ayqxVar);
    }

    public static Object b(Throwable th) {
        return new azqk(th);
    }

    public static Object c(banx banxVar) {
        return new azql(banxVar);
    }

    public static Throwable d(Object obj) {
        return ((azqk) obj).a;
    }

    public static boolean e(Object obj, ayqd ayqdVar) {
        if (obj == a) {
            ayqdVar.sh();
            return true;
        }
        if (obj instanceof azqk) {
            ayqdVar.b(((azqk) obj).a);
            return true;
        }
        ayqdVar.c(obj);
        return false;
    }

    public static boolean f(Object obj, ayqd ayqdVar) {
        if (obj == a) {
            ayqdVar.sh();
            return true;
        }
        if (obj instanceof azqk) {
            ayqdVar.b(((azqk) obj).a);
            return true;
        }
        if (obj instanceof azqj) {
            ayqdVar.se(((azqj) obj).a);
            return false;
        }
        ayqdVar.c(obj);
        return false;
    }

    public static boolean g(Object obj) {
        return obj == a;
    }

    public static boolean h(Object obj) {
        return obj instanceof azqk;
    }

    public static azqm[] values() {
        return (azqm[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
