package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahdy {
    private final SubtitleTrack a;
    private final boolean b;

    public ahdy(SubtitleTrack subtitleTrack) {
        this(subtitleTrack, false);
    }

    public ahdy(SubtitleTrack subtitleTrack, boolean z) {
        this.a = subtitleTrack;
        this.b = z;
    }

    public SubtitleTrack a() {
        return this.a;
    }

    public String b() {
        SubtitleTrack subtitleTrack = this.a;
        return subtitleTrack != null ? subtitleTrack.j() : "-";
    }

    public boolean c() {
        return this.b;
    }
}
