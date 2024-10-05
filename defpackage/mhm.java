package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mhm implements gfr, gmg, ypd {
    public static final /* synthetic */ int d = 0;
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    final mgq a;
    private final mgu f;
    private final ypa g;
    private final InlinePlaybackLifecycleController h;
    private final zbw i;
    private final gfz j;
    private final RecyclerView k;
    private final ajox l;
    private final ajnp m;
    public final azqv b = azqv.aq(Optional.empty());
    public Optional c = Optional.empty();
    private final ayqw n = new ayqw();

    public mhm(ScrollSelectionController scrollSelectionController, gfz gfzVar, mgu mguVar, ypa ypaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, zbw zbwVar, RecyclerView recyclerView, ajox ajoxVar, ajng ajngVar, fok fokVar) {
        this.k = recyclerView;
        this.l = ajoxVar;
        this.m = new ajnp(ajngVar, juz.p);
        this.a = new mgq(recyclerView, fokVar, scrollSelectionController);
        this.j = gfzVar;
        this.f = mguVar;
        this.g = ypaVar;
        this.h = inlinePlaybackLifecycleController;
        this.i = zbwVar;
    }

    public static boolean o(Object obj) {
        if (evr.br(obj)) {
            return true;
        }
        if (obj instanceof ajds) {
            ajds ajdsVar = (ajds) obj;
            return ajdsVar.b() != null && ajdsVar.b().b;
        }
        return false;
    }

    private final int p() {
        return ((Integer) this.c.filter(jzf.h).orElse(-1)).intValue();
    }

    @Override // defpackage.gfr
    public final View a() {
        return this.k;
    }

    @Override // defpackage.gfr
    public void b(boolean z) {
        this.j.n(z);
        if (z) {
            this.g.g(this);
            mgq mgqVar = this.a;
            this.l.g(mgqVar.c);
            mgqVar.a.aD(mgqVar);
            mgqVar.b.a.add(mgqVar);
            return;
        }
        this.g.m(this);
        mgu mguVar = this.f;
        mguVar.h();
        mguVar.d = null;
        mgq mgqVar2 = this.a;
        this.l.i(mgqVar2.c);
        mgqVar2.a.aF(mgqVar2);
        mgqVar2.b.a.remove(mgqVar2);
        mgqVar2.a.removeCallbacks(new mgp(mgqVar2));
        this.n.c();
        this.b.sh();
    }

    @Override // defpackage.gfr
    public final void c() {
        this.k.aa(p());
    }

    @Override // defpackage.gfr
    public final void d() {
    }

    @Override // defpackage.gfr
    public final boolean e() {
        return !this.m.isEmpty();
    }

    @Override // defpackage.gfr
    public final void g() {
        LinearLayoutManager linearLayoutManager;
        int J2;
        View view;
        long a = this.i.a();
        if (a <= 0 || a <= e) {
            int p = p();
            if (p == -1) {
                Optional.empty();
                return;
            }
            int b = this.l.b();
            int i = p + 1;
            while (i < b && !o(this.l.getItem(i))) {
                i++;
            }
            if (i >= b) {
                Optional.empty();
                return;
            }
            wd wdVar = this.k.n;
            if (!(wdVar instanceof LinearLayoutManager) || (J2 = (linearLayoutManager = (LinearLayoutManager) wdVar).J()) == -1 || (i == J2 && i == linearLayoutManager.I())) {
                Optional.empty();
                return;
            }
            this.a.d = true;
            this.k.ak(i);
            ScrollSelectionController scrollSelectionController = this.a.c;
            gmh gmhVar = scrollSelectionController.b;
            if (gmhVar != null) {
                Iterator it = gmhVar.a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view = null;
                        break;
                    }
                    view = (View) it.next();
                    int c = gmhVar.c(view);
                    if (c >= 0 && c == i) {
                        break;
                    }
                }
                scrollSelectionController.r(new Pair(view, Integer.valueOf(i)), true, true);
            }
            Optional.of(Integer.valueOf(i));
            return;
        }
        Optional.empty();
    }

    @Override // defpackage.gfr
    public final void h() {
    }

    @Override // defpackage.gmg
    public final int i() {
        for (int i = 0; i < this.l.b(); i++) {
            if (o(this.l.getItem(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.gmb
    public final aypn j() {
        return this.b;
    }

    @Override // defpackage.gmg
    public int k() {
        return 1;
    }

    public Class[] kz(Class cls, Object obj, int i) {
        return mcy.B(this, obj, i);
    }

    @Override // defpackage.gmg
    public final RecyclerView l() {
        return this.k;
    }

    @Override // defpackage.gmg
    public final void m(gmb gmbVar) {
        this.n.d(gmbVar.j().Y(new ayrs() { // from class: mhl
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                mhm mhmVar = mhm.this;
                Optional optional = (Optional) obj;
                mhmVar.c = optional;
                mhmVar.b.c(optional);
            }
        }, ktf.n));
    }

    public final void n(izi iziVar) {
        if (evr.br(iziVar.h())) {
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.h;
            gol bp = evr.bp(iziVar.h());
            ayqx ayqxVar = inlinePlaybackLifecycleController.b;
            if (ayqxVar != null && !ayqxVar.e()) {
                ayrz.c((AtomicReference) inlinePlaybackLifecycleController.b);
            }
            inlinePlaybackLifecycleController.b = inlinePlaybackLifecycleController.i(bp).S(ggc.b, eoo.u);
        }
    }
}
