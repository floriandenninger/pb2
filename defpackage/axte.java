package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axte implements axtd {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.droidguard"));
        a = uvpVar.e("droidguard_enable_client_library_telemetry", false);
        b = uvpVar.d("droidguard_flows_with_fine_client_library_telemetry", "");
    }

    @Override // defpackage.axtd
    public final String a() {
        return (String) b.c();
    }

    @Override // defpackage.axtd
    public final boolean b() {
        return ((Boolean) a.c()).booleanValue();
    }
}
