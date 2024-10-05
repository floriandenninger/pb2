package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baly extends bajh implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final bajj b;
    private final bajp c;

    private baly(bajj bajjVar, bajp bajpVar) {
        if (bajpVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = bajjVar;
        this.c = bajpVar;
    }

    private Object readResolve() {
        return u(this.b, this.c);
    }

    public static synchronized baly u(bajj bajjVar, bajp bajpVar) {
        synchronized (baly.class) {
            HashMap hashMap = a;
            baly balyVar = null;
            if (hashMap == null) {
                a = new HashMap(7);
            } else {
                baly balyVar2 = (baly) hashMap.get(bajjVar);
                if (balyVar2 == null || balyVar2.c == bajpVar) {
                    balyVar = balyVar2;
                }
            }
            if (balyVar != null) {
                return balyVar;
            }
            baly balyVar3 = new baly(bajjVar, bajpVar);
            a.put(bajjVar, balyVar3);
            return balyVar3;
        }
    }

    private final UnsupportedOperationException v() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.bajh
    public final int a(long j) {
        throw v();
    }

    @Override // defpackage.bajh
    public final int b(Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final int c() {
        throw v();
    }

    @Override // defpackage.bajh
    public final int d() {
        throw v();
    }

    @Override // defpackage.bajh
    public final long e(long j, int i) {
        return this.c.b(j, i);
    }

    @Override // defpackage.bajh
    public final long f(long j) {
        throw v();
    }

    @Override // defpackage.bajh
    public final long g(long j) {
        throw v();
    }

    @Override // defpackage.bajh
    public final long h(long j, int i) {
        throw v();
    }

    @Override // defpackage.bajh
    public final long i(long j, String str, Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final String j(int i, Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final String k(long j, Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final String l(int i, Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final String m(long j, Locale locale) {
        throw v();
    }

    @Override // defpackage.bajh
    public final String n() {
        return this.b.z;
    }

    @Override // defpackage.bajh
    public final bajj o() {
        return this.b;
    }

    @Override // defpackage.bajh
    public final bajp p() {
        return this.c;
    }

    @Override // defpackage.bajh
    public final bajp q() {
        return null;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return null;
    }

    @Override // defpackage.bajh
    public final boolean s(long j) {
        throw v();
    }

    @Override // defpackage.bajh
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }
}
