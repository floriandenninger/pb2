package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jhj implements jhn {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.jhn
    public final void a(jhm jhmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        jhmVar.getClass();
        copyOnWriteArrayList.add(jhmVar);
    }

    public final void b(jhx jhxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jhxVar.a((jhm) it.next());
        }
    }

    @Override // defpackage.jhn
    public final void c(jhm jhmVar) {
        this.a.remove(jhmVar);
    }
}
