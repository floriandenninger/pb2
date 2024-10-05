package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vm extends vo {
    public vm(wd wdVar) {
        super(wdVar);
    }

    @Override // defpackage.vo
    public final int a(View view) {
        return wd.by(view) + ((we) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.vo
    public final int b(View view) {
        we weVar = (we) view.getLayoutParams();
        return wd.bk(view) + weVar.leftMargin + weVar.rightMargin;
    }

    @Override // defpackage.vo
    public final int c(View view) {
        we weVar = (we) view.getLayoutParams();
        return wd.bj(view) + weVar.topMargin + weVar.bottomMargin;
    }

    @Override // defpackage.vo
    public final int d(View view) {
        return wd.bx(view) - ((we) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.vo
    public final int e() {
        return this.a.H;
    }

    @Override // defpackage.vo
    public final int f() {
        wd wdVar = this.a;
        return wdVar.H - wdVar.getPaddingRight();
    }

    @Override // defpackage.vo
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.vo
    public final int h() {
        return this.a.F;
    }

    @Override // defpackage.vo
    public final int i() {
        return this.a.G;
    }

    @Override // defpackage.vo
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.vo
    public final int k() {
        wd wdVar = this.a;
        return (wdVar.H - wdVar.getPaddingLeft()) - this.a.getPaddingRight();
    }

    @Override // defpackage.vo
    public final int l(View view) {
        this.a.bp(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.vo
    public final int m(View view) {
        this.a.bp(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.vo
    public final void n(int i) {
        this.a.aK(i);
    }
}
