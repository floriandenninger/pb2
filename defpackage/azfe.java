package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfe implements Iterable {
    final ayqb a;
    final int b;

    public azfe(ayqb ayqbVar, int i) {
        this.a = ayqbVar;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        azfd azfdVar = new azfd(this.b);
        this.a.aE(azfdVar);
        return azfdVar;
    }
}
