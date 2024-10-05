package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axth implements axtg {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.droidguard"));
        a = uvpVar.e("droidguard_enable_local_apk_signature_verification_in_client", true);
        uvpVar.e("droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    @Override // defpackage.axtg
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
