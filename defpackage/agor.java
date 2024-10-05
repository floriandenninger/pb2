package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agor implements ylb {
    private final agos a;
    private final agpd b;

    public agor(agos agosVar, agpd agpdVar) {
        this.a = agosVar;
        this.b = agpdVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        amsx g;
        agos agosVar = this.a;
        afsx c = agosVar.g.c();
        if (c.z()) {
            g = amvs.a;
        } else {
            aair a = ((aais) agosVar.c.get()).a(c);
            aajb aajbVar = (aajb) agosVar.d.get();
            ArrayList arrayList = new ArrayList();
            whl.E(agkj.c, 4, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(agosVar.e.c())), aajbVar, arrayList);
            amru amruVar = (amru) a.e(whl.D(aajbVar, arrayList)).X();
            amsv i = amsx.i();
            int size = amruVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) amruVar.get(i2);
                amsx amsxVar = (amsx) a.a(str).X();
                if (amsxVar == null || amsxVar.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    zga.b(valueOf.length() != 0 ? "[Offline] Couldn't find parent key for refreshEntity: ".concat(valueOf) : new String("[Offline] Couldn't find parent key for refreshEntity: "));
                } else {
                    i.j(amsxVar);
                }
            }
            g = i.g();
        }
        amxd listIterator = g.listIterator();
        while (listIterator.hasNext()) {
            String str2 = (String) listIterator.next();
            aone createBuilder = atpq.a.createBuilder();
            createBuilder.copyOnWrite();
            atpq atpqVar = (atpq) createBuilder.instance;
            str2.getClass();
            atpqVar.b |= 2;
            atpqVar.d = str2;
            createBuilder.copyOnWrite();
            atpq atpqVar2 = (atpq) createBuilder.instance;
            atpqVar2.c = 3;
            atpqVar2.b |= 1;
            try {
                ((agpd) agosVar.f.get()).d((atpq) createBuilder.build());
            } catch (agpe e) {
                String format = String.format("Refresh error. Msg: %s", e.getMessage());
                zga.d(format, e);
                afsi.c(2, 28, format, e);
            }
        }
        try {
            anhy anhyVar = ((agpi) this.b.a.get()).a;
            if (anhyVar == null) {
                anhyVar = anhv.a;
            }
            anhyVar.get();
            agos agosVar2 = this.a;
            agosVar2.c(agosVar2.a());
            return 0;
        } catch (InterruptedException | ExecutionException unused) {
            return 1;
        }
    }
}
