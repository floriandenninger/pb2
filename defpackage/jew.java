package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxLivestreamMealbarController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jew implements aioa {
    final /* synthetic */ MdxLivestreamMealbarController a;

    public jew(MdxLivestreamMealbarController mdxLivestreamMealbarController) {
        this.a = mdxLivestreamMealbarController;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ao().G().E(ayqr.a()).X(new ayrs() { // from class: jev
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerResponseModel b;
                jew jewVar = jew.this;
                ahdv ahdvVar = (ahdv) obj;
                if (!jewVar.a.j.c().g() && ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED) && (b = ahdvVar.b()) != null && b.C() && jewVar.a.m.g().i() && jewVar.a.c.g() == null && !jewVar.a.k.j().isEmpty()) {
                    aony aonyVar = jewVar.a.f.g;
                    aryx aryxVar = b.a.g;
                    if (aryxVar == null) {
                        aryxVar = aryx.a;
                    }
                    String str = aryxVar.l;
                    if (aonyVar.isEmpty() || aonyVar.contains(str)) {
                        long j = jewVar.a.e.getLong("com.google.android.apps.youtube.mdx.watch.LAST_MEALBAR_PROMOTED_LIVE_FEED_CHANNELS", -1L);
                        long millis = TimeUnit.SECONDS.toMillis(jewVar.a.f.h);
                        if (j == -1 || jewVar.a.i.c() - j >= millis) {
                            final MdxLivestreamMealbarController mdxLivestreamMealbarController = jewVar.a;
                            jeu jeuVar = new jeu(0);
                            final acra mM = mdxLivestreamMealbarController.l.mM();
                            mM.n(new acqx(acrb.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR));
                            mM.n(new acqx(acrb.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_ACTION_BUTTON));
                            mM.n(new acqx(acrb.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_DISMISS_BUTTON));
                            Resources resources = mdxLivestreamMealbarController.a.getResources();
                            akbw akbwVar = mdxLivestreamMealbarController.b;
                            akbx m = akbwVar.m();
                            m.c = resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_title);
                            m.d = resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_detail_text);
                            m.m = jeuVar;
                            akbx c = m.a(resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_connect_button_text), new View.OnClickListener() { // from class: jes
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    MdxLivestreamMealbarController mdxLivestreamMealbarController2 = MdxLivestreamMealbarController.this;
                                    acra acraVar = mM;
                                    bnq a = mdxLivestreamMealbarController2.h.a();
                                    a.aF(mdxLivestreamMealbarController2.g);
                                    a.qh(mdxLivestreamMealbarController2.d, a.getClass().getCanonicalName());
                                    acraVar.I(3, new acqx(acrb.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_ACTION_BUTTON), null);
                                }
                            }).c(resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_dismiss_button_text), new View.OnClickListener() { // from class: jet
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    acra.this.I(3, new acqx(acrb.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_DISMISS_BUTTON), null);
                                }
                            });
                            c.i(false);
                            akbwVar.o(c.e(R.drawable.quantum_ic_youtube_linked_tv_grey600_48).f());
                            jewVar.a.e.edit().putLong("com.google.android.apps.youtube.mdx.watch.LAST_MEALBAR_PROMOTED_LIVE_FEED_CHANNELS", jewVar.a.i.c()).apply();
                        }
                    }
                }
            }
        })};
    }
}
