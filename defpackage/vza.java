package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vza extends View {
    public final Paint a;
    public final int b;
    public final int c;
    private final RectF d;
    private final int e;

    public vza(Context context) {
        super(context, null);
        RectF rectF = new RectF();
        this.d = rectF;
        Paint paint = new Paint();
        this.a = paint;
        Resources resources = context.getResources();
        paint.setColor(resources.getColor(R.color.video_trim_playhead_color));
        this.c = resources.getDimensionPixelSize(R.dimen.video_trim_playhead_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.video_trim_playhead_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.video_trim_playhead_vertical_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.video_trim_playhead_horizontal_padding);
        this.b = dimensionPixelSize3;
        rectF.set(dimensionPixelSize3, dimensionPixelSize2, r1 + dimensionPixelSize3, dimensionPixelSize);
        this.e = resources.getDimensionPixelSize(R.dimen.video_trim_corner_radius);
    }

    public final int a() {
        int i = this.c;
        int i2 = this.b;
        return i + i2 + i2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.d;
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }
}
