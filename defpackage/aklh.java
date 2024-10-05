package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklh implements ajom {
    private final aahd a;
    private final acra b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final ajyd h;
    private final Runnable i;

    public aklh(Context context, aahd aahdVar, aoae aoaeVar, acra acraVar, aklg aklgVar, Runnable runnable, byte[] bArr) {
        arej arejVar;
        this.b = acraVar;
        this.i = runnable;
        this.a = aahdVar;
        View inflate = View.inflate(context, R.layout.community_post_section, null);
        this.c = inflate;
        akmk.h(inflate);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.post_button);
        this.f = textView;
        View findViewById = inflate.findViewById(R.id.tooltip_anchor);
        this.g = findViewById;
        this.h = new ajyd(aahdVar, aoaeVar, textView, null);
        whu.E(textView, textView.getBackground());
        akho akhoVar = (akho) aklgVar;
        avlu avluVar = akhoVar.a.f;
        if ((avluVar == null ? avlu.a : avluVar).b == 102716411) {
            akhm akhmVar = akhoVar.b;
            avlu avluVar2 = akhoVar.a.f;
            avluVar2 = avluVar2 == null ? avlu.a : avluVar2;
            if (avluVar2.b == 102716411) {
                arejVar = (arej) avluVar2.c;
            } else {
                arejVar = arej.a;
            }
            akiv akivVar = (akiv) akhmVar;
            akivVar.p = arejVar;
            akivVar.q = findViewById;
            akivVar.c();
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        avlv avlvVar = (avlv) obj;
        this.c.setVisibility(0);
        apmh apmhVar = avlvVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            this.c.setVisibility(8);
            return;
        }
        TextView textView = this.d;
        aqyg aqygVar3 = null;
        if ((avlvVar.b & 1) != 0) {
            aqygVar = avlvVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.e;
        if ((avlvVar.b & 2) != 0) {
            aqygVar2 = avlvVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(aahk.a(aqygVar2, this.a, false));
        apmh apmhVar2 = avlvVar.e;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        TextView textView3 = this.f;
        if ((apmgVar.b & 256) != 0 && (aqygVar3 = apmgVar.i) == null) {
            aqygVar3 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar3));
        adz adzVar = new adz(1);
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
        this.h.a(apmgVar, this.b, adzVar);
    }
}
