package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqt {
    public Boolean a;
    public ammv b;
    private vqv c;
    private vqr d;
    private axpg e;
    private Integer f;
    private Integer g;
    private vqu h;

    public vqt() {
    }

    public vqt(byte[] bArr) {
        this.b = amlr.a;
    }

    public final vqw a() {
        vqr vqrVar;
        Boolean bool;
        vqv vqvVar = this.c;
        if (vqvVar == null || (vqrVar = this.d) == null || (bool = this.a) == null || this.e == null || this.f == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" kind");
            }
            if (this.d == null) {
                sb.append(" fragmentStartMode");
            }
            if (this.a == null) {
                sb.append(" enabled");
            }
            if (this.e == null) {
                sb.append(" fragmentLazy");
            }
            if (this.f == null) {
                sb.append(" tabNameRes");
            }
            if (this.g == null) {
                sb.append(" visualElementId");
            }
            if (this.h == null) {
                sb.append(" iconApplier");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new vqw(vqvVar, vqrVar, bool.booleanValue(), this.e, this.f.intValue(), this.g.intValue(), this.h, this.b);
    }

    public final void b(axpg axpgVar) {
        if (axpgVar == null) {
            throw new NullPointerException("Null fragmentLazy");
        }
        this.e = axpgVar;
    }

    public final void c(vqr vqrVar) {
        if (vqrVar == null) {
            throw new NullPointerException("Null fragmentStartMode");
        }
        this.d = vqrVar;
    }

    public final void d(vqu vquVar) {
        if (vquVar == null) {
            throw new NullPointerException("Null iconApplier");
        }
        this.h = vquVar;
    }

    public final void e(vqv vqvVar) {
        if (vqvVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.c = vqvVar;
    }

    public final void f(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.g = Integer.valueOf(i);
    }
}
