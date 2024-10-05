package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kfo {
    private final ci a;
    private final akbz b;

    public kfo(ci ciVar, akbz akbzVar) {
        this.a = ciVar;
        this.b = akbzVar;
    }

    public final void a() {
        akbz akbzVar = this.b;
        gcm d = gcq.d();
        d.f(true);
        d.k(this.a.getString(R.string.no_subtitles));
        d.d(-1);
        akbzVar.o(d.b());
    }

    public final void b(SubtitleTrack subtitleTrack) {
        if (subtitleTrack == null || subtitleTrack.p()) {
            akbz akbzVar = this.b;
            gcm d = gcq.d();
            d.f(true);
            d.k(this.a.getString(R.string.subtitles_cc_turned_off));
            d.d(-1);
            akbzVar.o(d.b());
            return;
        }
        akbz akbzVar2 = this.b;
        gcm d2 = gcq.d();
        d2.f(true);
        d2.k(this.a.getString(R.string.subtitles_cc_turned_on_with_language, new Object[]{kfn.b(subtitleTrack)}));
        d2.d(-1);
        akbzVar2.o(d2.b());
    }
}
