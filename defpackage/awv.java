package defpackage;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awv extends AudioTrack.StreamEventCallback {
    final /* synthetic */ aww a;

    public awv(aww awwVar) {
        this.a = awwVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        pse.g(audioTrack == this.a.c.c);
        awx awxVar = this.a.c;
        awe aweVar = awxVar.b;
        if (aweVar == null || !awxVar.d) {
            return;
        }
        aweVar.b();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        pse.g(audioTrack == this.a.c.c);
        awx awxVar = this.a.c;
        awe aweVar = awxVar.b;
        if (aweVar == null || !awxVar.d) {
            return;
        }
        aweVar.b();
    }
}
