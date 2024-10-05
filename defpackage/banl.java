package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banl extends bajn {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final bajn f;
    private final bank[] g;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public banl(bajn bajnVar) {
        super(bajnVar.c);
        this.g = new bank[e + 1];
        this.f = bajnVar;
    }

    private final bank o(long j) {
        int i = (int) (j >> 32);
        bank[] bankVarArr = this.g;
        int i2 = e & i;
        bank bankVar = bankVarArr[i2];
        if (bankVar != null && ((int) (bankVar.a >> 32)) == i) {
            return bankVar;
        }
        long j2 = j & (-4294967296L);
        bank bankVar2 = new bank(this.f, j2);
        long j3 = 4294967295L | j2;
        bank bankVar3 = bankVar2;
        while (true) {
            long e2 = this.f.e(j2);
            if (e2 == j2 || e2 > j3) {
                break;
            }
            bank bankVar4 = new bank(this.f, e2);
            bankVar3.c = bankVar4;
            bankVar3 = bankVar4;
            j2 = e2;
        }
        bankVarArr[i2] = bankVar2;
        return bankVar2;
    }

    @Override // defpackage.bajn
    public final int a(long j) {
        return o(j).a(j);
    }

    @Override // defpackage.bajn
    public final int c(long j) {
        return o(j).b(j);
    }

    @Override // defpackage.bajn
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.bajn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof banl) {
            return this.f.equals(((banl) obj).f);
        }
        return false;
    }

    @Override // defpackage.bajn
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.bajn
    public final String g(long j) {
        return o(j).c(j);
    }

    @Override // defpackage.bajn
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.bajn
    public final boolean l() {
        return false;
    }
}
