package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aay extends aaz implements Iterator {
    aaw a;
    aaw b;

    public aay(aaw aawVar, aaw aawVar2) {
        this.a = aawVar2;
        this.b = aawVar;
    }

    private final aaw d() {
        aaw aawVar = this.b;
        aaw aawVar2 = this.a;
        if (aawVar == aawVar2 || aawVar2 == null) {
            return null;
        }
        return b(aawVar);
    }

    public abstract aaw a(aaw aawVar);

    public abstract aaw b(aaw aawVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        aaw aawVar = this.b;
        this.b = d();
        return aawVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.aaz
    public final void jF(aaw aawVar) {
        if (this.a == aawVar && aawVar == this.b) {
            this.b = null;
            this.a = null;
        }
        aaw aawVar2 = this.a;
        if (aawVar2 == aawVar) {
            this.a = a(aawVar2);
        }
        if (this.b == aawVar) {
            this.b = d();
        }
    }
}
