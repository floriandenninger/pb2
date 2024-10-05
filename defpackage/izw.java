package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class izw implements ayrs {
    private final /* synthetic */ int u;
    public static final /* synthetic */ izw t = new izw(20);
    public static final /* synthetic */ izw s = new izw(19);
    public static final /* synthetic */ izw r = new izw(18);
    public static final /* synthetic */ izw q = new izw(17);
    public static final /* synthetic */ izw p = new izw(16);
    public static final /* synthetic */ izw o = new izw(15);
    public static final /* synthetic */ izw n = new izw(14);
    public static final /* synthetic */ izw m = new izw(13);
    public static final /* synthetic */ izw l = new izw(12);
    public static final /* synthetic */ izw k = new izw(11);
    public static final /* synthetic */ izw j = new izw(10);
    public static final /* synthetic */ izw i = new izw(9);
    public static final /* synthetic */ izw h = new izw(8);
    public static final /* synthetic */ izw g = new izw(7);
    public static final /* synthetic */ izw f = new izw(6);
    public static final /* synthetic */ izw e = new izw(4);
    public static final /* synthetic */ izw d = new izw(3);
    public static final /* synthetic */ izw c = new izw(2);
    public static final /* synthetic */ izw b = new izw(1);
    public static final /* synthetic */ izw a = new izw(0);

    public /* synthetic */ izw(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.u) {
            case 0:
                zga.d("Failed to get offline guide response", (Throwable) obj);
                return;
            case 1:
                wbs.H((Throwable) obj);
                return;
            case 2:
                wbs.H((Throwable) obj);
                return;
            case 3:
                wbs.H((Throwable) obj);
                return;
            case 4:
                wbs.H((Throwable) obj);
                return;
            case 5:
                jia jiaVar = (jia) obj;
                String simpleName = jiaVar.b.getSimpleName();
                String valueOf = String.valueOf(jiaVar.a);
                String.valueOf(simpleName).length();
                String.valueOf(valueOf).length();
                yjk.e();
                jiaVar.c.run();
                return;
            case 6:
                amsx amsxVar = jjo.a;
                zga.d("Could not commit initial entities for downloads library.", (Throwable) obj);
                return;
            case 7:
                zga.d("Failed to observe DownloadRecsFlag", (Throwable) obj);
                return;
            case 8:
                wbs.H((Throwable) obj);
                return;
            case 9:
                ((joj) obj).a.length();
                return;
            case 10:
                ammw ammwVar = (ammw) obj;
                ((joj) ammwVar.a).c.a(ammwVar.b);
                return;
            case 11:
                zga.d("Could not transform item", (Throwable) obj);
                return;
            case 12:
                zga.d("Error observing on registerFaultObservers", (Throwable) obj);
                return;
            case 13:
                zga.d("Failed to initialize Smart Downloads opt in setting observer.", (Throwable) obj);
                return;
            case 14:
                zga.d("Error observing on offlineGenerationStatusForVideos", (Throwable) obj);
                return;
            case 15:
                wbs.H((Throwable) obj);
                return;
            case 16:
                wbs.H((Throwable) obj);
                return;
            case 17:
                wbs.H((Throwable) obj);
                return;
            case 18:
                wbs.H((Throwable) obj);
                return;
            case 19:
                wbs.H((Throwable) obj);
                return;
            default:
                zga.f("YouTubeAutonavSettings", "Received error observing isAutonavEnabledByDefault.", (Throwable) obj);
                return;
        }
    }
}
