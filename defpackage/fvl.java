package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvl implements ajyc, fuy, fhw {
    public final ysy a;
    public final TextView b;
    public avaa c;
    public acra d;
    private final ci e;
    private final gno f;
    private final akbu g;
    private final afyt h;
    private final Map i;
    private final agdi j;
    private final aahv k;
    private final boolean l;
    private final Map m;
    private avab n;
    private avab o;
    private ayqx p;
    private final aoae q;

    public fvl(ci ciVar, akht akhtVar, akbu akbuVar, ysy ysyVar, aoae aoaeVar, afyt afytVar, agdi agdiVar, aahv aahvVar, aadw aadwVar, TextView textView, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.e = ciVar;
        this.g = akbuVar;
        this.b = textView;
        this.a = ysyVar;
        this.q = aoaeVar;
        this.h = afytVar;
        this.j = agdiVar;
        this.k = aahvVar;
        gno h = akhtVar.h(textView);
        this.f = h;
        h.f();
        h.c = this;
        h.e(R.dimen.text_button_icon_padding);
        h.d = new ajyb() { // from class: fvj
            @Override // defpackage.ajyb
            public final Map a() {
                fvl fvlVar = fvl.this;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", fvlVar.d);
                return hashMap;
            }
        };
        asvu asvuVar = aadwVar.b().e;
        this.l = (asvuVar == null ? asvu.a : asvuVar).bt;
        this.m = new HashMap();
        this.i = amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    private final void i() {
        f();
        this.c = null;
        this.m.clear();
        this.n = null;
        this.o = null;
        this.f.b(null, null);
        j();
    }

    private final void j() {
        ayqx ayqxVar = this.p;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.p);
        }
        this.p = null;
    }

    @Override // defpackage.fhw
    public final void b(afys afysVar) {
        if (!afysVar.a || !afysVar.b || !afysVar.c) {
            if (this.m.containsKey(Integer.valueOf(this.c.e))) {
                g(this.c.e);
                return;
            }
        }
        g(this.c.d);
    }

    @Override // defpackage.fuy
    public final void c() {
        avab avabVar = this.o;
        if (avabVar != null) {
            g(avabVar.c);
            this.o = null;
        }
    }

    @Override // defpackage.fuy
    public final void d() {
        this.o = null;
    }

    public final void e() {
        ci ciVar = this.e;
        ynm.n(ciVar, this.h.b(ciVar), ept.g, new zfi() { // from class: fvi
            @Override // defpackage.zfi
            public final void a(Object obj) {
                fvl.this.b((afys) obj);
            }
        });
    }

    public final void f() {
        this.b.setVisibility(8);
    }

    public final void g(int i) {
        apmg apmgVar;
        if (this.o == null) {
            this.o = this.n;
        }
        avab avabVar = (avab) this.m.get(Integer.valueOf(i));
        this.n = avabVar;
        if (avabVar != null && (avabVar.b & 4) != 0) {
            avac avacVar = avabVar.e;
            if (avacVar == null) {
                avacVar = avac.a;
            }
            if (avacVar.b == 65153809) {
                gno gnoVar = this.f;
                avac avacVar2 = this.n.e;
                if (avacVar2 == null) {
                    avacVar2 = avac.a;
                }
                if (avacVar2.b == 65153809) {
                    apmgVar = (apmg) avacVar2.c;
                } else {
                    apmgVar = apmg.a;
                }
                gnoVar.a(apmgVar, this.d, this.i);
                return;
            }
        }
        i();
    }

    public final void h(avaa avaaVar, acra acraVar) {
        arej arejVar;
        this.c = avaaVar;
        this.d = acraVar;
        if (avaaVar == null) {
            i();
            return;
        }
        if (acraVar != null) {
            if (this.l) {
                acraVar.D(new acqx(avaaVar.i));
            }
            acraVar.u(new acqx(avaaVar.i), null);
        }
        this.n = null;
        this.o = null;
        this.m.clear();
        for (avab avabVar : this.c.c) {
            this.m.put(Integer.valueOf(avabVar.c), avabVar);
        }
        j();
        if (this.c.f.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.f.iterator();
            while (it.hasNext()) {
                arrayList.add(this.k.c().h((String) it.next(), true));
            }
            this.p = aypy.Z(arrayList).ab(ayqr.a()).L(eng.r).Y(fiv.l).k(auzx.class).ax(new ayrs() { // from class: fvk
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    fvl fvlVar = fvl.this;
                    if (((auzx) obj).getState() == auzz.SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED) {
                        fvlVar.g(fvlVar.c.e);
                    } else {
                        fvlVar.e();
                    }
                }
            });
        }
        e();
        arel arelVar = avaaVar.g;
        if (arelVar == null) {
            arelVar = arel.a;
        }
        if (arelVar.b == 102716411) {
            akbu akbuVar = this.g;
            arel arelVar2 = avaaVar.g;
            if (arelVar2 == null) {
                arelVar2 = arel.a;
            }
            if (arelVar2.b == 102716411) {
                arejVar = (arej) arelVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.b, avaaVar, acraVar);
        }
        this.q.c(avaaVar, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        avaa avaaVar;
        int i;
        int i2;
        hw hwVar;
        aqyg aqygVar;
        ViewGroup viewGroup;
        avaa avaaVar2;
        acra acraVar = this.d;
        ViewGroup viewGroup2 = null;
        if (acraVar != null && (avaaVar2 = this.c) != null && (avaaVar2.b & 128) != 0) {
            acraVar.I(3, new acqx(avaaVar2.i), null);
        }
        if (this.n == null || !this.a.o()) {
            return;
        }
        g(this.n.d);
        final agdi agdiVar = this.j;
        avaa avaaVar3 = this.c;
        int i3 = this.n.c;
        final TextView textView = this.b;
        hw hwVar2 = new hw() { // from class: fvh
            @Override // defpackage.hw
            public final void accept(Object obj) {
                apmg apmgVar;
                apmg apmgVar2;
                fvl fvlVar = fvl.this;
                avab avabVar = (avab) obj;
                if (fvlVar.d != null && (avabVar.b & 4) != 0) {
                    avac avacVar = avabVar.e;
                    if (avacVar == null) {
                        avacVar = avac.a;
                    }
                    if (avacVar.b == 65153809) {
                        avac avacVar2 = avabVar.e;
                        if (avacVar2 == null) {
                            avacVar2 = avac.a;
                        }
                        if (avacVar2.b == 65153809) {
                            apmgVar = (apmg) avacVar2.c;
                        } else {
                            apmgVar = apmg.a;
                        }
                        if ((apmgVar.b & 1048576) != 0) {
                            acra acraVar2 = fvlVar.d;
                            avac avacVar3 = avabVar.e;
                            if (avacVar3 == null) {
                                avacVar3 = avac.a;
                            }
                            if (avacVar3.b == 65153809) {
                                apmgVar2 = (apmg) avacVar3.c;
                            } else {
                                apmgVar2 = apmg.a;
                            }
                            acraVar2.I(3, new acqx(apmgVar2.t), null);
                        }
                    }
                }
                if (fvlVar.a.o()) {
                    fvlVar.g(avabVar.c);
                }
            }
        };
        final acra acraVar2 = this.d;
        int cb = anaf.cb(avaaVar3.h);
        if (cb != 0 && cb == 3) {
            agdiVar.a();
            final ViewGroup viewGroup3 = (ViewGroup) View.inflate(agdiVar.a, R.layout.notification_bell_inline_menu, null);
            int i4 = -1;
            int i5 = 0;
            while (i5 < avaaVar3.c.size()) {
                final avab avabVar = (avab) avaaVar3.c.get(i5);
                aulq aulqVar = avabVar.f;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    aulq aulqVar2 = avabVar.f;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    final View inflate = View.inflate(agdiVar.a, R.layout.notification_bell_inline_menu_item, viewGroup2);
                    boolean z = avabVar.c == i3;
                    ajyd c = agdiVar.g.c(inflate);
                    c.b(apmgVar, acraVar2);
                    c.d = new ajyb() { // from class: agdd
                        @Override // defpackage.ajyb
                        public final Map a() {
                            acra acraVar3 = acra.this;
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acraVar3);
                            return hashMap;
                        }
                    };
                    avaaVar = avaaVar3;
                    int i6 = i4;
                    i = i5;
                    final boolean z2 = z;
                    final hw hwVar3 = hwVar2;
                    i2 = i3;
                    hwVar = hwVar2;
                    c.c = new ajyc() { // from class: agde
                        @Override // defpackage.ajyc
                        public final void oC(aong aongVar2) {
                            final agdi agdiVar2 = agdi.this;
                            View view = inflate;
                            ViewGroup viewGroup4 = viewGroup3;
                            final boolean z3 = z2;
                            final hw hwVar4 = hwVar3;
                            final avab avabVar2 = avabVar;
                            if (agdiVar2.f) {
                                return;
                            }
                            agdiVar2.f = true;
                            int intValue = ((Integer) view.getTag()).intValue();
                            for (int i7 = 0; i7 < viewGroup4.getChildCount(); i7++) {
                                View childAt = viewGroup4.getChildAt(i7);
                                agdiVar2.b(childAt, ((Integer) childAt.getTag()).intValue() == intValue);
                            }
                            viewGroup4.postDelayed(new Runnable() { // from class: agdh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    agdi agdiVar3 = agdi.this;
                                    boolean z4 = z3;
                                    hw hwVar5 = hwVar4;
                                    avab avabVar3 = avabVar2;
                                    agdiVar3.a();
                                    if (z4) {
                                        return;
                                    }
                                    hwVar5.accept(avabVar3);
                                }
                            }, 500L);
                        }
                    };
                    TextView textView2 = (TextView) inflate.findViewById(R.id.text);
                    if ((apmgVar.b & 256) != 0) {
                        aqygVar = apmgVar.i;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView2.setText(ajcq.b(aqygVar));
                    arfs arfsVar = apmgVar.g;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    if ((arfsVar.b & 1) != 0) {
                        ajut ajutVar = agdiVar.b;
                        arfs arfsVar2 = apmgVar.g;
                        if (arfsVar2 == null) {
                            arfsVar2 = arfs.a;
                        }
                        arfr b = arfr.b(arfsVar2.c);
                        if (b == null) {
                            b = arfr.UNKNOWN;
                        }
                        int a = ajutVar.a(b);
                        if (a != 0) {
                            ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(a);
                        }
                    }
                    if (z) {
                        i4 = viewGroup3.getChildCount();
                        agdiVar.b(inflate, true);
                    } else {
                        i4 = i6;
                    }
                    viewGroup3.addView(inflate);
                    inflate.setTag(Integer.valueOf(avabVar.c));
                    viewGroup = null;
                    acraVar2.u(new acqx(apmgVar.t), null);
                } else {
                    viewGroup = viewGroup2;
                    i = i5;
                    avaaVar = avaaVar3;
                    i2 = i3;
                    hwVar = hwVar2;
                }
                i5 = i + 1;
                avaaVar3 = avaaVar;
                viewGroup2 = viewGroup;
                hwVar2 = hwVar;
                i3 = i2;
            }
            ViewGroup viewGroup4 = viewGroup2;
            if (i4 == -1) {
                zga.b("Could not find the index of the selected state in the model!");
                return;
            }
            viewGroup3.measure(View.MeasureSpec.makeMeasureSpec(yjk.N(agdiVar.a), CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(yjk.L(agdiVar.a), CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += viewGroup3.getChildAt(i8).getMeasuredHeight();
            }
            agdiVar.e = new PopupWindow((View) viewGroup3, -2, -2, true);
            agdiVar.e.setElevation(yjk.K(agdiVar.a.getResources().getDisplayMetrics(), 4));
            agdiVar.e.setBackgroundDrawable(new ColorDrawable(wbs.Q(agdiVar.a, R.attr.ytBrandBackgroundSolid)));
            agdiVar.e.setOutsideTouchable(true);
            agdiVar.e.setAnimationStyle(android.R.style.Animation.Dialog);
            int[] iArr = new int[2];
            textView.getLocationOnScreen(iArr);
            Point point = new Point(iArr[0], iArr[1]);
            int i9 = point.x;
            int measuredWidth = viewGroup3.getMeasuredWidth();
            int width = textView.getWidth();
            int paddingEnd = textView.getPaddingEnd();
            int paddingEnd2 = viewGroup3.getChildAt(0).getPaddingEnd();
            final int height = (point.y - i7) + ((textView.getHeight() - viewGroup3.getChildAt(0).getMeasuredHeight()) / 2);
            final int measuredHeight = viewGroup3.getMeasuredHeight();
            final int i10 = (((i9 - measuredWidth) + width) - paddingEnd) + paddingEnd2;
            final hw hwVar4 = new hw() { // from class: agdc
                @Override // defpackage.hw
                public final void accept(Object obj) {
                    agdi agdiVar2 = agdi.this;
                    View view = textView;
                    int i11 = i10;
                    Integer num = (Integer) obj;
                    PopupWindow popupWindow = agdiVar2.e;
                    if (popupWindow == null) {
                        return;
                    }
                    popupWindow.showAtLocation(view, 0, i11, num.intValue());
                }
            };
            Window window = ((Activity) agdiVar.a).getWindow();
            final ViewGroup decorView = window != null ? window.getDecorView() : viewGroup4;
            if (decorView == null) {
                agdiVar.d.execute(new agdf(hwVar4, height, 1));
            } else {
                agdiVar.c.execute(new Runnable() { // from class: agdg
                    @Override // java.lang.Runnable
                    public final void run() {
                        agdi agdiVar2 = agdi.this;
                        View view = decorView;
                        int i11 = height;
                        int i12 = measuredHeight;
                        hw hwVar5 = hwVar4;
                        Rect rect = new Rect();
                        view.getWindowVisibleDisplayFrame(rect);
                        int i13 = rect.top;
                        if (i11 < i13) {
                            i11 = i13;
                        }
                        if (i11 + i12 > rect.bottom) {
                            i11 = rect.bottom - i12;
                        }
                        agdiVar2.d.execute(new agdf(hwVar5, i11, 0));
                    }
                });
            }
        }
    }
}
