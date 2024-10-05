package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sf implements qo {
    final /* synthetic */ ActionMenuView a;

    public sf(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
        qo qoVar = this.a.d;
        if (qoVar != null) {
            qoVar.O(qqVar);
        }
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        yq yqVar;
        yl ylVar = this.a.e;
        return (ylVar == null || (yqVar = ylVar.a.q) == null || !yqVar.a(menuItem)) ? false : true;
    }
}
