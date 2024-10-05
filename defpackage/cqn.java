package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqn implements cqi {
    private final adz b = new ddd();

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            adz adzVar = this.b;
            if (i >= adzVar.j) {
                return;
            }
            cqm cqmVar = (cqm) adzVar.f(i);
            Object i2 = this.b.i(i);
            cql cqlVar = cqmVar.b;
            if (cqmVar.d == null) {
                cqmVar.d = cqmVar.c.getBytes(cqi.a);
            }
            cqlVar.a(cqmVar.d, i2, messageDigest);
            i++;
        }
    }

    public final Object b(cqm cqmVar) {
        return this.b.containsKey(cqmVar) ? this.b.get(cqmVar) : cqmVar.a;
    }

    public final void c(cqn cqnVar) {
        this.b.k(cqnVar.b);
    }

    public final void d(cqm cqmVar, Object obj) {
        this.b.put(cqmVar, obj);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof cqn) {
            return this.b.equals(((cqn) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Options{values=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
