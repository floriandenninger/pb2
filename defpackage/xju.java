package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xju {
    public final apmg a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xju() {
    }

    public xju(apmg apmgVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = apmgVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static xjt b() {
        xjt xjtVar = new xjt();
        xjtVar.f(apmg.a);
        xjtVar.d(false);
        xjtVar.e(false);
        xjtVar.b(false);
        xjtVar.c(false);
        return xjtVar;
    }

    public final xjt a() {
        xjt b = b();
        b.f(this.a);
        b.d(this.b);
        b.e(this.c);
        b.b(this.d);
        b.c(this.e);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xju) {
            xju xjuVar = (xju) obj;
            if (this.a.equals(xjuVar.a) && this.b == xjuVar.b && this.c == xjuVar.c && this.d == xjuVar.d && this.e == xjuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 111);
        sb.append("AdReEngagementState{renderer=");
        sb.append(valueOf);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", fullscreen=");
        sb.append(z2);
        sb.append(", annotationEnabled=");
        sb.append(z3);
        sb.append(", appPromoEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
