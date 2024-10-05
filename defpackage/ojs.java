package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojs implements flp, obo {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final kch c;
    private final oel d;

    public ojs(kch kchVar, oel oelVar) {
        this.c = kchVar;
        this.d = oelVar;
    }

    private static void b(obp obpVar, Rect rect) {
        Rect v = obpVar.v();
        Rect t = obpVar.t();
        rect.set(v);
        rect.offset(-t.left, -t.top);
    }

    @Override // defpackage.flp
    public final void g(View view) {
        b(this.d.c(), this.a);
        view.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
    }

    @Override // defpackage.flp
    public final void h(View view) {
        Rect v = this.d.c().v();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(v.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(v.height(), 1073741824), 0, layoutParams.height));
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection;
        b(obpVar, this.b);
        if (this.a.equals(this.b) || (youTubePlayerViewNotForReflection = ((kcz) this.c.get()).aT) == null) {
            return;
        }
        youTubePlayerViewNotForReflection.requestLayout();
    }
}
