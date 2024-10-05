package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    private Integer b;
    private Integer c;
    private aomf d;

    public final SubscriptionNotificationButtonData a() {
        Integer num = this.b;
        if (num == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" stateId");
            }
            if (this.c == null) {
                sb.append(" iconType");
            }
            if (this.d == null) {
                sb.append(" trackingParams");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_SubscriptionNotificationButtonData(num.intValue(), this.c.intValue(), this.a, this.d);
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void d(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.d = aomfVar;
    }
}
