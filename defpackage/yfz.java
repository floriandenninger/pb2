package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfz extends ajpc {
    final ImageView a;
    final TextView b;
    final TextView c;
    final int d;
    final int e;
    final int f;
    private final ajjz g;
    private final aahd h;
    private final ajop i;
    private final ajtf j;

    public yfz(Context context, ajjz ajjzVar, aahd aahdVar, yfw yfwVar, ajtd ajtdVar) {
        this.g = ajjzVar;
        this.h = aahdVar;
        this.i = yfwVar;
        int orElse = wbs.W(context, R.attr.ytTextPrimary).orElse(0);
        this.d = orElse;
        int orElse2 = wbs.W(context, R.attr.ytTextSecondary).orElse(0);
        this.e = orElse2;
        int orElse3 = wbs.W(context, R.attr.ytStaticBlue).orElse(0);
        this.f = orElse3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_key_promo_small_feature_item, (ViewGroup) null);
        this.a = (ImageView) inflate.findViewById(R.id.icon);
        TextView textView = (TextView) inflate.findViewById(R.id.header);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.description);
        this.c = textView2;
        ajte ajteVar = ajtdVar.a;
        ajteVar.a = textView;
        ajteVar.g(orElse);
        ajteVar.b = textView2;
        ajteVar.e(orElse2);
        ajteVar.d(orElse3);
        this.j = ajteVar.a();
        yfwVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((yfw) this.i).a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        atke atkeVar = (atke) obj;
        this.a.setVisibility(1 != (atkeVar.b & 1) ? 8 : 0);
        ajjz ajjzVar = this.g;
        ImageView imageView = this.a;
        avgg avggVar = atkeVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.b;
        aqyg aqygVar2 = atkeVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar2));
        TextView textView2 = this.c;
        apkv apkvVar = null;
        if ((atkeVar.b & 4) != 0) {
            aqygVar = atkeVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView2, aahk.a(aqygVar, this.h, false));
        ajtf ajtfVar = this.j;
        if ((atkeVar.b & 8) != 0) {
            atkd atkdVar = atkeVar.f;
            if (atkdVar == null) {
                atkdVar = atkd.a;
            }
            if (atkdVar.b == 118483990) {
                apkvVar = (apkv) atkdVar.c;
            } else {
                apkvVar = apkv.a;
            }
        }
        ajtfVar.a(apkvVar);
        this.i.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atke) obj).g.I();
    }
}
