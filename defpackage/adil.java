package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adil extends adiz {
    static {
        zga.a("MDX.player.defaultLocalPlaybackControl");
    }

    public adil(ypa ypaVar, aioc aiocVar, azrw azrwVar, azrw azrwVar2, adlt adltVar) {
        super(ypaVar, (adja) aiocVar.B(), azrwVar, azrwVar2, adltVar);
    }

    private final void g(adle adleVar) {
        ainy f = f();
        f.getClass();
        ainl e = e();
        e.getClass();
        aifz d = PlaybackStartDescriptor.d();
        d.a = (apxf) aigp.m(adleVar.b, adleVar.e, adleVar.f, (float) TimeUnit.MILLISECONDS.toSeconds(adleVar.c), adleVar.h, adleVar.g).build();
        if (adleVar.b.equals(f.q())) {
            d.i = true;
        }
        PlaybackStartDescriptor a = d.a();
        String.valueOf(String.valueOf(a)).length();
        e.d(a);
    }

    private final boolean h(adle adleVar) {
        ainy f = f();
        f.getClass();
        return !adleVar.h(f.p());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void a(adle adleVar) {
        if ((!adleVar.e() && (f() == null || f().p() == null || f().p().isEmpty())) || !h(adleVar)) {
            f().Z();
        } else {
            g(adleVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void b() {
        f().D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void c(adle adleVar) {
        ainy f = f();
        f.getClass();
        if (adleVar.i(f.q()) && !h(adleVar)) {
            return;
        }
        g(adleVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void d(aibu aibuVar) {
        SubtitleTrack subtitleTrack;
        ainy f = f();
        ainl e = e();
        PlaybackStartDescriptor playbackStartDescriptor = null;
        if (TextUtils.isEmpty(f.q())) {
            subtitleTrack = null;
        } else {
            boolean a = adtt.a(f.p());
            PlaybackStartDescriptor playbackStartDescriptor2 = f.k().a;
            String j = playbackStartDescriptor2 != null ? playbackStartDescriptor2.j() : null;
            String i = playbackStartDescriptor2 != null ? playbackStartDescriptor2.i() : null;
            aixh o = f.o();
            long b = o != null ? o.b() : 0L;
            aifz d = PlaybackStartDescriptor.d();
            d.a = (apxf) aigp.m(f.q(), a ? "" : f.p(), a ? -1 : f.g(), (float) TimeUnit.MILLISECONDS.toSeconds(b), j, i).build();
            d.b(true);
            playbackStartDescriptor = d.a();
            subtitleTrack = f.m();
        }
        f.D();
        if (playbackStartDescriptor != null) {
            String valueOf = String.valueOf(playbackStartDescriptor.l());
            if (valueOf.length() != 0) {
                "Reload video ".concat(valueOf);
            }
            e.d(playbackStartDescriptor);
            if (subtitleTrack != null) {
                f.H(subtitleTrack, false);
            }
        }
    }
}
