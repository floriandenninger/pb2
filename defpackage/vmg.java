package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vmg {
    private final awzb a;
    private final amnp b;

    public vmg(awzb awzbVar, amnp amnpVar) {
        this.a = awzbVar;
        this.b = amnpVar;
    }

    public static vmg a(awzb awzbVar) {
        return new vmg(awzbVar, amnp.d(amlo.a));
    }

    public vmg b() {
        this.b.f();
        return this;
    }

    public aoff c(int i) {
        aofe c = aoff.c();
        aone createBuilder = aofl.a.createBuilder();
        awzb awzbVar = this.a;
        createBuilder.copyOnWrite();
        aofl aoflVar = (aofl) createBuilder.instance;
        aoflVar.c = awzbVar.K;
        aoflVar.b |= 1;
        c.copyOnWrite();
        ((aoff) c.instance).p((aofl) createBuilder.build());
        amnp amnpVar = this.b;
        amnpVar.g();
        long a = amnpVar.a(TimeUnit.MICROSECONDS);
        c.copyOnWrite();
        ((aoff) c.instance).o(a);
        c.copyOnWrite();
        ((aoff) c.instance).l(i);
        return (aoff) c.build();
    }

    public aoff d(aogv aogvVar) {
        aofe c = aoff.c();
        aone createBuilder = aofl.a.createBuilder();
        awzb awzbVar = this.a;
        createBuilder.copyOnWrite();
        aofl aoflVar = (aofl) createBuilder.instance;
        aoflVar.c = awzbVar.K;
        aoflVar.b |= 1;
        c.copyOnWrite();
        ((aoff) c.instance).p((aofl) createBuilder.build());
        amnp amnpVar = this.b;
        amnpVar.g();
        long a = amnpVar.a(TimeUnit.MICROSECONDS);
        c.copyOnWrite();
        ((aoff) c.instance).o(a);
        aone createBuilder2 = aofd.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofd aofdVar = (aofd) createBuilder2.instance;
        aofdVar.c = aogvVar.s;
        aofdVar.b |= 1;
        c.copyOnWrite();
        ((aoff) c.instance).m((aofd) createBuilder2.build());
        return (aoff) c.build();
    }

    public aoff e(Throwable th) {
        aofe c = aoff.c();
        aone createBuilder = aofl.a.createBuilder();
        awzb awzbVar = this.a;
        createBuilder.copyOnWrite();
        aofl aoflVar = (aofl) createBuilder.instance;
        aoflVar.c = awzbVar.K;
        aoflVar.b |= 1;
        c.copyOnWrite();
        ((aoff) c.instance).p((aofl) createBuilder.build());
        amnp amnpVar = this.b;
        amnpVar.g();
        long a = amnpVar.a(TimeUnit.MICROSECONDS);
        c.copyOnWrite();
        ((aoff) c.instance).o(a);
        aofd a2 = vlr.a(th);
        c.copyOnWrite();
        ((aoff) c.instance).m(a2);
        return (aoff) c.build();
    }
}
