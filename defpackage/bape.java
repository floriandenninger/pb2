package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bape {
    public static final Object a = new Object();
    public static boolean b;

    public static boolean a() {
        boolean z;
        synchronized (a) {
            z = b;
        }
        return z;
    }
}
