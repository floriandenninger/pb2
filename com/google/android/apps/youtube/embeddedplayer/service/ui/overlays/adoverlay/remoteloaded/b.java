package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b;
    private final /* synthetic */ int c;

    public /* synthetic */ b(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar, boolean z, int i) {
        this.c = i;
        this.b = bVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = this.b;
            boolean z = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
            if (gVar != null) {
                gVar.x(z);
                return;
            }
            return;
        }
        if (i == 1) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar2 = this.b;
            boolean z2 = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar2 = bVar2.a;
            if (gVar2 != null) {
                gVar2.w(z2);
                return;
            }
            return;
        }
        if (i == 2) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar3 = this.b;
            boolean z3 = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar3 = bVar3.a;
            if (gVar3 != null) {
                gVar3.r(z3);
                return;
            }
            return;
        }
        if (i != 3) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar4 = this.b;
            boolean z4 = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar4 = bVar4.a;
            if (gVar4 != null) {
                gVar4.v(z4);
                return;
            }
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar5 = this.b;
        boolean z5 = this.a;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar5 = bVar5.a;
        if (gVar5 != null) {
            gVar5.u(z5);
        }
    }
}
