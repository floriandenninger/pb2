package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.graphics.Bitmap;
import android.os.IInterface;
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
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface c extends IInterface {
    void A(SubscriptionNotificationButtonData subscriptionNotificationButtonData);

    void B(SubscriptionNotificationMenuData subscriptionNotificationMenuData);

    void C(boolean z);

    void D(Map map);

    void E(long j, long j2, long j3, long j4);

    void F(VideoDetails videoDetails);

    void G(VideoQuality[] videoQualityArr, int i, boolean z);

    void H(WatchLaterButtonData watchLaterButtonData);

    void I();

    void J(List list);

    void K();

    void L(int i, KeyEvent keyEvent);

    void M(int i, KeyEvent keyEvent);

    void a();

    void f();

    void g();

    void h(boolean z);

    void i(Bitmap bitmap);

    void j(f fVar);

    void k(ControlsState controlsState);

    void l(String str, boolean z);

    void m(PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, boolean z);

    void n(boolean z);

    void o(boolean z);

    void p(boolean z);

    void q(boolean z);

    void r(boolean z);

    void s(boolean z);

    void t(String str);

    void u(boolean z);

    void v(boolean z);

    void w(SubtitleTrack subtitleTrack);

    void x(boolean z);

    void y(ControlsOverlayStyle controlsOverlayStyle);

    void z(SubscribeButtonData subscribeButtonData);
}
