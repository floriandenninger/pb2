package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afkz implements Runnable {
    public final /* synthetic */ afla a;
    private final /* synthetic */ int b;

    public /* synthetic */ afkz(afla aflaVar, int i) {
        this.b = i;
        this.a = aflaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.setKeepScreenOn(true);
        } else {
            this.a.setKeepScreenOn(false);
        }
    }
}
