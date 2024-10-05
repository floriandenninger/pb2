package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProviders;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yvi implements Runnable, yuk {
    public final yvo a;
    public final yvg b;
    public final yuf c;
    public final zgi d;
    public final String e;
    private final Executor f;
    private final yuy g;
    private String i;
    private cnc j;
    private long k;
    private yuv m;
    private final yvq n;
    private final ysw o;
    private boolean l = false;
    private final yti h = new yti();

    public yvi(Executor executor, yvo yvoVar, yuy yuyVar, yvg yvgVar, yuf yufVar, zgi zgiVar, String str) {
        this.f = executor;
        this.a = yvoVar;
        this.g = yuyVar;
        this.b = yvgVar;
        this.c = yufVar;
        yue yueVar = (yue) yuyVar;
        this.n = (yvq) yueVar.q.get();
        this.o = yueVar.r;
        this.d = zgiVar;
        this.e = str;
    }

    private final void e(cnm cnmVar) {
        Executor executor;
        this.d.a(this.e, this.a.m(), "Delivering response to caller.", cnmVar.c);
        this.c.a(this.a, cnmVar);
        if (cnmVar.c()) {
            yvq yvqVar = this.n;
            Object obj = cnmVar.a;
            yvqVar.c();
        } else {
            yvq yvqVar2 = this.n;
            cnq cnqVar = cnmVar.c;
            yvqVar2.a();
        }
        this.b.b(this.a, cnmVar);
        final yuv yuvVar = this.m;
        if (yuvVar != null) {
            RequestFinishedInfo requestFinishedInfo = yuvVar.f;
            if (requestFinishedInfo == null || (executor = yuvVar.c) == null) {
                String str = requestFinishedInfo == null ? "requestFinishedInfo doesn't exist." : "requestFinishedListenerExecutor doesn't exist.";
                zgi zgiVar = yuvVar.e;
                String str2 = yuvVar.d;
                String url = requestFinishedInfo == null ? null : requestFinishedInfo.getUrl();
                String format = String.format(Locale.US, "Response is delievered but requestFinishedListener is not notified. Reason: %s", str);
                RequestFinishedInfo requestFinishedInfo2 = yuvVar.f;
                zgiVar.a(str2, url, format, requestFinishedInfo2 != null ? requestFinishedInfo2.getException() : null);
                return;
            }
            executor.execute(new Runnable() { // from class: yut
                @Override // java.lang.Runnable
                public final void run() {
                    yuv yuvVar2 = yuv.this;
                    yuvVar2.b.a(ytj.a(yuvVar2.f, yuvVar2.d));
                }
            });
        }
    }

    public final void a() {
        yvl yvlVar;
        try {
            if (this.c.c()) {
                this.b.a(this.a);
                this.c.d();
                return;
            }
            zia ziaVar = (zia) ((yue) this.g).c.get();
            String m = this.a.m();
            String a = ziaVar.a(m).a(m);
            yuy yuyVar = this.g;
            if (!((yue) yuyVar).v) {
                synchronized (yuyVar) {
                    if (!((yue) yuyVar).v) {
                        ((yue) yuyVar).y = ((yue) yuyVar).j.a.c ? new whl() : null;
                        ((yue) yuyVar).v = true;
                    }
                }
            }
            whl whlVar = ((yue) yuyVar).y;
            if (whlVar != null) {
                whl.z(a);
            }
            HashMap hashMap = new HashMap();
            cnc cncVar = this.j;
            if (cncVar != null) {
                String str = cncVar.b;
                if (str != null) {
                    hashMap.put("If-None-Match", str);
                }
                long j = this.j.d;
                if (j > 0) {
                    hashMap.put("If-Modified-Since", yvh.a.format(new Date(j)));
                }
            }
            yvn yvnVar = yvn.LOW;
            yvo yvoVar = this.a;
            int i = yvoVar.j - 1;
            if (i == 1 || i == 2 || i == 7) {
                hashMap.put("Content-Type", yvoVar.lb());
            }
            hashMap.putAll(this.a.f());
            byte[] qm = this.a.qm();
            if (((yue) this.g).f.j && this.a.la().b() > 0) {
                yuy yuyVar2 = this.g;
                yvlVar = new yva(((yue) yuyVar2).g, ((yue) yuyVar2).n, this.a.la().b());
            } else {
                yvlVar = yvl.c;
            }
            yul yulVar = new yul(((yue) this.g).e, whlVar, this.f, this.a, this.j, this, yvlVar, this.o, null, null, null);
            angq angqVar = angq.a;
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) ((CronetEngine) ((yue) this.g).a.get()).newUrlRequestBuilder(a, yulVar, angqVar);
            builder.allowDirectExecutor();
            if (qm != null) {
                builder.setUploadDataProvider(UploadDataProviders.create(qm), (Executor) angqVar);
            }
            ((yty) ((yue) this.g).b.get()).b(builder, hashMap.entrySet());
            builder.setHttpMethod(whl.A(this.a.j));
            int ordinal = this.a.i().ordinal();
            builder.setPriority(ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? 2 : 4 : 3 : 1);
            builder.addRequestAnnotation(this.h);
            yuy yuyVar3 = this.g;
            ysb ysbVar = ((yue) yuyVar3).h;
            if (ysbVar != null) {
                yuv yuvVar = new yuv(this.h, ysbVar, ((yue) yuyVar3).i, this.e, this.d);
                this.m = yuvVar;
                ysb ysbVar2 = yuvVar.b;
                Executor executor = yuvVar.c;
                if (executor != null) {
                    builder.setRequestFinishedListener(new yuu(yuvVar, yuvVar.d, ysbVar2, executor));
                }
            } else {
                this.d.a(this.e, this.a.m(), "No RequestFinishedListener for this request.", null);
            }
            ExperimentalUrlRequest build = builder.build();
            yulVar.d.c();
            yulVar.f = yulVar.a.d();
            yulVar.c.g(new yui(yulVar, build));
            yst ystVar = (yst) this.a.k(yst.class);
            if (ystVar != null) {
                ystVar.b();
            }
            build.start();
            this.c.b(build);
            this.n.b();
            this.d.a(this.e, a, "Dispatched to network.", null);
        } catch (cnb e) {
            if (d(e)) {
                this.d.a(this.e, this.a.m(), "A retryable auth error thrown when dispatching to network.", e);
                a();
            } else {
                this.d.a(this.e, this.a.m(), "An unretryable auth error thrown when dispatching to network.", e);
                c(null, e);
            }
        } catch (yvs e2) {
            this.d.a(this.e, this.a.m(), "The request is blocked when dispatching to network.", e2);
            c(null, new cnq(e2));
        }
    }

    public final void b(Exception exc) {
        e(cnm.a(new cnq(exc)));
    }

    public final boolean d(cnq cnqVar) {
        try {
            this.a.la().c(cnqVar);
            return true;
        } catch (cnq unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.e, this.a.m(), "Begin executing a request task", null);
        if (this.c.c()) {
            this.d.a(this.e, this.a.m(), "Request canceled", null);
            this.b.a(this.a);
            this.c.d();
            return;
        }
        this.i = this.a.l();
        if (this.a.e) {
            ((yue) this.g).k.f(this.i);
        }
        if (this.a.h) {
            this.j = ((yue) this.g).k.a(this.i);
        }
        cnc cncVar = this.j;
        if (cncVar != null && !cncVar.a()) {
            cnc cncVar2 = this.j;
            c(new cnh(cncVar2.a, cncVar2.g), null);
            if (!this.j.b()) {
                this.d.a(this.e, this.a.m(), "Cache reused.", null);
                return;
            }
        }
        try {
            if (this.g.w() != null) {
                this.l = true;
                afvk w = this.g.w();
                yvo yvoVar = this.a;
                if (yvoVar instanceof afvw) {
                    ynm.i(w.a.c(), new afvi((afvw) yvoVar, 0));
                } else {
                    ynm.i(w.a.d(), new afwo(yvoVar, 1));
                }
                this.k = w.b.d();
            }
            a();
        } catch (Exception e) {
            this.d.a(this.e, this.a.m(), "Unchecked expcetion thrown in run().", e);
            b(e);
        }
    }

    public final void c(final cnh cnhVar, cnq cnqVar) {
        cnc cncVar;
        try {
            if (cnqVar == null) {
                if (this.l && cnhVar != null) {
                    final afvk w = this.g.w();
                    final yvo yvoVar = this.a;
                    final Long valueOf = Long.valueOf(this.k);
                    if (yvoVar instanceof afvw) {
                        final afvw afvwVar = (afvw) yvoVar;
                        final long d = w.b.d() - valueOf.longValue();
                        final anhy c = w.a.c();
                        final anhy e = w.a.e();
                        ynm.m(anaf.I(c, e).a(new Callable() { // from class: afvj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                anhy anhyVar = anhy.this;
                                afvw afvwVar2 = afvwVar;
                                long j = d;
                                cnh cnhVar2 = cnhVar;
                                anhy anhyVar2 = e;
                                if (((Boolean) anaf.W(anhyVar)).booleanValue()) {
                                    zga.g(String.format(Locale.US, "Response for %s took %d ms and had status code %d", afvwVar2.m(), Long.valueOf(j), Integer.valueOf(cnhVar2.a)));
                                }
                                if (!((Boolean) anaf.W(anhyVar2)).booleanValue()) {
                                    return null;
                                }
                                zga.g("Logging response for YouTube API call.");
                                Iterator it = afvwVar2.w(cnhVar2).iterator();
                                while (it.hasNext()) {
                                    zga.g((String) it.next());
                                }
                                return null;
                            }
                        }, angq.a), afka.h);
                    } else {
                        ynm.i(w.a.d(), new ynl() { // from class: afvh
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj) {
                                afvk afvkVar = afvk.this;
                                Long l = valueOf;
                                yvo yvoVar2 = yvoVar;
                                cnh cnhVar2 = cnhVar;
                                if (((Boolean) obj).booleanValue()) {
                                    zga.g(String.format(Locale.US, "Response for %s took %d ms and had status code %d", yvoVar2.m(), Long.valueOf(afvkVar.b.d() - l.longValue()), Integer.valueOf(cnhVar2.a)));
                                }
                            }
                        });
                    }
                }
                cnm qk = this.a.qk(cnhVar);
                if (this.a.h && (cncVar = qk.b) != null) {
                    ((yue) this.g).k.d(this.i, cncVar);
                }
                this.h.a(this.a.g);
                e(qk);
                return;
            }
            cnq d2 = this.a.d(cnqVar);
            this.h.a(this.a.g);
            e(cnm.a(d2));
        } catch (Exception e2) {
            this.d.a(this.e, this.a.m(), "Unchecked exception thrown in returnToCaller().", e2);
            b(e2);
        }
    }
}
