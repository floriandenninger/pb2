package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconMessageRendererOuterClass;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxj extends abxe {
    public ajyg ae;
    public ajut af;
    public acqz ag;
    public athg ah;
    public Map ai;
    private View aj;
    private TextView ak;
    private RecyclerView al;
    private abxi am;
    private ajyf an;
    private ajyf ao;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
        LayoutInflater from = LayoutInflater.from(qR());
        View inflate = from.inflate(R.layout.multi_message_confirm_dialog_layout, new ScrollView(qR()));
        this.aj = inflate;
        this.ak = (TextView) inflate.findViewById(R.id.title);
        this.al = (RecyclerView) this.aj.findViewById(R.id.recycler_view);
        qR();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        this.al.af(linearLayoutManager);
        abxi abxiVar = new abxi(from);
        this.am = abxiVar;
        this.al.ac(abxiVar);
        this.an = this.ae.a((TextView) this.aj.findViewById(R.id.cancel_button));
        this.ao = this.ae.a((TextView) this.aj.findViewById(R.id.confirm_button));
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (ar()) {
            dismiss();
            qh(this.z, "MultiMessageConfirmDialogFragment");
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        apmg apmgVar;
        apmg apmgVar2;
        int i;
        Spanned spanned;
        athg athgVar = this.ah;
        athgVar.getClass();
        TextView textView = this.ak;
        aqyg aqygVar = athgVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        this.am.d.clear();
        final int i2 = 1;
        final int i3 = 0;
        if (this.ah.f.size() != 0) {
            Iterator it = this.ah.f.iterator();
            while (it.hasNext()) {
                arfp arfpVar = (arfp) ((aulq) it.next()).pX(IconMessageRendererOuterClass.iconMessageRenderer);
                abxi abxiVar = this.am;
                if ((arfpVar.b & 1) != 0) {
                    ajut ajutVar = this.af;
                    arfs arfsVar = arfpVar.c;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    i = ajutVar.a(b);
                } else {
                    i = 0;
                }
                if ((arfpVar.b & 2) != 0) {
                    aqyg aqygVar2 = arfpVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    spanned = ajcq.b(aqygVar2);
                } else {
                    spanned = null;
                }
                abxiVar.d.add(new abxh(i, spanned));
            }
            this.al.setVisibility(0);
        } else {
            this.al.setVisibility(8);
        }
        this.am.mw();
        ajyf ajyfVar = this.an;
        aulq aulqVar = this.ah.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = this.ah.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ajyfVar.a(apmgVar, this.ag.mM(), this.ai);
        this.an.c = new ajyc(this) { // from class: abxf
            public final /* synthetic */ abxj a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i2 != 0) {
                    this.a.dismiss();
                } else {
                    this.a.dismiss();
                }
            }
        };
        ajyf ajyfVar2 = this.ao;
        aulq aulqVar3 = this.ah.d;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = this.ah.d;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar2 = null;
        }
        ajyfVar2.a(apmgVar2, this.ag.mM(), this.ai);
        this.ao.c = new ajyc(this) { // from class: abxf
            public final /* synthetic */ abxj a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i3 != 0) {
                    this.a.dismiss();
                } else {
                    this.a.dismiss();
                }
            }
        };
        this.ag.mM().u(new acqx(this.ah.g), null);
        return new AlertDialog.Builder(qR()).setView(this.aj).create();
    }
}
