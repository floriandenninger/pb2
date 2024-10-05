package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qv extends qu implements ActionProvider.VisibilityListener {
    private qs c;

    public qv(ActionProvider actionProvider) {
        super(actionProvider);
    }

    @Override // defpackage.id
    public final View b(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    @Override // defpackage.id
    public final boolean e() {
        return this.b.isVisible();
    }

    @Override // defpackage.id
    public final boolean g() {
        return this.b.overridesItemVisibility();
    }

    @Override // defpackage.id
    public final void h(qs qsVar) {
        this.c = qsVar;
        this.b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        qs qsVar = this.c;
        if (qsVar != null) {
            qsVar.a.j.C();
        }
    }
}
