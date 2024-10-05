package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjn {
    public static final xjn a = b().a();
    public final ammv b;
    public final ammv c;
    public final aomf d;
    public final amru e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public xjn() {
    }

    public xjn(ammv ammvVar, ammv ammvVar2, aomf aomfVar, amru amruVar, int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = ammvVar;
        this.c = ammvVar2;
        this.d = aomfVar;
        this.e = amruVar;
        this.k = i;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static xjm b() {
        xjm xjmVar = new xjm(null);
        xjmVar.f(amlr.a);
        xjmVar.e(amlr.a);
        xjmVar.h(aomf.b);
        xjmVar.j(amru.q());
        xjmVar.k(1);
        xjmVar.c(-1L);
        xjmVar.b(false);
        xjmVar.d(false);
        xjmVar.g(false);
        xjmVar.i(false);
        return xjmVar;
    }

    public final xjm a() {
        xjm b = b();
        b.f(this.b);
        b.e(this.c);
        b.h(this.d);
        b.j(this.e);
        b.k(this.k);
        b.c(this.f);
        b.b(this.g);
        b.d(this.h);
        b.g(this.i);
        b.i(this.j);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjn) {
            xjn xjnVar = (xjn) obj;
            if (this.b.equals(xjnVar.b) && this.c.equals(xjnVar.c) && this.d.equals(xjnVar.d) && amkq.aV(this.e, xjnVar.e)) {
                int i = this.k;
                int i2 = xjnVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f == xjnVar.f && this.g == xjnVar.g && this.h == xjnVar.h && this.i == xjnVar.i && this.j == xjnVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        long j = this.f;
        return ((((((((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int i = this.k;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        long j = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 224 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + num.length());
        sb.append("AdCtaOverlayState{renderer=");
        sb.append(valueOf);
        sb.append(", onClickedRenderer=");
        sb.append(valueOf2);
        sb.append(", trackingParams=");
        sb.append(valueOf3);
        sb.append(", visualStateChangeTriggers=");
        sb.append(valueOf4);
        sb.append(", visualState=");
        sb.append(num);
        sb.append(", currentPositionMillis=");
        sb.append(j);
        sb.append(", animate=");
        sb.append(z);
        sb.append(", fullscreen=");
        sb.append(z2);
        sb.append(", shownLogged=");
        sb.append(z3);
        sb.append(", visualChanged=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
