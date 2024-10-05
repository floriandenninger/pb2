package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amrt extends amru {
    final transient int a;
    final transient int b;
    final /* synthetic */ amru c;

    public amrt(amru amruVar, int i, int i2) {
        this.c = amruVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.amru
    /* renamed from: c */
    public final amru subList(int i, int i2) {
        amkq.M(i, i2, this.b);
        amru amruVar = this.c;
        int i3 = this.a;
        return amruVar.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.amrl
    public final int d() {
        return this.c.e() + this.a + this.b;
    }

    @Override // defpackage.amrl
    public final int e() {
        return this.c.e() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        amkq.V(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // defpackage.amrl
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.amru, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
