package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jtu implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jtu u = new jtu(20);
    public static final /* synthetic */ jtu t = new jtu(19);
    public static final /* synthetic */ jtu s = new jtu(18);
    public static final /* synthetic */ jtu r = new jtu(17);
    public static final /* synthetic */ jtu q = new jtu(16);
    public static final /* synthetic */ jtu p = new jtu(15);
    public static final /* synthetic */ jtu o = new jtu(14);
    public static final /* synthetic */ jtu n = new jtu(13);
    public static final /* synthetic */ jtu m = new jtu(12);
    public static final /* synthetic */ jtu l = new jtu(11);
    public static final /* synthetic */ jtu k = new jtu(10);
    public static final /* synthetic */ jtu j = new jtu(9);
    public static final /* synthetic */ jtu i = new jtu(8);
    public static final /* synthetic */ jtu h = new jtu(7);
    public static final /* synthetic */ jtu g = new jtu(6);
    public static final /* synthetic */ jtu f = new jtu(5);
    public static final /* synthetic */ jtu e = new jtu(4);
    public static final /* synthetic */ jtu d = new jtu(3);
    public static final /* synthetic */ jtu c = new jtu(2);
    public static final /* synthetic */ jtu b = new jtu(1);
    public static final /* synthetic */ jtu a = new jtu(0);

    private /* synthetic */ jtu(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                amru amruVar = (amru) obj;
                aone createBuilder = aswl.a.createBuilder();
                int size = amruVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aakt aaktVar = (aakt) amruVar.get(i2);
                    String g2 = aalt.g(aaktVar.d());
                    if ((aaktVar instanceof awil) || (aaktVar instanceof asxs) || (aaktVar instanceof asxd)) {
                        createBuilder.copyOnWrite();
                        aswl aswlVar = (aswl) createBuilder.instance;
                        aony aonyVar = aswlVar.b;
                        if (!aonyVar.c()) {
                            aswlVar.b = aonm.mutableCopy(aonyVar);
                        }
                        aswlVar.b.add(g2);
                    } else if ((aaktVar instanceof awig) || (aaktVar instanceof aswz)) {
                        createBuilder.copyOnWrite();
                        aswl aswlVar2 = (aswl) createBuilder.instance;
                        aony aonyVar2 = aswlVar2.c;
                        if (!aonyVar2.c()) {
                            aswlVar2.c = aonm.mutableCopy(aonyVar2);
                        }
                        aswlVar2.c.add(g2);
                    }
                }
                return (aswl) createBuilder.build();
            case 1:
                return ((fie) obj).b;
            case 2:
                return aypy.T((amru) obj);
            case 3:
                return amru.o((List) obj);
            case 4:
                return ((fie) obj).b;
            case 5:
                return aypy.T((amru) obj);
            case 6:
                return (askd) ((aong) obj).build();
            case 7:
                return amru.r((askd) obj);
            case 8:
                amrp f2 = amru.f();
                for (awiv awivVar : ((awiu) obj).getDownloads()) {
                    if (awivVar.b == 1) {
                        f2.h((String) awivVar.c);
                    }
                }
                return f2.g();
            case 9:
                return amru.o((List) obj);
            case 10:
                return aypy.T((amru) obj);
            case 11:
                aqnj aqnjVar = (aqnj) obj;
                if (aqnjVar.pY(aqoc.b)) {
                    return ayps.w((aqoc) aqnjVar.pX(aqoc.b));
                }
                return ayps.p();
            case 12:
                return (amru) obj;
            case 13:
                return ((awil) obj).g();
            case 14:
                return ((awjp) obj).getVideoId();
            case 15:
                return Boolean.valueOf(((fie) obj).a == 0);
            case 16:
                return ((aqoc) obj).c;
            case 17:
                return ((fie) obj).b;
            case 18:
                return (Integer) ((ammv) obj).c();
            case 19:
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            default:
                return khb.b;
        }
    }
}
