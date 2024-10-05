package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nxb implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ nxb u = new nxb(20);
    public static final /* synthetic */ nxb t = new nxb(19);
    public static final /* synthetic */ nxb s = new nxb(18);
    public static final /* synthetic */ nxb r = new nxb(17);
    public static final /* synthetic */ nxb q = new nxb(16);
    public static final /* synthetic */ nxb p = new nxb(15);
    public static final /* synthetic */ nxb o = new nxb(14);
    public static final /* synthetic */ nxb n = new nxb(13);
    public static final /* synthetic */ nxb m = new nxb(12);
    public static final /* synthetic */ nxb l = new nxb(11);
    public static final /* synthetic */ nxb k = new nxb(10);
    public static final /* synthetic */ nxb j = new nxb(9);
    public static final /* synthetic */ nxb i = new nxb(8);
    public static final /* synthetic */ nxb h = new nxb(7);
    public static final /* synthetic */ nxb g = new nxb(6);
    public static final /* synthetic */ nxb f = new nxb(5);
    public static final /* synthetic */ nxb e = new nxb(4);
    public static final /* synthetic */ nxb d = new nxb(3);
    public static final /* synthetic */ nxb c = new nxb(2);
    public static final /* synthetic */ nxb b = new nxb(1);
    public static final /* synthetic */ nxb a = new nxb(0);

    private /* synthetic */ nxb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return (nqg) ((ammv) obj).c();
            case 1:
                return ammv.j((Integer) obj);
            case 2:
                return Boolean.valueOf(((nxh) obj) != nxh.HIDDEN);
            case 3:
                return nxj.a((nxh) obj);
            case 4:
                return ((nxk) obj).b;
            case 5:
                return ((nxv) obj).x();
            case 6:
                return (nxj) ((ammv) obj).c();
            case 7:
                return (nxv) ((ammv) obj).c();
            case 8:
                return Boolean.valueOf(((ammv) obj).h());
            case 9:
                amsx amsxVar = (amsx) obj;
                return (amsxVar.size() == 1 && amsxVar.contains(aqtl.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER)) ? amvs.a : amsxVar;
            case 10:
                ((nqg) obj).z();
                return Double.valueOf(0.34d);
            case 11:
                return (nqg) ((ammv) obj).c();
            case 12:
                return Boolean.valueOf(((nqg) obj).v());
            case 13:
                return (nqg) ((ammv) obj).c();
            case 14:
                return ((nqg) ((ammv) obj).c()).k();
            case 15:
                zcp zcpVar = (zcp) obj;
                return Integer.valueOf(zcpVar instanceof zcs ? ((zcs) zcpVar).a : 0);
            case 16:
                return ((zck) obj).a.a;
            case 17:
                return ((gir) obj).aQ();
            case 18:
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            case 19:
                return Boolean.valueOf(((zcp) obj) instanceof zcs);
            default:
                return ((ahel) obj).a().b();
        }
    }
}
