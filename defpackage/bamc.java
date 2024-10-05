package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamc {
    public final bamw a;
    public final bams b;
    public final bajf c;
    public final bajn d;

    public bamc(bamw bamwVar, bams bamsVar) {
        this.a = bamwVar;
        this.b = bamsVar;
        this.c = null;
        this.d = null;
    }

    public bamc(bamw bamwVar, bams bamsVar, bajf bajfVar, bajn bajnVar) {
        this.a = bamwVar;
        this.b = bamsVar;
        this.c = bajfVar;
        this.d = bajnVar;
    }

    public final String a(baka bakaVar) {
        StringBuffer stringBuffer = new StringBuffer(e().b());
        f(stringBuffer, bajk.b(bakaVar), bajk.e(bakaVar));
        return stringBuffer.toString();
    }

    public final bajf b(bajf bajfVar) {
        bajf d = bajk.d(bajfVar);
        bajf bajfVar2 = this.c;
        if (bajfVar2 != null) {
            d = bajfVar2;
        }
        bajn bajnVar = this.d;
        return bajnVar != null ? d.b(bajnVar) : d;
    }

    public final bamc c(bajn bajnVar) {
        return this.d == bajnVar ? this : new bamc(this.a, this.b, this.c, bajnVar);
    }

    public final bamc d() {
        return c(bajn.a);
    }

    public final bamw e() {
        bamw bamwVar = this.a;
        if (bamwVar != null) {
            return bamwVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final void f(StringBuffer stringBuffer, long j, bajf bajfVar) {
        bamw e = e();
        bajf b = b(bajfVar);
        bajn z = b.z();
        int a = z.a(j);
        long j2 = a;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            z = bajn.a;
            a = 0;
            j3 = j;
        }
        e.d(stringBuffer, j3, b.a(), a, z, null);
    }
}
