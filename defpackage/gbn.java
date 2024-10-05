package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gbn implements gbj {
    final ayqw a = new ayqw();
    private final Context b;
    private final FrameLayout c;
    private final sqq d;

    public gbn(FrameLayout frameLayout, Context context, sqq sqqVar) {
        this.b = context;
        this.c = frameLayout;
        this.d = sqqVar;
    }

    @Override // defpackage.gbj
    public final /* synthetic */ View a(gbi gbiVar, gat gatVar) {
        gbm gbmVar = (gbm) gbiVar;
        b();
        awos awosVar = gbmVar.a;
        acra acraVar = gbmVar.b;
        dkp dkpVar = new dkp(this.b);
        if (awosVar != null) {
            dhe dheVar = dkpVar.t;
            sqq sqqVar = this.d;
            sxb a = sxc.a();
            a.a = dkpVar;
            a.f(false);
            dho c = ComponentTree.c(dkpVar.t, sqqVar.a(dheVar, a.a(), awosVar.toByteArray(), acraVar != null ? ajgg.w(acraVar) : null, this.a));
            c.d = false;
            dkpVar.G(c.a());
            dkpVar.setBackgroundColor(wbs.Q(this.b, R.attr.ytBrandBackgroundSolid));
        }
        this.c.removeAllViews();
        this.c.addView(dkpVar);
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.c();
    }
}
