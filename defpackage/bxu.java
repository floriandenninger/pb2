package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxu extends bxm {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public bxs b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public bxu() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new bxs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    public static bxu b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        bxu bxuVar = new bxu();
        bxuVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bxuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxu c(Resources resources, int i, Resources.Theme theme) {
        int next;
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return b(resources, xml, asAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = this.j.width();
        int height = this.j.height();
        int min = Math.min(2048, (int) (width * abs));
        int min2 = Math.min(2048, (int) (height * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.j.left, this.j.top);
        if (isAutoMirrored() && gl.b(this) == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        bxs bxsVar = this.b;
        Bitmap bitmap = bxsVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != bxsVar.f.getHeight()) {
            bxsVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            bxsVar.k = true;
        }
        if (!this.c) {
            this.b.a(min, min2);
        } else {
            bxs bxsVar2 = this.b;
            if (bxsVar2.k || bxsVar2.g != bxsVar2.c || bxsVar2.h != bxsVar2.d || bxsVar2.j != bxsVar2.e || bxsVar2.i != bxsVar2.b.getRootAlpha()) {
                this.b.a(min, min2);
                bxs bxsVar3 = this.b;
                bxsVar3.g = bxsVar3.c;
                bxsVar3.h = bxsVar3.d;
                bxsVar3.i = bxsVar3.b.getRootAlpha();
                bxsVar3.j = bxsVar3.e;
                bxsVar3.k = false;
            }
        }
        bxs bxsVar4 = this.b;
        Rect rect = this.j;
        if (bxsVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (bxsVar4.l == null) {
                bxsVar4.l = new Paint();
                bxsVar4.l.setFilterBitmap(true);
            }
            bxsVar4.l.setAlpha(bxsVar4.b.getRootAlpha());
            bxsVar4.l.setColorFilter(colorFilter);
            paint = bxsVar4.l;
        }
        canvas.drawBitmap(bxsVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            bxs bxsVar = this.b;
            if (bxsVar == null) {
                return false;
            }
            if (!bxsVar.b() && ((colorStateList = this.b.c) == null || !colorStateList.isStateful())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new bxs(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.bxm, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        bxs bxsVar = this.b;
        ColorStateList colorStateList = bxsVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = bxsVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (bxsVar.b()) {
            boolean g = bxsVar.b.d.g(iArr);
            bxsVar.k |= g;
            if (g) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        bxs bxsVar = this.b;
        if (bxsVar.c != colorStateList) {
            bxsVar.c = colorStateList;
            this.d = d(colorStateList, bxsVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        bxs bxsVar = this.b;
        if (bxsVar.d != mode) {
            bxsVar.d = mode;
            this.d = d(bxsVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.e != null && Build.VERSION.SDK_INT >= 24) {
            return new bxt(this.e.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        bxs bxsVar = this.b;
        bxsVar.b = new bxr();
        TypedArray t = gl.t(resources, theme, attributeSet, bxc.a);
        bxs bxsVar2 = this.b;
        bxr bxrVar = bxsVar2.b;
        int r = gl.r(t, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (r == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (r == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (r != 9) {
            switch (r) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        bxsVar2.d = mode;
        int i2 = 1;
        if (gl.y(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            t.getValue(1, typedValue);
            if (typedValue.type == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = ey.c(t.getResources(), t.getResourceId(1, 0), theme);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            bxsVar2.c = colorStateList;
        }
        boolean z = bxsVar2.e;
        if (gl.y(xmlPullParser, "autoMirrored")) {
            z = t.getBoolean(5, z);
        }
        bxsVar2.e = z;
        bxrVar.g = gl.p(t, xmlPullParser, "viewportWidth", 7, bxrVar.g);
        float p = gl.p(t, xmlPullParser, "viewportHeight", 8, bxrVar.h);
        bxrVar.h = p;
        if (bxrVar.g <= 0.0f) {
            throw new XmlPullParserException(t.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (p <= 0.0f) {
            throw new XmlPullParserException(t.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        bxrVar.e = t.getDimension(3, bxrVar.e);
        float dimension = t.getDimension(2, bxrVar.f);
        bxrVar.f = dimension;
        if (bxrVar.e <= 0.0f) {
            throw new XmlPullParserException(t.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(t.getPositionDescription() + "<vector> tag requires height > 0");
        }
        bxrVar.setAlpha(gl.p(t, xmlPullParser, "alpha", 4, bxrVar.getAlpha()));
        String string = t.getString(0);
        if (string != null) {
            bxrVar.j = string;
            bxrVar.l.put(string, bxrVar);
        }
        t.recycle();
        bxsVar.a = getChangingConfigurations();
        bxsVar.k = true;
        bxs bxsVar3 = this.b;
        bxr bxrVar2 = bxsVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(bxrVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                bxp bxpVar = (bxp) arrayDeque.peek();
                if ("path".equals(name)) {
                    bxo bxoVar = new bxo();
                    TypedArray t2 = gl.t(resources, theme, attributeSet, bxc.c);
                    bxoVar.a = null;
                    if (gl.y(xmlPullParser, "pathData")) {
                        String string2 = t2.getString(0);
                        if (string2 != null) {
                            bxoVar.n = string2;
                        }
                        String string3 = t2.getString(2);
                        if (string3 != null) {
                            bxoVar.m = gl.m(string3);
                        }
                        bxoVar.d = gl.C(t2, xmlPullParser, theme, "fillColor", 1);
                        i = depth;
                        bxoVar.f = gl.p(t2, xmlPullParser, "fillAlpha", 12, bxoVar.f);
                        int r2 = gl.r(t2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint.Cap cap = bxoVar.j;
                        if (r2 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (r2 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (r2 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        bxoVar.j = cap;
                        int r3 = gl.r(t2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint.Join join = bxoVar.k;
                        if (r3 == 0) {
                            join = Paint.Join.MITER;
                        } else if (r3 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (r3 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        bxoVar.k = join;
                        bxoVar.l = gl.p(t2, xmlPullParser, "strokeMiterLimit", 10, bxoVar.l);
                        bxoVar.b = gl.C(t2, xmlPullParser, theme, "strokeColor", 3);
                        bxoVar.e = gl.p(t2, xmlPullParser, "strokeAlpha", 11, bxoVar.e);
                        bxoVar.c = gl.p(t2, xmlPullParser, "strokeWidth", 4, bxoVar.c);
                        bxoVar.h = gl.p(t2, xmlPullParser, "trimPathEnd", 6, bxoVar.h);
                        bxoVar.i = gl.p(t2, xmlPullParser, "trimPathOffset", 7, bxoVar.i);
                        bxoVar.g = gl.p(t2, xmlPullParser, "trimPathStart", 5, bxoVar.g);
                        bxoVar.o = gl.r(t2, xmlPullParser, "fillType", 13, bxoVar.o);
                    } else {
                        i = depth;
                    }
                    t2.recycle();
                    bxpVar.b.add(bxoVar);
                    if (bxoVar.getPathName() != null) {
                        bxrVar2.l.put(bxoVar.getPathName(), bxoVar);
                    }
                    int i4 = bxsVar3.a;
                    z2 = false;
                } else {
                    i = depth;
                    if ("clip-path".equals(name)) {
                        bxn bxnVar = new bxn();
                        if (gl.y(xmlPullParser, "pathData")) {
                            TypedArray t3 = gl.t(resources, theme, attributeSet, bxc.d);
                            String string4 = t3.getString(0);
                            if (string4 != null) {
                                bxnVar.n = string4;
                            }
                            String string5 = t3.getString(1);
                            if (string5 != null) {
                                bxnVar.m = gl.m(string5);
                            }
                            bxnVar.o = gl.r(t3, xmlPullParser, "fillType", 2, 0);
                            t3.recycle();
                        }
                        bxpVar.b.add(bxnVar);
                        if (bxnVar.getPathName() != null) {
                            bxrVar2.l.put(bxnVar.getPathName(), bxnVar);
                        }
                        int i5 = bxsVar3.a;
                    } else if ("group".equals(name)) {
                        bxp bxpVar2 = new bxp();
                        TypedArray t4 = gl.t(resources, theme, attributeSet, bxc.b);
                        bxpVar2.l = null;
                        bxpVar2.c = gl.p(t4, xmlPullParser, "rotation", 5, bxpVar2.c);
                        bxpVar2.d = t4.getFloat(1, bxpVar2.d);
                        bxpVar2.e = t4.getFloat(2, bxpVar2.e);
                        bxpVar2.f = gl.p(t4, xmlPullParser, "scaleX", 3, bxpVar2.f);
                        bxpVar2.g = gl.p(t4, xmlPullParser, "scaleY", 4, bxpVar2.g);
                        bxpVar2.h = gl.p(t4, xmlPullParser, "translateX", 6, bxpVar2.h);
                        bxpVar2.i = gl.p(t4, xmlPullParser, "translateY", 7, bxpVar2.i);
                        String string6 = t4.getString(0);
                        if (string6 != null) {
                            bxpVar2.m = string6;
                        }
                        bxpVar2.i();
                        t4.recycle();
                        bxpVar.b.add(bxpVar2);
                        arrayDeque.push(bxpVar2);
                        if (bxpVar2.getGroupName() != null) {
                            bxrVar2.l.put(bxpVar2.getGroupName(), bxpVar2);
                        }
                        int i6 = bxsVar3.a;
                    }
                }
            } else {
                i = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = i;
            i2 = 1;
        }
        if (!z2) {
            this.d = d(bxsVar.c, bxsVar.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    public bxu(bxs bxsVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = bxsVar;
        this.d = d(bxsVar.c, bxsVar.d);
    }
}
