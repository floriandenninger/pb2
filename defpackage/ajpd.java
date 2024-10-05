package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajpd extends you implements ajng {
    private final ajmw a;

    public ajpd() {
        super(new ArrayList(), new yot());
        this.a = new ajmw();
    }

    @Override // defpackage.ajng
    public final int a() {
        return size();
    }

    @Override // defpackage.you, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        yjk.f();
        super.add(i, obj);
    }

    @Override // defpackage.you, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        yjk.f();
        return super.addAll(i, collection);
    }

    public long b(int i) {
        return i;
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        return get(i);
    }

    @Override // defpackage.you, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        yjk.f();
        super.clear();
    }

    @Override // defpackage.you, defpackage.yor
    public final void h(int i, int i2) {
        yjk.f();
        yjj.B(i, size() - 1);
        yjj.B(i + i2, size());
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.remove(i);
        }
        this.c.c(i, i2);
    }

    public final void k(Collection collection) {
        collection.addAll(this.b);
    }

    public final void l() {
        this.c.g();
    }

    public /* bridge */ /* synthetic */ void lX(ajnf ajnfVar) {
        super.i(ajnfVar);
    }

    public final void m(ammy ammyVar) {
        yjk.f();
        ammyVar.getClass();
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (ammyVar.a(this.b.get(size))) {
                this.b.remove(size);
                this.c.d(size);
            }
        }
    }

    @Override // defpackage.ajng
    public final void mK(ajol ajolVar) {
        this.a.b(ajolVar);
    }

    @Override // defpackage.ajng
    public final void mL(ajok ajokVar, int i) {
        this.a.a(ajokVar, this, i);
    }

    public final void n(int i, Object obj) {
        yjk.f();
        amkq.E(i < size());
        obj.getClass();
        this.b.set(i, obj);
        this.c.a(i, 1);
    }

    public final void o(Object obj, Object obj2) {
        yjk.f();
        obj.getClass();
        obj2.getClass();
        int indexOf = this.b.indexOf(obj);
        if (indexOf >= 0) {
            n(indexOf, obj2);
        }
    }

    public final void p(Collection collection) {
        yjk.f();
        this.b.clear();
        this.b.addAll(collection);
        l();
    }

    public /* bridge */ /* synthetic */ void pf(ajnf ajnfVar) {
        super.j(ajnfVar);
    }

    @Override // defpackage.you, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        yjk.f();
        return super.remove(i);
    }
}
