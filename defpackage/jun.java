package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jun implements ynk {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jun u = new jun(20);
    public static final /* synthetic */ jun t = new jun(19);
    public static final /* synthetic */ jun s = new jun(18);
    public static final /* synthetic */ jun r = new jun(17);
    public static final /* synthetic */ jun q = new jun(16);
    public static final /* synthetic */ jun p = new jun(15);
    public static final /* synthetic */ jun o = new jun(14);
    public static final /* synthetic */ jun n = new jun(13);
    public static final /* synthetic */ jun m = new jun(12);
    public static final /* synthetic */ jun l = new jun(11);
    public static final /* synthetic */ jun k = new jun(10);
    public static final /* synthetic */ jun j = new jun(9);
    public static final /* synthetic */ jun i = new jun(8);
    public static final /* synthetic */ jun h = new jun(7);
    public static final /* synthetic */ jun g = new jun(6);
    public static final /* synthetic */ jun f = new jun(5);
    public static final /* synthetic */ jun e = new jun(4);
    public static final /* synthetic */ jun d = new jun(3);
    public static final /* synthetic */ jun c = new jun(2);
    public static final /* synthetic */ jun b = new jun(1);
    public static final /* synthetic */ jun a = new jun(0);

    private /* synthetic */ jun(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.v) {
            case 0:
                zga.d("Failed to set offline quality preference millis.", th);
                return;
            case 1:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            case 2:
                jvt.a(th);
                return;
            case 3:
                zga.d("Failed to check if the video is an Error State using the DownloadStateChecker.", th);
                return;
            case 4:
                zga.d("Failed to determine the display state of the video using the DownloadStateChecker.", th);
                return;
            case 5:
                jxi.b(th);
                return;
            case 6:
                jxi.c(th);
                return;
            case 7:
                jxl.c(th);
                return;
            case 8:
                jxl.a(th);
                return;
            case 9:
                jyp.b(th);
                return;
            case 10:
                zga.d("Failed to load autonav store.", th);
                return;
            case 11:
                zga.l("Error updating autonav setting.");
                return;
            case 12:
                zga.l("Error updating autonav toggle user edu triggers remaining.");
                return;
            case 13:
                zga.d("Failed to update WatchStorageSchema for DTTS Edu triggers.", th);
                return;
            case 14:
                kqr.e();
                return;
            case 15:
                zga.d("Failed to update number of player controls open trigger suggested action dismissals.", th);
                return;
            case 16:
                zga.d("Failed to update snap zoom EDU data to store.", th);
                return;
            case 17:
                lcl.q(th);
                return;
            case 18:
                lls.d(th);
                return;
            case 19:
                lls.e(th);
                return;
            default:
                zga.n("Failed to load get_settings response", th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("Failed to set offline quality preference millis.", (Throwable) obj);
                return;
            case 1:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            case 2:
                jvt.a((Throwable) obj);
                return;
            case 3:
                zga.d("Failed to check if the video is an Error State using the DownloadStateChecker.", (Throwable) obj);
                return;
            case 4:
                zga.d("Failed to determine the display state of the video using the DownloadStateChecker.", (Throwable) obj);
                return;
            case 5:
                jxi.b((Throwable) obj);
                return;
            case 6:
                jxi.c((Throwable) obj);
                return;
            case 7:
                jxl.c((Throwable) obj);
                return;
            case 8:
                jxl.a((Throwable) obj);
                return;
            case 9:
                jyp.b((Throwable) obj);
                return;
            case 10:
                zga.d("Failed to load autonav store.", (Throwable) obj);
                return;
            case 11:
                zga.l("Error updating autonav setting.");
                return;
            case 12:
                zga.l("Error updating autonav toggle user edu triggers remaining.");
                return;
            case 13:
                zga.d("Failed to update WatchStorageSchema for DTTS Edu triggers.", (Throwable) obj);
                return;
            case 14:
                kqr.e();
                return;
            case 15:
                zga.d("Failed to update number of player controls open trigger suggested action dismissals.", (Throwable) obj);
                return;
            case 16:
                zga.d("Failed to update snap zoom EDU data to store.", (Throwable) obj);
                return;
            case 17:
                lcl.q((Throwable) obj);
                return;
            case 18:
                lls.d((Throwable) obj);
                return;
            case 19:
                lls.e((Throwable) obj);
                return;
            default:
                zga.n("Failed to load get_settings response", (Throwable) obj);
                return;
        }
    }
}
