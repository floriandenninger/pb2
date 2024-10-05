package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeuq extends aedn {
    final aezf a;
    afky b;
    final /* synthetic */ aeut c;
    private float d;
    private final poi e;
    private final aeru f;
    private long g = -1;
    private float h;

    public aeuq(aeut aeutVar, aerv aervVar, aezf aezfVar, boolean z) {
        this.c = aeutVar;
        this.b = aervVar.b();
        this.d = aervVar.j;
        this.f = aervVar.a();
        aeqr aeqrVar = aervVar.c;
        this.a = aezfVar;
        aezfVar.l = aervVar.k;
        if (z) {
            if (aezfVar.f != aeqrVar.a) {
                aezfVar.g = 0;
            }
            if (aeutVar.i.s.ai() && aedn.v(aezfVar.l, 16)) {
                aezfVar.r(afje.f);
                aeutVar.z();
            }
        }
        aezfVar.f = aeqrVar.a;
        this.e = new poi(pts.r(aeqrVar.b), 0L);
        this.h = aervVar.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c2 A[Catch: azj -> 0x0232, all -> 0x044f, TryCatch #0 {azj -> 0x0232, blocks: (B:58:0x016b, B:60:0x0175, B:62:0x0189, B:64:0x0195, B:65:0x0197, B:69:0x01a1, B:71:0x01b3, B:72:0x01ba, B:74:0x01bf, B:75:0x01c6, B:77:0x01d6, B:80:0x01e3, B:82:0x01eb, B:84:0x01f4, B:85:0x01fe, B:87:0x0213, B:89:0x0217, B:91:0x0221, B:93:0x022d, B:111:0x01c2), top: B:57:0x016b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b3 A[Catch: azj -> 0x0232, all -> 0x044f, TryCatch #0 {azj -> 0x0232, blocks: (B:58:0x016b, B:60:0x0175, B:62:0x0189, B:64:0x0195, B:65:0x0197, B:69:0x01a1, B:71:0x01b3, B:72:0x01ba, B:74:0x01bf, B:75:0x01c6, B:77:0x01d6, B:80:0x01e3, B:82:0x01eb, B:84:0x01f4, B:85:0x01fe, B:87:0x0213, B:89:0x0217, B:91:0x0221, B:93:0x022d, B:111:0x01c2), top: B:57:0x016b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf A[Catch: azj -> 0x0232, all -> 0x044f, TryCatch #0 {azj -> 0x0232, blocks: (B:58:0x016b, B:60:0x0175, B:62:0x0189, B:64:0x0195, B:65:0x0197, B:69:0x01a1, B:71:0x01b3, B:72:0x01ba, B:74:0x01bf, B:75:0x01c6, B:77:0x01d6, B:80:0x01e3, B:82:0x01eb, B:84:0x01f4, B:85:0x01fe, B:87:0x0213, B:89:0x0217, B:91:0x0221, B:93:0x022d, B:111:0x01c2), top: B:57:0x016b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb A[Catch: azj -> 0x0232, all -> 0x044f, TryCatch #0 {azj -> 0x0232, blocks: (B:58:0x016b, B:60:0x0175, B:62:0x0189, B:64:0x0195, B:65:0x0197, B:69:0x01a1, B:71:0x01b3, B:72:0x01ba, B:74:0x01bf, B:75:0x01c6, B:77:0x01d6, B:80:0x01e3, B:82:0x01eb, B:84:0x01f4, B:85:0x01fe, B:87:0x0213, B:89:0x0217, B:91:0x0221, B:93:0x022d, B:111:0x01c2), top: B:57:0x016b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4 A[Catch: azj -> 0x0232, all -> 0x044f, TryCatch #0 {azj -> 0x0232, blocks: (B:58:0x016b, B:60:0x0175, B:62:0x0189, B:64:0x0195, B:65:0x0197, B:69:0x01a1, B:71:0x01b3, B:72:0x01ba, B:74:0x01bf, B:75:0x01c6, B:77:0x01d6, B:80:0x01e3, B:82:0x01eb, B:84:0x01f4, B:85:0x01fe, B:87:0x0213, B:89:0x0217, B:91:0x0221, B:93:0x022d, B:111:0x01c2), top: B:57:0x016b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeuq.V():void");
    }

    @Override // defpackage.aedn
    public final aezf d(String str, PlayerConfigModel playerConfigModel, aeru aeruVar, VideoStreamingData videoStreamingData, int i) {
        if (!this.c.i.s.p().v) {
            aquz aquzVar = playerConfigModel.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            if (!aquzVar.be && this.a.a.equals(str) && this.a.a() == playerConfigModel && this.a.b() == videoStreamingData) {
                bbr bbrVar = this.c.E;
                if (bbrVar instanceof aevy) {
                    ((aevy) bbrVar).B();
                }
                if (this.c.i.s.p().u) {
                    this.a.b = aeruVar;
                }
                return this.a;
            }
        }
        return null;
    }

    @Override // defpackage.aedn
    public final void e(afky afkyVar) {
        this.b = afkyVar;
    }

    @Override // defpackage.aedn
    public final void f(avl avlVar) {
        aezf aezfVar = this.a;
        aezf aezfVar2 = aezfVar.z;
        afeb afebVar = aezfVar.j;
        this.c.ab(aezfVar);
        if (aezfVar2 == null || afebVar == null) {
            boolean z = aezfVar2 != null;
            boolean z2 = afebVar != null;
            StringBuilder sb = new StringBuilder(128);
            sb.append("queuedPlayback & queuedVideo must be set for transitionToQueuedVideo but queuedPlayback != null:");
            sb.append(z);
            sb.append(", queuedVideo != null:");
            sb.append(z2);
            final String sb2 = sb.toString();
            afsi.b(2, 6, sb2);
            afid.e(afic.EXO, "%s", sb2);
            this.c.k.post(new Runnable() { // from class: aeup
                @Override // java.lang.Runnable
                public final void run() {
                    aeuq aeuqVar = aeuq.this;
                    String str = sb2;
                    aeut aeutVar = aeuqVar.c;
                    aeutVar.u(aeuqVar.a.b, new afih("player.fatalexception", aeutVar.g(), new IllegalStateException(str)));
                }
            });
            return;
        }
        if (this.a.F) {
            aeyr aeyrVar = this.c.C;
            synchronized (aeyrVar.e) {
                if (aeyrVar.q(aezfVar2)) {
                    int i = 0;
                    while (true) {
                        if (i >= aeyrVar.d.size()) {
                            i = -1;
                            break;
                        } else if (((aeyk) aeyrVar.d.get(i)).c.equals(aezfVar2)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        aeyrVar.l = (aeyk) aeyrVar.d.get(i);
                        List subList = aeyrVar.d.subList(0, i);
                        Iterator it = subList.iterator();
                        while (it.hasNext()) {
                            ((aeyk) it.next()).b.a();
                        }
                        subList.clear();
                        String b = aeyr.b(aezfVar2);
                        try {
                            affg affgVar = aeyrVar.f;
                            afki.d(affgVar.d == 3);
                            aone createBuilder = adxi.a.createBuilder();
                            createBuilder.copyOnWrite();
                            adxi adxiVar = (adxi) createBuilder.instance;
                            b.getClass();
                            adxiVar.b |= 1;
                            adxiVar.c = b;
                            try {
                                try {
                                    synchronized (affgVar.c) {
                                        int i2 = 0;
                                        while (i2 < affgVar.b.size() && !((akpo) affgVar.b.get(i2)).a.equals(b)) {
                                            ((akpo) affgVar.b.get(i2)).b();
                                            i2++;
                                        }
                                        affgVar.b.subList(0, i2).clear();
                                    }
                                } catch (aoob e) {
                                    throw new RuntimeException("Unexpected protobuf error", e);
                                }
                            } catch (RuntimeException e2) {
                                throw new afet(5, "Unexpected error calling into JS.", e2);
                            }
                        } catch (afet e3) {
                            aeyrVar.g(e3, aezfVar2);
                        }
                    } else {
                        aeyrVar.j(aezfVar2);
                    }
                }
            }
        }
        aezf aezfVar3 = this.a;
        long j = aezfVar3.k;
        if (j != -1) {
            aezfVar3.b.y(j);
        } else {
            long j2 = afebVar.a;
            if (j2 != -1) {
                aezfVar3.b.y(j2);
            } else {
                aezfVar3.b.y(aezfVar3.b().d);
            }
        }
        afebVar.b.a().j(aezfVar2.i());
        aezfVar2.c.c(avlVar, true, this.c.g.l());
        if (this.c.g.l() == 3) {
            aezfVar2.b.s(System.currentTimeMillis());
        }
        aerv aervVar = new aerv(afebVar.b);
        aervVar.f = this.b;
        aervVar.s(Integer.valueOf(this.a.l));
        aeuq aeuqVar = new aeuq(this.c, aervVar, aezfVar2, true);
        aetw aetwVar = this.c.i;
        aetwVar.l = true;
        aezfVar2.g = 2;
        aetwVar.f(aezfVar2);
        aevh aevhVar = this.c.h;
        aerv aervVar2 = afebVar.b;
        aevhVar.k(aervVar2.e, aervVar2.a, aervVar2.d);
        aeut aeutVar = this.c;
        aeutVar.d.l(this.f, aeutVar.i.s.af(), this.a.a());
        aeut aeutVar2 = this.c;
        aeutVar2.i.i = true;
        aeutVar2.U(aeuqVar);
    }
}
