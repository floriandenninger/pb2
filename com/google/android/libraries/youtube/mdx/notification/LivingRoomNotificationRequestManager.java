package com.google.android.libraries.youtube.mdx.notification;

import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager;
import defpackage.abbr;
import defpackage.acpl;
import defpackage.acue;
import defpackage.acun;
import defpackage.acuo;
import defpackage.acvm;
import defpackage.acxm;
import defpackage.adee;
import defpackage.adgc;
import defpackage.adge;
import defpackage.adha;
import defpackage.adlt;
import defpackage.adtp;
import defpackage.agaf;
import defpackage.agal;
import defpackage.agar;
import defpackage.amkq;
import defpackage.amru;
import defpackage.anib;
import defpackage.any;
import defpackage.anzg;
import defpackage.aok;
import defpackage.aony;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.azrw;
import defpackage.bpv;
import defpackage.shf;
import defpackage.ynl;
import defpackage.ynm;
import defpackage.zga;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LivingRoomNotificationRequestManager extends acuo implements any {
    public final acpl c;
    public boolean d;
    private final acxm f;
    private final adtp g;
    private final shf h;
    private final azrw i;
    private final azrw j;
    private final boolean k;
    private final agaf l;
    private final adlt m;
    private final acun n;
    private final anib o;
    private final Executor p;
    private final adee q;
    private boolean r;
    private ayqx s;
    private final int t;
    private final acue u;
    private final anzg v;
    private static final String e = zga.a("MDX.NotificationRequestManager");
    static final long a = TimeUnit.MINUTES.toMillis(60);
    static final long b = TimeUnit.MINUTES.toMillis(1440);

    public LivingRoomNotificationRequestManager(acxm acxmVar, adtp adtpVar, anzg anzgVar, shf shfVar, azrw azrwVar, azrw azrwVar2, agaf agafVar, adlt adltVar, acpl acplVar, acun acunVar, anib anibVar, Executor executor, adee adeeVar, boolean z, acue acueVar, acvm acvmVar, byte[] bArr) {
        super(acvmVar);
        this.f = acxmVar;
        this.g = adtpVar;
        this.v = anzgVar;
        this.h = shfVar;
        this.i = azrwVar;
        this.j = azrwVar2;
        this.l = agafVar;
        this.m = adltVar;
        this.c = acplVar;
        this.n = acunVar;
        this.o = anibVar;
        this.p = executor;
        this.t = acunVar.u;
        this.r = false;
        this.q = adeeVar;
        this.k = z;
        this.u = acueVar;
        this.s = l();
    }

    public static /* synthetic */ void i(Throwable th) {
        String str = e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("Failed to get MDx user context for making notification request: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }

    public static /* synthetic */ void j(Throwable th) {
        String str = e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("Could not retrieve RouteInfo to CastDevice map on discovery complete: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }

    private final ayqx l() {
        return this.u.k().ax(new ayrs() { // from class: adgy
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() == livingRoomNotificationRequestManager.d) {
                    return;
                }
                livingRoomNotificationRequestManager.d = bool.booleanValue();
                livingRoomNotificationRequestManager.rb();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if ((r8.h.c() - r4) < com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.b) goto L42;
     */
    @Override // defpackage.acvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy a() {
        /*
            r8 = this;
            acvk r0 = defpackage.acvl.a()
            boolean r1 = r8.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L48
            shf r1 = r8.h
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            long r5 = r1.c()
            r4.setTimeInMillis(r5)
            r1 = 11
            int r1 = r4.get(r1)
            if (r1 < 0) goto L23
            r4 = 7
            if (r1 >= r4) goto L23
            goto L48
        L23:
            agaf r1 = r8.l
            java.lang.String r4 = "MdxDisableLrNotifThrottleAfterPrevNotifShown"
            boolean r1 = r1.c(r4, r2)
            if (r1 == 0) goto L2f
        L2d:
            r2 = 1
            goto L48
        L2f:
            anzg r1 = r8.v
            long r4 = r1.f()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L2d
            shf r1 = r8.h
            long r6 = r1.c()
            long r6 = r6 - r4
            long r4 = com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.b
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L2d
        L48:
            r0.b(r2)
            r1 = 8
            r0.c(r1)
            boolean r1 = r8.k
            r2 = 3600(0xe10, float:5.045E-42)
            r4 = 15
            if (r3 == r1) goto L5b
            r1 = 3600(0xe10, float:5.045E-42)
            goto L5d
        L5b:
            r1 = 15
        L5d:
            r0.d(r1)
            boolean r1 = r8.k
            if (r3 == r1) goto L65
            goto L67
        L65:
            r2 = 15
        L67:
            r0.e(r2)
            acvl r0 = r0.a()
            anhy r0 = defpackage.anaf.O(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager.a():anhy");
    }

    @Override // defpackage.acvj
    public final String b() {
        return "LivingRoomNotificationRequestManager";
    }

    @Override // defpackage.acvj
    public final void c(amru amruVar) {
        if (!this.n.N) {
            ArrayList arrayList = new ArrayList();
            Iterator it = amruVar.iterator();
            while (it.hasNext()) {
                bpv bpvVar = (bpv) it.next();
                CastDevice a2 = CastDevice.a(bpvVar.q);
                if (a2 == null || a2.e()) {
                    arrayList.add(bpvVar);
                }
            }
            k(arrayList);
            return;
        }
        ynm.k(this.q.a(amru.o(amruVar)), this.p, adha.b, new ynl() { // from class: adgw
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList();
                for (bpv bpvVar2 : map.keySet()) {
                    Optional optional = (Optional) map.get(bpvVar2);
                    if (optional == null || !optional.isPresent() || ((CastDevice) optional.get()).e()) {
                        arrayList2.add(bpvVar2);
                    }
                }
                livingRoomNotificationRequestManager.k(arrayList2);
            }
        });
    }

    @Override // defpackage.acvj
    public final void d() {
    }

    @Override // defpackage.acuo, defpackage.acvj
    public final void h() {
        amkq.N(!this.r);
        ((agar) this.i.get()).a.addFirst(new WeakReference((agal) this.j.get()));
        this.r = true;
    }

    public final void k(List list) {
        final aony aonyVar;
        int size;
        if (list.isEmpty()) {
            return;
        }
        long j = this.v.a.getLong("mdx.lr_notification_last_request_time_ms", 0L);
        if ((j == 0 || this.h.c() - j >= a || this.k) && this.m.g() == null) {
            final String s = this.l.s();
            if (!s.isEmpty() && (size = (aonyVar = this.f.a(list).c).size()) > 0 && size <= this.t) {
                final adgc a2 = adge.a();
                ynm.k(this.g.a(a2), this.o, abbr.u, new ynl() { // from class: adgx
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        LivingRoomNotificationRequestManager livingRoomNotificationRequestManager = LivingRoomNotificationRequestManager.this;
                        adgc adgcVar = a2;
                        List<atbe> list2 = aonyVar;
                        String str = s;
                        int aG = anaf.aG(adgcVar.a().r);
                        aone createBuilder = aqkc.a.createBuilder();
                        for (atbe atbeVar : list2) {
                            aone createBuilder2 = atbd.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            atbd atbdVar = (atbd) createBuilder2.instance;
                            atbeVar.getClass();
                            atbdVar.c = atbeVar;
                            atbdVar.b = 1;
                            createBuilder.copyOnWrite();
                            aqkc aqkcVar = (aqkc) createBuilder.instance;
                            atbd atbdVar2 = (atbd) createBuilder2.build();
                            atbdVar2.getClass();
                            aony aonyVar2 = aqkcVar.c;
                            if (!aonyVar2.c()) {
                                aqkcVar.c = aonm.mutableCopy(aonyVar2);
                            }
                            aqkcVar.c.add(atbdVar2);
                        }
                        if (aG != 0) {
                            createBuilder.copyOnWrite();
                            aqkc aqkcVar2 = (aqkc) createBuilder.instance;
                            aqkcVar2.d = aG - 1;
                            aqkcVar2.b |= 1;
                        }
                        aone createBuilder3 = aqke.a.createBuilder();
                        aomf z = aomf.z(str);
                        createBuilder3.copyOnWrite();
                        aqke aqkeVar = (aqke) createBuilder3.instance;
                        aqkeVar.b |= 1;
                        aqkeVar.c = z;
                        aqke aqkeVar2 = (aqke) createBuilder3.build();
                        aqjz a3 = aqkg.a();
                        a3.copyOnWrite();
                        ((aqkg) a3.instance).o((aqkc) createBuilder.build());
                        a3.copyOnWrite();
                        ((aqkg) a3.instance).q(aqkeVar2);
                        aqkg aqkgVar = (aqkg) a3.build();
                        arpn a4 = arpp.a();
                        a4.copyOnWrite();
                        ((arpp) a4.instance).cq(aqkgVar);
                        livingRoomNotificationRequestManager.c.c((arpp) a4.build());
                    }
                });
            }
            this.v.a.edit().putLong("mdx.lr_notification_last_request_time_ms", this.h.c()).apply();
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayrz.c((AtomicReference) this.s);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.s.e()) {
            this.s = l();
        }
    }
}
