package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import defpackage.aadw;
import defpackage.gev;
import defpackage.gew;
import defpackage.gmg;
import defpackage.gmh;
import defpackage.lo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActiveStateScrollSelectionController extends ScrollSelectionController {
    public gmg a;
    private final aadw d;
    private final lo e = new gev(this);

    public ActiveStateScrollSelectionController(aadw aadwVar) {
        this.d = aadwVar;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController
    protected final gmh g(gmg gmgVar) {
        return new gew(this.c, gmgVar, this.d);
    }

    public final void h(gmg gmgVar) {
        if (this.a != gmgVar) {
            i(gmgVar);
        }
    }

    @Override // com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController
    public final void i(gmg gmgVar) {
        gmg gmgVar2 = this.a;
        if (gmgVar == gmgVar2) {
            return;
        }
        if (gmgVar2 != null && gmgVar2.l() != null) {
            this.a.l().aF(this.e);
        }
        if (gmgVar != null && gmgVar.l() != null) {
            gmgVar.l().aD(this.e);
        }
        this.a = gmgVar;
        super.i(gmgVar);
    }
}
