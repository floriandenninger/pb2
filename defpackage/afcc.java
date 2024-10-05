package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afcc implements Runnable {
    public final /* synthetic */ afcd a;
    private final /* synthetic */ int b;

    public /* synthetic */ afcc(afcd afcdVar, int i) {
        this.b = i;
        this.a = afcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a.H(false);
        } else if (i != 1) {
            this.a.a.H(false);
        } else {
            this.a.a.H(true);
        }
    }
}
