package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banr extends bajn {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public banr(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.bajn
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.bajn
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.bajn
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.bajn
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.bajn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof banr) {
            banr banrVar = (banr) obj;
            if (this.c.equals(banrVar.c) && this.g == banrVar.g && this.f == banrVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bajn
    public final long f(long j) {
        return j;
    }

    @Override // defpackage.bajn
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.bajn
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.bajn
    public final boolean l() {
        return true;
    }
}
