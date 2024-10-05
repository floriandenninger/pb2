package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azhv extends ayti {
    final ayqd a;
    final Object[] b;
    int c;
    boolean d;
    volatile boolean e;

    public azhv(ayqd ayqdVar, Object[] objArr) {
        this.a = ayqdVar;
        this.b = objArr;
    }

    @Override // defpackage.aytf
    public final void d() {
        this.c = this.b.length;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.c == this.b.length;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.e = true;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.d = true;
        return 1;
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
        aysw.b(obj, "The array element is null");
        return obj;
    }
}
