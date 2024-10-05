package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeot {
    public final ywr a;
    public final zgd b;
    public volatile boolean c;
    private final aaea d;
    private final ScheduledExecutorService e;
    private final acpl f;

    public aeot(ywr ywrVar, ScheduledExecutorService scheduledExecutorService, aaea aaeaVar, acpl acplVar) {
        aeor aeorVar = new aeor(this);
        this.b = aeorVar;
        this.c = false;
        this.a = ywrVar;
        this.e = scheduledExecutorService;
        this.d = aaeaVar;
        this.f = acplVar;
        aeorVar.c(scheduledExecutorService);
    }

    private final atuc d() {
        arfd a;
        aaea aaeaVar = this.d;
        if (aaeaVar == null || (a = aaeaVar.a()) == null) {
            return null;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atuc atucVar = atclVar.g;
        return atucVar == null ? atuc.a : atucVar;
    }

    private static void e(ArrayDeque arrayDeque, float f, int i) {
        arrayDeque.add(Float.valueOf(f));
        while (arrayDeque.size() > i) {
            arrayDeque.pop();
        }
    }

    public final void a() {
        if (Math.random() < 0.01d) {
            aeoh.d(16, this.f);
        }
    }

    public final boolean b() {
        atuc d = d();
        if (d != null) {
            return d.e;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(float f, float f2, long j, int i, String str) {
        atuc d = d();
        if (d == null || str == null || f2 <= 0.0f || !d.e) {
            return;
        }
        int i2 = d.c;
        int i3 = d.d;
        synchronized (this) {
            boolean z = !this.c;
            this.c = true;
            aeos aeosVar = (aeos) this.b.get();
            if (!str.equals(aeosVar.g)) {
                aeosVar.b = new ArrayDeque();
                aeosVar.c = new ArrayDeque();
                aeosVar.d = new ArrayDeque();
                aeosVar.e = new ArrayDeque();
                aeosVar.f = -1L;
                aeosVar.g = str;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                e(aeosVar.b, f2, i2);
            } else {
                if (i4 != 1) {
                    if (f > 0.0f && j != -1) {
                        e(aeosVar.c, f2, i2);
                        e(aeosVar.d, f, i2);
                        aeosVar.f = j;
                    }
                    return;
                }
                if (j == -1) {
                    return;
                }
                e(aeosVar.e, f2, i2);
                aeosVar.f = j;
            }
            if (z) {
                try {
                    this.e.schedule(new Runnable() { // from class: aeoq
                        @Override // java.lang.Runnable
                        public final void run() {
                            final aeos a;
                            final aeot aeotVar = aeot.this;
                            synchronized (aeotVar) {
                                a = aeos.a((aeos) aeotVar.b.get());
                                aeotVar.c = false;
                            }
                            ynm.m(aeotVar.a.b(new amml() { // from class: aeop
                                @Override // defpackage.amml
                                public final Object apply(Object obj) {
                                    aeos aeosVar2 = aeos.this;
                                    aone builder = ((awvr) obj).toBuilder();
                                    aone createBuilder = afim.a.createBuilder();
                                    ArrayDeque arrayDeque = aeosVar2.d;
                                    createBuilder.copyOnWrite();
                                    afim afimVar = (afim) createBuilder.instance;
                                    aont aontVar = afimVar.c;
                                    if (!aontVar.c()) {
                                        afimVar.c = aonm.mutableCopy(aontVar);
                                    }
                                    aolo.addAll((Iterable) arrayDeque, (List) afimVar.c);
                                    ArrayDeque arrayDeque2 = aeosVar2.b;
                                    createBuilder.copyOnWrite();
                                    afim afimVar2 = (afim) createBuilder.instance;
                                    aont aontVar2 = afimVar2.b;
                                    if (!aontVar2.c()) {
                                        afimVar2.b = aonm.mutableCopy(aontVar2);
                                    }
                                    aolo.addAll((Iterable) arrayDeque2, (List) afimVar2.b);
                                    ArrayDeque arrayDeque3 = aeosVar2.e;
                                    createBuilder.copyOnWrite();
                                    afim afimVar3 = (afim) createBuilder.instance;
                                    aont aontVar3 = afimVar3.e;
                                    if (!aontVar3.c()) {
                                        afimVar3.e = aonm.mutableCopy(aontVar3);
                                    }
                                    aolo.addAll((Iterable) arrayDeque3, (List) afimVar3.e);
                                    ArrayDeque arrayDeque4 = aeosVar2.c;
                                    createBuilder.copyOnWrite();
                                    afim afimVar4 = (afim) createBuilder.instance;
                                    aont aontVar4 = afimVar4.d;
                                    if (!aontVar4.c()) {
                                        afimVar4.d = aonm.mutableCopy(aontVar4);
                                    }
                                    aolo.addAll((Iterable) arrayDeque4, (List) afimVar4.d);
                                    long j2 = aeosVar2.f;
                                    createBuilder.copyOnWrite();
                                    ((afim) createBuilder.instance).f = (int) j2;
                                    String str2 = aeosVar2.g;
                                    createBuilder.copyOnWrite();
                                    afim afimVar5 = (afim) createBuilder.instance;
                                    str2.getClass();
                                    afimVar5.g = str2;
                                    afim afimVar6 = (afim) createBuilder.build();
                                    builder.copyOnWrite();
                                    awvr awvrVar = (awvr) builder.instance;
                                    afimVar6.getClass();
                                    awvrVar.r = afimVar6;
                                    awvrVar.b |= 512;
                                    return (awvr) builder.build();
                                }
                            }), new ynk() { // from class: aeoo
                                @Override // defpackage.zfi
                                /* renamed from: b */
                                public final void a(Throwable th) {
                                    aeot.this.a();
                                }
                            });
                        }
                    }, i3, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException unused) {
                    a();
                }
                synchronized (this) {
                    this.c = false;
                }
            }
        }
    }
}
