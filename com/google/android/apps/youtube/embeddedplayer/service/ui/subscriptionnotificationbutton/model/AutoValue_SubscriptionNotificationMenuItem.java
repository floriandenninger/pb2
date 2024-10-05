package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_SubscriptionNotificationMenuItem extends SubscriptionNotificationMenuItem {
    public final boolean a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final aomf f;

    public AutoValue_SubscriptionNotificationMenuItem(int i, boolean z, int i2, String str, String str2, aomf aomfVar) {
        this.b = i;
        this.a = z;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final aomf c() {
        return this.f;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SubscriptionNotificationMenuItem) {
            SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem) obj;
            if (this.b == subscriptionNotificationMenuItem.b() && this.a == subscriptionNotificationMenuItem.f() && this.c == subscriptionNotificationMenuItem.a() && ((str = this.d) != null ? str.equals(subscriptionNotificationMenuItem.e()) : subscriptionNotificationMenuItem.e() == null) && ((str2 = this.e) != null ? str2.equals(subscriptionNotificationMenuItem.d()) : subscriptionNotificationMenuItem.d() == null) && this.f.equals(subscriptionNotificationMenuItem.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem
    public final boolean f() {
        return this.a;
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.a;
        int i2 = this.c;
        String str = this.d;
        String str2 = this.e;
        String valueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 139 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("SubscriptionNotificationMenuItem{stateId=");
        sb.append(i);
        sb.append(", isDisabled=");
        sb.append(z);
        sb.append(", iconType=");
        sb.append(i2);
        sb.append(", label=");
        sb.append(str);
        sb.append(", accessibilityLabel=");
        sb.append(str2);
        sb.append(", trackingParams=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (((((this.b ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        return ((hashCode ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f.hashCode();
    }
}
