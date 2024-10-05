package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krw implements ajom, ftl {
    public apxf a;
    private final Context b;
    private final acra c;
    private final ajjz d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final ftm j;
    private final MetadataHighlightsColumnLinearLayout k;

    public krw(Context context, ViewGroup viewGroup, acra acraVar, ajjz ajjzVar, final aahd aahdVar, ftn ftnVar, fvf fvfVar, byte[] bArr) {
        this.b = context;
        acraVar.getClass();
        this.c = acraVar;
        this.d = ajjzVar;
        this.a = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.metadata_highlights_channel_container, viewGroup, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.channel_container);
        if (findViewById instanceof MetadataHighlightsColumnLinearLayout) {
            this.k = (MetadataHighlightsColumnLinearLayout) findViewById;
        } else {
            this.k = null;
        }
        this.f = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = (TextView) inflate.findViewById(R.id.channel_title);
        this.h = (TextView) inflate.findViewById(R.id.channel_subscribers);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.i = textView;
        ftm a = ftnVar.a(textView, fvfVar.b(inflate.findViewById(R.id.subscription_notification_view)));
        this.j = a;
        a.k(3);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: kru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                krw krwVar = krw.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = krwVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        });
    }

    private final void d(boolean z) {
        if (z) {
            this.i.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background_subscribed);
        } else {
            this.i.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.j.e.remove(this);
        this.j.d();
    }

    @Override // defpackage.ftl
    public final void nV(boolean z, boolean z2) {
        d(z);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqzm aqzmVar = (aqzm) obj;
        this.j.c(this);
        if (this.k != null) {
            Integer num = (Integer) ajokVar.c("ITEM_COUNT");
            int i = R.style.FullscreenEngagementMetadataHighlightsFullWidth;
            if (num != null && num.intValue() > 1) {
                i = R.style.FullscreenEngagementMetadataHighlightsTwoColumn;
            }
            this.k.b(i);
        }
        aqyg aqygVar3 = null;
        this.c.u(new acqx(aqzmVar.h), null);
        if ((aqzmVar.b & 8) != 0) {
            apxfVar = aqzmVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.a = apxfVar;
        TextView textView = this.g;
        if ((aqzmVar.b & 2) != 0) {
            aqygVar = aqzmVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.h;
        if ((aqzmVar.b & 4) != 0) {
            aqygVar2 = aqzmVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        avgg avggVar = aqzmVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (avggVar.c.size() > 0) {
            ajjz ajjzVar = this.d;
            ImageView imageView = this.f;
            avgg avggVar2 = aqzmVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar.h(imageView, avggVar2);
        } else {
            this.d.e(this.f);
            this.f.setImageResource(R.drawable.missing_avatar);
        }
        this.f.setEnabled((aqzmVar.b & 8) != 0);
        this.j.i(null, this.c);
        aulq aulqVar = aqzmVar.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            aulq aulqVar2 = aqzmVar.g;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            auzj auzjVar = (auzj) aulqVar2.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
            if (auzjVar.n) {
                aone builder = auzjVar.toBuilder();
                Context context = this.b;
                if ((aqzmVar.b & 2) != 0 && (aqygVar3 = aqzmVar.d) == null) {
                    aqygVar3 = aqyg.a;
                }
                fkc.p(context, builder, ajcq.b(aqygVar3));
                auzj auzjVar2 = (auzj) builder.build();
                this.j.i(auzjVar2, this.c);
                d(auzjVar2.l);
            }
        }
    }
}
