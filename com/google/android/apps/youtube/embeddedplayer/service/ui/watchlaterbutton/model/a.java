package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.AutoValue_SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    public String b;
    private Integer c;
    private aomf d;

    public final WatchLaterButtonData a() {
        Integer num = this.c;
        if (num == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" state");
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
        return new AutoValue_WatchLaterButtonData(num.intValue(), this.a, this.b, this.d);
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.d = aomfVar;
    }

    public final SubscribeButtonData d() {
        Integer num = this.c;
        if (num == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" state");
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
        return new AutoValue_SubscribeButtonData(num.intValue(), this.a, this.b, this.d);
    }

    public final void e(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void f(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.d = aomfVar;
    }
}
