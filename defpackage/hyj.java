package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyj implements aaha {
    private final ci a;
    private final iat b;
    private final aahd c;

    public hyj(ci ciVar, iat iatVar, aahd aahdVar) {
        this.a = ciVar;
        this.b = iatVar;
        this.c = aahdVar;
    }

    private static acra b(Map map) {
        if (map == null) {
            return acra.l;
        }
        return map.get("com.google.android.libraries.youtube.logging.interaction_logger") instanceof acra ? (acra) map.get("com.google.android.libraries.youtube.logging.interaction_logger") : acra.l;
    }

    private final void c(VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction, acra acraVar, ammv ammvVar, ammv ammvVar2) {
        aqds aqdsVar = videoSelectedActionOuterClass$VideoSelectedAction.d;
        if (aqdsVar == null) {
            aqdsVar = aqds.a;
        }
        if ((aqdsVar.b & 1) == 0) {
            whu.K(this.a, R.string.reel_generic_error_message, 0);
            return;
        }
        aqds aqdsVar2 = videoSelectedActionOuterClass$VideoSelectedAction.d;
        if (aqdsVar2 == null) {
            aqdsVar2 = aqds.a;
        }
        aqdt aqdtVar = aqdsVar2.c;
        if (aqdtVar == null) {
            aqdtVar = aqdt.a;
        }
        acraVar.D(new acqx(aqdtVar.n));
        aone builder = aqdtVar.toBuilder();
        aqyg aqygVar = aqdtVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aqyg aqygVar2 = (aqyg) ammvVar.e(aqygVar);
        builder.copyOnWrite();
        aqdt aqdtVar2 = (aqdt) builder.instance;
        aqdtVar2.c = aqygVar2;
        aqdtVar2.b |= 1;
        aqyg aqygVar3 = (aqyg) ammvVar2.e((aqyg) aqdtVar.g.get(0));
        builder.copyOnWrite();
        aqdt aqdtVar3 = (aqdt) builder.instance;
        aqdtVar3.a();
        aqdtVar3.g.set(0, aqygVar3);
        ajdf.n(this.a, (aqdt) builder.build(), this.c, acraVar, new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ce ceVar;
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = (VideoSelectedActionOuterClass$VideoSelectedAction) apxfVar.pX(VideoSelectedActionOuterClass$VideoSelectedAction.videoSelectedAction);
        if (!this.b.a(videoSelectedActionOuterClass$VideoSelectedAction)) {
            c(videoSelectedActionOuterClass$VideoSelectedAction, b(map), ammv.j(this.b.e(this.a)), amlr.a);
            return;
        }
        dd supportFragmentManager = this.a.getSupportFragmentManager();
        if (supportFragmentManager.e(R.id.reel_creation_container) != null) {
            ceVar = supportFragmentManager.e(R.id.reel_creation_container);
        } else {
            ceVar = supportFragmentManager.f("creation_fragment");
        }
        bue e = ceVar.mN().e(R.id.reel_container);
        if (e instanceof ias) {
            ias iasVar = (ias) e;
            if (videoSelectedActionOuterClass$VideoSelectedAction.c && !iasVar.bl()) {
                c(videoSelectedActionOuterClass$VideoSelectedAction, b(map), amlr.a, ammv.j(iasVar.aW()));
                return;
            }
        }
        if (ceVar instanceof ibp) {
            ce f = supportFragmentManager.f("reels_video_picker_fragment");
            if (f != null) {
                dn k = supportFragmentManager.k();
                k.m(f);
                k.a();
            }
            ibq q = ((ibp) ceVar).q();
            aulq aulqVar = videoSelectedActionOuterClass$VideoSelectedAction.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                if (!q.d.a(videoSelectedActionOuterClass$VideoSelectedAction)) {
                    aqds aqdsVar = videoSelectedActionOuterClass$VideoSelectedAction.d;
                    if (aqdsVar == null) {
                        aqdsVar = aqds.a;
                    }
                    if ((aqdsVar.b & 1) == 0) {
                        whu.K(q.a, R.string.reel_generic_error_message, 0);
                        return;
                    }
                    aqds aqdsVar2 = videoSelectedActionOuterClass$VideoSelectedAction.d;
                    if (aqdsVar2 == null) {
                        aqdsVar2 = aqds.a;
                    }
                    aqdt aqdtVar = aqdsVar2.c;
                    if (aqdtVar == null) {
                        aqdtVar = aqdt.a;
                    }
                    q.g.D(new acqx(aqdtVar.n));
                    aone builder = aqdtVar.toBuilder();
                    aqyg e2 = q.d.e(q.a);
                    builder.copyOnWrite();
                    aqdt aqdtVar2 = (aqdt) builder.instance;
                    e2.getClass();
                    aqdtVar2.c = e2;
                    aqdtVar2.b |= 1;
                    ajdf.n(q.a, (aqdt) builder.build(), q.f, q.g, new Object());
                    return;
                }
                aulq aulqVar2 = videoSelectedActionOuterClass$VideoSelectedAction.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aukq aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                View inflate = LayoutInflater.from(q.a).inflate(R.layout.video_sticker, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.duration);
                if ((aukqVar.b & 4) != 0) {
                    aqyg aqygVar = aukqVar.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    textView.setText(ajcq.b(aqygVar));
                    textView.setVisibility(0);
                }
                if ((aukqVar.b & 1) != 0) {
                    TextView textView2 = (TextView) inflate.findViewById(R.id.video_title_text);
                    aqyg aqygVar2 = aukqVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    textView2.setText(ajcq.b(aqygVar2));
                    textView2.setVisibility(0);
                }
                if ((aukqVar.b & 2) != 0) {
                    TextView textView3 = (TextView) inflate.findViewById(R.id.video_channel_text);
                    aqyg aqygVar3 = aukqVar.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    textView3.setText(ajcq.b(aqygVar3));
                    textView3.setVisibility(0);
                }
                ajjz ajjzVar = q.c;
                avgg avggVar = aukqVar.f;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajjzVar.a(ahbw.C(avggVar, 320, 180), new ibo(q, inflate, videoSelectedActionOuterClass$VideoSelectedAction));
            }
        }
    }
}
