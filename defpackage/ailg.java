package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ailg implements ynk {
    private final /* synthetic */ int k;
    public static final /* synthetic */ ailg j = new ailg(10);
    public static final /* synthetic */ ailg i = new ailg(8);
    public static final /* synthetic */ ailg h = new ailg(7);
    public static final /* synthetic */ ailg g = new ailg(6);
    public static final /* synthetic */ ailg f = new ailg(5);
    public static final /* synthetic */ ailg e = new ailg(4);
    public static final /* synthetic */ ailg d = new ailg(3);
    public static final /* synthetic */ ailg c = new ailg(2);
    public static final /* synthetic */ ailg b = new ailg(1);
    public static final /* synthetic */ ailg a = new ailg(0);

    public /* synthetic */ ailg(int i2) {
        this.k = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.k) {
            case 0:
                zga.d("Failed to store adult playability.", th);
                return;
            case 1:
                ahot.d(th);
                return;
            case 2:
                zga.d("Failed to save playability adult timestamp.", th);
                return;
            case 3:
                airc.d(th);
                return;
            case 4:
                zga.d("Failed to set caption preferences", th);
                return;
            case 5:
                zga.d("Failed to set caption preferences", th);
                return;
            case 6:
                ajzf.b(th);
                return;
            case 7:
                zga.d("PermissionManager: failed to record permissions", th);
                return;
            case 8:
            case 9:
                return;
            default:
                aktm.a(th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.k) {
            case 0:
                zga.d("Failed to store adult playability.", (Throwable) obj);
                return;
            case 1:
                ahot.d((Throwable) obj);
                return;
            case 2:
                zga.d("Failed to save playability adult timestamp.", (Throwable) obj);
                return;
            case 3:
                airc.d((Throwable) obj);
                return;
            case 4:
                zga.d("Failed to set caption preferences", (Throwable) obj);
                return;
            case 5:
                zga.d("Failed to set caption preferences", (Throwable) obj);
                return;
            case 6:
                ajzf.b((Throwable) obj);
                return;
            case 7:
                zga.d("PermissionManager: failed to record permissions", (Throwable) obj);
                return;
            case 8:
                return;
            case 9:
                return;
            default:
                aktm.a((Throwable) obj);
                return;
        }
    }
}
