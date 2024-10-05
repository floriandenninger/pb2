package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amrr extends amru {
    private final transient amru a;

    public amrr(amru amruVar) {
        this.a = amruVar;
    }

    private final int F(int i) {
        return (size() - 1) - i;
    }

    private final int G(int i) {
        return size() - i;
    }

    @Override // defpackage.amru
    public final amru a() {
        return this.a;
    }

    @Override // defpackage.amru
    /* renamed from: c */
    public final amru subList(int i, int i2) {
        amkq.M(i, i2, size());
        return this.a.subList(G(i2), G(i)).a();
    }

    @Override // defpackage.amru, defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        amkq.V(i, size());
        return this.a.get(F(i));
    }

    @Override // defpackage.amru, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return F(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.amru, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return F(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amru, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
