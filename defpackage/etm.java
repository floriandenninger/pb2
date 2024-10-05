package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class etm extends frc {
    final /* synthetic */ eto a;
    private final fvd f;
    private final ftm g;
    private final ajoi h;
    private final View i;
    private boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etm(eto etoVar) {
        super(etoVar.a, etoVar.b, R.layout.grid_channel_item);
        this.a = etoVar;
        this.h = etoVar.f.c(etoVar.c);
        this.i = this.b.findViewById(R.id.channel_subscribe_button_container);
        TextView textView = (TextView) this.b.findViewById(R.id.subscribe_button);
        fvd b = etoVar.g.b(this.b.findViewById(R.id.subscription_notification_view));
        this.f = b;
        this.g = etoVar.e.a(textView, b);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.c();
        this.g.d();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        auzj auzjVar;
        View a;
        arcl arclVar = (arcl) obj;
        apxf apxfVar = null;
        if ((arclVar.b & 4) != 0) {
            aqygVar = arclVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        f(ajcq.b(aqygVar));
        if ((arclVar.b & 8) != 0) {
            aqygVar2 = arclVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(this.d, ajcq.b(aqygVar2));
        if ((arclVar.b & 16) != 0) {
            aqygVar3 = arclVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        e(ajcq.b(aqygVar3));
        avgg avggVar = arclVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        d(avggVar);
        arcm arcmVar = arclVar.j;
        if (arcmVar == null) {
            arcmVar = arcm.a;
        }
        if (arcmVar.b == 55419609) {
            arcm arcmVar2 = arclVar.j;
            if (arcmVar2 == null) {
                arcmVar2 = arcm.a;
            }
            if (arcmVar2.b == 55419609) {
                auzjVar = (auzj) arcmVar2.c;
            } else {
                auzjVar = auzj.a;
            }
        } else {
            auzjVar = null;
        }
        acra acraVar = ajokVar.a;
        if (auzjVar != null) {
            auzjVar = (auzj) fkc.o(this.a.a, auzjVar.toBuilder(), this.c.getText()).build();
        }
        this.g.i(auzjVar, acraVar);
        if (!this.j && (a = this.f.a()) != null) {
            int dimensionPixelOffset = this.a.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
            int dimensionPixelOffset2 = this.a.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
            a.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            this.j = true;
        }
        whu.I(this.i, true);
        ajoi ajoiVar = this.h;
        acra acraVar2 = ajokVar.a;
        if ((arclVar.b & 128) != 0 && (apxfVar = arclVar.i) == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar2, apxfVar, ajokVar.e());
    }
}
