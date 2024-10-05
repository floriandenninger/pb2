package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amqp implements Iterable {
    private final ammv a;

    /* JADX INFO: Access modifiers changed from: protected */
    public amqp() {
        this.a = amlr.a;
    }

    public amqp(Iterable iterable) {
        this.a = ammv.j(iterable);
    }

    public static amqp b(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new amqo(iterableArr);
    }

    public static amqp d(Iterable iterable) {
        if (iterable instanceof amqp) {
            return (amqp) iterable;
        }
        return new amqm(iterable, iterable);
    }

    public static amqp e(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    public final ammv a() {
        Iterator it = h().iterator();
        return it.hasNext() ? ammv.j(it.next()) : amlr.a;
    }

    public final amqp c(ammy ammyVar) {
        return d(amkq.bg(h(), ammyVar));
    }

    public final amqp f(amml ammlVar) {
        return d(amkq.bh(h(), ammlVar));
    }

    public final amru g() {
        return amru.n(h());
    }

    public final Iterable h() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        Iterator it = h().iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
