package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fss implements ajom {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final FrameLayout f;
    private final Context g;
    private final ajut h;
    private final aahd i;
    private final ajkj j;
    private final DisplayMetrics k;
    private frg l;
    private final jgp m;

    public fss(Context context, ajut ajutVar, aahd aahdVar, ajjs ajjsVar, jgp jgpVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = context;
        this.h = ajutVar;
        this.i = aahdVar;
        this.m = jgpVar;
        View inflate = View.inflate(context, i, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.message_text);
        this.c = (TextView) inflate.findViewById(R.id.message_subtext);
        this.d = (ImageView) inflate.findViewById(R.id.message_icon);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.message_thumbnail);
        this.e = imageView;
        this.f = (FrameLayout) inflate.findViewById(R.id.message_button_layout);
        this.j = new ajkj(ajjsVar, imageView);
        this.k = context.getResources().getDisplayMetrics();
    }

    private final int e(int i) {
        return yjk.K(this.k, i);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.setLineSpacing(0.0f, 1.0f);
        this.f.removeAllViews();
        frg frgVar = this.l;
        if (frgVar != null) {
            frgVar.b(ajosVar);
            this.l = null;
        }
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, fsx fsxVar) {
        atds atdsVar;
        atds atdsVar2;
        aqyg aqygVar;
        atdn atdnVar = fsxVar.a;
        if ((atdnVar.b & 1) != 0) {
            aqyg aqygVar2 = atdnVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            this.b.setText(aahk.a(aqygVar2, this.i, false));
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
        atdq atdqVar = atdnVar.f;
        if (atdqVar == null) {
            atdqVar = atdq.a;
        }
        if ((atdqVar.b & 1) == 0) {
            this.c.setVisibility(8);
            this.b.setTextColor(wbs.W(this.g, R.attr.ytTextSecondary).orElse(0));
        } else {
            TextView textView = this.c;
            atdq atdqVar2 = atdnVar.f;
            if (atdqVar2 == null) {
                atdqVar2 = atdq.a;
            }
            atdp atdpVar = atdqVar2.c;
            if (atdpVar == null) {
                atdpVar = atdp.a;
            }
            if ((atdpVar.b & 1) != 0) {
                atdq atdqVar3 = atdnVar.f;
                if (atdqVar3 == null) {
                    atdqVar3 = atdq.a;
                }
                atdp atdpVar2 = atdqVar3.c;
                if (atdpVar2 == null) {
                    atdpVar2 = atdp.a;
                }
                aqygVar = atdpVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(aahk.a(aqygVar, this.i, false));
            this.c.setVisibility(0);
            this.c.setLineSpacing(yjk.K(this.g.getResources().getDisplayMetrics(), ajokVar.b("BaseMessagePresenter.SubtextLineSpacingExtra", 0)), 1.0f);
            this.b.setTextColor(wbs.W(this.g, R.attr.ytTextPrimary).orElse(0));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        int i = atdnVar.c;
        if (i != 2) {
            if (i == 7) {
                atdsVar = (atds) atdnVar.d;
            } else {
                atdsVar = atds.a;
            }
            if ((atdsVar.b & 1) != 0) {
                if (atdnVar.c == 7) {
                    atdsVar2 = (atds) atdnVar.d;
                } else {
                    atdsVar2 = atds.a;
                }
                atdr atdrVar = atdsVar2.c;
                if (atdrVar == null) {
                    atdrVar = atdr.a;
                }
                yny.B(this.e, e(atdrVar.c), e(atdrVar.d));
                ajkj ajkjVar = this.j;
                avgg avggVar = atdrVar.b;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajkjVar.k(avggVar);
                this.e.setVisibility(0);
            }
        } else {
            ajut ajutVar = this.h;
            arfr b = arfr.b(((atdt) atdnVar.d).b);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b);
            if (a != 0) {
                this.d.setImageResource(a);
                this.d.setVisibility(0);
            }
        }
        this.f.setVisibility(8);
        apmh apmhVar = atdnVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", atdnVar);
            frg e = this.m.e(null, hashMap, R.layout.wide_button);
            apmh apmhVar2 = atdnVar.h;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            e.oB(ajokVar, apmgVar);
            this.f.removeAllViews();
            this.f.addView(e.b);
            this.f.setVisibility(0);
            this.l = e;
        }
    }
}
