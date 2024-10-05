package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfk extends ajpc implements DialogInterface.OnDismissListener {
    public final Runnable a;
    public final Runnable b;
    public final View c;
    public int d = 0;
    private final LayoutInflater e;
    private final aahd f;
    private final Map g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final LinearLayout l;
    private final TextView m;
    private final ajyf n;
    private final TextView o;
    private final ajyf p;
    private awhv q;

    public yfk(Context context, aahd aahdVar, ajyg ajygVar, Runnable runnable, Runnable runnable2, Map map) {
        this.f = aahdVar;
        this.a = runnable;
        this.b = runnable2;
        this.g = map;
        LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        View inflate = from.inflate(R.layout.upgrade_dialog, (ViewGroup) null, false);
        this.c = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.offer_display_title);
        this.j = (TextView) inflate.findViewById(R.id.access_message);
        this.k = (TextView) inflate.findViewById(R.id.legal_text);
        this.l = (LinearLayout) inflate.findViewById(R.id.billing_details_container);
        TextView textView = (TextView) inflate.findViewById(R.id.continue_button);
        this.m = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.cancel_button);
        this.o = textView2;
        this.n = ajygVar.a(textView);
        this.p = ajygVar.a(textView2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        final int i;
        apmg apmgVar;
        awhv awhvVar = (awhv) obj;
        acra acraVar = ajokVar.a;
        this.q = awhvVar;
        TextView textView = this.h;
        awhu awhuVar = awhvVar.c;
        if (awhuVar == null) {
            awhuVar = awhu.a;
        }
        aqyg aqygVar2 = awhuVar.b;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar2));
        TextView textView2 = this.i;
        awhu awhuVar2 = awhvVar.c;
        if (awhuVar2 == null) {
            awhuVar2 = awhu.a;
        }
        aqyg aqygVar3 = awhuVar2.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar3));
        TextView textView3 = this.j;
        awhu awhuVar3 = awhvVar.c;
        if (awhuVar3 == null) {
            awhuVar3 = awhu.a;
        }
        aqyg aqygVar4 = awhuVar3.d;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar4));
        TextView textView4 = this.k;
        if ((awhvVar.b & 2) != 0) {
            aqygVar = awhvVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView4, ajcq.b(aqygVar));
        this.l.removeAllViews();
        Iterator it = awhvVar.d.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            awht awhtVar = (awht) it.next();
            View inflate = this.e.inflate(R.layout.billing_item, (ViewGroup) null, false);
            TextView textView5 = (TextView) inflate.findViewById(R.id.title);
            aqyg aqygVar5 = awhtVar.b;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            textView5.setText(ajcq.b(aqygVar5));
            TextView textView6 = (TextView) inflate.findViewById(R.id.subtitle);
            aqyg aqygVar6 = awhtVar.c;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            textView6.setText(ajcq.b(aqygVar6));
            TextView textView7 = (TextView) inflate.findViewById(R.id.description);
            aqyg aqygVar7 = awhtVar.d;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            textView7.setText(ajcq.b(aqygVar7));
            this.l.addView(inflate);
        }
        if ((awhvVar.b & 8) == 0) {
            this.o.setVisibility(8);
        } else {
            ajyf ajyfVar = this.p;
            aulq aulqVar = awhvVar.g;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            ajyfVar.b((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), acraVar);
            final int i2 = 1;
            this.p.c = new ajyc(this) { // from class: yfj
                public final /* synthetic */ yfk a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    if (i2 != 0) {
                        this.a.a.run();
                        return;
                    }
                    yfk yfkVar = this.a;
                    yfkVar.d = 1;
                    yfkVar.b.run();
                }
            };
        }
        ajyf ajyfVar2 = this.n;
        aulq aulqVar2 = awhvVar.f;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar3 = awhvVar.f;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ajyfVar2.a(apmgVar, acraVar, this.g);
        this.n.c = new ajyc(this) { // from class: yfj
            public final /* synthetic */ yfk a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i != 0) {
                    this.a.a.run();
                    return;
                }
                yfk yfkVar = this.a;
                yfkVar.d = 1;
                yfkVar.b.run();
            }
        };
        if (awhvVar.h.size() != 0) {
            this.f.d(awhvVar.h, null);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awhv) obj).j.I();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.q.i.size() == 0 || this.d == 1) {
            return;
        }
        this.f.d(this.q.i, null);
    }
}
