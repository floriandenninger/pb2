package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyc implements Iterator {
    final /* synthetic */ dyd a;
    private int b = 0;

    public dyc(dyd dydVar) {
        this.a = dydVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dyn next() {
        if (this.b < this.a.c()) {
            dyd dydVar = this.a;
            int i = this.b;
            this.b = i + 1;
            return dydVar.e(i);
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
