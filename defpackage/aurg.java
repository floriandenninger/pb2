package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aurg implements aonq {
    SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN(0),
    SFV_AUDIO_ITEM_PLAYBACK_STATE_PLAYING(1),
    SFV_AUDIO_ITEM_PLAYBACK_STATE_PAUSED(2),
    SFV_AUDIO_ITEM_PLAYBACK_STATE_STOPPED(3),
    SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING(4);

    public final int f;

    aurg(int i) {
        this.f = i;
    }

    public static aons a() {
        return auqy.c;
    }

    public static aurg b(int i) {
        if (i == 0) {
            return SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN;
        }
        if (i == 1) {
            return SFV_AUDIO_ITEM_PLAYBACK_STATE_PLAYING;
        }
        if (i == 2) {
            return SFV_AUDIO_ITEM_PLAYBACK_STATE_PAUSED;
        }
        if (i == 3) {
            return SFV_AUDIO_ITEM_PLAYBACK_STATE_STOPPED;
        }
        if (i != 4) {
            return null;
        }
        return SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING;
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
