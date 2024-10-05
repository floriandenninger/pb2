package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gwr implements ynk {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gwr u = new gwr(20);
    public static final /* synthetic */ gwr t = new gwr(19);
    public static final /* synthetic */ gwr s = new gwr(18);
    public static final /* synthetic */ gwr r = new gwr(17);
    public static final /* synthetic */ gwr q = new gwr(16);
    public static final /* synthetic */ gwr p = new gwr(15);
    public static final /* synthetic */ gwr o = new gwr(14);
    public static final /* synthetic */ gwr n = new gwr(13);
    public static final /* synthetic */ gwr m = new gwr(12);
    public static final /* synthetic */ gwr l = new gwr(11);
    public static final /* synthetic */ gwr k = new gwr(10);
    public static final /* synthetic */ gwr j = new gwr(9);
    public static final /* synthetic */ gwr i = new gwr(8);
    public static final /* synthetic */ gwr h = new gwr(7);
    public static final /* synthetic */ gwr g = new gwr(6);
    public static final /* synthetic */ gwr f = new gwr(5);
    public static final /* synthetic */ gwr e = new gwr(4);
    public static final /* synthetic */ gwr d = new gwr(3);
    public static final /* synthetic */ gwr c = new gwr(2);
    public static final /* synthetic */ gwr b = new gwr(1);
    public static final /* synthetic */ gwr a = new gwr(0);

    private /* synthetic */ gwr(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.v) {
            case 0:
                zga.d("Unable to save UriFlow state", th);
                return;
            case 1:
                zga.b(th.getMessage());
                return;
            case 2:
                afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed to load green screen media thumbnail", th);
                return;
            case 3:
                zga.b("Error saving most recent preset effect ID for Short");
                return;
            case 4:
                zga.d("Failed to get shorts creation info", th);
                return;
            case 5:
                zga.b("Error saving most recent preset effect ID for Stories");
                return;
            case 6:
                zga.b("Error saving recent stickers to PDS");
                return;
            case 7:
                zga.c("videoEffects", "Mentions in text hint error.");
                return;
            case 8:
                zga.b("Error saving sticker text style");
                return;
            case 9:
                zga.d("Error occurred getting resumable uploads", th);
                return;
            case 10:
                iyw.b(th);
                return;
            case 11:
                zga.f("YT.MDX.tvsignin.MdxTvFoundForSignInListener", "Failed to store passive last time shown.", th);
                return;
            case 12:
                zga.d("Failed to update offline access enabled and offline access updated at.", th);
                return;
            case 13:
                zga.d("Failed to clear offline access enabled and offline access updated at.", th);
                return;
            case 14:
                zga.d("Failed to update offline has shown 1080p option.", th);
                return;
            case 15:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            case 16:
                zga.d("Failed to update offline has shown 1080p tooltip.", th);
                return;
            case 17:
                jlj.a(th);
                return;
            case 18:
                zga.d("Failed to update offline last scheduled ad hoc refresh time millis.", th);
                return;
            case 19:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            default:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("Unable to save UriFlow state", (Throwable) obj);
                return;
            case 1:
                zga.b(((Throwable) obj).getMessage());
                return;
            case 2:
                afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed to load green screen media thumbnail", (Throwable) obj);
                return;
            case 3:
                zga.b("Error saving most recent preset effect ID for Short");
                return;
            case 4:
                zga.d("Failed to get shorts creation info", (Throwable) obj);
                return;
            case 5:
                zga.b("Error saving most recent preset effect ID for Stories");
                return;
            case 6:
                zga.b("Error saving recent stickers to PDS");
                return;
            case 7:
                zga.c("videoEffects", "Mentions in text hint error.");
                return;
            case 8:
                zga.b("Error saving sticker text style");
                return;
            case 9:
                zga.d("Error occurred getting resumable uploads", (Throwable) obj);
                return;
            case 10:
                iyw.b((Throwable) obj);
                return;
            case 11:
                zga.f("YT.MDX.tvsignin.MdxTvFoundForSignInListener", "Failed to store passive last time shown.", (Throwable) obj);
                return;
            case 12:
                zga.d("Failed to update offline access enabled and offline access updated at.", (Throwable) obj);
                return;
            case 13:
                zga.d("Failed to clear offline access enabled and offline access updated at.", (Throwable) obj);
                return;
            case 14:
                zga.d("Failed to update offline has shown 1080p option.", (Throwable) obj);
                return;
            case 15:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            case 16:
                zga.d("Failed to update offline has shown 1080p tooltip.", (Throwable) obj);
                return;
            case 17:
                jlj.a((Throwable) obj);
                return;
            case 18:
                zga.d("Failed to update offline last scheduled ad hoc refresh time millis.", (Throwable) obj);
                return;
            case 19:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            default:
                zga.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
        }
    }
}
