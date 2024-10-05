package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldn {
    public final ScheduledExecutorService a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    final Map c = new HashMap();
    final Map d = new HashMap();
    final Map e = new HashMap();
    private final Context f;
    private final akwm g;
    private final akxh h;
    private final akyb i;
    private final alep j;
    private final albz k;
    private final ylf l;
    private final axze m;

    public aldn(Context context, akwm akwmVar, akxh akxhVar, akyb akybVar, ScheduledExecutorService scheduledExecutorService, axze axzeVar, ylf ylfVar, alep alepVar, albz albzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = context;
        this.g = akwmVar;
        this.a = scheduledExecutorService;
        this.m = axzeVar;
        this.h = akxhVar;
        this.i = akybVar;
        this.l = ylfVar;
        this.j = alepVar;
        this.k = albzVar;
    }

    private static void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aldk aldkVar = (aldk) it.next();
            aldkVar.b.d(aldkVar);
            it.remove();
        }
    }

    private final void m(String str, int i) {
        avtq avtqVar;
        try {
            if (this.g.b(str) == null) {
                this.m.d("Unknown Upload job while updating UI for requirements.");
                return;
            }
            if (i == 1 || i == 3) {
                aone createBuilder = akzp.a.createBuilder();
                createBuilder.copyOnWrite();
                akzp akzpVar = (akzp) createBuilder.instance;
                akzpVar.c = 0;
                akzpVar.b = 1 | akzpVar.b;
                if (i == 3) {
                    avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                } else {
                    avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                }
                createBuilder.copyOnWrite();
                akzp akzpVar2 = (akzp) createBuilder.instance;
                akzpVar2.d = avtqVar.aB;
                akzpVar2.b |= 2;
                this.h.g(str, (akzp) createBuilder.build());
            }
        } catch (akwn e) {
            this.m.e("Can't update UI.", e);
        }
    }

    public final void a(aldm aldmVar) {
        this.b.addIfAbsent(aldmVar);
    }

    public final synchronized void b(String str, boolean z) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d.remove(str);
        if (scheduledFuture != null && z) {
            scheduledFuture.cancel(false);
        }
        List list = (List) this.e.remove(str);
        if (list != null) {
            l(list);
        }
    }

    final void c(String str, alcb alcbVar) {
        aldg a;
        akzs b = this.g.b(str);
        if (b == null) {
            String valueOf = String.valueOf(str);
            throw new akwn(valueOf.length() != 0 ? "Job not found ".concat(valueOf) : new String("Job not found "));
        }
        if (!this.c.containsKey(str)) {
            akzq a2 = akzq.a(b.l);
            if (a2 == null) {
                a2 = akzq.UNKNOWN_UPLOAD;
            }
            alcy alcyVar = alcbVar != null ? alcbVar.h : null;
            if (alcyVar != null) {
                a = alcyVar.a();
            } else {
                eer jE = ((alcx) yjj.p(this.f, alcx.class)).jE();
                jE.b(str);
                jE.c(a2);
                a = jE.a().a();
            }
            alec a3 = a.a(b);
            anaf.Y(a3, new aldi(this, str), this.a);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((aldm) it.next()).q(str, b);
            }
            this.k.a(new akyc(null, b));
            this.c.put(str, new aldl(a3));
            return;
        }
        String valueOf2 = String.valueOf(str);
        throw new IllegalStateException(valueOf2.length() != 0 ? "UploadFlow Future already exists for ".concat(valueOf2) : new String("UploadFlow Future already exists for "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        if (r7 == false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.String r22, defpackage.aleb r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aldn.d(java.lang.String, aleb):void");
    }

    public final synchronized boolean e(String str) {
        boolean z;
        if (!this.c.containsKey(str)) {
            c(str, null);
            z = true;
        }
        z = false;
        return z;
    }

    public final synchronized boolean f(String str) {
        return this.c.containsKey(str);
    }

    public final synchronized boolean g(String str) {
        boolean z;
        if (!this.d.containsKey(str)) {
            z = this.e.containsKey(str);
        }
        return z;
    }

    public final synchronized int h(String str) {
        if (!this.c.containsKey(str)) {
            return 2;
        }
        aldl aldlVar = (aldl) this.c.remove(str);
        if (aldlVar == null) {
            return 3;
        }
        if (aldlVar.b == 1) {
            this.a.execute(new aldh(this, str, 0));
        }
        return aldlVar.b;
    }

    public final synchronized void i(String str) {
        akwo akwoVar = null;
        try {
            akzs b = this.g.b(str);
            if (b != null && b.ae) {
                akwoVar = b.af ? new akwo(1) : new akwo(0);
            }
        } catch (akwn e) {
            zga.d("UploadFlowController", e);
        }
        if (akwoVar != null) {
            this.g.a(str, akwoVar);
            return;
        }
        b(str, true);
        aldl aldlVar = (aldl) this.c.get(str);
        if (aldlVar != null) {
            aldlVar.b = 1;
            aldlVar.a.cancel(true);
        }
        akyc a = this.g.a(str, new akwi(this.j, this.i));
        if (aldlVar == null) {
            this.a.execute(new aldh(this, str, 1));
        }
        this.k.a(a);
    }

    public final synchronized void j(alcb alcbVar) {
        try {
            String str = alcbVar.b;
            if (this.c.containsKey(str)) {
                return;
            }
            c(str, alcbVar);
        } catch (Exception unused) {
        }
    }

    public final synchronized void k(String str, boolean z) {
        aldl aldlVar;
        if (f(str) || g(str)) {
            b(str, true);
            if (z) {
                aldlVar = (aldl) this.c.remove(str);
            } else {
                aldlVar = (aldl) this.c.get(str);
            }
            if (aldlVar != null) {
                aldlVar.b = 2;
                if (z) {
                    alec alecVar = aldlVar.a;
                    aldo aldoVar = alecVar.c;
                    synchronized (aldoVar) {
                        aldoVar.a = true;
                    }
                    alecVar.b.cancel(true);
                    return;
                }
                aldlVar.a.cancel(true);
            }
        }
    }
}
