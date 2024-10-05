package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atxl implements aonq {
    PLAYBACK_INTERRUPTION_TYPE_UNKNOWN(0),
    PLAYBACK_INTERRUPTION_TYPE_AUDIO_BECOMING_NOISY(1),
    PLAYBACK_INTERRUPTION_TYPE_POOR_NETWORK(2),
    PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION(3),
    PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED(4);

    public final int f;

    atxl(int i) {
        this.f = i;
    }

    public static aons a() {
        return atxj.e;
    }

    public static atxl b(int i) {
        if (i == 0) {
            return PLAYBACK_INTERRUPTION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PLAYBACK_INTERRUPTION_TYPE_AUDIO_BECOMING_NOISY;
        }
        if (i == 2) {
            return PLAYBACK_INTERRUPTION_TYPE_POOR_NETWORK;
        }
        if (i == 3) {
            return PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION;
        }
        if (i != 4) {
            return null;
        }
        return PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
