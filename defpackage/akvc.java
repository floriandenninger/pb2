package defpackage;

import android.graphics.Bitmap;
import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvc {
    public final ylf a;
    private final axpg b;
    private final axpg c;
    private final akwm d;
    private final Executor e;
    private final axze f;

    public akvc(axpg axpgVar, axpg axpgVar2, akwm akwmVar, ylf ylfVar, Executor executor, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = axpgVar;
        this.c = axpgVar2;
        this.d = akwmVar;
        this.a = ylfVar;
        this.e = executor;
        this.f = axzeVar;
    }

    public final void a() {
        try {
            this.e.execute(new Runnable() { // from class: akvb
                @Override // java.lang.Runnable
                public final void run() {
                    akvc akvcVar = akvc.this;
                    akvcVar.a.c("yt_upload_wifi_req");
                    akvcVar.a.c("yt_upload_network_req");
                    akvcVar.a.b("yt_upload_long_retry");
                }
            });
            Map d = this.d.d(akgg.f);
            if (!d.isEmpty()) {
                akvq akvqVar = (akvq) this.b.get();
                for (akzs akzsVar : d.values()) {
                    akzh a = akzi.a(akzsVar.k);
                    if ((akzsVar.b & 2048) != 0) {
                        a.c = akzsVar.n.I();
                    }
                    akwg akwgVar = akvqVar.o;
                    ammv x = akwg.x(akzsVar);
                    if (x.h()) {
                        a.b = (Bitmap) x.c();
                    }
                    ((akze) akvqVar.l.get()).B(a.a());
                    akvqVar.j.b(akzsVar.k);
                }
            }
            if (this.d.d(akgg.e).isEmpty()) {
                return;
            }
            final akux akuxVar = (akux) this.c.get();
            ynm.j(anaf.T(new anfy() { // from class: akub
                @Override // defpackage.anfy
                public final anhy a() {
                    final akux akuxVar2 = akux.this;
                    List t = akuxVar2.t(new ayrw() { // from class: akuq
                        @Override // defpackage.ayrw
                        public final boolean a(Object obj) {
                            akux akuxVar3 = akux.this;
                            return Duration.between(Instant.ofEpochMilli(((akzs) obj).h), Instant.ofEpochMilli(akuxVar3.b.c())).compareTo(akuxVar3.r()) > 0;
                        }
                    }, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_TIMED_OUT_CREATION);
                    Map d2 = akuxVar2.i.d(akgg.c);
                    d2.values().removeAll(t);
                    Iterator it = d2.values().iterator();
                    while (it.hasNext()) {
                        akuxVar2.n.b(((akzs) it.next()).k);
                    }
                    HashSet<akzs> hashSet = new HashSet();
                    for (akzs akzsVar2 : d2.values()) {
                        if ((akzsVar2.b & 128) == 0 || (akzsVar2.u && albw.c(akzsVar2))) {
                            akuxVar2.a(akzsVar2);
                        } else {
                            hashSet.add(akzsVar2);
                        }
                    }
                    for (akzs akzsVar3 : hashSet) {
                        if (akzsVar3.u) {
                            akzh a2 = akzi.a(akzsVar3.k);
                            if ((akzsVar3.b & 2048) != 0) {
                                a2.c = akzsVar3.n.I();
                            }
                            ammv x2 = akwg.x(akzsVar3);
                            if (x2.h()) {
                                a2.b = (Bitmap) x2.c();
                            }
                            ((akze) akuxVar2.j.get()).B(a2.a());
                        } else {
                            akuxVar2.a(akzsVar3);
                            akuxVar2.l.e(akzsVar3.k);
                        }
                    }
                    return anhv.a;
                }
            }, akuxVar.e), akuxVar.v(), new akum(akuxVar, 1));
        } catch (akwn e) {
            this.f.e("Failed to resume uploads.", e);
            zga.f("PendingUploadsChecker", "Failed to resume uploads.", e);
        }
    }
}
