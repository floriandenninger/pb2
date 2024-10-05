package defpackage;

import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nm implements qo {
    final /* synthetic */ no a;

    public nm(no noVar) {
        this.a = noVar;
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
        no noVar = this.a;
        if (noVar.c != null) {
            if (noVar.a.y()) {
                this.a.c.onPanelClosed(108, qqVar);
            } else if (this.a.c.onPreparePanel(0, null, qqVar)) {
                this.a.c.onMenuOpened(108, qqVar);
            }
        }
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        return false;
    }
}
