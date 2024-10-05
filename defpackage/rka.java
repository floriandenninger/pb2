package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rka extends rjz {
    private boolean a;

    public rka(rki rkiVar) {
        super(rkiVar);
        this.j.m++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V() {
        if (!X()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void W() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        b();
        this.j.n++;
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X() {
        return this.a;
    }

    protected abstract void b();
}
