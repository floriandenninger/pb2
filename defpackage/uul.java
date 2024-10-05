package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uul implements uuq {
    public final Application a;
    public final Set b;
    private final Set c;

    public uul(Context context, Set set, Set set2) {
        this.a = (Application) context;
        this.c = set;
        this.b = set2;
    }

    @Override // defpackage.uuq
    public final uup a() {
        return new uup(10);
    }

    @Override // defpackage.uuq
    public final void b(final bact bactVar) {
        bach bachVar = bactVar.h;
        if (bachVar == null) {
            bachVar = bach.a;
        }
        if ((bachVar.b & 1) == 0 || this.c.isEmpty() || this.b.isEmpty()) {
            return;
        }
        amrp f = amru.f();
        amxd listIterator = ((amvs) this.c).listIterator();
        while (listIterator.hasNext()) {
            f.h(((uun) listIterator.next()).a());
        }
        anaf.X(anfq.h(anaf.U(f.g()), new amml() { // from class: uuk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                uul uulVar = uul.this;
                bact bactVar2 = bactVar;
                aong aongVar = (aong) uum.a.createBuilder();
                for (uum uumVar : (List) obj) {
                    if (uumVar != null) {
                        aongVar.mergeFrom((aonm) uumVar);
                    }
                }
                aongVar.copyOnWrite();
                uum uumVar2 = (uum) aongVar.instance;
                bactVar2.getClass();
                uumVar2.c = bactVar2;
                uumVar2.b |= 1;
                amvs amvsVar = (amvs) uulVar.b;
                String[] strArr = new String[amvsVar.e];
                amxd listIterator2 = amvsVar.listIterator();
                int i = 0;
                while (listIterator2.hasNext()) {
                    strArr[i] = ((uuo) listIterator2.next()).getClass().getName();
                    i++;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(uulVar.a.getApplicationContext(), (Class<?>) LifeboatReceiver.class));
                intent.setPackage(uulVar.a.getApplicationContext().getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", ((uum) aongVar.build()).toByteArray());
                uulVar.a.sendBroadcast(intent);
                return null;
            }
        }, angq.a));
    }
}
