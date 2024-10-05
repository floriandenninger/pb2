package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aonw extends AbstractList {
    private final List a;
    private final aonv b;

    public aonw(List list, aonv aonvVar) {
        this.a = list;
        this.b = aonvVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.convert(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
