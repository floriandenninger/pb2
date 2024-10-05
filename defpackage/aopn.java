package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopn implements Iterator, j$.util.Iterator {
    private final ArrayDeque a;
    private aomc b;

    public aopn(aomf aomfVar) {
        if (aomfVar instanceof aopp) {
            aopp aoppVar = (aopp) aomfVar;
            ArrayDeque arrayDeque = new ArrayDeque(aoppVar.g);
            this.a = arrayDeque;
            arrayDeque.push(aoppVar);
            this.b = b(aoppVar.e);
            return;
        }
        this.a = null;
        this.b = (aomc) aomfVar;
    }

    private final aomc b(aomf aomfVar) {
        while (aomfVar instanceof aopp) {
            aopp aoppVar = (aopp) aomfVar;
            this.a.push(aoppVar);
            int[] iArr = aopp.a;
            aomfVar = aoppVar.e;
        }
        return (aomc) aomfVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aomc next() {
        aomc aomcVar;
        aomc aomcVar2 = this.b;
        if (aomcVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            aomcVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            aopp aoppVar = (aopp) this.a.pop();
            int[] iArr = aopp.a;
            aomcVar = b(aoppVar.f);
        } while (aomcVar.H());
        this.b = aomcVar;
        return aomcVar2;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
