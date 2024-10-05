package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class badz implements Iterator, j$.util.Iterator {
    final /* synthetic */ baea a;
    private final int b;
    private int c;
    private boolean d;

    public badz(baea baeaVar) {
        this.a = baeaVar;
        baeaVar.b++;
        this.b = baeaVar.a.size();
    }

    private final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        baea baeaVar = this.a;
        int i = baeaVar.b - 1;
        baeaVar.b = i;
        if (i > 0 || !baeaVar.c) {
            return;
        }
        baeaVar.c = false;
        int size = baeaVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (baeaVar.a.get(size) == null) {
                baeaVar.a.remove(size);
            }
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        while (i < this.b && this.a.a(i) == null) {
            i++;
        }
        if (i < this.b) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.a.a(i) != null) {
                break;
            }
            this.c++;
        }
        int i2 = this.c;
        if (i2 >= this.b) {
            a();
            throw new NoSuchElementException();
        }
        baea baeaVar = this.a;
        this.c = i2 + 1;
        return baeaVar.a(i2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
