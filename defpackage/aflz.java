package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aflz implements ayrw {
    private final /* synthetic */ int t;
    public static final /* synthetic */ aflz s = new aflz(20);
    public static final /* synthetic */ aflz r = new aflz(19);
    public static final /* synthetic */ aflz q = new aflz(18);
    public static final /* synthetic */ aflz p = new aflz(17);
    public static final /* synthetic */ aflz o = new aflz(16);
    public static final /* synthetic */ aflz n = new aflz(15);
    public static final /* synthetic */ aflz m = new aflz(14);
    public static final /* synthetic */ aflz l = new aflz(13);
    public static final /* synthetic */ aflz k = new aflz(12);
    public static final /* synthetic */ aflz j = new aflz(11);
    public static final /* synthetic */ aflz i = new aflz(10);
    public static final /* synthetic */ aflz h = new aflz(9);
    public static final /* synthetic */ aflz g = new aflz(8);
    public static final /* synthetic */ aflz f = new aflz(7);
    public static final /* synthetic */ aflz e = new aflz(6);
    public static final /* synthetic */ aflz d = new aflz(3);
    public static final /* synthetic */ aflz c = new aflz(2);
    public static final /* synthetic */ aflz b = new aflz(1);
    public static final /* synthetic */ aflz a = new aflz(0);

    public /* synthetic */ aflz(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.t) {
            case 0:
                return ((ammv) obj).h();
            case 1:
                return ((Integer) obj).intValue() != 2;
            case 2:
                return ((ammv) obj).h();
            case 3:
                return !TextUtils.isEmpty((String) obj);
            case 4:
                aakt aaktVar = (aakt) obj;
                if (aaktVar instanceof asvm) {
                    asvm asvmVar = (asvm) aaktVar;
                    if (asvmVar.b() && asvmVar.getMarkersList().d.size() != 0 && (asvmVar.getMarkersListModel().b.b & 1) != 0) {
                        return true;
                    }
                }
                return false;
            case 5:
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h() && (ammvVar.c() instanceof avgz)) {
                    avgz avgzVar = (avgz) ammvVar.c();
                    if ((avgzVar.b.b & 4) != 0 && avgzVar.getTimedListData().b.size() != 0 && ((avhe) avgzVar.getTimedListData().b.get(0)).b.size() != 0) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((asbm) obj).b != 0;
            case 7:
                return ((asbm) obj).d != 0;
            case 8:
                return !((ahdv) obj).equals(ahdv.a);
            case 9:
                return !((ahel) obj).equals(ahel.a);
            case 10:
                return !((ahel) obj).equals(ahel.a);
            case 11:
                return ((ahds) obj).b().equals(aigj.PLAYBACK_INTERRUPTED);
            case 12:
                return (((akzs) obj).b & 16384) != 0;
            case 13:
                return (((akzs) obj).b & 32768) != 0;
            case 14:
                return (((akzs) obj).b & 16) != 0;
            case 15:
                return (((akzs) obj).b & 32) != 0;
            case 16:
                return (((akzs) obj).b & 2) != 0;
            case 17:
                return (((akzs) obj).b & 128) != 0;
            case 18:
                return (((akzs) obj).d & 512) != 0;
            case 19:
                int i2 = akux.t;
                return ((akzs) obj).T.size() > 0;
            default:
                akzs akzsVar = (akzs) obj;
                return !akzsVar.t || akzsVar.u;
        }
    }
}
