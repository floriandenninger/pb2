package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afka implements ynk {
    private final /* synthetic */ int t;
    public static final /* synthetic */ afka s = new afka(20);
    public static final /* synthetic */ afka r = new afka(19);
    public static final /* synthetic */ afka q = new afka(18);
    public static final /* synthetic */ afka p = new afka(17);
    public static final /* synthetic */ afka o = new afka(16);
    public static final /* synthetic */ afka n = new afka(14);
    public static final /* synthetic */ afka m = new afka(13);
    public static final /* synthetic */ afka l = new afka(12);
    public static final /* synthetic */ afka k = new afka(11);
    public static final /* synthetic */ afka j = new afka(10);
    public static final /* synthetic */ afka i = new afka(9);
    public static final /* synthetic */ afka h = new afka(8);
    public static final /* synthetic */ afka g = new afka(7);
    public static final /* synthetic */ afka f = new afka(6);
    public static final /* synthetic */ afka e = new afka(5);
    public static final /* synthetic */ afka d = new afka(4);
    public static final /* synthetic */ afka c = new afka(3);
    public static final /* synthetic */ afka b = new afka(1);
    public static final /* synthetic */ afka a = new afka(0);

    public /* synthetic */ afka(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.t) {
            case 0:
                afsi.b(1, 6, "Failed to update manual video quality selection.");
                return;
            case 1:
                afsi.b(1, 6, "Failed to store last playback start time.");
                return;
            case 2:
                if (th instanceof cnq) {
                    return;
                } else {
                    new cnq(th);
                    return;
                }
            case 3:
                zga.d("failed to clear device auth", th);
                return;
            case 4:
                zga.d("Failed to clear delayedEventSchema.", th);
                return;
            case 5:
                zga.d("Failed to update delayed event PDS", th);
                return;
            case 6:
                zga.d("Failed to update last capture time in PDS", th);
                return;
            case 7:
                zga.d("Failed to update DelayedEventMetricsStore", th);
                return;
            case 8:
                zga.d("There was an error.", th);
                return;
            case 9:
                zga.d("Failed to save device context event", th);
                return;
            case 10:
                zga.d("Failed to invalidate gcm registration timestamp", th);
                return;
            case 11:
                zga.d("Failed to save enabledness changed timestamp", th);
                return;
            case 12:
                zga.b("[Offline] Error initializing offline store");
                return;
            case 13:
                agpi.a(th);
                return;
            case 14:
                zga.d("[Offline] Failed to set next auto offline time millis at.", th);
                return;
            case 15:
                agto.d(th);
                return;
            case 16:
                zga.d("[Offline] Error clean up offline playback position data", th);
                return;
            case 17:
                zga.d("[Offline] Error remove single offline playback position data", th);
                return;
            case 18:
                afsi.c(2, 28, "Some error occurred when evicting player response", th);
                return;
            case 19:
                afsi.c(2, 28, "Some error occurred when putting a player response into cache", th);
                return;
            default:
                zga.d("Failed to update VR platform preference to store.", th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.t) {
            case 0:
                afsi.b(1, 6, "Failed to update manual video quality selection.");
                return;
            case 1:
                afsi.b(1, 6, "Failed to store last playback start time.");
                return;
            case 2:
                a((Throwable) obj);
                return;
            case 3:
                zga.d("failed to clear device auth", (Throwable) obj);
                return;
            case 4:
                zga.d("Failed to clear delayedEventSchema.", (Throwable) obj);
                return;
            case 5:
                zga.d("Failed to update delayed event PDS", (Throwable) obj);
                return;
            case 6:
                zga.d("Failed to update last capture time in PDS", (Throwable) obj);
                return;
            case 7:
                zga.d("Failed to update DelayedEventMetricsStore", (Throwable) obj);
                return;
            case 8:
                zga.d("There was an error.", (Throwable) obj);
                return;
            case 9:
                zga.d("Failed to save device context event", (Throwable) obj);
                return;
            case 10:
                zga.d("Failed to invalidate gcm registration timestamp", (Throwable) obj);
                return;
            case 11:
                zga.d("Failed to save enabledness changed timestamp", (Throwable) obj);
                return;
            case 12:
                zga.b("[Offline] Error initializing offline store");
                return;
            case 13:
                agpi.a((Throwable) obj);
                return;
            case 14:
                zga.d("[Offline] Failed to set next auto offline time millis at.", (Throwable) obj);
                return;
            case 15:
                agto.d((Throwable) obj);
                return;
            case 16:
                zga.d("[Offline] Error clean up offline playback position data", (Throwable) obj);
                return;
            case 17:
                zga.d("[Offline] Error remove single offline playback position data", (Throwable) obj);
                return;
            case 18:
                afsi.c(2, 28, "Some error occurred when evicting player response", (Throwable) obj);
                return;
            case 19:
                afsi.c(2, 28, "Some error occurred when putting a player response into cache", (Throwable) obj);
                return;
            default:
                zga.d("Failed to update VR platform preference to store.", (Throwable) obj);
                return;
        }
    }
}
