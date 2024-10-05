package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obk extends obb implements obo {
    public static final /* synthetic */ int b = 0;
    public final obp a;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private boolean h;
    private int i;
    private int j;

    public obk(obp obpVar) {
        this.a = obpVar;
        obpVar.K(this);
        e();
    }

    public static obp b(obp obpVar) {
        return !(obpVar instanceof obk) ? obpVar : b(((obk) obpVar).a);
    }

    private final void d(Rect rect, Rect rect2) {
        rect2.set(this.h ? this.i - rect.right : rect.left, rect.top, this.h ? this.i - rect.left : rect.right, rect.bottom);
        rect2.set(rect2);
        if (rect2.width() < 0) {
            rect2.right = rect2.left;
        }
        if (rect2.height() < 0) {
            rect2.bottom = rect2.top;
        }
    }

    private final void e() {
        d(this.a.v(), this.c);
        d(this.a.t(), this.d);
        d(this.a.r(), this.e);
        d(this.a.s(), this.f);
        d(this.a.u(), this.g);
        J();
    }

    @Override // defpackage.obb, defpackage.obp
    public final ammv I() {
        return this.a.I();
    }

    public final void c(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        e();
    }

    @Override // defpackage.obp
    public final float l() {
        return this.a.l();
    }

    @Override // defpackage.obp
    public final float m() {
        return this.a.m();
    }

    @Override // defpackage.obp
    public final float n() {
        return this.a.n();
    }

    @Override // defpackage.obp
    public final float o() {
        return this.a.o();
    }

    @Override // defpackage.obp
    public final float p() {
        return this.a.p();
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        if (this.a != obpVar) {
            return;
        }
        e();
    }

    @Override // defpackage.obp
    public final float q() {
        return this.a.q();
    }

    @Override // defpackage.obp
    public final Rect r() {
        return this.e;
    }

    @Override // defpackage.obp
    public final Rect s() {
        return this.f;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.d;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return this.g;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.c;
    }

    @Override // defpackage.obp
    public final void x() {
        this.a.x();
    }

    @Override // defpackage.obp
    public final void y() {
        this.a.y();
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        if (this.i == i && this.j == i2) {
            return;
        }
        this.i = i;
        this.j = i2;
        this.a.L(this);
        this.a.z(i, i2);
        this.a.K(this);
        e();
    }
}
