package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amoe extends amxd {
    private Object a;
    private int b = 2;

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.b = 3;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        amkq.N(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            this.a = a();
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.a;
            this.a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
