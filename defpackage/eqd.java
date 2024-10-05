package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eqd implements View.OnClickListener {
    final /* synthetic */ eqf a;

    public eqd(eqf eqfVar) {
        this.a = eqfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aptf a = eqf.a(this.a.d);
        if (a != null) {
            eqf eqfVar = this.a;
            aqyg aqygVar5 = null;
            if (eqfVar.f == null) {
                eqfVar.g = View.inflate(eqfVar.a, R.layout.channel_offer_dialog, null);
                eqfVar.h = (ImageView) eqfVar.g.findViewById(R.id.thumbnail);
                eqfVar.i = (TextView) eqfVar.g.findViewById(R.id.header);
                eqfVar.j = (TextView) eqfVar.g.findViewById(R.id.title);
                eqfVar.k = (TextView) eqfVar.g.findViewById(R.id.subtitle);
                eqfVar.l = (TextView) eqfVar.g.findViewById(R.id.prices);
                eqfVar.m = (TextView) eqfVar.g.findViewById(R.id.additional_info);
                eqfVar.f = new AlertDialog.Builder(eqfVar.a).setTitle(eqfVar.a.getString(R.string.more_offers)).setView(eqfVar.g).setNegativeButton(R.string.dismiss, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.visit_channel, new eqe(eqfVar)).create();
            }
            eqfVar.e = a;
            TextView textView = eqfVar.i;
            if ((a.b & 1) != 0) {
                aqygVar = a.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = eqfVar.j;
            if ((a.b & 4) != 0) {
                aqygVar2 = a.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            ajjz ajjzVar = eqfVar.b;
            ImageView imageView = eqfVar.h;
            avgg avggVar = a.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.k(imageView, avggVar, ajjv.b);
            TextView textView3 = eqfVar.k;
            if ((a.b & 8) != 0) {
                aqygVar3 = a.f;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            whu.G(textView3, ajcq.b(aqygVar3));
            TextView textView4 = eqfVar.l;
            if ((a.b & 16) != 0) {
                aqygVar4 = a.g;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            whu.G(textView4, ajcq.b(aqygVar4));
            TextView textView5 = eqfVar.m;
            if ((a.b & 32) != 0 && (aqygVar5 = a.h) == null) {
                aqygVar5 = aqyg.a;
            }
            whu.G(textView5, ajcq.b(aqygVar5));
            eqfVar.f.show();
        }
    }
}
