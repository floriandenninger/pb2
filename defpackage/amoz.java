package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amoz extends ampd implements Serializable {
    private static final long serialVersionUID = 0;
    public transient amvc a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.a = g();
        for (int i = 0; i < readInt; i++) {
            f(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (amux amuxVar : j()) {
            objectOutputStream.writeObject(amuxVar.a);
            objectOutputStream.writeInt(amuxVar.a());
        }
    }

    @Override // defpackage.amuw
    public final int a(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.ampd
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.ampd, defpackage.amuw
    public final int c(Object obj, int i) {
        amkq.H(true, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.a.c(d);
        if (c > i) {
            this.a.j(d, c - i);
        } else {
            this.a.f(d);
            i = c;
        }
        this.b -= i;
        return c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        amvc amvcVar = this.a;
        amvcVar.d++;
        Arrays.fill(amvcVar.a, 0, amvcVar.c, (Object) null);
        Arrays.fill(amvcVar.b, 0, amvcVar.c, 0);
        Arrays.fill(amvcVar.e, -1);
        Arrays.fill(amvcVar.f, -1L);
        amvcVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.ampd
    public final Iterator d() {
        return new amow(this);
    }

    @Override // defpackage.ampd
    public final Iterator e() {
        return new amox(this);
    }

    @Override // defpackage.ampd, defpackage.amuw
    public final void f(Object obj, int i) {
        if (i == 0) {
            a(obj);
            return;
        }
        amkq.H(i > 0, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            this.a.l(obj, i);
            this.b += i;
            return;
        }
        long j = i;
        long c = this.a.c(d) + j;
        amkq.I(c <= 2147483647L, "too many occurrences: %s", c);
        this.a.j(d, (int) c);
        this.b += j;
    }

    public abstract amvc g();

    @Override // defpackage.ampd, defpackage.amuw
    public final boolean h(Object obj, int i) {
        amkq.t(i, "oldCount");
        amkq.t(0, "newCount");
        int d = this.a.d(obj);
        if (d == -1) {
            return i == 0;
        }
        if (this.a.c(d) != i) {
            return false;
        }
        this.a.f(d);
        this.b -= i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new amva(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amuw
    public final int size() {
        return anaf.ag(this.b);
    }
}
