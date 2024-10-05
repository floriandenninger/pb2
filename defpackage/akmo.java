package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmo extends AbstractList {
    final List a;
    final int b;

    public akmo(List list, int i) {
        amkq.E(i > 0);
        this.a = list;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.b;
        int i3 = i * i2;
        return this.a.subList(i3, Math.min(i2 + i3, this.a.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        double size = this.a.size();
        double d = this.b;
        Double.isNaN(size);
        Double.isNaN(d);
        return (int) Math.ceil(size / d);
    }
}
