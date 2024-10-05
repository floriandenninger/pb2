package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amti extends amqp {
    final /* synthetic */ Iterable a;
    final /* synthetic */ amml b;

    public amti(Iterable iterable, amml ammlVar) {
        this.a = iterable;
        this.b = ammlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return amkq.bb(this.a.iterator(), this.b);
    }
}
