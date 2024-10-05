package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qy implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ qz a;
    private final MenuItem.OnMenuItemClickListener b;

    public qy(qz qzVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = qzVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
