package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.AutoValue_EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agaj {
    public Integer a;
    public String b;

    public final adma a() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" recoveryState");
            }
            if (this.b == null) {
                sb.append(" screenName");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adma(num.intValue(), this.b);
    }

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null screenName");
        }
        this.b = str;
    }

    public final EmbedsPrewarmData d() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" playbackType");
            }
            if (this.b == null) {
                sb.append(" videoId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_EmbedsPrewarmData(num.intValue(), this.b);
    }

    public final void e(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.b = str;
    }
}
