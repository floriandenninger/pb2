package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtr extends Drawable implements TextContent, Drawable.Callback, dlz {
    private static final Point[] p = {new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24)};
    public Layout a;
    public float c;
    public boolean d;
    public boolean e;
    public CharSequence f;
    public ColorStateList g;
    public int h;
    public int i;
    public ImageSpan[] j;
    public dtq k;
    public boolean l;
    public Handler m;
    public String n;
    public sqf o;
    private int q;
    private int r;
    private Path s;
    private boolean t;
    private Paint u;
    private dtp v;

    private final int b(int i, int i2) {
        float paragraphRight;
        float f;
        int lineForVertical = this.a.getLineForVertical(i2);
        if (this.a.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            f = this.a.getLineLeft(lineForVertical);
            paragraphRight = this.a.getLineRight(lineForVertical);
        } else {
            int paragraphDirection = this.a.getParagraphDirection(lineForVertical);
            float width = paragraphDirection == -1 ? this.a.getWidth() - this.a.getLineMax(lineForVertical) : this.a.getParagraphLeft(lineForVertical);
            paragraphRight = paragraphDirection == -1 ? this.a.getParagraphRight(lineForVertical) : this.a.getLineMax(lineForVertical);
            f = width;
        }
        float f2 = i;
        if (f2 >= f && f2 <= paragraphRight) {
            try {
                return this.a.getOffsetForHorizontal(lineForVertical, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private final ClickableSpan e(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        int b = b(i, i2);
        if (b >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.f).getSpans(b, b, ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    private final void f() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacks(this.v);
            this.v = null;
        }
        this.l = false;
    }

    private final void g(int i, int i2) {
        if (Color.alpha(0) != 0) {
            if (this.q == i && this.r == i2) {
                return;
            }
            this.q = i;
            this.r = i2;
            Paint paint = this.u;
            if (paint == null) {
                Paint paint2 = new Paint();
                this.u = paint2;
                paint2.setColor(0);
            } else {
                paint.setColor(0);
            }
            this.t = true;
            invalidateSelf();
        }
    }

    private static boolean h(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final boolean i(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 0) {
                z = false;
                return (!this.e && h(getBounds(), motionEvent) && z) || actionMasked == 3;
            }
            actionMasked = 0;
        }
        z = true;
        if (this.e) {
        }
    }

    private final boolean j(MotionEvent motionEvent) {
        return (!this.e || this.m == null || motionEvent.getAction() == 0) ? false : true;
    }

    public final void a() {
        g(0, 0);
    }

    @Override // defpackage.dlz
    public final boolean c(MotionEvent motionEvent, View view) {
        ClickableSpan clickableSpan;
        sqe[] sqeVarArr;
        if (i(motionEvent) || j(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                a();
                f();
            } else {
                if (actionMasked == 2) {
                    if (!this.l && this.v != null) {
                        Rect bounds = getBounds();
                        if (!h(bounds, motionEvent)) {
                            f();
                        } else {
                            if (this.v.a != e(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
                                f();
                            }
                        }
                    }
                    actionMasked = 2;
                }
                boolean z = !this.l;
                if (actionMasked == 1) {
                    f();
                    actionMasked = 1;
                }
                Rect bounds2 = getBounds();
                if (h(bounds2, motionEvent)) {
                    int x = ((int) motionEvent.getX()) - bounds2.left;
                    int y = ((int) motionEvent.getY()) - bounds2.top;
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
                        Point[] pointArr = p;
                        int length = pointArr.length;
                        ClickableSpan clickableSpan2 = null;
                        loop0: for (int i = 0; i < 17; i++) {
                            Point point = pointArr[i];
                            sqf sqfVar = this.o;
                            if (sqfVar != null && (sqeVarArr = sqfVar.a) != null) {
                                for (sqe sqeVar : sqeVarArr) {
                                    if (sqeVar.e(x, y)) {
                                        break loop0;
                                    }
                                }
                            }
                            clickableSpan2 = e(point.x + x, point.y + y);
                            if (clickableSpan2 != null) {
                                break;
                            }
                            int b = b(point.x + x, point.y + y);
                            if (((dud[]) ((Spanned) this.f).getSpans(b, b, dud.class)).length > 0) {
                                clickableSpan = null;
                                break;
                            }
                        }
                        clickableSpan = clickableSpan2;
                    } else {
                        clickableSpan = e(x, y);
                    }
                    if (clickableSpan != null) {
                        if (actionMasked == 1) {
                            a();
                            if (z) {
                                clickableSpan.onClick(view);
                            }
                        } else if (actionMasked == 0) {
                            if (clickableSpan instanceof drp) {
                                dtp dtpVar = new dtp(this, (drp) clickableSpan, view);
                                this.v = dtpVar;
                                this.m.postDelayed(dtpVar, ViewConfiguration.getLongPressTimeout());
                            }
                            Spanned spanned = (Spanned) this.f;
                            g(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
                        }
                        return true;
                    }
                    a();
                }
            }
        }
        return false;
    }

    @Override // defpackage.dlz
    public final boolean d(MotionEvent motionEvent) {
        return i(motionEvent) || j(motionEvent);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.a == null) {
            return;
        }
        int save = canvas.save();
        Rect bounds = getBounds();
        if (this.d) {
            canvas.clipRect(bounds);
        }
        canvas.translate(bounds.left, bounds.top + this.c);
        sqf sqfVar = this.o;
        Path path = null;
        int i2 = 0;
        if (sqfVar != null) {
            i = sqfVar.a() ? canvas.saveLayer(new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()), null) : 0;
            sqe[] sqeVarArr = this.o.a;
            if (sqeVarArr != null) {
                for (sqe sqeVar : sqeVarArr) {
                    sqeVar.f();
                    sqeVar.b(canvas);
                }
            }
        } else {
            i = 0;
        }
        try {
            Layout layout = this.a;
            if (this.q != this.r && Color.alpha(0) != 0) {
                if (this.t) {
                    if (this.s == null) {
                        this.s = new Path();
                    }
                    this.a.getSelectionPath(this.q, this.r, this.s);
                    this.t = false;
                }
                path = this.s;
            }
            layout.draw(canvas, path, this.u, 0);
            sqf sqfVar2 = this.o;
            if (sqfVar2 != null) {
                sqe[] sqeVarArr2 = sqfVar2.a;
                if (sqeVarArr2 != null) {
                    int length = sqeVarArr2.length;
                    while (i2 < length) {
                        sqe sqeVar2 = sqeVarArr2[i2];
                        sqeVar2.f();
                        sqeVar2.a(canvas);
                        i2++;
                    }
                }
                if (this.o.a()) {
                    canvas.restoreToCount(i);
                }
            }
            canvas.restoreToCount(save);
        } catch (IndexOutOfBoundsException e) {
            String valueOf = String.valueOf(e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append(" [");
            sb.append(this.n);
            sb.append("] ");
            CharSequence charSequence = this.f;
            if (charSequence instanceof SpannableStringBuilder) {
                Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                sb.append("spans: ");
                int length2 = spans.length;
                while (i2 < length2) {
                    sb.append(spans[i2].getClass().getSimpleName());
                    sb.append(", ");
                    i2++;
                }
            }
            sb.append("ellipsizedWidth: ");
            sb.append(this.a.getEllipsizedWidth());
            sb.append(", lineCount: ");
            sb.append(this.a.getLineCount());
            String valueOf2 = String.valueOf(sb.toString());
            throw new IndexOutOfBoundsException(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        CharSequence charSequence = this.f;
        return charSequence != null ? Collections.singletonList(charSequence) : Collections.emptyList();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.g != null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.g != null && (layout = this.a) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.g.getColorForState(iArr, this.h);
            if (colorForState != color) {
                this.a.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
