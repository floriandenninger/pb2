package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvv extends amvd implements Serializable {
    private static final long serialVersionUID = 0;
    final amvd a;

    public amvv(amvd amvdVar) {
        this.a = amvdVar;
    }

    @Override // defpackage.amvd
    public final amvd a() {
        return this.a;
    }

    @Override // defpackage.amvd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amvv) {
            return this.a.equals(((amvv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
