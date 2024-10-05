package defpackage;

import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kmj implements ayrs {
    public final /* synthetic */ NoSoundMemoOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmj(NoSoundMemoOverlay noSoundMemoOverlay, int i) {
        this.b = i;
        this.a = noSoundMemoOverlay;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b != 0) {
            this.a.g((ahef) obj);
        } else {
            this.a.k();
        }
    }
}
