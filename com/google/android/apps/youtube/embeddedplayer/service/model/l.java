package com.google.android.apps.youtube.embeddedplayer.service.model;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class l {
    private VideoDetailsCollapsed a;
    private VideoDetailsExpanded b;

    public final VideoDetails a() {
        VideoDetailsExpanded videoDetailsExpanded;
        VideoDetailsCollapsed videoDetailsCollapsed = this.a;
        if (videoDetailsCollapsed == null || (videoDetailsExpanded = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" videoDetailsCollapsed");
            }
            if (this.b == null) {
                sb.append(" videoDetailsExpanded");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_VideoDetails(videoDetailsCollapsed, videoDetailsExpanded);
    }

    public final void b(VideoDetailsCollapsed videoDetailsCollapsed) {
        if (videoDetailsCollapsed == null) {
            throw new NullPointerException("Null videoDetailsCollapsed");
        }
        this.a = videoDetailsCollapsed;
    }

    public final void c(VideoDetailsExpanded videoDetailsExpanded) {
        if (videoDetailsExpanded == null) {
            throw new NullPointerException("Null videoDetailsExpanded");
        }
        this.b = videoDetailsExpanded;
    }
}
