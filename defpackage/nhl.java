package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhl extends ajpc {
    public aowx a;
    ajjv b;
    private final ajjz c;
    private final wzq d;
    private final ajco e;
    private final View f;
    private final ImageView g;
    private final ImageView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;

    public nhl(Context context, ajjz ajjzVar, final wzq wzqVar, final aahd aahdVar) {
        this.c = ajjzVar;
        this.d = wzqVar;
        ajcn a = ajco.a();
        a.a = context;
        a.c = new ajrv(aahdVar);
        this.e = a.a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_item_details_section, (ViewGroup) null, false);
        this.f = inflate;
        this.g = (ImageView) inflate.findViewById(R.id.primary_image);
        this.h = (ImageView) inflate.findViewById(R.id.icon);
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.heading);
        this.k = (TextView) inflate.findViewById(R.id.subheading);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: nhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nhl nhlVar = nhl.this;
                wzq wzqVar2 = wzqVar;
                aahd aahdVar2 = aahdVar;
                aowx aowxVar = nhlVar.a;
                if (aowxVar == null || (aowxVar.b & 32) == 0 || wzqVar2.d(aowxVar)) {
                    return;
                }
                Map g = acrc.g(nhlVar.a);
                apxf apxfVar = nhlVar.a.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, g);
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.b(this.a);
        this.a = null;
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aowx aowxVar = (aowx) obj;
        whu.I(this.f, true);
        if (this.b == null) {
            nhk nhkVar = new nhk(0);
            ajju a = ajjv.a();
            a.d(true);
            a.c = nhkVar;
            this.b = a.a();
        }
        this.a = aowxVar;
        ajjz ajjzVar = this.c;
        ImageView imageView = this.g;
        avgg avggVar = aowxVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.b);
        whu.I(this.g, 1 == (aowxVar.b & 1));
        ajjz ajjzVar2 = this.c;
        ImageView imageView2 = this.h;
        avgg avggVar2 = aowxVar.d;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar2.k(imageView2, avggVar2, this.b);
        whu.I(this.h, (aowxVar.b & 2) != 0);
        TextView textView = this.i;
        aqyg aqygVar3 = null;
        if ((aowxVar.b & 4) != 0) {
            aqygVar = aowxVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.d(aqygVar, this.e));
        TextView textView2 = this.j;
        if ((aowxVar.b & 8) != 0) {
            aqygVar2 = aowxVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.d(aqygVar2, this.e));
        TextView textView3 = this.k;
        if ((aowxVar.b & 16) != 0 && (aqygVar3 = aowxVar.g) == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.d(aqygVar3, this.e));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aowx) obj).i.I();
    }
}
