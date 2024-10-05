package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axuf implements axue {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.euid.client.dev", false);
        b = uvpVar.e("measurement.euid.service", false);
    }

    @Override // defpackage.axue
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axue
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
