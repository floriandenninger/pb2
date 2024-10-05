package defpackage;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojz implements fgp {
    public final fgq a;
    public final azrw b;
    public ViewGroup c;
    public azrw d;
    public final azrr e = azrr.ab();
    public final azrr f = azrr.ab();
    private final oja g;
    private final azrw h;
    private ojb i;

    public ojz(azrw azrwVar, oja ojaVar, fgq fgqVar, azrw azrwVar2) {
        this.g = ojaVar;
        this.a = fgqVar;
        this.h = azrwVar2;
        this.b = azrwVar;
    }

    public static boolean c(fhg fhgVar) {
        return fhgVar == fhg.WATCH_WHILE_MAXIMIZED || fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || fhgVar == fhg.WATCH_WHILE_MINIMIZED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ojb ojbVar = this.i;
        ojb ojbVar2 = ojbVar;
        if (ojbVar == null) {
            ojbVar2 = this.d.get();
        }
        ojb ojbVar3 = this.i;
        if (ojbVar3 != null && ojbVar3 != ojbVar2) {
            CoordinatorLayout coordinatorLayout = ((DefaultWatchPanelViewController) ojbVar3).o;
            if (coordinatorLayout.getParent() != null) {
                this.c.removeView(coordinatorLayout);
                this.i.p(null);
            }
        }
        if (this.i != ojbVar2) {
            this.g.a = ojbVar2;
        }
        CoordinatorLayout coordinatorLayout2 = ((DefaultWatchPanelViewController) ojbVar2).o;
        if (coordinatorLayout2.getParent() == null) {
            this.c.addView(coordinatorLayout2);
        }
        this.i = ojbVar2;
        this.f.sc(ojbVar2);
        oew n = ((ojg) this.h.get()).n();
        if (n != null) {
            ojbVar2.p(n.c);
        }
    }

    public final void b() {
        a();
        oew n = ((ojg) this.h.get()).n();
        if (n != null) {
            n.b.add(new ojx(this));
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (c(fhgVar)) {
            b();
            this.a.j(this);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
