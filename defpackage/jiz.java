package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jiz implements Runnable {
    public final /* synthetic */ jjo a;

    public /* synthetic */ jiz(jjo jjoVar) {
        this.a = jjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jjo jjoVar = this.a;
        yjk.e();
        if (jjoVar.h) {
            return;
        }
        final acsx b = ((acsy) jjoVar.e.get()).b(asmn.LATENCY_ACTION_DOWNLOADS_COMPATIBILITY_LAYER);
        final aahu c = ((aahv) jjoVar.c.get()).c();
        final aaio c2 = ((aaih) c).c();
        final agsn a = ((agof) jjoVar.b.get()).a();
        if (((axzf) jjoVar.f.get()).s()) {
            final Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            jjoVar.a(new jhx() { // from class: jik
                @Override // defpackage.jhx
                public final void a(Object obj) {
                    agsn agsnVar = agsn.this;
                    Set set = newSetFromMap;
                    aakv aakvVar = c;
                    amsx amsxVar = jjo.a;
                    amxd listIterator = ((jhr) obj).v(agsnVar).listIterator();
                    while (listIterator.hasNext()) {
                        set.add(((whu) listIterator.next()).a(aakvVar));
                    }
                }
            });
            whu.ad(c2, newSetFromMap);
        } else {
            jjoVar.a(new jhx() { // from class: jij
                @Override // defpackage.jhx
                public final void a(Object obj) {
                    agsn agsnVar = agsn.this;
                    aalc aalcVar = c2;
                    amsx amsxVar = jjo.a;
                    amxd listIterator = ((jhr) obj).v(agsnVar).listIterator();
                    while (listIterator.hasNext()) {
                        aalcVar.k((whu) listIterator.next());
                    }
                }
            });
        }
        b.c("c_g");
        ayrz.c((AtomicReference) c2.b().q(izw.f).C().R(new ayrm() { // from class: jiu
            @Override // defpackage.ayrm
            public final void a() {
                acsx acsxVar = acsx.this;
                amsx amsxVar = jjo.a;
                acsxVar.c("c_c");
            }
        }));
        jjoVar.h = true;
    }
}
