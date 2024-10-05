package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class baln extends ball {
    private static final long serialVersionUID = 8019982251647420015L;
    public final bajp a;

    public baln(bajp bajpVar, bajr bajrVar) {
        super(bajrVar);
        if (bajpVar.h()) {
            this.a = bajpVar;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }

    @Override // defpackage.bajp
    public long b(long j, int i) {
        return this.a.b(j, i);
    }

    @Override // defpackage.bajp
    public long c(long j, long j2) {
        return this.a.c(j, j2);
    }

    @Override // defpackage.bajp
    public long d(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // defpackage.bajp
    public long e() {
        return this.a.e();
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return this.a.g();
    }
}
