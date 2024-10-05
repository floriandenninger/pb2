package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fro implements ajom {
    public static final amru a = amru.t(apth.STYLE_PREMIUM_CHIP, apth.STYLE_SHORTS_CHIP, apth.STYLE_EXPLORE_LAUNCHER_CHIP);
    public final gdq b;
    public final nkl c;
    public View.OnClickListener d;
    public ajof e;
    public boolean f;
    public acra g;
    public aone h;
    private final ajjz i;
    private final ajut j;
    private final ajoi k;
    private final akbu l;
    private final axpg m;
    private ayqx n;

    public fro(Context context, aahd aahdVar, ajjz ajjzVar, ajut ajutVar, akbu akbuVar, nkl nklVar, axpg axpgVar) {
        aahdVar.getClass();
        ajjzVar.getClass();
        this.i = ajjzVar;
        ajutVar.getClass();
        this.j = ajutVar;
        akbuVar.getClass();
        this.l = akbuVar;
        nklVar.getClass();
        this.c = nklVar;
        axpgVar.getClass();
        this.m = axpgVar;
        gdq gdqVar = new gdq(context, !nklVar.a());
        this.b = gdqVar;
        this.k = new ajoi(aahdVar, gdqVar, new ajof() { // from class: fri
            @Override // defpackage.ajof
            public final boolean h(View view) {
                fro froVar = fro.this;
                ajof ajofVar = froVar.e;
                if (ajofVar != null && ajofVar.h(view)) {
                    froVar.h();
                    return true;
                }
                View.OnClickListener onClickListener = froVar.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!froVar.f) {
                    return false;
                }
                froVar.h();
                return false;
            }
        });
        this.g = acra.l;
    }

    public static asht d(aptg aptgVar) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashk.a.createBuilder();
        int i = true != aptgVar.i ? 3 : 2;
        createBuilder2.copyOnWrite();
        ashk ashkVar = (ashk) createBuilder2.instance;
        ashkVar.c = i - 1;
        ashkVar.b |= 1;
        ashk ashkVar2 = (ashk) createBuilder2.build();
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashkVar2.getClass();
        ashtVar.m = ashkVar2;
        ashtVar.b |= 32768;
        return (asht) createBuilder.build();
    }

    public static void e(ajok ajokVar, aypy aypyVar) {
        ajokVar.f("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY", aypyVar);
    }

    public static void f(ajok ajokVar, ajof ajofVar) {
        ajofVar.getClass();
        ajokVar.f("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT", ajofVar);
    }

    public static void g(ajok ajokVar, View.OnClickListener onClickListener) {
        ajokVar.f("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER", onClickListener);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g = acra.l;
        this.d = null;
        this.f = false;
        this.k.c();
        Object obj = this.n;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.n = null;
        }
    }

    public final void h() {
        acra acraVar;
        aone aoneVar = this.h;
        if (aoneVar == null || (acraVar = this.g) == null) {
            return;
        }
        acraVar.I(3, new acqx(((aptg) aoneVar.instance).l), d((aptg) this.h.build()));
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        arej arejVar;
        aptg aptgVar = (aptg) obj;
        this.h = aptgVar.toBuilder();
        this.g = ajokVar.a;
        ajoi ajoiVar = this.k;
        acra acraVar = ajokVar.a;
        apxf apxfVar = ((aptg) this.h.instance).g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), new ajog() { // from class: frj
            @Override // defpackage.ajog
            public final void oh(Map map) {
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", fro.this.h.build());
            }
        });
        if ((((aptg) this.h.instance).b & 1024) != 0) {
            ((akcp) this.m.get()).d(((aptg) this.h.instance).k, this.b);
        }
        aone aoneVar = this.h;
        aptg aptgVar2 = (aptg) aoneVar.instance;
        if (aptgVar2.c != 7) {
            this.b.c((aptg) aoneVar.build());
        } else {
            ajut ajutVar = this.j;
            arfr b = arfr.b(((arfs) aptgVar2.d).c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a2 = ajutVar.a(b);
            gdq gdqVar = this.b;
            aptg aptgVar3 = (aptg) this.h.build();
            gdo a3 = gdqVar.a();
            a3.e(false);
            a3.d(aptgVar3.c == 6);
            a3.f(aptgVar3.c == 7);
            gdqVar.g(a3, aptgVar3);
            gdqVar.e = a3.a();
            if (a2 == 0) {
                gdqVar.b = null;
                gdqVar.a = null;
            } else {
                ImageView imageView = gdqVar.d;
                int i = gdqVar.e.l;
                yny.z(imageView, yny.h(yny.y(i, i), yny.r(gdqVar.e.j), yny.q(gdqVar.e.k)), ViewGroup.MarginLayoutParams.class);
                gdqVar.b = gdqVar.getResources().getDrawable(a2);
                gdqVar.a = gdqVar.getResources().getDrawable(a2);
                gdp gdpVar = gdqVar.e;
                if (!gdpVar.f) {
                    gdqVar.b.setColorFilter(gdpVar.a(false), PorterDuff.Mode.SRC_IN);
                    gdqVar.a.mutate().setColorFilter(gdqVar.e.a(true), PorterDuff.Mode.SRC_IN);
                }
            }
            gdqVar.b(aptgVar3);
        }
        this.d = (View.OnClickListener) ajokVar.c("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER");
        this.e = (ajof) ajokVar.c("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT");
        amru amruVar = a;
        apti aptiVar = aptgVar.e;
        if (aptiVar == null) {
            aptiVar = apti.a;
        }
        apth b2 = apth.b(aptiVar.c);
        if (b2 == null) {
            b2 = apth.STYLE_UNKNOWN;
        }
        this.f = !amruVar.contains(b2);
        aypy aypyVar = (aypy) ajokVar.c("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY");
        Object obj2 = this.n;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
        }
        if (aypyVar != null) {
            this.n = aypyVar.ay(new ayrs() { // from class: frk
                @Override // defpackage.ayrs
                public final void a(Object obj3) {
                    final fro froVar = fro.this;
                    Boolean bool = (Boolean) obj3;
                    aone aoneVar2 = froVar.h;
                    boolean booleanValue = bool.booleanValue();
                    aoneVar2.copyOnWrite();
                    aptg aptgVar4 = (aptg) aoneVar2.instance;
                    aptg aptgVar5 = aptg.a;
                    aptgVar4.b |= 256;
                    aptgVar4.i = booleanValue;
                    froVar.b.e(true != bool.booleanValue() ? 2 : 1, true ^ froVar.c.a());
                    if (bool.booleanValue()) {
                        froVar.b.post(new Runnable() { // from class: frl
                            @Override // java.lang.Runnable
                            public final void run() {
                                fro.this.b.sendAccessibilityEvent(8);
                            }
                        });
                    }
                    aptg aptgVar6 = (aptg) froVar.h.instance;
                    if ((aptgVar6.b & 4096) != 0) {
                        froVar.g.w(new acqx(aptgVar6.l.I()), fro.d((aptg) froVar.h.build()));
                    }
                }
            }, eoo.n);
        }
        aptg aptgVar4 = (aptg) this.h.instance;
        if (aptgVar4.c == 6) {
            this.i.h(this.b.c, (avgg) aptgVar4.d);
        }
        if ((((aptg) this.h.instance).b & 512) != 0) {
            akbu akbuVar = this.l;
            arel arelVar = aptgVar.j;
            if (arelVar == null) {
                arelVar = arel.a;
            }
            if (arelVar.b == 102716411) {
                arejVar = (arej) arelVar.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.b, aptgVar, this.g);
        }
        this.g.u(new acqx(((aptg) this.h.instance).l), d((aptg) this.h.build()));
    }
}
