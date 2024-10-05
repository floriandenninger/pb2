package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    public String a;
    public String b;
    private Integer c;
    private Boolean d;
    private Integer e;
    private aomf f;

    public final SubscriptionNotificationMenuItem a() {
        Integer num = this.c;
        if (num == null || this.d == null || this.e == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" stateId");
            }
            if (this.d == null) {
                sb.append(" isDisabled");
            }
            if (this.e == null) {
                sb.append(" iconType");
            }
            if (this.f == null) {
                sb.append(" trackingParams");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_SubscriptionNotificationMenuItem(num.intValue(), this.d.booleanValue(), this.e.intValue(), this.a, this.b, this.f);
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void e(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.f = aomfVar;
    }
}
