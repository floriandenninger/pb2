package defpackage;

import android.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtf implements aaha {
    public static final /* synthetic */ int c = 0;
    private static final ajug d = new iux(1);
    public final zaw a;
    public final acra b;
    private final ajtz e;

    public gtf(zaw zawVar, acra acraVar, gte gteVar) {
        this.a = zawVar;
        this.b = acraVar;
        this.e = gteVar;
    }

    public static void b(final ajoo ajooVar, View view) {
        final int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        final ajon ajonVar = new ajon() { // from class: gta
            @Override // defpackage.ajon
            public final void o(ajom ajomVar, Object obj) {
                int i = integer;
                int i2 = gtf.c;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(i);
                ajomVar.a().startAnimation(alphaAnimation);
            }
        };
        ajooVar.g(ajonVar);
        view.post(new Runnable() { // from class: gtc
            @Override // java.lang.Runnable
            public final void run() {
                ajoo ajooVar2 = ajoo.this;
                ajon ajonVar2 = ajonVar;
                int i = gtf.c;
                ajooVar2.i(ajonVar2);
            }
        });
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ohm ohmVar;
        ajss ajssVar;
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = (RelatedChipEndpoint$RelatedChipCommand) apxfVar.pX(RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand);
        if (relatedChipEndpoint$RelatedChipCommand == null || (ohmVar = (ohm) map.get("sectionController")) == null || (ajssVar = (ajss) map.get("sectionListController")) == null) {
            return;
        }
        View q = ajssVar.q();
        ajoc ajocVar = ajssVar.f;
        if ((q instanceof RecyclerView) && (ajocVar instanceof ajoc)) {
            b(ajssVar.g, q);
            if (relatedChipEndpoint$RelatedChipCommand.b != 3 || !((Boolean) relatedChipEndpoint$RelatedChipCommand.c).booleanValue()) {
                ohmVar.h();
            } else {
                ohmVar.g();
            }
            RecyclerView recyclerView = (RecyclerView) q;
            recyclerView.aa(Math.max(0, ajocVar.j(ohmVar.lC())));
            if (relatedChipEndpoint$RelatedChipCommand.b == 3 && ((Boolean) relatedChipEndpoint$RelatedChipCommand.c).booleanValue()) {
                return;
            }
            aulm aulmVar = relatedChipEndpoint$RelatedChipCommand.b == 1 ? (aulm) ((aqew) relatedChipEndpoint$RelatedChipCommand.c).pX(aulm.b) : null;
            if (aulmVar == null) {
                return;
            }
            this.e.F = new gtd(ohmVar, new gsz(this, ajssVar, recyclerView, map));
            this.e.E = new ajtt() { // from class: gtb
                @Override // defpackage.ajtt
                public final void a(cnq cnqVar, ajce ajceVar) {
                    gtf.this.a.e(cnqVar);
                }
            };
            this.e.ab(ahbj.o(aulmVar), d);
        }
    }
}
