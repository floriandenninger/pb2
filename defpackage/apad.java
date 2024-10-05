package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apad implements aonq {
    CONNECTIVITY(0),
    CLIENT_PLAYBACK_NONCE_KEY(1),
    LAST_USER_INTERACTION_MS(2),
    CONTENT_CURRENT_TIME_MS(3),
    PLAYER_HEIGHT(4),
    PLAYER_WIDTH(5),
    REQUEST_WALL_TIME_MS(6),
    SDK_VERSION(7),
    PLAYER_VISIBILITY(8),
    VOLUME(9),
    CLIENT_WALLTIME_MS(10),
    AD_CLIENT_PLAYBACK_NONCE_KEY(11),
    AD_CURRENT_TIME_MS(12),
    VSS_AD_CLIENT_PLAYBACK_NONCE_KEY(13),
    AD_TIME_ON_SCREEN(14),
    AD_WATCH_TIME(15),
    AD_INTERACTION_X(16),
    AD_INTERACTION_Y(17),
    AD_DISALLOWED_REASONS(18),
    BLOCKING_ERROR(19),
    ERROR_MESSAGE(20),
    IMA_ERROR_CODE(21),
    INTERNAL_ID(22),
    YT_ERROR_CODE(23),
    TIME_SINCE_LAST_AD_SEC(24),
    AD_BLOCK(25),
    MIDROLL_POS_SEC(26),
    MIDROLL_POS_MS(47),
    SLOT_POSITION(27),
    BISCOTTI_ID(28),
    REQUEST_TIME(29),
    FLASH_VERSION(30),
    IFRAME_STATE(31),
    COMPANION_AD_TYPE(32),
    USER_TIME_ZONE_OFFSET(33),
    USER_HISTORY_LENGTH(34),
    USER_BROWSER_ENABLED_JAVA(35),
    USER_SCREEN_HEIGHT(36),
    USER_SCREEN_WIDTH(37),
    USER_SCREEN_AVAILABLE_HEIGHT(38),
    USER_SCREEN_AVAILABLE_WIDTH(39),
    USER_SCREEN_COLOR_DEPTH(40),
    USER_BROWSER_NUM_PLUGINS(41),
    USER_BROWSER_NUM_MIME_TYPES(42),
    BREAK_TYPE(43),
    LIVE_TARGETING_CONTEXT(44),
    AUTONAV_STATE(45),
    AD_BREAK_LENGTH(46),
    ACTIVE_VIEW(48),
    GOOGLE_VIEWABILITY(49),
    THIRD_PARTY_VIEWABILITY(50),
    DRIFT_FROM_HEAD_MS(51),
    LIVE_INDEX(52),
    YT_REMOTE(53);

    public final int ac;

    apad(int i) {
        this.ac = i;
    }

    public static aons a() {
        return aouo.t;
    }

    public static apad b(int i) {
        switch (i) {
            case 0:
                return CONNECTIVITY;
            case 1:
                return CLIENT_PLAYBACK_NONCE_KEY;
            case 2:
                return LAST_USER_INTERACTION_MS;
            case 3:
                return CONTENT_CURRENT_TIME_MS;
            case 4:
                return PLAYER_HEIGHT;
            case 5:
                return PLAYER_WIDTH;
            case 6:
                return REQUEST_WALL_TIME_MS;
            case 7:
                return SDK_VERSION;
            case 8:
                return PLAYER_VISIBILITY;
            case 9:
                return VOLUME;
            case 10:
                return CLIENT_WALLTIME_MS;
            case 11:
                return AD_CLIENT_PLAYBACK_NONCE_KEY;
            case 12:
                return AD_CURRENT_TIME_MS;
            case 13:
                return VSS_AD_CLIENT_PLAYBACK_NONCE_KEY;
            case 14:
                return AD_TIME_ON_SCREEN;
            case 15:
                return AD_WATCH_TIME;
            case 16:
                return AD_INTERACTION_X;
            case 17:
                return AD_INTERACTION_Y;
            case 18:
                return AD_DISALLOWED_REASONS;
            case 19:
                return BLOCKING_ERROR;
            case 20:
                return ERROR_MESSAGE;
            case 21:
                return IMA_ERROR_CODE;
            case 22:
                return INTERNAL_ID;
            case 23:
                return YT_ERROR_CODE;
            case 24:
                return TIME_SINCE_LAST_AD_SEC;
            case 25:
                return AD_BLOCK;
            case 26:
                return MIDROLL_POS_SEC;
            case 27:
                return SLOT_POSITION;
            case 28:
                return BISCOTTI_ID;
            case 29:
                return REQUEST_TIME;
            case 30:
                return FLASH_VERSION;
            case 31:
                return IFRAME_STATE;
            case 32:
                return COMPANION_AD_TYPE;
            case 33:
                return USER_TIME_ZONE_OFFSET;
            case 34:
                return USER_HISTORY_LENGTH;
            case 35:
                return USER_BROWSER_ENABLED_JAVA;
            case 36:
                return USER_SCREEN_HEIGHT;
            case 37:
                return USER_SCREEN_WIDTH;
            case 38:
                return USER_SCREEN_AVAILABLE_HEIGHT;
            case 39:
                return USER_SCREEN_AVAILABLE_WIDTH;
            case 40:
                return USER_SCREEN_COLOR_DEPTH;
            case 41:
                return USER_BROWSER_NUM_PLUGINS;
            case 42:
                return USER_BROWSER_NUM_MIME_TYPES;
            case 43:
                return BREAK_TYPE;
            case 44:
                return LIVE_TARGETING_CONTEXT;
            case 45:
                return AUTONAV_STATE;
            case 46:
                return AD_BREAK_LENGTH;
            case 47:
                return MIDROLL_POS_MS;
            case 48:
                return ACTIVE_VIEW;
            case 49:
                return GOOGLE_VIEWABILITY;
            case 50:
                return THIRD_PARTY_VIEWABILITY;
            case 51:
                return DRIFT_FROM_HEAD_MS;
            case 52:
                return LIVE_INDEX;
            case 53:
                return YT_REMOTE;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.ac;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ac);
    }
}
