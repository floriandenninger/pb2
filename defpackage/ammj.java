package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ammj extends ammk implements Serializable {
    private static final long serialVersionUID = 0;
    final ammk a;

    public ammj(ammk ammkVar) {
        this.a = ammkVar;
    }

    @Override // defpackage.ammk
    protected final Object a(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ammk
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ammk
    public final Object c(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.ammk
    public final Object d(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.amml
    public final boolean equals(Object obj) {
        if (obj instanceof ammj) {
            return this.a.equals(((ammj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-1);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
