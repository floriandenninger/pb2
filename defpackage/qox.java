package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qox {
    private final int a;
    private final qnw b;
    private final qnu c;
    private final String d;

    public qox(qnw qnwVar, qnu qnuVar, String str) {
        this.b = qnwVar;
        this.c = qnuVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qnwVar, qnuVar, str});
    }

    public final String a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qox)) {
            return false;
        }
        qox qoxVar = (qox) obj;
        return qar.j(this.b, qoxVar.b) && qar.j(this.c, qoxVar.c) && qar.j(this.d, qoxVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
