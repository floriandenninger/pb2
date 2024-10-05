package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LugashFooterRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lux extends lts implements View.OnClickListener, ypd {
    private Spanned aA;
    private Spanned aB;
    private Spanned aC;
    private Spanned aD;
    private View aE;
    private RecyclerView aF;
    private boolean aG;
    private ayqx aH;
    public euc ae;
    public azrw af;
    public azrw ag;
    public azrw ah;
    public azrw ai;
    public ypa aj;
    public gad ak;
    public adsw al;
    public ajoy am;
    public afsy an;
    public gfz ao;
    public aahd ap;
    public gni aq;
    public aaea ar;
    public ayqi as;
    public apxf at;
    public apxf au;
    protected ajpa av;
    protected Toolbar aw;
    private athk ax;
    private ajox ay;
    private ajoc az;

    public static final int aH(Context context, boolean z) {
        return yjk.K(context.getResources().getDisplayMetrics(), true != z ? 4 : 0);
    }

    private final void aI() {
        Context qR = qR();
        Dialog dialog = this.d;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window == null || !yjk.aa(qR)) {
            return;
        }
        window.setLayout((int) (yjk.N(qR) * 0.7f), (int) (yjk.L(qR) * 0.7f));
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.aj.m(this);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        dismiss();
    }

    @Override // defpackage.lts, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.aH = this.ar.a.Y(luw.a).Y(new agbu(context, 1)).ab(this.as).ax(new ayrs() { // from class: luv
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                Toolbar toolbar = lux.this.aw;
                if (toolbar != null) {
                    toolbar.setElevation(num.intValue());
                }
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{gvb.class, wjc.class, adsu.class};
        }
        if (i == 0) {
            dismiss();
            return null;
        }
        if (i == 1) {
            if (!((wjc) obj).c()) {
                return null;
            }
            dismiss();
            return null;
        }
        if (i == 2) {
            dismiss();
            this.al.k();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lY() {
        super.lY();
        Object obj = this.aH;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        this.ao.m(1);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        aufj aufjVar;
        Spanned spannedString;
        athq athqVar;
        aqyg aqygVar;
        athq athqVar2;
        athm athmVar;
        aovj aovjVar;
        atho athoVar;
        athk athkVar;
        super.mR(bundle);
        this.aj.g(this);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MenuButtonRendererKey")) {
            this.ax = athk.a;
        } else {
            byte[] byteArray = bundle2.getByteArray("MenuButtonRendererKey");
            if (byteArray != null) {
                try {
                    aths athsVar = (aths) aonm.parseFrom(aths.a, byteArray, aomw.b());
                    if (athsVar.e == 3) {
                        athoVar = (atho) athsVar.f;
                    } else {
                        athoVar = atho.a;
                    }
                    if (athoVar.b == 120770929) {
                        athkVar = (athk) athoVar.c;
                    } else {
                        athkVar = athk.a;
                    }
                    this.ax = athkVar;
                } catch (aoob e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    sb.append("Unable to decode menu items: ");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                }
            }
        }
        ajpd ajpdVar = new ajpd();
        this.az = new ajoc();
        athi athiVar = this.ax.d;
        if (athiVar == null) {
            athiVar = athi.a;
        }
        if (athiVar.b == 77195710) {
            athi athiVar2 = this.ax.d;
            if (athiVar2 == null) {
                athiVar2 = athi.a;
            }
            if (athiVar2.b == 77195710) {
                aovjVar = (aovj) athiVar2.c;
            } else {
                aovjVar = aovj.a;
            }
            ajpdVar.add(aovjVar);
        }
        this.az.m(ajpdVar);
        int size = this.ax.e.size();
        for (int i = 0; i < size; i++) {
            athn athnVar = (athn) this.ax.e.get(i);
            ajpd ajpdVar2 = new ajpd();
            if (athnVar.b == 122175950) {
                athmVar = (athm) athnVar.c;
            } else {
                athmVar = athm.a;
            }
            for (athl athlVar : athmVar.b) {
                if (athlVar.b == 94317419) {
                    ajpdVar2.add((apib) athlVar.c);
                }
                if (athlVar.b == 79129962) {
                    ajpdVar2.add((aqbs) athlVar.c);
                }
            }
            if (i < size - 1) {
                ajpdVar2.add(new muf());
            }
            this.az.m(ajpdVar2);
        }
        ajpa ajpaVar = new ajpa();
        this.av = ajpaVar;
        ajpaVar.f(aovj.class, new ajou(this.af));
        this.av.f(aqbs.class, new ajou(this.ag));
        this.av.f(apib.class, new ajou(this.ah));
        this.av.f(muf.class, new ajou(this.ai));
        ajox a = this.am.a(this.av);
        this.ay = a;
        a.h(this.az);
        athk athkVar2 = this.ax;
        if (athkVar2 != null) {
            athp athpVar = athkVar2.c;
            if (athpVar == null) {
                athpVar = athp.a;
            }
            if (athpVar.b == 123890900) {
                athp athpVar2 = this.ax.c;
                if (athpVar2 == null) {
                    athpVar2 = athp.a;
                }
                if (athpVar2.b == 123890900) {
                    athqVar = (athq) athpVar2.c;
                } else {
                    athqVar = athq.a;
                }
                if ((athqVar.b & 2) != 0) {
                    athp athpVar3 = this.ax.c;
                    if (athpVar3 == null) {
                        athpVar3 = athp.a;
                    }
                    if (athpVar3.b == 123890900) {
                        athqVar2 = (athq) athpVar3.c;
                    } else {
                        athqVar2 = athq.a;
                    }
                    aqygVar = athqVar2.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                this.aA = ajcq.b(aqygVar);
            }
            athk athkVar3 = this.ax;
            if ((athkVar3.b & 4) != 0) {
                athh athhVar = athkVar3.f;
                if (athhVar == null) {
                    athhVar = athh.a;
                }
                if (athhVar.b == 88571644) {
                    aqyg aqygVar2 = ((asvf) athhVar.c).b;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    this.aB = ajcq.b(aqygVar2);
                }
                if (athhVar.b == 242554289) {
                    aufjVar = (aufj) athhVar.c;
                } else {
                    aufjVar = aufj.a;
                }
                if (athhVar.b == 242554289) {
                    if ((aufjVar.b & 4) != 0) {
                        aulq aulqVar = aufjVar.e;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        asvf asvfVar = (asvf) ahbj.n(aulqVar, LugashFooterRendererOuterClass.lugashFooterRenderer);
                        if (asvfVar != null) {
                            aqyg aqygVar3 = asvfVar.b;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            spannedString = ajcq.b(aqygVar3);
                        } else {
                            spannedString = new SpannedString("");
                        }
                        this.aB = spannedString;
                    }
                    aqyg aqygVar4 = aufjVar.c;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                    this.aC = ajcq.b(aqygVar4);
                    aqyg aqygVar5 = aufjVar.d;
                    if (aqygVar5 == null) {
                        aqygVar5 = aqyg.a;
                    }
                    this.aD = ajcq.b(aqygVar5);
                    apxf apxfVar = aufjVar.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    this.au = apxfVar;
                    apxf apxfVar2 = aufjVar.g;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    this.at = apxfVar2;
                }
            }
        }
        this.aG = this.an.c().g();
        boolean ag = evr.ag(this.ar.a());
        if (this.aG) {
            return;
        }
        boolean aa = yjk.aa(qR());
        gng gngVar = gng.LIGHT;
        int ordinal = this.aq.a().ordinal();
        if (ordinal == 0) {
            if (aa) {
                o(0, true != ag ? R.style.Theme_YouTube_Light_AccountPanel_Dialog : R.style.Theme_YouTube_Light_AccountPanel_Dialog_RemoveStatusBarBackground);
                return;
            } else {
                o(0, true != ag ? R.style.Theme_YouTube_Light_AccountPanel : R.style.Theme_YouTube_Light_AccountPanel_RemoveStatusBarBackground);
                return;
            }
        }
        if (ordinal != 1) {
            return;
        }
        if (aa) {
            o(0, true != ag ? R.style.Theme_YouTube_Dark_AccountPanel_Dialog : R.style.Theme_YouTube_Dark_AccountPanel_Dialog_RemoveStatusBarBackground);
        } else {
            o(0, true != ag ? R.style.Theme_YouTube_Dark_AccountPanel : R.style.Theme_YouTube_Dark_AccountPanel_RemoveStatusBarBackground);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        Window window;
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            aI();
            window.setWindowAnimations(R.style.SlideUpDownAnimation);
        }
        this.ao.g(1);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.multi_page_menu_dialog_fragment, viewGroup, false);
        this.aE = inflate;
        this.aF = (RecyclerView) inflate.findViewById(R.id.list);
        this.aw = (Toolbar) this.aE.findViewById(R.id.toolbar);
        this.aF.ac(this.ay);
        qW();
        this.aF.af(new LinearLayoutManager());
        this.aF.setOnClickListener(this);
        if ((this.ax.b & 2) == 0) {
            this.aF.setPaddingRelative(0, qR().getResources().getDimensionPixelSize(R.dimen.list_item_vpadding), 0, 0);
        }
        this.aw.z(this.ak.m.le(qW()));
        this.aw.setBackgroundColor(this.ak.j.le(qW()));
        this.aw.r(this);
        this.aw.x(this.aA);
        this.aw.q(whu.y(qR(), R.drawable.yt_outline_x_black_24, R.attr.ytTextPrimary));
        this.aw.setElevation(aH(layoutInflater.getContext(), evr.af(this.ar.a())));
        if (this.aG) {
            this.aw.setVisibility(8);
        }
        TextView textView = (TextView) this.aE.findViewById(R.id.lugash_footer);
        Spanned spanned = this.aB;
        if (spanned != null) {
            textView.setText(spanned);
            textView.setVisibility(0);
        }
        if (this.aC != null && this.au != null && this.aD != null && this.at != null) {
            ((LinearLayout) this.aE.findViewById(R.id.privacy_tos_footer)).setVisibility(0);
            TextView textView2 = (TextView) this.aE.findViewById(R.id.privacy_footer);
            TextView textView3 = (TextView) this.aE.findViewById(R.id.tos_footer);
            textView2.setText(this.aC);
            final int i2 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: luu
                public final /* synthetic */ lux a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i2 != 0) {
                        lux luxVar = this.a;
                        luxVar.ap.c(luxVar.au, null);
                    } else {
                        lux luxVar2 = this.a;
                        luxVar2.ap.c(luxVar2.at, null);
                    }
                }
            });
            textView3.setText(this.aD);
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: luu
                public final /* synthetic */ lux a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i != 0) {
                        lux luxVar = this.a;
                        luxVar.ap.c(luxVar.au, null);
                    } else {
                        lux luxVar2 = this.a;
                        luxVar2.ap.c(luxVar2.at, null);
                    }
                }
            });
        }
        this.ae.mM().u(new acqx(this.ax.g), null);
        return this.aE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aI();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return this.aG ? new algj(qW(), this.b) : super.oq(bundle);
    }
}
