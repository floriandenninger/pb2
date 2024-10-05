package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axwb implements axwa {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.module.pixie.ees", true);
        b = uvpVar.e("measurement.module.pixie.fix_array", true);
    }

    @Override // defpackage.axwa
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axwa
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axwa
    public final void c() {
    }
}
