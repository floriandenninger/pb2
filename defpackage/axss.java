package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axss implements axsq {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.auth_account"));
        uvp uvpVar2 = new uvp(uvpVar.b, uvpVar.c, uvpVar.d, uvpVar.e, true, uvpVar.h);
        try {
            a = uvpVar2.f("CapabilityFeatures__blocked_packages_for_connectionless", (aors) aonm.parseFrom(aors.a, new byte[0]), axsr.a);
            uvpVar2.e("CapabilityFeatures__debug_capability", false);
            uvpVar2.e("CapabilityFeatures__enable_capability", false);
            uvpVar2.e("CapabilityFeatures__enable_fetch_capabilities_in_get_accounts", false);
            uvpVar2.e("CapabilityFeatures__enable_force_sync", true);
            uvpVar2.e("CapabilityFeatures__enable_force_sync_for_unknown_capability", true);
            b = uvpVar2.e("CapabilityFeatures__use_connectionless", false);
            uvpVar2.e("CapabilityFeatures__use_gaia_service_flags", true);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"CapabilityFeatures__blocked_packages_for_connectionless\"");
        }
    }

    @Override // defpackage.axsq
    public final aors a() {
        return (aors) a.c();
    }

    @Override // defpackage.axsq
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
