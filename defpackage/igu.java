package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igu extends vw {
    public final List d = new ArrayList();
    public ihm e = null;
    public final boolean f;
    public final boolean g;
    public boolean h;
    private final ilx i;
    private final ihl j;
    private final boolean k;
    private boolean l;
    private final jgp m;
    private final ogx n;

    public igu(ogx ogxVar, jgp jgpVar, ilx ilxVar, ihl ihlVar, boolean z, boolean z2, boolean z3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.n = ogxVar;
        this.m = jgpVar;
        this.i = ilxVar;
        this.j = ihlVar;
        this.f = z;
        this.k = z2;
        this.g = z3;
        this.h = z;
        this.l = z;
        q(true);
    }

    private final int L() {
        return this.k ? 1 : 0;
    }

    private static boolean M(ihm ihmVar, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (ihmVar != null && !ihmVar.b && ihmVar.d.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) ihmVar.d.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (reelWatchEndpointOuterClass$ReelWatchEndpoint.d.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.d) && reelWatchEndpointOuterClass$ReelWatchEndpoint.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.e)) {
                return true;
            }
        }
        return false;
    }

    public final int A(int i) {
        return i + L();
    }

    public final int B(long j) {
        synchronized (this.d) {
            for (int i = 0; i < this.d.size(); i++) {
                if (((ihm) this.d.get(i)).a == j) {
                    return A(i);
                }
            }
            return -1;
        }
    }

    public final int C() {
        return (this.k && this.f) ? 0 : -1;
    }

    public final long D(int i) {
        ihm G = G(i);
        if (G == null) {
            return Long.MIN_VALUE;
        }
        return G.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r4 = (defpackage.ihm) r7.d.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (M(r4, r8) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ihm E(com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r7.d
            monitor-enter(r1)
            java.util.List r2 = r7.d     // Catch: java.lang.Throwable -> L60
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L60
            int r9 = r7.w(r9)     // Catch: java.lang.Throwable -> L60
            int r3 = r2 + (-1)
            if (r9 < 0) goto L2f
            if (r9 >= r2) goto L2f
            java.util.List r3 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L60
            ihm r3 = (defpackage.ihm) r3     // Catch: java.lang.Throwable -> L60
            boolean r4 = M(r3, r8)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r3
        L27:
            int r3 = r9 + 1
            int r9 = r9 + (-1)
            r6 = r3
            r3 = r9
            r9 = r6
            goto L30
        L2f:
            r9 = r2
        L30:
            if (r3 >= 0) goto L37
            if (r9 >= r2) goto L35
            goto L37
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r0
        L37:
            if (r9 >= r2) goto L4b
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L60
            ihm r4 = (defpackage.ihm) r4     // Catch: java.lang.Throwable -> L60
            boolean r5 = M(r4, r8)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r4
        L49:
            int r9 = r9 + 1
        L4b:
            if (r3 < 0) goto L30
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L60
            ihm r4 = (defpackage.ihm) r4     // Catch: java.lang.Throwable -> L60
            boolean r5 = M(r4, r8)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L5d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r4
        L5d:
            int r3 = r3 + (-1)
            goto L30
        L60:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            goto L64
        L63:
            throw r8
        L64:
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igu.E(com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint, int):ihm");
    }

    public final ihm F(long j) {
        return G(B(j));
    }

    public final ihm G(int i) {
        ihm ihmVar;
        synchronized (this.d) {
            int w = w(i);
            ihmVar = null;
            if (w >= 0 && w < this.d.size()) {
                ihmVar = (ihm) this.d.get(w);
            }
        }
        return ihmVar;
    }

    public final apxf H(long j) {
        ihm F = F(j + 1);
        if (F != null) {
            return F.d;
        }
        return null;
    }

    public final apxf I(long j) {
        ihm F = F(j - 1);
        if (F != null) {
            return F.d;
        }
        return null;
    }

    public final void J(zfi zfiVar) {
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                zfiVar.a((ihm) it.next());
            }
        }
    }

    public final void K(boolean z) {
        int L;
        if (!this.f || this.l == z) {
            return;
        }
        this.l = z;
        synchronized (this.d) {
            L = L() + this.d.size();
        }
        if (z) {
            od(L);
        } else {
            n(L);
        }
    }

    @Override // defpackage.vw
    public final int b() {
        int size;
        synchronized (this.d) {
            size = this.d.size() + L() + (this.l ? 1 : 0);
        }
        return size;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        if (w(i) < 0) {
            return 0;
        }
        ihm G = G(i);
        if (G == null) {
            return 1;
        }
        if (G.b) {
            return 4;
        }
        if (etx.ab(G.a())) {
            return 5;
        }
        return etx.ag(G.d) ? 3 : 2;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        if (i == 4) {
            ogx ogxVar = this.n;
            boolean z = this.g;
            ajdw ajdwVar = (ajdw) ogxVar.c.get();
            ajdwVar.getClass();
            ajfh ajfhVar = (ajfh) ogxVar.b.get();
            ajfhVar.getClass();
            acqz acqzVar = (acqz) ogxVar.d.get();
            acqzVar.getClass();
            ijr ijrVar = (ijr) ogxVar.a.get();
            ijrVar.getClass();
            viewGroup.getClass();
            return new iil(ajdwVar, ajfhVar, acqzVar, ijrVar, viewGroup, z);
        }
        if (i == 0 || i == 1) {
            return new igk(viewGroup, this.j.r, 1 == (i ^ 1));
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_player_page, viewGroup, false);
        jgp jgpVar = this.m;
        ilx ilxVar = this.i;
        aaea aaeaVar = (aaea) jgpVar.a.get();
        aaeaVar.getClass();
        ifw ifwVar = (ifw) jgpVar.b.get();
        ifwVar.getClass();
        viewGroup2.getClass();
        return new iim(aaeaVar, ifwVar, ilxVar, viewGroup2);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        if (w(i) < 0) {
            return Long.MIN_VALUE;
        }
        ihm G = G(i);
        if (G != null) {
            return G.a;
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, final int i) {
        boolean z;
        int i2;
        int i3;
        iin iinVar = (iin) wvVar;
        ihm G = G(i);
        boolean z2 = false;
        if (!(iinVar instanceof iim) || G == null) {
            if (!(iinVar instanceof iil) || G == null) {
                if (iinVar instanceof igk) {
                    igk igkVar = (igk) iinVar;
                    if (!igkVar.u) {
                        z2 = this.f;
                    } else if (this.f && this.h) {
                        z2 = true;
                    }
                    etx.M(igkVar.t, z2);
                    etx.M(igkVar.v, !z2);
                }
            } else {
                iil iilVar = (iil) iinVar;
                aulq aulqVar = G.a().p;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aukv aukvVar = (aukv) aulqVar.pX(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
                aukvVar.getClass();
                String str = iilVar.y;
                if (str == null || !str.equals(aukvVar.d)) {
                    iilVar.F();
                    iilVar.z = G;
                    G.f = iilVar;
                    iilVar.y = aukvVar.d;
                    aulq aulqVar2 = aukvVar.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                    aqrfVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", iilVar.w);
                    ajfh ajfhVar = iilVar.x;
                    ajds a = ajds.a(aqrfVar);
                    ajok ajokVar = new ajok();
                    ajokVar.g(hashMap);
                    acra mM = iilVar.v.mM();
                    mM.getClass();
                    ajokVar.a(mM);
                    iilVar.u.oB(ajokVar, a);
                    iilVar.t.addView(iilVar.u.a());
                }
            }
        } else {
            iim iimVar = (iim) iinVar;
            if (iimVar.w != G) {
                iimVar.w = G;
                G.f = iimVar;
                ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = G.a();
                if ((a2.b & 64) == 0) {
                    iimVar.v.f.c();
                } else {
                    iimVar.v.f.d(a2);
                }
                iimVar.u.c(G.d, (ViewGroup) iimVar.v.findViewById(R.id.reel_player_delegated_overlay));
                ily ilyVar = iimVar.v;
                boolean z3 = etx.ai(a2) || etx.ab(a2);
                boolean z4 = G.c;
                ilyVar.y = z4;
                ikn.a(ilyVar, z3, z4);
                String str2 = a2.d;
                arsd arsdVar = G.e;
                boolean ab = etx.ab(a2);
                if (arsdVar != null) {
                    z = ab;
                } else if (ab) {
                    z = true;
                } else if ((a2.b & 256) != 0) {
                    aukf Y = etx.Y(a2);
                    int bd = anaf.bd(a2.c);
                    if (bd != 0 && bd == 3) {
                        aujs aujsVar = iimVar.t.a().u;
                        if (aujsVar == null) {
                            aujsVar = aujs.a;
                        }
                        if (etx.ae(etx.Y(a2)) ? aujsVar.h : aujsVar.g) {
                            ily ilyVar2 = iimVar.v;
                            etx.M(ilyVar2.m, G.c);
                            etx.M(ilyVar2.n, false);
                            ikn iknVar = ilyVar2.a;
                            iknVar.v = Y;
                            if (Y != null) {
                                iknVar.x.clear();
                                iknVar.y.clear();
                                int i4 = ikn.i(Y);
                                if (etx.am(i4)) {
                                    iknVar.b();
                                } else {
                                    iknVar.k = LayoutInflater.from(iknVar.e.getContext()).inflate(R.layout.reel_player_dyn_footer_vert, iknVar.e, false);
                                    iknVar.e.addView(iknVar.k);
                                }
                                iknVar.n = iknVar.k.findViewById(R.id.reel_byline_separator);
                                iknVar.l = (LottieAnimationView) iknVar.k.findViewById(R.id.reel_lazy_loader_anim);
                                iknVar.m = (ViewGroup) iknVar.k.findViewById(R.id.reel_dyn_lazy_loader_bar);
                                if (iknVar.e.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                                    iknVar.l.setScaleX(-1.0f);
                                }
                                etx.M(iknVar.e, true);
                                etx.M(iknVar.n, false);
                                iknVar.x.add(ObjectAnimator.ofFloat(iknVar.l, (Property<LottieAnimationView, Float>) View.ALPHA, 0.0f, 1.0f));
                                iknVar.x.add(ObjectAnimator.ofFloat(iknVar.m, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
                                iknVar.y.add(ObjectAnimator.ofFloat(iknVar.l, (Property<LottieAnimationView, Float>) View.ALPHA, 1.0f, 0.0f));
                                iknVar.y.add(ObjectAnimator.ofFloat(iknVar.m, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f));
                                if (iknVar.v != null && iknVar.m != null) {
                                    boolean am = etx.am(i4);
                                    int i5 = 0;
                                    while (i5 < 5) {
                                        int i6 = 4;
                                        if (!am) {
                                            i2 = R.layout.reel_player_dyn_footer_vert_cell;
                                            i6 = i5;
                                            i3 = R.drawable.lazy_loader_icon;
                                        } else if (i5 == 4) {
                                            i3 = R.drawable.lazy_loader_right_icon_pivot;
                                            i2 = R.layout.reel_player_right_lazy_loader_pivot_cell;
                                        } else {
                                            i2 = R.layout.reel_player_right_lazy_loader_cell;
                                            i6 = i5;
                                            i3 = R.drawable.lazy_loader_right_icon_text;
                                        }
                                        View h = ikn.h(iknVar.m, i4, i2, i3);
                                        if (!am) {
                                            h.setPaddingRelative(h.getPaddingStart(), 0, h.getPaddingEnd(), h.getPaddingBottom());
                                        }
                                        i5 = i6 + 1;
                                    }
                                }
                                if (iknVar.l != null) {
                                    iknVar.z.setDuration(100L);
                                    iknVar.z.playTogether(iknVar.x);
                                    iknVar.z.start();
                                    iknVar.l.k(0.0f);
                                    iknVar.l.e();
                                    etx.M(iknVar.l, true);
                                    etx.M(iknVar.m, true);
                                }
                            }
                        }
                    }
                    iimVar.v.o(str2, Y, G.a, false, false, false, G.c, a2);
                }
                iimVar.v.m(str2, arsdVar, G.a, z, G.c, a2);
            }
        }
        final ihl ihlVar = this.j;
        ihlVar.i.execute(new Runnable() { // from class: igy
            @Override // java.lang.Runnable
            public final void run() {
                ihl ihlVar2 = ihl.this;
                int i7 = i;
                if (ihlVar2.B && i7 == ihlVar2.y && i7 != ihlVar2.n.B(ihlVar2.w)) {
                    ihlVar2.l(false);
                }
            }
        });
    }

    @Override // defpackage.vw
    public final /* synthetic */ void p(wv wvVar) {
        ((iin) wvVar).F();
    }

    public final int w(int i) {
        return i - L();
    }

    public final int x() {
        int i;
        synchronized (this.d) {
            i = -1;
            if (this.l && this.f) {
                i = this.d.size() + L();
            }
        }
        return i;
    }

    public final int y() {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return C() == -1 ? 0 : 1;
        }
    }

    public final int z() {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return A(this.d.size() - 1);
        }
    }
}
