package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import defpackage.aomf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_SubscriptionNotificationButtonData extends SubscriptionNotificationButtonData {
    private final int b;
    private final int c;
    private final String d;
    private final aomf e;

    public AutoValue_SubscriptionNotificationButtonData(int i, int i2, String str, aomf aomfVar) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData
    public final aomf c() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SubscriptionNotificationButtonData) {
            SubscriptionNotificationButtonData subscriptionNotificationButtonData = (SubscriptionNotificationButtonData) obj;
            if (this.b == subscriptionNotificationButtonData.b() && this.c == subscriptionNotificationButtonData.a() && ((str = this.d) != null ? str.equals(subscriptionNotificationButtonData.d()) : subscriptionNotificationButtonData.d() == null) && this.e.equals(subscriptionNotificationButtonData.c())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + String.valueOf(valueOf).length());
        sb.append("SubscriptionNotificationButtonData{stateId=");
        sb.append(i);
        sb.append(", iconType=");
        sb.append(i2);
        sb.append(", accessibilityText=");
        sb.append(str);
        sb.append(", trackingParams=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        return ((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode();
    }
}
