package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigc {
    public acsx a;
    public afkm b;
    private Boolean c;
    private Integer d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private avzr h;
    private Integer i;

    public final aigd a() {
        Boolean bool = this.c;
        if (bool == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" shouldUseQueuedVideoForNavigation");
            }
            if (this.d == null) {
                sb.append(" watchNextResponseProcessingDelay");
            }
            if (this.e == null) {
                sb.append(" watchNextResponseParsingDelay");
            }
            if (this.f == null) {
                sb.append(" shouldPauseOnLastFrame");
            }
            if (this.g == null) {
                sb.append(" mediaSessionDisabled");
            }
            if (this.h == null) {
                sb.append(" initialPlaybackVideoQuality");
            }
            if (this.i == null) {
                sb.append(" initialPlaybackVideoQualityFixedResolution");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aigd(this.a, bool.booleanValue(), this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.b, this.h, this.i.intValue());
    }

    public final void b(avzr avzrVar) {
        if (avzrVar == null) {
            throw new NullPointerException("Null initialPlaybackVideoQuality");
        }
        this.h = avzrVar;
    }

    public final void c(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void g(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }
}
