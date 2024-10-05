package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxs extends Drawable.ConstantState {
    int a;
    bxr b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public bxs() {
        this.c = null;
        this.d = bxu.a;
        this.b = new bxr();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        bxr bxrVar = this.b;
        bxrVar.a(bxrVar.d, bxr.a, canvas, i, i2);
    }

    public final boolean b() {
        bxr bxrVar = this.b;
        if (bxrVar.k == null) {
            bxrVar.k = Boolean.valueOf(bxrVar.d.f());
        }
        return bxrVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bxu(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new bxu(this);
    }

    public bxs(bxs bxsVar) {
        this.c = null;
        this.d = bxu.a;
        if (bxsVar != null) {
            this.a = bxsVar.a;
            this.b = new bxr(bxsVar.b);
            Paint paint = bxsVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = bxsVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = bxsVar.c;
            this.d = bxsVar.d;
            this.e = bxsVar.e;
        }
    }
}
