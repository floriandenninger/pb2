package defpackage;

import android.content.res.Configuration;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.apps.youtube.embeddedplayer.service.model.a;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;
import com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opf implements oor, yzo, yzp, giz {
    private final lza A;
    private final yqw C;
    private final opq D;
    private final axpg E;
    private final axpg F;
    private final lkb G;
    private final lkb H;
    private final aoae I;

    /* renamed from: J, reason: collision with root package name */
    private final aoae f252J;
    public final aahd a;
    public final gje b;
    public final fgq c;
    public final miv d;
    public final azrw e;
    public final izu f;
    public final zaz g;
    public final aypy h;
    public final ayqi i;
    public final aypy j;
    public final oqf k;
    public final axpg l;
    public Configuration o;
    public boolean r;
    public boolean s;
    public jfy t;
    public boolean u;
    public final aadw v;
    public final aifh w;
    public final ajoy x;
    private final ajut y;
    private final afzp z;
    private final Set B = Collections.newSetFromMap(new WeakHashMap());
    public final Set m = new HashSet();
    public final amrz n = amrz.k("com.google.android.apps.youtube.app.endpoint.flags", 16);
    public amru p = amru.q();
    public Optional q = Optional.empty();

    public opf(ajut ajutVar, aahd aahdVar, lza lzaVar, afzp afzpVar, gje gjeVar, fgq fgqVar, miv mivVar, azrw azrwVar, aoae aoaeVar, aoae aoaeVar2, zaz zazVar, aypy aypyVar, izu izuVar, yqw yqwVar, ayqi ayqiVar, aadw aadwVar, lkb lkbVar, lkb lkbVar2, aifh aifhVar, ajoy ajoyVar, aypy aypyVar2, opq opqVar, oqf oqfVar, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.y = ajutVar;
        this.a = aahdVar;
        this.z = afzpVar;
        this.A = lzaVar;
        this.b = gjeVar;
        this.c = fgqVar;
        this.d = mivVar;
        this.e = azrwVar;
        this.I = aoaeVar;
        this.f252J = aoaeVar2;
        this.g = zazVar;
        this.h = aypyVar;
        this.f = izuVar;
        this.C = yqwVar;
        this.i = ayqiVar;
        this.v = aadwVar;
        this.G = lkbVar;
        this.H = lkbVar2;
        this.w = aifhVar;
        this.x = ajoyVar;
        this.j = aypyVar2;
        this.D = opqVar;
        this.k = oqfVar;
        this.F = axpgVar;
        this.E = axpgVar2;
        this.l = axpgVar3;
        afzpVar.c(this, 0L);
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).cf) {
            return;
        }
        axpgVar.get();
    }

    private final void A(boolean z) {
        boolean x;
        nqp nqpVar;
        if (this.q.isPresent()) {
            PivotBar pivotBar = (PivotBar) this.q.get();
            if (z) {
                pivotBar.setTranslationY(0.0f);
            }
            asvu asvuVar = this.v.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.cf) {
                WeakReference weakReference = (WeakReference) ((nqz) this.E.get()).a.get();
                x = (weakReference == null || (nqpVar = (nqp) weakReference.get()) == null) ? false : nqpVar.x();
            } else {
                x = ((nqp) this.F.get()).x();
            }
            if (pivotBar.j() <= 0 || !this.s || x) {
                t();
            } else {
                pivotBar.setVisibility(0);
            }
        }
    }

    private final void B(float f) {
        if (!this.r || !this.q.isPresent()) {
            t();
            return;
        }
        A(false);
        ((PivotBar) this.q.get()).setTranslationY(f * ((PivotBar) this.q.get()).getHeight());
    }

    private final boolean C(int i) {
        aoae aoaeVar = this.f252J;
        PaneDescriptor d = this.b.d();
        return aoaeVar.g(d != null ? d.e() : null, (apxf) q(i).flatMap(mjq.t).orElse(apxf.a));
    }

    private final boolean D(PaneDescriptor paneDescriptor) {
        return paneDescriptor == null || this.H.m(paneDescriptor);
    }

    private final boolean E(int i) {
        Optional q = q(i);
        if (!q.isPresent()) {
            return false;
        }
        q.flatMap(mjq.t).ifPresent(new oow(this, 4));
        return true;
    }

    private final Optional y(atvw atvwVar) {
        Optional empty;
        if (this.q.isPresent()) {
            aulq aulqVar = atvwVar.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer)) {
                aulq aulqVar2 = atvwVar.l;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                empty = Optional.of((UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) aulqVar2.pX(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer));
            } else {
                empty = Optional.empty();
            }
            return empty.map(new ooz(this, 1));
        }
        return Optional.empty();
    }

    private final Optional z(String str) {
        return this.k.d(str).map(opb.a);
    }

    @Override // defpackage.jfq
    public final void a(float f) {
        B(f);
    }

    @Override // defpackage.jgg
    public final void b(jfy jfyVar) {
        this.t = jfyVar;
    }

    @Override // defpackage.oke
    public final void c(float f) {
        B(f);
    }

    @Override // defpackage.oor
    public final aaxh d() {
        return (aaxh) this.f.a().aB();
    }

    @Override // defpackage.oor
    public final void e(ooq ooqVar) {
        this.B.add(ooqVar);
    }

    @Override // defpackage.giz
    public final void f(int i, int i2) {
        boolean z = false;
        if (i2 == 1 && D(this.b.d())) {
            z = true;
        }
        this.u = z;
    }

    @Override // defpackage.oor
    public final void g(boolean z) {
        if (z) {
            t();
        } else {
            A(false);
        }
    }

    @Override // defpackage.oor
    public final void h(boolean z) {
        if (z) {
            return;
        }
        v();
    }

    @Override // defpackage.oor
    public final void i(boolean z) {
        boolean g;
        int a;
        if (this.q.isPresent()) {
            PivotBar pivotBar = (PivotBar) this.q.get();
            if (!z) {
                for (int i = 0; i < this.p.size(); i++) {
                    if (i != pivotBar.i) {
                        pivotBar.g(i, false, 0);
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                if (i2 != pivotBar.i) {
                    String str = (String) q(i2).flatMap(mjq.u).orElse("");
                    if (str.equals("FEactivity")) {
                        g = true;
                        if (!this.z.g("FEshared") && !this.z.g("FEnotifications_inbox")) {
                            g = false;
                        }
                        a = this.z.a("FEactivity");
                    } else {
                        g = this.z.g(str);
                        a = this.z.a(str);
                    }
                    pivotBar.g(i2, g, a);
                }
            }
        }
    }

    @Override // defpackage.oor
    public final void j(PivotBar pivotBar) {
        this.q = Optional.ofNullable(pivotBar);
        this.b.k(this);
        this.q.ifPresent(nvp.f);
        final int i = 1;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                final int i3 = 2;
                if (i2 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i4 = i3;
                            if (i4 == 0) {
                                opf opfVar2 = opfVar;
                                int i5 = opfVar2.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar2.q.isPresent()) {
                                    yny.z((View) opfVar2.q.get(), yny.k(i5), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i4 == 1) {
                                opf opfVar3 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar3.t();
                                    return;
                                } else {
                                    opfVar3.v();
                                    return;
                                }
                            }
                            if (i4 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i4 != 3) {
                                opf opfVar4 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar4.e.get()).b(opfVar4.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar4.t();
                                    } else {
                                        opfVar4.v();
                                        Optional s = opfVar4.s(opfVar4.b.b());
                                        if (s.isPresent() && opfVar4.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar4.q.get()).j()) {
                                            ((PivotBar) opfVar4.q.get()).m(intValue, opfVar4.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar4, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar5 = opfVar;
                            opfVar5.q.ifPresent(new oow(opfVar5, 2));
                            opfVar5.w(true);
                        }
                    });
                }
                final int i4 = 1;
                if (i2 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i4;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar2;
                                int i5 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i5), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar3 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar3.t();
                                    return;
                                } else {
                                    opfVar3.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar4 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar4.e.get()).b(opfVar4.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar4.t();
                                    } else {
                                        opfVar4.v();
                                        Optional s = opfVar4.s(opfVar4.b.b());
                                        if (s.isPresent() && opfVar4.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar4.q.get()).j()) {
                                            ((PivotBar) opfVar4.q.get()).m(intValue, opfVar4.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar4, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar5 = opfVar2;
                            opfVar5.q.ifPresent(new oow(opfVar5, 2));
                            opfVar5.w(true);
                        }
                    });
                }
                if (i2 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i5 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i5));
                                final int i6 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i8 = i5;
                                        if (i8 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i8 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i8 = i6;
                                        if (i8 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i8 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i5 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i5 = 3;
                if (i2 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i5;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar4;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar5 = opfVar4;
                            opfVar5.q.ifPresent(new oow(opfVar5, 2));
                            opfVar5.w(true);
                        }
                    });
                }
                final int i6 = 4;
                if (i2 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i7;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar5;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i42 = i6;
                        if (i42 == 0) {
                            opf opfVar22 = opfVar6;
                            int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i42 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i42 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i42 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
        final int i2 = 0;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i2;
                final int i3 = 2;
                if (i22 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i3;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i4 = 1;
                if (i22 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i4;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar2;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar2;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                if (i22 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i5 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i5));
                                final int i6 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i5;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i6;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i5 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i5 = 3;
                if (i22 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i5;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar4;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar4;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i6 = 4;
                if (i22 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i7;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar5;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i42 = i6;
                        if (i42 == 0) {
                            opf opfVar22 = opfVar6;
                            int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i42 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i42 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i42 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
        final int i3 = 3;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i3;
                final int i32 = 2;
                if (i22 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i32;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i4 = 1;
                if (i22 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i4;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar2;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar2;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                if (i22 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i5 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i5));
                                final int i6 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i5;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i6;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i5 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i5 = 3;
                if (i22 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i5;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar4;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar4;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i6 = 4;
                if (i22 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i7;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar5;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i42 = i6;
                        if (i42 == 0) {
                            opf opfVar22 = opfVar6;
                            int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i42 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i42 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i42 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
        final int i4 = 4;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i4;
                final int i32 = 2;
                if (i22 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i42 = i32;
                            if (i42 == 0) {
                                opf opfVar22 = opfVar;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i42 == 1) {
                                opf opfVar32 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i42 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i42 != 3) {
                                opf opfVar42 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i42 = 1;
                if (i22 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i42;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar2;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar2;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                if (i22 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i5 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i5));
                                final int i6 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i5;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i6;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i5 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i5 = 3;
                if (i22 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i5;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar4;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar4;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i6 = 4;
                if (i22 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i7;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar5;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i422 = i6;
                        if (i422 == 0) {
                            opf opfVar22 = opfVar6;
                            int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i422 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i422 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i422 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
        final int i5 = 2;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i5;
                final int i32 = 2;
                if (i22 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i32;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i42 = 1;
                if (i22 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i42;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar2;
                                int i52 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i52), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar2;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                if (i22 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i52 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i52));
                                final int i6 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i52;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i6;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i52 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i52 = 3;
                if (i22 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i52;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar4;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar4;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i6 = 4;
                if (i22 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i7;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar5;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i422 = i6;
                        if (i422 == 0) {
                            opf opfVar22 = opfVar6;
                            int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i422 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i422 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i422 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
        final int i6 = 5;
        this.C.f(new Callable(this) { // from class: oou
            public final /* synthetic */ opf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i6;
                final int i32 = 2;
                if (i22 == 0) {
                    final opf opfVar = this.a;
                    return opfVar.f.a().ak(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i32;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i42 = 1;
                if (i22 == 1) {
                    final opf opfVar2 = this.a;
                    return opfVar2.h.ab(opfVar2.i).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i42;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar2;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar2;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar2.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar2;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar2;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                if (i22 == 2) {
                    final opf opfVar3 = this.a;
                    return opfVar3.f.a().ab(opfVar3.i).G(oqu.b).ax(new ayrs() { // from class: opc
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            opf opfVar4 = opf.this;
                            aaxh aaxhVar = (aaxh) obj;
                            boolean z = true;
                            z = true;
                            z = true;
                            z = true;
                            final int i52 = 0;
                            if (aaxhVar != null && aaxhVar.a != null) {
                                amru amruVar = opfVar4.p;
                                opfVar4.p = amru.n(aypy.W(aaxhVar).Y(ohs.h).N(ohs.i).Y(ohs.j).N(ohs.k).Y(ohs.l).L(oht.c).Y(ohs.m).aA());
                                final oqf oqfVar = opfVar4.k;
                                amru amruVar2 = opfVar4.p;
                                amsx amsxVar = !oqfVar.c.isEmpty() ? oqfVar.c : (amsx) ((ayqj) aypy.T(oqfVar.a.j()).O(new ayrv() { // from class: oqd
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        oqf oqfVar2 = oqf.this;
                                        final Integer num = (Integer) obj2;
                                        ayps w = ayps.w(num);
                                        final gje gjeVar = oqfVar2.a;
                                        gjeVar.getClass();
                                        ayps x = w.x(new ayrv() { // from class: oqb
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return gje.this.i(((Integer) obj3).intValue());
                                            }
                                        }).r(oht.e).x(ohs.u);
                                        final opq opqVar = oqfVar2.b;
                                        return x.x(new ayrv() { // from class: oqc
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return opq.this.a((PaneDescriptor) obj3);
                                            }
                                        }).r(oht.e).x(oqj.b).x(new ayrv() { // from class: opt
                                            @Override // defpackage.ayrv
                                            public final Object a(Object obj3) {
                                                return ammw.a((String) obj3, num);
                                            }
                                        });
                                    }
                                }).Y(ohs.s).aD(zcz.d)).X();
                                final int b = oqfVar.a.b();
                                amsx amsxVar2 = (amsx) ((ayqj) aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).aD(zcz.d)).X();
                                final amrz amrzVar = (amrz) aypy.T(amsxVar).L(new opx(amsxVar2, 0)).L(oht.d).aD(new ops(ohs.q, ohs.p, i52));
                                final int i62 = 2;
                                aypy L = aypy.T(amsxVar).L(new opx(amsxVar2, 2));
                                final int i7 = z ? 1 : 0;
                                aypy L2 = L.L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i7 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                });
                                ayrs ayrsVar = new ayrs() { // from class: oqa
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        oqf.this.a.q(((opl) obj2).c);
                                    }
                                };
                                Iterator it = L2.aA().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ayrsVar.a(it.next());
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        ((ayqx) it).qc();
                                        throw azqi.b(th);
                                    }
                                }
                                aypy ap = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o).L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i52;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).ap(oqf.a().L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i62;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).L(new ayrw() { // from class: opv
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        if (i52 != 0) {
                                            return ((opl) obj2).c != b;
                                        }
                                        return ((Integer) obj2).intValue() != b;
                                    }
                                }), nxd.m);
                                aypy ap2 = aypy.T(amruVar2).Y(ohs.o).L(oht.e).Y(oqj.b).ap(oqf.a(), nxd.o);
                                final int i8 = z ? 1 : 0;
                                oqfVar.c = (amsx) ((ayqj) ap2.L(new ayrw() { // from class: opw
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj2) {
                                        int i82 = i8;
                                        if (i82 == 0) {
                                            return !amrzVar.containsKey(((ammw) obj2).a);
                                        }
                                        if (i82 != 1) {
                                            return !amrzVar.containsValue((Integer) obj2);
                                        }
                                        return amrzVar.containsKey(((ammw) obj2).a);
                                    }
                                }).Y(new ayrv() { // from class: oqe
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        amrz amrzVar2 = amrz.this;
                                        ammw ammwVar = (ammw) obj2;
                                        a a = opl.a();
                                        a.f((String) ammwVar.a);
                                        a.g(((Integer) ammwVar.b).intValue());
                                        a.e(((Integer) amrzVar2.get(ammwVar.a)).intValue());
                                        return a.d();
                                    }
                                }).u(ap).aD(zcz.d)).X();
                                amru amruVar3 = opfVar4.p;
                                if (amruVar.size() == amruVar3.size()) {
                                    for (int i9 = 0; i9 < amruVar.size(); i9++) {
                                        mka mkaVar = (mka) amruVar.get(i9);
                                        mka mkaVar2 = (mka) amruVar3.get(i9);
                                        mkaVar2.getClass();
                                        if (!mkaVar.a.getClass().isInstance(mkaVar2.a)) {
                                            break;
                                        }
                                        mjz mjzVar = mkaVar.i;
                                        aooy aooyVar = mkaVar.a;
                                        if (!mjzVar.a(aooyVar, (aooy) aooyVar.getClass().cast(mkaVar2.a)) || !((mka) amruVar.get(i9)).g.equals(((mka) amruVar3.get(i9)).g)) {
                                            break;
                                        }
                                    }
                                }
                                opfVar4.w(z);
                            }
                            z = false;
                            opfVar4.w(z);
                        }
                    });
                }
                final int i52 = 3;
                if (i22 == 3) {
                    final opf opfVar4 = this.a;
                    return opfVar4.j.Y(new ayrv() { // from class: oot
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            Configuration configuration = (Configuration) obj;
                            opf.this.o = configuration;
                            return Integer.valueOf(configuration.smallestScreenWidthDp);
                        }
                    }).B().af(1L).ax(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i52;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar4;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar4;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar4.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar4;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar4;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final int i62 = 4;
                if (i22 == 4) {
                    final opf opfVar5 = this.a;
                    final int i7 = 0;
                    return opfVar5.g.d().X(new ayrs() { // from class: oox
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            int intValue;
                            int i422 = i7;
                            if (i422 == 0) {
                                opf opfVar22 = opfVar5;
                                int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                                if (opfVar22.q.isPresent()) {
                                    yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                    return;
                                }
                                return;
                            }
                            if (i422 == 1) {
                                opf opfVar32 = opfVar5;
                                if (((gdj) obj).a()) {
                                    opfVar32.t();
                                    return;
                                } else {
                                    opfVar32.v();
                                    return;
                                }
                            }
                            if (i422 == 2) {
                                opfVar5.w.a.d(new feb());
                                return;
                            }
                            if (i422 != 3) {
                                opf opfVar42 = opfVar5;
                                Optional optional = (Optional) obj;
                                ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                                if (optional.isPresent()) {
                                    if (!((gai) optional.get()).b) {
                                        opfVar42.t();
                                    } else {
                                        opfVar42.v();
                                        Optional s = opfVar42.s(opfVar42.b.b());
                                        if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                            ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                        }
                                    }
                                    ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                    return;
                                }
                                return;
                            }
                            opf opfVar52 = opfVar5;
                            opfVar52.q.ifPresent(new oow(opfVar52, 2));
                            opfVar52.w(true);
                        }
                    });
                }
                final opf opfVar6 = this.a;
                return aypy.o(opfVar6.c.h(), opfVar6.b.h().aj(ohs.g), opfVar6.d.a(), new ayrt() { // from class: ope
                    @Override // defpackage.ayrt
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        gak gakVar;
                        opf opfVar7 = opf.this;
                        fhg fhgVar = (fhg) obj;
                        gai gaiVar = (gai) obj2;
                        Boolean bool = (Boolean) obj3;
                        jfy jfyVar = opfVar7.t;
                        atax ataxVar = opfVar7.v.b().n;
                        if (ataxVar == null) {
                            ataxVar = atax.a;
                        }
                        boolean z = ataxVar.k;
                        boolean z2 = true;
                        if (fhgVar.b() || fhgVar.i() || (!z && jfyVar != null && jfyVar.h())) {
                            z2 = false;
                        }
                        opfVar7.s = z2;
                        opfVar7.r = gaiVar.b;
                        if (!z2) {
                            gah a = gai.a();
                            a.b(false);
                            return Optional.of(a.a());
                        }
                        if (fhgVar.k() || !fhgVar.f()) {
                            return Optional.of(gaiVar);
                        }
                        if (!bool.booleanValue()) {
                            gakVar = (gak) gaiVar.a.orElse(gak.ACTIVITY_DEFAULT);
                        } else {
                            gakVar = gak.DARK;
                        }
                        opfVar7.u(gakVar);
                        return Optional.empty();
                    }
                }).ax(new ayrs() { // from class: oox
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int intValue;
                        int i422 = i62;
                        if (i422 == 0) {
                            opf opfVar22 = opfVar6;
                            int i522 = opfVar22.g.l() ? ((zck) obj).a.a.bottom : 0;
                            if (opfVar22.q.isPresent()) {
                                yny.z((View) opfVar22.q.get(), yny.k(i522), ViewGroup.MarginLayoutParams.class);
                                return;
                            }
                            return;
                        }
                        if (i422 == 1) {
                            opf opfVar32 = opfVar6;
                            if (((gdj) obj).a()) {
                                opfVar32.t();
                                return;
                            } else {
                                opfVar32.v();
                                return;
                            }
                        }
                        if (i422 == 2) {
                            opfVar6.w.a.d(new feb());
                            return;
                        }
                        if (i422 != 3) {
                            opf opfVar42 = opfVar6;
                            Optional optional = (Optional) obj;
                            ((mkc) opfVar42.e.get()).b(opfVar42.b.d());
                            if (optional.isPresent()) {
                                if (!((gai) optional.get()).b) {
                                    opfVar42.t();
                                } else {
                                    opfVar42.v();
                                    Optional s = opfVar42.s(opfVar42.b.b());
                                    if (s.isPresent() && opfVar42.q.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < ((PivotBar) opfVar42.q.get()).j()) {
                                        ((PivotBar) opfVar42.q.get()).m(intValue, opfVar42.u);
                                    }
                                }
                                ((gai) optional.get()).a.ifPresent(new oow(opfVar42, 1));
                                return;
                            }
                            return;
                        }
                        opf opfVar52 = opfVar6;
                        opfVar52.q.ifPresent(new oow(opfVar52, 2));
                        opfVar52.w(true);
                    }
                });
            }
        });
    }

    @Override // defpackage.oor
    public final boolean k(String str) {
        str.getClass();
        return z(str).isPresent();
    }

    @Override // defpackage.afzo
    public final void l(String str) {
    }

    @Override // defpackage.oor
    public final boolean m() {
        if (this.q.isPresent()) {
            return E(((PivotBar) this.q.get()).i);
        }
        return false;
    }

    @Override // defpackage.oor
    public final void n(final Runnable runnable) {
        this.A.f();
        afzp afzpVar = this.z;
        yjk.f();
        for (Map.Entry entry : afzpVar.a.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                afzpVar.d(((afzn) entry.getKey()).a);
            }
            afzpVar.f(((afzn) entry.getKey()).a, afzv.b());
        }
        afzpVar.a.clear();
        ayps b = this.f.b();
        final ayph a = this.C.a();
        b.h(new aypw() { // from class: ziu
            @Override // defpackage.aypw
            public final aypv a(ayps aypsVar) {
                return aypsVar.I(ayph.this.L().j(new Object()));
            }
        }).U(new ayrs() { // from class: opd
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                opf opfVar = opf.this;
                Runnable runnable2 = runnable;
                opfVar.b.n();
                runnable2.run();
            }
        });
    }

    @Override // defpackage.afzo
    public final void o(String str, boolean z, int i) {
        if (TextUtils.isEmpty(str) || this.p.isEmpty() || !this.q.isPresent()) {
            return;
        }
        PivotBar pivotBar = (PivotBar) this.q.get();
        Optional z2 = z(str);
        if (!z2.isPresent() || ((Integer) z2.get()).intValue() == pivotBar.i || ((Integer) z2.get()).intValue() < 0 || ((Integer) z2.get()).intValue() >= this.p.size()) {
            return;
        }
        pivotBar.g(((Integer) z2.get()).intValue(), z, i);
    }

    @Override // defpackage.oor
    public final void p(PaneDescriptor paneDescriptor) {
        Optional a = this.D.a(paneDescriptor);
        final oqf oqfVar = this.k;
        oqfVar.getClass();
        Optional flatMap = a.flatMap(new Function() { // from class: opa
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return oqf.this.d((String) obj);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).map(opb.a).flatMap(new ooz(this, 0));
        if (flatMap.isPresent()) {
            this.b.D(((Integer) flatMap.get()).intValue(), 0);
        }
    }

    @Override // defpackage.yzo
    public final void pm(final int i, int i2, boolean z) {
        final int a;
        this.z.d((String) q(i2).flatMap(mjq.u).orElse(""));
        if (this.q.isPresent()) {
            final PivotBar pivotBar = (PivotBar) this.q.get();
            final mkc mkcVar = (mkc) this.e.get();
            if (z) {
                mkcVar.e();
            }
            Optional z2 = z("FElibrary");
            for (final int i3 = 0; i3 < this.p.size(); i3++) {
                final mka mkaVar = (mka) this.p.get(i3);
                if (mkaVar.b.isPresent()) {
                    if (!z2.isPresent() || ((Integer) z2.get()).intValue() != i3) {
                        mkcVar.g(mkaVar, pivotBar.k(i3), null);
                    } else {
                        mkcVar.d(new zfi() { // from class: oos
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                mkc mkcVar2 = mkc.this;
                                mka mkaVar2 = mkaVar;
                                PivotBar pivotBar2 = pivotBar;
                                int i4 = i3;
                                Boolean bool = (Boolean) obj;
                                if (bool == null || !bool.booleanValue()) {
                                    return;
                                }
                                mkcVar2.g(mkaVar2, pivotBar2.k(i4), mkcVar2.a());
                            }
                        });
                    }
                }
            }
        }
        if (z) {
            if (i2 == i && this.b.E() && C(i2)) {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((ooq) it.next()).F();
                }
                this.b.o();
                return;
            }
            if (i2 == i) {
                if (!this.b.E()) {
                    this.b.G();
                }
                if (this.b.E() && C(i2)) {
                    return;
                }
                E(i2);
                return;
            }
            if (i != -1 && i < this.p.size()) {
                Optional flatMap = q(i).flatMap(mjq.u);
                if (flatMap.isPresent() && !((String) flatMap.get()).isEmpty() && (a = this.z.a((String) flatMap.get())) > 0) {
                    this.q.ifPresent(new Consumer() { // from class: oov
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            ((PivotBar) obj).g(i, true, a);
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer.CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            if (i != i2) {
                r(i2).ifPresent(new oow(this, 5));
                if (D(this.b.d())) {
                    E(i2);
                }
                this.q.ifPresent(new kot(i2, 6));
            }
        }
    }

    public final Optional q(int i) {
        if (i < 0 || i >= this.p.size()) {
            return Optional.empty();
        }
        return Optional.of((mka) this.p.get(i));
    }

    public final Optional r(int i) {
        return this.k.b(new opy(i, 0)).map(opb.b);
    }

    public final Optional s(int i) {
        return this.k.c(i).map(opb.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.q.ifPresent(nvp.e);
    }

    public final void u(gak gakVar) {
        gak gakVar2 = gak.ACTIVITY_DEFAULT;
        int ordinal = gakVar.ordinal();
        int i = R.style.PivotBar_Default;
        if (ordinal != 0 && ordinal == 1) {
            i = R.style.PivotBar_Dark;
        }
        this.q.ifPresent(new kot(i, 7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        A(true);
    }

    public final void w(boolean z) {
        apxf e;
        Optional empty;
        avru avruVar;
        avru avruVar2;
        if (this.q.isPresent()) {
            boolean z2 = false;
            if (!z) {
                if (this.q.isPresent()) {
                    PivotBar pivotBar = (PivotBar) this.q.get();
                    for (int i = 0; i < this.p.size(); i++) {
                        if (i != pivotBar.i) {
                            String str = (String) ((mka) this.p.get(i)).d.orElse("");
                            pivotBar.g(i, this.z.g(str), this.z.a(str));
                        }
                    }
                }
            } else {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((akcp) this.l.get()).g((String) it.next());
                }
                this.m.clear();
                this.q.ifPresent(nvp.c);
                int i2 = 0;
                while (i2 < this.p.size()) {
                    mka mkaVar = (mka) this.p.get(i2);
                    aooy aooyVar = mkaVar.a;
                    View view = null;
                    aqyg aqygVar = null;
                    aqyg aqygVar2 = null;
                    View view2 = null;
                    if (!(aooyVar instanceof atvw)) {
                        if (aooyVar instanceof atvt) {
                            atvt atvtVar = (atvt) aooyVar;
                            atvx atvxVar = (atvx) mkaVar.g.orElse(atvx.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN);
                            if (this.q.isPresent()) {
                                PivotBar pivotBar2 = (PivotBar) this.q.get();
                                ajut ajutVar = this.y;
                                arfs arfsVar = atvtVar.g;
                                if (arfsVar == null) {
                                    arfsVar = arfs.a;
                                }
                                arfr b = arfr.b(arfsVar.c);
                                if (b == null) {
                                    b = arfr.UNKNOWN;
                                }
                                int a = ajutVar.a(b);
                                aott aottVar = atvtVar.f;
                                if (aottVar == null) {
                                    aottVar = aott.a;
                                }
                                aots aotsVar = aottVar.c;
                                if (aotsVar == null) {
                                    aotsVar = aots.a;
                                }
                                view = pivotBar2.c(new mjo(pivotBar2, R.layout.image_only_tab, pivotBar2.h, aii.a(pivotBar2.getContext(), a), aotsVar.c, new HashMap(), Optional.empty()), false, 0, atvxVar);
                            }
                            empty = Optional.ofNullable(view);
                        } else {
                            empty = Optional.empty();
                        }
                    } else {
                        boolean z3 = mkaVar.f || this.z.g((String) mkaVar.d.orElse(""));
                        atvw atvwVar = (atvw) mkaVar.a;
                        atvx atvxVar2 = (atvx) mkaVar.g.orElse(atvx.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN);
                        if (this.q.isPresent()) {
                            PivotBar pivotBar3 = (PivotBar) this.q.get();
                            ajut ajutVar2 = this.y;
                            if (ajutVar2 instanceof ggs) {
                                ggs ggsVar = (ggs) ajutVar2;
                                arfs arfsVar2 = atvwVar.g;
                                if (arfsVar2 == null) {
                                    arfsVar2 = arfs.a;
                                }
                                arfr b2 = arfr.b(arfsVar2.c);
                                if (b2 == null) {
                                    b2 = arfr.UNKNOWN;
                                }
                                int b3 = ggsVar.b(b2, z2);
                                ggs ggsVar2 = (ggs) this.y;
                                arfs arfsVar3 = atvwVar.g;
                                if (arfsVar3 == null) {
                                    arfsVar3 = arfs.a;
                                }
                                arfr b4 = arfr.b(arfsVar3.c);
                                if (b4 == null) {
                                    b4 = arfr.UNKNOWN;
                                }
                                int b5 = ggsVar2.b(b4, true);
                                if ((atvwVar.b & 16) != 0 && (aqygVar = atvwVar.f) == null) {
                                    aqygVar = aqyg.a;
                                }
                                CharSequence b6 = ajcq.b(aqygVar);
                                int a2 = this.z.a(atvwVar.c);
                                atvu atvuVar = atvwVar.i;
                                if (atvuVar == null) {
                                    atvuVar = atvu.a;
                                }
                                if (atvuVar.b == 318370164) {
                                    avruVar2 = (avru) atvuVar.c;
                                } else {
                                    avruVar2 = avru.a;
                                }
                                Map unmodifiableMap = Collections.unmodifiableMap(avruVar2.b);
                                Optional y = y(atvwVar);
                                StateListDrawable stateListDrawable = new StateListDrawable();
                                stateListDrawable.addState(new int[]{android.R.attr.state_activated}, aii.a(pivotBar3.getContext(), b5));
                                stateListDrawable.addState(StateSet.WILD_CARD, aii.a(pivotBar3.getContext(), b3));
                                view2 = pivotBar3.b(stateListDrawable, b6, z3, a2, unmodifiableMap, atvxVar2, y);
                            } else {
                                arfs arfsVar4 = atvwVar.g;
                                if (arfsVar4 == null) {
                                    arfsVar4 = arfs.a;
                                }
                                arfr b7 = arfr.b(arfsVar4.c);
                                if (b7 == null) {
                                    b7 = arfr.UNKNOWN;
                                }
                                int a3 = ajutVar2.a(b7);
                                if ((atvwVar.b & 16) != 0 && (aqygVar2 = atvwVar.f) == null) {
                                    aqygVar2 = aqyg.a;
                                }
                                CharSequence b8 = ajcq.b(aqygVar2);
                                int a4 = this.z.a(atvwVar.c);
                                atvu atvuVar2 = atvwVar.i;
                                if (atvuVar2 == null) {
                                    atvuVar2 = atvu.a;
                                }
                                if (atvuVar2.b == 318370164) {
                                    avruVar = (avru) atvuVar2.c;
                                } else {
                                    avruVar = avru.a;
                                }
                                view2 = pivotBar3.b(aii.a(pivotBar3.getContext(), a3), b8, z3, a4, Collections.unmodifiableMap(avruVar.b), atvxVar2, y(atvwVar));
                            }
                        }
                        empty = Optional.ofNullable(view2);
                    }
                    if (empty.isPresent()) {
                        final View view3 = (View) empty.get();
                        mkaVar.h.ifPresent(new Consumer() { // from class: ooy
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj) {
                                opf opfVar = opf.this;
                                View view4 = view3;
                                String str2 = (String) obj;
                                opfVar.m.add(str2);
                                ((akcp) opfVar.l.get()).d(str2, view4);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                        if (evr.aB(this.v)) {
                            akaw.e(view3);
                        }
                        this.I.c(mkaVar, view3);
                    }
                    i2++;
                    z2 = false;
                }
                this.q.ifPresent(new oow(this, 0));
                s(this.b.b()).ifPresent(new oow(this, 6));
            }
            Optional map = this.k.c(this.b.b()).map(opb.a);
            if (!map.isPresent()) {
                this.q.ifPresent(nvp.d);
            } else {
                x(((Integer) map.get()).intValue());
            }
            PaneDescriptor d = this.b.d();
            if (d == null || (((e = d.e()) == null || (!e.pY(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint) && !e.pY(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint) && !e.pY(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint) && ((aunn) e.pX(SearchEndpointOuterClass.searchEndpoint)).f.isEmpty())) && ((e == null || (!e.pY(WatchEndpointOuterClass.watchEndpoint) && !e.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) && !e.pY(atrs.a))) && ((e == null || !((aplt) e.pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEvideo_picker")) && !this.G.d(d))))) {
                v();
            } else {
                t();
            }
        }
    }

    public final void x(int i) {
        if (this.q.isPresent()) {
            PivotBar pivotBar = (PivotBar) this.q.get();
            if (i < 0 || i >= pivotBar.j()) {
                return;
            }
            pivotBar.m(i, false);
        }
    }
}
