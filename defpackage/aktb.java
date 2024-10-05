package defpackage;

import android.os.Build;
import android.os.Debug;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aktb implements Runnable {
    public final /* synthetic */ aktd a;
    private final /* synthetic */ int b;

    public /* synthetic */ aktb(aktd aktdVar, int i) {
        this.b = i;
        this.a = aktdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        int i = 0;
        boolean z = true;
        z = true;
        if (this.b != 0) {
            aktd aktdVar = this.a;
            long g = aktdVar.h.d.g();
            aksx aksxVar = (aksx) aktdVar.g.get();
            boolean z2 = aksxVar.a;
            long j = g - aksxVar.b;
            long j2 = aktdVar.a;
            if (j > j2) {
                if (Debug.isDebuggerConnected()) {
                    aktdVar.d.a();
                } else {
                    Thread thread = aktdVar.e.getLooper().getThread();
                    akst akstVar = aktdVar.d;
                    if (akstVar.b == null) {
                        aone createBuilder = apfe.a.createBuilder();
                        long c = akstVar.a.d.c();
                        createBuilder.copyOnWrite();
                        apfe apfeVar = (apfe) createBuilder.instance;
                        apfeVar.b |= 8;
                        apfeVar.f = c - j;
                        int i2 = Build.VERSION.SDK_INT;
                        createBuilder.copyOnWrite();
                        apfe apfeVar2 = (apfe) createBuilder.instance;
                        apfeVar2.b |= 64;
                        apfeVar2.i = i2;
                        int a = zgx.a(akstVar.a.b);
                        createBuilder.copyOnWrite();
                        apfe apfeVar3 = (apfe) createBuilder.instance;
                        apfeVar3.b |= 128;
                        apfeVar3.j = a;
                        String c2 = akst.c(thread);
                        createBuilder.copyOnWrite();
                        apfe apfeVar4 = (apfe) createBuilder.instance;
                        c2.getClass();
                        apfeVar4.b |= 4;
                        apfeVar4.e = c2;
                        akstVar.b = createBuilder;
                        i = 1;
                    }
                    aone aoneVar = akstVar.b;
                    long min = Math.min(j, 2147483647L);
                    aoneVar.copyOnWrite();
                    apfe apfeVar5 = (apfe) aoneVar.instance;
                    apfe apfeVar6 = apfe.a;
                    apfeVar5.b |= 2;
                    apfeVar5.d = (int) min;
                    if (z2) {
                        int i3 = akso.a;
                        long min2 = Math.min(j, 2147483647L);
                        aoneVar.copyOnWrite();
                        apfe apfeVar7 = (apfe) aoneVar.instance;
                        apfeVar7.b |= 16;
                        apfeVar7.g = (int) min2;
                    }
                    if (i != 0) {
                        aktdVar.h.g.c(yyf.a, 1);
                    }
                    akst akstVar2 = aktdVar.d;
                    aone aoneVar2 = akstVar2.b;
                    if (aoneVar2 != null) {
                        String.valueOf(String.valueOf(aoneVar2.build())).length();
                        int i4 = akso.a;
                        akbc.u(akstVar2.a, (apfe) akstVar2.b.build());
                    } else {
                        int i5 = akso.a;
                    }
                    j2 = aktdVar.c;
                }
            } else {
                akst akstVar3 = aktdVar.d;
                if (akstVar3.b != null) {
                    akstVar3.a();
                    aktdVar.h.g.c(yyf.a, 0);
                }
                j2 = (aktdVar.a - j) + 50;
            }
            aktdVar.i.schedule(new aktb(aktdVar, z ? 1 : 0), j2, TimeUnit.MILLISECONDS);
            return;
        }
        aktd aktdVar2 = this.a;
        long g2 = aktdVar2.h.d.g();
        AtomicReference atomicReference = aktdVar2.g;
        aktc aktcVar = (aktc) aktdVar2.f.get();
        if (aktcVar != null && (bool = aktcVar.a) != null) {
            z = bool.booleanValue();
        }
        atomicReference.set(new aksx(g2, z));
        aktdVar2.e.postDelayed(new aktb(aktdVar2, i), aktdVar2.b);
    }
}
