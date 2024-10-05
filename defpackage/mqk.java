package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqk implements ajom {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ajyf d;

    public mqk(Context context, ajyg ajygVar, ajyc ajycVar) {
        View inflate = View.inflate(context, R.layout.menu_title, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        TextView textView = (TextView) inflate.findViewById(R.id.button);
        this.c = textView;
        ajyf a = ajygVar.a(textView);
        this.d = a;
        a.g();
        a.c = ajycVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        atdh atdhVar = (atdh) obj;
        TextView textView = this.b;
        if ((atdhVar.b & 1) != 0) {
            aqygVar = atdhVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        aulq aulqVar = atdhVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            this.c.setVisibility(0);
            this.d.e(R.dimen.menu_title_button_icon_padding);
            ajyf ajyfVar = this.d;
            aulq aulqVar2 = atdhVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            ajyfVar.b((apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer), ajokVar.a);
            return;
        }
        this.c.setVisibility(8);
    }
}
