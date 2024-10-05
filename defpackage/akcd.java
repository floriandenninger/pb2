package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcd extends ViewGroup {
    public PopupWindow a;
    public boolean b;
    public View c;
    public int d;
    public View e;
    public int f;
    public float g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final Paint k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private boolean s;
    private Rect t;

    public akcd(Context context) {
        super(context);
        this.g = 1.0f;
        setWillNotDraw(false);
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        Paint paint = new Paint();
        this.k = paint;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(akcc.a);
        this.l = obtainStyledAttributes.getDimensionPixelSize(5, yjk.K(displayMetrics, 16));
        this.m = obtainStyledAttributes.getDimensionPixelSize(4, yjk.K(displayMetrics, 8));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, yjk.K(displayMetrics, 1));
        this.n = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, yjk.K(displayMetrics, 1));
        this.r = dimensionPixelSize2;
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, yjk.K(displayMetrics, 10));
        this.p = obtainStyledAttributes.getDimensionPixelSize(0, yjk.K(displayMetrics, 24));
        this.q = obtainStyledAttributes.getDimensionPixelSize(3, yjk.K(displayMetrics, 4));
        int color = obtainStyledAttributes.getColor(2, wbs.Q(context, R.attr.ytThemedBlue));
        int color2 = obtainStyledAttributes.getColor(6, 1073741824);
        obtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        float f = dimensionPixelSize;
        paint.setShadowLayer(dimensionPixelSize2, f, f, color2);
        a(color);
        this.b = true;
    }

    private static int c(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final Point d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    private final void e(Canvas canvas) {
        int[] iArr = this.h;
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.e.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        this.e.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        iArr[0] = (i - i3) + i5;
        iArr[1] = (i2 - i4) + i6;
        canvas.save();
        if (akce.g(this.d)) {
            canvas.translate(this.m - this.h[0], 0.0f);
        } else {
            int i7 = this.d;
            if (i7 == 5 || i7 == 6) {
                canvas.translate(0.0f, this.m - this.h[1]);
            }
        }
        canvas.drawPath(this.i, this.k);
        canvas.restore();
    }

    public final void a(int i) {
        this.k.setColor(i);
        setLayerType(1, this.k);
    }

    public final void b() {
        int[] iArr = this.h;
        View view = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        this.t = new Rect(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.d;
        if (i == 2 || i == 6) {
            e(canvas);
        }
        RectF rectF = this.j;
        float f = this.q;
        canvas.drawRoundRect(rectF, f, f, this.k);
        int i2 = this.d;
        if (i2 == 1 || i2 == 5) {
            e(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcd.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (!this.s && (i3 = this.d) != 0) {
            this.d = akce.a(i3, this);
            this.s = true;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.l;
        int i5 = i4 + i4;
        int i6 = this.n;
        int i7 = (size - i5) - i6;
        int i8 = (size2 - i5) - i6;
        if (akce.g(this.d)) {
            i8 -= this.o;
        } else {
            int i9 = this.d;
            if (i9 == 5 || i9 == 6) {
                i7 -= this.o;
            }
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (d().x * this.g), i7), CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(i8, 0));
        if (this.c.getMeasuredHeight() > i8) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(i7, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(i8, CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
        }
        int measuredWidth = this.c.getMeasuredWidth();
        int i10 = this.l;
        int i11 = measuredWidth + i10 + i10;
        int measuredHeight = this.c.getMeasuredHeight();
        int i12 = this.l;
        int i13 = measuredHeight + i12 + i12;
        RectF rectF = this.j;
        int i14 = this.d;
        rectF.set(i14 == 6 ? this.o : 0.0f, i14 == 2 ? this.o : 0.0f, i11 + (i14 == 6 ? this.o : 0), i13 + (i14 == 2 ? this.o : 0));
        int width = ((int) this.j.width()) + this.n;
        int height = ((int) this.j.height()) + this.n;
        if (akce.g(this.d)) {
            height += this.o;
        } else {
            int i15 = this.d;
            if (i15 == 5 || i15 == 6) {
                width += this.o;
            }
        }
        setMeasuredDimension(width, height);
    }
}
