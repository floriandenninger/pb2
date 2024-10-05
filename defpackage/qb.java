package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qb extends un {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.un
    public final ri a() {
        rv rvVar;
        qc qcVar = this.a.d;
        if (qcVar == null || (rvVar = qcVar.a.l) == null) {
            return null;
        }
        return rvVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.un
    public final boolean b() {
        ri a;
        ActionMenuItemView actionMenuItemView = this.a;
        qp qpVar = actionMenuItemView.c;
        return qpVar != null && qpVar.b(actionMenuItemView.b) && (a = a()) != null && a.u();
    }
}
