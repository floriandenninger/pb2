package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jht {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final avgg e;
    public final avgg f;
    public final aqyg g;
    public final Long h;
    public final Long i;
    public final String j;
    public final String k;

    public jht() {
    }

    public jht(String str, String str2, Integer num, String str3, avgg avggVar, avgg avggVar2, aqyg aqygVar, Long l, Long l2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = avggVar;
        this.f = avggVar2;
        this.g = aqygVar;
        this.h = l;
        this.i = l2;
        this.j = str4;
        this.k = str5;
    }

    public static Optional a(aakt aaktVar) {
        if (aaktVar instanceof awil) {
            awjp g = ((awil) aaktVar).g();
            if (g != null) {
                jhs b = b();
                b.f(g.getVideoId());
                b.k(g.getTitle());
                b.g(g.getLengthSeconds().intValue());
                b.j(g.getThumbnail());
                b.l(g.getViewCount().longValue());
                b.i(g.getPublishedTimestampMillis().longValue());
                b.d(g.getFormattedDescription());
                awjm localizedStrings = g.getLocalizedStrings();
                if ((localizedStrings.b & 2) != 0) {
                    b.h(localizedStrings.d);
                }
                if ((localizedStrings.b & 4) != 0) {
                    b.e(localizedStrings.e);
                }
                awic f = g.f();
                if (f != null) {
                    b.c(f.getTitle());
                    b.b(f.getAvatar());
                }
                return Optional.of(b.a());
            }
        } else if (aaktVar instanceof asxs) {
            asxs asxsVar = (asxs) aaktVar;
            jhs b2 = b();
            b2.f(asxsVar.getVideoId());
            b2.k(asxsVar.getTitle());
            b2.g(asxsVar.getLengthSeconds().intValue());
            b2.j(asxsVar.getThumbnail());
            b2.l(asxsVar.getViewCount().longValue());
            b2.i(asxsVar.getPublishedTimestampMillis().longValue());
            b2.d(asxsVar.getFormattedDescription());
            awjm localizedStrings2 = asxsVar.getLocalizedStrings();
            if ((localizedStrings2.b & 2) != 0) {
                b2.h(localizedStrings2.d);
            }
            if ((localizedStrings2.b & 4) != 0) {
                b2.e(localizedStrings2.e);
            }
            awic f2 = asxsVar.f();
            if (f2 != null) {
                b2.c(f2.getTitle());
                b2.b(f2.getAvatar());
            }
            return Optional.of(b2.a());
        }
        return Optional.empty();
    }

    private static jhs b() {
        jhs jhsVar = new jhs();
        jhsVar.h("");
        jhsVar.e("");
        jhsVar.c("");
        jhsVar.b(avgg.a);
        return jhsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jht) {
            jht jhtVar = (jht) obj;
            if (this.a.equals(jhtVar.a) && this.b.equals(jhtVar.b) && this.c.equals(jhtVar.c) && this.d.equals(jhtVar.d) && this.e.equals(jhtVar.e) && this.f.equals(jhtVar.f) && this.g.equals(jhtVar.g) && this.h.equals(jhtVar.h) && this.i.equals(jhtVar.i) && this.j.equals(jhtVar.j) && this.k.equals(jhtVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(valueOf4).length();
        int length8 = String.valueOf(valueOf5).length();
        int length9 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 192 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("MainDownloadedVideo{id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", lengthSeconds=");
        sb.append(valueOf);
        sb.append(", channelTitle=");
        sb.append(str3);
        sb.append(", channelThumbnailDetails=");
        sb.append(valueOf2);
        sb.append(", thumbnailDetails=");
        sb.append(valueOf3);
        sb.append(", description=");
        sb.append(valueOf4);
        sb.append(", publishedTimestampMs=");
        sb.append(valueOf5);
        sb.append(", viewCount=");
        sb.append(valueOf6);
        sb.append(", likeCountText=");
        sb.append(str4);
        sb.append(", dislikeCountText=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
