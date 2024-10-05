package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agcs implements agdb, ypd {
    public final Executor a;
    public final String b;
    public final agcq c;
    public final azrw d;
    public final aaea e;
    public int f;
    public final int g;
    int h;
    private final azrw i;
    private final ypa j;
    private final asjk k;
    private final int l;
    private final ylf m;
    private final agco n;

    public agcs(azrw azrwVar, ylf ylfVar, ysy ysyVar, ypa ypaVar, Executor executor, aaea aaeaVar, ajyw ajywVar, azrw azrwVar2, agcq agcqVar, String str, String str2, int i, asjk asjkVar, int i2, byte[] bArr, byte[] bArr2) {
        this.i = azrwVar;
        this.m = ylfVar;
        this.j = ypaVar;
        this.a = executor;
        this.c = agcqVar;
        this.b = str2;
        this.g = i;
        this.k = asjkVar;
        this.d = azrwVar2;
        this.e = aaeaVar;
        zhq.m(str);
        if (ysyVar.o()) {
            this.h = 2;
        } else {
            this.h = 1;
        }
        shf shfVar = (shf) ajywVar.a.get();
        shfVar.getClass();
        afzk afzkVar = (afzk) ajywVar.c.get();
        afzkVar.getClass();
        this.n = new agco(shfVar, afzkVar, ajywVar.b, str2, this);
        this.l = i2;
    }

    private static String h(int i) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("gcm_subscription_retry_topic_");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        asjk asjkVar = this.k;
        if (asjkVar != null) {
            return asjkVar.c;
        }
        return 1;
    }

    public final void b() {
        rpt d;
        if (this.f < a()) {
            int i = this.h;
            final int i2 = 2;
            if (i == 3 || i == 2) {
                final agco agcoVar = this.n;
                int i3 = this.g;
                if (!agcoVar.b.b()) {
                    agcoVar.e.d("Waiting on FirebaseClient to initialize");
                    return;
                }
                final long d2 = agcoVar.a.d();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) agcoVar.c.get();
                final int i4 = 1;
                if (i3 == 1) {
                    final String str = agcoVar.d;
                    rpt d3 = firebaseMessaging.f.d(new rps() { // from class: anym
                        @Override // defpackage.rps
                        public final rpt a(Object obj) {
                            if (i4 == 0) {
                                String str2 = str;
                                anzm anzmVar = (anzm) obj;
                                int i5 = FirebaseMessaging.h;
                                rpt b = anzmVar.b(new anzj("U", str2));
                                anzmVar.f();
                                return b;
                            }
                            String str3 = str;
                            anzm anzmVar2 = (anzm) obj;
                            int i6 = FirebaseMessaging.h;
                            rpt b2 = anzmVar2.b(new anzj("S", str3));
                            anzmVar2.f();
                            return b2;
                        }
                    });
                    i2 = i3;
                    d = d3;
                } else {
                    final String str2 = agcoVar.d;
                    final int i5 = 0;
                    d = firebaseMessaging.f.d(new rps() { // from class: anym
                        @Override // defpackage.rps
                        public final rpt a(Object obj) {
                            if (i5 == 0) {
                                String str22 = str2;
                                anzm anzmVar = (anzm) obj;
                                int i52 = FirebaseMessaging.h;
                                rpt b = anzmVar.b(new anzj("U", str22));
                                anzmVar.f();
                                return b;
                            }
                            String str3 = str2;
                            anzm anzmVar2 = (anzm) obj;
                            int i6 = FirebaseMessaging.h;
                            rpt b2 = anzmVar2.b(new anzj("S", str3));
                            anzmVar2.f();
                            return b2;
                        }
                    });
                }
                d.q(new rpi() { // from class: agcn
                    @Override // defpackage.rpi
                    public final void a(rpt rptVar) {
                        agco agcoVar2 = agco.this;
                        long j = d2;
                        int i6 = i2;
                        if (rptVar.k()) {
                            agdb agdbVar = agcoVar2.e;
                            long d4 = agcoVar2.a.d();
                            agcs agcsVar = (agcs) agdbVar;
                            agcsVar.f++;
                            String.format(Locale.US, "Attempting %s %s %d of %d SUCCESS took %s ms", aear.z(agcsVar.g), agcsVar.b, Integer.valueOf(agcsVar.f), Integer.valueOf(agcsVar.a()), Long.valueOf(d4 - j));
                            if (agcsVar.g == 1) {
                                afzz.c(agcsVar.d, "SUBSCRIBED", true, agcsVar.e);
                            } else {
                                afzz.c(agcsVar.d, "UNSUBSCRIBED", true, agcsVar.e);
                            }
                            final agcw agcwVar = (agcw) agcsVar.c;
                            int i7 = agcwVar.h;
                            if (i7 == 1) {
                                agcwVar.h = 2;
                                Iterator it = new HashSet(agcwVar.c).iterator();
                                while (it.hasNext()) {
                                    ((afzs) it.next()).b(agcwVar.a);
                                }
                                if (agcwVar.c.isEmpty()) {
                                    agcwVar.f.e();
                                    agcwVar.f = null;
                                    agcwVar.b();
                                    return;
                                }
                            } else if (i7 == 3) {
                                agcwVar.h = 4;
                                if (!agcwVar.c.isEmpty()) {
                                    agcwVar.f.e();
                                    agcwVar.f = null;
                                    agcwVar.a();
                                    return;
                                } else if (agcwVar.c.isEmpty()) {
                                    agcwVar.d.execute(new Runnable() { // from class: agct
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            agcw agcwVar2 = agcw.this;
                                            agcv agcvVar = agcwVar2.e;
                                            String str3 = agcwVar2.b;
                                            yjk.f();
                                            agcz agczVar = (agcz) agcvVar;
                                            agczVar.b.remove(str3);
                                            aear.w(agczVar);
                                        }
                                    });
                                }
                            }
                            aear.x(agcwVar, false);
                            agcs agcsVar2 = agcwVar.f;
                            if (agcsVar2 != null) {
                                agcsVar2.e();
                            }
                            agcwVar.f = null;
                            return;
                        }
                        agcoVar2.e.d(String.format(Locale.US, "FCM %s fail", aear.z(i6)));
                    }
                });
            }
        }
    }

    public final void c() {
        this.h = 3;
        this.f = 0;
        b();
    }

    @Override // defpackage.agdb
    public final void d(String str) {
        this.f++;
        String.format(Locale.US, "Attempting %s %s %d of %d FAIL %s", aear.z(this.g), this.b, Integer.valueOf(this.f), Integer.valueOf(a()), str);
        if (this.g == 1) {
            afzz.c(this.d, "SUBSCRIBED", false, this.e);
        } else {
            afzz.c(this.d, "UNSUBSCRIBED", false, this.e);
        }
        zga.c("Exception while attempting to subscribe to GCM topic", str);
        if (this.f >= a()) {
            this.h = 4;
            agcw agcwVar = (agcw) this.c;
            agcwVar.f.e();
            agcwVar.f = null;
            return;
        }
        this.h = 3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asjk asjkVar = this.k;
        int i = this.f;
        int i2 = asjkVar.b;
        double pow = Math.pow(asjkVar.e, i - 1);
        int i3 = asjkVar.d;
        Double.isNaN(i2);
        this.m.e(h(this.l), (int) Math.max(1L, timeUnit.toSeconds(Math.min((int) (r1 * pow), i3))), true, 0, null, null, false);
    }

    public final void e() {
        this.j.m(this);
        ((agcr) ((yla) this.i.get()).a(h(this.l))).a = null;
    }

    public final void g() {
        this.j.g(this);
        String h = h(this.l);
        agcr agcrVar = (agcr) ((yla) this.i.get()).a(h);
        if (agcrVar == null) {
            ((yla) this.i.get()).b(h, umy.n);
            agcrVar = (agcr) ((yla) this.i.get()).a(h);
        }
        agcrVar.a = this;
        if (this.h == 2) {
            this.a.execute(new agcp(this, 0));
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            if (((yro) obj).a() && this.h == 1) {
                this.h = 2;
                this.a.execute(new agcp(this, 1));
                return null;
            }
            this.h = 1;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
