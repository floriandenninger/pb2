package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izr extends fgi {
    public afwx f;
    private final azrw g;
    private final fbb h;
    private final aaea i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final Executor m;
    private final Executor n;
    private final ayqi o;
    private final fji p;
    private final ScheduledExecutorService q;
    private boolean r;
    private final aadw s;
    private final jud t;
    private final axzg u;

    public izr(azrw azrwVar, shf shfVar, fbb fbbVar, aadw aadwVar, aaea aaeaVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor, Executor executor2, ayqi ayqiVar, ScheduledExecutorService scheduledExecutorService, jud judVar, fji fjiVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        super(azrwVar, shfVar);
        this.g = azrwVar;
        fbbVar.getClass();
        this.h = fbbVar;
        this.s = aadwVar;
        this.i = aaeaVar;
        azrwVar2.getClass();
        this.j = azrwVar2;
        this.k = azrwVar3;
        this.l = azrwVar4;
        this.m = executor;
        this.n = executor2;
        this.o = ayqiVar;
        this.q = scheduledExecutorService;
        this.t = judVar;
        this.p = fjiVar;
        this.u = axzgVar;
        this.r = true;
    }

    public static void o(aauc aaucVar, azrw azrwVar, aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.K) {
            aone createBuilder = aqkd.a.createBuilder();
            ysy ysyVar = (ysy) azrwVar.get();
            if (ysyVar != null) {
                long b = ysyVar.b();
                createBuilder.copyOnWrite();
                aqkd aqkdVar = (aqkd) createBuilder.instance;
                aqkdVar.b |= 2;
                aqkdVar.d = b;
                boolean k = ysyVar.k();
                createBuilder.copyOnWrite();
                aqkd aqkdVar2 = (aqkd) createBuilder.instance;
                aqkdVar2.b |= 1;
                aqkdVar2.c = k;
            }
            aqjz a = aqkg.a();
            a.copyOnWrite();
            ((aqkg) a.instance).p((aqkd) createBuilder.build());
            aqkg aqkgVar = (aqkg) a.build();
            aqkgVar.getClass();
            aaucVar.y = aqkgVar;
        }
    }

    public static ammw p(aauc aaucVar, apxf apxfVar, boolean z, zki zkiVar, aadw aadwVar, azrw azrwVar, azrw azrwVar2, aaea aaeaVar) {
        String T = whu.T(apxfVar);
        byte[] bo = evr.bo(apxfVar);
        if (bo != null) {
            aaucVar.m(bo);
        } else {
            aaucVar.k();
        }
        if (apxfVar != null && apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            aone builder = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
            aaucVar.d(T);
            aaucVar.v(((aplt) builder.instance).d);
            aaucVar.d = aauc.i(((aplt) builder.instance).e);
            if (z) {
                aaucVar.s(2);
            }
            if ((((aplt) builder.instance).b & 64) != 0) {
                aone createBuilder = arjp.a.createBuilder();
                aplw aplwVar = ((aplt) builder.instance).h;
                if (aplwVar == null) {
                    aplwVar = aplw.a;
                }
                createBuilder.ah(aplwVar.d);
                aaucVar.t = (arjp) createBuilder.build();
                builder.copyOnWrite();
                aplt apltVar = (aplt) builder.instance;
                apltVar.h = null;
                apltVar.b &= -65;
            }
            aplt apltVar2 = (aplt) builder.instance;
            if ((apltVar2.b & 128) != 0 && zkiVar != null) {
                aqil aqilVar = apltVar2.i;
                if (aqilVar == null) {
                    aqilVar = aqil.a;
                }
                Object b = zkiVar.b(Uri.parse(aqilVar.b));
                if (b instanceof aqei) {
                    aqej aqejVar = ((aqei) b).b;
                    if (aqejVar == null) {
                        aqejVar = aqej.a;
                    }
                    aaucVar.s = aqejVar;
                }
            }
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(BrowseEndpointOuterClass.browseEndpoint, (aplt) builder.build());
            apxfVar = (apxf) aongVar.build();
            q(azrwVar, aaucVar, aadwVar);
        }
        o(aaucVar, azrwVar2, aaeaVar);
        return ammw.a(aaucVar, apxfVar);
    }

    public static void q(azrw azrwVar, aauc aaucVar, aadw aadwVar) {
        apwy b;
        if (aadwVar == null || azrwVar == null || (b = aadwVar.b()) == null) {
            return;
        }
        auiv auivVar = b.x;
        if (auivVar == null) {
            auivVar = auiv.a;
        }
        auiw auiwVar = auivVar.b;
        if (auiwVar == null) {
            auiwVar = auiw.a;
        }
        if (auiwVar.b) {
            String str = (String) azrwVar.get();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            aaucVar.k = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fgi
    public final /* bridge */ /* synthetic */ ayps c(aaqh aaqhVar, Throwable th) {
        Optional empty;
        jud judVar = this.t;
        aauc aaucVar = (aauc) aaqhVar;
        if ("FEwhat_to_watch".equals(aaucVar.c)) {
            if (!judVar.a.a()) {
                empty = Optional.empty();
            } else if (!(th instanceof cnq) || !yny.c((cnq) th)) {
                empty = Optional.empty();
            } else {
                empty = Optional.of((izn) judVar.b.get());
            }
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            return ((izn) empty.get()).a(aaucVar).j().z(this.o);
        }
        return ayps.p();
    }

    @Override // defpackage.fgi
    protected final /* bridge */ /* synthetic */ ayps d(aaqh aaqhVar) {
        return ((izo) this.j.get()).a((aauc) aaqhVar).z(this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fgi
    public final void f(cnq cnqVar) {
        fbb fbbVar = this.h;
        fbbVar.b.f(10, cnqVar);
        fbbVar.a.d(new fdk());
        afwx afwxVar = this.f;
        if (afwxVar != null) {
            afwxVar.kY(cnqVar);
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fgi
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
        fbb fbbVar = this.h;
        fbbVar.b.e(10);
        fbbVar.a.d(new fdi());
        afwx afwxVar = this.f;
        if (afwxVar != null) {
            afwxVar.kZ(browseResponseModel);
            this.f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fgi
    protected final /* bridge */ /* synthetic */ void i(aasw aaswVar, aaqh aaqhVar, afwx afwxVar) {
        anhy h;
        Long l;
        aaue aaueVar = (aaue) aaswVar;
        aauc aaucVar = (aauc) aaqhVar;
        fbb fbbVar = this.h;
        fbbVar.b.g(10);
        fbbVar.a.d(new fdj());
        Executor executor = this.r ? this.n : this.m;
        if (((ysy) this.l.get()).p() || !"FEwhat_to_watch".equals(aaucVar.c) || !this.p.a()) {
            h = aaueVar.h(aaucVar, executor);
        } else {
            anhy h2 = aaueVar.h(aaucVar, executor);
            aqvj aqvjVar = this.u.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45356842L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45356842L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45356842L);
                l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
            } else {
                l = 0L;
            }
            h = aney.i(anht.q(anaf.V(h2, l.longValue(), TimeUnit.MILLISECONDS, this.q)), TimeoutException.class, jom.b, angq.a);
        }
        ynm.k(h, this.r ? this.m : angq.a, new izp(afwxVar, 0), new izq(afwxVar, 0));
        this.r = false;
    }

    public final void n() {
        aadw aadwVar = this.s;
        azrw azrwVar = this.k;
        azrw azrwVar2 = this.l;
        aaue aaueVar = (aaue) this.g.get();
        fbb fbbVar = this.h;
        e((aauc) p(aaueVar.g(new fba(fbbVar.a, fbbVar.b)), aahg.a("FEwhat_to_watch"), false, null, aadwVar, azrwVar, azrwVar2, this.i).a);
    }
}
