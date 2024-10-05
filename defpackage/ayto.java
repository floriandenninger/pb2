package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ayto extends ayth {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final ayqd a;
    protected Object b;

    public ayto(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.aytf
    public final void d() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == 4;
    }

    public final void f(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        ayqd ayqdVar = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            ayqdVar.c(null);
        } else {
            lazySet(2);
            ayqdVar.c(obj);
        }
        if (get() != 4) {
            ayqdVar.sh();
        }
    }

    public final void g(Throwable th) {
        if ((get() & 54) != 0) {
            aynu.j(th);
        } else {
            lazySet(2);
            this.a.b(th);
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return get() != 16;
    }

    @Override // defpackage.ayqx
    public void qc() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
