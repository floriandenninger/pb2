package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvl {
    public final agzz a;
    public final azrw b;
    public final ExecutorService c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final shf g;

    public jvl(agzz agzzVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, shf shfVar, ExecutorService executorService) {
        this.a = agzzVar;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.g = shfVar;
        this.c = executorService;
    }

    public final void a(Map map, Map map2, ykl yklVar) {
        yjk.e();
        amkq.E(map.size() == map2.size());
        agsl i = ((agof) this.b.get()).a().i();
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            agng agngVar = (agng) map.get(str);
            List list = (List) map2.get(str);
            if (list == null) {
                list = amru.q();
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(agngVar.j.getTime());
            agni e = i.e(str);
            if (e != null) {
                int size = list.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = ((agnp) list.get(i2)).f();
                }
                arrayList.add(new agrp(str, seconds, strArr, TimeUnit.MILLISECONDS.toSeconds(e.e)));
            }
        }
        agsm agsmVar = (agsm) this.e.get();
        try {
            agrq agrqVar = (agrq) this.d.get();
            long a = agsmVar.a();
            long a2 = agsmVar.a() + agsmVar.b();
            Iterator it = ((agof) this.b.get()).a().m().j().iterator();
            int i3 = Integer.MAX_VALUE;
            while (it.hasNext()) {
                int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(this.g.c() - ((agnv) it.next()).g);
                if (seconds2 >= 0 && seconds2 < i3) {
                    i3 = seconds2;
                }
            }
            arwx c = agrqVar.c(a, a2, i3, ((zfe) this.f.get()).a(), arrayList);
            Set<String> keySet = map.keySet();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            long b = ((agsm) this.e.get()).b() - c.d;
            for (String str2 : keySet) {
                arwv h = ahbj.h(c, str2);
                if (yklVar != null) {
                    yklVar.b(str2, Boolean.valueOf(h != null && h.c));
                }
                if (h != null && !h.c && (h.f || h.e)) {
                    arrayList2.add(str2);
                    hashMap.put(str2, Integer.MAX_VALUE);
                    hashMap2.put(str2, Integer.valueOf(!h.e ? 1 : 0));
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            ((agof) this.b.get()).a().i().A(arrayList2, hashMap, hashMap2, 1, b);
        } catch (ExecutionException e2) {
            for (Object obj : map.keySet()) {
                if (yklVar != null) {
                    yklVar.a(obj, e2);
                } else {
                    String valueOf = String.valueOf(obj);
                    zga.d(valueOf.length() != 0 ? "Failed to sync playlist = ".concat(valueOf) : new String("Failed to sync playlist = "), e2);
                }
            }
        }
    }

    public final void b(final List list, final ykl yklVar) {
        if (this.a.c()) {
            this.c.execute(new Runnable() { // from class: jvi
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair;
                    jvl jvlVar = jvl.this;
                    List list2 = list;
                    ykl yklVar2 = yklVar;
                    HashSet<String> hashSet = new HashSet(list2);
                    yjk.e();
                    HashMap hashMap = new HashMap();
                    for (String str : hashSet) {
                        hashMap.put(str, jvlVar.c.submit(new jvk(jvlVar, str)));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : hashMap.keySet()) {
                        try {
                            pair = (Pair) ((Future) hashMap.get(str2)).get();
                        } catch (IllegalStateException | InterruptedException | ExecutionException e) {
                            if (yklVar2 != null) {
                                yklVar2.a(str2, e);
                            }
                            zga.d("Failed to fetch playlist and videos", e);
                        }
                        if (pair == null) {
                            throw new IllegalStateException("playlistAndVideosPair is null.");
                            break;
                        }
                        arrayList.add(pair);
                    }
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Pair pair2 = (Pair) arrayList.get(i);
                        String str3 = ((agng) pair2.first).a;
                        hashMap2.put(str3, (agng) pair2.first);
                        hashMap3.put(str3, (List) pair2.second);
                    }
                    jvlVar.a(hashMap2, hashMap3, yklVar2);
                }
            });
        }
    }

    public final void c(String str, ykl yklVar) {
        if (this.a.c()) {
            b(Collections.singletonList(str), yklVar);
        }
    }
}
