package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import defpackage.amru;
import defpackage.hw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubscriptionNotificationButton extends TouchImageView implements View.OnClickListener {
    public i a;
    public d b;
    public g c;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b d;
    public SubscriptionNotificationButtonData e;
    public SubscriptionNotificationMenuData f;

    public SubscriptionNotificationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = i.a;
        this.b = d.v;
        this.c = g.i;
        this.d = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.e = SubscriptionNotificationButtonData.a;
        this.f = SubscriptionNotificationMenuData.a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f.equals(SubscriptionNotificationMenuData.a)) {
            return;
        }
        this.d.a(this.e.c().I());
        this.a.a(this.f, this.e.b(), this, new hw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.a
            @Override // defpackage.hw
            public final void accept(Object obj) {
                SubscriptionNotificationButton subscriptionNotificationButton = SubscriptionNotificationButton.this;
                SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem) obj;
                subscriptionNotificationButton.b.h(subscriptionNotificationMenuItem);
                subscriptionNotificationButton.d.a(subscriptionNotificationMenuItem.c().I());
            }
        });
        amru amruVar = this.f.b;
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            this.d.c(((SubscriptionNotificationMenuItem) amruVar.get(i)).c().I());
        }
    }
}
