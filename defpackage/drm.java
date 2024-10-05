package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class drm {
    public final LinearLayoutManager a;

    public drm(int i) {
        drk drkVar = new drk(i);
        this.a = drkVar;
        drkVar.B = false;
    }

    public drm(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final int b() {
        return this.a.I();
    }

    public final int c() {
        return this.a.J();
    }

    public final int d() {
        return this.a.K();
    }

    public final int e() {
        return this.a.L();
    }

    public int f(int i, dte dteVar) {
        return this.a.i != 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    public final int g() {
        return this.a.at();
    }

    public final int h() {
        return this.a.i;
    }

    public final int i(int i) {
        return this.a.i != 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final int a(int i, int i2, int i3, int i4) {
        int ceil = (int) (this.a.i != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i));
        if (ceil < 2) {
            return 2;
        }
        if (ceil > 10) {
            return 10;
        }
        return ceil;
    }
}
