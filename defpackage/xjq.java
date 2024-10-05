package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjq {
    public final boolean a;
    public final boolean b;
    public final xkd c;
    public final xkb d;
    public final xjs e;
    public final xka f;
    public final xjw g;
    public final xju h;
    public final xjy i;
    public final aomf j;
    public final asht k;
    private final int l;
    private final int m;
    private final int n;

    public xjq() {
    }

    public xjq(boolean z, boolean z2, int i, int i2, int i3, xkd xkdVar, xkb xkbVar, xjs xjsVar, xka xkaVar, xjw xjwVar, xju xjuVar, xjy xjyVar, aomf aomfVar, asht ashtVar) {
        this.a = z;
        this.b = z2;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.c = xkdVar;
        this.d = xkbVar;
        this.e = xjsVar;
        this.f = xkaVar;
        this.g = xjwVar;
        this.h = xjuVar;
        this.i = xjyVar;
        this.j = aomfVar;
        this.k = ashtVar;
    }

    public static xjp a() {
        xjp xjpVar = new xjp();
        xjpVar.g(false);
        xjpVar.m(false);
        xjpVar.i(-1);
        xjpVar.h(-1);
        xjpVar.j(-1);
        xjpVar.a = xkd.b().a();
        xjpVar.b = xkb.a().c();
        xjpVar.c = xjs.b().a();
        xjpVar.d = xka.a().a();
        xjpVar.e = xjw.a().a();
        xjpVar.f = xju.b().a();
        xjpVar.g = xjy.b().a();
        xjpVar.n(aomf.b);
        xjpVar.l(asht.a);
        return xjpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjq) {
            xjq xjqVar = (xjq) obj;
            if (this.a == xjqVar.a && this.b == xjqVar.b && this.l == xjqVar.l && this.m == xjqVar.m && this.n == xjqVar.n && this.c.equals(xjqVar.c) && this.d.equals(xjqVar.d) && this.e.equals(xjqVar.e) && this.f.equals(xjqVar.f) && this.g.equals(xjqVar.g) && this.h.equals(xjqVar.h) && this.i.equals(xjqVar.i) && this.j.equals(xjqVar.j) && this.k.equals(xjqVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 367 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("AdOverlayState{adOverlayShown=");
        sb.append(z);
        sb.append(", overflowMenuShown=");
        sb.append(z2);
        sb.append(", currentPositionMillis=");
        sb.append(i);
        sb.append(", bufferedPositionMillis=");
        sb.append(i2);
        sb.append(", durationMillis=");
        sb.append(i3);
        sb.append(", skipButtonState=");
        sb.append(valueOf);
        sb.append(", mdxAdOverlayState=");
        sb.append(valueOf2);
        sb.append(", adProgressTextState=");
        sb.append(valueOf3);
        sb.append(", learnMoreOverlayState=");
        sb.append(valueOf4);
        sb.append(", adTitleOverlayState=");
        sb.append(valueOf5);
        sb.append(", adReEngagementState=");
        sb.append(valueOf6);
        sb.append(", brandInteractionState=");
        sb.append(valueOf7);
        sb.append(", overlayTrackingParams=");
        sb.append(valueOf8);
        sb.append(", interactionLoggingClientData=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
