package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyd implements tya {
    private static final Set a = EnumSet.of(twb.REGISTERED, twb.PENDING_REGISTRATION, twb.FAILED_REGISTRATION);
    private final tyf b;
    private final tzt c;
    private final twx d;
    private final tzd e;
    private final ubr f;
    private final axpg g;
    private final ucb h;
    private final shf i;
    private final Lock j;
    private final ubh k;
    private final udg l;
    private final tzh m;

    public tyd(tyf tyfVar, tzt tztVar, ubh ubhVar, tzh tzhVar, udg udgVar, twx twxVar, tzd tzdVar, ubr ubrVar, axpg axpgVar, ucb ucbVar, shf shfVar, Lock lock) {
        this.b = tyfVar;
        this.c = tztVar;
        this.k = ubhVar;
        this.m = tzhVar;
        this.l = udgVar;
        this.d = twxVar;
        this.e = tzdVar;
        this.f = ubrVar;
        this.g = axpgVar;
        this.h = ucbVar;
        this.i = shfVar;
        this.j = lock;
    }

    private final void d(twu twuVar, aokt aoktVar, tye tyeVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (aoks aoksVar : aoktVar.b) {
            if (axxd.b()) {
                for (aojv aojvVar : aoksVar.c) {
                    txd txdVar = (txd) this.h.a(twuVar.b);
                    aokw aokwVar = aoksVar.b;
                    if (aokwVar == null) {
                        aokwVar = aokw.a;
                    }
                    twt a2 = txc.a();
                    a2.d(aojvVar.c);
                    a2.a = Long.valueOf(aojvVar.d);
                    int t = aobq.t(aokwVar.c);
                    int i = 1;
                    if (t == 0) {
                        t = 1;
                    }
                    a2.g(t);
                    int w = aobq.w(aokwVar.d);
                    if (w == 0) {
                        w = 1;
                    }
                    a2.f(w);
                    int o = aobq.o(aokwVar.f);
                    if (o == 0) {
                        o = 1;
                    }
                    a2.h(o);
                    int z = aobq.z(aokwVar.e);
                    if (z != 0) {
                        i = z;
                    }
                    a2.e(i);
                    txdVar.c(a2.a());
                }
            }
            aokw aokwVar2 = aoksVar.b;
            if (aokwVar2 == null) {
                aokwVar2 = aokw.a;
            }
            int w2 = aobq.w(aokwVar2.d);
            if (w2 == 0 || w2 != 3) {
                aokw aokwVar3 = aoksVar.b;
                if (aokwVar3 == null) {
                    aokwVar3 = aokw.a;
                }
                int o2 = aobq.o(aokwVar3.f);
                if (o2 != 0 && o2 == 3) {
                    arrayList.addAll(aoksVar.c);
                }
            } else {
                arrayList2.addAll(aoksVar.c);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        if (arrayList3.isEmpty()) {
            return;
        }
        tzf a3 = this.m.a(aoic.DELIVERED_UPDATE_THREAD_INSTRUCTION);
        a3.d(twuVar);
        a3.h(arrayList3);
        ((tzj) a3).n = tyeVar.b();
        a3.i();
        List b = this.f.b(twuVar, arrayList3, aohq.DISMISSED_REMOTE);
        if (!b.isEmpty()) {
            tzf a4 = this.m.a(aoic.DISMISSED_REMOTE);
            a4.d(twuVar);
            a4.c(b);
            ((tzj) a4).n = tyeVar.b();
            a4.i();
        }
        if (!arrayList2.isEmpty()) {
            f(arrayList2);
            aone createBuilder = aokw.a.createBuilder();
            createBuilder.copyOnWrite();
            aokw aokwVar4 = (aokw) createBuilder.instance;
            aokwVar4.d = 2;
            aokwVar4.b |= 2;
            tys tysVar = tys.SYSTEM_TRAY;
            e();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        f(arrayList);
        aone createBuilder2 = aokw.a.createBuilder();
        createBuilder2.copyOnWrite();
        aokw aokwVar5 = (aokw) createBuilder2.instance;
        aokwVar5.f = 2;
        aokwVar5.b |= 8;
        tys tysVar2 = tys.SYSTEM_TRAY;
        e();
    }

    private final void e() {
        Iterator it = ((Set) this.g.get()).iterator();
        while (it.hasNext()) {
            ((ucp) it.next()).h();
        }
    }

    private static void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aojv) it.next()).c);
        }
    }

    @Override // defpackage.tya
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ee, code lost:
    
        if (r0 == 5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01f6, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.c) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cf, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.d) != false) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    @Override // defpackage.tya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r24, defpackage.twd r25, long r26) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyd.b(android.content.Intent, twd, long):void");
    }

    @Override // defpackage.tya
    public final boolean c(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder();
        sb.append("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append("\n");
            }
        }
        sb.append("]");
        objArr[1] = sb.toString();
        tzk.e("GcmIntentHandler", "onReceive: %s \n %s", objArr);
        tye a2 = tye.a(intent);
        int i = a2.b;
        int i2 = i - 1;
        if (i != 0) {
            return (i2 == 0 || i2 == 1) ? !TextUtils.isEmpty(a2.a) : i2 == 2;
        }
        throw null;
    }
}
