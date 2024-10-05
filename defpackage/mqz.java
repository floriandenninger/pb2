package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mqz implements ajom {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final LinearLayout d;
    private Map e = new HashMap();
    private final jgp f;

    public mqz(View view, jgp jgpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = view;
        this.f = jgpVar;
        this.b = (TextView) view.findViewById(R.id.response_text);
        this.c = (TextView) view.findViewById(R.id.subtext);
        this.d = (LinearLayout) view.findViewById(R.id.buttons_view);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, atni atniVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atniVar);
        TextView textView = this.b;
        if ((atniVar.b & 1) != 0) {
            aqygVar = atniVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.b;
        if ((atniVar.b & 1) != 0) {
            aqygVar2 = atniVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setContentDescription(ajcq.i(aqygVar2));
        TextView textView3 = this.c;
        if ((atniVar.b & 2) != 0) {
            aqygVar3 = atniVar.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        TextView textView4 = this.c;
        if ((atniVar.b & 2) != 0) {
            aqygVar4 = atniVar.d;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        textView4.setContentDescription(ajcq.i(aqygVar4));
        aony<apmh> aonyVar = atniVar.e;
        this.d.removeAllViews();
        whu.I(this.d, !aonyVar.isEmpty());
        for (apmh apmhVar : aonyVar) {
            if (apmhVar != null && (apmhVar.b & 1) != 0) {
                frg d = this.f.d(null, this.e);
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                d.oB(ajokVar, apmgVar);
                this.d.addView(d.b);
            }
        }
    }
}
