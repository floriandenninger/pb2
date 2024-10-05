package defpackage;

import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ism implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ism u = new ism(20);
    public static final /* synthetic */ ism t = new ism(19);
    public static final /* synthetic */ ism s = new ism(18);
    public static final /* synthetic */ ism r = new ism(17);
    public static final /* synthetic */ ism q = new ism(16);
    public static final /* synthetic */ ism p = new ism(15);
    public static final /* synthetic */ ism o = new ism(14);
    public static final /* synthetic */ ism n = new ism(13);
    public static final /* synthetic */ ism m = new ism(12);
    public static final /* synthetic */ ism l = new ism(11);
    public static final /* synthetic */ ism k = new ism(10);
    public static final /* synthetic */ ism j = new ism(9);
    public static final /* synthetic */ ism i = new ism(8);
    public static final /* synthetic */ ism h = new ism(7);
    public static final /* synthetic */ ism g = new ism(6);
    public static final /* synthetic */ ism f = new ism(5);
    public static final /* synthetic */ ism e = new ism(4);
    public static final /* synthetic */ ism d = new ism(3);
    public static final /* synthetic */ ism c = new ism(2);
    public static final /* synthetic */ ism b = new ism(1);
    public static final /* synthetic */ ism a = new ism(0);

    private /* synthetic */ ism(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return azjx.c((aypy) obj).e(0);
            case 1:
                return isg.a((aakz) obj);
            case 2:
                return false;
            case 3:
                isg isgVar = (isg) obj;
                avuf avufVar = isgVar.b;
                avuf avufVar2 = isgVar.a;
                if (avufVar == null) {
                    return itd.a();
                }
                if (avufVar2 == null) {
                    if (avufVar.getNumVideosFailed().intValue() > 0) {
                        return itc.a(avufVar.getNumVideosFailed().intValue(), avufVar.getNumVideosFailed().intValue() + avufVar.getNumVideosCompleted().intValue() + avufVar.getNumVideosInProgress().intValue());
                    }
                    if (avufVar.getNumVideosInProgress().intValue() > 0) {
                        return ite.a(avufVar.getUploadProgress().floatValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosFailed().intValue());
                    }
                    if (avufVar.getNumVideosCompleted().intValue() > 0) {
                        return itb.a(avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosFailed().intValue());
                    }
                } else {
                    if (avufVar.getNumVideosFailed().intValue() > avufVar2.getNumVideosFailed().intValue()) {
                        return itc.a(avufVar.getNumVideosFailed().intValue(), avufVar.getNumVideosFailed().intValue() + avufVar.getNumVideosCompleted().intValue() + avufVar.getNumVideosInProgress().intValue());
                    }
                    if (avufVar.getNumVideosInProgress().intValue() > 0) {
                        return ite.a(avufVar.getUploadProgress().floatValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosFailed().intValue());
                    }
                    if (avufVar.getNumVideosCompleted().intValue() > avufVar2.getNumVideosCompleted().intValue()) {
                        return itb.a(avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosFailed().intValue());
                    }
                }
                return itd.a();
            case 4:
                return Boolean.valueOf(!(((ita) obj) instanceof itd));
            case 5:
                return "";
            case 6:
                return isg.a((aakz) obj);
            case 7:
                return (ita) ((ammv) obj).b(icu.g).e(itd.a());
            case 8:
                ammv ammvVar = (ammv) obj;
                return ammvVar.f() instanceof avuf ? ammvVar.b(icu.f) : amlr.a;
            case 9:
                return (aypy) obj;
            case 10:
                return (aypy) obj;
            case 11:
                return itd.a();
            case 12:
                return itd.a();
            case 13:
                aakt aaktVar = ((aakz) ((ammw) obj).a).c;
                aaktVar.getClass();
                return aaktVar;
            case 14:
                return ((aqxg) obj).b;
            case 15:
                return ((mka) obj).e;
            case 16:
                return mka.a((atvz) obj);
            case 17:
                aypy aypyVar = (aypy) obj;
                int i2 = ivj.cs;
                return aypyVar;
            case 18:
                return (View) ((Optional) obj).get();
            case 19:
                return (mka) ((Optional) obj).get();
            default:
                int i3 = ivj.cs;
                return ((Optional) obj).map(iup.k);
        }
    }
}
