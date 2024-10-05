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
public final class fwt extends ajpc {
    private final ajop a;
    private final ajjz b;
    private final ajoi c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ajyf i;
    private final int j;

    public fwt(Context context, ViewGroup viewGroup, gma gmaVar, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar) {
        this.a = gmaVar;
        this.b = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_tvfilm_entry_point_item, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.action_button);
        this.h = textView;
        this.i = ajygVar.a(textView);
        gmaVar.c(inflate);
        this.c = new ajoi(aahdVar, gmaVar);
        this.j = yjk.K(context.getResources().getDisplayMetrics(), 8);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        aqcy aqcyVar = (aqcy) obj;
        ajjz ajjzVar = this.b;
        ImageView imageView = this.e;
        avgg avggVar = aqcyVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.f;
        if ((aqcyVar.b & 2) != 0) {
            aqygVar = aqcyVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.g;
        if ((aqcyVar.b & 4) != 0) {
            aqygVar2 = aqcyVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if ((aqcyVar.b & 8) != 0) {
            aulq aulqVar = aqcyVar.f;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        this.i.b(apmgVar, ajokVar.a);
        if ((aqcyVar.b & 16) != 0) {
            ajoi ajoiVar = this.c;
            acra acraVar = ajokVar.a;
            apxf apxfVar = aqcyVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            ajoiVar.a(acraVar, apxfVar, ajokVar.e());
            whu.E(this.d, null);
            this.h.setClickable(false);
        }
        yny.z(this.d, yny.k(this.j), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcy) obj).h.I();
    }
}
