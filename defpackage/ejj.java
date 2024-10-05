package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.RequiredSignInRendererOuterClass;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejj implements afwx {
    final /* synthetic */ ejk a;

    public ejj(ejk ejkVar) {
        this.a = ejkVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (!this.a.d.o()) {
            ejk ejkVar = this.a;
            final int i = 1;
            ejkVar.e.aF(cnqVar, ejkVar.a.getApplicationContext().getString(R.string.offline_no_content_title_offline_eligible_and_no_content), new View.OnClickListener(this) { // from class: eji
                public final /* synthetic */ ejj a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i != 0) {
                        this.a.a.c();
                    } else {
                        this.a.a.c();
                    }
                }
            });
        } else {
            ejk ejkVar2 = this.a;
            final int i2 = 0;
            ejkVar2.e.aF(cnqVar, ejkVar2.a.getApplicationContext().getString(R.string.common_error_response), new View.OnClickListener(this) { // from class: eji
                public final /* synthetic */ ejj a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i2 != 0) {
                        this.a.a.c();
                    } else {
                        this.a.a.c();
                    }
                }
            });
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aati aatiVar = (aati) obj;
        aata a = aatiVar.a();
        if (a == null) {
            List c = aatiVar.c();
            if (c.size() == 1) {
                a = (aata) c.get(0);
            }
        }
        if (a != null) {
            this.a.b.i(a, null, null);
            return;
        }
        final ejg ejgVar = this.a.e;
        if (ejgVar != null) {
            if (aatiVar.b() == null) {
                ejgVar.af.a();
                return;
            }
            ejgVar.s();
            ejgVar.an = aatiVar;
            aumf b = ejgVar.an.b();
            ejgVar.am = b.h;
            ejgVar.al = new HashMap();
            ejgVar.al.put("AccountItemsForDirectSignIn", ejgVar.an.c());
            if ((b.b & 1) != 0) {
                YouTubeTextView youTubeTextView = ejgVar.ag;
                aqyg aqygVar = b.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                youTubeTextView.setText(ajcq.b(aqygVar));
            }
            if ((b.b & 2) != 0) {
                YouTubeTextView youTubeTextView2 = ejgVar.ah;
                aqyg aqygVar2 = b.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                youTubeTextView2.setText(ajcq.b(aqygVar2));
                ejgVar.ah.setVisibility(0);
            } else {
                ejgVar.ah.setVisibility(8);
            }
            if ((b.b & 512) != 0) {
                aulq aulqVar = b.j;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                apmg apmgVar = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
                ejgVar.ak.removeAllViews();
                ejgVar.r(apmgVar, ejgVar.ak, null, null, R.layout.learn_more_button);
            }
            if ((b.b & 32) != 0) {
                aulq aulqVar2 = b.g;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmg apmgVar2 = (apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer);
                ejgVar.aj.removeAllViews();
                ejgVar.q(apmgVar2, ejgVar.aj, acsb.c(76982));
            }
            if ((b.b & 16) != 0) {
                aulq aulqVar3 = b.f;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                aume aumeVar = (aume) ahbj.n(aulqVar3, RequiredSignInRendererOuterClass.expressSignInRenderer);
                ejgVar.ai.removeAllViews();
                final acqx acqxVar = new acqx(acsb.c(76984));
                ejgVar.d.n(acqxVar);
                wbx a2 = new wbw(ejgVar.a, ejgVar.c, ejgVar.d, new wia() { // from class: ejc
                    @Override // defpackage.wia
                    public final void a(aata aataVar) {
                        ejg ejgVar2 = ejg.this;
                        acsa acsaVar = acqxVar;
                        ejgVar2.b.c(aataVar.d(), ejgVar2.al);
                        ejgVar2.d.I(3, acsaVar, null);
                    }
                }, null, ejgVar.e, ejgVar.ao, null).a();
                aulq aulqVar4 = aumeVar.b;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                aata aataVar = new aata((aova) ahbj.n(aulqVar4, AccountsListRenderer.accountItemRenderer));
                new ajok();
                a2.d(aataVar);
                final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                yny.A(a2.c, new azrw() { // from class: ejf
                    @Override // defpackage.azrw
                    public final Object get() {
                        return layoutParams;
                    }
                }, yny.h(yny.y(layoutParams.width, layoutParams.height), yny.s(0, 0, 0, yjk.K(ejgVar.qX().getDisplayMetrics(), 8))), ViewGroup.MarginLayoutParams.class);
                ejgVar.ai.addView(a2.c);
                aulq aulqVar5 = aumeVar.c;
                if (aulqVar5 == null) {
                    aulqVar5 = aulq.a;
                }
                ejgVar.q((apmg) ahbj.n(aulqVar5, ButtonRendererOuterClass.buttonRenderer), ejgVar.ai, acsb.c(76981));
            }
            if ((b.b & 8) != 0) {
                aulq aulqVar6 = b.e;
                if (aulqVar6 == null) {
                    aulqVar6 = aulq.a;
                }
                apmg apmgVar3 = (apmg) ahbj.n(aulqVar6, ButtonRendererOuterClass.buttonRenderer);
                ejgVar.ai.removeAllViews();
                ejgVar.q(apmgVar3, ejgVar.ai, acsb.c(76983));
            }
            if ((b.b & 256) != 0) {
                aulq aulqVar7 = b.i;
                if (aulqVar7 == null) {
                    aulqVar7 = aulq.a;
                }
                ejgVar.r((apmg) ahbj.n(aulqVar7, ButtonRendererOuterClass.buttonRenderer), ejgVar.ai, acsb.c(76985), new ajyc() { // from class: ejd
                    @Override // defpackage.ajyc
                    public final void oC(aong aongVar) {
                        ejg.this.af.a();
                    }
                }, R.layout.skip_button);
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
