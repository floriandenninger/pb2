package defpackage;

import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zcz implements ayrv {
    private final /* synthetic */ int u;
    public static final /* synthetic */ zcz t = new zcz(20);
    public static final /* synthetic */ zcz s = new zcz(19);
    public static final /* synthetic */ zcz r = new zcz(18);
    public static final /* synthetic */ zcz q = new zcz(17);
    public static final /* synthetic */ zcz p = new zcz(16);
    public static final /* synthetic */ zcz o = new zcz(15);
    public static final /* synthetic */ zcz n = new zcz(14);
    public static final /* synthetic */ zcz m = new zcz(13);
    public static final /* synthetic */ zcz l = new zcz(12);
    public static final /* synthetic */ zcz k = new zcz(11);
    public static final /* synthetic */ zcz j = new zcz(10);
    public static final /* synthetic */ zcz i = new zcz(8);
    public static final /* synthetic */ zcz h = new zcz(7);
    public static final /* synthetic */ zcz g = new zcz(6);
    public static final /* synthetic */ zcz f = new zcz(5);
    public static final /* synthetic */ zcz e = new zcz(4);
    public static final /* synthetic */ zcz d = new zcz(3);
    public static final /* synthetic */ zcz c = new zcz(2);
    public static final /* synthetic */ zcz b = new zcz(1);
    public static final /* synthetic */ zcz a = new zcz(0);

    public /* synthetic */ zcz(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        aveh avehVar;
        switch (this.u) {
            case 0:
                amru amruVar = (amru) obj;
                if (amruVar.size() == 1 && ((FoldingFeature) amruVar.get(0)).getState() == FoldingFeature.State.HALF_OPENED) {
                    FoldingFeature foldingFeature = (FoldingFeature) amruVar.get(0);
                    if (foldingFeature.getBounds().height() == 0) {
                        return new zcs(foldingFeature.getBounds().top);
                    }
                    if (foldingFeature.getBounds().width() == 0) {
                        return new zcr(foldingFeature.getBounds().left);
                    }
                }
                return whu.o();
            case 1:
                WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                amrp f2 = amru.f();
                for (int i2 = 0; i2 < windowLayoutInfo.getDisplayFeatures().size(); i2++) {
                    DisplayFeature displayFeature = (DisplayFeature) windowLayoutInfo.getDisplayFeatures().get(i2);
                    if (displayFeature instanceof FoldingFeature) {
                        f2.h((FoldingFeature) displayFeature);
                    }
                }
                return f2.g();
            case 2:
                return ((ammv) obj).c();
            case 3:
                return ((aypy) obj).aq(gip.r, opu.d).G(g);
            case 4:
                return ((ammv) obj).c();
            case 5:
                return ((amrp) obj).g();
            case 6:
                return ((amsv) obj).g();
            case 7:
                return ((aypy) obj).aq(gip.q, opu.c).G(f);
            case 8:
                return ammv.j(obj);
            case 9:
                final azqp azqpVar = (azqp) obj;
                return azqpVar.av().G(new ayrv() { // from class: zxa
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        azqp azqpVar2 = azqp.this;
                        List list = (List) obj2;
                        zwu a2 = zwv.a();
                        a2.b(zwt.FOLDER);
                        a2.a = ammv.j((DeviceLocalFile) list.get(0));
                        a2.b = ammv.j(azqpVar2.a);
                        a2.d(new File((String) azqpVar2.a).getName());
                        a2.c(list.size());
                        return a2.a();
                    }
                });
            case 10:
                return ((DeviceLocalFile) obj).g();
            case 11:
                return ((amrz) obj).values();
            case 12:
                aakt aaktVar = (aakt) ((ammv) obj).f();
                return aaktVar != null ? ammv.j(aaktVar.c()) : amlr.a;
            case 13:
                return ammv.i(((aakz) obj).c);
            case 14:
                return ammv.j((aakt) obj);
            case 15:
                return ammv.i(((aakz) obj).c);
            case 16:
                arjy arjyVar = (arjy) obj;
                if (arjyVar.b == 58174010) {
                    avehVar = (aveh) arjyVar.c;
                } else {
                    avehVar = aveh.a;
                }
                return new aame(avehVar);
            case 17:
                auox auoxVar = (auox) obj;
                int i3 = auoxVar.b;
                if ((i3 & 1) != 0) {
                    atmt atmtVar = auoxVar.c;
                    if (atmtVar == null) {
                        atmtVar = atmt.a;
                    }
                    return ammv.j(ahbj.o(atmtVar));
                }
                if ((i3 & 2) != 0) {
                    aufe aufeVar = auoxVar.d;
                    if (aufeVar == null) {
                        aufeVar = aufe.a;
                    }
                    return ammv.j(ahbj.o(aufeVar));
                }
                if ((i3 & 4) != 0) {
                    aulm aulmVar = auoxVar.e;
                    if (aulmVar == null) {
                        aulmVar = aulm.a;
                    }
                    return ammv.j(ahbj.o(aulmVar));
                }
                if ((i3 & 16) != 0) {
                    avgs avgsVar = auoxVar.g;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                    return ammv.j(ahbj.o(avgsVar));
                }
                if ((i3 & 8) == 0) {
                    return amlr.a;
                }
                asjj asjjVar = auoxVar.f;
                if (asjjVar == null) {
                    asjjVar = asjj.a;
                }
                return ammv.j(ahbj.o(asjjVar));
            case 18:
                return ammv.j((asem) obj);
            case 19:
                return ((aakz) obj).c;
            default:
                asuj asujVar = ((arfd) obj).m;
                if (asujVar == null) {
                    asujVar = asuj.a;
                }
                apto aptoVar = asujVar.f;
                return aptoVar == null ? apto.a : aptoVar;
        }
    }
}
