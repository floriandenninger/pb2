package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hue implements zfi {
    private final /* synthetic */ int v;
    public static final /* synthetic */ hue u = new hue(20);
    public static final /* synthetic */ hue t = new hue(19);
    public static final /* synthetic */ hue s = new hue(18);
    public static final /* synthetic */ hue r = new hue(17);
    public static final /* synthetic */ hue q = new hue(16);
    public static final /* synthetic */ hue p = new hue(15);
    public static final /* synthetic */ hue o = new hue(14);
    public static final /* synthetic */ hue n = new hue(13);
    public static final /* synthetic */ hue m = new hue(12);
    public static final /* synthetic */ hue l = new hue(11);
    public static final /* synthetic */ hue k = new hue(10);
    public static final /* synthetic */ hue j = new hue(9);
    public static final /* synthetic */ hue i = new hue(8);
    public static final /* synthetic */ hue h = new hue(7);
    public static final /* synthetic */ hue g = new hue(6);
    public static final /* synthetic */ hue f = new hue(5);
    public static final /* synthetic */ hue e = new hue(4);
    public static final /* synthetic */ hue d = new hue(3);
    public static final /* synthetic */ hue c = new hue(2);
    public static final /* synthetic */ hue b = new hue(1);
    public static final /* synthetic */ hue a = new hue(0);

    private /* synthetic */ hue(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("Failed to load PDS", (Throwable) obj);
                return;
            case 1:
                int i2 = htu.ax;
                return;
            case 2:
                zga.b("Can't write to ProtoDataStore");
                return;
            case 3:
                zga.b("Can't write to ProtoDataStore");
                return;
            case 4:
                zga.d("Failed to load PDS", (Throwable) obj);
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                zga.b("Error reading most recent preset effect ID");
                return;
            case 8:
                zga.b("Failure adding recent sticker to PDS");
                return;
            case 9:
                zga.b("Error presenting recent stickers");
                return;
            case 10:
                long j2 = iat.a;
                zga.d("Can't write to ProtoDataStore", (Throwable) obj);
                return;
            case 11:
                long j3 = iat.a;
                return;
            case 12:
                int i3 = ijo.bC;
                zga.b("Stats for Nerd loading Failed.");
                return;
            case 13:
                String valueOf = String.valueOf(((Throwable) obj).getMessage());
                zga.b(valueOf.length() != 0 ? "Edu Storage Failed: ".concat(valueOf) : new String("Edu Storage Failed: "));
                return;
            case 14:
                zga.d("Failed to load the ProtoDataStore", (Throwable) obj);
                return;
            case 15:
                zga.b("Can't write to ProtoDataStore");
                return;
            case 16:
                return;
            case 17:
                return;
            case 18:
                zga.d("Failed to read offlineDisclaimerShown flag.", (Throwable) obj);
                return;
            case 19:
                zga.d("Failed to update offline has shown download expiration disclaimer.", (Throwable) obj);
                return;
            default:
                zga.d("Failed to get DownloadOptionsPickerActionSheetCommand", (Throwable) obj);
                return;
        }
    }
}
