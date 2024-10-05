package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbk implements Comparator {
    final /* synthetic */ saw a;

    public sbk(saw sawVar) {
        this.a = sawVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Double d = (Double) this.a.a(obj, -1, null);
        Double d2 = (Double) this.a.a(obj2, -1, null);
        if (d == null && d2 == null) {
            return 0;
        }
        if (d == null) {
            return -1;
        }
        if (d2 == null) {
            return 1;
        }
        return d.compareTo(d2);
    }
}
