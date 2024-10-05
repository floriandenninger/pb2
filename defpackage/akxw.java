package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxw {
    public final azrw a;
    public final shf b;
    public final azrw c;
    public final ScheduledExecutorService d;
    public final PriorityQueue e = new PriorityQueue();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Map g = new ConcurrentHashMap();
    public boolean h = false;
    private ScheduledFuture i;

    public akxw(azrw azrwVar, shf shfVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = shfVar;
        this.d = scheduledExecutorService;
        this.c = azrwVar2;
    }

    public final void a(akxu akxuVar) {
        this.f.add(akxuVar);
    }

    public final void b(afsx afsxVar, String str, String str2, String str3) {
        final akxv akxvVar = new akxv(afsxVar, str, str2, this.b.c() + Math.max(0L, 50L), str3);
        this.d.execute(new Runnable() { // from class: akxq
            @Override // java.lang.Runnable
            public final void run() {
                akxw akxwVar = akxw.this;
                akxwVar.e.add(akxvVar);
                akxwVar.g();
            }
        });
    }

    public final void c() {
        this.d.execute(new akxo(this, 1));
    }

    public final void d(avtu avtuVar) {
        String str;
        String str2;
        avtuVar.getClass();
        avtt avttVar = avtuVar.c;
        if (avttVar == null) {
            avttVar = avtt.a;
        }
        if ((avttVar.b & 1) != 0) {
            avtt avttVar2 = avtuVar.c;
            if (avttVar2 == null) {
                avttVar2 = avtt.a;
            }
            str = avttVar2.c;
        } else {
            str = null;
        }
        avtt avttVar3 = avtuVar.c;
        if (avttVar3 == null) {
            avttVar3 = avtt.a;
        }
        if ((avttVar3.b & 2) != 0) {
            avtt avttVar4 = avtuVar.c;
            if (avttVar4 == null) {
                avttVar4 = avtt.a;
            }
            str2 = avttVar4.d;
        } else {
            str2 = null;
        }
        if (str != null || str2 != null) {
            for (avtw avtwVar : avtuVar.d) {
                int i = avtwVar.b;
                if ((i & 128) != 0) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        akxu akxuVar = (akxu) it.next();
                        if (avtwVar.f == null) {
                            avxz avxzVar = avxz.a;
                        }
                        akxuVar.g();
                    }
                } else if ((i & 2) != 0) {
                    Iterator it2 = this.f.iterator();
                    while (it2.hasNext()) {
                        akxu akxuVar2 = (akxu) it2.next();
                        aufk aufkVar = avtwVar.c;
                        if (aufkVar == null) {
                            aufkVar = aufk.a;
                        }
                        akxuVar2.a(str, str2, aufkVar);
                    }
                } else if ((i & 32) != 0) {
                    Iterator it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        akxu akxuVar3 = (akxu) it3.next();
                        avuh avuhVar = avtwVar.d;
                        if (avuhVar == null) {
                            avuhVar = avuh.a;
                        }
                        akxuVar3.d(str, str2, avuhVar);
                    }
                } else if ((i & 64) != 0) {
                    Iterator it4 = this.f.iterator();
                    while (it4.hasNext()) {
                        akxu akxuVar4 = (akxu) it4.next();
                        avgc avgcVar = avtwVar.e;
                        if (avgcVar == null) {
                            avgcVar = avgc.a;
                        }
                        akxuVar4.b(str, str2, avgcVar);
                    }
                } else if ((i & 256) != 0) {
                    Iterator it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        akxu akxuVar5 = (akxu) it5.next();
                        avsp avspVar = avtwVar.g;
                        if (avspVar == null) {
                            avspVar = avsp.a;
                        }
                        akxuVar5.c(str, str2, avspVar);
                    }
                }
            }
            boolean z = false;
            for (avtv avtvVar : avtuVar.e) {
                if ((avtvVar.b & 2) != 0) {
                    avgs avgsVar = avtvVar.c;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                    avgs avgsVar2 = avgsVar;
                    afsx afsxVar = !TextUtils.isEmpty(str) ? (afsx) this.g.get(str) : null;
                    if (afsxVar == null && !TextUtils.isEmpty(str2)) {
                        afsxVar = (afsx) this.g.get(str2);
                    }
                    if (afsxVar == null) {
                        afsxVar = afsw.a;
                    }
                    this.e.add(new akxv(afsxVar, str, str2, avgsVar2.c + this.b.c(), avgsVar2.d));
                    int i2 = avgsVar2.c;
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Iterator it6 = this.f.iterator();
            while (it6.hasNext()) {
                ((akxu) it6.next()).e(str2);
                e(str, str2);
            }
            return;
        }
        throw new IllegalStateException("Cannot find frontendId or videoId in response");
    }

    public final void e(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.g.remove(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.g.remove(str2);
    }

    public final void f(akxu akxuVar) {
        this.f.remove(akxuVar);
    }

    public final void g() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        if (this.h || this.e.isEmpty()) {
            return;
        }
        long c = ((akxv) this.e.peek()).d - this.b.c();
        if (c <= 0) {
            this.d.execute(new Runnable() { // from class: akxp
                @Override // java.lang.Runnable
                public final void run() {
                    akxw akxwVar = akxw.this;
                    adz adzVar = new adz();
                    long c2 = akxwVar.b.c();
                    while (!akxwVar.e.isEmpty() && ((akxv) akxwVar.e.peek()).d < 2000 + c2) {
                        akxv akxvVar = (akxv) akxwVar.e.poll();
                        List list = (List) adzVar.get(akxvVar.a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(akxvVar);
                        adzVar.put(akxvVar.a, list);
                        if (adzVar.j == 64) {
                            break;
                        }
                    }
                    akxwVar.g();
                    for (afsx afsxVar : adzVar.keySet()) {
                        afsxVar.d().length();
                        List<akxv> list2 = (List) adzVar.get(afsxVar);
                        list2.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        aone createBuilder = asdt.a.createBuilder();
                        for (akxv akxvVar2 : list2) {
                            if (!TextUtils.isEmpty(akxvVar2.b)) {
                                akxwVar.g.put(akxvVar2.b, afsxVar);
                            }
                            if (!TextUtils.isEmpty(akxvVar2.c)) {
                                akxwVar.g.put(akxvVar2.c, afsxVar);
                            }
                        }
                        for (akxv akxvVar3 : list2) {
                            if (!TextUtils.isEmpty(akxvVar3.e)) {
                                arrayList2.add(akxvVar3.e);
                            } else if (!TextUtils.isEmpty(akxvVar3.b)) {
                                aone createBuilder2 = avtt.a.createBuilder();
                                String str = akxvVar3.b;
                                createBuilder2.copyOnWrite();
                                avtt avttVar = (avtt) createBuilder2.instance;
                                str.getClass();
                                avttVar.b |= 1;
                                avttVar.c = str;
                                arrayList.add((avtt) createBuilder2.build());
                            } else if (!TextUtils.isEmpty(akxvVar3.c)) {
                                aone createBuilder3 = avtt.a.createBuilder();
                                String str2 = akxvVar3.c;
                                createBuilder3.copyOnWrite();
                                avtt avttVar2 = (avtt) createBuilder3.instance;
                                str2.getClass();
                                avttVar2.b |= 2;
                                avttVar2.d = str2;
                                arrayList.add((avtt) createBuilder3.build());
                            }
                        }
                        createBuilder.copyOnWrite();
                        asdt asdtVar = (asdt) createBuilder.instance;
                        aony aonyVar = asdtVar.d;
                        if (!aonyVar.c()) {
                            asdtVar.d = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) arrayList, (List) asdtVar.d);
                        createBuilder.copyOnWrite();
                        asdt asdtVar2 = (asdt) createBuilder.instance;
                        aony aonyVar2 = asdtVar2.e;
                        if (!aonyVar2.c()) {
                            asdtVar2.e = aonm.mutableCopy(aonyVar2);
                        }
                        aolo.addAll((Iterable) arrayList2, (List) asdtVar2.e);
                        asdt asdtVar3 = (asdt) createBuilder.build();
                        akxy akxyVar = (akxy) akxwVar.c.get();
                        boolean z = ((zey) akxwVar.a.get()).a;
                        akxt akxtVar = new akxt(akxwVar, list2);
                        aasp aaspVar = akxyVar.c;
                        akxk akxkVar = new akxk(akxyVar.f, afsxVar, asdtVar3.toBuilder(), null, null, null);
                        if (!z) {
                            akxkVar.r = 3;
                        }
                        akxkVar.k();
                        aaspVar.e(akxkVar, akxtVar);
                    }
                }
            });
        } else {
            this.i = this.d.schedule(new Runnable() { // from class: akxp
                @Override // java.lang.Runnable
                public final void run() {
                    akxw akxwVar = akxw.this;
                    adz adzVar = new adz();
                    long c2 = akxwVar.b.c();
                    while (!akxwVar.e.isEmpty() && ((akxv) akxwVar.e.peek()).d < 2000 + c2) {
                        akxv akxvVar = (akxv) akxwVar.e.poll();
                        List list = (List) adzVar.get(akxvVar.a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(akxvVar);
                        adzVar.put(akxvVar.a, list);
                        if (adzVar.j == 64) {
                            break;
                        }
                    }
                    akxwVar.g();
                    for (afsx afsxVar : adzVar.keySet()) {
                        afsxVar.d().length();
                        List<akxv> list2 = (List) adzVar.get(afsxVar);
                        list2.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        aone createBuilder = asdt.a.createBuilder();
                        for (akxv akxvVar2 : list2) {
                            if (!TextUtils.isEmpty(akxvVar2.b)) {
                                akxwVar.g.put(akxvVar2.b, afsxVar);
                            }
                            if (!TextUtils.isEmpty(akxvVar2.c)) {
                                akxwVar.g.put(akxvVar2.c, afsxVar);
                            }
                        }
                        for (akxv akxvVar3 : list2) {
                            if (!TextUtils.isEmpty(akxvVar3.e)) {
                                arrayList2.add(akxvVar3.e);
                            } else if (!TextUtils.isEmpty(akxvVar3.b)) {
                                aone createBuilder2 = avtt.a.createBuilder();
                                String str = akxvVar3.b;
                                createBuilder2.copyOnWrite();
                                avtt avttVar = (avtt) createBuilder2.instance;
                                str.getClass();
                                avttVar.b |= 1;
                                avttVar.c = str;
                                arrayList.add((avtt) createBuilder2.build());
                            } else if (!TextUtils.isEmpty(akxvVar3.c)) {
                                aone createBuilder3 = avtt.a.createBuilder();
                                String str2 = akxvVar3.c;
                                createBuilder3.copyOnWrite();
                                avtt avttVar2 = (avtt) createBuilder3.instance;
                                str2.getClass();
                                avttVar2.b |= 2;
                                avttVar2.d = str2;
                                arrayList.add((avtt) createBuilder3.build());
                            }
                        }
                        createBuilder.copyOnWrite();
                        asdt asdtVar = (asdt) createBuilder.instance;
                        aony aonyVar = asdtVar.d;
                        if (!aonyVar.c()) {
                            asdtVar.d = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) arrayList, (List) asdtVar.d);
                        createBuilder.copyOnWrite();
                        asdt asdtVar2 = (asdt) createBuilder.instance;
                        aony aonyVar2 = asdtVar2.e;
                        if (!aonyVar2.c()) {
                            asdtVar2.e = aonm.mutableCopy(aonyVar2);
                        }
                        aolo.addAll((Iterable) arrayList2, (List) asdtVar2.e);
                        asdt asdtVar3 = (asdt) createBuilder.build();
                        akxy akxyVar = (akxy) akxwVar.c.get();
                        boolean z = ((zey) akxwVar.a.get()).a;
                        akxt akxtVar = new akxt(akxwVar, list2);
                        aasp aaspVar = akxyVar.c;
                        akxk akxkVar = new akxk(akxyVar.f, afsxVar, asdtVar3.toBuilder(), null, null, null);
                        if (!z) {
                            akxkVar.r = 3;
                        }
                        akxkVar.k();
                        aaspVar.e(akxkVar, akxtVar);
                    }
                }
            }, c, TimeUnit.MILLISECONDS);
        }
    }
}
