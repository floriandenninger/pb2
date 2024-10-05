package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amvd implements Comparator {
    public static amvd b(Comparator comparator) {
        if (comparator instanceof amvd) {
            return (amvd) comparator;
        }
        return new amqa(comparator);
    }

    public amvd a() {
        return new amvv(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
