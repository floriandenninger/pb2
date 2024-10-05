package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzx {
    public final afsy a;
    public final zbw b;
    public final zaw c;
    public final aayg d;
    public final Executor e;
    private final ypa f;
    private final aaea g;
    private final aahv h;

    public gzx(zbw zbwVar, ypa ypaVar, aayg aaygVar, zaw zawVar, afsy afsyVar, aaea aaeaVar, aahv aahvVar, Executor executor) {
        this.b = zbwVar;
        this.f = ypaVar;
        this.d = aaygVar;
        this.c = zawVar;
        this.a = afsyVar;
        this.g = aaeaVar;
        this.h = aahvVar;
        this.e = executor;
    }

    public final void a(String str, asno asnoVar) {
        if (evr.D(this.g)) {
            String f = aalt.f(62, str);
            aalc c = this.h.a(this.a.c()).c();
            asnk d = asnl.d(f);
            d.b(asnoVar);
            c.k(d);
            c.b().Q();
            return;
        }
        this.f.f(new ghg(str, asnoVar, false));
    }
}
