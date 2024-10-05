package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygp implements ajom, yaw {
    private final LayoutInflater a;
    private final ajop b;
    private final aahd c;
    private final TextView d;
    private final TextView e;
    private final ajyf f;
    private final ajyf g;
    private final ajyf h;
    private final yay i;
    private avmy j;
    private final LinearLayout k;
    private final LinkedList l;

    public ygp(Context context, yfw yfwVar, ajyg ajygVar, aahd aahdVar, yay yayVar) {
        this.b = yfwVar;
        this.c = aahdVar;
        this.i = yayVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.a = from;
        View inflate = from.inflate(R.layout.unlimited_manage_subscription_page, (ViewGroup) null);
        this.d = (TextView) inflate.findViewById(R.id.subscription_title);
        this.e = (TextView) inflate.findViewById(R.id.additional_info);
        this.f = ajygVar.a((TextView) inflate.findViewById(R.id.manage_family_button));
        this.g = ajygVar.a((TextView) inflate.findViewById(R.id.manage_subscription_button));
        this.h = ajygVar.a((TextView) inflate.findViewById(R.id.manage_fix_fop_button));
        this.k = (LinearLayout) inflate.findViewById(R.id.details_list_container);
        this.l = new LinkedList();
        yfwVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((yfw) this.b).a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.i.d(this);
    }

    @Override // defpackage.yaw
    public final void d(boolean z) {
        if (z) {
            avmy avmyVar = this.j;
            if ((avmyVar.b & 64) != 0) {
                aahd aahdVar = this.c;
                apxf apxfVar = avmyVar.j;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
    }

    @Override // defpackage.yax
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apmg apmgVar;
        apmg apmgVar2;
        LinearLayout linearLayout;
        avmy avmyVar = (avmy) obj;
        this.i.c(this);
        if (amkq.b(this.j, avmyVar)) {
            return;
        }
        this.j = avmyVar;
        acra acraVar = ajokVar.a;
        apmg apmgVar3 = null;
        acraVar.u(new acqx(avmyVar.h), null);
        TextView textView = this.d;
        aqyg aqygVar = avmyVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        this.k.removeAllViews();
        for (int i = 0; i < avmyVar.d.size(); i++) {
            if ((((avna) avmyVar.d.get(i)).b & 1) != 0) {
                avmz avmzVar = ((avna) avmyVar.d.get(i)).c;
                if (avmzVar == null) {
                    avmzVar = avmz.a;
                }
                if (i < this.l.size()) {
                    linearLayout = (LinearLayout) this.l.get(i);
                } else {
                    linearLayout = (LinearLayout) this.a.inflate(R.layout.unlimited_manage_subscription_page_offer_item, (ViewGroup) null);
                    this.l.add(linearLayout);
                }
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.title);
                aqyg aqygVar2 = avmzVar.b;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                whu.G(textView2, ajcq.b(aqygVar2));
                TextView textView3 = (TextView) linearLayout.findViewById(R.id.content);
                aqyg aqygVar3 = avmzVar.c;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                whu.G(textView3, ajcq.b(aqygVar3));
                this.k.addView(linearLayout);
            }
        }
        whu.G(this.e, avmyVar.f.isEmpty() ? null : ajcq.j(TextUtils.concat(System.getProperty("line.separator")), aahk.d(avmyVar.f, this.c)));
        ajyf ajyfVar = this.f;
        avmx avmxVar = avmyVar.i;
        if (avmxVar == null) {
            avmxVar = avmx.a;
        }
        if (avmxVar.b == 65153809) {
            avmx avmxVar2 = avmyVar.i;
            if (avmxVar2 == null) {
                avmxVar2 = avmx.a;
            }
            if (avmxVar2.b == 65153809) {
                apmgVar = (apmg) avmxVar2.c;
            } else {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, acraVar);
        ajyf ajyfVar2 = this.g;
        apmh apmhVar = avmyVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = avmyVar.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
        } else {
            apmgVar2 = null;
        }
        ajyfVar2.b(apmgVar2, acraVar);
        ajyf ajyfVar3 = this.h;
        aulq aulqVar = avmyVar.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = avmyVar.g;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar3 = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        ajyfVar3.b(apmgVar3, acraVar);
        this.b.e(ajokVar);
    }
}
