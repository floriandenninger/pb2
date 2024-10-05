package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oec extends oeg {
    public int a;
    public boolean b;
    public final /* synthetic */ NextGenWatchLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oec(NextGenWatchLayout nextGenWatchLayout, oel oelVar, View view) {
        super(oelVar, view);
        this.c = nextGenWatchLayout;
    }

    @Override // defpackage.oeh, defpackage.oea
    public final View d() {
        return this.c.t;
    }

    @Override // defpackage.oeh, defpackage.oea
    public final boolean g() {
        return this.c.t != null && super.g();
    }

    @Override // defpackage.oeg
    public final Rect h(obp obpVar) {
        int height;
        Rect h = this.c.w.h(obpVar);
        Rect t = obpVar.t();
        if (!this.b || this.a <= 0) {
            if (this.a > t.height()) {
                height = (h.height() + this.a) - t.height();
            } else {
                height = h.height();
            }
        } else {
            height = h.height() + this.a;
        }
        return new Rect(0, this.a, h.width(), height);
    }
}
