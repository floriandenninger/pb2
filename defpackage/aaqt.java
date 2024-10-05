package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqt implements aaqs {
    private final shf a;
    private final Map b = new ConcurrentHashMap();

    public aaqt(shf shfVar) {
        this.a = shfVar;
    }

    @Override // defpackage.aaqs
    public final void a(aone aoneVar, arnd arndVar) {
        if (arndVar == null || (arndVar.b & 131072) == 0) {
            return;
        }
        if (aoneVar != null) {
            arnc arncVar = ((arnb) aoneVar.instance).f;
            if (arncVar == null) {
                arncVar = arnc.a;
            }
            if (arncVar.d.size() != 0) {
                Set keySet = this.b.keySet();
                arnc arncVar2 = ((arnb) aoneVar.instance).f;
                if (arncVar2 == null) {
                    arncVar2 = arnc.a;
                }
                keySet.removeAll(arncVar2.d);
            }
        }
        Map map = this.b;
        aqek aqekVar = arndVar.g;
        if (aqekVar == null) {
            aqekVar = aqek.a;
        }
        long d = this.a.d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aqek aqekVar2 = arndVar.g;
        if (aqekVar2 == null) {
            aqekVar2 = aqek.a;
        }
        map.put(aqekVar, Long.valueOf(d + timeUnit.toMillis(aqekVar2.b)));
    }

    @Override // defpackage.aaqs
    public final void b(aone aoneVar) {
        if (this.b.isEmpty() || aoneVar == null) {
            return;
        }
        arnc arncVar = ((arnb) aoneVar.instance).f;
        if (arncVar == null) {
            arncVar = arnc.a;
        }
        aone builder = arncVar.toBuilder();
        builder.copyOnWrite();
        ((arnc) builder.instance).d = arnc.emptyProtobufList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= this.a.d()) {
                this.b.remove(entry.getKey());
            } else {
                aqek aqekVar = (aqek) entry.getKey();
                builder.copyOnWrite();
                arnc arncVar2 = (arnc) builder.instance;
                aqekVar.getClass();
                aony aonyVar = arncVar2.d;
                if (!aonyVar.c()) {
                    arncVar2.d = aonm.mutableCopy(aonyVar);
                }
                arncVar2.d.add(aqekVar);
            }
        }
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        arnc arncVar3 = (arnc) builder.build();
        arncVar3.getClass();
        arnbVar.f = arncVar3;
        arnbVar.b |= 16;
    }
}
