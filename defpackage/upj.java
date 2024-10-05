package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upj {
    public String a;
    public babg b;
    public String c;
    public Long d;
    public unw e;
    private Boolean f;
    private bact g;
    private Boolean h;

    public final upk a() {
        Boolean bool = this.f;
        if (bool == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" isEventNameConstant");
            }
            if (this.g == null) {
                sb.append(" metric");
            }
            if (this.h == null) {
                sb.append(" isUnsampled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new upk(this.a, bool.booleanValue(), this.g, this.b, this.c, this.d, this.h.booleanValue(), this.e);
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void d(bact bactVar) {
        if (bactVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.g = bactVar;
    }
}
