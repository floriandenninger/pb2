package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class bjo {
    protected final bjc d;

    /* JADX INFO: Access modifiers changed from: protected */
    public bjo(bjc bjcVar) {
        this.d = bjcVar;
    }

    protected abstract boolean a(pth pthVar);

    protected abstract boolean b(pth pthVar, long j);

    public final boolean c(pth pthVar, long j) {
        return a(pthVar) && b(pthVar, j);
    }
}
