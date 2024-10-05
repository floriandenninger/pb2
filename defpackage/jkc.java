package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkc extends jhg {
    private final aahv a;

    public jkc(aahv aahvVar) {
        this.a = aahvVar;
    }

    private static awiu s(aakv aakvVar) {
        return (awiu) aakvVar.f(fhe.i()).g(awiu.class).X();
    }

    private static awiv t(String str) {
        aone createBuilder = awiv.a.createBuilder();
        String g = fhe.g(str);
        createBuilder.copyOnWrite();
        awiv awivVar = (awiv) createBuilder.instance;
        g.getClass();
        awivVar.b = 2;
        awivVar.c = g;
        return (awiv) createBuilder.build();
    }

    private static awiv u(String str) {
        aone createBuilder = awiv.a.createBuilder();
        String h = fhe.h(str);
        createBuilder.copyOnWrite();
        awiv awivVar = (awiv) createBuilder.instance;
        h.getClass();
        awivVar.b = 1;
        awivVar.c = h;
        return (awiv) createBuilder.build();
    }

    @Override // defpackage.jhg
    protected final amsx a(agsn agsnVar) {
        String i = fhe.i();
        i.getClass();
        amkq.O(!i.isEmpty(), "key cannot be empty");
        aone createBuilder = awiw.a.createBuilder();
        createBuilder.copyOnWrite();
        awiw awiwVar = (awiw) createBuilder.instance;
        awiwVar.c |= 1;
        awiwVar.d = i;
        awis awisVar = new awis(createBuilder);
        Iterator it = agsnVar.i().j().iterator();
        while (it.hasNext()) {
            awisVar.c(t(((agni) it.next()).a.a));
        }
        Iterator it2 = agsnVar.m().k().iterator();
        while (it2.hasNext()) {
            awisVar.c(u(((agnv) it2.next()).m()));
        }
        return amsx.r(awisVar);
    }

    @Override // defpackage.jhg
    protected final void c(aalc aalcVar, agni agniVar) {
        awiu s = s(this.a.c());
        if (s == null) {
            return;
        }
        awiv t = t(agniVar.a.a);
        if (s.getDownloads().contains(t)) {
            return;
        }
        awis e = s.e();
        e.c(t);
        aalcVar.k(e);
    }

    @Override // defpackage.jhg
    protected final void d(aalc aalcVar, String str) {
        awiu s = s(this.a.c());
        if (s == null) {
            return;
        }
        awiv t = t(str);
        awis e = s.e();
        e.d(t);
        aalcVar.k(e);
    }

    @Override // defpackage.jhg
    protected final void f(aalc aalcVar, agnv agnvVar) {
        awiu s = s(this.a.c());
        if (s != null && agnvVar.e) {
            awiv u = u(agnvVar.m());
            if (s.getDownloads().contains(u)) {
                return;
            }
            awis e = s.e();
            e.c(u);
            aalcVar.k(e);
        }
    }

    @Override // defpackage.jhg
    protected final void g(aalc aalcVar, String str) {
        awiu s = s(this.a.c());
        if (s == null) {
            return;
        }
        awiv u = u(str);
        awis e = s.e();
        e.d(u);
        aalcVar.k(e);
    }
}
