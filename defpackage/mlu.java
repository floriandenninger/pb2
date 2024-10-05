package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlu extends ajpc implements mgv, ggr, gmf, ypd {
    private final fok A;
    private final InlinePlaybackController B;
    private final InlinePlaybackLifecycleController C;
    private mpk D;
    private ajyf E;
    private mgw F;
    private final mpi G;
    private final oiy H;
    public final Context a;
    public final int b;
    public final int c;
    public final ypa d;
    public final gnx e;
    public final ajpd f;
    public final ajjz g;
    public final mln h;
    final TextView i;
    final mlq j = new mlq(this);
    final ajwa k;
    public acra l;
    int m;
    nia n;
    public apoj o;
    public int p;
    public boolean q;
    Runnable r;
    final FrameLayout s;
    final SnappyRecyclerView t;
    final SnappyLinearLayoutManager u;
    private final View v;
    private final mmb x;
    private final ajyg y;
    private final mlm z;

    public mlu(Context context, ScheduledExecutorService scheduledExecutorService, shf shfVar, mmb mmbVar, mpi mpiVar, ypa ypaVar, gnx gnxVar, oiy oiyVar, InlinePlaybackController inlinePlaybackController, ajyg ajygVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ajjz ajjzVar, byte[] bArr) {
        this.a = context;
        this.G = mpiVar;
        this.x = mmbVar;
        this.d = ypaVar;
        this.e = gnxVar;
        this.y = ajygVar;
        this.z = new mlm(this, shfVar, scheduledExecutorService);
        this.H = oiyVar;
        this.C = inlinePlaybackLifecycleController;
        this.g = ajjzVar;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.carousel_item_layout, (ViewGroup) null);
        this.s = frameLayout;
        SnappyRecyclerView snappyRecyclerView = (SnappyRecyclerView) frameLayout.findViewById(R.id.carousel_items);
        this.t = snappyRecyclerView;
        this.v = frameLayout.findViewById(R.id.divider);
        this.i = (TextView) frameLayout.findViewById(R.id.dismiss_button);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.horizontal_list_buttons_height);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        mmbVar.h = snappyRecyclerView;
        mmbVar.f = new mlv(mmbVar.h, mmbVar.c, mmbVar.d, mmbVar.e);
        mmbVar.h.af(mmbVar.b);
        mmbVar.h.setNestedScrollingEnabled(false);
        mmbVar.h.W = new zbd(snappyRecyclerView);
        this.u = mmbVar.b;
        ajwa ajwaVar = mmbVar.f;
        this.k = ajwaVar;
        this.f = ajwaVar.a;
        fok fokVar = new fok();
        this.A = fokVar;
        snappyRecyclerView.o = fokVar;
        this.B = inlinePlaybackController;
        this.h = new mlp(this, frameLayout);
        snappyRecyclerView.ae(new mlk());
        frameLayout.addOnLayoutChangeListener(new mll(this, 1, null));
    }

    public static void n(View view, int i) {
        yny.z(view, yny.k(i), ViewGroup.MarginLayoutParams.class);
    }

    public static final boolean r(apoj apojVar) {
        apol apolVar = apojVar.d;
        if (apolVar == null) {
            apolVar = apol.a;
        }
        return apolVar.b == 141960765;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.s;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.m(this);
        apoj apojVar = this.o;
        if (apojVar != null && apojVar.c.size() != 0) {
            int i = this.m;
            if (i < 0 || i >= this.f.size()) {
                aong aongVar = (aong) this.o.toBuilder();
                aongVar.d(apoh.b);
                o((apoj) aongVar.build());
            } else {
                Object obj = this.f.get(this.m);
                Iterator it = this.o.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    apok apokVar = (apok) it.next();
                    if (whu.ab(apokVar) == obj) {
                        aong aongVar2 = (aong) this.o.toBuilder();
                        aongVar2.e(apoh.b, apokVar);
                        o((apoj) aongVar2.build());
                        break;
                    }
                }
            }
        }
        this.x.g.e = null;
        this.j.a.clear();
        this.f.clear();
        whu.I(this.s, false);
        mpk mpkVar = this.D;
        if (mpkVar != null) {
            mpkVar.b(ajosVar);
        }
        mgw mgwVar = this.F;
        if (mgwVar != null) {
            this.B.t(mgwVar);
        }
        this.F = null;
        this.o = null;
        this.n = null;
    }

    @Override // defpackage.mgv
    public final synchronized void c() {
        this.z.a();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        areq areqVar;
        int aH;
        nia niaVar = (nia) obj;
        this.d.g(this);
        final int i = 1;
        whu.I(this.s, true);
        this.n = niaVar;
        this.o = niaVar.a;
        this.l = ajokVar.a;
        if (this.F == null && (aH = anaf.aH(this.o.e)) != 0 && aH == 3) {
            oiy oiyVar = this.H;
            SnappyRecyclerView snappyRecyclerView = this.t;
            ajox ajoxVar = this.k.b;
            ajpd ajpdVar = this.f;
            fok fokVar = this.A;
            ScrollSelectionController scrollSelectionController = (ScrollSelectionController) oiyVar.a.get();
            scrollSelectionController.getClass();
            gfz gfzVar = (gfz) oiyVar.c.get();
            gfzVar.getClass();
            mgu mguVar = (mgu) oiyVar.e.get();
            mguVar.getClass();
            ypa ypaVar = (ypa) oiyVar.b.get();
            ypaVar.getClass();
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController) oiyVar.d.get();
            inlinePlaybackLifecycleController.getClass();
            zbw zbwVar = (zbw) oiyVar.f.get();
            zbwVar.getClass();
            snappyRecyclerView.getClass();
            ajpdVar.getClass();
            fokVar.getClass();
            this.F = new mgw(scrollSelectionController, gfzVar, mguVar, ypaVar, inlinePlaybackLifecycleController, zbwVar, snappyRecyclerView, ajoxVar, ajpdVar, fokVar);
        }
        final int i2 = 0;
        if (this.s.getLayoutParams() != null && this.o.c.size() != 0) {
            yny.z(this.s, yny.n(((apok) this.o.c.get(0)).b != 86135402 ? -2 : -1), ViewGroup.LayoutParams.class);
        }
        this.k.b.rU(new ajol(this) { // from class: mlg
            public final /* synthetic */ mlu a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ajol
            public final void a(ajok ajokVar2, ajng ajngVar, int i3) {
                float f;
                int i4 = i;
                if (i4 == 0) {
                    mlu mluVar = this.a;
                    ajokVar2.f("carousel_auto_rotate_callback", mluVar.f.size() > 1 ? mluVar : null);
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        mlu mluVar2 = this.a;
                        ajokVar2.f("carousel_scroll_listener", mluVar2.f.size() > 1 ? mluVar2.j : null);
                        return;
                    } else if (i4 == 3) {
                        ajokVar2.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                        return;
                    } else {
                        ajokVar2.f("overlapping_item_height", Integer.valueOf(this.a.b));
                        return;
                    }
                }
                mlu mluVar3 = this.a;
                if ((mluVar3.o.b & 16) != 0) {
                    boolean t = etx.t(mluVar3.a.getResources().getConfiguration().orientation);
                    boolean aa = yjk.aa(mluVar3.a);
                    apoi apoiVar = mluVar3.o.f;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    if (t) {
                        f = aa ? apoiVar.d : apoiVar.b;
                    } else {
                        f = aa ? apoiVar.e : apoiVar.c;
                    }
                } else {
                    f = 0.0f;
                }
                if (f <= 0.0f) {
                    f = mluVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
                }
                ajokVar2.f("carousel_aspect_ratio", Float.valueOf(f));
            }
        });
        this.k.b(this.o.c);
        for (apok apokVar : (List) this.o.pX(apoh.d)) {
            if (!amkq.b(apokVar, apok.a)) {
                this.f.remove(whu.ab(apokVar));
                this.f.l();
            }
        }
        ajox ajoxVar2 = this.k.b;
        ajoxVar2.rU(new ajol(this) { // from class: mlg
            public final /* synthetic */ mlu a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ajol
            public final void a(ajok ajokVar2, ajng ajngVar, int i3) {
                float f;
                int i4 = i2;
                if (i4 == 0) {
                    mlu mluVar = this.a;
                    ajokVar2.f("carousel_auto_rotate_callback", mluVar.f.size() > 1 ? mluVar : null);
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        mlu mluVar2 = this.a;
                        ajokVar2.f("carousel_scroll_listener", mluVar2.f.size() > 1 ? mluVar2.j : null);
                        return;
                    } else if (i4 == 3) {
                        ajokVar2.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                        return;
                    } else {
                        ajokVar2.f("overlapping_item_height", Integer.valueOf(this.a.b));
                        return;
                    }
                }
                mlu mluVar3 = this.a;
                if ((mluVar3.o.b & 16) != 0) {
                    boolean t = etx.t(mluVar3.a.getResources().getConfiguration().orientation);
                    boolean aa = yjk.aa(mluVar3.a);
                    apoi apoiVar = mluVar3.o.f;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    if (t) {
                        f = aa ? apoiVar.d : apoiVar.b;
                    } else {
                        f = aa ? apoiVar.e : apoiVar.c;
                    }
                } else {
                    f = 0.0f;
                }
                if (f <= 0.0f) {
                    f = mluVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
                }
                ajokVar2.f("carousel_aspect_ratio", Float.valueOf(f));
            }
        });
        final int i3 = 2;
        ajoxVar2.rU(new ajol(this) { // from class: mlg
            public final /* synthetic */ mlu a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ajol
            public final void a(ajok ajokVar2, ajng ajngVar, int i32) {
                float f;
                int i4 = i3;
                if (i4 == 0) {
                    mlu mluVar = this.a;
                    ajokVar2.f("carousel_auto_rotate_callback", mluVar.f.size() > 1 ? mluVar : null);
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        mlu mluVar2 = this.a;
                        ajokVar2.f("carousel_scroll_listener", mluVar2.f.size() > 1 ? mluVar2.j : null);
                        return;
                    } else if (i4 == 3) {
                        ajokVar2.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                        return;
                    } else {
                        ajokVar2.f("overlapping_item_height", Integer.valueOf(this.a.b));
                        return;
                    }
                }
                mlu mluVar3 = this.a;
                if ((mluVar3.o.b & 16) != 0) {
                    boolean t = etx.t(mluVar3.a.getResources().getConfiguration().orientation);
                    boolean aa = yjk.aa(mluVar3.a);
                    apoi apoiVar = mluVar3.o.f;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    if (t) {
                        f = aa ? apoiVar.d : apoiVar.b;
                    } else {
                        f = aa ? apoiVar.e : apoiVar.c;
                    }
                } else {
                    f = 0.0f;
                }
                if (f <= 0.0f) {
                    f = mluVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
                }
                ajokVar2.f("carousel_aspect_ratio", Float.valueOf(f));
            }
        });
        final int i4 = 3;
        ajoxVar2.rU(new ajol(this) { // from class: mlg
            public final /* synthetic */ mlu a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ajol
            public final void a(ajok ajokVar2, ajng ajngVar, int i32) {
                float f;
                int i42 = i4;
                if (i42 == 0) {
                    mlu mluVar = this.a;
                    ajokVar2.f("carousel_auto_rotate_callback", mluVar.f.size() > 1 ? mluVar : null);
                    return;
                }
                if (i42 != 1) {
                    if (i42 == 2) {
                        mlu mluVar2 = this.a;
                        ajokVar2.f("carousel_scroll_listener", mluVar2.f.size() > 1 ? mluVar2.j : null);
                        return;
                    } else if (i42 == 3) {
                        ajokVar2.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                        return;
                    } else {
                        ajokVar2.f("overlapping_item_height", Integer.valueOf(this.a.b));
                        return;
                    }
                }
                mlu mluVar3 = this.a;
                if ((mluVar3.o.b & 16) != 0) {
                    boolean t = etx.t(mluVar3.a.getResources().getConfiguration().orientation);
                    boolean aa = yjk.aa(mluVar3.a);
                    apoi apoiVar = mluVar3.o.f;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    if (t) {
                        f = aa ? apoiVar.d : apoiVar.b;
                    } else {
                        f = aa ? apoiVar.e : apoiVar.c;
                    }
                } else {
                    f = 0.0f;
                }
                if (f <= 0.0f) {
                    f = mluVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
                }
                ajokVar2.f("carousel_aspect_ratio", Float.valueOf(f));
            }
        });
        if (this.o.pY(apoh.b)) {
            aooy ab = whu.ab((apok) this.o.pX(apoh.b));
            int i5 = 0;
            while (true) {
                if (i5 >= this.f.size()) {
                    break;
                }
                if (ab == this.f.get(i5)) {
                    this.m = i5;
                    break;
                }
                i5++;
            }
        } else {
            this.m = 0;
        }
        this.t.aa(this.m);
        q();
        if (!r(this.o)) {
            whu.I(this.v, false);
        } else {
            if (this.D == null) {
                mpk b = this.G.b(this.s);
                this.D = b;
                RecyclerView recyclerView = b.a;
                this.s.addView(recyclerView);
                yny.z(recyclerView, yny.m(8388691), FrameLayout.LayoutParams.class);
            }
            mpk mpkVar = this.D;
            apol apolVar = this.o.d;
            if (apolVar == null) {
                apolVar = apol.a;
            }
            if (apolVar.b == 141960765) {
                areqVar = (areq) apolVar.c;
            } else {
                areqVar = areq.a;
            }
            mpkVar.oB(ajokVar, areqVar);
            final int i6 = 4;
            this.k.b.rU(new ajol(this) { // from class: mlg
                public final /* synthetic */ mlu a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ajol
                public final void a(ajok ajokVar2, ajng ajngVar, int i32) {
                    float f;
                    int i42 = i6;
                    if (i42 == 0) {
                        mlu mluVar = this.a;
                        ajokVar2.f("carousel_auto_rotate_callback", mluVar.f.size() > 1 ? mluVar : null);
                        return;
                    }
                    if (i42 != 1) {
                        if (i42 == 2) {
                            mlu mluVar2 = this.a;
                            ajokVar2.f("carousel_scroll_listener", mluVar2.f.size() > 1 ? mluVar2.j : null);
                            return;
                        } else if (i42 == 3) {
                            ajokVar2.f("active_item_indicator_width", Integer.valueOf(this.a.h.a()));
                            return;
                        } else {
                            ajokVar2.f("overlapping_item_height", Integer.valueOf(this.a.b));
                            return;
                        }
                    }
                    mlu mluVar3 = this.a;
                    if ((mluVar3.o.b & 16) != 0) {
                        boolean t = etx.t(mluVar3.a.getResources().getConfiguration().orientation);
                        boolean aa = yjk.aa(mluVar3.a);
                        apoi apoiVar = mluVar3.o.f;
                        if (apoiVar == null) {
                            apoiVar = apoi.a;
                        }
                        if (t) {
                            f = aa ? apoiVar.d : apoiVar.b;
                        } else {
                            f = aa ? apoiVar.e : apoiVar.c;
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (f <= 0.0f) {
                        f = mluVar3.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
                    }
                    ajokVar2.f("carousel_aspect_ratio", Float.valueOf(f));
                }
            });
            whu.I(this.v, true);
            n(this.v, this.b);
        }
        p();
        aulq aulqVar = this.o.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        aulq aulqVar2 = this.o.g;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (!aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer) || apmgVar.h || zev.e(this.a)) {
            whu.I(this.i, false);
        } else {
            if (this.E == null) {
                ajyf a = this.y.a(this.i);
                this.E = a;
                a.c = new ajyc() { // from class: mlh
                    @Override // defpackage.ajyc
                    public final void oC(aong aongVar) {
                        mlu.this.e.a();
                    }
                };
            }
            this.E.b(apmgVar, this.l);
        }
        mgw mgwVar = this.F;
        if (mgwVar != null) {
            this.B.r(mgwVar);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((nia) obj).a.h.I();
    }

    @Override // defpackage.ggr
    public final View g() {
        return this.s;
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        mmb mmbVar = this.x;
        int i4 = this.m;
        int width = this.s.getWidth();
        int height = this.s.getHeight();
        ajwa ajwaVar = mmbVar.f;
        if (ajwaVar == null) {
            return;
        }
        mlx mlxVar = mmbVar.g;
        ajpd ajpdVar = ajwaVar.a;
        if (mlxVar.e == null || ajpdVar.size() != mlxVar.e.length || mlxVar.d != height || mlxVar.c != width) {
            mlxVar.e = new boolean[ajpdVar.size()];
        }
        mlxVar.d = height;
        mlxVar.c = width;
        if (i4 == 0) {
            i3 = 0;
            i2 = 2;
        } else {
            if (i4 == ajpdVar.size() - 1) {
                i = i4 - 2;
            } else {
                i = i4 - 2;
                i4 += 2;
            }
            int i5 = i;
            i2 = i4;
            i3 = i5;
        }
        while (i3 < ajpdVar.size() && i3 <= i2) {
            if (i3 >= 0) {
                boolean[] zArr = mlxVar.e;
                if (!zArr[i3]) {
                    zArr[i3] = true;
                    Object obj = ajpdVar.get(i3);
                    if (obj instanceof aqjc) {
                        Context context = mlxVar.a;
                        ajjz ajjzVar = mlxVar.b;
                        aqjc aqjcVar = (aqjc) obj;
                        avgg n = mnt.n(context, aqjcVar);
                        if (n != null) {
                            ajjzVar.n(n, width, height);
                        }
                        avgg m = mnt.m(aqjcVar);
                        if (m != null) {
                            int h = mnt.h(context, height);
                            ajjzVar.n(m, h, h);
                        }
                        avgg avggVar = aqjcVar.j;
                        if (avggVar == null) {
                            avggVar = avgg.a;
                        }
                        hx k = mnt.k(context, avggVar, context.getResources().getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height));
                        if (k != null) {
                            avgg avggVar2 = aqjcVar.j;
                            if (avggVar2 == null) {
                                avggVar2 = avgg.a;
                            }
                            ajjzVar.n(avggVar2, ((Integer) k.a).intValue(), ((Integer) k.b).intValue());
                        }
                    } else if (obj instanceof asjh) {
                        Context context2 = mlxVar.a;
                        ajjz ajjzVar2 = mlxVar.b;
                        avgg d = yfv.d((asjh) obj, yjj.h(context2.getResources().getConfiguration().orientation));
                        if (d != null) {
                            ajjzVar2.n(d, width, height);
                        }
                    }
                }
            }
            i3++;
        }
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    public final void k() {
        if (jw.am(this.s)) {
            m(jw.e(this.s) == 1);
        } else {
            this.s.addOnLayoutChangeListener(new mll(this, 0));
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        nia niaVar;
        nia niaVar2;
        if (i == -1) {
            return new Class[]{aacj.class};
        }
        if (i == 0) {
            Object b = ((aacj) obj).b();
            if (!(b instanceof asjh) && !(b instanceof aqjc)) {
                return null;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.o.c.size()) {
                    break;
                }
                if (b == whu.ab((apok) this.o.c.get(i2))) {
                    ArrayList arrayList = new ArrayList((Collection) this.o.pX(apoh.d));
                    if (arrayList.size() <= i2) {
                        for (int size = arrayList.size(); size < i2; size++) {
                            arrayList.add(apok.a);
                        }
                        arrayList.add((apok) this.o.c.get(i2));
                    } else {
                        arrayList.set(i2, (apok) this.o.c.get(i2));
                    }
                    aong aongVar = (aong) this.o.toBuilder();
                    aongVar.e(apoh.d, arrayList);
                    o((apoj) aongVar.build());
                } else {
                    i2++;
                }
            }
            if (this.f.size() != 1 || this.f.get(0) != b || (niaVar2 = this.n) == null) {
                int i3 = this.m;
                int size2 = this.f.size() - 1;
                this.f.remove(b);
                if (!this.f.isEmpty() || (niaVar = this.n) == null) {
                    if (i3 == size2) {
                        this.m = 0;
                    }
                    this.t.aa(this.m);
                    p();
                    return null;
                }
                this.d.d(aacj.a(niaVar));
                return null;
            }
            this.d.d(aacj.a(niaVar2));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        int i;
        if (z) {
            i = (this.f.size() - this.m) - 1;
        } else {
            i = this.m;
        }
        this.h.c(i);
    }

    public final void o(apoj apojVar) {
        nia niaVar = this.n;
        if (niaVar == null) {
            return;
        }
        apojVar.getClass();
        niaVar.a = apojVar;
        this.o = apojVar;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (gmfVar instanceof mlu) {
            return amkq.b(((mlu) gmfVar).o, this.o);
        }
        return false;
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (i == 0) {
            return ayph.f();
        }
        return this.C.k();
    }

    public final void p() {
        this.t.aF(this.j);
        if (this.f.size() <= 1) {
            this.h.d(false);
            return;
        }
        this.h.b(this.o);
        k();
        this.t.aD(this.j);
    }

    public final void q() {
        apoj apojVar = this.o;
        if ((apojVar == null || !((Boolean) apojVar.pX(apoh.c)).booleanValue()) && this.f.size() > 1) {
            Object obj = this.f.get(this.m);
            if (obj instanceof aqjc) {
                aqjc aqjcVar = (aqjc) obj;
                mlm mlmVar = this.z;
                int i = aqjcVar.v;
                int i2 = aqjcVar.w;
                mlmVar.b(i);
            }
        }
    }
}
