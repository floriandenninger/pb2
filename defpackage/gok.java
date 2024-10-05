package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gok {
    public final arhn a;
    public final aric b;
    public final arhr c;
    public final arib d;

    public gok() {
    }

    public gok(arhn arhnVar, aric aricVar, arhr arhrVar, arib aribVar) {
        this.a = arhnVar;
        this.b = aricVar;
        this.c = arhrVar;
        this.d = aribVar;
    }

    public static goj a() {
        goj gojVar = new goj();
        gojVar.b(arhn.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN);
        gojVar.e(aric.INLINE_SCRUBBING_UI_STYLE_UNKNOWN);
        gojVar.c(arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN);
        gojVar.d(arib.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN);
        return gojVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gok) {
            gok gokVar = (gok) obj;
            if (this.a.equals(gokVar.a) && this.b.equals(gokVar.b) && this.c.equals(gokVar.c) && this.d.equals(gokVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 144 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("InlinePlaybackControlsConfig{inlineAudioControlUIStyle=");
        sb.append(valueOf);
        sb.append(", inlineScrubbingUIStyle=");
        sb.append(valueOf2);
        sb.append(", inlinePlaybackFullScreenUIStyle=");
        sb.append(valueOf3);
        sb.append(", inlinePlaybackTriggerStyle=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
