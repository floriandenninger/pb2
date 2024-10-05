package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsc implements axsb {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications").f();
        a = f.d("PeriodicWipeoutFeature__enabled", true);
        b = f.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        c = f.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }

    @Override // defpackage.axsb
    public final long a() {
        return ((Long) b.get()).longValue();
    }

    @Override // defpackage.axsb
    public final long b() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.axsb
    public final boolean c() {
        return ((Boolean) a.get()).booleanValue();
    }
}
