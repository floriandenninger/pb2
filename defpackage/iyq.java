package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyq {
    private final fjs a;
    private final its b;
    private final rxm c;
    private final lkb d;
    private final lkb e;

    public iyq(rxm rxmVar, fjs fjsVar, its itsVar, lkb lkbVar, lkb lkbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = rxmVar;
        this.a = fjsVar;
        this.b = itsVar;
        this.d = lkbVar;
        this.e = lkbVar2;
    }

    public final PaneDescriptor a(apxf apxfVar) {
        PaneFragmentPanelDescriptor b;
        boolean z = false;
        if (this.c.a && this.a.h()) {
            z = true;
        }
        PaneDescriptor a = this.b.a(apxfVar);
        a.l(z);
        PaneFragmentPanelDescriptor b2 = PaneFragmentPanelDescriptor.b(a);
        if (z) {
            b = PaneFragmentPanelDescriptor.b(this.d.e());
        } else {
            aone createBuilder = aplt.a.createBuilder();
            createBuilder.copyOnWrite();
            aplt apltVar = (aplt) createBuilder.instance;
            apltVar.b = 1 | apltVar.b;
            apltVar.c = "FEhistory";
            aplt apltVar2 = (aplt) createBuilder.build();
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
            b = PaneFragmentPanelDescriptor.b(this.b.a((apxf) aongVar.build()));
        }
        lkb lkbVar = this.e;
        Bundle a2 = PaneDescriptor.a();
        a2.putParcelable("panels_configuration", PanelsConfiguration.c(b2, b));
        return PaneDescriptor.c(lkbVar.a, apxfVar, a2);
    }
}
