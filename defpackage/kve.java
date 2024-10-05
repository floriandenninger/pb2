package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kve {
    public final amru a;
    public final int b;

    public kve(amru amruVar, int i) {
        if (amruVar == null) {
            throw new NullPointerException("Null playlistPanelVideos");
        }
        this.a = amruVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kve) {
            kve kveVar = (kve) obj;
            if (amkq.aV(this.a, kveVar.a) && this.b == kveVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
        sb.append("PlaylistPanelVideosAndPlaybackPosition{playlistPanelVideos=");
        sb.append(valueOf);
        sb.append(", playbackPosition=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public kve() {
    }
}
