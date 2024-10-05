package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axvm implements axvl {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        uvpVar.c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = uvpVar.e("measurement.lifecycle.app_backgrounded_engagement", false);
        uvpVar.e("measurement.lifecycle.app_backgrounded_tracking", true);
        b = uvpVar.e("measurement.lifecycle.app_in_background_parameter", false);
        uvpVar.c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // defpackage.axvl
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axvl
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
