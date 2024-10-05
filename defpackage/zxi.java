package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zxi implements ayrs {
    private final /* synthetic */ int q;
    public static final /* synthetic */ zxi p = new zxi(20);
    public static final /* synthetic */ zxi o = new zxi(19);
    public static final /* synthetic */ zxi n = new zxi(18);
    public static final /* synthetic */ zxi m = new zxi(17);
    public static final /* synthetic */ zxi l = new zxi(16);
    public static final /* synthetic */ zxi k = new zxi(15);
    public static final /* synthetic */ zxi j = new zxi(14);
    public static final /* synthetic */ zxi i = new zxi(13);
    public static final /* synthetic */ zxi h = new zxi(12);
    public static final /* synthetic */ zxi g = new zxi(10);
    public static final /* synthetic */ zxi f = new zxi(9);
    public static final /* synthetic */ zxi e = new zxi(8);
    public static final /* synthetic */ zxi d = new zxi(4);
    public static final /* synthetic */ zxi c = new zxi(2);
    public static final /* synthetic */ zxi b = new zxi(1);
    public static final /* synthetic */ zxi a = new zxi(0);

    public /* synthetic */ zxi(int i2) {
        this.q = i2;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.q) {
            case 0:
                zga.b("Failed to get media items from local storage");
                return;
            case 1:
                return;
            case 2:
                throw new IllegalStateException("Unable to update account link state");
            case 3:
                return;
            case 4:
                return;
            case 5:
                aarh.m("ads", (Throwable) obj);
                return;
            case 6:
                aarh.m("cold", (Throwable) obj);
                return;
            case 7:
                aarh.m("hot", (Throwable) obj);
                return;
            case 8:
                zga.d("Error updating entity store.", (Throwable) obj);
                return;
            case 9:
                zga.d("Error updating entity store.", (Throwable) obj);
                return;
            case 10:
                wbs.H((Throwable) obj);
                return;
            case 11:
                return;
            case 12:
                String valueOf = String.valueOf((String) obj);
                if (valueOf.length() != 0) {
                    "Loading auth'ed page from authToken = ".concat(valueOf);
                    return;
                }
                return;
            case 13:
                zga.d("An error happened when getting authToken.", (Throwable) obj);
                return;
            case 14:
                afsi.c(2, 18, "FirebaseApp init crashed", (Throwable) obj);
                return;
            case 15:
                int i2 = agos.k;
                zga.d("Problem scheduling refresh job", (Throwable) obj);
                return;
            case 16:
                zga.d("Couldn't handle staleConfigEvent", (Throwable) obj);
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
                wbs.H((Throwable) obj);
                return;
        }
    }
}
