package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaEdge;
import com.google.cardboard.sdk.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class swa extends Drawable {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final Paint e;
    private static final Paint f;
    private static final Paint g;
    private static final Paint h;
    private final Path i;
    private final Path j;
    private final Path k;
    private final Path l;

    static {
        int argb = Color.argb(168, 246, 178, 107);
        a = argb;
        int argb2 = Color.argb(168, PrivateKeyType.INVALID, 229, 153);
        b = argb2;
        int argb3 = Color.argb(140, 147, 196, R.styleable.AppCompatTheme_windowMinWidthMinor);
        c = argb3;
        int argb4 = Color.argb(168, 111, 168, 220);
        d = argb4;
        e = swb.a(argb);
        f = swb.a(argb2);
        g = swb.a(argb3);
        h = swb.a(argb4);
    }

    public swa(dic dicVar) {
        Path path = new Path();
        this.i = path;
        Path path2 = new Path();
        this.j = path2;
        Path path3 = new Path();
        this.k = path3;
        Path path4 = new Path();
        this.l = path4;
        dut i = dicVar.i();
        RectF rectF = new RectF(dicVar.b());
        RectF rectF2 = new RectF(rectF.left - i.c(YogaEdge.LEFT), rectF.top - i.c(YogaEdge.TOP), rectF.right + i.c(YogaEdge.RIGHT), rectF.bottom + i.c(YogaEdge.BOTTOM));
        RectF rectF3 = new RectF(rectF.left + i.a(YogaEdge.LEFT), rectF.top + i.a(YogaEdge.TOP), rectF.right - i.a(YogaEdge.RIGHT), rectF.bottom - i.a(YogaEdge.BOTTOM));
        RectF rectF4 = new RectF(rectF3.left + i.d(YogaEdge.LEFT), rectF3.top + i.d(YogaEdge.TOP), rectF3.right - i.d(YogaEdge.RIGHT), rectF3.bottom - i.d(YogaEdge.BOTTOM));
        path.addRect(rectF2, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CCW);
        path2.addRect(rectF, Path.Direction.CW);
        path2.addRect(rectF3, Path.Direction.CCW);
        path3.addRect(rectF3, Path.Direction.CW);
        path3.addRect(rectF4, Path.Direction.CCW);
        path4.addRect(rectF4, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.i, e);
        canvas.drawPath(this.j, f);
        canvas.drawPath(this.k, g);
        canvas.drawPath(this.l, h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
