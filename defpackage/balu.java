package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class balu extends balk {
    final long a;
    private final bajp b;

    public balu(bajj bajjVar, bajp bajpVar) {
        super(bajjVar);
        if (!bajpVar.g()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long e = bajpVar.e();
        this.a = e;
        if (e >= 1) {
            this.b = bajpVar;
            return;
        }
        throw new IllegalArgumentException("The unit milliseconds must be at least 1");
    }

    @Override // defpackage.bajh
    public int d() {
        return 0;
    }

    @Override // defpackage.balk, defpackage.bajh
    public long f(long j) {
        return j >= 0 ? j % this.a : (((j + 1) % r0) + r0) - 1;
    }

    @Override // defpackage.balk, defpackage.bajh
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.balk, defpackage.bajh
    public long h(long j, int i) {
        aynu.A(this, i, d(), v(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp p() {
        return this.b;
    }

    protected int v(long j, int i) {
        return u(j);
    }
}
