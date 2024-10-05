package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpd implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gpd u = new gpd(20);
    public static final /* synthetic */ gpd t = new gpd(19);
    public static final /* synthetic */ gpd s = new gpd(18);
    public static final /* synthetic */ gpd r = new gpd(17);
    public static final /* synthetic */ gpd q = new gpd(16);
    public static final /* synthetic */ gpd p = new gpd(15);
    public static final /* synthetic */ gpd o = new gpd(14);
    public static final /* synthetic */ gpd n = new gpd(13);
    public static final /* synthetic */ gpd m = new gpd(12);
    public static final /* synthetic */ gpd l = new gpd(11);
    public static final /* synthetic */ gpd k = new gpd(10);
    public static final /* synthetic */ gpd j = new gpd(9);
    public static final /* synthetic */ gpd i = new gpd(8);
    public static final /* synthetic */ gpd h = new gpd(7);
    public static final /* synthetic */ gpd g = new gpd(6);
    public static final /* synthetic */ gpd f = new gpd(5);
    public static final /* synthetic */ gpd e = new gpd(4);
    public static final /* synthetic */ gpd d = new gpd(3);
    public static final /* synthetic */ gpd c = new gpd(2);
    public static final /* synthetic */ gpd b = new gpd(1);
    public static final /* synthetic */ gpd a = new gpd(0);

    private /* synthetic */ gpd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i2 = 0;
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((zcp) obj) instanceof zcs);
            case 1:
                return Boolean.valueOf(yjk.aa((Context) obj));
            case 2:
                return Boolean.valueOf(((Integer) obj).intValue() != 0);
            case 3:
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            case 4:
                return Optional.of((aakt) obj);
            case 5:
                return (aypy) obj;
            case 6:
                return new hxo(Optional.ofNullable(obj), Optional.empty());
            case 7:
                Throwable th = (Throwable) obj;
                if (th instanceof cnq) {
                    return new hxo(Optional.empty(), Optional.of((cnq) th));
                }
                throw new zje(th);
            case 8:
                ahel ahelVar = (ahel) obj;
                int i3 = ijo.bC;
                return ahelVar.a().A().A(new iis(ahelVar, i2));
            case 9:
                return Boolean.valueOf(((gir) obj).mN().f("reel_watch_fragment_watch_while") != null);
            case 10:
                return Optional.of((PlayerResponseModel) obj);
            case 11:
                return Boolean.valueOf(evr.af((arfd) obj));
            case 12:
                return (byte[]) ((ammv) obj).c();
            case 13:
                try {
                    return aypy.W((atdv) aonm.parseFrom(atdv.a, (byte[]) obj, aomw.b()));
                } catch (aoob e2) {
                    return aypy.J(e2);
                }
            case 14:
                isg isgVar = (isg) obj;
                avuf avufVar = isgVar.a;
                avuf avufVar2 = isgVar.b;
                if (avufVar2 == null) {
                    return isj.NONE;
                }
                if (avufVar == null) {
                    if (avufVar2.getNumVideosFailed().intValue() > 0) {
                        return isj.ERROR_STATE;
                    }
                    if (avufVar2.getNumVideosInProgress().intValue() > 0) {
                        return isj.PROGRESS_STATE;
                    }
                    if (avufVar2.getNumVideosCompleted().intValue() > 0) {
                        return isj.COMPLETE_STATE;
                    }
                    return isj.NONE;
                }
                if (avufVar2.getNumVideosFailed().intValue() > avufVar.getNumVideosFailed().intValue()) {
                    return isj.ERROR_STATE;
                }
                if (avufVar2.getNumVideosInProgress().intValue() > avufVar.getNumVideosInProgress().intValue()) {
                    return isj.PROGRESS_STATE;
                }
                if (avufVar2.getNumVideosCompleted().intValue() > avufVar.getNumVideosCompleted().intValue()) {
                    return isj.COMPLETE_STATE;
                }
                return isj.NONE;
            case 15:
                return isg.a((aakz) obj);
            case 16:
                return zjf.a;
            case 17:
                return isg.a((aakz) obj);
            case 18:
                return azjx.c((aypy) obj).e(0);
            case 19:
                return zjf.a;
            default:
                avuf avufVar3 = ((isg) obj).b;
                return Boolean.valueOf(avufVar3 != null && avufVar3.getNumVideosFailed().intValue() > 0);
        }
    }
}
