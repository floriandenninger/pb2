package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.youtube.R;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hht implements hmi, hgo, pny, hnv {
    public final hrv A;
    public bgw B;
    public final hhy C;
    public boolean D;
    zsk E;
    public boolean F;
    public final hhf G;
    public final zpi H;
    private final hrs I;

    /* renamed from: J, reason: collision with root package name */
    private ayqx f217J;
    private hoy L;
    public final Executor c;
    public final aok d;
    public final shf e;
    public final hos f;
    public final hmw g;
    public final hrq h;
    public final hlo i;
    public Context j;
    public ayqx k;
    public Uri l;
    public long m;
    public ShortsPlayerView n;
    public hhs o;
    public hiq p;
    pom r;
    zrs s;
    vsy u;
    public long v;
    public float w;
    public String x;
    public boolean y;
    public long a = -9223372036854775807L;
    public long b = 0;
    public boolean q = false;
    final zsq t = ztd.j();
    private final azrl K = azrl.e();
    public final azrl z = azrl.e();

    public hht(hrs hrsVar, Executor executor, aok aokVar, shf shfVar, hos hosVar, hmw hmwVar, hhf hhfVar, hrv hrvVar, hlo hloVar, hrq hrqVar, zpi zpiVar, hhy hhyVar) {
        this.I = hrsVar;
        this.c = executor;
        this.d = aokVar;
        this.e = shfVar;
        this.f = hosVar;
        this.g = hmwVar;
        this.G = hhfVar;
        this.A = hrvVar;
        this.i = hloVar;
        this.h = hrqVar;
        this.H = zpiVar;
        this.C = hhyVar;
    }

    private final Object D(amml ammlVar, Object obj) {
        pom pomVar = this.r;
        return pomVar == null ? obj : ammlVar.apply(pomVar);
    }

    public final void A(final atmc atmcVar, final String str) {
        if (this.g.a() != null && !this.g.a().d().h()) {
            hhs hhsVar = this.o;
            if (hhsVar != null) {
                hhsVar.aK();
                return;
            }
            return;
        }
        zrx l = l();
        if (l != null) {
            l.e(true, new zrz() { // from class: hhp
                @Override // defpackage.zrz
                public final void a(File file, axdu axduVar) {
                    hht hhtVar = hht.this;
                    atmc atmcVar2 = atmcVar;
                    String str2 = str;
                    if (axduVar == null || axduVar.a() <= 0) {
                        hhtVar.B(atmcVar2, null, null, str2);
                        return;
                    }
                    if (axduVar.g()) {
                        hhtVar.B(atmcVar2, file, axduVar, str2);
                        return;
                    }
                    zga.l("State event received during upload is not for upload");
                    afsi.b(2, 6, "[ShortsCreation][Android][Edit]State event received during upload is not for upload");
                    hhs hhsVar2 = hhtVar.o;
                    if (hhsVar2 != null) {
                        hhsVar2.aK();
                    }
                }
            });
        } else {
            B(atmcVar, null, null, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x066b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.atmc r25, java.io.File r26, defpackage.axdu r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hht.B(atmc, java.io.File, axdu, java.lang.String):void");
    }

    public final void C() {
        this.f217J = this.f.c().ab(ayqr.a()).ax(new ayrs() { // from class: hhj
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                boolean z;
                final hht hhtVar = hht.this;
                hpa hpaVar = (hpa) obj;
                ammv d = hpaVar.d();
                if (!d.h()) {
                    zga.b("Project unexpectedly missing ComposedVideo.");
                    afsi.b(2, 6, "[ShortsCreation][Android][Edit]Null ComposedVideo on prepare video");
                    hhs hhsVar = hhtVar.o;
                    if (hhsVar != null) {
                        ((hhd) hhsVar).aJ();
                        return;
                    }
                    return;
                }
                hhtVar.u = hpaVar.H();
                hhtVar.B = new hhr(hhtVar.u, hhtVar.H);
                pom pomVar = hhtVar.r;
                if (pomVar != null) {
                    pomVar.L(hhtVar.B);
                }
                ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata) d.c();
                zrs zrsVar = hhtVar.s;
                if (zrsVar != null) {
                    double b = shortsVideoMetadata.b();
                    double a = shortsVideoMetadata.a();
                    Double.isNaN(b);
                    Double.isNaN(a);
                    double d2 = b / a;
                    double d3 = 360.0d;
                    if (b < 360.0d) {
                        a = 360.0d / d2;
                        b = 360.0d;
                    }
                    if (a < 360.0d) {
                        b = d2 * 360.0d;
                    } else {
                        d3 = a;
                    }
                    zrsVar.c(Math.min((int) Math.round(Math.max(b, d3)), 1280));
                }
                hhtVar.l = shortsVideoMetadata.d();
                hhtVar.h.d(hhtVar.l);
                hhtVar.m = shortsVideoMetadata.c();
                if (hpaVar.c().h()) {
                    hhtVar.y = true;
                    hhtVar.w = 0.0f;
                    z = true;
                } else {
                    hhtVar.y = false;
                    z = false;
                }
                hhs hhsVar2 = hhtVar.o;
                if (hhsVar2 != null) {
                    long j = hhtVar.m;
                    hhd hhdVar = (hhd) hhsVar2;
                    if (hhdVar.c.i()) {
                        if (!z && hhdVar.c.j()) {
                            jlb jlbVar = hhdVar.aC;
                            View findViewById = hhdVar.at.findViewById(R.id.shorts_edit_volume_button);
                            hht hhtVar2 = hhdVar.b;
                            findViewById.getClass();
                            hhtVar2.getClass();
                            Context context = (Context) jlbVar.a.get();
                            context.getClass();
                            ci ciVar = (ci) jlbVar.f.get();
                            ciVar.getClass();
                            acra acraVar = (acra) jlbVar.c.get();
                            acraVar.getClass();
                            hmw hmwVar = (hmw) jlbVar.b.get();
                            hmwVar.getClass();
                            Executor executor = (Executor) jlbVar.e.get();
                            executor.getClass();
                            hrv hrvVar = (hrv) jlbVar.d.get();
                            hrvVar.getClass();
                            hhdVar.ap = new hnw(findViewById, hhtVar2, context, ciVar, acraVar, hmwVar, executor, hrvVar);
                        }
                        hhdVar.ao = hhdVar.aD.b(hhdVar.at.findViewById(R.id.shorts_edit_music_picker_button), hhdVar.a, acsb.c(106443), !z);
                        hhdVar.ao.e(true);
                        hnq hnqVar = hhdVar.ao;
                        hnqVar.b.setVisibility(0);
                        TextView textView = hnqVar.e;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        hhdVar.ao.a();
                        long min = Math.min(j, 15000L);
                        hhdVar.am.a = z;
                        hhdVar.ae.w(hhdVar.at.findViewById(R.id.shorts_edit_music_trim_button), hhdVar.c.a(), min, hhdVar.c.k() ? new hgz(hhdVar) : null, hhdVar.aB, acsb.c(106444), true, hhdVar.b, hhdVar.am, hhdVar.ar);
                    }
                }
                if (hhtVar.D) {
                    hoy k = hhtVar.k();
                    ammv ammvVar = k.b;
                    if (ammvVar.h()) {
                        hhtVar.g.m((axet) ammvVar.c());
                    }
                    String str = k.c;
                    if (!str.isEmpty()) {
                        hhtVar.m().c(str);
                    }
                    hhtVar.E = hhtVar.t.e(new zsn() { // from class: hhh
                        @Override // defpackage.zfi
                        public final void a(Object obj2) {
                            hht hhtVar3 = hht.this;
                            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj2;
                            if (filterMapTable$FilterDescriptor != null) {
                                hoy k2 = hhtVar3.k();
                                String str2 = filterMapTable$FilterDescriptor.a;
                                if (str2.equals(k2.c)) {
                                    return;
                                }
                                k2.c = str2;
                                k2.a();
                            }
                        }
                    });
                    File file = new File(k.d);
                    if (!k.d.isEmpty() && file.exists()) {
                        String str2 = k.d;
                        zrx l = hhtVar.l();
                        if (l != null) {
                            l.g(str2);
                        }
                    }
                }
                if (hhtVar.g.a() == null) {
                    hhtVar.g.j();
                }
                hhtVar.F = false;
                hhtVar.k = hhtVar.g.b().ax(new ayrs() { // from class: hhk
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        final hnw hnwVar;
                        bay bayVar;
                        final hht hhtVar3 = hht.this;
                        ammv ammvVar2 = (ammv) obj2;
                        if (hhtVar3.r == null) {
                            zga.b("ExoPlayer null while attempting to load video");
                            return;
                        }
                        if (hhtVar3.l == null || hhtVar3.m == 0) {
                            return;
                        }
                        if (ammvVar2.h() && ((ShortsCreationSelectedTrack) ammvVar2.c()).b() == null) {
                            return;
                        }
                        if (hhtVar3.D) {
                            if (!hhtVar3.F) {
                                hhtVar3.F = true;
                            } else if (ammvVar2.h()) {
                                hoy k2 = hhtVar3.k();
                                axet h = how.h((ShortsCreationSelectedTrack) ammvVar2.c());
                                if (!k2.b.h() || !h.equals(k2.b.c())) {
                                    k2.b = ammv.j(h);
                                    k2.a();
                                }
                            } else {
                                hoy k3 = hhtVar3.k();
                                k3.b = amlr.a;
                                k3.a();
                            }
                        }
                        Context context2 = hhtVar3.j;
                        bfl bflVar = new bfl(context2, pts.J(context2, "VideoMPEG"));
                        final bar a2 = new bcq(bflVar).a(pnd.a(hhtVar3.l));
                        vsy vsyVar = hhtVar3.u;
                        if (vsyVar != null) {
                            a2 = new bay(a2, vsyVar.n(), hhtVar3.u.l());
                        }
                        if (ammvVar2.h() && ((ShortsCreationSelectedTrack) ammvVar2.c()).b() != null) {
                            if (hhtVar3.y) {
                                hhtVar3.w = 0.0f;
                            } else if (!((ShortsCreationSelectedTrack) ammvVar2.c()).k().equals(hhtVar3.x)) {
                                hhtVar3.w = 0.5f;
                            }
                            hiq hiqVar = hhtVar3.p;
                            if (hiqVar != null) {
                                hiqVar.a(hhtVar3.w);
                            }
                            Uri b2 = ((ShortsCreationSelectedTrack) ammvVar2.c()).b();
                            if (b2 != null) {
                                bcr a3 = new bcq(bflVar).a(pnd.a(b2));
                                long a4 = hhtVar3.g.a().a();
                                hhtVar3.v = a4;
                                if (hhtVar3.p != null && a4 == 0) {
                                    hhtVar3.v = 1L;
                                }
                                bayVar = new bay(a3, TimeUnit.MILLISECONDS.toMicros(hhtVar3.v), TimeUnit.MILLISECONDS.toMicros(hhtVar3.v + Math.min(hhtVar3.m, 15000L)));
                            } else {
                                bayVar = null;
                            }
                            if (bayVar != null) {
                                a2 = new bce(a2, bayVar);
                            } else {
                                a2 = new bce(a2);
                            }
                        } else {
                            hiq hiqVar2 = hhtVar3.p;
                            if (hiqVar2 != null) {
                                hhtVar3.w = 1.0f;
                                hiqVar2.a(1.0f);
                            }
                        }
                        if (ammvVar2.h()) {
                            hhtVar3.x = ((ShortsCreationSelectedTrack) ammvVar2.c()).k();
                        } else {
                            hhtVar3.x = null;
                        }
                        hhs hhsVar3 = hhtVar3.o;
                        if (hhsVar3 != null && (hnwVar = ((hhd) hhsVar3).ap) != null) {
                            hnwVar.d.runOnUiThread(new Runnable() { // from class: hnu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hnw hnwVar2 = hnw.this;
                                    hnwVar2.a.setProgress(Math.round((1.0f - ((hht) hnwVar2.c).w) * 100.0f));
                                    hnwVar2.a.setMax(100);
                                }
                            });
                        }
                        hhtVar3.v(new zfi() { // from class: hhn
                            @Override // defpackage.zfi
                            public final void a(Object obj3) {
                                hht hhtVar4 = hht.this;
                                bbr bbrVar = a2;
                                pom pomVar2 = (pom) obj3;
                                if (pomVar2 == null) {
                                    return;
                                }
                                pomVar2.z(!hhtVar4.q);
                                pomVar2.K(2);
                                pomVar2.f(bbrVar);
                                pomVar2.v();
                            }
                        });
                    }
                });
            }
        });
    }

    @Override // defpackage.pny, defpackage.bhn
    public final /* synthetic */ void F(aso asoVar) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.hgo
    public final long a() {
        long j = this.a;
        return j == -9223372036854775807L ? ((Long) D(gbr.p, 0L)).longValue() : j;
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ap(asj asjVar) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.hgo
    public final long b() {
        return ((Long) D(gbr.q, 0L)).longValue();
    }

    @Override // defpackage.hgo
    public final aypy c() {
        return this.K.U();
    }

    @Override // defpackage.hgo
    public final aypy d() {
        return this.z.U();
    }

    @Override // defpackage.hgo
    public final void e() {
        v(ept.o);
    }

    @Override // defpackage.hgo
    public final void f() {
        v(ept.p);
    }

    @Override // defpackage.hgo
    public final void g(final long j) {
        v(new zfi() { // from class: hhg
            @Override // defpackage.zfi
            public final void a(Object obj) {
                hht hhtVar = hht.this;
                long j2 = j;
                pom pomVar = (pom) obj;
                if (pomVar == null) {
                    return;
                }
                hhtVar.b = hhtVar.e.d();
                pomVar.c(j2);
                hhtVar.z.c(Long.valueOf(j2));
                hhtVar.a = -9223372036854775807L;
            }
        });
    }

    @Override // defpackage.hgo
    public final void h(long j, Runnable runnable) {
        pom pomVar;
        if (this.e.d() - this.b <= 50 || (pomVar = this.r) == null || pomVar.l() != 3) {
            this.z.c(Long.valueOf(j));
            this.a = j;
        } else {
            if (runnable != null) {
                runnable.run();
            }
            g(j);
            this.a = -9223372036854775807L;
        }
    }

    @Override // defpackage.hgo
    public final boolean i() {
        return ((Boolean) D(gbr.r, false)).booleanValue();
    }

    @Override // defpackage.hmi
    public final long j() {
        return ((Long) D(new amml() { // from class: hhi
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return Long.valueOf(((pom) obj).p() + hht.this.v);
            }
        }, 0L)).longValue();
    }

    public final hoy k() {
        if (this.L == null) {
            this.L = new hoy(this.f.b());
        }
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zrx l() {
        zrs zrsVar = this.s;
        if (zrsVar != null) {
            return zrsVar.g;
        }
        return null;
    }

    public final ztf m() {
        return ((ztd) this.t).k(avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void n(boolean z) {
    }

    @Override // defpackage.pnw
    public final void o(boolean z) {
        if (z) {
            this.a = -9223372036854775807L;
        }
        this.K.c(Boolean.valueOf(z));
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void p(pnu pnuVar) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void r(pns pnsVar) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void t(pnz pnzVar, pnz pnzVar2, int i) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void u() {
    }

    public final void v(zfi zfiVar) {
        pom pomVar = this.r;
        if (pomVar != null) {
            zfiVar.a(pomVar);
        }
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.pny, defpackage.awb
    public final /* synthetic */ void x(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        zrx l;
        if (!this.D || (l = l()) == null) {
            return;
        }
        hoy k = k();
        hpa hpaVar = k.a;
        if (hpaVar instanceof how) {
            String path = new File(((how) hpaVar).n(), "editor_state_event").getPath();
            if (path.isEmpty()) {
                return;
            }
            l.f(false, ammv.j(path), k.e);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void z() {
        Object obj = this.f217J;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.f217J = null;
        }
    }
}
