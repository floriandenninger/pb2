package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akfh implements Runnable {
    public final /* synthetic */ akfo a;
    public final /* synthetic */ Throwable b;
    private final /* synthetic */ int c;

    public /* synthetic */ akfh(akfo akfoVar, Throwable th, int i) {
        this.c = i;
        this.a = akfoVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            akfo akfoVar = this.a;
            akfoVar.e.c(this.b);
        } else {
            akfo akfoVar2 = this.a;
            akfoVar2.e.c(this.b);
        }
    }
}
