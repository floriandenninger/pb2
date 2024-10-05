package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axtn implements axtm {
    public static final uvr a;
    public static final uvr b;
    public static final uvr c;

    static {
        uvp a2 = new uvp(uvg.a("com.google.android.gms.measurement")).a();
        a = a2.e("measurement.adid_zero.service", false);
        b = a2.e("measurement.adid_zero.adid_uid", false);
        c = a2.e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }

    @Override // defpackage.axtm
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axtm
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axtm
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    @Override // defpackage.axtm
    public final void d() {
    }
}
