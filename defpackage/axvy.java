package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axvy implements axvx {
    public static final uvr a;
    public static final uvr b;
    public static final uvr c;
    public static final uvr d;
    public static final uvr e;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.test.boolean_flag", false);
        b = uvpVar.b("measurement.test.double_flag", -3.0d);
        c = uvpVar.c("measurement.test.int_flag", -2L);
        d = uvpVar.c("measurement.test.long_flag", -1L);
        e = uvpVar.d("measurement.test.string_flag", "---");
    }

    @Override // defpackage.axvx
    public final double a() {
        return ((Double) b.c()).doubleValue();
    }

    @Override // defpackage.axvx
    public final long b() {
        return ((Long) c.c()).longValue();
    }

    @Override // defpackage.axvx
    public final long c() {
        return ((Long) d.c()).longValue();
    }

    @Override // defpackage.axvx
    public final String d() {
        return (String) e.c();
    }

    @Override // defpackage.axvx
    public final boolean e() {
        return ((Boolean) a.c()).booleanValue();
    }
}
