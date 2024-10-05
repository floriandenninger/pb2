package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcg extends View {
    private static final Paint g;
    public final akcu a;
    public final RectF b;
    public final View c;
    public final boolean d;
    public boolean e;
    public boolean f;
    private final int[] h;
    private final Paint i;
    private final float j;

    static {
        Paint paint = new Paint(1);
        g = paint;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
    }

    public akcg(Context context, akcu akcuVar, View view, boolean z) {
        super(context);
        this.a = akcuVar;
        this.d = z;
        this.b = new RectF();
        this.h = new int[2];
        this.e = true;
        this.f = true;
        setClickable(false);
        setFocusable(false);
        setLayerType(2, null);
        this.c = view;
        a();
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(wbs.W(context, R.attr.ytOverlayBackgroundMedium).orElse(0));
        this.j = yjk.K(getResources().getDisplayMetrics(), 2);
        setOnTouchListener(new View.OnTouchListener() { // from class: akcf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                akcg akcgVar = akcg.this;
                if (!akcgVar.f) {
                    return false;
                }
                if (akcgVar.b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    akcgVar.f = false;
                    akcgVar.a.a(1);
                    akcgVar.c.performClick();
                    return true;
                }
                if (akcgVar.d) {
                    akcgVar.f = false;
                    akcgVar.a.a(0);
                }
                return akcgVar.e || akcgVar.d;
            }
        });
    }

    private final void a() {
        this.c.getLocationInWindow(this.h);
        this.b.set(this.h[0], r1[1], r2 + this.c.getMeasuredWidth(), this.h[1] + this.c.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawPaint(this.i);
            RectF rectF = this.b;
            float f = this.j;
            canvas.drawRoundRect(rectF, f, f, g);
        }
    }
}
