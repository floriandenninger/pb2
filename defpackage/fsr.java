package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsr extends ajpc {
    public final ypa a;
    public final aahd b;
    public araz c;
    private final ajjz d;
    private final ajut e;
    private final LayoutInflater f;
    private final Resources g;
    private final ViewGroup h;
    private fsq i;

    public fsr(Context context, ajjz ajjzVar, ypa ypaVar, aahd aahdVar, ajut ajutVar) {
        ajjzVar.getClass();
        this.d = ajjzVar;
        ypaVar.getClass();
        this.a = ypaVar;
        aahdVar.getClass();
        this.b = aahdVar;
        ajutVar.getClass();
        this.e = ajutVar;
        this.f = LayoutInflater.from(context);
        this.g = context.getResources();
        this.h = new FrameLayout(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.h;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        int i;
        this.c = (araz) obj;
        if (this.i == null) {
            this.i = new fsq(this, this.f.inflate(true != this.g.getBoolean(R.bool.generic_promo_banner_view) ? R.layout.generic_promo_card : R.layout.generic_promo_banner, this.h, false));
        }
        fsq fsqVar = this.i;
        araz arazVar = this.c;
        arazVar.getClass();
        TextView textView = fsqVar.b;
        aqyg aqygVar2 = null;
        if ((arazVar.b & 1) != 0) {
            aqygVar = arazVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = fsqVar.c;
        if ((arazVar.b & 2) != 0 && (aqygVar2 = arazVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        if ((arazVar.b & 64) == 0) {
            fsqVar.d.setVisibility(8);
        } else {
            fsqVar.d.setVisibility(0);
        }
        ajjz ajjzVar = this.d;
        ImageView imageView = fsqVar.e;
        avgg avggVar = arazVar.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        apmh apmhVar = arazVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) == 0) {
            fsqVar.g.setVisibility(8);
        } else {
            Button button = fsqVar.g;
            apmh apmhVar2 = arazVar.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqyg aqygVar3 = apmgVar2.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            button.setText(ajcq.b(aqygVar3));
        }
        if ((arazVar.b & 16) != 0) {
            ajut ajutVar = this.e;
            arfs arfsVar = arazVar.g;
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
        if (i != 0) {
            this.d.e(fsqVar.f);
            fsqVar.f.setBackgroundResource(i);
        } else {
            avgg avggVar2 = arazVar.f;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            this.d.h(fsqVar.f, avggVar2);
            fsqVar.f.setVisibility(true != ahbw.L(avggVar2) ? 8 : 0);
        }
        this.h.removeAllViews();
        this.h.addView(fsqVar.a);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((araz) obj).j.I();
    }
}
