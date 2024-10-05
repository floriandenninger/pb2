package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvb extends amvd implements Serializable {
    public static final amvb a = new amvb();
    private static final long serialVersionUID = 0;

    private amvb() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amvd
    public final amvd a() {
        return amvu.a;
    }

    @Override // defpackage.amvd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
