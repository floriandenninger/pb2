package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aphz implements aonq {
    BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN(0),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_PLAY_PAUSE(1),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_PREVIOUS_VIDEO(2),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_NEXT_VIDEO(3),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_DISMISS(4),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_BACKWARDS(5),
    BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_FORWARDS(6);

    private final int i;

    aphz(int i) {
        this.i = i;
    }

    public static aons a() {
        return apew.n;
    }

    public static aphz b(int i) {
        switch (i) {
            case 0:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN;
            case 1:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_PLAY_PAUSE;
            case 2:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_PREVIOUS_VIDEO;
            case 3:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_NEXT_VIDEO;
            case 4:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_DISMISS;
            case 5:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_BACKWARDS;
            case 6:
                return BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_FORWARDS;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
