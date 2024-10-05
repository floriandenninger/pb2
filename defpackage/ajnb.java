package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnb extends ajmx {
    public final ajng a;
    public int b;

    public ajnb(ajng ajngVar) {
        ajngVar.getClass();
        this.a = ajngVar;
        this.b = Integer.MAX_VALUE;
        ajngVar.lX(new ajna(this));
    }

    @Override // defpackage.ajng
    public final int a() {
        return Math.min(this.b, ((you) this.a).size());
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        if (i < 0 || i >= a()) {
            return 0L;
        }
        return i;
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return ((you) this.a).get(i);
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    public final void h(int i) {
        yjk.f();
        if (this.b != i) {
            int size = ((you) this.a).size();
            int min = Math.min(this.b, size);
            int min2 = Math.min(i, size);
            this.b = i;
            if (min != min2) {
                if (min2 > min) {
                    y(min, min2 - min);
                } else {
                    z(min2, min - min2);
                }
            }
        }
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return a() == 0;
    }
}
