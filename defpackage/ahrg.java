package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrg implements Runnable {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;
    private final /* synthetic */ int b;

    public ahrg(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, int i) {
        this.b = i;
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.l.b.b.sendAccessibilityEvent(8);
            return;
        }
        if (this.a.t()) {
            Rect a = this.a.u.a();
            int width = a.width();
            int height = a.height();
            final ahrd ahrdVar = this.a.g;
            yny.A(ahrdVar, new azrw() { // from class: ahqz
                @Override // defpackage.azrw
                public final Object get() {
                    return ahrd.this.c();
                }
            }, yny.y(width, height), ViewGroup.LayoutParams.class);
            for (ahrq ahrqVar : this.a.h) {
                aqte aqteVar = ahrqVar.b;
                float f = width;
                float f2 = aqteVar.i * f;
                float f3 = f2 / aqteVar.k;
                int paddingLeft = ahrqVar.c().getPaddingLeft();
                int paddingRight = ahrqVar.c().getPaddingRight();
                int paddingTop = ahrqVar.c().getPaddingTop();
                yny.z(ahrqVar.c(), yny.h(yny.o(Math.round(ahrqVar.b.h * f) - paddingLeft), yny.v(Math.round(ahrqVar.b.j * height) - paddingTop), yny.y(Math.round(f2) + paddingLeft + paddingRight, Math.round(f3) + paddingTop + ahrqVar.c().getPaddingBottom())), ViewGroup.MarginLayoutParams.class);
                TextView textView = ahrqVar.e;
                if (textView != null) {
                    textView.setMaxLines(f3 > ahrqVar.f ? 2 : 1);
                }
            }
            ahsd ahsdVar = this.a.l;
            if (ahsdVar != null) {
                ahsdVar.c();
            }
        }
    }
}
