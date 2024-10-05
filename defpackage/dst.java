package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dst implements Iterator, j$.util.Iterator {
    private final boolean a;
    private final List b;
    private int c;
    private int d;

    public dst(List list, int i, int i2, boolean z) {
        this.b = new ArrayList(list);
        this.c = z ? i - 1 : i + 1;
        this.d = i2;
        this.a = z;
    }

    private final void b() {
        this.c = this.a ? this.c - 1 : this.c + 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized dqx next() {
        if (!hasNext()) {
            return null;
        }
        dqx dqxVar = (dqx) this.b.get(this.c);
        b();
        this.d--;
        return dqxVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i;
        while (this.d > 0 && (i = this.c) >= 0 && i < this.b.size()) {
            dqx dqxVar = (dqx) this.b.get(this.c);
            if (dqxVar.d().j() && !dqxVar.q()) {
                return true;
            }
            b();
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
    }
}
