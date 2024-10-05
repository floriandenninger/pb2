package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnr {
    public final vlx a;
    public final amnp b;
    public final amnp c;
    public final int d = 4;
    public final int e = 5;
    public final int f = 6;

    public vnr(vlx vlxVar, amnp amnpVar, amnp amnpVar2) {
        this.a = vlxVar;
        this.b = amnpVar;
        this.c = amnpVar2;
    }

    public final void a(aogv aogvVar) {
        if (this.b.a) {
            vlx vlxVar = this.a;
            aone createBuilder = aofh.a.createBuilder();
            aofe c = aoff.c();
            aone createBuilder2 = aofm.a.createBuilder();
            awze awzeVar = awze.OBAKE_EDIT_PHOTO_SCREEN;
            createBuilder2.copyOnWrite();
            aofm aofmVar = (aofm) createBuilder2.instance;
            aofmVar.d = awzeVar.w;
            aofmVar.b |= 2;
            awzd awzdVar = awzd.VIEW_EXIT;
            createBuilder2.copyOnWrite();
            aofm aofmVar2 = (aofm) createBuilder2.instance;
            aofmVar2.c = awzdVar.k;
            aofmVar2.b |= 1;
            c.copyOnWrite();
            ((aoff) c.instance).q((aofm) createBuilder2.build());
            amnp amnpVar = this.b;
            amnpVar.g();
            long a = amnpVar.a(TimeUnit.MICROSECONDS);
            c.copyOnWrite();
            ((aoff) c.instance).o(a);
            aone createBuilder3 = aofd.a.createBuilder();
            createBuilder3.copyOnWrite();
            aofd aofdVar = (aofd) createBuilder3.instance;
            aofdVar.c = aogvVar.s;
            aofdVar.b |= 1;
            c.copyOnWrite();
            ((aoff) c.instance).m((aofd) createBuilder3.build());
            createBuilder.M(c);
            aone createBuilder4 = aofj.a.createBuilder();
            createBuilder4.copyOnWrite();
            aofj aofjVar = (aofj) createBuilder4.instance;
            aofjVar.c = 3;
            aofjVar.b |= 1;
            createBuilder.copyOnWrite();
            aofh aofhVar = (aofh) createBuilder.instance;
            aofj aofjVar2 = (aofj) createBuilder4.build();
            aofjVar2.getClass();
            aofhVar.d = aofjVar2;
            aofhVar.b |= 1;
            vlxVar.c((aofh) createBuilder.build());
        }
    }

    public final void b(aofe aofeVar) {
        vlx vlxVar = this.a;
        aone createBuilder = aofh.a.createBuilder();
        long a = this.c.a(TimeUnit.MICROSECONDS);
        aofeVar.copyOnWrite();
        ((aoff) aofeVar.instance).o(a);
        createBuilder.M(aofeVar);
        aone createBuilder2 = aofj.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofj aofjVar = (aofj) createBuilder2.instance;
        aofjVar.c = 4;
        aofjVar.b |= 1;
        createBuilder.copyOnWrite();
        aofh aofhVar = (aofh) createBuilder.instance;
        aofj aofjVar2 = (aofj) createBuilder2.build();
        aofjVar2.getClass();
        aofhVar.d = aofjVar2;
        aofhVar.b |= 1;
        vlxVar.c((aofh) createBuilder.build());
    }

    public final void c(aoff aoffVar) {
        vlx vlxVar = this.a;
        aone createBuilder = aofh.a.createBuilder();
        createBuilder.N(aoffVar);
        aone createBuilder2 = aofj.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofj aofjVar = (aofj) createBuilder2.instance;
        aofjVar.c = 5;
        aofjVar.b |= 1;
        createBuilder.copyOnWrite();
        aofh aofhVar = (aofh) createBuilder.instance;
        aofj aofjVar2 = (aofj) createBuilder2.build();
        aofjVar2.getClass();
        aofhVar.d = aofjVar2;
        aofhVar.b |= 1;
        vlxVar.c((aofh) createBuilder.build());
    }
}
