package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axtq implements axtp {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.androidId.delete_feature", true);
        uvpVar.e("measurement.log_androidId_enabled", false);
    }

    @Override // defpackage.axtp
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
