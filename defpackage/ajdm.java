package defpackage;

import com.google.protos.youtube.api.innertube.DismissDialogEndpointOuterClass$DismissDialogEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdm implements aaha {
    private final ajdh a;

    public ajdm(ajdh ajdhVar) {
        this.a = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        DismissDialogEndpointOuterClass$DismissDialogEndpoint dismissDialogEndpointOuterClass$DismissDialogEndpoint = (DismissDialogEndpointOuterClass$DismissDialogEndpoint) apxfVar.pX(DismissDialogEndpointOuterClass$DismissDialogEndpoint.dismissDialogEndpoint);
        if ((dismissDialogEndpointOuterClass$DismissDialogEndpoint.b & 1) == 0) {
            this.a.c();
            return;
        }
        ajdh ajdhVar = this.a;
        String str = dismissDialogEndpointOuterClass$DismissDialogEndpoint.c;
        yjk.f();
        Iterator it = ajdhVar.a.e(str).iterator();
        while (it.hasNext()) {
            ((ajdg) it.next()).lP();
        }
    }
}
