package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
class qu extends id {
    final ActionProvider b;

    public qu(ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // defpackage.id
    public final View a() {
        return this.b.onCreateActionView();
    }

    @Override // defpackage.id
    public final void c(SubMenu subMenu) {
        this.b.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.id
    public final boolean d() {
        return this.b.hasSubMenu();
    }

    @Override // defpackage.id
    public final boolean f() {
        return this.b.onPerformDefaultAction();
    }
}
