package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjy {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final aplp f;
    public final int g;

    public xjy() {
    }

    public xjy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, aplp aplpVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.g = i;
        this.f = aplpVar;
    }

    public static xjx b() {
        xjx xjxVar = new xjx();
        xjxVar.g(true);
        xjxVar.e(false);
        xjxVar.c(false);
        xjxVar.d(false);
        xjxVar.f(false);
        xjxVar.b(1);
        xjxVar.h(aplp.a);
        return xjxVar;
    }

    public final xjx a() {
        xjx b = b();
        b.g(this.a);
        b.e(this.b);
        b.c(this.c);
        b.d(this.d);
        b.f(this.e);
        b.b(this.g);
        b.h(this.f);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjy) {
            xjy xjyVar = (xjy) obj;
            if (this.a == xjyVar.a && this.b == xjyVar.b && this.c == xjyVar.c && this.d == xjyVar.d && this.e == xjyVar.e) {
                int i = this.g;
                int i2 = xjyVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f.equals(xjyVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003;
        int i2 = this.g;
        if (i2 != 0) {
            return ((i ^ i2) * 1000003) ^ this.f.hashCode();
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DISLIKE" : "LIKE" : "NONE";
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(str.length() + 142 + String.valueOf(valueOf).length());
        sb.append("BrandInteractionState{hidden=");
        sb.append(z);
        sb.append(", enabled=");
        sb.append(z2);
        sb.append(", annotationEnabled=");
        sb.append(z3);
        sb.append(", appPromoEnabled=");
        sb.append(z4);
        sb.append(", fullscreen=");
        sb.append(z5);
        sb.append(", activeButton=");
        sb.append(str);
        sb.append(", renderer=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
