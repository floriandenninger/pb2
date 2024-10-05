package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxv implements ajom {
    private final ajjz a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ajyd g;

    public mxv(Context context, ajjz ajjzVar, ajyg ajygVar, ViewGroup viewGroup) {
        this.a = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_app_promo, viewGroup, false);
        this.b = inflate;
        this.c = (ImageView) inflate.findViewById(R.id.image);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.button);
        this.f = textView;
        this.g = ajygVar.a(textView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.e(this.c);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        awdw awdwVar = (awdw) obj;
        if ((awdwVar.b & 1) == 0) {
            whu.I(this.c, false);
        } else {
            whu.I(this.c, true);
            ajjz ajjzVar = this.a;
            ImageView imageView = this.c;
            avgg avggVar = awdwVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        TextView textView = this.d;
        aqyg aqygVar = awdwVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.e;
        aqyg aqygVar2 = awdwVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        apmh apmhVar = awdwVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            whu.I(this.f, false);
            return;
        }
        whu.I(this.f, true);
        ajyd ajydVar = this.g;
        apmh apmhVar2 = awdwVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        ajydVar.b(apmgVar, ajokVar.a);
    }
}
