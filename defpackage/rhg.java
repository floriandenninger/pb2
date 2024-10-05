package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rhg extends rhf {
    private boolean a;

    public rhg(rgt rgtVar) {
        super(rgtVar);
        this.w.s();
    }

    protected void aH() {
    }

    protected abstract boolean f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.w.r();
        this.a = true;
    }

    public final void l() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        aH();
        this.w.r();
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.a;
    }
}
