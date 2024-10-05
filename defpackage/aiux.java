package defpackage;

import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiux extends CaptioningManager.CaptioningChangeListener {
    final /* synthetic */ aiuy a;

    public aiux(aiuy aiuyVar) {
        this.a = aiuyVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        super.onFontScaleChanged(f);
        this.a.c(f);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        super.onUserStyleChanged(captionStyle);
        aiuy aiuyVar = this.a;
        aiuyVar.d(new SubtitlesStyle(captionStyle, aiuyVar.b));
    }
}
