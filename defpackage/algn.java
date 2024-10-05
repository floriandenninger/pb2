package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class algn {
    private static final boolean q;
    public final MaterialButton a;
    public alkl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o;
    public int p;
    private LayerDrawable r;

    static {
        q = Build.VERSION.SDK_INT <= 22;
    }

    public algn(MaterialButton materialButton, alkl alklVar) {
        this.a = materialButton;
        this.b = alklVar;
    }

    private final alkg f(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (alkg) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final alkg g() {
        return f(true);
    }

    public final alkg a() {
        return f(false);
    }

    public final alkw b() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (alkw) this.r.getDrawable(2);
        }
        return (alkw) this.r.getDrawable(1);
    }

    public final void c() {
        this.n = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public final void d(alkl alklVar) {
        this.b = alklVar;
        if (!q || this.n) {
            if (a() != null) {
                a().c(alklVar);
            }
            if (g() != null) {
                g().c(alklVar);
            }
            if (b() != null) {
                b().c(alklVar);
                return;
            }
            return;
        }
        int i = jw.i(this.a);
        int paddingTop = this.a.getPaddingTop();
        int h = jw.h(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        e();
        jw.Y(this.a, i, paddingTop, h, paddingBottom);
    }

    public final void e() {
        MaterialButton materialButton = this.a;
        alkg alkgVar = new alkg(this.b);
        alkgVar.j(this.a.getContext());
        alkgVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            alkgVar.setTintMode(mode);
        }
        int i = this.h;
        ColorStateList colorStateList = this.k;
        alkgVar.r(i);
        alkgVar.q(colorStateList);
        alkg alkgVar2 = new alkg(this.b);
        alkgVar2.setTint(0);
        alkgVar2.p(this.h, 0);
        alkg alkgVar3 = new alkg(this.b);
        this.m = alkgVar3;
        alkgVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(aljx.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{alkgVar2, alkgVar}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.b(rippleDrawable);
        alkg a = a();
        if (a != null) {
            a.k(this.p);
        }
    }
}
