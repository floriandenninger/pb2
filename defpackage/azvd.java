package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvd implements Iterator, j$.util.Iterator {
    final /* synthetic */ azve a;
    private int b = -1;
    private int c;
    private int d;
    private azuw e;

    public azvd(azve azveVar) {
        this.a = azveVar;
        int e = azuj.e(0, 0, azveVar.a.length());
        this.c = e;
        this.d = e;
    }

    private final void a() {
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        if (i > this.a.a.length()) {
            this.e = new azuw(this.c, azul.h(this.a.a));
            this.d = -1;
        } else {
            azve azveVar = this.a;
            Object invoke = azveVar.b.invoke(azveVar.a, Integer.valueOf(this.d));
            if (invoke != null) {
                azrz azrzVar = (azrz) invoke;
                int intValue = ((Number) azrzVar.a).intValue();
                int intValue2 = ((Number) azrzVar.b).intValue();
                this.e = intValue <= Integer.MIN_VALUE ? azuw.d : new azuw(this.c, intValue - 1);
                int i2 = intValue + intValue2;
                this.c = i2;
                this.d = i2 + (intValue2 == 0 ? 1 : 0);
            } else {
                this.e = new azuw(this.c, azul.h(this.a.a));
                this.d = -1;
            }
        }
        this.b = 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            azuw azuwVar = this.e;
            if (azuwVar != null) {
                this.e = null;
                this.b = -1;
                return azuwVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
