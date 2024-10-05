package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mos extends kwy {
    private final ajop o;
    private final ajoi p;
    private final TextView q;

    public mos(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, R.layout.grid_narrow_radio_item, ajutVar);
        this.o = gmaVar;
        gmaVar.c(this.c);
        this.p = new ajoi(aahdVar, gmaVar);
        this.q = (TextView) this.c.findViewById(R.id.title);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.o).b;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.p.c();
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        arcq arcqVar = (arcq) obj;
        ajoi ajoiVar = this.p;
        acra acraVar = ajokVar.a;
        apxf apxfVar = arcqVar.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        atdf atdfVar = null;
        ajokVar.a.u(new acqx(arcqVar.l), null);
        aqyg aqygVar4 = arcqVar.e;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        k(ajcq.b(aqygVar4));
        TextView textView = this.q;
        int i = arcqVar.f;
        if (i == 0) {
            i = 1;
        }
        textView.setMaxLines(i);
        if ((arcqVar.b & 64) != 0) {
            aqygVar = arcqVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        d(ajcq.b(aqygVar));
        avgg avggVar = arcqVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        g(avggVar);
        if (m(arcqVar.d)) {
            i(arcqVar.d);
        } else {
            if ((arcqVar.b & 32) != 0) {
                aqygVar2 = arcqVar.h;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            CharSequence b = ajcq.b(aqygVar2);
            if ((arcqVar.b & 16) != 0) {
                aqygVar3 = arcqVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            j(b, ajcq.b(aqygVar3));
        }
        View view = ((gma) this.o).b;
        if ((arcqVar.b & 512) != 0 && (atdfVar = arcqVar.k) == null) {
            atdfVar = atdf.a;
        }
        f(view, atdfVar, arcqVar, ajokVar.a);
        this.o.e(ajokVar);
    }
}
