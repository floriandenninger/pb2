package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akux implements akvf {
    public static final /* synthetic */ int t = 0;
    private static final Duration u = Duration.ofHours(24);
    public final Context a;
    public final shf b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public final Executor f;
    public final aaea g;
    public final akwc h;
    public final akwm i;
    public final axpg j;
    public final akxh k;
    public final aldn l;
    public final akyb m;
    public final alcw n;
    final akxi o;
    final Map p = new HashMap();
    final Map q = new ConcurrentHashMap();
    final Map r = new ConcurrentHashMap();
    public final aloh s;
    private final akwd v;
    private final Map w;
    private final axze x;

    public akux(Context context, shf shfVar, Map map, Executor executor, ScheduledExecutorService scheduledExecutorService, Executor executor2, aaea aaeaVar, akwc akwcVar, akwd akwdVar, akwm akwmVar, aldn aldnVar, axpg axpgVar, akxh akxhVar, axze axzeVar, akyb akybVar, alcw alcwVar, aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = shfVar;
        this.w = map;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = anaf.E(executor);
        this.f = executor2;
        this.g = aaeaVar;
        this.h = akwcVar;
        this.v = akwdVar;
        this.i = akwmVar;
        this.l = aldnVar;
        this.j = axpgVar;
        this.x = axzeVar;
        this.m = akybVar;
        akuw akuwVar = new akuw(this);
        this.o = akuwVar;
        alcwVar.getClass();
        this.n = alcwVar;
        this.s = alohVar;
        this.k = akxhVar;
        akxhVar.p(akuwVar);
    }

    private final anhy N(anhy anhyVar, final String str, final String str2) {
        Long c = this.h.c();
        if (c.longValue() > 0) {
            anhyVar = anaf.V(anhyVar, c.longValue(), TimeUnit.SECONDS, this.d);
        }
        ynm.j(anhyVar, v(), new ynk() { // from class: akut
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                akux akuxVar = akux.this;
                String str3 = str;
                String str4 = str2;
                avtk avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_FAILED;
                if (th instanceof TimeoutException) {
                    avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_TIMED_OUT;
                }
                akuxVar.D(str3, avtkVar, str4, th);
            }
        });
        return anhyVar;
    }

    private final anhy O(final String str, final boolean z, final avtp avtpVar) {
        anhy T = anaf.T(new anfy() { // from class: akui
            @Override // defpackage.anfy
            public final anhy a() {
                akux akuxVar = akux.this;
                String str2 = str;
                avtp avtpVar2 = avtpVar;
                boolean z2 = z;
                akzs b = akuxVar.i.b(str2);
                akve akveVar = (akve) akuxVar.r.get(str2);
                anhy O = anaf.O(false);
                if (b == null) {
                    if (akveVar != null) {
                        akuxVar.m.e(str2, null, avtpVar2);
                        return anaf.O(true);
                    }
                    akuxVar.F("Cannot cancel an upload that does not exist.");
                    return O;
                }
                if (!b.u) {
                    akuxVar.C(b, avtpVar2);
                    return anaf.O(true);
                }
                if (!z2) {
                    return O;
                }
                ((akze) akuxVar.j.get()).v(str2);
                return anaf.O(true);
            }
        }, this.e);
        Long c = this.h.c();
        if (c.longValue() > 0) {
            T = anaf.V(T, c.longValue(), TimeUnit.SECONDS, this.d);
        }
        ynm.k(T, v(), new akus(this, str, 1), new ynl() { // from class: akuu
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                akux.this.x(str, ((Boolean) obj).booleanValue());
            }
        });
        return T;
    }

    private final synchronized List P(String str) {
        List list = (List) this.p.get(str);
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, akyc akycVar) {
        boolean z;
        akzs akzsVar = akycVar.b;
        if (akzsVar == null || (akzsVar.b & 128) == 0) {
            return;
        }
        akzq a = akzq.a(akzsVar.l);
        if (a == null) {
            a = akzq.UNKNOWN_UPLOAD;
        }
        aldf aldfVar = (aldf) this.w.get(Integer.valueOf(a.g));
        if (aldfVar == null) {
            throw new UnsupportedOperationException("Cannot reset unknown Upload flavor.");
        }
        if (aldfVar.a(akycVar)) {
            if (this.l.f(str) || this.l.g(str)) {
                if ((this.g.a().b & 4096) != 0) {
                    avuj avujVar = this.g.a().h;
                    if (avujVar == null) {
                        avujVar = avuj.a;
                    }
                    z = avujVar.C;
                } else {
                    z = false;
                }
                this.l.k(str, z);
            }
            akve akveVar = (akve) this.r.get(str);
            if (akveVar != null) {
                Map map = this.r;
                akvd b = akveVar.b();
                b.d(false);
                map.put(str, b.a());
            }
            this.i.a(str, aldfVar.b());
            if (this.l.e(str)) {
                return;
            }
            this.x.d("Unconfirmed UploadFlow execution was not scheduled.");
            zga.c("UploadClientApi", "Unconfirmed UploadFlow execution was not scheduled.");
            this.m.f(str, avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_EXECUTION_NOT_SCHEDULED);
        }
    }

    @Override // defpackage.akvf
    public final synchronized void B(akvt akvtVar) {
        akvtVar.getClass();
        Iterator it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((Map.Entry) it.next()).getValue();
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(akvtVar)) {
                copyOnWriteArrayList.remove(akvtVar);
                if (copyOnWriteArrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void C(akzs akzsVar, avtp avtpVar) {
        amkq.F(!akzsVar.u, "Removal is allowed for the only unconfirmed uploads.");
        String str = akzsVar.k;
        this.m.e(str, null, avtpVar);
        if ((akzsVar.b & 128) == 0) {
            this.i.a(str, new akwo(1));
        } else {
            this.l.i(str);
        }
    }

    public final void D(String str, avtk avtkVar, String str2, Throwable th) {
        if (th == null) {
            this.x.d(str2);
            zga.m("UploadClientApi", str2);
        } else {
            this.x.e(str2, th);
            zga.o("UploadClientApi", str2, th);
        }
        akve akveVar = (akve) this.r.get(str);
        if (akveVar != null) {
            Map map = this.r;
            akvd b = akveVar.b();
            b.c(true);
            map.put(str, b.a());
        }
        Iterator it = P(str).iterator();
        while (it.hasNext()) {
            ((akvt) it.next()).b(str);
        }
        this.m.f(str, avtkVar);
    }

    public final void E(String str) {
        akve akveVar = (akve) this.r.get(str);
        if (akveVar != null) {
            if (!akveVar.o) {
                this.m.f(str, avtk.UPLOAD_CREATION_FAILURE_REASON_NOT_OPENABLE_SOURCE_VIDEO);
            }
            Map map = this.r;
            akvd b = akveVar.b();
            b.d(true);
            map.put(str, b.a());
        }
        Iterator it = P(str).iterator();
        while (it.hasNext()) {
            ((akvt) it.next()).a(str);
        }
    }

    public final void F(String str) {
        this.x.d(str);
        zga.c("UploadClientApi", str);
    }

    public final void G(String str, Throwable th) {
        this.x.e(str, th);
        zga.f("UploadClientApi", str, th);
    }

    @Override // defpackage.akvf
    public final void H(final String str, final afsx afsxVar, final avtn avtnVar, final boolean z) {
        aci.c(new aeu() { // from class: aktu
            @Override // defpackage.aeu
            public final Object a(final aes aesVar) {
                anhy i;
                final akux akuxVar = akux.this;
                final String str2 = str;
                final afsx afsxVar2 = afsxVar;
                final avtn avtnVar2 = avtnVar;
                final boolean z2 = z;
                yjk.f();
                akve akveVar = (akve) akuxVar.r.get(str2);
                if (akveVar == null || akveVar.n || akveVar.b == null || Uri.EMPTY.equals(akveVar.b)) {
                    zga.m("UploadClientApi", "Falling back to ForegroundService async start.");
                    i = anfq.i(akuxVar.k(str2), new anfz() { // from class: akul
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            akux akuxVar2 = akux.this;
                            ammv ammvVar = (ammv) obj;
                            if (ammvVar.h() && !((akve) ammvVar.c()).n) {
                                ((akze) akuxVar2.j.get()).E(((akve) ammvVar.c()).b);
                            }
                            return anaf.O(ammvVar);
                        }
                    }, akuxVar.f);
                } else {
                    try {
                        ((akze) akuxVar.j.get()).E(akveVar.b);
                        i = anaf.O(ammv.j(akveVar));
                    } catch (RuntimeException e) {
                        zga.f("UploadClientApi", "Cannot start service inline", e);
                        i = anaf.N(e);
                    }
                }
                anhy anhyVar = i;
                anhy T = anaf.T(new anfy() { // from class: akuc
                    @Override // defpackage.anfy
                    public final anhy a() {
                        akux akuxVar2 = akux.this;
                        final afsx afsxVar3 = afsxVar2;
                        String str3 = str2;
                        avtn avtnVar3 = avtnVar2;
                        boolean z3 = z2;
                        amkq.F(!afsxVar3.z(), "Need a signed-in user.");
                        akzs b = akuxVar2.i.b(str3);
                        b.getClass();
                        if (b.u) {
                            akuxVar2.F("Upload cannot be confirmed twice.");
                            return anaf.O(ammv.j(akuxVar2.a(b)));
                        }
                        akve akveVar2 = (akve) akuxVar2.r.get(str3);
                        akveVar2.getClass();
                        amkq.F((b.b & 128) != 0, "Upload type is not set.");
                        amkq.F(true ^ akveVar2.n, "Cannot confirm an upload which failed its creation.");
                        akyc a = akuxVar2.i.a(str3, new akwp() { // from class: aktw
                            @Override // defpackage.akwp
                            public final akzs a(akzs akzsVar) {
                                afsx afsxVar4 = afsx.this;
                                int i2 = akux.t;
                                akzsVar.getClass();
                                aone builder = akzsVar.toBuilder();
                                String d = afsxVar4.d();
                                builder.copyOnWrite();
                                akzs akzsVar2 = (akzs) builder.instance;
                                akzsVar2.b |= 1;
                                akzsVar2.e = d;
                                builder.copyOnWrite();
                                akzs akzsVar3 = (akzs) builder.instance;
                                akzsVar3.b |= 4194304;
                                akzsVar3.u = true;
                                return (akzs) builder.build();
                            }
                        });
                        List b2 = akvq.b(akuxVar2.a);
                        if (b.z) {
                            b2.add(avtm.UPLOAD_FEATURE_COPY_FILE);
                        }
                        b2.add(avtm.UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO);
                        akzs akzsVar = a.b;
                        akzsVar.getClass();
                        akyb akybVar = akuxVar2.m;
                        String d = afsxVar3.d();
                        akzq a2 = akzq.a(b.l);
                        if (a2 == null) {
                            a2 = akzq.UNKNOWN_UPLOAD;
                        }
                        akybVar.j(str3, d, avtnVar3, akva.m(a2), z3, (avtm[]) b2.toArray(new avtm[0]));
                        akuxVar2.k.i(str3, akzsVar);
                        return anaf.O(ammv.j(akuxVar2.a(akzsVar)));
                    }
                }, akuxVar.e);
                anhy i2 = anfq.i(anhyVar, new akun(akuxVar, str2, 0), akuxVar.c);
                Long c = akuxVar.h.c();
                if (c.longValue() > 0) {
                    T = anaf.V(T, c.longValue(), TimeUnit.SECONDS, akuxVar.d);
                }
                ynm.k(new angl(amru.p(new anhy[]{T, i2}), true), akuxVar.v(), new ynk() { // from class: akup
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        akux akuxVar2 = akux.this;
                        aes aesVar2 = aesVar;
                        String str3 = str2;
                        aesVar2.d(th);
                        ((akze) akuxVar2.j.get()).A(str3);
                        avtk avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_FAILED;
                        if (th instanceof TimeoutException) {
                            avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_TIMED_OUT;
                        }
                        akuxVar2.D(str3, avtkVar, "Failed to confirm upload.", th);
                        akuxVar2.x(str3, false);
                    }
                }, new ynl() { // from class: aktv
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        akux akuxVar2 = akux.this;
                        String str3 = str2;
                        aes aesVar2 = aesVar;
                        akuxVar2.x(str3, false);
                        for (ammv ammvVar : (List) obj) {
                            if (ammvVar != null && ammvVar.h()) {
                                aesVar2.c(ammvVar);
                                return;
                            }
                        }
                        aesVar2.c(amlr.a);
                    }
                });
                return "UploadApiConfirm";
            }
        });
    }

    @Override // defpackage.akvf
    public final void I(String str, akzl akzlVar) {
        N(d(str, aflz.l, akuo.g, agbc.e, akzlVar), str, "Failed to set video media store metadata.");
    }

    @Override // defpackage.akvf
    public final void J(String str, arvt arvtVar) {
        N(d(str, aflz.n, akuo.i, agbc.i, arvtVar), str, "Failed to set MetadataUpdateRequest.");
    }

    @Override // defpackage.akvf
    public final void K(String str, akzt akztVar) {
        N(d(str, aflz.k, akuo.f, agbc.g, akztVar), str, "Failed to set UploadMediaStorageInfo.");
    }

    @Override // defpackage.akvf
    public final void L(String str, akzw akzwVar) {
        N(d(str, aflz.m, akuo.h, agbc.h, akzwVar), str, "Failed to set UploadMetadataProto.");
    }

    @Override // defpackage.akvf
    public final anhy M(String str, int i) {
        return N(d(str, aflz.p, akuo.k, agbc.f, akva.k(i)), str, "Failed to set UploadFlowFlavor.");
    }

    public final akve a(akzs akzsVar) {
        akvd a = akve.a();
        a.a = akzsVar.k;
        if ((akzsVar.b & 4) != 0) {
            Uri parse = Uri.parse(akzsVar.g);
            a.b = parse;
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment != null) {
                a.g = lastPathSegment;
            }
        }
        if ((akzsVar.b & 2) != 0) {
            a.c = Uri.parse(akzsVar.f);
        }
        if ((akzsVar.b & 128) != 0) {
            akzq a2 = akzq.a(akzsVar.l);
            if (a2 == null) {
                a2 = akzq.UNKNOWN_UPLOAD;
            }
            a.m = akva.m(a2);
        }
        if ((akzsVar.b & 256) != 0) {
            avtn b = avtn.b(akzsVar.m);
            if (b == null) {
                b = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
            }
            a.e = b;
        }
        if ((akzsVar.b & 16) != 0) {
            akzw akzwVar = akzsVar.i;
            if (akzwVar == null) {
                akzwVar = akzw.a;
            }
            a.d = akzwVar;
        }
        if ((akzsVar.b & 32) != 0) {
            arvt arvtVar = akzsVar.j;
            if (arvtVar == null) {
                arvtVar = arvt.a;
            }
            a.f = arvtVar;
        }
        Bitmap bitmap = (Bitmap) this.q.get(akzsVar.k);
        if (bitmap != null) {
            a.h = bitmap;
        } else if (akwg.w(akzsVar)) {
            ammv x = akwg.x(akzsVar);
            if (x.h()) {
                a.h = (Bitmap) x.c();
            }
        }
        if ((akzsVar.d & 512) != 0) {
            awaf awafVar = akzsVar.as;
            if (awafVar == null) {
                awafVar = awaf.a;
            }
            a.i = awafVar;
        }
        if ((akzsVar.b & 16384) != 0) {
            akzt akztVar = akzsVar.q;
            if (akztVar == null) {
                akztVar = akzt.a;
            }
            a.j = akztVar;
        }
        if ((akzsVar.b & 32768) != 0) {
            akzl akzlVar = akzsVar.r;
            if (akzlVar == null) {
                akzlVar = akzl.a;
            }
            a.k = akzlVar;
        }
        if (akzsVar.T.size() > 0) {
            a.l = amru.o(akzsVar.T);
        }
        a.b(akzsVar.u);
        akve akveVar = (akve) this.r.get(akzsVar.k);
        a.d(akveVar != null && akveVar.o);
        a.c(akveVar != null && akveVar.n);
        akve a3 = a.a();
        this.r.put(akzsVar.k, a3);
        return a3;
    }

    public final akve b(akzs akzsVar, akyc akycVar) {
        if (akycVar != null) {
            akzsVar = akycVar.b;
            akzsVar.getClass();
        }
        return a(akzsVar);
    }

    @Override // defpackage.akvf
    public final anhy c(String str, avtp avtpVar) {
        return O(str, false, avtpVar);
    }

    final anhy d(final String str, final ayrw ayrwVar, final ayrv ayrvVar, final ayro ayroVar, final Object obj) {
        return anaf.T(new anfy() { // from class: akuj
            @Override // defpackage.anfy
            public final anhy a() {
                akyc akycVar;
                akux akuxVar = akux.this;
                String str2 = str;
                final Object obj2 = obj;
                ayrw ayrwVar2 = ayrwVar;
                ayrv ayrvVar2 = ayrvVar;
                final ayro ayroVar2 = ayroVar;
                akzs b = akuxVar.i.b(str2);
                b.getClass();
                obj2.getClass();
                ayrwVar2.getClass();
                ayrvVar2.getClass();
                if (ayrwVar2.a(b) && obj2.equals(ayrvVar2.a(b))) {
                    akycVar = null;
                } else {
                    akyc a = akuxVar.i.a(str2, new akwp() { // from class: akua
                        @Override // defpackage.akwp
                        public final akzs a(akzs akzsVar) {
                            ayro ayroVar3 = ayro.this;
                            Object obj3 = obj2;
                            int i = akux.t;
                            akzsVar.getClass();
                            return (akzs) ((aone) ayroVar3.a(akzsVar.toBuilder(), obj3)).build();
                        }
                    });
                    akuxVar.A(str2, a);
                    akycVar = a;
                }
                return anaf.O(ammv.j(akuxVar.b(b, akycVar)));
            }
        }, this.e);
    }

    @Override // defpackage.akvf
    public final anhy e(String str, avtp avtpVar) {
        return O(str, true, avtpVar);
    }

    @Override // defpackage.akvf
    public final anhy f(String str) {
        return N(g(str, akuo.c, akuo.b), str, "Failed to clear the files to delete after upload.");
    }

    final anhy g(final String str, final ayrv ayrvVar, final ayrv ayrvVar2) {
        return anaf.T(new anfy() { // from class: akue
            @Override // defpackage.anfy
            public final anhy a() {
                final akux akuxVar = akux.this;
                final ayrv ayrvVar3 = ayrvVar;
                final ayrv ayrvVar4 = ayrvVar2;
                final String str2 = str;
                ayrvVar3.getClass();
                ayrvVar4.getClass();
                final akzs b = akuxVar.i.b(str2);
                b.getClass();
                final akve akveVar = (akve) akuxVar.r.get(str2);
                akveVar.getClass();
                return anaf.O(ammv.j(akuxVar.b(b, akuxVar.i.a(str2, new akwp() { // from class: aktz
                    @Override // defpackage.akwp
                    public final akzs a(akzs akzsVar) {
                        akux akuxVar2 = akux.this;
                        akzs akzsVar2 = b;
                        ayrv ayrvVar5 = ayrvVar4;
                        akve akveVar2 = akveVar;
                        String str3 = str2;
                        ayrv ayrvVar6 = ayrvVar3;
                        akzsVar.getClass();
                        aone builder = akzsVar.toBuilder();
                        amkq.F(!akzsVar2.u, "Metadata can be cleared only on unconfirmed uploads.");
                        akuxVar2.r.put(str3, ((akvd) ayrvVar5.a(akveVar2.b())).a());
                        return (akzs) ((aone) ayrvVar6.a(builder)).build();
                    }
                }))));
            }
        }, this.e);
    }

    @Override // defpackage.akvf
    public final anhy h(String str) {
        return N(g(str, akuo.d, akuo.a), str, "Failed to clear VideoShortsCreation.");
    }

    final anhy i(final String str, final avtl avtlVar, final Set set) {
        ynm.j(anaf.T(new anfy() { // from class: akuk
            @Override // defpackage.anfy
            public final anhy a() {
                akux akuxVar = akux.this;
                final Set set2 = set;
                akuxVar.t(new ayrw() { // from class: akur
                    @Override // defpackage.ayrw
                    public final boolean a(Object obj) {
                        Set set3 = set2;
                        int i = akux.t;
                        return !set3.contains(((akzs) obj).k);
                    }
                }, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_INCOMPLETE_CREATION);
                return anhv.a;
            }
        }, this.c), this.c, new akum(this, 0));
        Map map = this.r;
        akvd a = akve.a();
        a.a = str;
        map.put(str, a.a());
        Long l = (Long) this.h.b.a.a.Y(axyz.n).B().aB();
        anhy T = anaf.T(new anfy() { // from class: akud
            @Override // defpackage.anfy
            public final anhy a() {
                akux akuxVar = akux.this;
                avtl avtlVar2 = avtlVar;
                String str2 = str;
                avuj avujVar = akuxVar.g.a().h;
                if (avujVar == null) {
                    avujVar = avuj.a;
                }
                boolean z = avtlVar2 == avtl.UPLOAD_CREATION_FLOW_SHORTS && Boolean.valueOf(((Boolean) akuxVar.h.c.a.a.Y(akuo.p).B().aB()).booleanValue()).booleanValue();
                aone createBuilder = akzs.a.createBuilder();
                createBuilder.copyOnWrite();
                akzs akzsVar = (akzs) createBuilder.instance;
                str2.getClass();
                akzsVar.b |= 64;
                akzsVar.k = str2;
                long c = akuxVar.b.c();
                createBuilder.copyOnWrite();
                akzs akzsVar2 = (akzs) createBuilder.instance;
                akzsVar2.b |= 8;
                akzsVar2.h = c;
                createBuilder.copyOnWrite();
                akzs.a((akzs) createBuilder.instance);
                createBuilder.copyOnWrite();
                akzs akzsVar3 = (akzs) createBuilder.instance;
                akzsVar3.b |= 4194304;
                akzsVar3.u = false;
                createBuilder.copyOnWrite();
                akzs akzsVar4 = (akzs) createBuilder.instance;
                akzsVar4.b |= 2097152;
                akzsVar4.t = true;
                createBuilder.copyOnWrite();
                akzs akzsVar5 = (akzs) createBuilder.instance;
                akzsVar5.b |= 8388608;
                akzsVar5.v = z;
                createBuilder.copyOnWrite();
                akzs akzsVar6 = (akzs) createBuilder.instance;
                akzsVar6.s = 1;
                akzsVar6.b |= 131072;
                akuxVar.s.b(akuxVar.h.a().booleanValue(), str2, createBuilder);
                akvq.e(str2, createBuilder);
                akvq.f(createBuilder, avujVar);
                akzs akzsVar7 = (akzs) createBuilder.build();
                amkq.F(akuxVar.i.h(str2, akzsVar7), "Unexpected database insert error.");
                akuxVar.a(akzsVar7);
                akyb akybVar = akuxVar.m;
                aone createBuilder2 = avsw.a.createBuilder();
                createBuilder2.copyOnWrite();
                avsw avswVar = (avsw) createBuilder2.instance;
                avswVar.c = avtlVar2.e;
                avswVar.b |= 1;
                avsw avswVar2 = (avsw) createBuilder2.build();
                avsy a2 = avsz.a();
                avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_STARTED;
                a2.copyOnWrite();
                ((avsz) a2.instance).y(avtoVar);
                aone createBuilder3 = avta.a.createBuilder();
                createBuilder3.copyOnWrite();
                avta avtaVar = (avta) createBuilder3.instance;
                str2.getClass();
                avtaVar.b = 1 | avtaVar.b;
                avtaVar.c = str2;
                a2.copyOnWrite();
                ((avsz) a2.instance).F((avta) createBuilder3.build());
                a2.copyOnWrite();
                ((avsz) a2.instance).C(avswVar2);
                avsz avszVar = (avsz) a2.build();
                arpn a3 = arpp.a();
                a3.copyOnWrite();
                ((arpp) a3.instance).dV(avszVar);
                akybVar.b(null, (arpp) a3.build());
                akuxVar.n.b(str2);
                return anaf.O(str2);
            }
        }, this.e);
        return l.longValue() > 0 ? anaf.V(T, l.longValue(), TimeUnit.SECONDS, this.d) : T;
    }

    @Override // defpackage.akvf
    public final anhy j(String str) {
        anhy k = k(str);
        ynm.j(k, v(), new akum(this, 2));
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy k(final String str) {
        akve akveVar = (akve) this.r.get(str);
        if (akveVar != null) {
            return anaf.O(ammv.j(akveVar));
        }
        return anaf.T(new anfy() { // from class: akuf
            @Override // defpackage.anfy
            public final anhy a() {
                akux akuxVar = akux.this;
                akzs b = akuxVar.i.b(str);
                if (b == null) {
                    return anaf.O(amlr.a);
                }
                return anaf.O(ammv.j(akuxVar.a(b)));
            }
        }, this.e);
    }

    final anhy l(String str, anhy anhyVar) {
        return anfq.i(anhyVar, new akun(this, str, 1), this.e);
    }

    @Override // defpackage.akvf
    public final anhy m(String str, amru amruVar) {
        return N(d(str, aflz.r, akuo.e, agbc.l, amruVar), str, "Failed to set the files to delete after upload.");
    }

    @Override // defpackage.akvf
    public final anhy n(final String str, final Uri uri) {
        return N(l(str, anaf.T(new anfy() { // from class: akuh
            @Override // defpackage.anfy
            public final anhy a() {
                final akux akuxVar = akux.this;
                final String str2 = str;
                final Uri uri2 = uri;
                akzs b = akuxVar.i.b(str2);
                b.getClass();
                uri2.getClass();
                final boolean z = (b.b & 4) != 0;
                akyc akycVar = null;
                if (!z || !b.g.equals(uri2.toString())) {
                    akycVar = akuxVar.i.a(str2, new akwp() { // from class: akty
                        @Override // defpackage.akwp
                        public final akzs a(akzs akzsVar) {
                            akux akuxVar2 = akux.this;
                            Uri uri3 = uri2;
                            boolean z2 = z;
                            String str3 = str2;
                            akzsVar.getClass();
                            aone builder = akzsVar.toBuilder();
                            String uri4 = uri3.toString();
                            builder.copyOnWrite();
                            akzs akzsVar2 = (akzs) builder.instance;
                            uri4.getClass();
                            akzsVar2.b |= 4;
                            akzsVar2.g = uri4;
                            String uri5 = uri3.toString();
                            builder.copyOnWrite();
                            akzs akzsVar3 = (akzs) builder.instance;
                            uri5.getClass();
                            akzsVar3.b |= 2;
                            akzsVar3.f = uri5;
                            if (z2) {
                                akve akveVar = (akve) akuxVar2.r.get(str3);
                                akveVar.getClass();
                                akvd a = akve.a();
                                a.a = str3;
                                a.c(akveVar.n);
                                akuxVar2.r.put(str3, a.a());
                                akuxVar2.q.remove(str3);
                                amkq.E(((akzs) builder.instance).t);
                                builder.copyOnWrite();
                                akzs akzsVar4 = (akzs) builder.instance;
                                akzsVar4.b &= -257;
                                akzsVar4.m = 0;
                                builder.copyOnWrite();
                                ((akzs) builder.instance).T = aonm.emptyProtobufList();
                                builder.copyOnWrite();
                                akzs akzsVar5 = (akzs) builder.instance;
                                akzsVar5.r = null;
                                akzsVar5.b &= -32769;
                                builder.copyOnWrite();
                                akzs akzsVar6 = (akzs) builder.instance;
                                akzsVar6.j = null;
                                akzsVar6.b &= -33;
                                builder.copyOnWrite();
                                akzs akzsVar7 = (akzs) builder.instance;
                                akzsVar7.q = null;
                                akzsVar7.b &= -16385;
                                builder.copyOnWrite();
                                akzs akzsVar8 = (akzs) builder.instance;
                                akzsVar8.i = null;
                                akzsVar8.b &= -17;
                                builder.copyOnWrite();
                                akzs akzsVar9 = (akzs) builder.instance;
                                akzsVar9.b &= -4097;
                                akzsVar9.o = akzs.a.o;
                                builder.copyOnWrite();
                                akzs akzsVar10 = (akzs) builder.instance;
                                akzsVar10.b &= -8193;
                                akzsVar10.p = akzs.a.p;
                                builder.copyOnWrite();
                                akzs akzsVar11 = (akzs) builder.instance;
                                akzsVar11.as = null;
                                akzsVar11.d &= -513;
                            }
                            return (akzs) builder.build();
                        }
                    });
                } else if (b.af) {
                    akuxVar.E(str2);
                }
                return anaf.O(new Pair(akuxVar.b(b, akycVar), ammv.i(akycVar)));
            }
        }, this.e)), str, "Failed to set source Uri.");
    }

    @Override // defpackage.akvf
    public final anhy o(String str, Uri uri) {
        return N(d(str, aflz.o, akuo.j, agbc.k, uri.toString()), str, "Failed to set upload Uri.");
    }

    @Override // defpackage.akvf
    public final anhy p(final String str, final Bitmap bitmap) {
        return N(l(str, anaf.T(new anfy() { // from class: akug
            @Override // defpackage.anfy
            public final anhy a() {
                akyc a;
                final akux akuxVar = akux.this;
                String str2 = str;
                final Bitmap bitmap2 = bitmap;
                akzs b = akuxVar.i.b(str2);
                b.getClass();
                Bitmap bitmap3 = (Bitmap) akuxVar.q.get(str2);
                if (bitmap3 == null || !bitmap3.sameAs(bitmap2)) {
                    akuxVar.q.put(str2, bitmap2);
                    a = akuxVar.i.a(str2, new akwp() { // from class: aktx
                        @Override // defpackage.akwp
                        public final akzs a(akzs akzsVar) {
                            akux akuxVar2 = akux.this;
                            Bitmap bitmap4 = bitmap2;
                            boolean booleanValue = akuxVar2.h.b().booleanValue();
                            akzsVar.getClass();
                            aone builder = akzsVar.toBuilder();
                            akwg.y(booleanValue, bitmap4, builder);
                            return (akzs) builder.build();
                        }
                    });
                } else {
                    a = null;
                }
                return anaf.O(new Pair(akuxVar.b(b, a), ammv.i(a)));
            }
        }, this.e)), str, "Failed to set video file thumbnail.");
    }

    @Override // defpackage.akvf
    public final anhy q(String str, awaf awafVar) {
        return N(d(str, aflz.q, akuo.l, agbc.j, awafVar), str, "Failed to set VideoShortsCreation.");
    }

    public final Duration r() {
        Duration duration = u;
        if ((this.g.a().b & 4096) == 0) {
            return duration;
        }
        avuj avujVar = this.g.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        long j = avujVar.D;
        if (j <= 0) {
            return duration;
        }
        try {
            return Duration.ofHours(j);
        } catch (ArithmeticException e) {
            G("Failed to convert clean up time to hours.", e);
            return u;
        }
    }

    @Override // defpackage.akvf
    public final String s(avtl avtlVar, akvt akvtVar) {
        String a = this.v.a(yjk.q(), avtlVar, 0);
        if (akvtVar != null) {
            w(a, akvtVar);
        }
        ynm.j(i(a, avtlVar, amsx.r(a)), v(), new akus(this, a, 0));
        return a;
    }

    public final List t(ayrw ayrwVar, avtp avtpVar) {
        ArrayList arrayList = new ArrayList();
        for (akzs akzsVar : this.i.d(akgg.d).values()) {
            if (ayrwVar.a(akzsVar)) {
                x(akzsVar.k, true);
                C(akzsVar, avtpVar);
                arrayList.add(akzsVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.akvf
    public final List u(int i, avtl avtlVar, akvt akvtVar) {
        akwd akwdVar = this.v;
        amkq.E(true);
        ArrayList<String> arrayList = new ArrayList(i);
        String q = yjk.q();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(akwdVar.a(q, avtlVar, i2));
        }
        for (String str : arrayList) {
            w(str, akvtVar);
            ynm.j(i(str, avtlVar, amsx.p(arrayList)), v(), new akus(this, str, 2));
        }
        return arrayList;
    }

    public final Executor v() {
        return Boolean.valueOf(((Boolean) this.h.b.a.a.Y(axyz.k).B().aB()).booleanValue()).booleanValue() ? this.c : this.e;
    }

    @Override // defpackage.akvf
    public final synchronized void w(String str, akvt akvtVar) {
        boolean z = true;
        amkq.E(!TextUtils.isEmpty(str));
        akvtVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.p.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (this.p.put(str, copyOnWriteArrayList) != null) {
                z = false;
            }
            amkq.N(z);
        }
        copyOnWriteArrayList.addIfAbsent(akvtVar);
    }

    public final void x(String str, boolean z) {
        this.q.remove(str);
        this.r.remove(str);
        if (z) {
            this.n.c(str);
        }
    }

    @Override // defpackage.akvf
    public final void y(String str, avto avtoVar) {
        this.m.d(str, null, avtoVar);
    }

    @Override // defpackage.akvf
    public final void z(String str, avtk avtkVar) {
        this.m.f(str, avtkVar);
    }
}
