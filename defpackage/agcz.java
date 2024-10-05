package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agcz implements afzq, agda, agcv {
    public final agcf a;
    public final Map b;
    public final Executor c;
    public String d;
    private final ScheduledExecutorService e;
    private final azrw f;
    private final aaea g;
    private final AtomicInteger h;
    private final akpq i;

    public agcz(agcf agcfVar, akpq akpqVar, ScheduledExecutorService scheduledExecutorService, Executor executor, azrw azrwVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        agcfVar.getClass();
        this.a = agcfVar;
        this.i = akpqVar;
        this.b = new HashMap();
        scheduledExecutorService.getClass();
        this.e = scheduledExecutorService;
        this.c = executor;
        this.f = azrwVar;
        this.g = aaeaVar;
        this.h = new AtomicInteger();
        i();
    }

    private static String h(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("/topics/")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/");
    }

    private final void i() {
        if (g()) {
            return;
        }
        this.d = (String) ((amna) this.a.a()).a;
        if (!g()) {
            this.e.schedule(new agcx(this, 0), 3L, TimeUnit.SECONDS);
            return;
        }
        agcx agcxVar = new agcx(this, 2);
        if (aear.y()) {
            agcxVar.run();
        } else {
            this.c.execute(agcxVar);
        }
    }

    @Override // defpackage.afzq
    public final void a(asjl asjlVar, afzs afzsVar) {
        yjk.f();
        if (asjlVar == null || afzsVar == null) {
            zga.l("cannot subscribe, invalidationId or listener is null");
            return;
        }
        String h = h(asjlVar.e);
        if (TextUtils.isEmpty(h)) {
            return;
        }
        if (!g()) {
            i();
        }
        if (!this.b.containsKey(h)) {
            Map map = this.b;
            akpq akpqVar = this.i;
            String str = this.d;
            int andIncrement = this.h.getAndIncrement();
            akfq akfqVar = (akfq) akpqVar.a.get();
            akfqVar.getClass();
            Executor executor = (Executor) akpqVar.b.get();
            executor.getClass();
            map.put(h, new agcw(akfqVar, executor, str, asjlVar, this, andIncrement, null, null, null));
            aear.w(this);
        }
        agcw agcwVar = (agcw) this.b.get(h);
        agcwVar.c.add(afzsVar);
        int i = agcwVar.h;
        if (i == 2) {
            afzsVar.b(agcwVar.a);
        } else if (i == 4) {
            agcwVar.a();
        }
    }

    @Override // defpackage.afzq
    public final void b(asjl asjlVar, afzs afzsVar) {
        yjk.f();
        if (afzsVar == null) {
            zga.l("Cannot unsubscribeAll a null listener.");
            return;
        }
        if (asjlVar == null || TextUtils.isEmpty(asjlVar.e)) {
            zga.l("Cannot unsubscribeAll from a null invalidation ID or from without a topic.");
            return;
        }
        String h = h(asjlVar.e);
        if (this.b.containsKey(h)) {
            agcw agcwVar = (agcw) this.b.get(h);
            agcwVar.c.remove(afzsVar);
            if (agcwVar.h == 2 && agcwVar.c.isEmpty()) {
                agcwVar.b();
            }
        }
    }

    public final Collection c() {
        yjk.f();
        ArrayList arrayList = new ArrayList(this.b.values());
        Collections.sort(arrayList, unt.o);
        return arrayList;
    }

    @Override // defpackage.agda
    public final void d(final String str, final asjn asjnVar) {
        if (aear.y()) {
            e(str, asjnVar);
        } else {
            this.c.execute(new Runnable() { // from class: agcy
                @Override // java.lang.Runnable
                public final void run() {
                    agcz.this.e(str, asjnVar);
                }
            });
        }
    }

    public final void e(String str, final asjn asjnVar) {
        yjk.f();
        if (TextUtils.isEmpty(str)) {
            zga.l("Do not know how to handle a received topic invalidation for a null or empty topic.");
            return;
        }
        afzz.a(this.f, "RECEIVED", this.g);
        agcw agcwVar = (agcw) this.b.get(str);
        if (agcwVar == null) {
            String valueOf = String.valueOf(str);
            zga.l(valueOf.length() != 0 ? "No listeners for GCM topic: ".concat(valueOf) : new String("No listeners for GCM topic: "));
            return;
        }
        amkq.N(TextUtils.equals(agcwVar.b, str));
        aone createBuilder = asjl.a.createBuilder();
        if (!TextUtils.isEmpty(str) && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        createBuilder.copyOnWrite();
        asjl asjlVar = (asjl) createBuilder.instance;
        str.getClass();
        asjlVar.b |= 4;
        asjlVar.e = str;
        final asjl asjlVar2 = (asjl) createBuilder.build();
        final HashSet hashSet = new HashSet(agcwVar.c);
        agcwVar.d.execute(new Runnable() { // from class: agcu
            @Override // java.lang.Runnable
            public final void run() {
                Set set = hashSet;
                asjl asjlVar3 = asjlVar2;
                asjn asjnVar2 = asjnVar;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((afzs) it.next()).a(asjlVar3, asjnVar2);
                }
            }
        });
        afzz.a(this.f, "MAPPED", this.g);
    }

    public final void f() {
        yjk.f();
        for (agcw agcwVar : c()) {
            String str = this.d;
            str.getClass();
            agcwVar.g = str;
            if (agcwVar.h == 4) {
                agcwVar.a();
            }
        }
    }

    public final boolean g() {
        return !TextUtils.isEmpty(this.d) && TextUtils.equals(this.d, (CharSequence) ((amna) this.a.a()).a);
    }
}
