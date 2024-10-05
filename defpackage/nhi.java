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
public final class nhi extends ajpc {
    public aowh a;
    private final ajjz b;
    private final wzq c;
    private final ajco d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private ajjv h;

    public nhi(Context context, ajjz ajjzVar, final wzq wzqVar, final aahd aahdVar) {
        this.b = ajjzVar;
        this.c = wzqVar;
        ajcn a = ajco.a();
        a.a = context;
        a.c = new ajrv(aahdVar);
        this.d = a.a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_clickable_icon_section, (ViewGroup) null, false);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.icon);
        this.g = (TextView) inflate.findViewById(R.id.text);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: nhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nhi nhiVar = nhi.this;
                wzq wzqVar2 = wzqVar;
                aahd aahdVar2 = aahdVar;
                aowh aowhVar = nhiVar.a;
                if (aowhVar == null || (aowhVar.b & 4) == 0 || wzqVar2.d(aowhVar)) {
                    return;
                }
                Map g = acrc.g(nhiVar.a);
                apxf apxfVar = nhiVar.a.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, g);
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.b(this.a);
        this.a = null;
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aowh aowhVar = (aowh) obj;
        this.a = aowhVar;
        whu.I(this.e, true);
        if (this.h == null) {
            nhk nhkVar = new nhk(1);
            ajju a = ajjv.a();
            a.d(true);
            a.c = nhkVar;
            this.h = a.a();
        }
        ajjz ajjzVar = this.b;
        ImageView imageView = this.f;
        avgg avggVar = aowhVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.h);
        whu.I(this.f, 1 == (aowhVar.b & 1));
        TextView textView = this.g;
        if ((aowhVar.b & 2) != 0) {
            aqygVar = aowhVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.d(aqygVar, this.d));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aowh) obj).f.I();
    }
}
