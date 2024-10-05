package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msk extends ajpc {
    private final Context a;
    private final ajjz b;
    private final ajop c;
    private final ajoi d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ViewGroup k;
    private final ajyf l;

    public msk(Context context, ajjz ajjzVar, ajoy ajoyVar, ajyg ajygVar, gma gmaVar, ViewGroup viewGroup, byte[] bArr) {
        this.a = context;
        this.b = ajjzVar;
        this.c = gmaVar;
        this.d = ajoyVar.c(gmaVar);
        View inflate = LayoutInflater.from(context).inflate(R.layout.premium_season_card_item, viewGroup, false);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.thumbnail_overlay_bottom_panel);
        this.h = (TextView) inflate.findViewById(R.id.thumbnail_bottom_panel);
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.subtitle);
        this.k = (ViewGroup) inflate.findViewById(R.id.bottom_standalone_badges_container);
        this.l = ajygVar.a((TextView) inflate.findViewById(R.id.offer_button));
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        avgg avggVar;
        String str;
        aufa aufaVar = (aufa) obj;
        ajoi ajoiVar = this.d;
        acra acraVar = ajokVar.a;
        aulq aulqVar = null;
        if ((aufaVar.b & 16) != 0) {
            apxfVar = aufaVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajjz ajjzVar = this.b;
        ImageView imageView = this.f;
        if ((aufaVar.b & 1) != 0) {
            avggVar = aufaVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.g;
        aony<avfv> aonyVar = aufaVar.d;
        if (aonyVar == null || aonyVar.isEmpty()) {
            str = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (avfv avfvVar : aonyVar) {
                avfl avflVar = avfvVar.d;
                if (avflVar == null) {
                    avflVar = avfl.a;
                }
                if ((avflVar.b & 1) != 0) {
                    avfl avflVar2 = avfvVar.d;
                    if (avflVar2 == null) {
                        avflVar2 = avfl.a;
                    }
                    aqyg aqygVar = avflVar2.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    arrayList.add(ajcq.b(aqygVar));
                }
            }
            str = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        whu.G(textView, str);
        TextView textView2 = this.h;
        aqyg aqygVar2 = aufaVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.i;
        aqyg aqygVar3 = aufaVar.f;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        TextView textView4 = this.j;
        aqyg aqygVar4 = aufaVar.g;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        whu.G(textView4, ajcq.b(aqygVar4));
        gae.e(this.a, this.k, aufaVar.h);
        ViewGroup viewGroup = this.k;
        whu.I(viewGroup, viewGroup.getChildCount() > 0);
        if ((aufaVar.b & 64) != 0 && (aulqVar = aufaVar.j) == null) {
            aulqVar = aulq.a;
        }
        this.l.b((apmg) ammv.i(aulqVar).b(mjy.d).f(), ajokVar.a);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aufa) obj).k.I();
    }
}
