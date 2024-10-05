package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qx implements MenuItem.OnActionExpandListener {
    final /* synthetic */ qz a;
    private final MenuItem.OnActionExpandListener b;

    public qx(qz qzVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = qzVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
