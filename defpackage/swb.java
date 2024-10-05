package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swb implements View.OnAttachStateChangeListener {
    public final List a = new ArrayList();

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    public final void b() {
        for (Pair pair : this.a) {
            dkp dkpVar = (dkp) pair.first;
            dkpVar.getOverlay().remove((Drawable) pair.second);
            dkpVar.invalidate();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        b();
    }
}
