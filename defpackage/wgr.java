package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.BelowPlayerImmersiveAdLayoutRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wgr implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ wgr u = new wgr(20);
    public static final /* synthetic */ wgr t = new wgr(19);
    public static final /* synthetic */ wgr s = new wgr(18);
    public static final /* synthetic */ wgr r = new wgr(17);
    public static final /* synthetic */ wgr q = new wgr(16);
    public static final /* synthetic */ wgr p = new wgr(15);
    public static final /* synthetic */ wgr o = new wgr(14);
    public static final /* synthetic */ wgr n = new wgr(13);
    public static final /* synthetic */ wgr m = new wgr(12);
    public static final /* synthetic */ wgr l = new wgr(11);
    public static final /* synthetic */ wgr k = new wgr(10);
    public static final /* synthetic */ wgr j = new wgr(9);
    public static final /* synthetic */ wgr i = new wgr(8);
    public static final /* synthetic */ wgr h = new wgr(7);
    public static final /* synthetic */ wgr g = new wgr(6);
    public static final /* synthetic */ wgr f = new wgr(5);
    public static final /* synthetic */ wgr e = new wgr(4);
    public static final /* synthetic */ wgr d = new wgr(3);
    public static final /* synthetic */ wgr c = new wgr(2);
    public static final /* synthetic */ wgr b = new wgr(1);
    public static final /* synthetic */ wgr a = new wgr(0);

    private /* synthetic */ wgr(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((awul) obj).c;
            case 1:
                auqd auqdVar = (auqd) obj;
                if (auqdVar.b == 64166933) {
                    return (auqc) auqdVar.c;
                }
                return auqc.a;
            case 2:
                aone builder = ((awul) obj).toBuilder();
                builder.copyOnWrite();
                awul awulVar = (awul) builder.instance;
                awulVar.b &= -5;
                awulVar.f = awul.a.f;
                return (awul) builder.build();
            case 3:
                return ((awul) obj).f;
            case 4:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                awul awulVar2 = (awul) aoneVar.instance;
                awul awulVar3 = awul.a;
                awulVar2.b |= 2;
                awulVar2.e = 1;
                return aoneVar;
            case 5:
                return Boolean.valueOf(((awul) obj).e > 0);
            case 6:
                return (xev) ((xgh) obj).d(xdz.class);
            case 7:
                return null;
            case 8:
                WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                if (watchNextResponseModel == null) {
                    return null;
                }
                aulq aulqVar = watchNextResponseModel.a.s;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (!aulqVar.pY(BelowPlayerImmersiveAdLayoutRendererOuterClass.belowPlayerImmersiveAdLayoutRenderer)) {
                    return null;
                }
                aulq aulqVar2 = watchNextResponseModel.a.s;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                return (aplf) aulqVar2.pX(BelowPlayerImmersiveAdLayoutRendererOuterClass.belowPlayerImmersiveAdLayoutRenderer);
            case 9:
                WatchNextResponseModel watchNextResponseModel2 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel2 != null) {
                    return watchNextResponseModel2.a.r;
                }
                return null;
            case 10:
                WatchNextResponseModel watchNextResponseModel3 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel3 == null) {
                    return null;
                }
                apxf apxfVar = watchNextResponseModel3.a.v;
                return apxfVar == null ? apxf.a : apxfVar;
            case 11:
                WatchNextResponseModel watchNextResponseModel4 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel4 != null) {
                    return amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", watchNextResponseModel4.a);
                }
                return null;
            case 12:
                WatchNextResponseModel watchNextResponseModel5 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel5 == null) {
                    return null;
                }
                aqde aqdeVar = watchNextResponseModel5.a.g;
                return aqdeVar == null ? aqde.a : aqdeVar;
            case 13:
                awuo awuoVar = (awuo) obj;
                return (awuoVar.b & 1) != 0 ? ammv.j(Long.valueOf(awuoVar.c)) : amlr.a;
            case 14:
                return Boolean.valueOf(((lae) obj).h);
            case 15:
                return Boolean.valueOf(((lae) obj).j);
            case 16:
                return Boolean.valueOf(((lae) obj).g);
            case 17:
                return Boolean.valueOf(((lae) obj).d);
            case 18:
                return Boolean.valueOf(((lae) obj).e);
            case 19:
                return Boolean.valueOf(((lae) obj).f);
            default:
                return Boolean.valueOf(((lae) obj).i);
        }
    }
}
