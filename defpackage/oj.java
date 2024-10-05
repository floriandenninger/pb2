package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class oj extends Drawable.ConstantState {
    int A;
    int B;
    int C;
    boolean D;
    ColorFilter E;
    boolean F;
    ColorStateList G;
    PorterDuff.Mode H;
    boolean I;

    /* renamed from: J, reason: collision with root package name */
    boolean f249J;
    final ok c;
    Resources d;
    int e;
    int f;
    int g;
    SparseArray h;
    Drawable[] i;
    int j;
    boolean k;
    boolean l;
    Rect m;
    boolean n;
    boolean o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public oj(oj ojVar, ok okVar, Resources resources) {
        Resources resources2;
        this.k = false;
        this.n = false;
        this.z = true;
        this.B = 0;
        this.C = 0;
        this.c = okVar;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = ojVar != null ? ojVar.d : null;
        }
        this.d = resources2;
        int f = ok.f(resources, ojVar != null ? ojVar.e : 0);
        this.e = f;
        if (ojVar != null) {
            this.f = ojVar.f;
            this.g = ojVar.g;
            this.x = true;
            this.y = true;
            this.k = ojVar.k;
            this.n = ojVar.n;
            this.z = ojVar.z;
            this.A = ojVar.A;
            this.B = ojVar.B;
            this.C = ojVar.C;
            this.D = ojVar.D;
            this.E = ojVar.E;
            this.F = ojVar.F;
            this.G = ojVar.G;
            this.H = ojVar.H;
            this.I = ojVar.I;
            this.f249J = ojVar.f249J;
            if (ojVar.e == f) {
                if (ojVar.l) {
                    Rect rect = ojVar.m;
                    this.m = rect != null ? new Rect(rect) : null;
                    this.l = true;
                }
                if (ojVar.o) {
                    this.p = ojVar.p;
                    this.q = ojVar.q;
                    this.r = ojVar.r;
                    this.s = ojVar.s;
                    this.o = true;
                }
            }
            if (ojVar.t) {
                this.u = ojVar.u;
                this.t = true;
            }
            if (ojVar.v) {
                this.w = ojVar.w;
                this.v = true;
            }
            Drawable[] drawableArr = ojVar.i;
            this.i = new Drawable[drawableArr.length];
            int i = ojVar.j;
            this.j = i;
            SparseArray sparseArray = ojVar.h;
            if (sparseArray != null) {
                this.h = sparseArray.clone();
            } else {
                this.h = new SparseArray(i);
            }
            int i2 = this.j;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.h.put(i3, constantState);
                    } else {
                        this.i[i3] = drawableArr[i3];
                    }
                }
            }
            return;
        }
        this.i = new Drawable[10];
        this.j = 0;
    }

    private final Drawable a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            gl.e(drawable, this.A);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.c);
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.j;
        Drawable[] drawableArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.h.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        throw null;
    }

    public final int f(Drawable drawable) {
        int i = this.j;
        if (i >= this.i.length) {
            j(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.c);
        this.i[i] = drawable;
        this.j++;
        this.g = drawable.getChangingConfigurations() | this.g;
        k();
        this.m = null;
        this.l = false;
        this.o = false;
        this.x = false;
        return i;
    }

    public final Drawable g(int i) {
        int indexOfKey;
        Drawable drawable = this.i[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.h;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable a = a(((Drawable.ConstantState) this.h.valueAt(indexOfKey)).newDrawable(this.d));
        this.i[i] = a;
        this.h.removeAt(indexOfKey);
        if (this.h.size() == 0) {
            this.h = null;
        }
        return a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f | this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        this.o = true;
        i();
        int i = this.j;
        Drawable[] drawableArr = this.i;
        this.q = -1;
        this.p = -1;
        this.s = 0;
        this.r = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.p) {
                this.p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.q) {
                this.q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.r) {
                this.r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.s) {
                this.s = minimumHeight;
            }
        }
    }

    public final void i() {
        SparseArray sparseArray = this.h;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                this.i[this.h.keyAt(i)] = a(((Drawable.ConstantState) this.h.valueAt(i)).newDrawable(this.d));
            }
            this.h = null;
        }
    }

    public void j(int i, int i2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.t = false;
        this.v = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(Resources resources) {
        if (resources != null) {
            this.d = resources;
            int f = ok.f(resources, this.e);
            int i = this.e;
            this.e = f;
            if (i != f) {
                this.o = false;
                this.l = false;
            }
        }
    }
}
