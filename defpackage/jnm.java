package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jnm {
    public final sxd b;
    public final anib c;
    private final gnf f;
    private final gni g;
    public final Map a = new ConcurrentHashMap();
    public String[] d = new String[0];
    public avfb e = null;

    public jnm(sxd sxdVar, gnf gnfVar, gni gniVar, anib anibVar) {
        this.b = sxdVar;
        this.f = gnfVar;
        this.g = gniVar;
        this.c = anibVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ammv ammvVar) {
        avfb avfbVar = this.e;
        if (avfbVar != null) {
            this.f.d(avfbVar, this.g.a().d);
            if (ammvVar.h()) {
                ((Runnable) ammvVar.c()).run();
            }
        }
    }

    public final void b(String str, Runnable runnable) {
        ayqx ayqxVar = (ayqx) this.a.remove(str);
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        if (this.a.isEmpty()) {
            a(ammv.j(runnable));
        }
    }
}
