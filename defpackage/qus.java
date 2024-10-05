package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qus implements quq {
    private final qur a;
    private long b;
    private final qtl c;
    private final aone d;

    public qus(qur qurVar) {
        qtl qtlVar = qtl.a;
        this.a = qurVar;
        this.c = qtlVar;
        this.d = amlj.a.createBuilder();
        this.b = -1L;
    }

    @Override // defpackage.quq
    public final amlj b() {
        return (amlj) this.d.build();
    }

    @Override // defpackage.quq
    public final void c(amlh amlhVar, qur qurVar) {
        if (qurVar == qur.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (qurVar.compareTo(this.a) > 0) {
            return;
        }
        amlg a = amli.a();
        a.copyOnWrite();
        ((amli) a.instance).f(amlhVar);
        long nanoTime = System.nanoTime();
        if (this.b >= 0) {
            long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.b);
            a.copyOnWrite();
            ((amli) a.instance).e(millis);
        }
        this.b = nanoTime;
        aone aoneVar = this.d;
        aoneVar.copyOnWrite();
        amlj amljVar = (amlj) aoneVar.instance;
        amli amliVar = (amli) a.build();
        amlj amljVar2 = amlj.a;
        amliVar.getClass();
        aony aonyVar = amljVar.b;
        if (!aonyVar.c()) {
            amljVar.b = aonm.mutableCopy(aonyVar);
        }
        amljVar.b.add(amliVar);
    }

    @Override // defpackage.quq
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final qus clone() {
        return new qus(this);
    }

    private qus(qus qusVar) {
        this.a = qusVar.a;
        this.c = qusVar.c;
        this.d = qusVar.d.mo21clone();
        this.b = qusVar.b;
    }
}
