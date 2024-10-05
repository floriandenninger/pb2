package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammi implements Iterable {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ammk b;

    public ammi(ammk ammkVar, Iterable iterable) {
        this.b = ammkVar;
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ammh(this);
    }
}
