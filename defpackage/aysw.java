package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysw {
    public static final ayrp a = new aysv(0);

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
