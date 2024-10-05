package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adix implements adlr {
    final /* synthetic */ adiz a;

    public adix(adiz adizVar) {
        this.a = adizVar;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        this.a.d.c();
        if (adlmVar.n() != null) {
            ayqw ayqwVar = this.a.d;
            aypy d = adlmVar.n().d();
            final adiy adiyVar = this.a.f;
            adiyVar.getClass();
            ayqwVar.d(d.ax(new ayrs() { // from class: adiw
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ainy f = adiy.this.a.f();
                    f.getClass();
                    SubtitleTrack subtitleTrack = (SubtitleTrack) ((Optional) obj).orElse(null);
                    if (amkq.b(subtitleTrack, f.m())) {
                        return;
                    }
                    f.G(subtitleTrack);
                }
            }));
        }
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        this.a.d.c();
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }
}
