package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axuc implements axub {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        uvpVar.e("measurement.client.consent_state_v1", true);
        uvpVar.e("measurement.client.3p_consent_state_v1", true);
        uvpVar.e("measurement.service.consent_state_v1_W36", true);
        a = uvpVar.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.axub
    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
