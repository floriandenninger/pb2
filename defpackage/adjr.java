package defpackage;

import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjr {
    public static final String a = zga.a("MDX.promotion");
    public final adka b;
    public final Set d;
    public final Set e;
    public final adch f;
    public final adlt g;
    public final ayqx h;
    public adjm j;
    public adge l;
    public final Handler m;
    public Runnable n;
    public final Object k = new Object();
    public final Comparator o = new adjq(this);
    public final Set i = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map c = new HashMap();

    public adjr(Handler handler, adka adkaVar, Set set, Set set2, Set set3, adch adchVar, adlt adltVar, aypy aypyVar) {
        this.m = handler;
        this.b = adkaVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            adjl adjlVar = (adjl) it.next();
            this.c.put(adjlVar.a, adjlVar);
        }
        amkq.E(set.size() == this.c.size());
        this.d = set2;
        this.e = set3;
        HashSet hashSet = new HashSet();
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            hashSet.add(((adjm) it2.next()).b());
        }
        amkq.E(hashSet.containsAll(this.c.keySet()));
        this.f = adchVar;
        adltVar.getClass();
        this.g = adltVar;
        this.h = aypyVar.ax(new ayrs() { // from class: adjn
            /* JADX WARN: Code restructure failed: missing block: B:166:0x027f, code lost:
            
                if (((r4.c.c() - r6) / 1000) <= r8.c) goto L107;
             */
            @Override // defpackage.ayrs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 955
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adjn.a(java.lang.Object):void");
            }
        });
    }

    public final void a() {
        Runnable runnable = this.n;
        if (runnable != null) {
            this.m.removeCallbacks(runnable);
            this.n = null;
        }
    }

    public final void b(kib kibVar) {
        this.i.add(kibVar);
    }
}
