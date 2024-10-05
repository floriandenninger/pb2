package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rzg implements rzk {
    private final Set a = new HashSet();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        for (rus rusVar : this.a) {
            Iterator it = rusVar.a.o.iterator();
            while (it.hasNext()) {
                ((rzj) it.next()).a(rusVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        for (rus rusVar : this.a) {
            Iterator it = rusVar.a.o.iterator();
            while (it.hasNext()) {
                ((rzj) it.next()).d(rusVar.a);
            }
        }
    }

    @Override // defpackage.rzk
    public final void c(rus rusVar) {
        this.a.add(rusVar);
    }

    @Override // defpackage.rzk
    public final void d(rus rusVar) {
        this.a.remove(rusVar);
    }
}
