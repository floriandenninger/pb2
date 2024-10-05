package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsl implements axsk {
    public static final uxe a;
    public static final uxe b;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications").f();
        try {
            a = f.e("SyncFeature__disable_fetch_latest_threads_by_reason", (ucs) aonm.parseFrom(ucs.b, new byte[0]), uxf.g);
            try {
                f.e("SyncFeature__disable_fetch_threads_by_id_by_reason", (ucs) aonm.parseFrom(ucs.b, new byte[0]), uxf.g);
                try {
                    b = f.e("SyncFeature__disable_fetch_updated_threads_by_reason", (ucs) aonm.parseFrom(ucs.b, new byte[0]), uxf.g);
                } catch (aoob unused) {
                    throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_updated_threads_by_reason\"");
                }
            } catch (aoob unused2) {
                throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_threads_by_id_by_reason\"");
            }
        } catch (aoob unused3) {
            throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_latest_threads_by_reason\"");
        }
    }

    @Override // defpackage.axsk
    public final ucs a() {
        return (ucs) a.get();
    }

    @Override // defpackage.axsk
    public final ucs b() {
        return (ucs) b.get();
    }
}
