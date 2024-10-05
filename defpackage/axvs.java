package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axvs implements axvr {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.validation.internal_limits_internal_event_params", false);
        uvpVar.c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // defpackage.axvr
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
