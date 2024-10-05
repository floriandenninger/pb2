package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ok extends Drawable implements Drawable.Callback {
    public oj a;
    public Drawable b;
    private Rect d;
    private Drawable e;
    private boolean g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private oi l;
    private int f = PrivateKeyType.INVALID;
    public int c = -1;

    private final void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new oi();
        }
        oi oiVar = this.l;
        oiVar.a = drawable.getCallback();
        drawable.setCallback(oiVar);
        try {
            if (this.a.B <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            oj ojVar = this.a;
            if (!ojVar.F) {
                if (ojVar.I) {
                    drawable.setTintList(ojVar.G);
                }
                oj ojVar2 = this.a;
                if (ojVar2.f249J) {
                    drawable.setTintMode(ojVar2.H);
                }
            } else {
                drawable.setColorFilter(ojVar.E);
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                gl.e(drawable, gl.b(this));
            }
            drawable.setAutoMirrored(this.a.D);
            Rect rect = this.d;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.l.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        oj ojVar = this.a;
        if (theme != null) {
            ojVar.i();
            int i = ojVar.j;
            Drawable[] drawableArr = ojVar.i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    ojVar.g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            ojVar.l(theme.getResources());
        }
    }

    public oj c() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(oj ojVar) {
        this.a = ojVar;
        int i = this.c;
        if (i >= 0) {
            Drawable g = ojVar.g(i);
            this.b = g;
            if (g != null) {
                a(g);
            }
        }
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.b
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f
            r3.setAlpha(r9)
            r13.j = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            oj r9 = r13.a
            int r9 = r9.B
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.j = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L65
            long r10 = r13.k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            r13.k = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            oj r4 = r13.a
            int r4 = r4.C
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.k = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok.g(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        oj ojVar = this.a;
        if (ojVar.n) {
            if (!ojVar.o) {
                ojVar.h();
            }
            return ojVar.q;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        oj ojVar = this.a;
        if (ojVar.n) {
            if (!ojVar.o) {
                ojVar.h();
            }
            return ojVar.p;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        oj ojVar = this.a;
        if (ojVar.n) {
            if (!ojVar.o) {
                ojVar.h();
            }
            return ojVar.s;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        oj ojVar = this.a;
        if (ojVar.n) {
            if (!ojVar.o) {
                ojVar.h();
            }
            return ojVar.r;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        oj ojVar = this.a;
        if (ojVar.t) {
            return ojVar.u;
        }
        ojVar.i();
        int i = ojVar.j;
        Drawable[] drawableArr = ojVar.i;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        ojVar.u = opacity;
        ojVar.t = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            oj r0 = r9.a
            int r0 = r0.C
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L29
            r9.e = r0
            oj r0 = r9.a
            int r0 = r0.C
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L35
        L29:
            r9.e = r4
            r9.k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            oj r0 = r9.a
            int r1 = r0.j
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.b = r0
            r9.c = r10
            if (r0 == 0) goto L5a
            oj r10 = r9.a
            int r10 = r10.B
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L51:
            r9.a(r0)
            goto L5a
        L55:
            r9.b = r4
            r10 = -1
            r9.c = r10
        L5a:
            long r0 = r9.j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.i
            if (r0 != 0) goto L73
            oh r0 = new oh
            r0.<init>(r9)
            r9.i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.g(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok.h(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        oj ojVar = this.a;
        if (ojVar != null) {
            ojVar.k();
        }
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.D;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        oj ojVar = this.a;
        if (ojVar.v) {
            return ojVar.w;
        }
        ojVar.i();
        int i = ojVar.j;
        Drawable[] drawableArr = ojVar.i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            }
            i2++;
        }
        ojVar.w = z;
        ojVar.v = true;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.b.setAlpha(this.f);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
        } else {
            z2 = z;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else if (!z2) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            oj c = c();
            c.d();
            e(c);
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        oj ojVar = this.a;
        int i2 = this.c;
        int i3 = ojVar.j;
        Drawable[] drawableArr = ojVar.i;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean e = Build.VERSION.SDK_INT >= 23 ? gl.e(drawableArr[i4], i) : false;
                if (i4 == i2) {
                    z = e;
                }
            }
        }
        ojVar.A = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.g && this.f == i) {
            return;
        }
        this.g = true;
        this.f = i;
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                g(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        oj ojVar = this.a;
        if (ojVar.D != z) {
            ojVar.D = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        oj ojVar = this.a;
        ojVar.F = true;
        if (ojVar.E != colorFilter) {
            ojVar.E = colorFilter;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        oj ojVar = this.a;
        if (ojVar.z != z) {
            ojVar.z = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.d;
        if (rect == null) {
            this.d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        oj ojVar = this.a;
        ojVar.I = true;
        if (ojVar.G != colorStateList) {
            ojVar.G = colorStateList;
            this.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        oj ojVar = this.a;
        ojVar.f249J = true;
        if (ojVar.H != mode) {
            ojVar.H = mode;
            this.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        oj ojVar = this.a;
        if (!ojVar.x) {
            ojVar.i();
            ojVar.x = true;
            int i = ojVar.j;
            Drawable[] drawableArr = ojVar.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    ojVar.y = false;
                    return null;
                }
            }
            ojVar.y = true;
        } else if (!ojVar.y) {
            return null;
        }
        this.a.f = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        oj ojVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!ojVar.k) {
            Rect rect3 = ojVar.m;
            if (rect3 != null || ojVar.l) {
                rect2 = rect3;
            } else {
                ojVar.i();
                Rect rect4 = new Rect();
                int i = ojVar.j;
                Drawable[] drawableArr = ojVar.i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect4.left > rect2.left) {
                            rect2.left = rect4.left;
                        }
                        if (rect4.top > rect2.top) {
                            rect2.top = rect4.top;
                        }
                        if (rect4.right > rect2.right) {
                            rect2.right = rect4.right;
                        }
                        if (rect4.bottom > rect2.bottom) {
                            rect2.bottom = rect4.bottom;
                        }
                    }
                }
                ojVar.l = true;
                ojVar.m = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.b;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (isAutoMirrored() && gl.b(this) == 1) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return z;
    }
}
