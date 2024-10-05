package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rdv extends rdu {
    public boolean a;

    public rdv(rgt rgtVar) {
        super(rgtVar);
        this.w.s();
    }

    public final void a() {
        if (!c()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (d()) {
            return;
        }
        this.w.r();
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a;
    }

    protected abstract boolean d();
}
