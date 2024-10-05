package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oef extends oeg {
    final /* synthetic */ NextGenWatchLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oef(NextGenWatchLayout nextGenWatchLayout, oel oelVar, RelativeLayout relativeLayout) {
        super(oelVar, relativeLayout);
        this.a = nextGenWatchLayout;
    }

    @Override // defpackage.oeh, defpackage.oea
    public final View d() {
        return this.a.u;
    }

    @Override // defpackage.oeh, defpackage.oea
    public final boolean g() {
        return this.a.u != null && super.g();
    }

    @Override // defpackage.oeg
    public final Rect h(obp obpVar) {
        Rect r = obpVar.r();
        return new Rect(0, r.top, r.width(), r.bottom);
    }
}
