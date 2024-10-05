package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adld {
    public SubtitleTrack a;
    public String b;
    public String c;
    public byte[] d;
    private String e;
    private Long f;
    private String g;
    private Integer h;
    private Boolean i;

    public adld() {
    }

    public adld(adle adleVar) {
        this.e = adleVar.b;
        this.f = Long.valueOf(adleVar.c);
        this.a = adleVar.d;
        this.g = adleVar.e;
        this.h = Integer.valueOf(adleVar.f);
        this.b = adleVar.g;
        this.c = adleVar.h;
        this.i = Boolean.valueOf(adleVar.i);
        this.d = adleVar.j;
    }

    public final adle a() {
        Optional of;
        Long l;
        String str = this.e;
        if (!(str == null ? Optional.empty() : Optional.of(str)).isPresent()) {
            f("");
        }
        String str2 = this.g;
        if (str2 == null) {
            of = Optional.empty();
        } else {
            of = Optional.of(str2);
        }
        if (!of.isPresent()) {
            d("");
        }
        Integer num = this.h;
        if (num == null) {
            throw new IllegalStateException("Property \"playlistIndex\" has not been set");
        }
        if (num.intValue() < 0) {
            e(-1);
        }
        String str3 = this.e;
        if (str3 == null || (l = this.f) == null || this.g == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.e == null) {
                sb.append(" videoId");
            }
            if (this.f == null) {
                sb.append(" currentPositionMillis");
            }
            if (this.g == null) {
                sb.append(" playlistId");
            }
            if (this.h == null) {
                sb.append(" playlistIndex");
            }
            if (this.i == null) {
                sb.append(" forceReloadPlayback");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adle(str3, l.longValue(), this.a, this.g, this.h.intValue(), this.b, this.c, this.i.booleanValue(), this.d);
    }

    public final void b(long j) {
        this.f = Long.valueOf(j);
    }

    public final void c(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null playlistId");
        }
        this.g = str;
    }

    public final void e(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.e = str;
    }
}
