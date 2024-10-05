package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ko {
    public static final ko a;
    private final kn b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = km.c;
        } else {
            a = kn.d;
        }
    }

    public ko(ko koVar) {
        this.b = new kn(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fn j(fn fnVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, fnVar.b - i);
        int max2 = Math.max(0, fnVar.c - i2);
        int max3 = Math.max(0, fnVar.d - i3);
        int max4 = Math.max(0, fnVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? fnVar : fn.d(max, max2, max3, max4);
    }

    public static ko q(WindowInsets windowInsets) {
        return r(windowInsets, null);
    }

    public static ko r(WindowInsets windowInsets, View view) {
        gn.g(windowInsets);
        ko koVar = new ko(windowInsets);
        if (view != null && jw.aj(view)) {
            koVar.v(jw.s(view));
            koVar.t(view.getRootView());
        }
        return koVar;
    }

    @Deprecated
    public int a() {
        return this.b.j().e;
    }

    @Deprecated
    public int b() {
        return this.b.j().d;
    }

    @Deprecated
    public int c() {
        return this.b.a().e;
    }

    @Deprecated
    public int d() {
        return this.b.a().b;
    }

    @Deprecated
    public int e() {
        return this.b.a().d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ko) {
            return Objects.equals(this.b, ((ko) obj).b);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.b.a().c;
    }

    public fn g(int i) {
        return this.b.i();
    }

    @Deprecated
    public fn h() {
        return this.b.q();
    }

    public int hashCode() {
        kn knVar = this.b;
        if (knVar == null) {
            return 0;
        }
        return knVar.hashCode();
    }

    @Deprecated
    public fn i() {
        return this.b.j();
    }

    public il k() {
        return this.b.o();
    }

    @Deprecated
    public ko l() {
        return this.b.p();
    }

    @Deprecated
    public ko m() {
        return this.b.k();
    }

    @Deprecated
    public ko n() {
        return this.b.l();
    }

    public ko o(int i, int i2, int i3, int i4) {
        return this.b.b(i, i2, i3, i4);
    }

    @Deprecated
    public ko p(int i, int i2, int i3, int i4) {
        ke keVar = new ke(this);
        keVar.c(fn.d(i, i2, i3, i4));
        return keVar.a();
    }

    public WindowInsets s() {
        kn knVar = this.b;
        if (knVar instanceof ki) {
            return ((ki) knVar).a;
        }
        return null;
    }

    public void t(View view) {
        this.b.c(view);
    }

    public void u(fn[] fnVarArr) {
        this.b.h();
    }

    public void v(ko koVar) {
        this.b.d(koVar);
    }

    public void w(fn fnVar) {
        this.b.m(fnVar);
    }

    public boolean x() {
        return this.b.n();
    }

    public boolean y(int i) {
        return this.b.g();
    }

    private ko(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new km(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new kl(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new kk(this, windowInsets);
        } else {
            this.b = new kj(this, windowInsets);
        }
    }
}
