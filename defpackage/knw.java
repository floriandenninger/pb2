package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class knw implements View.OnClickListener {
    final /* synthetic */ SubtitleButtonController a;
    private final Runnable b;

    public knw(SubtitleButtonController subtitleButtonController, Runnable runnable) {
        this.a = subtitleButtonController;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SubtitleButtonController subtitleButtonController = this.a;
        if (subtitleButtonController.d) {
            subtitleButtonController.c.C(new knv(this));
        } else {
            subtitleButtonController.a.c();
        }
        SubtitleButtonController subtitleButtonController2 = this.a;
        if (subtitleButtonController2.g.b(aigk.VIDEO_PLAYBACK_LOADED)) {
            subtitleButtonController2.h.mM().I(3, new acqx(subtitleButtonController2.i), null);
        }
        this.b.run();
    }
}
