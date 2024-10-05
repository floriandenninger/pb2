package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wwn extends ajbh {
    public final Set a;
    private final Set b;
    private final azrw c;
    private final CopyOnWriteArrayList d;

    public wwn(azrw azrwVar, Set set, azrw azrwVar2, CopyOnWriteArrayList copyOnWriteArrayList) {
        super(1);
        ((wsj) azrwVar.get()).a();
        this.b = set;
        this.c = azrwVar2;
        this.d = copyOnWriteArrayList;
        this.a = new HashSet();
    }

    public final void a(wnk wnkVar) {
        yjk.f();
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        wnkVar.getClass();
        copyOnWriteArrayList.add(wnkVar);
    }

    @Override // defpackage.ajbh
    public final void b() {
        yjk.f();
        ((xls) this.c.get()).a();
    }

    @Override // defpackage.ajbh
    public final void c(String str) {
        yjk.f();
        xls xlsVar = (xls) this.c.get();
        yjk.f();
        xlq xlqVar = xlsVar.d;
        if (xlqVar != null) {
            xlqVar.s();
            xlqVar.i();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((woi) it.next()).i();
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((wxb) it2.next()).h();
        }
    }

    public final void d(wnk wnkVar) {
        yjk.f();
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        wnkVar.getClass();
        copyOnWriteArrayList.remove(wnkVar);
    }
}
