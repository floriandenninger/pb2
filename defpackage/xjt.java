package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjt {
    private apmg a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;

    public final xju a() {
        Boolean bool;
        apmg apmgVar = this.a;
        if (apmgVar == null || (bool = this.b) == null || this.c == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" renderer");
            }
            if (this.b == null) {
                sb.append(" enabled");
            }
            if (this.c == null) {
                sb.append(" fullscreen");
            }
            if (this.d == null) {
                sb.append(" annotationEnabled");
            }
            if (this.e == null) {
                sb.append(" appPromoEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xju(apmgVar, bool.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(apmg apmgVar) {
        if (apmgVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = apmgVar;
    }
}
