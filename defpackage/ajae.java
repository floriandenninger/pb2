package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajae extends ajbh {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public final azrw b;
    public final aifk c;
    public azqv d;
    public final Set e;
    public long f = a;
    public boolean g;
    public ajat h;
    private final ScheduledExecutorService j;
    private final azrw k;
    private final Handler l;
    private final Executor m;
    private final aaea n;
    private final SecureRandom o;
    private final aapf p;
    private final acpl q;
    private ajad r;
    private aizz s;
    private final AtomicInteger t;
    private final aiow u;

    public ajae(azrw azrwVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar2, aiow aiowVar, Handler handler, Executor executor, aaea aaeaVar, aifk aifkVar, SecureRandom secureRandom, aapf aapfVar, acpl acplVar) {
        azrwVar.getClass();
        this.b = azrwVar;
        scheduledExecutorService.getClass();
        this.j = scheduledExecutorService;
        azrwVar2.getClass();
        this.k = azrwVar2;
        this.u = aiowVar;
        handler.getClass();
        this.l = handler;
        this.e = new HashSet();
        this.d = azqv.ap();
        this.m = executor;
        this.n = aaeaVar;
        this.c = aifkVar;
        this.o = secureRandom;
        this.t = new AtomicInteger();
        this.p = aapfVar;
        this.q = acplVar;
    }

    private final void Z() {
        aizz aizzVar = this.s;
        if (aizzVar != null) {
            aizzVar.b();
            this.s = null;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ajai) it.next()).i();
        }
        this.e.clear();
        this.d.sh();
    }

    private final void aa(final aigr aigrVar, aryi aryiVar, boolean z) {
        ac();
        acpl acplVar = this.q;
        aone createBuilder = ardw.a.createBuilder();
        if (aryiVar != null) {
            aomf aomfVar = aryiVar.p;
            createBuilder.copyOnWrite();
            ardw ardwVar = (ardw) createBuilder.instance;
            aomfVar.getClass();
            ardwVar.b |= 1;
            ardwVar.c = aomfVar;
        }
        createBuilder.copyOnWrite();
        ardw ardwVar2 = (ardw) createBuilder.instance;
        ardwVar2.b |= 2;
        ardwVar2.d = z;
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).cF((ardw) createBuilder.build());
        acplVar.c((arpp) a2.build());
        if (this.h != null) {
            this.l.post(new Runnable() { // from class: aizw
                @Override // java.lang.Runnable
                public final void run() {
                    ajae ajaeVar = ajae.this;
                    ajaeVar.h.e(aigrVar);
                }
            });
        }
    }

    private final synchronized void ab(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ajai ajaiVar = (ajai) it.next();
            ajaiVar.i();
            this.e.remove(ajaiVar);
        }
    }

    private final void ac() {
        this.t.set(0);
    }

    private final void ad() {
        arya aryaVar;
        ArrayList arrayList = new ArrayList();
        ajad ajadVar = this.r;
        if (ajadVar == null) {
            ab(this.e);
            return;
        }
        aryi aryiVar = ajadVar.c;
        aryb arybVar = ajadVar.e;
        if (arybVar != null) {
            aryaVar = arybVar.j;
            if (aryaVar == null) {
                aryaVar = arya.a;
            }
        } else {
            aryaVar = null;
        }
        aizz aizzVar = new aizz(this, ajadVar);
        ajag a2 = aizzVar.a();
        a2.c = aryiVar;
        a2.e = aryaVar;
        ajah a3 = a2.a();
        boolean z = false;
        boolean z2 = false;
        for (ajai ajaiVar : this.e) {
            if (ajaiVar.j(ajadVar, null)) {
                ajaf e = ajaiVar.e();
                if (e != null) {
                    aizzVar.f.add(e);
                }
                int a4 = ajaiVar.a(a3);
                if (a4 == 0) {
                    z2 = true;
                } else if (a4 == 4) {
                    aigr c = ajaiVar.c(a3.a);
                    if (c != null) {
                        ae(aizzVar, c);
                        z = true;
                    }
                } else if (a4 != 5) {
                    arrayList.add(ajaiVar);
                }
            } else {
                arrayList.add(ajaiVar);
            }
        }
        if (!z && z2) {
            ag(aizzVar, this.f);
        }
        aryi aryiVar2 = a3.a;
        if (aryiVar2 != null) {
            this.d.c(aryiVar2);
        }
        ab(arrayList);
    }

    private final synchronized void ae(aizz aizzVar, aigr aigrVar) {
        ac();
        this.s = aizzVar;
        D(aigrVar);
    }

    private final synchronized void af(long j) {
        aizz aizzVar = this.s;
        if (aizzVar != null) {
            C(aizzVar, j);
        }
    }

    private final synchronized void ag(aizz aizzVar, long j) {
        ac();
        this.s = aizzVar;
        C(aizzVar, j);
    }

    private static boolean ah(aryi aryiVar) {
        if (aryiVar == null || (aryiVar.b & 131072) == 0) {
            return false;
        }
        aryc arycVar = aryiVar.n;
        if (arycVar == null) {
            arycVar = aryc.a;
        }
        if ((arycVar.b & 1) == 0) {
            return false;
        }
        aryc arycVar2 = aryiVar.n;
        if (arycVar2 == null) {
            arycVar2 = aryc.a;
        }
        asti astiVar = arycVar2.c;
        if (astiVar == null) {
            astiVar = asti.a;
        }
        if ((astiVar.b & 32) == 0) {
            return false;
        }
        aryc arycVar3 = aryiVar.n;
        if (arycVar3 == null) {
            arycVar3 = aryc.a;
        }
        asti astiVar2 = arycVar3.c;
        if (astiVar2 == null) {
            astiVar2 = asti.a;
        }
        return astiVar2.f > 0;
    }

    public final void A(PlayerResponseModel playerResponseModel, String str) {
        byte[] bArr;
        aryi aryiVar;
        Boolean bool;
        boolean z;
        int bG;
        if (playerResponseModel != null) {
            aizz aizzVar = this.s;
            if (aizzVar == null || !aizzVar.c()) {
                aryb p = playerResponseModel.p();
                if (!this.g) {
                    if (aifk.i(this.n)) {
                        aapf aapfVar = this.p;
                        aryi q = playerResponseModel.q();
                        if (q != null && (q.b & 131072) != 0 && (bG = anaf.bG(q.c)) != 0 && bG == 7 && playerResponseModel.j(aapfVar) != null) {
                            z = true;
                            this.g = z;
                        }
                    }
                    z = false;
                    this.g = z;
                }
                String y = playerResponseModel.y();
                byte[] G = playerResponseModel.G();
                aryi q2 = playerResponseModel.q();
                ajac ajacVar = new ajac();
                ajacVar.a(y);
                ajacVar.c(G);
                if (q2 != null) {
                    ajacVar.c = q2;
                    ajacVar.b(false);
                    ajacVar.d = playerResponseModel.c;
                    ajacVar.a(playerResponseModel.y());
                    ajacVar.e = p;
                    ajacVar.c(playerResponseModel.G());
                    ajacVar.g = playerResponseModel.s();
                    ajacVar.b(this.g);
                    ajacVar.i = str;
                    if (p != null) {
                        ajacVar.f = p.i;
                    }
                    String str2 = ajacVar.a;
                    if (str2 == null || (bArr = ajacVar.b) == null || (aryiVar = ajacVar.c) == null || (bool = ajacVar.h) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (ajacVar.a == null) {
                            sb.append(" currentVideoId");
                        }
                        if (ajacVar.b == null) {
                            sb.append(" trackingParams");
                        }
                        if (ajacVar.c == null) {
                            sb.append(" initialPlayabilityStatus");
                        }
                        if (ajacVar.h == null) {
                            sb.append(" enablePremiereTrailerCodepath");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.r = new ajad(str2, bArr, aryiVar, ajacVar.d, ajacVar.e, ajacVar.f, ajacVar.g, bool.booleanValue(), ajacVar.i);
                    this.f = w(null);
                    ad();
                    return;
                }
                throw new NullPointerException("Null initialPlayabilityStatus");
            }
        }
    }

    public final void B() {
        this.r = null;
        this.f = a;
        Z();
    }

    public final synchronized void C(aizz aizzVar, long j) {
        aizzVar.a = this.j.schedule(aizzVar, j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void D(aigr aigrVar) {
        ajad ajadVar;
        if (this.s != null && (ajadVar = this.r) != null) {
            aryb arybVar = ajadVar.e;
            boolean z = ajadVar.h;
            int incrementAndGet = this.t.incrementAndGet();
            if ((!z && !this.c.u()) || arybVar == null) {
                ac();
                af(this.f);
            } else if (incrementAndGet <= arybVar.e) {
                af((this.t.get() * 2000) + (this.o.nextInt(999) - 499));
            } else if (arybVar.g) {
                ac();
                af(this.f);
            } else {
                aa(aigrVar, null, true);
            }
        }
    }

    @Override // defpackage.ajbh
    public final void E(ajat ajatVar) {
        this.h = ajatVar;
    }

    public final synchronized boolean F(final ajah ajahVar) {
        int bG;
        aryi aryiVar = ajahVar.a;
        ArrayList arrayList = new ArrayList();
        aigr aigrVar = null;
        boolean z = false;
        aigr aigrVar2 = null;
        boolean z2 = false;
        for (ajai ajaiVar : this.e) {
            if (ajaiVar.j(this.r, ajahVar)) {
                int b = ajaiVar.b(ajahVar);
                if (b == 1) {
                    arrayList.add(ajaiVar);
                } else if (b == 2) {
                    aigrVar = ajaiVar.c(aryiVar);
                } else {
                    if (b != 0) {
                        if (b == 3) {
                            if (this.h != null && ahbx.n(aryiVar)) {
                                this.m.execute(new Runnable() { // from class: aizx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ajae ajaeVar = ajae.this;
                                        if (ajahVar.a()) {
                                            return;
                                        }
                                        aiwq aiwqVar = (aiwq) ajaeVar.h;
                                        aiwqVar.T();
                                        aiwqVar.i.f();
                                    }
                                });
                            }
                        } else if (b == 4) {
                            aigrVar2 = ajaiVar.c(aryiVar);
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (aryiVar != null) {
            this.d.c(aryiVar);
        }
        ab(arrayList);
        if (aigrVar != null) {
            aa(aigrVar, aryiVar, false);
            this.u.b(aigrVar);
        } else if (aigrVar2 != null) {
            D(aigrVar2);
        } else {
            if (aryiVar != null && (bG = anaf.bG(aryiVar.c)) != 0 && bG == 3) {
                this.u.b(new aigr(3, 2, aryiVar.d));
            }
            if (this.e.isEmpty()) {
                return false;
            }
            z = z2;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r1.get() != false) goto L18;
     */
    @Override // defpackage.ajbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void aj(defpackage.ahef r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            aign r0 = defpackage.aign.NEW     // Catch: java.lang.Throwable -> La3
            aign r0 = r5.c()     // Catch: java.lang.Throwable -> La3
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L88
            r1 = 1
            if (r0 == r1) goto L81
            r1 = 2
            if (r0 == r1) goto L6a
            r1 = 8
            if (r0 == r1) goto L5c
            r1 = 9
            if (r0 == r1) goto L1d
            goto L8b
        L1d:
            boolean r0 = r4.g     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L4e
            aifk r0 = r4.c     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            axzg r0 = r0.d     // Catch: java.lang.Throwable -> La3
            aaea r0 = r0.a     // Catch: java.lang.Throwable -> La3
            aypy r0 = r0.a     // Catch: java.lang.Throwable -> La3
            axzc r2 = defpackage.axzc.a     // Catch: java.lang.Throwable -> La3
            aypy r0 = r0.Y(r2)     // Catch: java.lang.Throwable -> La3
            aypy r0 = r0.B()     // Catch: java.lang.Throwable -> La3
            lgx r2 = new lgx     // Catch: java.lang.Throwable -> La3
            r3 = 11
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> La3
            ayqx r0 = r0.ax(r2)     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> La3
            defpackage.ayrz.c(r0)     // Catch: java.lang.Throwable -> La3
            boolean r0 = r1.get()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L8b
        L4e:
            aizz r0 = r4.s     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L58
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L8b
        L58:
            r4.ad()     // Catch: java.lang.Throwable -> La3
            goto L8b
        L5c:
            aizz r0 = r4.s     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L66
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L8b
        L66:
            r4.ad()     // Catch: java.lang.Throwable -> La3
            goto L8b
        L6a:
            java.lang.String r0 = r5.k()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L75
            java.lang.String r0 = r5.k()     // Catch: java.lang.Throwable -> La3
            goto L79
        L75:
            java.lang.String r0 = r5.e()     // Catch: java.lang.Throwable -> La3
        L79:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r5.b()     // Catch: java.lang.Throwable -> La3
            r4.A(r1, r0)     // Catch: java.lang.Throwable -> La3
            goto L8b
        L81:
            r4.B()     // Catch: java.lang.Throwable -> La3
            r4.y()     // Catch: java.lang.Throwable -> La3
            goto L8b
        L88:
            r4.B()     // Catch: java.lang.Throwable -> La3
        L8b:
            java.util.Set r0 = r4.e     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La3
        L91:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> La3
            ajai r1 = (defpackage.ajai) r1     // Catch: java.lang.Throwable -> La3
            r1.f(r5)     // Catch: java.lang.Throwable -> La3
            goto L91
        La1:
            monitor-exit(r4)
            return
        La3:
            r5 = move-exception
            monitor-exit(r4)
            goto La7
        La6:
            throw r5
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajae.aj(ahef):void");
    }

    @Override // defpackage.ajbh
    public final void c(String str) {
        aizz aizzVar = this.s;
        if (aizzVar != null) {
            aizzVar.b();
            this.s = null;
        }
    }

    @Override // defpackage.ajbh
    public final synchronized void e(aheg ahegVar) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ajai) it.next()).g(ahegVar);
        }
    }

    @Override // defpackage.ajbh
    public final void t() {
        Z();
        y();
        ad();
    }

    @Override // defpackage.ajbh
    public final void v(ahej ahejVar) {
        aizz aizzVar;
        aryi aryiVar;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ajai) it.next()).h(ahejVar);
        }
        if (ahejVar.a() != 5 || (aizzVar = this.s) == null || (aryiVar = aizzVar.b) == null) {
            return;
        }
        ajag a2 = aizzVar.a();
        a2.c = aryiVar;
        a2.d = aizzVar.c;
        a2.e = aizzVar.d;
        F(a2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long w(arxn arxnVar) {
        ajad ajadVar = this.r;
        if (ajadVar == null || (!ajadVar.h && !this.c.u())) {
            atys e = aifk.e(this.n);
            if (e != null && e.E) {
                if (arxnVar != null) {
                    aryi aryiVar = arxnVar.d;
                    if (aryiVar == null) {
                        aryiVar = aryi.a;
                    }
                    if (ah(aryiVar)) {
                        aryc arycVar = aryiVar.n;
                        if (arycVar == null) {
                            arycVar = aryc.a;
                        }
                        asti astiVar = arycVar.c;
                        if (astiVar == null) {
                            astiVar = asti.a;
                        }
                        return astiVar.f;
                    }
                } else if (ajadVar != null) {
                    aryi aryiVar2 = ajadVar.c;
                    if (ah(aryiVar2)) {
                        aryc arycVar2 = aryiVar2.n;
                        if (arycVar2 == null) {
                            arycVar2 = aryc.a;
                        }
                        asti astiVar2 = arycVar2.c;
                        if (astiVar2 == null) {
                            astiVar2 = asti.a;
                        }
                        return astiVar2.f;
                    }
                }
            }
            return this.f;
        }
        if (arxnVar != null) {
            if ((arxnVar.b & 32) != 0) {
                long j = arxnVar.f;
                if (j > 0) {
                    return j;
                }
            }
            aryi aryiVar3 = arxnVar.d;
            if (aryiVar3 == null) {
                aryiVar3 = aryi.a;
            }
            if (ah(aryiVar3)) {
                aryc arycVar3 = aryiVar3.n;
                if (arycVar3 == null) {
                    arycVar3 = aryc.a;
                }
                asti astiVar3 = arycVar3.c;
                if (astiVar3 == null) {
                    astiVar3 = asti.a;
                }
                return astiVar3.f;
            }
        }
        aryb arybVar = ajadVar.e;
        if (arybVar != null && (arybVar.b & 2) != 0) {
            long j2 = arybVar.d;
            if (j2 > 0) {
                return j2;
            }
        }
        aryi aryiVar4 = ajadVar.c;
        if (!ah(aryiVar4)) {
            return a;
        }
        aryc arycVar4 = aryiVar4.n;
        if (arycVar4 == null) {
            arycVar4 = aryc.a;
        }
        asti astiVar4 = arycVar4.c;
        if (astiVar4 == null) {
            astiVar4 = asti.a;
        }
        return astiVar4.f;
    }

    public final void y() {
        this.e.addAll((Collection) this.k.get());
        this.d = azqv.ap();
    }

    public final void z(aypn aypnVar, aypn aypnVar2) {
        final int i = 0;
        final int i2 = 1;
        new ayqw().g(aypnVar.Y(new ayrs(this) { // from class: aizv
            public final /* synthetic */ ajae a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    ajae ajaeVar = this.a;
                    ajbl a2 = ((ahel) obj).a();
                    if (a2.a() == 3) {
                        ajaeVar.B();
                        ajaeVar.y();
                        ajaeVar.A(a2.c(), a2.Z());
                        return;
                    }
                    return;
                }
                this.a.g = false;
            }
        }, airw.f), aypnVar2.X(new ayrs(this) { // from class: aizv
            public final /* synthetic */ ajae a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    ajae ajaeVar = this.a;
                    ajbl a2 = ((ahel) obj).a();
                    if (a2.a() == 3) {
                        ajaeVar.B();
                        ajaeVar.y();
                        ajaeVar.A(a2.c(), a2.Z());
                        return;
                    }
                    return;
                }
                this.a.g = false;
            }
        }));
    }
}
