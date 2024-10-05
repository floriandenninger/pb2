package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ivh implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ivh u = new ivh(20);
    public static final /* synthetic */ ivh t = new ivh(19);
    public static final /* synthetic */ ivh s = new ivh(18);
    public static final /* synthetic */ ivh r = new ivh(17);
    public static final /* synthetic */ ivh q = new ivh(16);
    public static final /* synthetic */ ivh p = new ivh(15);
    public static final /* synthetic */ ivh o = new ivh(14);
    public static final /* synthetic */ ivh n = new ivh(13);
    public static final /* synthetic */ ivh m = new ivh(12);
    public static final /* synthetic */ ivh l = new ivh(11);
    public static final /* synthetic */ ivh k = new ivh(10);
    public static final /* synthetic */ ivh j = new ivh(9);
    public static final /* synthetic */ ivh i = new ivh(8);
    public static final /* synthetic */ ivh h = new ivh(7);
    public static final /* synthetic */ ivh g = new ivh(6);
    public static final /* synthetic */ ivh f = new ivh(5);
    public static final /* synthetic */ ivh e = new ivh(4);
    public static final /* synthetic */ ivh d = new ivh(3);
    public static final /* synthetic */ ivh c = new ivh(2);
    public static final /* synthetic */ ivh b = new ivh(1);
    public static final /* synthetic */ ivh a = new ivh(0);

    private /* synthetic */ ivh(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof cnq) {
                    return new ivi(Optional.empty(), Optional.of((cnq) th));
                }
                throw new zje(th);
            case 1:
                obj.getClass();
                return new ivi(Optional.of(obj), Optional.empty());
            case 2:
                zcp zcpVar = (zcp) obj;
                return Integer.valueOf(zcpVar instanceof zcr ? ((zcr) zcpVar).a : 0);
            case 3:
                aswb aswbVar = ((arfd) obj).e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                return Boolean.valueOf(aswbVar.bk);
            case 4:
                return new fdx();
            case 5:
                return ((aaxi) obj).a;
            case 6:
                return (aaxh) ((ammv) obj).c();
            case 7:
                return zjf.a;
            case 8:
                return ((ayqj) obj).e().L().E(n);
            case 9:
                return new fdy();
            case 10:
                return ((ayqj) obj).j().A();
            case 11:
                return ((ayqj) obj).j().A();
            case 12:
                return zjf.a;
            case 13:
                return (Throwable) obj;
            case 14:
                return new fdw();
            case 15:
                atcb atcbVar = ((arfd) obj).l;
                if (atcbVar == null) {
                    atcbVar = atcb.a;
                }
                return Boolean.valueOf(atcbVar.g);
            case 16:
                return Optional.of((jfz) obj);
            case 17:
                return (ayqb) ((Optional) obj).map(iur.k).orElse(aypy.W(Optional.empty()));
            case 18:
                int i2 = jgd.b;
                return (ayqb) ((Optional) obj).map(iur.l).orElse(aypy.W(Optional.empty()));
            case 19:
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            default:
                aakz aakzVar = (aakz) obj;
                amsx amsxVar = jih.a;
                return ammw.a(aakzVar.a, ammv.i(aakzVar.c));
        }
    }
}
