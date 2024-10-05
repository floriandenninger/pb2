package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajmw implements ajol {
    private final List a = new ArrayList();

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajol) it.next()).a(ajokVar, ajngVar, i);
        }
    }

    public final void b(ajol ajolVar) {
        ajolVar.getClass();
        this.a.add(ajolVar);
    }
}
