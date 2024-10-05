package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class aepv implements aepe {
    public final pbn a;
    public final afjf b;
    public final aeps c;
    public final aeqj d;
    public final aepu e;
    public aepq f;
    public int g;
    public int h;
    public byte[] i;
    private final HashMap j;
    private final Handler k;
    private final amnv l;
    private HandlerThread m;
    private Handler n;
    private boolean o;
    private pbj p;
    private Exception q;
    private pbe r;
    private int s = -1;

    public aepv(Looper looper, aeqj aeqjVar, HashMap hashMap, Handler handler, aepq aepqVar, amnv amnvVar, pbn pbnVar, afjf afjfVar) {
        this.d = aeqjVar;
        this.j = hashMap;
        this.k = handler;
        this.f = aepqVar;
        afki.a(amnvVar);
        this.l = amnvVar;
        this.a = pbnVar;
        pbnVar.a(new aepr(this));
        this.b = afjfVar;
        this.c = new aeps(this, looper);
        this.e = new aepu(this, looper);
        this.h = 1;
    }

    public static int i() {
        try {
            return r(new pbn(aeow.a));
        } catch (UnsupportedSchemeException unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r5.equals("L1") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int r(defpackage.pbn r5) {
        /*
            r0 = 0
            r1 = -1
            r2 = 1
            android.media.MediaDrm r5 = r5.a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "securityLevel"
            java.lang.String r5 = r5.getPropertyString(r3)     // Catch: java.lang.Throwable -> L3c
            int r3 = r5.hashCode()     // Catch: java.lang.Throwable -> L3c
            r4 = 2
            switch(r3) {
                case 2405: goto L28;
                case 2406: goto L1e;
                case 2407: goto L14;
                default: goto L13;
            }
        L13:
            goto L31
        L14:
            java.lang.String r0 = "L3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L31
            r0 = 2
            goto L32
        L1e:
            java.lang.String r0 = "L2"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L31
            r0 = 1
            goto L32
        L28:
            java.lang.String r3 = "L1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = -1
        L32:
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L3b
            if (r0 == r4) goto L39
            return r1
        L39:
            r5 = 3
            return r5
        L3b:
            return r2
        L3c:
            r5 = move-exception
            afic r3 = defpackage.afic.DRM
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r5.getLocalizedMessage()
            r2[r0] = r5
            java.lang.String r5 = "Cannot determine Widevine Security Level. Falling back to non-L1: %s"
            defpackage.afid.e(r3, r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepv.r(pbn):int");
    }

    private final void s(boolean z) {
        try {
            this.b.q();
            this.i = this.a.a.openSession();
            this.b.p();
            this.p = new pbj(new MediaCrypto(aeow.a, this.i));
            this.h = 3;
            g();
        } catch (NotProvisionedException e) {
            if (z) {
                try {
                    p();
                    return;
                } catch (Exception e2) {
                    m(e2);
                    return;
                }
            }
            m(e);
        } catch (Exception e3) {
            m(e3);
        }
    }

    private final void t() {
        try {
            this.b.m();
            pbn pbnVar = this.a;
            byte[] bArr = this.i;
            pbe pbeVar = this.r;
            pbl pblVar = new pbl(pbnVar.a.getKeyRequest(bArr, pbeVar.b, pbeVar.a, 1, this.j));
            this.b.l();
            this.b.o();
            this.n.obtainMessage(1, pblVar).sendToTarget();
        } catch (NotProvisionedException e) {
            n(e);
        }
    }

    @Override // defpackage.pbh
    public final int a() {
        return this.h;
    }

    @Override // defpackage.pbh
    public final Exception b() {
        if (this.h == 0) {
            return this.q;
        }
        return null;
    }

    @Override // defpackage.pbh
    public final void c() {
    }

    @Override // defpackage.pbh
    public final void d(pbg pbgVar) {
        int i = this.g + 1;
        this.g = i;
        if (i != 1) {
            return;
        }
        if (this.n == null) {
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new aept(this, this.m.getLooper());
        }
        if (this.r == null) {
            pbe a = pbgVar.a(aeow.a);
            this.r = a;
            if (a == null) {
                m(new IllegalStateException("Media does not support Widevine"));
                return;
            }
        }
        this.h = 2;
        s(true);
    }

    @Override // defpackage.pbh
    public final boolean e(String str) {
        int i = this.h;
        if (i == 3 || i == 4) {
            return h() == 1 && this.p.a(str);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        long j;
        aepg aepgVar = (aepg) this.l.get();
        if (aepgVar != null) {
            try {
                this.a.a.restoreKeys(this.i, aepgVar.a);
                try {
                    HashMap<String, String> queryKeyStatus = this.a.a.queryKeyStatus(this.i);
                    "Offline".equals(queryKeyStatus.get("LicenseType"));
                    "True".equals(queryKeyStatus.get("PersistAllowed"));
                    j = aear.e(queryKeyStatus.get("LicenseDurationRemaining"), 0);
                    "True".equals(queryKeyStatus.get("RenewAllowed"));
                    aear.e(queryKeyStatus.get("LicenseDurationRemaining"), Integer.MAX_VALUE);
                } catch (Exception unused) {
                    afid.d(afic.DRM, "Unable to query key status for Offline License. Falling back to streaming mode.");
                    j = 0;
                }
                if (j > 0) {
                    this.h = 4;
                    this.d.e(aepgVar.b, 0);
                    afic aficVar = afic.ABR;
                    return;
                }
                afid.d(afic.DRM, "Offline license expired. Trying with Streaming License");
            } catch (Exception e) {
                afid.c(afic.DRM, e, "Error trying to restore Widevine keys. Falling back to streaming mode.", new Object[0]);
            }
        } else {
            afic aficVar2 = afic.ABR;
        }
        t();
    }

    @Override // defpackage.aepe
    public final int h() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int r = r(this.a);
        this.s = r;
        return r;
    }

    @Override // defpackage.aepe
    public final pbn j() {
        return this.a;
    }

    @Override // defpackage.pbh
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final pbj f() {
        int i = this.h;
        if (i == 3 || i == 4) {
            return this.p;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.aepe
    public final void l() {
        int i = this.g - 1;
        this.g = i;
        if (i != 0) {
            return;
        }
        this.h = 1;
        this.o = false;
        aeps aepsVar = this.c;
        if (aepsVar != null) {
            aepsVar.removeCallbacksAndMessages(null);
        }
        if (this.n != null) {
            this.e.removeCallbacksAndMessages(null);
            this.n.removeCallbacksAndMessages(null);
            this.n = null;
        }
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.m = null;
        }
        this.r = null;
        this.p = null;
        this.q = null;
        if (this.i != null) {
            this.k.postDelayed(new Runnable() { // from class: aepp
                @Override // java.lang.Runnable
                public final void run() {
                    aepv aepvVar = aepv.this;
                    try {
                        pbn pbnVar = aepvVar.a;
                        pbnVar.a.closeSession(aepvVar.i);
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
                        sb.append("Exception while trying to close DRM Session with a delay of 100 ms: ");
                        sb.append(valueOf);
                        afsi.b(1, 6, sb.toString());
                    }
                    aepvVar.i = null;
                }
            }, 100L);
        }
    }

    public final void m(final Exception exc) {
        this.q = exc;
        final aepq aepqVar = this.f;
        if (aepqVar != null) {
            afic aficVar = afic.DRM;
            amxk amxkVar = new amxk() { // from class: aepn
                @Override // defpackage.amxk
                public final Object a() {
                    return aear.g(aepv.this.a);
                }
            };
            afid.g(amxkVar);
            afid.e(aficVar, "DRM Exception: %s; MediaDRM Metrics: %s", exc.getLocalizedMessage(), amxkVar);
            this.k.post(new Runnable() { // from class: aepo
                @Override // java.lang.Runnable
                public final void run() {
                    aepq aepqVar2 = aepq.this;
                    Exception exc2 = exc;
                    aepx aepxVar = (aepx) aepqVar2;
                    aepe aepeVar = aepxVar.i;
                    if (aepeVar != null) {
                        aear.g(aepeVar.j());
                    }
                    WidevineHelper$Listener widevineHelper$Listener = aepxVar.a;
                    int i = aepxVar.b;
                    yjk.f();
                    afbs afbsVar = (afbs) widevineHelper$Listener;
                    if (i != afbsVar.u()) {
                        return;
                    }
                    afbsVar.F(true);
                    afbsVar.V(afeu.a(exc2, afbsVar.g(), afif.DRM, "keyerror", null, false));
                }
            });
        }
        if (this.h != 4) {
            this.h = 0;
        }
    }

    public final void n(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            p();
        } else {
            m(exc);
        }
    }

    public final void o(Object obj) {
        this.o = false;
        int i = this.h;
        if (i == 2 || i == 3 || i == 4) {
            if (obj instanceof Exception) {
                m((Exception) obj);
                return;
            }
            try {
                this.a.a.provideProvisionResponse((byte[]) obj);
                if (this.h == 2) {
                    s(false);
                } else {
                    g();
                }
            } catch (DeniedByServerException | IllegalStateException e) {
                m(new Exception(e) { // from class: com.google.android.libraries.youtube.media.player.drm.WidevineHelper$DrmProvisionException
                });
            }
        }
    }

    public final void p() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.n.obtainMessage(0, new pbm(this.a.a.getProvisionRequest())).sendToTarget();
    }
}
