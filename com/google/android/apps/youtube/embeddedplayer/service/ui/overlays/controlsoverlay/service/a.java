package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import defpackage.aiew;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e a;
    private final /* synthetic */ int b;

    public /* synthetic */ a(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar, int i) {
        this.b = i;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = this.a;
                eVar.b(aiew.PLAYER_CONTROL);
                eVar.a.n();
                eVar.j = false;
                return;
            case 1:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar2 = this.a;
                eVar2.a.c();
                eVar2.j = false;
                return;
            case 2:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar3 = this.a;
                eVar3.b(aiew.PLAYER_CONTROL);
                eVar3.a.o();
                eVar3.j = false;
                return;
            case 3:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar4 = this.a;
                eVar4.b(aiew.PLAYER_CONTROL);
                eVar4.a.q();
                eVar4.j = false;
                return;
            case 4:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar5 = this.a;
                eVar5.a.v();
                eVar5.j = false;
                return;
            case 5:
                this.a.f.g();
                return;
            case 6:
                this.a.h.j();
                return;
            case 7:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar6 = this.a;
                eVar6.a.d();
                eVar6.j = false;
                return;
            case 8:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar7 = this.a;
                eVar7.b(aiew.NAVIGATION);
                eVar7.d.a();
                eVar7.j = false;
                return;
            case 9:
                this.a.j = true;
                return;
            case 10:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar8 = this.a;
                eVar8.a.e();
                eVar8.j = false;
                return;
            case 11:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar9 = this.a;
                eVar9.b(aiew.PLAYER_CONTROL);
                eVar9.a.f();
                eVar9.j = false;
                return;
            case 12:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar10 = this.a;
                eVar10.a.k();
                eVar10.j = false;
                return;
            case 13:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar11 = this.a;
                eVar11.b(aiew.NAVIGATION);
                eVar11.d.b();
                eVar11.j = false;
                return;
            case 14:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar12 = this.a;
                eVar12.b(aiew.PLAYER_CONTROL);
                eVar12.a.l();
                eVar12.j = false;
                return;
            default:
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar13 = this.a;
                eVar13.b(aiew.PLAYER_CONTROL);
                eVar13.a.m();
                eVar13.j = false;
                return;
        }
    }
}
