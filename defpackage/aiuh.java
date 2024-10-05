package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.AutoValue_SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuh {
    public String a;
    public CharSequence b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Integer g;
    private String h;
    private Boolean i;
    private String j;
    private String k;
    private Boolean l;

    public final SubtitleTrack a() {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4 = this.c;
        if (str4 == null || (str = this.d) == null || (str2 = this.e) == null || (str3 = this.f) == null || (num = this.g) == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" languageCode");
            }
            if (this.d == null) {
                sb.append(" languageName");
            }
            if (this.e == null) {
                sb.append(" trackName");
            }
            if (this.f == null) {
                sb.append(" videoId");
            }
            if (this.g == null) {
                sb.append(" format");
            }
            if (this.h == null) {
                sb.append(" trackId");
            }
            if (this.i == null) {
                sb.append(" isForOffline");
            }
            if (this.j == null) {
                sb.append(" vssId");
            }
            if (this.k == null) {
                sb.append(" url");
            }
            if (this.l == null) {
                sb.append(" isForcedTrack");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_SubtitleTrack(str4, str, str2, str3, num.intValue(), this.h, this.i.booleanValue(), this.a, this.j, this.k, this.b, this.l.booleanValue());
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageCode");
        }
        this.c = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageName");
        }
        this.d = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null trackId");
        }
        this.h = str;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null trackName");
        }
        this.e = str;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.k = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.f = str;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null vssId");
        }
        this.j = str;
    }
}
