package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrw implements axrv {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications").f();
        a = f.d("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        b = f.d("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", true);
        c = f.b("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000L);
    }

    @Override // defpackage.axrv
    public final long a() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.axrv
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axrv
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }
}
