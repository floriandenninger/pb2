package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvu extends amvd implements Serializable {
    public static final amvu a = new amvu();
    private static final long serialVersionUID = 0;

    private amvu() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amvd
    public final amvd a() {
        return amvb.a;
    }

    @Override // defpackage.amvd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
