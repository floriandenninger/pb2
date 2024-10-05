package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkf extends Drawable.ConstantState {
    public alkl a;
    public algu b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint.Style v;

    public alkf(alkf alkfVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = PrivateKeyType.INVALID;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = alkfVar.a;
        this.b = alkfVar.b;
        this.l = alkfVar.l;
        this.c = alkfVar.c;
        this.d = alkfVar.d;
        this.e = alkfVar.e;
        this.h = alkfVar.h;
        this.g = alkfVar.g;
        this.m = alkfVar.m;
        this.j = alkfVar.j;
        this.s = alkfVar.s;
        this.q = alkfVar.q;
        boolean z = alkfVar.u;
        this.u = false;
        this.k = alkfVar.k;
        this.n = alkfVar.n;
        this.o = alkfVar.o;
        float f = alkfVar.p;
        this.p = 0.0f;
        this.r = alkfVar.r;
        this.t = alkfVar.t;
        ColorStateList colorStateList = alkfVar.f;
        this.f = null;
        this.v = alkfVar.v;
        Rect rect = alkfVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        alkg alkgVar = new alkg(this);
        alkgVar.e = true;
        return alkgVar;
    }

    public alkf(alkl alklVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = PrivateKeyType.INVALID;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = alklVar;
        this.b = null;
    }
}
