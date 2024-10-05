package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abzj implements Runnable {
    public final /* synthetic */ abxz a;
    private final /* synthetic */ int b;

    public /* synthetic */ abzj(abxz abxzVar, int i) {
        this.b = i;
        this.a = abxzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.j();
        } else {
            this.a.k();
        }
    }
}
