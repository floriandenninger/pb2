package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oen implements flr {
    private final ViewGroup a;
    private final NextGenWatchLayout b;

    public oen(ViewGroup viewGroup, NextGenWatchLayout nextGenWatchLayout) {
        this.a = viewGroup;
        this.b = nextGenWatchLayout;
    }

    @Override // defpackage.flr
    public final void a(View view) {
        gfw.b();
        NextGenWatchLayout nextGenWatchLayout = this.b;
        if (nextGenWatchLayout.v.contains(view)) {
            return;
        }
        nextGenWatchLayout.v.add(view);
        nextGenWatchLayout.addView(view);
        nextGenWatchLayout.n();
        nextGenWatchLayout.requestLayout();
    }

    @Override // defpackage.flr
    public final void b(View view, View view2) {
        gfw.b();
        if (view.getParent() == null) {
            this.a.addView(view, -1, -1);
        }
        ((ViewGroup) this.b.q).addView(view2);
    }

    @Override // defpackage.flr
    public final void c(View view, View view2) {
        gfw.b();
        this.a.removeView(view);
        ((ViewGroup) this.b.q).removeView(view2);
    }

    @Override // defpackage.flr
    public final void d(View view) {
        gfw.b();
        NextGenWatchLayout nextGenWatchLayout = this.b;
        if (nextGenWatchLayout.v.contains(view)) {
            nextGenWatchLayout.v.remove(view);
            nextGenWatchLayout.removeView(view);
            nextGenWatchLayout.requestLayout();
        }
    }

    @Override // defpackage.flr
    public final void setAlpha(float f) {
        this.a.setAlpha(f);
        this.b.setAlpha(f);
    }
}
