package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aong extends aone implements aoni, tgg {
    public aong() {
        edi ediVar = edi.a;
        throw null;
    }

    private final aomz cD() {
        aomz aomzVar = ((aonh) this.instance).l;
        if (!aomzVar.c) {
            return aomzVar;
        }
        aomz clone = aomzVar.clone();
        ((aonh) this.instance).l = clone;
        return clone;
    }

    private final void cE(aonk aonkVar) {
        if (aonkVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.aone, defpackage.aoox
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aonh buildPartial() {
        if (this.isBuilt) {
            return (aonh) this.instance;
        }
        ((aonh) this.instance).l.f();
        return (aonh) super.buildPartial();
    }

    public final void cA(aone aoneVar) {
        copyOnWrite();
        audj audjVar = (audj) this.instance;
        avfv avfvVar = (avfv) aoneVar.build();
        audj audjVar2 = audj.a;
        avfvVar.getClass();
        aony aonyVar = audjVar.v;
        if (!aonyVar.c()) {
            audjVar.v = aonm.mutableCopy(aonyVar);
        }
        audjVar.v.add(avfvVar);
    }

    public final void cB(aone aoneVar) {
        copyOnWrite();
        avgg avggVar = (avgg) this.instance;
        avgf avgfVar = (avgf) aoneVar.build();
        avgg avggVar2 = avgg.a;
        avgfVar.getClass();
        avggVar.a();
        avggVar.c.add(avgfVar);
    }

    public final void cC(int i, aone aoneVar) {
        copyOnWrite();
        awcd awcdVar = (awcd) this.instance;
        awda awdaVar = (awda) aoneVar.build();
        awcd awcdVar2 = awcd.a;
        awdaVar.getClass();
        aony aonyVar = awcdVar.e;
        if (!aonyVar.c()) {
            awcdVar.e = aonm.mutableCopy(aonyVar);
        }
        awcdVar.e.set(i, awdaVar);
    }

    @Deprecated
    public final void ci(Iterable iterable) {
        copyOnWrite();
        aphg aphgVar = (aphg) this.instance;
        aphg aphgVar2 = aphg.a;
        aony aonyVar = aphgVar.c;
        if (!aonyVar.c()) {
            aphgVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) aphgVar.c);
    }

    public final void cj(Iterable iterable) {
        copyOnWrite();
        aphg aphgVar = (aphg) this.instance;
        aphg aphgVar2 = aphg.a;
        aony aonyVar = aphgVar.b;
        if (!aonyVar.c()) {
            aphgVar.b = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) aphgVar.b);
    }

    public final void ck(aqyi aqyiVar) {
        copyOnWrite();
        aqyg aqygVar = (aqyg) this.instance;
        aqyg aqygVar2 = aqyg.a;
        aqyiVar.getClass();
        aqygVar.a();
        aqygVar.c.add(aqyiVar);
    }

    public final void cl(Iterable iterable) {
        copyOnWrite();
        aryr aryrVar = (aryr) this.instance;
        aryr aryrVar2 = aryr.a;
        aony aonyVar = aryrVar.F;
        if (!aonyVar.c()) {
            aryrVar.F = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) aryrVar.F);
    }

    public final void cm(Iterable iterable) {
        copyOnWrite();
        askd askdVar = (askd) this.instance;
        askd askdVar2 = askd.a;
        askdVar.a();
        aolo.addAll(iterable, (List) askdVar.e);
    }

    public final void cn(askg askgVar) {
        copyOnWrite();
        askd askdVar = (askd) this.instance;
        askd askdVar2 = askd.a;
        askgVar.getClass();
        askdVar.a();
        askdVar.e.add(askgVar);
    }

    public final void co(askf askfVar) {
        copyOnWrite();
        askd askdVar = (askd) this.instance;
        askd askdVar2 = askd.a;
        askfVar.getClass();
        askdVar.e();
        askdVar.f.add(askfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aone
    public final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        aonh aonhVar = (aonh) this.instance;
        aonhVar.l = aonhVar.l.clone();
    }

    public final void cp(Iterable iterable) {
        copyOnWrite();
        atpo atpoVar = (atpo) this.instance;
        aonv aonvVar = atpo.a;
        atpoVar.a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            atpoVar.e.g(((atpl) it.next()).e);
        }
    }

    public final void cq(atpl atplVar) {
        copyOnWrite();
        atpo atpoVar = (atpo) this.instance;
        aonv aonvVar = atpo.a;
        atplVar.getClass();
        atpoVar.a();
        atpoVar.e.g(atplVar.e);
    }

    public final void cr(aulq aulqVar) {
        copyOnWrite();
        aubw aubwVar = (aubw) this.instance;
        aubw aubwVar2 = aubw.a;
        aulqVar.getClass();
        aony aonyVar = aubwVar.w;
        if (!aonyVar.c()) {
            aubwVar.w = aonm.mutableCopy(aonyVar);
        }
        aubwVar.w.add(aulqVar);
    }

    public final void cs(aulq aulqVar) {
        copyOnWrite();
        auwd auwdVar = (auwd) this.instance;
        auwd auwdVar2 = auwd.a;
        aulqVar.getClass();
        aony aonyVar = auwdVar.c;
        if (!aonyVar.c()) {
            auwdVar.c = aonm.mutableCopy(aonyVar);
        }
        auwdVar.c.add(aulqVar);
    }

    public final void ct(avgf avgfVar) {
        copyOnWrite();
        avgg avggVar = (avgg) this.instance;
        avgg avggVar2 = avgg.a;
        avgfVar.getClass();
        avggVar.a();
        avggVar.c.add(avgfVar);
    }

    public final awcq cu(int i) {
        return (awcq) ((awcx) this.instance).c.get(i);
    }

    public final void cv(aone aoneVar) {
        copyOnWrite();
        aqdb aqdbVar = (aqdb) this.instance;
        avfv avfvVar = (avfv) aoneVar.build();
        aqdb aqdbVar2 = aqdb.a;
        avfvVar.getClass();
        aony aonyVar = aqdbVar.x;
        if (!aonyVar.c()) {
            aqdbVar.x = aonm.mutableCopy(aonyVar);
        }
        aqdbVar.x.add(avfvVar);
    }

    public final void cw(aong aongVar) {
        copyOnWrite();
        aqyg aqygVar = (aqyg) this.instance;
        aqyi aqyiVar = (aqyi) aongVar.build();
        aqyg aqygVar2 = aqyg.a;
        aqyiVar.getClass();
        aqygVar.a();
        aqygVar.c.add(aqyiVar);
    }

    public final void cx(aone aoneVar) {
        copyOnWrite();
        askd askdVar = (askd) this.instance;
        askg askgVar = (askg) aoneVar.build();
        askd askdVar2 = askd.a;
        askgVar.getClass();
        askdVar.a();
        askdVar.e.add(askgVar);
    }

    public final void cy(aone aoneVar) {
        copyOnWrite();
        askd askdVar = (askd) this.instance;
        askf askfVar = (askf) aoneVar.build();
        askd askdVar2 = askd.a;
        askfVar.getClass();
        askdVar.e();
        askdVar.f.add(askfVar);
    }

    public final void cz(aone aoneVar) {
        copyOnWrite();
        aubs aubsVar = (aubs) this.instance;
        aubr aubrVar = (aubr) aoneVar.build();
        aubs aubsVar2 = aubs.a;
        aubrVar.getClass();
        aubsVar.a();
        aubsVar.i.add(aubrVar);
    }

    public final void d(aomu aomuVar) {
        aonk checkIsLite;
        checkIsLite = aonm.checkIsLite(aomuVar);
        cE(checkIsLite);
        copyOnWrite();
        aomz cD = cD();
        cD.b.remove(checkIsLite.d);
        if (cD.b.isEmpty()) {
            cD.d = false;
        }
    }

    public final void e(aomu aomuVar, Object obj) {
        aonk checkIsLite;
        checkIsLite = aonm.checkIsLite(aomuVar);
        cE(checkIsLite);
        copyOnWrite();
        aomz cD = cD();
        aonj aonjVar = checkIsLite.d;
        if (aonjVar.d) {
            if (aonjVar.a() == aoqo.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(checkIsLite.d(it.next()));
                }
                obj = arrayList;
            }
        } else {
            obj = checkIsLite.d(obj);
        }
        cD.n(aonjVar, obj);
    }

    @Override // defpackage.aoni
    public final Object pX(aomu aomuVar) {
        return ((aonh) this.instance).pX(aomuVar);
    }

    @Override // defpackage.aoni
    public final boolean pY(aomu aomuVar) {
        return ((aonh) this.instance).pY(aomuVar);
    }

    public aong(aonh aonhVar) {
        super(aonhVar);
    }
}
