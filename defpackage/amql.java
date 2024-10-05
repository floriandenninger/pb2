package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amql extends amqu implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    private amql(int i) {
        amkq.H(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static amql a(int i) {
        return new amql(i);
    }

    @Override // defpackage.amqq, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.amqq, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return amkq.bd(this, collection.iterator());
        }
        clear();
        int i = size - this.a;
        collection.getClass();
        amkq.F(i >= 0, "number to skip cannot be negative");
        return amkq.bl(this, new amtk(collection, i));
    }

    @Override // defpackage.amqu, defpackage.amqq
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.amqu
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.amqq, defpackage.amqt
    protected final /* synthetic */ Object g() {
        return this.b;
    }

    @Override // defpackage.amqu, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
