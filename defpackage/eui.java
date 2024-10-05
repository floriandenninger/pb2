package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eui implements fxi {
    final /* synthetic */ eul a;

    public eui(eul eulVar) {
        this.a = eulVar;
    }

    @Override // defpackage.fxi
    public final void a() {
    }

    @Override // defpackage.fxi
    public final void b() {
        eul eulVar = this.a;
        List list = (List) eulVar.b.get(euj.a);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            euk eukVar = (euk) it.next();
            whl.J(eulVar.c, eukVar.a, eukVar.b);
            boolean z = eukVar.c;
            it.remove();
        }
    }
}
