package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vlt {
    private final amnp a;

    private vlt(amnp amnpVar) {
        this.a = amnpVar;
    }

    public /* synthetic */ vlt(amnp amnpVar, vls vlsVar) {
        this(amnpVar);
    }

    public vlt a() {
        amnp amnpVar = this.a;
        amnpVar.e();
        amnpVar.f();
        return this;
    }

    public vlv b(awzd awzdVar, awze awzeVar) {
        amnp amnpVar = this.a;
        aofe c = aoff.c();
        aone createBuilder = aofm.a.createBuilder();
        createBuilder.copyOnWrite();
        aofm aofmVar = (aofm) createBuilder.instance;
        aofmVar.c = awzdVar.k;
        aofmVar.b |= 1;
        createBuilder.copyOnWrite();
        aofm aofmVar2 = (aofm) createBuilder.instance;
        aofmVar2.d = awzeVar.w;
        aofmVar2.b |= 2;
        c.copyOnWrite();
        ((aoff) c.instance).q((aofm) createBuilder.build());
        return new vlv(amnpVar, c, null);
    }

    public vlv c(awzd awzdVar, awze awzeVar, awzc awzcVar) {
        amnp amnpVar = this.a;
        aofe c = aoff.c();
        aone createBuilder = aofm.a.createBuilder();
        createBuilder.copyOnWrite();
        aofm aofmVar = (aofm) createBuilder.instance;
        aofmVar.c = awzdVar.k;
        aofmVar.b |= 1;
        createBuilder.copyOnWrite();
        aofm aofmVar2 = (aofm) createBuilder.instance;
        aofmVar2.d = awzeVar.w;
        aofmVar2.b |= 2;
        createBuilder.copyOnWrite();
        aofm aofmVar3 = (aofm) createBuilder.instance;
        aofmVar3.e = awzcVar.q;
        aofmVar3.b |= 4;
        c.copyOnWrite();
        ((aoff) c.instance).q((aofm) createBuilder.build());
        return new vlv(amnpVar, c, null);
    }
}
