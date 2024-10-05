package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihl implements haj {
    public float C;
    public ReelPlayerView D;
    public iiv E;
    public iiv H;
    public final jgp I;

    /* renamed from: J, reason: collision with root package name */
    private final ili f221J;
    private final ijz K;
    private final ilp L;
    private final aaea M;
    private final shf N;
    private final ainy O;
    private final boolean P;
    private final ainl Q;
    private final acqz R;
    public final ifw a;
    public final iij b;
    public final amnv c;
    public final ijr d;
    public final ihv e;
    public final ihn f;
    public final ReelSnackbarController g;
    public final axze h;
    public final Executor i;
    public ihj m;
    public igu n;
    public ReelRecyclerView o;
    public ihf p;
    public SubtitlesOverlayPresenter q;
    public boolean r;
    public boolean v;
    public final AtomicInteger j = new AtomicInteger(-1);
    public final AtomicInteger k = new AtomicInteger(-1);
    public final List l = new ArrayList();
    public ihe s = null;
    public ihe t = null;
    public int u = 0;
    public long w = Long.MIN_VALUE;
    public boolean x = true;
    public int y = -1;
    public int z = -1;
    private int S = 0;
    public ihk A = ihk.a(0);
    public boolean B = true;
    public final lo G = new ihb(this);
    public final ihc F = new ihc(this);

    public ihl(aaea aaeaVar, amnv amnvVar, ainy ainyVar, ainl ainlVar, ili iliVar, ijz ijzVar, ihv ihvVar, ihn ihnVar, ilp ilpVar, jgp jgpVar, akht akhtVar, ijr ijrVar, ifw ifwVar, acqz acqzVar, Executor executor, shf shfVar, ReelSnackbarController reelSnackbarController, yqw yqwVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        boolean z = false;
        this.M = aaeaVar;
        this.c = amnvVar;
        this.O = ainyVar;
        this.Q = ainlVar;
        this.f221J = iliVar;
        this.K = ijzVar;
        this.f = ihnVar;
        this.L = ilpVar;
        this.e = ihvVar;
        this.I = jgpVar;
        this.d = ijrVar;
        this.a = ifwVar;
        ion ionVar = (ion) akhtVar.c.get();
        ionVar.getClass();
        azrw azrwVar = akhtVar.d;
        ifw ifwVar2 = (ifw) akhtVar.a.get();
        ifwVar2.getClass();
        shf shfVar2 = (shf) akhtVar.b.get();
        shfVar2.getClass();
        Executor executor2 = (Executor) akhtVar.e.get();
        executor2.getClass();
        this.b = new iij(ionVar, azrwVar, ifwVar2, shfVar2, executor2, this);
        this.i = executor;
        Object obj = amnvVar.get();
        if (obj != null) {
            aujz aujzVar = (aujz) obj;
            if ((aujzVar.b & 2097152) != 0 && aujzVar.q) {
                z = true;
            }
        }
        this.P = z;
        this.R = acqzVar;
        this.N = shfVar;
        this.g = reelSnackbarController;
        this.h = axzeVar;
        yqwVar.h(new Callable() { // from class: igz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ihl ihlVar = ihl.this;
                return ihlVar.h.a().ax(new ayrs() { // from class: igx
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        ReelPlayerView reelPlayerView = ihl.this.D;
                        if (reelPlayerView != null) {
                            reelPlayerView.c = bool.booleanValue();
                        }
                    }
                });
            }
        });
    }

    public static boolean s(aujz aujzVar) {
        return (aujzVar == null || (aujzVar.b & 268435456) == 0 || !aujzVar.v) ? false : true;
    }

    private final void u() {
        int i = this.S;
        if (i != 0) {
            this.f221J.c(i);
            this.S = 0;
        }
    }

    private final boolean v() {
        Object obj = this.c.get();
        return obj != null && ((aujz) obj).w;
    }

    @Override // defpackage.haj
    public final long a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        ihm E = this.n.E(reelWatchEndpointOuterClass$ReelWatchEndpoint, this.y);
        if (E == null) {
            return Long.MIN_VALUE;
        }
        return E.a;
    }

    @Override // defpackage.haj
    public final apxf b(long j) {
        return this.n.H(j);
    }

    @Override // defpackage.haj
    public final apxf c(long j) {
        return this.n.I(j);
    }

    @Override // defpackage.haj
    public final void d(long j, anhh anhhVar) {
        apxf H = this.n.H(j);
        if (H == null && this.b.c(new ihd(this, anhhVar, j, 1))) {
            return;
        }
        anhhVar.b(Optional.ofNullable(H));
    }

    @Override // defpackage.haj
    public final void e(long j, anhh anhhVar) {
        apxf I = this.n.I(j);
        if (I == null && this.b.c(new ihd(this, anhhVar, j, 0))) {
            return;
        }
        anhhVar.b(Optional.ofNullable(I));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f() {
        int i = this.y;
        if (i == -1) {
            return Long.MIN_VALUE;
        }
        return this.n.D(i);
    }

    public final Optional g() {
        igu iguVar = this.n;
        if (iguVar == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.n.G(iguVar.B(this.w)));
    }

    public final Optional h(long j) {
        return Optional.ofNullable(this.n.F(j));
    }

    public final List i() {
        ArrayList arrayList = new ArrayList();
        this.n.J(new igv(arrayList, 1));
        return arrayList;
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.n.J(new igv(arrayList, 0));
        return arrayList;
    }

    public final void k(List list, List list2) {
        int size;
        List list3 = list2;
        igu iguVar = this.n;
        int i = 0;
        if (list3 != null) {
            amkq.N(list.size() == list2.size());
        }
        if (!list.isEmpty()) {
            synchronized (iguVar.d) {
                size = iguVar.d.size();
                long j = size == 0 ? -1L : ((ihm) iguVar.d.get(size - 1)).a;
                while (i < list.size()) {
                    apxf apxfVar = (apxf) list.get(i);
                    amkq.N(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                    j++;
                    ihm ihmVar = new ihm(j, apxfVar, list3 != null ? (aomf) ((Optional) list3.get(i)).orElse(null) : null, false, iguVar.g);
                    if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b & 32768) != 0) {
                        j++;
                        ihmVar.g = j;
                    }
                    iguVar.d.add(ihmVar);
                    i++;
                    list3 = list2;
                }
            }
            iguVar.l(iguVar.A(size), list.size());
        }
        ihj ihjVar = this.m;
        if (ihjVar == null || ihjVar.b.k.get() < 0) {
            return;
        }
        ihjVar.b.i.execute(new ihi(ihjVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r32) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihl.l(boolean):void");
    }

    public final void m(int i) {
        ikr ikrVar;
        if (i != -1) {
            ihm G = this.n.G(i);
            iin iinVar = G == null ? null : G.f;
            if (!(iinVar instanceof iim) || (ikrVar = ((iim) iinVar).v.b) == null) {
                return;
            }
            ikrVar.a(i == this.y);
        }
    }

    public final void n(ihm ihmVar) {
        int A;
        long f = f();
        igu iguVar = this.n;
        int B = iguVar.B(ihmVar.a);
        if (B != -1) {
            synchronized (iguVar.d) {
                int w = iguVar.w(B);
                boolean z = false;
                if (w >= 0 && w < iguVar.d.size()) {
                    z = true;
                }
                amkq.E(z);
                iguVar.e = (ihm) iguVar.d.remove(w);
                A = iguVar.A(w);
            }
            iguVar.n(A);
        }
        int B2 = this.n.B(f);
        if (B2 != -1) {
            this.y = B2;
        }
    }

    public final void o(long j, apxf apxfVar) {
        if (apxfVar == null) {
            return;
        }
        Optional h = h(j);
        if (h.isPresent()) {
            ihm ihmVar = (ihm) h.get();
            amkq.N(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
            ihmVar.d = apxfVar;
        }
    }

    public final boolean p() {
        igu iguVar = this.n;
        return iguVar == null || this.y == iguVar.z();
    }

    public final boolean q() {
        return this.u == 1;
    }

    public final boolean r() {
        return this.n.f;
    }

    public final int t(ihk ihkVar) {
        int i = this.y + 1;
        if (i <= this.n.z()) {
            this.g.g();
            this.A = ihkVar;
            this.o.a(true);
            this.z = i;
            this.o.ak(i);
            return 3;
        }
        if (!r() || this.b.k) {
            return 1;
        }
        this.g.g();
        if (i <= this.n.x()) {
            this.A = ihkVar;
            this.o.ak(i);
        }
        return 3;
    }
}
