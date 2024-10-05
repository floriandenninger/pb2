package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahmo implements Runnable {
    final /* synthetic */ SubtitlesStyle a;
    final /* synthetic */ ahmt b;

    public ahmo(ahmt ahmtVar, SubtitlesStyle subtitlesStyle) {
        this.b = ahmtVar;
        this.a = subtitlesStyle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.i(this.a);
    }
}
