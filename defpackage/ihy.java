package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihy {
    public int a;
    public final acqz b;
    public final ilp c;
    public View d;
    public AccessibilityManager e;
    public acsc f;
    public boolean g;
    public boolean h;
    public int i = -1;
    private final ilm j;

    public ihy(acqz acqzVar, ilm ilmVar, ilp ilpVar) {
        this.b = acqzVar;
        this.j = ilmVar;
        this.c = ilpVar;
    }

    public final void a() {
        View view = this.d;
        if (view != null) {
            etx.M(view, false);
            c(true);
        }
    }

    public final void b() {
        if (this.d == null || !e()) {
            return;
        }
        a();
        if (this.f == null || this.a != 3) {
            return;
        }
        this.b.mM().I(3, new acqx(this.f), null);
        this.f = null;
    }

    public final void c(boolean z) {
        ilr ilrVar;
        ily aG = this.j.aG();
        if (aG == null || (ilrVar = aG.d) == null) {
            return;
        }
        ilrVar.a(z);
    }

    public final boolean d() {
        return this.d != null && this.g;
    }

    public final boolean e() {
        View view = this.d;
        return view != null && view.getVisibility() == 0;
    }
}
