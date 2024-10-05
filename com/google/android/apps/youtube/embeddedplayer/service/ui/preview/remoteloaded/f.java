package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements e {
    public int d;
    public boolean f;
    public e b = e.a;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b c = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
    public com.google.android.apps.youtube.embeddedplayer.service.model.d e = com.google.android.apps.youtube.embeddedplayer.service.model.d.a;

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.b.B(bVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        this.b.C(videoDetails);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.b.D(aVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        this.b.E(watchLaterButtonData);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final Optional a() {
        return this.b.a();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void b() {
        this.c = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.e = com.google.android.apps.youtube.embeddedplayer.service.model.d.a;
        this.d = 0;
        this.f = false;
        this.b.b();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void c(com.google.android.apps.youtube.embeddedplayer.service.model.d dVar) {
        this.e = dVar;
        this.b.c(dVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void d(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b bVar) {
        this.c = bVar;
        this.b.d(bVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void e(boolean z) {
        this.f = z;
        this.b.e(z);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void f(int i) {
        this.d = i;
        this.b.f(i);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        this.b.n(bitmap);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        this.b.p(z);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.b.t(aVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        this.b.u(subscribeButtonData);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.b.v(dVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        this.b.w(subscriptionNotificationButtonData);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        this.b.x(subscriptionNotificationMenuData);
    }
}
