package j$.util;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public enum Comparators$NaturalOrderComparator implements Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return Comparator$CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public Comparator reversed() {
        return Comparator$CC.reverseOrder();
    }
}
