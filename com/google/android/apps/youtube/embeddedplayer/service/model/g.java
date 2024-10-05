package com.google.android.apps.youtube.embeddedplayer.service.model;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g {
    public String a;
    private Integer b;
    private Long c;
    private Long d;
    private Float e;

    public final PlaybackEventData a() {
        Integer num = this.b;
        if (num == null || this.c == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" eventType");
            }
            if (this.c == null) {
                sb.append(" timestampMillis");
            }
            if (this.d == null) {
                sb.append(" durationMillis");
            }
            if (this.e == null) {
                sb.append(" aspectRatio");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_PlaybackEventData(num.intValue(), this.a, this.c.longValue(), this.d.longValue(), this.e.floatValue());
    }

    public final void b(float f) {
        this.e = Float.valueOf(f);
    }

    public final void c(long j) {
        this.d = Long.valueOf(j);
    }

    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void e(long j) {
        this.c = Long.valueOf(j);
    }
}
