package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class olv implements gim {
    private final /* synthetic */ int c;
    public static final /* synthetic */ olv b = new olv(1);
    public static final /* synthetic */ olv a = new olv(0);

    private /* synthetic */ olv(int i) {
        this.c = i;
    }

    @Override // defpackage.gim
    public final PaneDescriptor a(apxf apxfVar) {
        if (this.c != 0) {
            return PaneDescriptor.c(eru.class, apxfVar, PaneDescriptor.a());
        }
        apxfVar.getClass();
        amkq.E(apxfVar.pY(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint));
        String str = ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apxfVar.pX(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b;
        Bundle a2 = PaneDescriptor.a();
        a2.putString("playlist_id", str);
        return PaneDescriptor.c(ixc.class, apxfVar, a2);
    }
}
