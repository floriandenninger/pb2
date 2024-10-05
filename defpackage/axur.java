package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axur implements axuq {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        b = uvpVar.e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // defpackage.axuq
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axuq
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axuq
    public final void c() {
    }
}
