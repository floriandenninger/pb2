package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsz implements tss {
    private final Context a;
    private final String b;
    private final aafr c;

    public tsz(Context context, aafr aafrVar) {
        this.a = context;
        this.c = aafrVar;
        this.b = context.getPackageName();
    }

    private final void m(aone aoneVar, long j) {
        aoneVar.copyOnWrite();
        andy andyVar = (andy) aoneVar.instance;
        andy andyVar2 = andy.a;
        andyVar.b |= 524288;
        andyVar.f = j;
        aone createBuilder = andx.a.createBuilder();
        boolean z = this.a.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
        createBuilder.copyOnWrite();
        andx andxVar = (andx) createBuilder.instance;
        andxVar.b |= 1;
        andxVar.c = z;
        aoneVar.copyOnWrite();
        andy andyVar3 = (andy) aoneVar.instance;
        andx andxVar2 = (andx) createBuilder.build();
        andxVar2.getClass();
        andyVar3.h = andxVar2;
        andyVar3.c |= 64;
        aone createBuilder2 = andv.a.createBuilder();
        String str = this.b;
        createBuilder2.copyOnWrite();
        andv andvVar = (andv) createBuilder2.instance;
        str.getClass();
        andvVar.b |= 2;
        andvVar.d = str;
        createBuilder2.copyOnWrite();
        andv andvVar2 = (andv) createBuilder2.instance;
        andvVar2.b = 1 | andvVar2.b;
        andvVar2.c = 387911326;
        aoneVar.copyOnWrite();
        andy andyVar4 = (andy) aoneVar.instance;
        andv andvVar3 = (andv) createBuilder2.build();
        andvVar3.getClass();
        andyVar4.l = andvVar3;
        andyVar4.c |= 131072;
        aafr aafrVar = this.c;
        aonm build = aoneVar.build();
        if (build instanceof andy) {
            arpn a = arpp.a();
            aqic a2 = aqid.a();
            aomf byteString = build.toByteString();
            a2.copyOnWrite();
            ((aqid) a2.instance).i(byteString);
            a.copyOnWrite();
            ((arpp) a.instance).co((aqid) a2.build());
            aafrVar.a.a((arpp) a.build());
        }
    }

    @Override // defpackage.tss
    public final void a(andz andzVar) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            createBuilder.copyOnWrite();
            andy andyVar = (andy) createBuilder.instance;
            andzVar.getClass();
            andyVar.p = andzVar;
            andyVar.d |= 1;
            m(createBuilder, 100L);
        }
    }

    @Override // defpackage.tss
    public final void b(andw andwVar, anea aneaVar) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            createBuilder.copyOnWrite();
            andy andyVar = (andy) createBuilder.instance;
            andwVar.getClass();
            andyVar.e = andwVar;
            andyVar.b |= 256;
            createBuilder.copyOnWrite();
            andy andyVar2 = (andy) createBuilder.instance;
            aneaVar.getClass();
            andyVar2.q = aneaVar;
            andyVar2.d |= 2;
            m(createBuilder, 100L);
        }
    }

    @Override // defpackage.tss
    public final void c(andw andwVar) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            aone createBuilder2 = aneh.a.createBuilder();
            createBuilder2.copyOnWrite();
            aneh anehVar = (aneh) createBuilder2.instance;
            andwVar.getClass();
            anehVar.c = andwVar;
            anehVar.b |= 1;
            createBuilder.copyOnWrite();
            andy andyVar = (andy) createBuilder.instance;
            aneh anehVar2 = (aneh) createBuilder2.build();
            anehVar2.getClass();
            andyVar.o = anehVar2;
            andyVar.c |= 1073741824;
            m(createBuilder, 100L);
        }
    }

    @Override // defpackage.tss
    public final void d(andw andwVar, aned anedVar) {
        aone createBuilder = andy.a.createBuilder();
        createBuilder.copyOnWrite();
        andy andyVar = (andy) createBuilder.instance;
        andwVar.getClass();
        andyVar.e = andwVar;
        andyVar.b |= 256;
        createBuilder.copyOnWrite();
        andy andyVar2 = (andy) createBuilder.instance;
        anedVar.getClass();
        andyVar2.g = anedVar;
        andyVar2.b |= 1073741824;
        m(createBuilder, 100L);
    }

    @Override // defpackage.tss
    public final void e(aneg anegVar) {
        aone createBuilder = andy.a.createBuilder();
        createBuilder.copyOnWrite();
        andy andyVar = (andy) createBuilder.instance;
        anegVar.getClass();
        andyVar.k = anegVar;
        andyVar.c |= 32768;
        m(createBuilder, 100L);
    }

    @Override // defpackage.tss
    public final void f(anei aneiVar) {
        aone createBuilder = andy.a.createBuilder();
        createBuilder.copyOnWrite();
        andy andyVar = (andy) createBuilder.instance;
        aneiVar.getClass();
        andyVar.i = aneiVar;
        andyVar.c |= 4096;
        m(createBuilder, 100L);
    }

    @Override // defpackage.tss
    public final void g(int i) {
        if (tsx.a(100L)) {
            m(andy.a.createBuilder(), 100L);
        }
    }

    @Override // defpackage.tss
    public final void h(int i, String str, int i2, long j, String str2) {
        if (tsx.a(100L)) {
            aone createBuilder = andw.a.createBuilder();
            createBuilder.copyOnWrite();
            andw andwVar = (andw) createBuilder.instance;
            str.getClass();
            andwVar.b |= 1;
            andwVar.c = str;
            createBuilder.copyOnWrite();
            andw andwVar2 = (andw) createBuilder.instance;
            andwVar2.b |= 2;
            andwVar2.d = i2;
            createBuilder.copyOnWrite();
            andw andwVar3 = (andw) createBuilder.instance;
            andwVar3.b |= 32;
            andwVar3.h = j;
            createBuilder.copyOnWrite();
            andw andwVar4 = (andw) createBuilder.instance;
            str2.getClass();
            andwVar4.b |= 64;
            andwVar4.i = str2;
            andw andwVar5 = (andw) createBuilder.build();
            aone createBuilder2 = andy.a.createBuilder();
            createBuilder2.copyOnWrite();
            andy andyVar = (andy) createBuilder2.instance;
            andwVar5.getClass();
            andyVar.e = andwVar5;
            andyVar.b |= 256;
            m(createBuilder2, 100L);
        }
    }

    @Override // defpackage.tss
    public final void i(int i, int i2) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            aone createBuilder2 = anec.a.createBuilder();
            createBuilder2.copyOnWrite();
            anec anecVar = (anec) createBuilder2.instance;
            anecVar.b |= 2;
            anecVar.d = i2;
            createBuilder2.copyOnWrite();
            anec anecVar2 = (anec) createBuilder2.instance;
            anecVar2.c = i - 2;
            anecVar2.b |= 1;
            createBuilder.copyOnWrite();
            andy andyVar = (andy) createBuilder.instance;
            anec anecVar3 = (anec) createBuilder2.build();
            anecVar3.getClass();
            andyVar.j = anecVar3;
            andyVar.c |= 16384;
            m(createBuilder, 100L);
        }
    }

    @Override // defpackage.tss
    public final void j(int i, andw andwVar) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            aone createBuilder2 = aneb.a.createBuilder();
            createBuilder2.copyOnWrite();
            aneb anebVar = (aneb) createBuilder2.instance;
            if (i != 1) {
                anebVar.c = i - 2;
                anebVar.b |= 1;
                createBuilder2.copyOnWrite();
                aneb anebVar2 = (aneb) createBuilder2.instance;
                andwVar.getClass();
                anebVar2.d = andwVar;
                anebVar2.b |= 2;
                createBuilder.copyOnWrite();
                andy andyVar = (andy) createBuilder.instance;
                aneb anebVar3 = (aneb) createBuilder2.build();
                anebVar3.getClass();
                andyVar.n = anebVar3;
                andyVar.c |= 536870912;
                m(createBuilder, 100L);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    @Override // defpackage.tss
    public final void k(andw andwVar, int i, long j, long j2, String str, int i2) {
        if (tsx.a(100L)) {
            aone createBuilder = andy.a.createBuilder();
            aone createBuilder2 = anee.a.createBuilder();
            createBuilder2.copyOnWrite();
            anee aneeVar = (anee) createBuilder2.instance;
            andwVar.getClass();
            aneeVar.c = andwVar;
            aneeVar.b |= 1;
            createBuilder2.copyOnWrite();
            anee aneeVar2 = (anee) createBuilder2.instance;
            aneeVar2.d = i - 2;
            aneeVar2.b |= 2;
            createBuilder2.copyOnWrite();
            anee aneeVar3 = (anee) createBuilder2.instance;
            aneeVar3.b |= 4;
            aneeVar3.e = j;
            createBuilder2.copyOnWrite();
            anee aneeVar4 = (anee) createBuilder2.instance;
            aneeVar4.b |= 8;
            aneeVar4.f = j2;
            createBuilder2.copyOnWrite();
            anee aneeVar5 = (anee) createBuilder2.instance;
            str.getClass();
            aneeVar5.b |= 16;
            aneeVar5.g = str;
            createBuilder2.copyOnWrite();
            anee aneeVar6 = (anee) createBuilder2.instance;
            aneeVar6.b |= 32;
            aneeVar6.h = i2;
            createBuilder.copyOnWrite();
            andy andyVar = (andy) createBuilder.instance;
            anee aneeVar7 = (anee) createBuilder2.build();
            aneeVar7.getClass();
            andyVar.m = aneeVar7;
            andyVar.c |= 1048576;
            m(createBuilder, 100L);
        }
    }

    @Override // defpackage.tss
    public final void l(int i) {
        m(andy.a.createBuilder(), 10000L);
    }
}
