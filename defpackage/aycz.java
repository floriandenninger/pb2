package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aycz implements Comparator {
    final /* synthetic */ ayda a;

    public aycz(ayda aydaVar) {
        this.a = aydaVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.a.a(obj);
        this.a.a(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
