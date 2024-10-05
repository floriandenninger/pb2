package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqg implements ajom {
    public final ammv a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final gno e;
    private final gno f;
    private final ajop g;
    private final ajut h;

    public mqg(Context context, ajpe ajpeVar, ajut ajutVar, akht akhtVar, ammv ammvVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.limited_state_msg, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.lim_state_msg_header_text);
        this.c = (TextView) inflate.findViewById(R.id.lim_state_msg_subtext);
        this.d = (ImageView) inflate.findViewById(R.id.lim_state_msg_icon);
        this.e = akhtVar.h((TextView) inflate.findViewById(R.id.learn_more_button));
        this.f = akhtVar.h((TextView) inflate.findViewById(R.id.go_home_button));
        this.g = ajpeVar;
        this.h = ajutVar;
        this.a = ammvVar;
        ajpeVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((ajpe) this.g).a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        asnq asnqVar = (asnq) obj;
        TextView textView = this.b;
        apmg apmgVar2 = null;
        if ((asnqVar.b & 1) != 0) {
            aqygVar = asnqVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.c;
        if ((asnqVar.b & 2) != 0) {
            aqygVar2 = asnqVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        if ((asnqVar.b & 8) != 0) {
            aulq aulqVar = asnqVar.f;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar2 = asnqVar.f;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apmgVar = null;
            }
            this.e.b(apmgVar, ajokVar.a);
        }
        if ((asnqVar.b & 16) != 0) {
            aulq aulqVar3 = asnqVar.g;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar4 = asnqVar.g;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
            }
            this.f.b(apmgVar2, ajokVar.a);
            this.f.c = new ajyc() { // from class: mqf
                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    mqg mqgVar = mqg.this;
                    if (mqgVar.a.h()) {
                        ((okf) mqgVar.a.c()).h(false);
                    }
                }
            };
        }
        if ((asnqVar.b & 4) != 0) {
            ImageView imageView = this.d;
            arfs arfsVar = asnqVar.e;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = this.h.a(b);
            if (a != 0) {
                imageView.setImageResource(a);
                imageView.setVisibility(0);
            }
        }
        this.g.e(ajokVar);
    }
}
