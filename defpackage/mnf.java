package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnf {
    public final ViewGroup a;
    public final ajjz b;
    public final int c;
    final ImageView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final ImageView h;
    final gno i;
    final fyl j;
    final /* synthetic */ mng k;
    public final aadw l;

    public mnf(mng mngVar, final Context context, ajjz ajjzVar, aadw aadwVar, boolean z) {
        this.k = mngVar;
        this.b = ajjzVar;
        this.l = aadwVar;
        if (!yjk.aa(context) || !evr.aN(aadwVar)) {
            this.a = (RelativeLayout) View.inflate(context, R.layout.compact_promoted_item, null);
        } else {
            this.a = (LinearLayout) View.inflate(context, R.layout.compact_promoted_item_linear_feed_tablet, null);
        }
        this.d = (ImageView) this.a.findViewById(R.id.thumbnail);
        this.e = (TextView) this.a.findViewById(R.id.title);
        this.f = (TextView) this.a.findViewById(R.id.subtitle);
        TextView textView = (TextView) this.a.findViewById(R.id.button);
        this.g = textView;
        this.i = mngVar.k.h(textView);
        ImageView imageView = (ImageView) this.a.findViewById(R.id.dismiss_button);
        this.h = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mnf mnfVar = mnf.this;
                apmh apmhVar = mnfVar.k.e.j;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                if ((apmgVar.b & 8192) != 0) {
                    mng mngVar2 = mnfVar.k;
                    aahd aahdVar = mngVar2.b;
                    apmh apmhVar2 = mngVar2.e.j;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar2.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    apxf apxfVar = apmgVar2.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, acrc.g(mnfVar.k.e));
                } else {
                    mng mngVar3 = mnfVar.k;
                    aqcm aqcmVar = mngVar3.e;
                    if ((aqcmVar.b & 256) != 0) {
                        aahd aahdVar2 = mngVar3.b;
                        apxf apxfVar2 = aqcmVar.k;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, acrc.g(mnfVar.k.e));
                    }
                }
                mng mngVar4 = mnfVar.k;
                mngVar4.f = true;
                mnf mnfVar2 = mngVar4.h;
                if (mnfVar2 != null) {
                    mnfVar2.a.setVisibility(8);
                }
                mnf mnfVar3 = mngVar4.g;
                if (mnfVar3 != null) {
                    mnfVar3.a.setVisibility(8);
                }
            }
        });
        this.c = context.getResources().getDimensionPixelSize(R.dimen.slight_start_end_padding);
        fyl fylVar = new fyl(wbs.W(context, R.attr.yt10PercentLayer).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.j = fylVar;
        if (z) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: mne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mnf mnfVar = mnf.this;
                    Context context2 = context;
                    if (mnfVar.k.d.o()) {
                        mng mngVar2 = mnfVar.k;
                        aahd aahdVar = mngVar2.b;
                        apmh apmhVar = mngVar2.e.i;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        apxf apxfVar = apmgVar.p;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, acrc.g(mnfVar.k.e));
                        return;
                    }
                    gcl gclVar = mnfVar.k.j;
                    gcm d = gcq.d();
                    d.k(context2.getResources().getString(R.string.habanero_entry_point_offline_message));
                    gclVar.j(d.b());
                }
            });
            fylVar.e(false);
        }
    }
}
