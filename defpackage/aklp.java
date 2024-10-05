package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklp implements ajom {
    public apxf a;
    public apxf b;
    public apxf c;
    public aqyg d;
    private final aahd e;
    private final ajut f;
    private final View g;
    private final ajkj h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;

    public aklp(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, aklo akloVar) {
        this.e = aahdVar;
        this.f = ajutVar;
        View inflate = View.inflate(context, R.layout.share_panel_promo, null);
        this.g = inflate;
        this.h = new ajkj(ajjzVar, (ImageView) inflate.findViewById(R.id.promo_image), true);
        this.i = (TextView) inflate.findViewById(R.id.promo_text);
        TextView textView = (TextView) inflate.findViewById(R.id.add_contacts_button);
        this.j = textView;
        textView.setOnClickListener(new akll(this, aahdVar));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.k = imageView;
        imageView.setOnClickListener(new aklm(this, aahdVar, akloVar));
        akmk.h(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apxf apxfVar;
        apxf apxfVar2;
        avmi avmiVar = (avmi) obj;
        int i = 0;
        if (!TextUtils.isEmpty(avmiVar.c)) {
            this.g.setBackgroundColor(Color.parseColor(avmiVar.c));
        } else {
            this.g.setBackgroundColor(0);
        }
        ajkj ajkjVar = this.h;
        avgg avggVar = avmiVar.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajkjVar.k(avggVar);
        TextView textView = this.i;
        if ((avmiVar.b & 64) != 0) {
            aqygVar = avmiVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        apmh apmhVar = avmiVar.j;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        TextView textView2 = this.j;
        if ((apmgVar.b & 256) != 0) {
            aqygVar2 = apmgVar.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, aahk.a(aqygVar2, this.e, false));
        if ((apmgVar.b & 8192) != 0) {
            apxfVar = apmgVar.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.a = apxfVar;
        if ((apmgVar.b & 16384) != 0) {
            apxfVar2 = apmgVar.o;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
        } else {
            apxfVar2 = null;
        }
        this.b = apxfVar2;
        if ((avmiVar.b & 2) != 0) {
            ajut ajutVar = this.f;
            arfs arfsVar = avmiVar.d;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        }
        if (i != 0) {
            this.k.setImageResource(i);
        } else {
            this.k.setImageDrawable(null);
        }
        apxf apxfVar3 = avmiVar.e;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        this.c = apxfVar3;
        aqyg aqygVar3 = avmiVar.f;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        this.d = aqygVar3;
    }
}
