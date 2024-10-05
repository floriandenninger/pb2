package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wb implements yx {
    final /* synthetic */ wd a;
    private final /* synthetic */ int b;

    public wb(wd wdVar, int i) {
        this.b = i;
        this.a = wdVar;
    }

    @Override // defpackage.yx
    public final int c() {
        int i;
        int paddingBottom;
        if (this.b != 0) {
            wd wdVar = this.a;
            i = wdVar.H;
            paddingBottom = wdVar.getPaddingRight();
        } else {
            wd wdVar2 = this.a;
            i = wdVar2.I;
            paddingBottom = wdVar2.getPaddingBottom();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.yx
    public final int d() {
        return this.b != 0 ? this.a.getPaddingLeft() : this.a.getPaddingTop();
    }

    @Override // defpackage.yx
    public final View e(int i) {
        return this.b != 0 ? this.a.az(i) : this.a.az(i);
    }

    @Override // defpackage.yx
    public final int a(View view) {
        int bw;
        int i;
        if (this.b == 0) {
            we weVar = (we) view.getLayoutParams();
            bw = wd.bw(view);
            i = weVar.bottomMargin;
        } else {
            we weVar2 = (we) view.getLayoutParams();
            bw = wd.by(view);
            i = weVar2.rightMargin;
        }
        return bw + i;
    }

    @Override // defpackage.yx
    public final int b(View view) {
        int bz;
        int i;
        if (this.b == 0) {
            we weVar = (we) view.getLayoutParams();
            bz = wd.bz(view);
            i = weVar.topMargin;
        } else {
            we weVar2 = (we) view.getLayoutParams();
            bz = wd.bx(view);
            i = weVar2.leftMargin;
        }
        return bz - i;
    }
}
