package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class kic {
    protected boolean a;

    private final void c(boolean z, boolean z2) {
        this.a = z2;
        if (w(z2)) {
            t(z);
        } else {
            a(z);
        }
    }

    protected abstract void a(boolean z);

    public final void b(boolean z) {
        c(z, false);
    }

    public final void f(boolean z) {
        c(z, true);
    }

    protected abstract void t(boolean z);

    public final void u() {
        v(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(boolean z) {
        if (this.a) {
            f(z);
        } else {
            b(z);
        }
    }

    protected abstract boolean w(boolean z);
}
