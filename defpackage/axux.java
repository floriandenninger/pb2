package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axux implements axuw {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.client.sessions.check_on_reset_and_enable2", true);
        uvpVar.e("measurement.client.sessions.check_on_startup", true);
        uvpVar.e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.axuw
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axuw
    public final void b() {
    }
}
