package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpn implements aisn {
    public final afvq a;
    public final agof b;
    private final aisn c;
    private final Executor d;
    private final ysy e;

    public agpn(aisn aisnVar, Executor executor, ysy ysyVar, agof agofVar, afvq afvqVar) {
        aisnVar.getClass();
        this.c = aisnVar;
        executor.getClass();
        this.d = executor;
        ysyVar.getClass();
        this.e = ysyVar;
        agofVar.getClass();
        this.b = agofVar;
        this.a = afvqVar;
    }

    @Override // defpackage.aisn
    public final void a(final aism aismVar, final ykl yklVar) {
        if (!this.e.p() || aismVar.a.k()) {
            this.d.execute(new Runnable() { // from class: agpm
                @Override // java.lang.Runnable
                public final void run() {
                    agpn agpnVar = agpn.this;
                    aism aismVar2 = aismVar;
                    ykl yklVar2 = yklVar;
                    try {
                        SubtitleTrack subtitleTrack = aismVar2.a;
                        if (subtitleTrack.e() == null) {
                            agsn a = agpnVar.b.a();
                            ykm c = ykm.c();
                            a.t(subtitleTrack.i(), c);
                            List<SubtitleTrack> list = (List) c.get();
                            if (list != null) {
                                for (SubtitleTrack subtitleTrack2 : list) {
                                    if (subtitleTrack2 != null && TextUtils.equals(subtitleTrack.j(), subtitleTrack2.j()) && TextUtils.equals(subtitleTrack.i(), subtitleTrack2.i())) {
                                        subtitleTrack = subtitleTrack2;
                                        break;
                                    }
                                }
                            }
                            subtitleTrack = null;
                        }
                        if (subtitleTrack == null) {
                            yklVar2.a(aismVar2, new IOException());
                        } else {
                            agpnVar.a.c(new aism(subtitleTrack), yklVar2);
                        }
                    } catch (Exception e) {
                        yklVar2.a(aismVar2, e);
                    }
                }
            });
        } else {
            this.c.a(aismVar, yklVar);
        }
    }

    @Override // defpackage.aisn
    public final void b(aism aismVar, ykl yklVar) {
        this.c.b(aismVar, yklVar);
    }
}
