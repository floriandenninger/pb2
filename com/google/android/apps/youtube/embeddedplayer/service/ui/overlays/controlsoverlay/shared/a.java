package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.ecp;
import defpackage.ecr;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void A(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        Parcel pn = pn();
        ecr.g(pn, subscriptionNotificationButtonData);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void B(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        Parcel pn = pn();
        ecr.g(pn, subscriptionNotificationMenuData);
        pp(8, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void C(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(10, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void D(Map map) {
        Parcel pn = pn();
        pn.writeMap(map);
        pp(30, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void E(long j, long j2, long j3, long j4) {
        Parcel pn = pn();
        pn.writeLong(j);
        pn.writeLong(j2);
        pn.writeLong(j3);
        pn.writeLong(j4);
        pp(22, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void F(VideoDetails videoDetails) {
        Parcel pn = pn();
        ecr.g(pn, videoDetails);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void G(VideoQuality[] videoQualityArr, int i, boolean z) {
        Parcel pn = pn();
        pn.writeTypedArray(videoQualityArr, 0);
        pn.writeInt(i);
        ecr.e(pn, z);
        pp(11, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void H(WatchLaterButtonData watchLaterButtonData) {
        Parcel pn = pn();
        ecr.g(pn, watchLaterButtonData);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void I() {
        pp(16, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void J(List list) {
        Parcel pn = pn();
        pn.writeTypedList(list);
        pp(32, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void K() {
        pp(31, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void L(int i, KeyEvent keyEvent) {
        Parcel pn = pn();
        pn.writeInt(i);
        ecr.g(pn, keyEvent);
        Parcel po = po(25, pn);
        ecr.j(po);
        po.recycle();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void M(int i, KeyEvent keyEvent) {
        Parcel pn = pn();
        pn.writeInt(i);
        ecr.g(pn, keyEvent);
        Parcel po = po(26, pn);
        ecr.j(po);
        po.recycle();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void a() {
        pp(17, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void f() {
        pp(24, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void g() {
        pp(23, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void h(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(28, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void i(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void j(f fVar) {
        Parcel pn = pn();
        ecr.i(pn, fVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void k(ControlsState controlsState) {
        Parcel pn = pn();
        ecr.g(pn, controlsState);
        pp(18, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void l(String str, boolean z) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.e(pn, z);
        pp(19, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void m(PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, boolean z) {
        Parcel pn = pn();
        ecr.g(pn, playerErrorMessageRendererWrapper);
        ecr.e(pn, z);
        pp(20, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void n(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(12, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void o(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(27, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void p(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(14, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void q(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(15, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void r(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(35, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void s(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(13, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void t(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pp(34, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void u(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void v(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(21, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void w(SubtitleTrack subtitleTrack) {
        Parcel pn = pn();
        ecr.g(pn, subtitleTrack);
        pp(29, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void x(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(33, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void y(ControlsOverlayStyle controlsOverlayStyle) {
        Parcel pn = pn();
        ecr.g(pn, controlsOverlayStyle);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void z(SubscribeButtonData subscribeButtonData) {
        Parcel pn = pn();
        ecr.g(pn, subscribeButtonData);
        pp(6, pn);
    }
}
