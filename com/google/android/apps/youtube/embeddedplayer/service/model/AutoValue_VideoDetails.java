package com.google.android.apps.youtube.embeddedplayer.service.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_VideoDetails extends VideoDetails {
    private final VideoDetailsCollapsed b;
    private final VideoDetailsExpanded c;

    public AutoValue_VideoDetails(VideoDetailsCollapsed videoDetailsCollapsed, VideoDetailsExpanded videoDetailsExpanded) {
        this.b = videoDetailsCollapsed;
        this.c = videoDetailsExpanded;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails
    public final VideoDetailsCollapsed a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails
    public final VideoDetailsExpanded b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoDetails) {
            VideoDetails videoDetails = (VideoDetails) obj;
            if (this.b.equals(videoDetails.a()) && this.c.equals(videoDetails.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
        sb.append("VideoDetails{videoDetailsCollapsed=");
        sb.append(valueOf);
        sb.append(", videoDetailsExpanded=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
