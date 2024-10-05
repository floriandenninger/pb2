package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ainx {
    final /* synthetic */ ainy a;

    public ainx(ainy ainyVar) {
        this.a = ainyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        yjk.f();
        this.a.q.c();
        if (z) {
            this.a.o.b();
            this.a.n.d();
        }
        aiwk aiwkVar = this.a.p.a;
        if (aiwkVar == null || !aiwkVar.X(playbackStartDescriptor, aigdVar)) {
            this.a.r.e(playbackStartDescriptor, aigdVar);
        }
    }
}
