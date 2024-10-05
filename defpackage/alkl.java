package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkl {
    public static final alkb a = new alki(0.5f);
    public final alkb b;
    final alkb c;
    final alkb d;
    final alkb e;
    final alkd f;
    final alkd g;
    final alkd h;
    final alkd i;
    final alkd j;
    final alkd k;
    final alkd l;
    final alkd m;

    public alkl() {
        this.j = alkd.F();
        this.k = alkd.F();
        this.l = alkd.F();
        this.m = alkd.F();
        this.b = new aljz(0.0f);
        this.c = new aljz(0.0f);
        this.d = new aljz(0.0f);
        this.e = new aljz(0.0f);
        this.f = alkd.z();
        this.g = alkd.z();
        this.h = alkd.z();
        this.i = alkd.z();
    }

    public alkl(alkk alkkVar) {
        this.j = alkkVar.i;
        this.k = alkkVar.j;
        this.l = alkkVar.k;
        this.m = alkkVar.l;
        this.b = alkkVar.a;
        this.c = alkkVar.b;
        this.d = alkkVar.c;
        this.e = alkkVar.d;
        this.f = alkkVar.e;
        this.g = alkkVar.f;
        this.h = alkkVar.g;
        this.i = alkkVar.h;
    }

    public static alkk a() {
        return new alkk();
    }

    public static alkk b(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new aljz(0.0f));
    }

    public static alkk c(Context context, AttributeSet attributeSet, int i, int i2, alkb alkbVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alkh.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            context = new ContextThemeWrapper(context, resourceId);
            resourceId = resourceId2;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, alkh.b);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            alkb g = g(obtainStyledAttributes2, 5, alkbVar);
            alkb g2 = g(obtainStyledAttributes2, 8, g);
            alkb g3 = g(obtainStyledAttributes2, 9, g);
            alkb g4 = g(obtainStyledAttributes2, 7, g);
            alkb g5 = g(obtainStyledAttributes2, 6, g);
            alkk alkkVar = new alkk();
            alkkVar.f(alkd.E(i4));
            alkkVar.a = g2;
            alkkVar.g(alkd.E(i5));
            alkkVar.b = g3;
            alkd E = alkd.E(i6);
            alkkVar.k = E;
            alkk.h(E);
            alkkVar.c = g4;
            alkd E2 = alkd.E(i7);
            alkkVar.l = E2;
            alkk.h(E2);
            alkkVar.d = g5;
            return alkkVar;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private static alkb g(TypedArray typedArray, int i, alkb alkbVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return alkbVar;
        }
        if (peekValue.type == 5) {
            return new aljz(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new alki(peekValue.getFraction(1.0f, 1.0f)) : alkbVar;
    }

    public final alkk d() {
        return new alkk(this);
    }

    public final alkl e(float f) {
        alkk d = d();
        d.d(f);
        d.e(f);
        d.c(f);
        d.b(f);
        return d.a();
    }

    public final boolean f(RectF rectF) {
        boolean z = this.i.getClass().equals(alkd.class) && this.g.getClass().equals(alkd.class) && this.f.getClass().equals(alkd.class) && this.h.getClass().equals(alkd.class);
        float a2 = this.b.a(rectF);
        return z && ((this.c.a(rectF) > a2 ? 1 : (this.c.a(rectF) == a2 ? 0 : -1)) == 0 && (this.e.a(rectF) > a2 ? 1 : (this.e.a(rectF) == a2 ? 0 : -1)) == 0 && (this.d.a(rectF) > a2 ? 1 : (this.d.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.k instanceof alkj) && (this.j instanceof alkj) && (this.l instanceof alkj) && (this.m instanceof alkj));
    }
}
