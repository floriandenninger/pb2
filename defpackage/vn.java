package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vn extends vo {
    public vn(wd wdVar) {
        super(wdVar);
    }

    @Override // defpackage.vo
    public final int a(View view) {
        return wd.bw(view) + ((we) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.vo
    public final int b(View view) {
        we weVar = (we) view.getLayoutParams();
        return wd.bj(view) + weVar.topMargin + weVar.bottomMargin;
    }

    @Override // defpackage.vo
    public final int c(View view) {
        we weVar = (we) view.getLayoutParams();
        return wd.bk(view) + weVar.leftMargin + weVar.rightMargin;
    }

    @Override // defpackage.vo
    public final int d(View view) {
        return wd.bz(view) - ((we) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.vo
    public final int e() {
        return this.a.I;
    }

    @Override // defpackage.vo
    public final int f() {
        wd wdVar = this.a;
        return wdVar.I - wdVar.getPaddingBottom();
    }

    @Override // defpackage.vo
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.vo
    public final int h() {
        return this.a.G;
    }

    @Override // defpackage.vo
    public final int i() {
        return this.a.F;
    }

    @Override // defpackage.vo
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.vo
    public final int k() {
        wd wdVar = this.a;
        return (wdVar.I - wdVar.getPaddingTop()) - this.a.getPaddingBottom();
    }

    @Override // defpackage.vo
    public final int l(View view) {
        this.a.bp(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.vo
    public final int m(View view) {
        this.a.bp(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.vo
    public final void n(int i) {
        this.a.aL(i);
    }
}
