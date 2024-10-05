package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysa {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Integer h;
    public final String i;
    public final int j;
    public final Integer k;
    public final Integer l;
    public final Collection m;
    public final Exception n;
    public final String o;

    public ysa() {
    }

    public ysa(String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Integer num, String str3, int i, Integer num2, Integer num3, Collection collection, Exception exc, String str4) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = l5;
        this.h = num;
        this.i = str3;
        this.j = i;
        this.k = num2;
        this.l = num3;
        this.m = collection;
        this.n = exc;
        this.o = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        Collection collection;
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysa) {
            ysa ysaVar = (ysa) obj;
            if (this.a.equals(ysaVar.a) && ((str = this.b) != null ? str.equals(ysaVar.b) : ysaVar.b == null) && ((l = this.c) != null ? l.equals(ysaVar.c) : ysaVar.c == null) && ((l2 = this.d) != null ? l2.equals(ysaVar.d) : ysaVar.d == null) && ((l3 = this.e) != null ? l3.equals(ysaVar.e) : ysaVar.e == null) && ((l4 = this.f) != null ? l4.equals(ysaVar.f) : ysaVar.f == null) && ((l5 = this.g) != null ? l5.equals(ysaVar.g) : ysaVar.g == null) && ((num = this.h) != null ? num.equals(ysaVar.h) : ysaVar.h == null) && ((str2 = this.i) != null ? str2.equals(ysaVar.i) : ysaVar.i == null) && this.j == ysaVar.j && ((num2 = this.k) != null ? num2.equals(ysaVar.k) : ysaVar.k == null) && ((num3 = this.l) != null ? num3.equals(ysaVar.l) : ysaVar.l == null) && ((collection = this.m) != null ? collection.equals(ysaVar.m) : ysaVar.m == null) && ((exc = this.n) != null ? exc.equals(ysaVar.n) : ysaVar.n == null)) {
                String str3 = this.o;
                String str4 = ysaVar.o;
                if (str3 != null ? str3.equals(str4) : str4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.c;
        int hashCode3 = (hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.f;
        int hashCode6 = (hashCode5 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        Long l5 = this.g;
        int hashCode7 = (hashCode6 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003;
        Integer num = this.h;
        int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.i;
        int hashCode9 = (((hashCode8 ^ (str2 == null ? 0 : str2.hashCode())) * (-721379959)) ^ this.j) * 1000003;
        Integer num2 = this.k;
        int hashCode10 = (hashCode9 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.l;
        int hashCode11 = (hashCode10 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Collection collection = this.m;
        int hashCode12 = (hashCode11 ^ (collection == null ? 0 : collection.hashCode())) * 1000003;
        Exception exc = this.n;
        int hashCode13 = (hashCode12 ^ (exc == null ? 0 : exc.hashCode())) * 1000003;
        String str3 = this.o;
        return hashCode13 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String str3 = this.i;
        int i = this.j;
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        String str4 = this.o;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(str3).length();
        int length10 = "null".length();
        int length11 = String.valueOf(valueOf7).length();
        int length12 = String.valueOf(valueOf8).length();
        int length13 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 348 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + String.valueOf(valueOf10).length() + String.valueOf(str4).length());
        sb.append("ExecutedHttpRequestInfo{url=");
        sb.append(str);
        sb.append(", responseContentType=");
        sb.append(str2);
        sb.append(", numberBytesDownloaded=");
        sb.append(valueOf);
        sb.append(", numberBytesUploaded=");
        sb.append(valueOf2);
        sb.append(", requestStartTimeMillis=");
        sb.append(valueOf3);
        sb.append(", timeToResponseHeadersMillis=");
        sb.append(valueOf4);
        sb.append(", timeToResponseCompletedMillis=");
        sb.append(valueOf5);
        sb.append(", statusCode=");
        sb.append(valueOf6);
        sb.append(", negotiatedProtocol=");
        sb.append(str3);
        sb.append(", IOException=");
        sb.append("null");
        sb.append(", requestStatus=");
        sb.append(i);
        sb.append(", requestFailedReason=");
        sb.append(valueOf7);
        sb.append(", quicDetailedErrorCode=");
        sb.append(valueOf8);
        sb.append(", annotations=");
        sb.append(valueOf9);
        sb.append(", exception=");
        sb.append(valueOf10);
        sb.append(", requestDebugId=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
