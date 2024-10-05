package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajec implements slr {
    ViewGroup a;
    public WeakReference b;
    public acra c;
    private final boolean d;
    private final Context e;
    private final syd f;
    private final axpg g;
    private final axpg h;
    private final akbo i;
    private Handler j = null;
    private ayqw k;
    private dkp l;
    private awty m;
    private swu n;
    private String o;
    private akbq p;
    private String q;
    private int r;

    /* JADX WARN: Multi-variable type inference failed */
    public ajec(Context context, axpg axpgVar, axpg axpgVar2, syd sydVar, akbo akboVar, axzf axzfVar, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        this.e = context;
        this.g = axpgVar;
        this.h = axpgVar2;
        this.f = sydVar;
        this.i = akboVar;
        aqvj aqvjVar = axzfVar.a.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45358517L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358517L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358517L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.d = bool.booleanValue();
    }

    private final FrameLayout h(awos awosVar, acra acraVar) {
        ayqw ayqwVar = this.k;
        if (ayqwVar != null) {
            dkp dkpVar = new dkp(this.e);
            dhe dheVar = dkpVar.t;
            sqq sqqVar = (sqq) this.g.get();
            sxb a = sxc.a();
            a.a = dkpVar;
            a.f(false);
            dho c = ComponentTree.c(dkpVar.t, sqqVar.a(dheVar, a.a(), awosVar.toByteArray(), acraVar != null ? ajgg.w(acraVar) : null, ayqwVar));
            c.d = false;
            dkpVar.G(c.a());
            dkpVar.setBackgroundColor(wbs.Q(this.e, R.attr.ytBrandBackgroundSolid));
            this.l = dkpVar;
        }
        FrameLayout frameLayout = new FrameLayout(this.e);
        frameLayout.setId(R.id.bottom_sheet_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setClickable(true);
        dkp dkpVar2 = this.l;
        if (dkpVar2 != null) {
            frameLayout.addView(dkpVar2, layoutParams);
        }
        frameLayout.setImportantForAccessibility(2);
        return frameLayout;
    }

    private static apxf i(swu swuVar) {
        ajgc ajgcVar;
        Object obj = swuVar.d;
        if (!(obj instanceof ajgc) || (ajgcVar = (ajgc) obj) == null) {
            return null;
        }
        return ajgcVar.d;
    }

    private static final acra j(swu swuVar) {
        ajgc ajgcVar;
        sxs sxsVar = swuVar.f;
        acra x = sxsVar != null ? ajgg.x(sxsVar) : null;
        Object obj = swuVar.d;
        return ((obj instanceof ajgc) && x == null && (ajgcVar = (ajgc) obj) != null) ? ajgcVar.c : x;
    }

    private final ViewGroup k(int i) {
        if (i == 6) {
            return (ViewGroup) ((Activity) this.e).getWindow().findViewById(R.id.bottom_ui_container);
        }
        return (ViewGroup) ((Activity) this.e).getWindow().findViewById(R.id.interstitials_container);
    }

    private final void l(int i, awos awosVar, acra acraVar) {
        ViewGroup k = k(i);
        if (k == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        k.addView(h(awosVar, acraVar), layoutParams);
        k.setVisibility(0);
        this.a = k;
    }

    @Override // defpackage.slr
    public final void a() {
        akbq akbqVar;
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            ajek ajekVar = (ajek) weakReference.get();
            if (ajekVar != null) {
                ajekVar.dismiss();
            }
            this.b = null;
        }
        this.c = null;
        this.m = null;
        this.n = null;
        if (this.d && (akbqVar = this.p) != null) {
            this.i.n(akbqVar);
            this.p = null;
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            dkp dkpVar = this.l;
            if (dkpVar != null) {
                viewGroup.removeView(dkpVar);
                this.l = null;
            }
            this.a.setVisibility(8);
            this.a = null;
        }
        ayqw ayqwVar = this.k;
        if (ayqwVar != null) {
            ayqwVar.qc();
            this.k = null;
        }
    }

    @Override // defpackage.slr
    public final void b(byte[] bArr, String str) {
        ajek ajekVar;
        acra acraVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajekVar = (ajek) weakReference.get()) == null || str == null || !str.contentEquals(ajekVar.ak) || (acraVar = this.c) == null) {
            return;
        }
        acraVar.D(new acqx(bArr));
    }

    @Override // defpackage.slr
    public final void c(String str) {
        ajek ajekVar;
        final swu swuVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajekVar = (ajek) weakReference.get()) == null || str == null || !str.contentEquals(ajekVar.ak)) {
            return;
        }
        allo n = allo.n(((ci) this.e).getWindow().getDecorView().findViewById(android.R.id.content), this.e.getString(R.string.error_text_with_bottom_sheet), 0);
        View findViewById = n.f.findViewById(R.id.snackbar_action);
        String string = this.e.getString(R.string.error_with_bottom_sheet_button);
        findViewById.setContentDescription(string);
        findViewById.setBackground(null);
        final awty awtyVar = this.m;
        if (awtyVar != null && (swuVar = this.n) != null) {
            n.o(string, new View.OnClickListener() { // from class: ajdz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ajec ajecVar = ajec.this;
                    final awty awtyVar2 = awtyVar;
                    final swu swuVar2 = swuVar;
                    view.post(new Runnable() { // from class: ajeb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajec.this.d(awtyVar2, swuVar2);
                        }
                    });
                }
            });
        }
        n.l();
        if (ajekVar.C() != null) {
            a();
        }
        n.h();
    }

    @Override // defpackage.slr
    public final void d(awty awtyVar, swu swuVar) {
        String str;
        if (awtyVar == null) {
            this.f.c(23, "ShowActionSheetCommand needs to provided.", swuVar.i);
            return;
        }
        if (awtyVar.f.size() > 0 || (awtyVar.c & 4) != 0) {
            acra j = j(swuVar);
            if (j == null) {
                j = ajgg.x(swuVar.f);
            }
            a();
            apxf i = i(swuVar);
            if (i == null) {
                i = apxf.a;
            }
            if (j != null && awtyVar.i) {
                atmc atmcVar = (atmc) i.pX(atmb.b);
                if (TextUtils.isEmpty(this.q) || ((str = this.o) != null && !str.contentEquals(atmcVar.c))) {
                    this.q = atmcVar.c;
                } else {
                    aong aongVar = (aong) i.toBuilder();
                    aonk aonkVar = atmb.b;
                    aone builder = atmcVar.toBuilder();
                    String str2 = this.q;
                    builder.copyOnWrite();
                    atmc atmcVar2 = (atmc) builder.instance;
                    str2.getClass();
                    atmcVar2.b |= 1;
                    atmcVar2.c = str2;
                    aongVar.e(aonkVar, (atmc) builder.build());
                    i = (apxf) aongVar.build();
                }
                j.d(acsb.b(123695), i, null);
                this.o = j.k();
            }
            if (awtyVar.i) {
                this.c = j;
            }
            ajek ajekVar = new ajek();
            Bundle bundle = new Bundle();
            amkq.cn(bundle, "COMMAND_BOTTOM_SHEET_FRAGMENT_KEY", awtyVar);
            ajekVar.af(bundle);
            ajek.aK(ajekVar, swuVar, j);
            ajekVar.qi(((ci) this.e).getSupportFragmentManager(), ajekVar.F);
            this.b = new WeakReference(ajekVar);
            this.m = awtyVar;
            this.n = swuVar;
            if ((awtyVar.c & 8) != 0) {
                sww swwVar = (sww) this.h.get();
                awnw awnwVar = awtyVar.h;
                if (awnwVar == null) {
                    awnwVar = awnw.a;
                }
                swwVar.b(awnwVar, swuVar).Q();
                return;
            }
            return;
        }
        this.f.c(23, "ShowActionSheetCommand needs to have at least one list option when there is not sheet id.", swuVar.i);
    }

    @Override // defpackage.slr
    public final void e(awug awugVar) {
        ajek ajekVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajekVar = (ajek) weakReference.get()) == null || (awugVar.c & 4) == 0) {
            return;
        }
        if (awugVar.g.contentEquals(ajekVar.ak) || awugVar.g.contentEquals("testSheetId")) {
            amkq.cn(ajekVar.m, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", awugVar);
            ci C = ajekVar.C();
            if (C == null || C.isFinishing()) {
                return;
            }
            ajekVar.aH();
            ajekVar.aI(awugVar, C);
            RelativeLayout aF = ajekVar.aF(C);
            ViewGroup viewGroup = ajekVar.ao;
            if (viewGroup != null) {
                viewGroup.addView(aF);
            }
            ajekVar.aJ(C);
        }
    }

    @Override // defpackage.slr
    public final void f(awos awosVar, int i, int i2, swu swuVar, int i3, boolean z, int i4) {
        this.r = i2 == 0 ? -2 : i2;
        g(awosVar, i, i3, j(swuVar), i(swuVar), z, i4);
        if (this.d || i != 4 || i2 <= 0) {
            return;
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = new Handler();
        this.j = handler2;
        handler2.postDelayed(new Runnable() { // from class: ajea
            @Override // java.lang.Runnable
            public final void run() {
                ajec.this.a();
            }
        }, i2);
    }

    public final void g(awos awosVar, int i, int i2, acra acraVar, apxf apxfVar, boolean z, int i3) {
        FrameLayout.LayoutParams layoutParams;
        a();
        this.k = new ayqw();
        int i4 = i - 1;
        if (i4 == 2) {
            l(i, awosVar, acraVar);
            return;
        }
        if (i4 == 3) {
            if (this.d) {
                akbp m = this.i.m();
                m.e(awosVar);
                m.f(acraVar);
                m.d(this.r);
                akbq a = m.a();
                this.p = a;
                this.i.p(a);
                return;
            }
            l(i, awosVar, acraVar);
            return;
        }
        if (i4 == 5) {
            ViewGroup k = k(6);
            if (k != null) {
                int M = yjk.M(this.e);
                if (i3 <= 0) {
                    i3 = 600;
                }
                if (M >= i3) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    layoutParams.width = yjk.K(this.e.getResources().getDisplayMetrics(), 360);
                    layoutParams.bottomMargin = yjk.K(this.e.getResources().getDisplayMetrics(), 20);
                    layoutParams.setMarginEnd(yjk.K(this.e.getResources().getDisplayMetrics(), 8));
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                }
                k.addView(h(awosVar, acraVar), layoutParams);
                k.setVisibility(0);
                this.a = k;
                return;
            }
            return;
        }
        swu swuVar = this.n;
        ajek ajekVar = new ajek();
        awosVar.getClass();
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", awosVar);
        ajekVar.af(bundle);
        ajek.aK(ajekVar, swuVar, acraVar);
        ajekVar.ap = i2;
        ajekVar.ai = i3;
        ajekVar.ah = false;
        ajekVar.qi(((ci) this.e).getSupportFragmentManager(), ajekVar.F);
        this.b = new WeakReference(ajekVar);
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (acraVar == null || !z) {
            return;
        }
        acraVar.d(acsb.b(123695), apxfVar, null);
    }
}
