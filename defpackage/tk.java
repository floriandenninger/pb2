package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tk {
    public yi a;
    public Typeface c;
    public boolean d;
    private final TextView e;
    private yi f;
    private yi g;
    private yi h;
    private yi i;
    private yi j;
    private yi k;
    private final tn l;
    public int b = 0;
    private int m = -1;

    public tk(TextView textView) {
        this.e = textView;
        this.l = new tn(textView);
    }

    public static final void s(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT < 30) {
            gn.g(text);
            if (Build.VERSION.SDK_INT >= 30) {
                gp.j(editorInfo, text);
                return;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i = editorInfo.initialSelEnd;
            } else {
                i = editorInfo.initialSelStart;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i2 = editorInfo.initialSelStart;
            } else {
                i2 = editorInfo.initialSelEnd;
            }
            int length = text.length();
            if (i < 0 || i2 > length) {
                ajv.a(editorInfo, null, 0, 0);
                return;
            }
            int i3 = editorInfo.inputType & 4095;
            if (i3 == 129 || i3 == 225 || i3 == 18) {
                ajv.a(editorInfo, null, 0, 0);
                return;
            }
            if (length > 2048) {
                int i4 = i2 - i;
                int i5 = i4 > 1024 ? 0 : i4;
                int i6 = 2048 - i5;
                int length2 = text.length() - i2;
                double d = i6;
                Double.isNaN(d);
                int min = Math.min(length2, i6 - Math.min(i, (int) (d * 0.8d)));
                int min2 = Math.min(i, i6 - min);
                int i7 = i - min2;
                if (ajv.b(text, i7, 0)) {
                    i7++;
                    min2--;
                }
                if (ajv.b(text, (i2 + min) - 1, 1)) {
                    min--;
                }
                int i8 = min2 + i5;
                int i9 = i8 + min;
                if (i5 != i4) {
                    subSequence = TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2));
                } else {
                    subSequence = text.subSequence(i7, i9 + i7);
                }
                ajv.a(editorInfo, subSequence, min2, i8);
                return;
            }
            ajv.a(editorInfo, text, i, i2);
            return;
        }
        gp.j(editorInfo, text);
    }

    private static yi t(Context context, so soVar, int i) {
        ColorStateList a = soVar.a(context, i);
        if (a == null) {
            return null;
        }
        yi yiVar = new yi();
        yiVar.d = true;
        yiVar.a = a;
        return yiVar;
    }

    private final void u(Drawable drawable, yi yiVar) {
        if (drawable == null || yiVar == null) {
            return;
        }
        xc.h(drawable, yiVar, this.e.getDrawableState());
    }

    private final void v() {
        yi yiVar = this.a;
        this.f = yiVar;
        this.g = yiVar;
        this.h = yiVar;
        this.i = yiVar;
        this.j = yiVar;
        this.k = yiVar;
    }

    private final void w(Context context, yk ykVar) {
        String n;
        int[] iArr = nx.a;
        this.b = ykVar.c(2, this.b);
        if (Build.VERSION.SDK_INT >= 28) {
            int c = ykVar.c(11, -1);
            this.m = c;
            if (c != -1) {
                this.b &= 2;
            }
        }
        if (ykVar.q(10) || ykVar.q(12)) {
            Typeface typeface = null;
            this.c = null;
            int i = true == ykVar.q(12) ? 12 : 10;
            int i2 = this.m;
            int i3 = this.b;
            if (!context.isRestricted()) {
                ti tiVar = new ti(this, i2, i3, new WeakReference(this.e));
                try {
                    int i4 = this.b;
                    int resourceId = ykVar.b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (ykVar.c == null) {
                            ykVar.c = new TypedValue();
                        }
                        typeface = fk.e(ykVar.a, resourceId, ykVar.c, i4, tiVar);
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                            this.c = Typeface.create(Typeface.create(typeface, 0), this.m, (this.b & 2) != 0);
                        } else {
                            this.c = typeface;
                        }
                    }
                    this.d = this.c == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.c != null || (n = ykVar.n(i)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                this.c = Typeface.create(n, this.b);
                return;
            } else {
                this.c = Typeface.create(Typeface.create(n, 0), this.m, (this.b & 2) != 0);
                return;
            }
        }
        if (ykVar.q(1)) {
            this.d = false;
            int c2 = ykVar.c(1, 1);
            if (c2 == 1) {
                this.c = Typeface.SANS_SERIF;
            } else if (c2 == 2) {
                this.c = Typeface.SERIF;
            } else {
                if (c2 != 3) {
                    return;
                }
                this.c = Typeface.MONOSPACE;
            }
        }
    }

    public final int a() {
        return this.l.a();
    }

    public final int b() {
        return this.l.b();
    }

    public final int c() {
        return this.l.c();
    }

    public final int d() {
        return this.l.a;
    }

    public final void e() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            Drawable[] compoundDrawables = this.e.getCompoundDrawables();
            u(compoundDrawables[0], this.f);
            u(compoundDrawables[1], this.g);
            u(compoundDrawables[2], this.h);
            u(compoundDrawables[3], this.i);
        }
        if (this.j == null && this.k == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
        u(compoundDrawablesRelative[0], this.j);
        u(compoundDrawablesRelative[2], this.k);
    }

    public final void f() {
        this.l.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk.g(android.util.AttributeSet, int):void");
    }

    public final void h(Context context, int i) {
        String n;
        ColorStateList g;
        ColorStateList g2;
        ColorStateList g3;
        yk j = yk.j(context, i, nx.w);
        if (j.q(14)) {
            i(j.p(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (j.q(3) && (g3 = j.g(3)) != null) {
                this.e.setTextColor(g3);
            }
            if (j.q(5) && (g2 = j.g(5)) != null) {
                this.e.setLinkTextColor(g2);
            }
            if (j.q(4) && (g = j.g(4)) != null) {
                this.e.setHintTextColor(g);
            }
        }
        if (j.q(0) && j.b(0, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        w(context, j);
        if (Build.VERSION.SDK_INT >= 26 && j.q(13) && (n = j.n(13)) != null) {
            this.e.setFontVariationSettings(n);
        }
        j.o();
        Typeface typeface = this.c;
        if (typeface != null) {
            this.e.setTypeface(typeface, this.b);
        }
    }

    public final void i(boolean z) {
        this.e.setAllCaps(z);
    }

    public final void j(int i, int i2, int i3, int i4) {
        tn tnVar = this.l;
        if (tnVar.k()) {
            DisplayMetrics displayMetrics = tnVar.i.getResources().getDisplayMetrics();
            tnVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (tnVar.i()) {
                tnVar.e();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        tn tnVar = this.l;
        if (tnVar.k()) {
            int length = iArr.length;
            if (length <= 0) {
                tnVar.g = false;
            } else {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = tnVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                tnVar.f = tn.l(iArr2);
                if (!tnVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            }
            if (tnVar.i()) {
                tnVar.e();
            }
        }
    }

    public final void l(int i) {
        tn tnVar = this.l;
        if (tnVar.k()) {
            if (i == 0) {
                tnVar.a = 0;
                tnVar.d = -1.0f;
                tnVar.e = -1.0f;
                tnVar.c = -1.0f;
                tnVar.f = new int[0];
                tnVar.b = false;
                return;
            }
            if (i == 1) {
                DisplayMetrics displayMetrics = tnVar.i.getResources().getDisplayMetrics();
                tnVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (tnVar.i()) {
                    tnVar.e();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    public final void m(ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new yi();
        }
        yi yiVar = this.a;
        yiVar.a = colorStateList;
        yiVar.d = colorStateList != null;
        v();
    }

    public final void n(PorterDuff.Mode mode) {
        if (this.a == null) {
            this.a = new yi();
        }
        yi yiVar = this.a;
        yiVar.b = mode;
        yiVar.c = mode != null;
        v();
    }

    public final void o(int i, float f) {
        if (lj.a || p()) {
            return;
        }
        this.l.f(i, f);
    }

    public final boolean p() {
        return this.l.h();
    }

    public final int[] q() {
        return this.l.f;
    }

    public final void r() {
        if (lj.a) {
            return;
        }
        f();
    }
}
