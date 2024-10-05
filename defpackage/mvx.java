package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvx extends ajpc {
    private final View a;
    private final TextView b;
    private final ViewGroup c;
    private final fte d;
    private ftd e;

    public mvx(Context context, fte fteVar) {
        this.d = fteVar;
        View inflate = View.inflate(context, R.layout.sort_filter_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (ViewGroup) inflate.findViewById(R.id.sort_filter_sub_menu_container);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.removeAllViews();
        ftd ftdVar = this.e;
        if (ftdVar != null) {
            ftdVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        auwf auwfVar = (auwf) obj;
        TextView textView = this.b;
        auwh auwhVar = null;
        if ((auwfVar.b & 1) != 0) {
            aqygVar = auwfVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        aulq aulqVar = auwfVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer)) {
            aulq aulqVar2 = auwfVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            auwhVar = (auwh) aulqVar2.pX(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
        }
        if (auwhVar != null) {
            if (this.e == null) {
                this.e = this.d.b(this.c);
            }
            this.c.addView(this.e.c);
            this.e.oB(ajokVar, auwhVar);
        }
        whu.I(this.c, auwhVar != null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auwf) obj).e.I();
    }
}
