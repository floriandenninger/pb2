package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ayyb extends azpw {
    private static final long serialVersionUID = -2252972430506210021L;
    final Object[] b;
    int c;
    volatile boolean d;

    public ayyb(Object[] objArr) {
        this.b = objArr;
    }

    public abstract void b();

    @Override // defpackage.aytf
    public final void d() {
        this.c = this.b.length;
    }

    public abstract void f(long j);

    @Override // defpackage.aytf
    public final boolean j() {
        return this.c == this.b.length;
    }

    @Override // defpackage.banx
    public final void sd() {
        this.d = true;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 1;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        aysw.b(obj, "array element is null");
        return obj;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j) && ayeq.j(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                b();
            } else {
                f(j);
            }
        }
    }
}
