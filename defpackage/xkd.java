package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkd {
    public final auve a;
    public final xki b;
    public final xcf c;
    public final int d;
    public final boolean e;
    public final float f;
    public final int g;
    public final int h;
    public final xfn i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final int o;

    public xkd() {
    }

    public xkd(auve auveVar, xki xkiVar, xcf xcfVar, int i, boolean z, float f, int i2, int i3, xfn xfnVar, boolean z2, boolean z3, boolean z4, boolean z5, float f2, int i4) {
        this.a = auveVar;
        this.b = xkiVar;
        this.c = xcfVar;
        this.d = i;
        this.e = z;
        this.f = f;
        this.g = i2;
        this.h = i3;
        this.i = xfnVar;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = f2;
        this.o = i4;
    }

    public static xkc b() {
        xkc xkcVar = new xkc();
        xkcVar.l(auve.a);
        xkcVar.d(xki.a);
        xkcVar.b(xcf.a);
        xkcVar.m(3);
        xkcVar.i(false);
        xkcVar.n(0.0f);
        xkcVar.p(-1);
        xkcVar.o(-1);
        xkcVar.c(xfn.PRE_ROLL);
        xkcVar.g(false);
        xkcVar.h(false);
        xkcVar.f(false);
        xkcVar.e(false);
        xkcVar.k(0.0f);
        xkcVar.j(0);
        return xkcVar;
    }

    public final xkc a() {
        xkc b = b();
        b.l(this.a);
        b.d(this.b);
        b.b(this.c);
        b.m(this.d);
        b.i(this.e);
        b.n(this.f);
        b.p(this.g);
        b.o(this.h);
        b.c(this.i);
        b.g(this.j);
        b.h(this.k);
        b.f(this.l);
        b.e(this.m);
        b.k(this.n);
        b.j(this.o);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xkd) {
            xkd xkdVar = (xkd) obj;
            if (this.a.equals(xkdVar.a) && this.b.equals(xkdVar.b) && this.c.equals(xkdVar.c) && this.d == xkdVar.d && this.e == xkdVar.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(xkdVar.f) && this.g == xkdVar.g && this.h == xkdVar.h && this.i.equals(xkdVar.i) && this.j == xkdVar.j && this.k == xkdVar.k && this.l == xkdVar.l && this.m == xkdVar.m && Float.floatToIntBits(this.n) == Float.floatToIntBits(xkdVar.n) && this.o == xkdVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.n)) * 1000003) ^ this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        boolean z = this.e;
        float f = this.f;
        int i2 = this.g;
        int i3 = this.h;
        String valueOf4 = String.valueOf(this.i);
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        float f2 = this.n;
        int i4 = this.o;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 402 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SkipButtonState{skipAdRenderer=");
        sb.append(valueOf);
        sb.append(", contentMetadata=");
        sb.append(valueOf2);
        sb.append(", adCountMetadata=");
        sb.append(valueOf3);
        sb.append(", skipState=");
        sb.append(i);
        sb.append(", hidden=");
        sb.append(z);
        sb.append(", swipeToSkipProgress=");
        sb.append(f);
        sb.append(", timeRemainingUntilSkippableMillis=");
        sb.append(i2);
        sb.append(", timeRemainingInAdMillis=");
        sb.append(i3);
        sb.append(", breakType=");
        sb.append(valueOf4);
        sb.append(", DRCtaEnabled=");
        sb.append(z2);
        sb.append(", fullscreen=");
        sb.append(z3);
        sb.append(", countdownOnThumbnail=");
        sb.append(z4);
        sb.append(", countdownNextToThumbnail=");
        sb.append(z5);
        sb.append(", preskipScalingFactor=");
        sb.append(f2);
        sb.append(", preskipPadding=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
