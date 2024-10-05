package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajob implements ajnf {
    public final ajng a;
    public int b;
    final /* synthetic */ ajoc c;
    private int d;

    public ajob(ajoc ajocVar, ajng ajngVar) {
        this.c = ajocVar;
        ajngVar.getClass();
        this.a = ajngVar;
        this.b = 0;
        this.d = ajngVar.a();
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        this.c.s();
        this.c.z(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        this.c.s();
        ajoc ajocVar = this.c;
        int i3 = this.b;
        ajocVar.A(i + i3, i3 + i2);
        this.d = this.a.a();
    }

    public final int f(int i) {
        return i - this.b;
    }

    public final int g() {
        return this.b + this.a.a();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        this.c.s();
        int a = this.a.a();
        int min = Math.min(this.d, a);
        if (min > 0) {
            this.c.x(this.b, min);
        }
        int i = this.d;
        if (i > min) {
            this.c.z(this.b + min, i - min);
        } else if (a > min) {
            this.c.y(this.b + min, a - min);
        }
        this.d = a;
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        this.c.s();
        this.c.x(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        this.c.s();
        this.c.y(this.b + i, i2);
        this.d = this.a.a();
    }
}
