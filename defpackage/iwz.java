package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iwz implements afwx {
    public PlaylistEditorFragment$EditorState a;
    final /* synthetic */ ixc b;
    private final PaneDescriptor c;

    public iwz(ixc ixcVar) {
        this(ixcVar, null);
    }

    public iwz(ixc ixcVar, PaneDescriptor paneDescriptor) {
        this.b = ixcVar;
        this.c = paneDescriptor;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        ixc ixcVar = this.b;
        ixcVar.ai.b(ixcVar.d.b(cnqVar), true);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aucn aucnVar;
        arzn arznVar = (arzn) obj;
        this.b.mM().D(new acqx(arznVar.d.I()));
        if ((arznVar.b & 8) != 0) {
            ixc ixcVar = this.b;
            arzo arzoVar = arznVar.e;
            if (arzoVar == null) {
                arzoVar = arzo.a;
            }
            if (arzoVar.b == 78398567) {
                aucnVar = (aucn) arzoVar.c;
            } else {
                aucnVar = aucn.a;
            }
            ixcVar.ah = aucnVar;
            ixc ixcVar2 = this.b;
            ixcVar2.r(ixcVar2.ah, this.a);
        }
        this.b.ai.a();
        PaneDescriptor paneDescriptor = this.c;
        if (paneDescriptor != null) {
            this.b.at.d(paneDescriptor);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
