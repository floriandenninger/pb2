package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class absz implements Runnable {
    public final /* synthetic */ abtk a;
    private final /* synthetic */ int b;

    public /* synthetic */ absz(abtk abtkVar, int i) {
        this.b = i;
        this.a = abtkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.r(false);
        } else if (i != 1) {
            this.a.t();
        } else {
            this.a.r(true);
        }
    }
}
