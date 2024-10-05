package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axxf implements axxe {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications.platform").f();
        a = f.d("45357458", false);
        b = f.d("45359159", false);
        c = f.b("45357457", 5000L);
    }

    @Override // defpackage.axxe
    public final long a() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.axxe
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axxe
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }
}
