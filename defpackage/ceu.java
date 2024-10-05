package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceu implements Runnable {
    final cex a;
    final anhy b;

    public ceu(cex cexVar, anhy anhyVar) {
        this.a = cexVar;
        this.b = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d != this) {
            return;
        }
        if (cex.b.d(this.a, this, cex.a(this.b))) {
            cex.b(this.a);
        }
    }
}
