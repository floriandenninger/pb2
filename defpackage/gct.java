package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gct {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public avcn d;
    public avci e;
    public avbz f;
    public avcb g;
    public CharSequence h;
    public apxf i;
    public String j;
    public gbu k;
    public int l;
    public int m;
    private Integer n;
    private Integer o;

    public gct() {
    }

    public gct(gcu gcuVar) {
        this.a = Boolean.valueOf(gcuVar.a);
        this.b = Boolean.valueOf(gcuVar.b);
        this.c = Boolean.valueOf(gcuVar.c);
        this.n = Integer.valueOf(gcuVar.d);
        this.d = gcuVar.e;
        this.e = gcuVar.f;
        this.f = gcuVar.g;
        this.g = gcuVar.h;
        this.k = gcuVar.m;
        this.h = gcuVar.i;
        this.l = gcuVar.n;
        this.m = gcuVar.o;
        this.o = Integer.valueOf(gcuVar.j);
        this.i = gcuVar.k;
        this.j = gcuVar.l;
    }

    public final gcu a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.n == null || this.d == null || this.l == 0 || this.m == 0 || this.o == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rateLimited");
            }
            if (this.b == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.c == null) {
                sb.append(" counterfactual");
            }
            if (this.n == null) {
                sb.append(" surveyType");
            }
            if (this.d == null) {
                sb.append(" surveySupportedRenderers");
            }
            if (this.l == 0) {
                sb.append(" displayTime");
            }
            if (this.m == 0) {
                sb.append(" displayStart");
            }
            if (this.o == null) {
                sb.append(" displayDelaySec");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gcu(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.n.intValue(), this.d, this.e, this.f, this.g, this.k, this.h, this.l, this.m, this.o.intValue(), this.i, this.j);
    }

    public final void b(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.n = Integer.valueOf(i);
    }
}
