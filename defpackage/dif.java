package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dif extends Drawable implements dow {
    static final int a = Color.parseColor("#22FF0000");
    private static final int d = Color.parseColor("#2200FF00");
    private static final int e = Color.parseColor("#CCFF0000");
    private static final int f = Color.parseColor("#CC00FF00");
    final String b;
    final int c;
    private final Paint g;
    private final Paint h;
    private final List i;

    public dif(List list) {
        Paint paint = new Paint();
        this.g = paint;
        this.h = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(80.0f);
        paint.setTextAlign(Paint.Align.LEFT);
        this.i = list;
        int size = list.size();
        if (size <= 0) {
            this.b = "";
            this.c = 0;
            return;
        }
        StringBuilder sb = new StringBuilder(12);
        sb.append(size);
        sb.append("x");
        this.b = sb.toString();
        this.c = ((Boolean) list.get(size + (-1))).booleanValue() ? a : d;
    }

    @Override // defpackage.dow
    public final boolean a(dow dowVar) {
        return equals(dowVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.h.setColor(this.c);
        Rect bounds = getBounds();
        canvas.drawRect(bounds, this.h);
        int size = this.i.size();
        int i = bounds.left;
        int i2 = bounds.right;
        int i3 = bounds.top;
        int min = Math.min(i3 + 100, bounds.bottom);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (i4 * 20) + i;
            int i6 = i5 + 16;
            if (i6 >= i2) {
                break;
            }
            if (((Boolean) this.i.get(i4)).booleanValue()) {
                this.h.setColor(e);
            } else {
                this.h.setColor(f);
            }
            canvas.drawRect(i5, i3, i6, min, this.h);
        }
        if (size > 3) {
            canvas.drawText(this.b, i, i3 + 80.0f, this.g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dif difVar = (dif) obj;
            if (this.c == difVar.c && this.b.equals(difVar.b) && this.i.equals(difVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
