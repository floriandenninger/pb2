package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.bnr;
import defpackage.boj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final List a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                boj bojVar = (boj) it.next();
                BitmapDrawable bitmapDrawable = bojVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (!bojVar.l) {
                    float max = true == bojVar.k ? Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - bojVar.j)) / ((float) bojVar.e))) : 0.0f;
                    Interpolator interpolator = bojVar.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i = (int) (bojVar.g * interpolation);
                    bojVar.c.top = bojVar.f.top + i;
                    bojVar.c.bottom = bojVar.f.bottom + i;
                    float f = bojVar.h;
                    float f2 = f + ((bojVar.i - f) * interpolation);
                    bojVar.b = f2;
                    BitmapDrawable bitmapDrawable2 = bojVar.a;
                    if (bitmapDrawable2 != null) {
                        Rect rect = bojVar.c;
                        bitmapDrawable2.setAlpha((int) (f2 * 255.0f));
                        bojVar.a.setBounds(bojVar.c);
                    }
                    if (bojVar.k && max >= 1.0f) {
                        bojVar.l = true;
                        bnr bnrVar = bojVar.m;
                        if (bnrVar != null) {
                            bnrVar.a();
                        }
                    }
                    if (bojVar.l) {
                    }
                }
                it.remove();
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
