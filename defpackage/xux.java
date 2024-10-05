package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xux implements ajom {
    private final ajjz a;
    private final aahd b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final ajyf h;
    private final TextView i;

    public xux(Context context, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar) {
        ajjzVar.getClass();
        this.a = ajjzVar;
        aahdVar.getClass();
        this.b = aahdVar;
        View inflate = View.inflate(context, R.layout.backstage_zero_state, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.logo);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.text);
        this.g = (TextView) inflate.findViewById(R.id.learn_more);
        this.i = (TextView) inflate.findViewById(R.id.footer);
        this.h = ajygVar.a((TextView) inflate.findViewById(R.id.post_button));
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
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        apjo apjoVar = (apjo) obj;
        ajjz ajjzVar = this.a;
        ImageView imageView = this.d;
        avgg avggVar = apjoVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.e;
        HashMap hashMap = null;
        if ((apjoVar.b & 1) != 0) {
            aqygVar = apjoVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.f;
        if ((apjoVar.b & 2) != 0) {
            aqygVar2 = apjoVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        TextView textView3 = this.g;
        if ((apjoVar.b & 8) != 0) {
            aqygVar3 = apjoVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView3.setText(aahk.a(aqygVar3, this.b, false));
        int i = apjoVar.b & 8;
        if (i != 0) {
            if (i != 0) {
                aqygVar5 = apjoVar.f;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
            } else {
                aqygVar5 = null;
            }
            CharSequence i2 = ajcq.i(aqygVar5);
            if (i2 != null) {
                this.g.setContentDescription(i2);
            }
        }
        TextView textView4 = this.i;
        if ((apjoVar.b & 16) != 0) {
            aqygVar4 = apjoVar.g;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        textView4.setText(ajcq.b(aqygVar4));
        aulq aulqVar = apjoVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        if (apmgVar != null) {
            ajyf ajyfVar = this.h;
            acra acraVar = ajokVar.a;
            ajvc ajvcVar = (ajvc) ajokVar.c("sectionController");
            if (ajvcVar != null) {
                hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new xqb(ajvcVar));
            }
            ajyfVar.a(apmgVar, acraVar, hashMap);
        }
    }
}
