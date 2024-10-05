package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msm extends ajpc {
    protected final RelativeLayout a;
    private final ajjz b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final View f;
    private final ajuw g;
    private final ImageView h;
    private final ajop i;
    private final ajoi j;

    public msm(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar) {
        this.j = new ajoi(aahdVar, gmaVar);
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.i = gmaVar;
        this.g = ajuwVar;
        RelativeLayout relativeLayout = (RelativeLayout) View.inflate(context, R.layout.purchase_item, null);
        this.a = relativeLayout;
        this.c = (TextView) relativeLayout.findViewById(R.id.title);
        this.d = (TextView) relativeLayout.findViewById(R.id.price);
        this.e = (TextView) relativeLayout.findViewById(R.id.free_trial_text);
        this.h = (ImageView) relativeLayout.findViewById(R.id.thumbnail);
        this.f = relativeLayout.findViewById(R.id.contextual_menu_anchor);
        gmaVar.c(relativeLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.i).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.j.c();
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        auig auigVar = (auig) obj;
        ajoi ajoiVar = this.j;
        acra acraVar = ajokVar.a;
        atdc atdcVar = null;
        if ((auigVar.b & 8) != 0) {
            apxfVar = auigVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        TextView textView = this.c;
        if ((auigVar.b & 2) != 0) {
            aqygVar = auigVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((auigVar.b & 4) != 0) {
            aqygVar2 = auigVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.e;
        if ((auigVar.b & 32) != 0) {
            aqygVar3 = auigVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        if ((auigVar.b & 1) == 0) {
            this.b.e(this.h);
        } else {
            ajjz ajjzVar = this.b;
            ImageView imageView = this.h;
            avgg avggVar = auigVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        this.f.setVisibility(0);
        ajuw ajuwVar = this.g;
        View view = ((gma) this.i).b;
        View view2 = this.f;
        atdf atdfVar = auigVar.h;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = auigVar.h;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        }
        ajuwVar.e(view, view2, atdcVar, auigVar, ajokVar.a);
        this.i.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auig) obj).i.I();
    }
}
