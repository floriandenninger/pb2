package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h {
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h[] a;

    public f(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h[] hVarArr) {
        this.a = hVarArr;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pt(boolean z) {
        for (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar : this.a) {
            hVar.pt(z);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pv(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
        for (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar : this.a) {
            hVar.pv(gVar);
        }
    }
}
