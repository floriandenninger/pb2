package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjs {
    public final int a;
    public final boolean b;
    public final xcf c;

    public xjs() {
    }

    public xjs(int i, boolean z, xcf xcfVar) {
        this.a = i;
        this.b = z;
        this.c = xcfVar;
    }

    public static xjr b() {
        xjr xjrVar = new xjr();
        xjrVar.d(-1);
        xjrVar.c(false);
        xjrVar.b(xcf.a);
        return xjrVar;
    }

    public final xjr a() {
        xjr b = b();
        b.d(this.a);
        b.c(this.b);
        b.b(this.c);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjs) {
            xjs xjsVar = (xjs) obj;
            if (this.a == xjsVar.a && this.b == xjsVar.b && this.c.equals(xjsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("AdProgressTextState{timeRemainingMillis=");
        sb.append(i);
        sb.append(", showAdChoices=");
        sb.append(z);
        sb.append(", adCountMetadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
