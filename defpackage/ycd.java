package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycd implements ajom {
    public final View a;
    private final ajyg b;
    private final LayoutInflater c;
    private final TextView d;
    private final TextView e;
    private final ViewGroup f;

    public ycd(Context context, ajyg ajygVar, ViewGroup viewGroup) {
        this.b = ajygVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.c = from;
        View inflate = from.inflate(R.layout.offer_group_layout, viewGroup, false);
        this.a = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = (ViewGroup) inflate.findViewById(R.id.offers_container);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.removeAllViews();
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, avks avksVar) {
        TextView textView = this.d;
        aqyg aqygVar = avksVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.e;
        aqyg aqygVar2 = avksVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        for (aulq aulqVar : avksVar.d) {
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                TextView textView3 = (TextView) this.c.inflate(R.layout.offer_button, this.f, false);
                this.b.a(textView3).b((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), ajokVar.a);
                this.f.addView(textView3);
            }
        }
    }
}
