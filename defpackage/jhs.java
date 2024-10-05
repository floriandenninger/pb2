package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhs {
    private String a;
    private String b;
    private Integer c;
    private String d;
    private avgg e;
    private avgg f;
    private aqyg g;
    private Long h;
    private Long i;
    private String j;
    private String k;

    public final jht a() {
        String str;
        Integer num;
        String str2;
        avgg avggVar;
        avgg avggVar2;
        aqyg aqygVar;
        Long l;
        Long l2;
        String str3;
        String str4;
        String str5 = this.a;
        if (str5 == null || (str = this.b) == null || (num = this.c) == null || (str2 = this.d) == null || (avggVar = this.e) == null || (avggVar2 = this.f) == null || (aqygVar = this.g) == null || (l = this.h) == null || (l2 = this.i) == null || (str3 = this.j) == null || (str4 = this.k) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" id");
            }
            if (this.b == null) {
                sb.append(" title");
            }
            if (this.c == null) {
                sb.append(" lengthSeconds");
            }
            if (this.d == null) {
                sb.append(" channelTitle");
            }
            if (this.e == null) {
                sb.append(" channelThumbnailDetails");
            }
            if (this.f == null) {
                sb.append(" thumbnailDetails");
            }
            if (this.g == null) {
                sb.append(" description");
            }
            if (this.h == null) {
                sb.append(" publishedTimestampMs");
            }
            if (this.i == null) {
                sb.append(" viewCount");
            }
            if (this.j == null) {
                sb.append(" likeCountText");
            }
            if (this.k == null) {
                sb.append(" dislikeCountText");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jht(str5, str, num, str2, avggVar, avggVar2, aqygVar, l, l2, str3, str4);
    }

    public final void b(avgg avggVar) {
        if (avggVar == null) {
            throw new NullPointerException("Null channelThumbnailDetails");
        }
        this.e = avggVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null channelTitle");
        }
        this.d = str;
    }

    public final void d(aqyg aqygVar) {
        if (aqygVar == null) {
            throw new NullPointerException("Null description");
        }
        this.g = aqygVar;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null dislikeCountText");
        }
        this.k = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null likeCountText");
        }
        this.j = str;
    }

    public final void i(long j) {
        this.h = Long.valueOf(j);
    }

    public final void j(avgg avggVar) {
        if (avggVar == null) {
            throw new NullPointerException("Null thumbnailDetails");
        }
        this.f = avggVar;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public final void l(long j) {
        this.i = Long.valueOf(j);
    }
}
