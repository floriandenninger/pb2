package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apae implements aonq {
    SLOT_TYPE_UNSPECIFIED(0),
    SLOT_TYPE_PLAYER_BYTES(1),
    SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM(14),
    SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER(15),
    SLOT_TYPE_BELOW_PLAYER(2),
    SLOT_TYPE_IN_PLAYER(3),
    SLOT_TYPE_FORECASTING(4),
    SLOT_TYPE_FULLSCREEN_ENGAGEMENT(5),
    SLOT_TYPE_ABOVE_FEED(6),
    SLOT_TYPE_LOCKSCREEN(7),
    SLOT_TYPE_FIXED_FOOTER(8),
    SLOT_TYPE_BELOW_PLAYER_IMMERSIVE(9),
    SLOT_TYPE_AD_BREAK_REQUEST(10),
    SLOT_TYPE_PLAYBACK_TRACKING(11),
    SLOT_TYPE_IN_FEED(12),
    SLOT_TYPE_PAGE_TOP(13),
    SLOT_TYPE_ADS_WATCH_NEXT_REQUEST(16);

    public final int r;

    apae(int i) {
        this.r = i;
    }

    public static aons a() {
        return apaf.b;
    }

    public static apae b(int i) {
        switch (i) {
            case 0:
                return SLOT_TYPE_UNSPECIFIED;
            case 1:
                return SLOT_TYPE_PLAYER_BYTES;
            case 2:
                return SLOT_TYPE_BELOW_PLAYER;
            case 3:
                return SLOT_TYPE_IN_PLAYER;
            case 4:
                return SLOT_TYPE_FORECASTING;
            case 5:
                return SLOT_TYPE_FULLSCREEN_ENGAGEMENT;
            case 6:
                return SLOT_TYPE_ABOVE_FEED;
            case 7:
                return SLOT_TYPE_LOCKSCREEN;
            case 8:
                return SLOT_TYPE_FIXED_FOOTER;
            case 9:
                return SLOT_TYPE_BELOW_PLAYER_IMMERSIVE;
            case 10:
                return SLOT_TYPE_AD_BREAK_REQUEST;
            case 11:
                return SLOT_TYPE_PLAYBACK_TRACKING;
            case 12:
                return SLOT_TYPE_IN_FEED;
            case 13:
                return SLOT_TYPE_PAGE_TOP;
            case 14:
                return SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM;
            case 15:
                return SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER;
            case 16:
                return SLOT_TYPE_ADS_WATCH_NEXT_REQUEST;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
