package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aemr implements Runnable {
    public final /* synthetic */ aemv a;
    private final /* synthetic */ int b;

    public /* synthetic */ aemr(aemv aemvVar, int i) {
        this.b = i;
        this.a = aemvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.p();
                return;
            case 1:
                this.a.o();
                return;
            case 2:
                this.a.q();
                return;
            case 3:
                this.a.r();
                return;
            case 4:
                this.a.u();
                return;
            case 5:
                this.a.v();
                return;
            case 6:
                this.a.w();
                return;
            default:
                this.a.F();
                return;
        }
    }
}
