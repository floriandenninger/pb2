package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balz extends bajp implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final bajr b;

    private balz(bajr bajrVar) {
        this.b = bajrVar;
    }

    public static synchronized balz j(bajr bajrVar) {
        balz balzVar;
        synchronized (balz.class) {
            HashMap hashMap = a;
            if (hashMap == null) {
                a = new HashMap(7);
                balzVar = null;
            } else {
                balzVar = (balz) hashMap.get(bajrVar);
            }
            if (balzVar != null) {
                return balzVar;
            }
            balz balzVar2 = new balz(bajrVar);
            a.put(bajrVar, balzVar2);
            return balzVar2;
        }
    }

    private final UnsupportedOperationException k() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    private Object readResolve() {
        return j(this.b);
    }

    @Override // defpackage.bajp
    public final int a(long j, long j2) {
        throw k();
    }

    @Override // defpackage.bajp
    public final long b(long j, int i) {
        throw k();
    }

    @Override // defpackage.bajp
    public final long c(long j, long j2) {
        throw k();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.bajp
    public final long d(long j, long j2) {
        throw k();
    }

    @Override // defpackage.bajp
    public final long e() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof balz)) {
            return false;
        }
        balz balzVar = (balz) obj;
        balzVar.i();
        return balzVar.i().equals(i());
    }

    @Override // defpackage.bajp
    public final bajr f() {
        return this.b;
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bajp
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return i().hashCode();
    }

    public final String i() {
        return this.b.m;
    }

    public final String toString() {
        String i = i();
        StringBuilder sb = new StringBuilder(i.length() + 26);
        sb.append("UnsupportedDurationField[");
        sb.append(i);
        sb.append(']');
        return sb.toString();
    }
}
