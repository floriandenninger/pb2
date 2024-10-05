package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzn extends rwh {
    final /* synthetic */ rzp a;

    public rzn(rzp rzpVar) {
        this.a = rzpVar;
    }

    @Override // defpackage.rwh
    public final void b() {
        rzp rzpVar = this.a;
        if (rzpVar.b) {
            rzpVar.a.setVisibility(0);
        }
    }

    @Override // defpackage.rwh
    public final void d(Map map, rzk rzkVar) {
        rwo h = this.a.c.h();
        if (map.isEmpty() || map.keySet().contains(h.e())) {
            this.a.a(h);
            return;
        }
        String str = (String) map.keySet().iterator().next();
        rzp rzpVar = this.a;
        rzpVar.a(rzpVar.c.i(str));
    }

    @Override // defpackage.rwh
    public final void j(List list) {
        boolean z;
        rzp rzpVar = this.a;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            sba sbaVar = (sba) it.next();
            saw c = sbaVar.c(sax.a);
            List list2 = sbaVar.a;
            for (int i = 0; i < list2.size(); i++) {
                if (((Double) c.a(list2.get(i), i, sbaVar)) != null) {
                    break loop0;
                }
            }
        }
        rzpVar.b = z;
        if (z) {
            return;
        }
        rzpVar.a.setVisibility(8);
    }
}
