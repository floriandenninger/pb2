package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class balk extends bajh {
    public final bajj g;

    /* JADX INFO: Access modifiers changed from: protected */
    public balk(bajj bajjVar) {
        if (bajjVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.g = bajjVar;
    }

    @Override // defpackage.bajh
    public abstract int a(long j);

    @Override // defpackage.bajh
    public int b(Locale locale) {
        int c = c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    @Override // defpackage.bajh
    public abstract int c();

    @Override // defpackage.bajh
    public long e(long j, int i) {
        return p().b(j, i);
    }

    @Override // defpackage.bajh
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.bajh
    public abstract long g(long j);

    @Override // defpackage.bajh
    public abstract long h(long j, int i);

    @Override // defpackage.bajh
    public long i(long j, String str, Locale locale) {
        return h(j, sv(str, locale));
    }

    @Override // defpackage.bajh
    public String j(int i, Locale locale) {
        return l(i, locale);
    }

    @Override // defpackage.bajh
    public String k(long j, Locale locale) {
        return j(a(j), locale);
    }

    @Override // defpackage.bajh
    public String l(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.bajh
    public String m(long j, Locale locale) {
        return l(a(j), locale);
    }

    @Override // defpackage.bajh
    public final String n() {
        return this.g.z;
    }

    @Override // defpackage.bajh
    public final bajj o() {
        return this.g;
    }

    @Override // defpackage.bajh
    public abstract bajp p();

    @Override // defpackage.bajh
    public bajp q() {
        return null;
    }

    @Override // defpackage.bajh
    public boolean s(long j) {
        return false;
    }

    protected int sv(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new bajs(this.g, str);
        }
    }

    @Override // defpackage.bajh
    public final boolean t() {
        return true;
    }

    public final String toString() {
        String n = n();
        StringBuilder sb = new StringBuilder(n.length() + 15);
        sb.append("DateTimeField[");
        sb.append(n);
        sb.append(']');
        return sb.toString();
    }

    public int u(long j) {
        return c();
    }
}
