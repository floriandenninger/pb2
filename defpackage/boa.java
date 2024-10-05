package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boa extends gy {
    final /* synthetic */ bof d;

    public boa(bof bofVar) {
        this.d = bofVar;
    }

    @Override // defpackage.gy
    public final void b(PlaybackStateCompat playbackStateCompat) {
        bof bofVar = this.d;
        bofVar.E = playbackStateCompat;
        bofVar.o(false);
    }

    @Override // defpackage.gy
    public final void c() {
        bof bofVar = this.d;
        hd hdVar = bofVar.C;
        if (hdVar != null) {
            hdVar.e(bofVar.D);
            this.d.C = null;
        }
    }

    @Override // defpackage.gy
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        this.d.F = mediaMetadataCompat == null ? null : mediaMetadataCompat.b();
        this.d.p();
        this.d.o(false);
    }
}
