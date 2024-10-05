package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampi extends amvd implements Serializable {
    private static final long serialVersionUID = 0;
    final amml a;
    final amvd b;

    public ampi(amml ammlVar, amvd amvdVar) {
        this.a = ammlVar;
        this.b = amvdVar;
    }

    @Override // defpackage.amvd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.apply(obj), this.a.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ampi) {
            ampi ampiVar = (ampi) obj;
            if (this.a.equals(ampiVar.a) && this.b.equals(ampiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
