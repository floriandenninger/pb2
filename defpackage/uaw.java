package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uaw extends ubd {
    private final uah b;
    private final txa c;

    public uaw(uah uahVar, txa txaVar) {
        this.b = uahVar;
        this.c = txaVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List b = this.c.b(string, 100);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            try {
                ucy ucyVar = (ucy) aonm.parseFrom(ucy.a, ((twz) it.next()).b);
                aokw aokwVar = ucyVar.d;
                if (aokwVar == null) {
                    aokwVar = aokw.a;
                }
                String str = ucyVar.f;
                int j = aobq.j(ucyVar.e);
                if (j != 0) {
                    i = j;
                }
                uav uavVar = new uav(aokwVar, str, i);
                if (!linkedHashMap.containsKey(uavVar)) {
                    linkedHashMap.put(uavVar, new HashSet());
                }
                ((Set) linkedHashMap.get(uavVar)).addAll(ucyVar.c);
            } catch (aoob e) {
                tzk.c("BatchUpdateThreadStateHandler", e, "Unable to parse SdkBatchedUpdate message", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (uav uavVar2 : linkedHashMap.keySet()) {
            aone createBuilder = ucy.a.createBuilder();
            aokw aokwVar2 = uavVar2.a;
            createBuilder.copyOnWrite();
            ucy ucyVar2 = (ucy) createBuilder.instance;
            ucyVar2.d = aokwVar2;
            ucyVar2.b |= 1;
            String str2 = uavVar2.b;
            createBuilder.copyOnWrite();
            ucy ucyVar3 = (ucy) createBuilder.instance;
            ucyVar3.b |= 4;
            ucyVar3.f = str2;
            Iterable iterable = (Iterable) linkedHashMap.get(uavVar2);
            createBuilder.copyOnWrite();
            ucy ucyVar4 = (ucy) createBuilder.instance;
            ucyVar4.a();
            aolo.addAll(iterable, (List) ucyVar4.c);
            int i2 = uavVar2.c;
            createBuilder.copyOnWrite();
            ucy ucyVar5 = (ucy) createBuilder.instance;
            ucyVar5.e = i2 - 1;
            ucyVar5.b |= 2;
            arrayList.add((ucy) createBuilder.build());
        }
        uag a = this.b.a(string, arrayList, aokoVar);
        if (!a.b() || !a.d) {
            this.c.d(string, b);
        }
        return a;
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "BatchUpdateThreadStateCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_BATCH_UPDATE_THREAD_STATE";
    }
}
