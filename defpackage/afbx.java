package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afbx implements Runnable {
    public final /* synthetic */ afce a;
    private final /* synthetic */ int b;

    public /* synthetic */ afbx(afce afceVar, int i) {
        this.b = i;
        this.a = afceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.A();
        } else if (i != 1) {
            this.a.A();
        } else {
            this.a.H(false);
        }
    }
}
