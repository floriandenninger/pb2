package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amth extends amqp {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ammy b;

    public amth(Iterable iterable, ammy ammyVar) {
        this.a = iterable;
        this.b = ammyVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return amkq.aY(this.a.iterator(), this.b);
    }
}
