package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnifiedSharePanelRendererOuterClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklw implements ajom {
    public final aahd a;
    private final View b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final Context f;
    private final int g;

    public aklw(Context context, aahd aahdVar) {
        View inflate = View.inflate(context, R.layout.share_panel_title_v15, null);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.c = (LinearLayout) inflate.findViewById(R.id.share_panel_title_layout);
        this.e = (TextView) inflate.findViewById(R.id.add_contacts_button);
        this.a = aahdVar;
        this.f = context;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_title_padding);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.setVisibility(8);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        final avmn avmnVar = (avmn) obj;
        TextView textView = this.d;
        aqyg aqygVar2 = null;
        if ((avmnVar.b & 1) != 0) {
            aqygVar = avmnVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.e;
        if ((avmnVar.b & 2) != 0 && (aqygVar2 = avmnVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, aahk.a(aqygVar2, this.a, false));
        this.e.setOnClickListener(new View.OnClickListener() { // from class: aklu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar;
                aklw aklwVar = aklw.this;
                avmn avmnVar2 = avmnVar;
                if (zev.e(view.getContext())) {
                    aqyg aqygVar3 = avmnVar2.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    Iterator it = aqygVar3.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            apxfVar = null;
                            break;
                        }
                        aqyi aqyiVar = (aqyi) it.next();
                        if ((aqyiVar.b & 512) != 0) {
                            apxfVar = aqyiVar.m;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                        }
                    }
                    if (apxfVar != null) {
                        aklwVar.a.c(apxfVar, null);
                    }
                }
            }
        });
        this.e.setMovementMethod(LinkMovementMethod.getInstance());
        this.e.setHighlightColor(0);
        if ((avmnVar.b & 16) != 0) {
            this.c.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            layoutParams.width = -2;
            this.d.setLayoutParams(layoutParams);
            akly a = new aklx(this.f).a();
            this.c.addView(a.a);
            aulq aulqVar = avmnVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            a.d((avmo) aulqVar.pX(UnifiedSharePanelRendererOuterClass.shareStartTimeWithContextRenderer));
        }
        View view = this.b;
        int i = this.g;
        view.setPadding(i, i, i, i);
        akmk.h(this.b);
    }
}
