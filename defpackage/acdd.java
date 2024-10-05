package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acdd implements Runnable {
    public final /* synthetic */ acdn a;
    private final /* synthetic */ int b;

    public /* synthetic */ acdd(acdn acdnVar, int i) {
        this.b = i;
        this.a = acdnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f(true);
            return;
        }
        if (i == 1) {
            this.a.h();
            return;
        }
        if (i == 2) {
            this.a.l(false);
        } else if (i != 3) {
            this.a.h();
        } else {
            this.a.l(true);
        }
    }
}
