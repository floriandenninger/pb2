package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mv implements po {
    final /* synthetic */ ne a;
    private final po b;

    public mv(ne neVar, po poVar) {
        this.a = neVar;
        this.b = poVar;
    }

    @Override // defpackage.po
    public final void a(pp ppVar) {
        this.b.a(ppVar);
        ne neVar = this.a;
        if (neVar.l != null) {
            neVar.e.getDecorView().removeCallbacks(this.a.m);
        }
        ne neVar2 = this.a;
        if (neVar2.k != null) {
            neVar2.N();
            ne neVar3 = this.a;
            ka q = jw.q(neVar3.k);
            q.c(0.0f);
            neVar3.n = q;
            this.a.n.f(new mu(this));
        }
        ne neVar4 = this.a;
        mm mmVar = neVar4.f;
        if (mmVar != null) {
            mmVar.onSupportActionModeFinished(neVar4.j);
        }
        ne neVar5 = this.a;
        neVar5.j = null;
        jw.K(neVar5.p);
    }

    @Override // defpackage.po
    public final boolean b(pp ppVar, MenuItem menuItem) {
        return this.b.b(ppVar, menuItem);
    }

    @Override // defpackage.po
    public final boolean c(pp ppVar, Menu menu) {
        return this.b.c(ppVar, menu);
    }

    @Override // defpackage.po
    public final boolean d(pp ppVar, Menu menu) {
        jw.K(this.a.p);
        return this.b.d(ppVar, menu);
    }
}
