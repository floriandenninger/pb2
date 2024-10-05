package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aax extends aaz implements Iterator {
    final /* synthetic */ aba a;
    private aaw b;
    private boolean c = true;

    public aax(aba abaVar) {
        this.a = abaVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        aaw aawVar;
        if (this.c) {
            this.c = false;
            aawVar = this.a.b;
        } else {
            aaw aawVar2 = this.b;
            aawVar = aawVar2 != null ? aawVar2.c : null;
        }
        this.b = aawVar;
        return this.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        aaw aawVar = this.b;
        return (aawVar == null || aawVar.c == null) ? false : true;
    }

    @Override // defpackage.aaz
    public final void jF(aaw aawVar) {
        aaw aawVar2 = this.b;
        if (aawVar == aawVar2) {
            aaw aawVar3 = aawVar2.d;
            this.b = aawVar3;
            this.c = aawVar3 == null;
        }
    }
}
