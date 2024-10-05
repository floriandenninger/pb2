package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsy extends ajpc {
    private final ajop a;
    private final ViewGroup b;
    private final ajos c;
    private final FrameLayout.LayoutParams d;
    private ajom e;

    public fsy(Context context, gma gmaVar, ajos ajosVar) {
        this.a = gmaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.c = ajosVar;
        gmaVar.c(frameLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.d = layoutParams;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.a).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.removeAllViews();
        ajom ajomVar = this.e;
        if (ajomVar == null) {
            return;
        }
        ajosVar.b(ajomVar.a());
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        Object fswVar;
        atdn atdnVar = (atdn) obj;
        atdo atdoVar = atdnVar.g;
        if (atdoVar == null) {
            atdoVar = atdo.a;
        }
        int cm = anaf.cm(atdoVar.c);
        if (cm == 0) {
            cm = 1;
        }
        int i = cm - 1;
        if (i == 2) {
            fswVar = new fsw(atdnVar);
        } else if (i == 4) {
            fswVar = new fsu(atdnVar);
        } else {
            fswVar = new fsv(atdnVar);
        }
        ajom r = ahbw.r(this.c, fswVar, null);
        this.e = r;
        if (r == null) {
            return;
        }
        ahbw.x(r.a(), this.e, this.c.c(fswVar));
        this.e.oB(ajokVar, fswVar);
        View a = this.e.a();
        this.b.removeAllViews();
        this.b.addView(a);
        this.a.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atdn) obj).i.I();
    }
}
