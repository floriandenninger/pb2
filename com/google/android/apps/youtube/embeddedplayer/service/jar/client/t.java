package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Bitmap;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface t extends IInterface {
    String a(String str);

    void f(PermissionsWrapper permissionsWrapper);

    void g(CommandWrapper commandWrapper);

    void h(Bitmap bitmap);

    void i(boolean z);

    void j(PlayabilityStatusWrapper playabilityStatusWrapper);

    void k(boolean z);

    void l(SubscribeButtonData subscribeButtonData);

    void m(SubscriptionNotificationButtonData subscriptionNotificationButtonData);

    void n(SubscriptionNotificationMenuData subscriptionNotificationMenuData);

    void o(CharSequence charSequence);

    void p(int i);

    void q(Bitmap bitmap);

    void r(CharSequence charSequence);

    void s(VideoDetails videoDetails);

    void t(WatchLaterButtonData watchLaterButtonData);

    boolean u();
}
