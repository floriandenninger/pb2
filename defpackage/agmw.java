package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmw implements agmx {
    private aaku a;

    public agmw(aaku aakuVar) {
        aakuVar.getClass();
        this.a = aakuVar;
    }

    @Override // defpackage.agmx
    public final synchronized int a(String str) {
        return b(str, 0);
    }

    @Override // defpackage.agmx
    public final synchronized int b(String str, int i) {
        String c = this.a.c(str);
        if (c == null) {
            return i;
        }
        try {
            return Integer.parseInt(c);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // defpackage.agmx
    public final synchronized long c(String str) {
        return d(str, 0L);
    }

    @Override // defpackage.agmx
    public final synchronized long d(String str, long j) {
        String c = this.a.c(str);
        if (c == null) {
            return j;
        }
        try {
            return Long.parseLong(c);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public final synchronized aaku e() {
        return this.a;
    }

    @Override // defpackage.agmx
    public final synchronized String f(String str) {
        return o(str);
    }

    @Override // defpackage.agmx
    public final synchronized void g(String str, boolean z) {
        awxk e = this.a.e();
        e.t(str, Boolean.toString(z));
        this.a = e.s();
    }

    @Override // defpackage.agmx
    public final synchronized void h(String str, byte[] bArr) {
        throw null;
    }

    @Override // defpackage.agmx
    public final synchronized void i(String str, int i) {
        awxk e = this.a.e();
        e.t(str, Integer.toString(i));
        this.a = e.s();
    }

    @Override // defpackage.agmx
    public final synchronized void j(String str, long j) {
        awxk e = this.a.e();
        e.t(str, Long.toString(j));
        this.a = e.s();
    }

    @Override // defpackage.agmx
    public final synchronized void k(String str, String str2) {
        throw null;
    }

    @Override // defpackage.agmx
    public final synchronized boolean l(String str) {
        return m(str, false);
    }

    @Override // defpackage.agmx
    public final synchronized boolean m(String str, boolean z) {
        String c = this.a.c(str);
        if (c == null) {
            return z;
        }
        return Boolean.parseBoolean(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmx
    public final synchronized byte[] n(String str) {
        byte[] I;
        aaku aakuVar = this.a;
        if (aakuVar.b.a(str)) {
            try {
                aqud aqudVar = aakuVar.b;
                aomf aomfVar = aomf.b;
                aoot aootVar = aqudVar.b;
                if (aootVar.containsKey(str)) {
                    aomfVar = (aomf) aootVar.get(str);
                }
                I = aomfVar.I();
            } catch (IOException e) {
                throw new IllegalStateException(String.format("You might have accessed value with wrong marshaller for key %s", str), e);
            }
        } else {
            I = null;
        }
        return I;
    }

    public final synchronized String o(String str) {
        if (!this.a.b.a(str)) {
            return null;
        }
        return this.a.c(str);
    }

    @Override // defpackage.agmx
    public final synchronized void p(double d) {
        awxk e = this.a.e();
        e.t("bytes_per_sec", Double.toString(d));
        this.a = e.s();
    }
}
