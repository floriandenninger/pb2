package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opq {
    private final its a;
    private final lkb b;
    private final lkb c;
    private final lkb d;
    private final lkb e;

    public opq(lkb lkbVar, its itsVar, lkb lkbVar2, lkb lkbVar3, lkb lkbVar4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = lkbVar;
        this.a = itsVar;
        this.b = lkbVar2;
        this.c = lkbVar3;
        this.d = lkbVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional a(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return Optional.empty();
        }
        if (paneDescriptor.a == this.c.a) {
            String g = paneDescriptor.g("offline_playlist_top_level_tab_id");
            return Optional.ofNullable(g != null ? g : "FElibrary");
        }
        if (this.b.h(paneDescriptor)) {
            return Optional.of("FElibrary");
        }
        if (this.a.e(paneDescriptor) || paneDescriptor.b.getBoolean("home_pane", false) || this.e.l(paneDescriptor) || this.d.j(paneDescriptor)) {
            aplt apltVar = (aplt) paneDescriptor.e().pX(BrowseEndpointOuterClass.browseEndpoint);
            return Optional.of(!apltVar.j.isEmpty() ? apltVar.j : apltVar.c);
        }
        return Optional.empty();
    }
}
