package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class r extends ecp implements t {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final String a(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        Parcel po = po(14, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void f(PermissionsWrapper permissionsWrapper) {
        Parcel pn = pn();
        ecr.g(pn, permissionsWrapper);
        pp(16, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void g(CommandWrapper commandWrapper) {
        Parcel pn = pn();
        ecr.g(pn, commandWrapper);
        pp(17, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void h(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void i(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void j(PlayabilityStatusWrapper playabilityStatusWrapper) {
        Parcel pn = pn();
        ecr.g(pn, playabilityStatusWrapper);
        pp(13, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void k(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(12, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void l(SubscribeButtonData subscribeButtonData) {
        Parcel pn = pn();
        ecr.g(pn, subscribeButtonData);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void m(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        Parcel pn = pn();
        ecr.g(pn, subscriptionNotificationButtonData);
        pp(8, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void n(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        Parcel pn = pn();
        ecr.g(pn, subscriptionNotificationMenuData);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void o(CharSequence charSequence) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void p(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(10, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void q(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void r(CharSequence charSequence) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void s(VideoDetails videoDetails) {
        Parcel pn = pn();
        ecr.g(pn, videoDetails);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void t(WatchLaterButtonData watchLaterButtonData) {
        Parcel pn = pn();
        ecr.g(pn, watchLaterButtonData);
        pp(11, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final boolean u() {
        Parcel po = po(15, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }
}
