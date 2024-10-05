package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iih implements afwx {
    final /* synthetic */ ReelSequenceController$PendingContinuation a;
    final /* synthetic */ int b;
    final /* synthetic */ ioo c;
    final /* synthetic */ long d;
    final /* synthetic */ iij e;

    public iih(iij iijVar, ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, int i, ioo iooVar, long j) {
        this.e = iijVar;
        this.a = reelSequenceController$PendingContinuation;
        this.b = i;
        this.c = iooVar;
        this.d = j;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        int i;
        ArrayList arrayList;
        synchronized (this.e.g) {
            this.a.a = false;
        }
        zga.d("ReelWatchSequence Error", cnqVar);
        int i2 = this.b - 1;
        if (i2 >= 0) {
            this.e.a(this.a, this.c, i2);
            return;
        }
        synchronized (this.e.g) {
            arrayList = new ArrayList(this.e.j);
            this.e.j.clear();
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((iii) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final arsg arsgVar = (arsg) obj;
        long d = this.e.e.d();
        long j = this.d;
        Executor executor = this.e.f;
        final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation = this.a;
        final long j2 = d - j;
        executor.execute(new Runnable() { // from class: iig
            @Override // java.lang.Runnable
            public final void run() {
                boolean a;
                boolean a2;
                ArrayList arrayList;
                long j3;
                boolean z;
                Optional of;
                ArrayList arrayList2;
                long j4;
                Optional of2;
                iih iihVar = iih.this;
                ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation2 = reelSequenceController$PendingContinuation;
                arsg arsgVar2 = arsgVar;
                long j5 = j2;
                iij iijVar = iihVar.e;
                String str = (arsgVar2 == null || arsgVar2.d != 5) ? null : (String) arsgVar2.e;
                String str2 = (arsgVar2 == null || arsgVar2.b != 3) ? null : (String) arsgVar2.c;
                synchronized (iijVar.g) {
                    reelSequenceController$PendingContinuation2.a = false;
                    reelSequenceController$PendingContinuation2.b = null;
                    if (!ammx.e(str)) {
                        iijVar.h.b = str;
                    }
                    if (!ammx.e(str2)) {
                        iijVar.i.b = str2;
                    }
                    a = iijVar.h.a();
                    a2 = iijVar.i.a();
                    iijVar.k = !a2;
                }
                if (arsgVar2 != null) {
                    int i = 1;
                    if (arsgVar2.h.size() > 0) {
                        aony aonyVar = arsgVar2.h;
                        ArrayList arrayList3 = new ArrayList(aonyVar.size());
                        ArrayList arrayList4 = new ArrayList(aonyVar.size());
                        for (arse arseVar : amkq.aT(aonyVar)) {
                            if ((arseVar.b & i) != 0) {
                                apxf apxfVar = arseVar.c;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                    apxf apxfVar2 = arseVar.c;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    arrayList3.add(apxfVar2);
                                    if (arseVar.d.d() != 0) {
                                        of2 = Optional.of(arseVar.d);
                                    } else {
                                        of2 = Optional.empty();
                                    }
                                    arrayList4.add(of2);
                                }
                                i = 1;
                            }
                        }
                        ihl ihlVar = iijVar.b;
                        long f = ihlVar.f();
                        igu iguVar = ihlVar.n;
                        amkq.N(arrayList3.size() == arrayList4.size());
                        if (arrayList3.isEmpty()) {
                            j3 = j5;
                            z = a2;
                        } else {
                            synchronized (iguVar.d) {
                                if (iguVar.d.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j4 = 0;
                                } else {
                                    arrayList2 = arrayList3;
                                    j4 = ((ihm) iguVar.d.get(0)).a;
                                }
                                int size = arrayList2.size() - 1;
                                while (size >= 0) {
                                    ArrayList arrayList5 = arrayList2;
                                    apxf apxfVar3 = (apxf) arrayList5.get(size);
                                    amkq.N(apxfVar3.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                                    j4--;
                                    iguVar.d.add(0, new ihm(j4, apxfVar3, (aomf) ((Optional) arrayList4.get(size)).orElse(null), false, iguVar.g));
                                    size--;
                                    a2 = a2;
                                    arrayList2 = arrayList5;
                                    j5 = j5;
                                    arrayList4 = arrayList4;
                                }
                                j3 = j5;
                                z = a2;
                            }
                            iguVar.mw();
                        }
                        int B = ihlVar.n.B(f);
                        if (B != -1) {
                            ihlVar.y = B;
                            ihlVar.o.aa(B);
                            ihj ihjVar = ihlVar.m;
                            if (ihjVar != null && ihjVar.b.j.get() >= 0) {
                                ihjVar.b.i.execute(new ihi(ihjVar, 3));
                            }
                        }
                    } else {
                        j3 = j5;
                        z = a2;
                    }
                    if (arsgVar2.g.size() > 0) {
                        aony<arse> aonyVar2 = arsgVar2.g;
                        ArrayList arrayList6 = new ArrayList(aonyVar2.size());
                        ArrayList arrayList7 = new ArrayList(aonyVar2.size());
                        for (arse arseVar2 : aonyVar2) {
                            if ((arseVar2.b & 1) != 0) {
                                apxf apxfVar4 = arseVar2.c;
                                if (apxfVar4 == null) {
                                    apxfVar4 = apxf.a;
                                }
                                if (apxfVar4.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                    apxf apxfVar5 = arseVar2.c;
                                    if (apxfVar5 == null) {
                                        apxfVar5 = apxf.a;
                                    }
                                    arrayList6.add(apxfVar5);
                                    if (arseVar2.d.d() != 0) {
                                        of = Optional.of(arseVar2.d);
                                    } else {
                                        of = Optional.empty();
                                    }
                                    arrayList7.add(of);
                                }
                            }
                        }
                        iijVar.b.k(arrayList6, arrayList7);
                        iijVar.d.f(arrayList6);
                    }
                    igu iguVar2 = iijVar.b.n;
                    if (iguVar2.f && iguVar2.h != a) {
                        iguVar2.h = a;
                        iguVar2.oc(iguVar2.C());
                    }
                    iijVar.b.n.K(z);
                    Optional optional = (Optional) iijVar.c.get();
                    if (optional.isPresent()) {
                        ((ill) optional.get()).d.b(j3);
                    }
                }
                synchronized (iijVar.g) {
                    arrayList = new ArrayList(iijVar.j);
                    iijVar.j.clear();
                }
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((iii) arrayList.get(i2)).b();
                }
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
