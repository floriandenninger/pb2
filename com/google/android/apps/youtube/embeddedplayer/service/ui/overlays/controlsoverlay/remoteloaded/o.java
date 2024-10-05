package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b;
    private final /* synthetic */ int c;

    public /* synthetic */ o(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar, boolean z, int i) {
        this.c = i;
        this.b = bVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = this.b;
                bVar.a.r(this.a);
                return;
            case 1:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar2 = this.b;
                bVar2.b.e(this.a);
                return;
            case 2:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar3 = this.b;
                bVar3.b.g(this.a);
                return;
            case 3:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar4 = this.b;
                bVar4.d.ne(this.a);
                return;
            case 4:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar5 = this.b;
                bVar5.d.b(this.a);
                return;
            case 5:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar6 = this.b;
                bVar6.j.pt(this.a);
                return;
            case 6:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar7 = this.b;
                bVar7.a.s(this.a);
                return;
            case 7:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar8 = this.b;
                bVar8.e.p(this.a);
                return;
            case 8:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar9 = this.b;
                bVar9.a.i(this.a);
                return;
            case 9:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar10 = this.b;
                bVar10.a.nK(this.a);
                return;
            default:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar11 = this.b;
                bVar11.c.m(this.a);
                return;
        }
    }
}
