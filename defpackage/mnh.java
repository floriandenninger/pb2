package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnh extends kwy {
    private final ajop o;
    private final ajoi p;

    public mnh(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, R.layout.compact_radio_item, ajutVar);
        this.o = gmaVar;
        gmaVar.c(this.c);
        this.p = new ajoi(aahdVar, gmaVar);
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
        apxf apxfVar;
        aqyg aqygVar;
        aqcp aqcpVar = (aqcp) obj;
        ajoi ajoiVar = this.p;
        acra acraVar = ajokVar.a;
        aqyg aqygVar2 = null;
        if ((aqcpVar.b & 16) != 0) {
            apxfVar = aqcpVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajokVar.a.u(new acqx(aqcpVar.k), null);
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.b.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        if ((aqcpVar.b & 4) != 0) {
            aqygVar = aqcpVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((aqcpVar.b & 1024) != 0 && (aqygVar2 = aqcpVar.j) == null) {
            aqygVar2 = aqyg.a;
        }
        d(ajcq.b(aqygVar2));
        avgg avggVar = aqcpVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        g(avggVar);
        List list = aqcpVar.e;
        if (m(list)) {
            i(list);
        } else {
            aqyg aqygVar3 = aqcpVar.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            CharSequence b = ajcq.b(aqygVar3);
            aqyg aqygVar4 = aqcpVar.h;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            j(b, ajcq.b(aqygVar4));
        }
        View view = ((gma) this.o).b;
        atdf atdfVar = aqcpVar.g;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        f(view, atdfVar, aqcpVar, ajokVar.a);
        this.o.e(ajokVar);
    }
}
