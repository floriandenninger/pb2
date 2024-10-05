package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hxj implements aypw {
    private final /* synthetic */ int f;
    public static final /* synthetic */ hxj e = new hxj(4);
    public static final /* synthetic */ hxj d = new hxj(3);
    public static final /* synthetic */ hxj c = new hxj(2);
    public static final /* synthetic */ hxj b = new hxj(1);
    public static final /* synthetic */ hxj a = new hxj(0);

    private /* synthetic */ hxj(int i) {
        this.f = i;
    }

    @Override // defpackage.aypw
    public final aypv a(ayps aypsVar) {
        int i = this.f;
        if (i == 0) {
            return aypsVar.B(gsv.h);
        }
        if (i == 1) {
            return aypsVar.x(gpd.g).E(gpd.h);
        }
        if (i != 2) {
            return i != 3 ? aypsVar.r(oht.m).x(zcz.c) : aypsVar.B(iub.b);
        }
        return aypsVar.x(ivh.b).E(ivh.a);
    }
}
