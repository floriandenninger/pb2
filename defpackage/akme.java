package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akme implements ajom {
    public apxf a;
    private final ajut b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public akme(Context context, final akmd akmdVar, ajut ajutVar, final aahd aahdVar) {
        this.b = ajutVar;
        View inflate = View.inflate(context, R.layout.sharing_option_button, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.text);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akme akmeVar = akme.this;
                aahd aahdVar2 = aahdVar;
                akmd akmdVar2 = akmdVar;
                apxf apxfVar = akmeVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
                ((akim) akmdVar2).b.h();
            }
        });
        this.f = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_top_padding);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_bottom_padding);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_right_padding);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_left_padding);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_first_item_top_padding);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_last_item_bottom_padding);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        arfr arfrVar;
        aqyg aqygVar;
        apmg apmgVar = (apmg) obj;
        boolean j = ajokVar.j("isFirstItem", false);
        boolean j2 = ajokVar.j("isLastItem", false);
        if (j) {
            this.c.setPadding(this.h, this.j, this.i, this.f);
        } else if (j2) {
            this.c.setPadding(this.h, this.g, this.i, this.k);
        } else {
            this.c.setPadding(this.h, this.g, this.i, this.f);
        }
        ajut ajutVar = this.b;
        if ((apmgVar.b & 32) != 0) {
            arfs arfsVar = apmgVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfrVar = arfr.b(arfsVar.c);
            if (arfrVar == null) {
                arfrVar = arfr.UNKNOWN;
            }
        } else {
            arfrVar = arfr.UNKNOWN;
        }
        int a = ajutVar.a(arfrVar);
        if (a != 0) {
            this.d.setImageResource(a);
        }
        TextView textView = this.e;
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        apxf apxfVar = apmgVar.p;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.a = apxfVar;
    }
}
