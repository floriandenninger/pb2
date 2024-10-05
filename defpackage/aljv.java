package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljv {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ColorStateList i;
    public final float j;
    public Typeface k;
    private final int l;
    private boolean m = false;

    public aljv(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, aljt.b);
        this.j = obtainStyledAttributes.getDimension(0, 0.0f);
        this.i = alkd.e(context, obtainStyledAttributes, 3);
        alkd.e(context, obtainStyledAttributes, 4);
        alkd.e(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = true != obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.l = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = alkd.e(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, aljt.a);
        obtainStyledAttributes2.hasValue(0);
        this.h = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private final void e() {
        Typeface typeface;
        String str;
        if (this.k == null && (str = this.b) != null) {
            this.k = Typeface.create(str, this.c);
        }
        if (this.k == null) {
            int i = this.d;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.k = Typeface.DEFAULT;
                    this.k = Typeface.create(this.k, this.c);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.k = typeface;
            this.k = Typeface.create(this.k, this.c);
        }
    }

    public final Typeface a() {
        e();
        return this.k;
    }

    public final void b(Context context, aljw aljwVar) {
        int i = this.l;
        if ((i != 0 ? fk.c(context, i) : null) == null) {
            e();
        } else {
            d(context);
        }
        int i2 = this.l;
        if (i2 == 0) {
            this.m = true;
            i2 = 0;
        }
        if (!this.m) {
            try {
                fk.g(context, i2, new alju(this, aljwVar));
                return;
            } catch (Resources.NotFoundException unused) {
                this.m = true;
                aljwVar.c();
                return;
            } catch (Exception unused2) {
                String valueOf = String.valueOf(this.b);
                if (valueOf.length() != 0) {
                    "Error loading font ".concat(valueOf);
                }
                this.m = true;
                aljwVar.c();
                return;
            }
        }
        aljwVar.b(this.k);
    }

    public final void d(Context context) {
        if (this.m) {
            return;
        }
        if (!context.isRestricted()) {
            try {
                Typeface d = fk.d(context, this.l);
                this.k = d;
                if (d != null) {
                    this.k = Typeface.create(d, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                String valueOf = String.valueOf(this.b);
                if (valueOf.length() != 0) {
                    "Error loading font ".concat(valueOf);
                }
            }
        }
        e();
        this.m = true;
    }
}
