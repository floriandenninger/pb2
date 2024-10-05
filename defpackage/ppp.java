package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppp implements plg {
    public static final ppp a;
    public static final plf b;
    public final CharSequence c;
    public final Layout.Alignment d;
    public final Layout.Alignment e;
    public final Bitmap f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final float l;
    public final float m;
    public final boolean n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final float s;

    static {
        ppo ppoVar = new ppo();
        ppoVar.a = "";
        a = ppoVar.a();
        b = ppn.a;
    }

    public ppp(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            pse.c(bitmap);
        } else {
            pse.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.c = SpannedString.valueOf(charSequence);
        } else {
            this.c = charSequence != null ? charSequence.toString() : null;
        }
        this.d = alignment;
        this.e = alignment2;
        this.f = bitmap;
        this.g = f;
        this.h = i;
        this.i = i2;
        this.j = f2;
        this.k = i3;
        this.l = f4;
        this.m = f5;
        this.n = z;
        this.o = i5;
        this.p = i4;
        this.q = f3;
        this.r = i6;
        this.s = f6;
    }

    public static String a(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ppp pppVar = (ppp) obj;
            if (TextUtils.equals(this.c, pppVar.c) && this.d == pppVar.d && this.e == pppVar.e && ((bitmap = this.f) != null ? !((bitmap2 = pppVar.f) == null || !bitmap.sameAs(bitmap2)) : pppVar.f == null) && this.g == pppVar.g && this.h == pppVar.h && this.i == pppVar.i && this.j == pppVar.j && this.k == pppVar.k && this.l == pppVar.l && this.m == pppVar.m && this.n == pppVar.n && this.o == pppVar.o && this.p == pppVar.p && this.q == pppVar.q && this.r == pppVar.r && this.s == pppVar.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, Float.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Integer.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r), Float.valueOf(this.s)});
    }
}
