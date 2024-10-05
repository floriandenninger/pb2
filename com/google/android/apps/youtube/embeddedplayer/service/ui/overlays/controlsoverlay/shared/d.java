package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void A(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void B() {
        pp(21, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void a() {
        pp(10, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void f() {
        pp(12, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void g() {
        pp(7, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void h() {
        pp(24, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void i() {
        pp(2, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void j() {
        pp(1, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void k() {
        pp(17, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void l() {
        pp(8, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void m() {
        pp(5, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void n() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void o() {
        pp(15, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void p() {
        pp(14, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void q() {
        pp(3, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void r(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void s() {
        pp(23, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void t() {
        pp(22, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void u() {
        pp(11, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void v() {
        pp(19, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void w(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        Parcel pn = pn();
        ecr.g(pn, subscriptionNotificationMenuItem);
        pp(20, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void x() {
        pp(18, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void y(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(13, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void z(SubtitleTrack subtitleTrack) {
        Parcel pn = pn();
        ecr.g(pn, subtitleTrack);
        pp(16, pn);
    }
}
