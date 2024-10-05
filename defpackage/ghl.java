package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ghl implements gjd {
    private final azqw a = azqy.ap().av();
    private final aadw b;

    public ghl(aadw aadwVar) {
        this.b = aadwVar;
    }

    public final aypy a() {
        return this.a.U();
    }

    @Override // defpackage.gjd
    public final void aJ(gjf gjfVar) {
        PaneDescriptor paneDescriptor;
        avui avuiVar = this.b.b().s;
        if (avuiVar == null) {
            avuiVar = avui.a;
        }
        if (!avuiVar.h || (paneDescriptor = gjfVar.b) == null || paneDescriptor.e() == null || !paneDescriptor.e().pY(BrowseEndpointOuterClass.browseEndpoint)) {
            return;
        }
        this.a.c(((aplt) paneDescriptor.e().pX(BrowseEndpointOuterClass.browseEndpoint)).c);
    }
}
