package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhr implements fli {
    private final String a;
    private final long b;
    private final aaea c;

    public mhr(ainy ainyVar, aaea aaeaVar) {
        this.a = ainyVar.q();
        this.b = ainyVar.n() == null ? 0L : ainyVar.n().b();
        this.c = aaeaVar;
    }

    @Override // defpackage.fli
    public final void a(PlaybackStartDescriptor playbackStartDescriptor) {
        String str = this.a;
        if (str == null || !str.equals(playbackStartDescriptor.l()) || this.b - playbackStartDescriptor.c() <= evr.t(this.c)) {
            return;
        }
        playbackStartDescriptor.q(this.b);
    }
}
