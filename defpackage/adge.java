package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adge {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final adgd g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final String o;
    public final String p;
    public final long q;
    public final int r;

    public adge() {
    }

    public adge(int i, int i2, int i3, int i4, int i5, int i6, adgd adgdVar, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i8, String str, String str2, long j, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = adgdVar;
        this.h = i7;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = i8;
        this.o = str;
        this.p = str2;
        this.q = j;
        this.r = i9;
    }

    public static adgc a() {
        adgc adgcVar = new adgc();
        adgcVar.m(adgd.BROWSE);
        adgcVar.g(0);
        adgcVar.h(false);
        adgcVar.i(false);
        adgcVar.o(false);
        adgcVar.n(false);
        adgcVar.q(false);
        adgcVar.p(0);
        adgcVar.j(0);
        adgcVar.l(0);
        adgcVar.k(0);
        adgcVar.b(0);
        adgcVar.d(0);
        adgcVar.c(0);
        adgcVar.a = null;
        adgcVar.b = null;
        adgcVar.f(0L);
        adgcVar.e(0);
        return adgcVar;
    }

    public final adgc b() {
        return new adgc(this);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adge) {
            adge adgeVar = (adge) obj;
            if (this.a == adgeVar.a && this.b == adgeVar.b && this.c == adgeVar.c && this.d == adgeVar.d && this.e == adgeVar.e && this.f == adgeVar.f && this.g.equals(adgeVar.g) && this.h == adgeVar.h && this.i == adgeVar.i && this.j == adgeVar.j && this.k == adgeVar.k && this.l == adgeVar.l && this.m == adgeVar.m && this.n == adgeVar.n && ((str = this.o) != null ? str.equals(adgeVar.o) : adgeVar.o == null) && ((str2 = this.p) != null ? str2.equals(adgeVar.p) : adgeVar.p == null) && this.q == adgeVar.q && this.r == adgeVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n) * 1000003;
        String str = this.o;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.p;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.q;
        return ((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.r;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        String valueOf = String.valueOf(this.g);
        int i7 = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        int i8 = this.n;
        String str = this.o;
        String str2 = this.p;
        long j = this.q;
        int i9 = this.r;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 503 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("MdxUserContext{mdxConnectionCountDay=");
        sb.append(i);
        sb.append(", mdxConnectionCountWeek=");
        sb.append(i2);
        sb.append(", mdxConnectionCountMonth=");
        sb.append(i3);
        sb.append(", castAvailableSessionCountDay=");
        sb.append(i4);
        sb.append(", castAvailableSessionCountWeek=");
        sb.append(i5);
        sb.append(", castAvailableSessionCountMonth=");
        sb.append(i6);
        sb.append(", pageType=");
        sb.append(valueOf);
        sb.append(", currentVideoDuration=");
        sb.append(i7);
        sb.append(", fullScreen=");
        sb.append(z);
        sb.append(", hd=");
        sb.append(z2);
        sb.append(", sd=");
        sb.append(z3);
        sb.append(", playlistPlayback=");
        sb.append(z4);
        sb.append(", videoControlsVisible=");
        sb.append(z5);
        sb.append(", uncastedVideoCount=");
        sb.append(i8);
        sb.append(", videoId=");
        sb.append(str);
        sb.append(", playlistId=");
        sb.append(str2);
        sb.append(", currentTime=");
        sb.append(j);
        sb.append(", casterCategory=");
        sb.append(i9);
        sb.append("}");
        return sb.toString();
    }
}
