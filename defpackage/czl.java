package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czl extends Drawable implements Animatable, czq {
    public final czk a;
    public boolean b;
    private boolean c;
    private boolean d;
    private int f;
    private boolean h;
    private Paint i;
    private Rect j;
    private boolean e = true;
    private final int g = -1;

    public czl(czk czkVar) {
        did.ap(czkVar);
        this.a = czkVar;
    }

    private final Paint d() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private final Rect e() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private final void f() {
        did.aq(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            invalidateSelf();
            return;
        }
        if (this.c) {
            return;
        }
        this.c = true;
        czs czsVar = this.a.a;
        if (czsVar.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (czsVar.b.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = czsVar.b.isEmpty();
        czsVar.b.add(this);
        if (isEmpty && !czsVar.d) {
            czsVar.d = true;
            czsVar.f = false;
            czsVar.b();
        }
        invalidateSelf();
    }

    private final void g() {
        this.c = false;
        czs czsVar = this.a.a;
        czsVar.b.remove(this);
        if (czsVar.b.isEmpty()) {
            czsVar.f();
        }
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return ((cpg) this.a.a.a).a.asReadOnlyBuffer();
    }

    @Override // defpackage.czq
    public final void c() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        czp czpVar = this.a.a.e;
        if ((czpVar != null ? czpVar.a : -1) == r0.a() - 1) {
            this.f++;
        }
        if (this.g == -1 || this.f < 0) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), e());
            this.h = false;
        }
        czs czsVar = this.a.a;
        czp czpVar = czsVar.e;
        canvas.drawBitmap(czpVar != null ? czpVar.b : czsVar.h, (Rect) null, e(), d());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        did.aq(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            g();
        } else if (this.d) {
            f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            f();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        g();
    }
}
