package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csx implements ctd {
    public final boolean a;
    public final ctd b;
    private final boolean c;
    private final cqi d;
    private int e;
    private boolean f;
    private final csr g;

    public csx(ctd ctdVar, boolean z, boolean z2, cqi cqiVar, csr csrVar) {
        did.ap(ctdVar);
        this.b = ctdVar;
        this.a = z;
        this.c = z2;
        this.d = cqiVar;
        did.ap(csrVar);
        this.g = csrVar;
    }

    @Override // defpackage.ctd
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ctd
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.ctd
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.ctd
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (!this.f) {
            this.f = true;
            if (this.c) {
                this.b.e();
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            this.g.c(this.d, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.a;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.d);
        int i = this.e;
        boolean z2 = this.f;
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        sb = new StringBuilder(length + 107 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(z);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", key=");
        sb.append(valueOf2);
        sb.append(", acquired=");
        sb.append(i);
        sb.append(", isRecycled=");
        sb.append(z2);
        sb.append(", resource=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
