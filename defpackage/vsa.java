package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsa implements Iterator, j$.util.Iterator, vxp {
    private final int[] a;
    private final int b;
    private int c;

    public vsa(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    @Override // defpackage.vxm
    public final void b(long j, long j2) {
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public vsa(int[] iArr, int i, int i2) {
        iArr.getClass();
        this.a = iArr;
        int length = iArr.length;
        vcp.h(i, length);
        this.c = i;
        int i3 = i + i2;
        vcp.h(i3, length);
        this.b = i3;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer next() {
        if (hasNext()) {
            int[] iArr = this.a;
            int i = this.c;
            this.c = i + 1;
            return Integer.valueOf(iArr[i]);
        }
        throw new NoSuchElementException();
    }
}
