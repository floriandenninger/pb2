package com.google.android.apps.youtube.embeddedplayer.service.csi.service;

import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import defpackage.acsw;
import defpackage.acsx;
import defpackage.aigc;
import defpackage.aigd;
import defpackage.aone;
import defpackage.asmb;
import defpackage.asmd;
import defpackage.asmn;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private final acsw a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    public a(acsw acswVar) {
        this.a = acswVar;
    }

    private final synchronized void n(SetOperationType setOperationType, long j, String str) {
        Optional of = Optional.of(this.a.d(asmn.LATENCY_ACTION_WATCH));
        this.b = of;
        ((acsx) of.get()).f(j);
        aone createBuilder = asmd.a.createBuilder();
        int i = setOperationType.d;
        createBuilder.copyOnWrite();
        asmd asmdVar = (asmd) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        asmdVar.d = i2;
        asmdVar.b |= 8;
        aone createBuilder2 = asmb.a.createBuilder();
        asmn asmnVar = asmn.LATENCY_ACTION_WATCH;
        createBuilder2.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder2.instance;
        asmbVar.e = asmnVar.bO;
        asmbVar.b |= 1;
        createBuilder2.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder2.instance;
        asmd asmdVar2 = (asmd) createBuilder.build();
        asmdVar2.getClass();
        asmbVar2.w = asmdVar2;
        asmbVar2.c |= 524288;
        createBuilder2.copyOnWrite();
        asmb asmbVar3 = (asmb) createBuilder2.instance;
        asmbVar3.b |= 16;
        asmbVar3.h = str;
        asmb asmbVar4 = (asmb) createBuilder2.build();
        if (this.b.isPresent()) {
            ((acsx) this.b.get()).a(asmbVar4);
        }
    }

    public final synchronized aigd a() {
        aigd a;
        if (!this.b.isPresent()) {
            this.b = Optional.of(this.a.d(asmn.LATENCY_ACTION_WATCH));
        }
        aigc a2 = aigd.a();
        a2.a = (acsx) this.b.get();
        a = a2.a();
        this.b = Optional.empty();
        return a;
    }

    public final synchronized void b() {
        this.c = Optional.empty();
    }

    public final synchronized void c() {
        this.d = Optional.empty();
    }

    public final synchronized void d() {
        this.b = Optional.empty();
    }

    public final synchronized void e(Tick tick, long j) {
        if (this.c.isPresent()) {
            ((acsx) this.c.get()).d(tick.l, j);
        }
    }

    public final synchronized void f(Tick tick) {
        if (this.d.isPresent()) {
            ((acsx) this.d.get()).c(tick.l);
        }
    }

    public final synchronized void g(Tick tick, long j) {
        if (this.d.isPresent()) {
            ((acsx) this.d.get()).d(tick.l, j);
        }
    }

    public final synchronized void h(Tick tick) {
        if (this.b.isPresent()) {
            ((acsx) this.b.get()).c(tick.l);
        }
    }

    public final synchronized void i(Tick tick, long j) {
        if (this.b.isPresent()) {
            ((acsx) this.b.get()).d(tick.l, j);
        }
    }

    public final synchronized void j(long j) {
        Optional of = Optional.of(this.a.d(asmn.LATENCY_ACTION_EMBED));
        this.c = of;
        ((acsx) of.get()).f(j);
    }

    public final synchronized void k(long j) {
        Optional of = Optional.of(this.a.d(asmn.LATENCY_ACTION_VIDEO_PREVIEW));
        this.d = of;
        ((acsx) of.get()).f(j);
    }

    public final synchronized void l(SetOperationType setOperationType, long j) {
        n(setOperationType, j, "warm");
    }

    public final synchronized void m(SetOperationType setOperationType, long j) {
        n(setOperationType, j, "cold");
    }
}
