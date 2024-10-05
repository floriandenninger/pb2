package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swe implements sxi {
    private final Set b = new HashSet();

    @Override // defpackage.sxi
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dbs) it.next()).c();
        }
        this.b.clear();
    }

    @Override // defpackage.sxi
    public final void b(Context context, aoam aoamVar, aoam aoamVar2, aoam aoamVar3, int i, int i2, spc spcVar, syd sydVar) {
        con q = sgf.q(context, aoamVar, aoamVar2, aoamVar3, i, i2);
        if (q != null) {
            swd swdVar = new swd(aoamVar, spcVar, i, i2, sgf.o(aoamVar.Y()), sydVar);
            q.q(swdVar);
            dbs dbsVar = swdVar.c;
            if (dbsVar == null) {
                sydVar.b(23, "Unexpected null requester");
            } else {
                this.b.add(dbsVar);
            }
        }
    }
}
