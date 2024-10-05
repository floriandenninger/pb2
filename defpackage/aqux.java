package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqux implements aonq {
    EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED(0),
    EXO_PLAYER_CONFIG_FEATURES_SORT_LIVE_FORMATS_BY_BANDWIDTH(3),
    EXO_PLAYER_CONFIG_FEATURES_VERTICAL_TRANSCODE_BUGFIX(4),
    EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING(16),
    EXO_PLAYER_CONFIG_FEATURES_RETRY_NET_NOCONTENT_WITH_DELAY(23),
    EXO_PLAYER_CONFIG_FEATURES_REMOVE_EARLY_FETCH_FROM_PLAYER(33),
    EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED(40),
    EXO_PLAYER_CONFIG_FEATURES_USE_BUFFERED_DURATION_TO_DETECT_FULL_BUFFER(42),
    EXO_PLAYER_CONFIG_FEATURES_USE_NEW_EXOPLAYER_PREPARE_API(43),
    EXO_PLAYER_CONFIG_FEATURES_NATIVE_OFFLINE_STALECONFIG(47),
    UNRECOGNIZED(-1);

    private final int m;

    aqux(int i) {
        this.m = i;
    }

    public static aons a() {
        return aquw.a;
    }

    public static aqux b(int i) {
        if (i == 0) {
            return EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED;
        }
        if (i == 16) {
            return EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING;
        }
        if (i == 23) {
            return EXO_PLAYER_CONFIG_FEATURES_RETRY_NET_NOCONTENT_WITH_DELAY;
        }
        if (i == 33) {
            return EXO_PLAYER_CONFIG_FEATURES_REMOVE_EARLY_FETCH_FROM_PLAYER;
        }
        if (i == 40) {
            return EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED;
        }
        if (i == 47) {
            return EXO_PLAYER_CONFIG_FEATURES_NATIVE_OFFLINE_STALECONFIG;
        }
        if (i == 3) {
            return EXO_PLAYER_CONFIG_FEATURES_SORT_LIVE_FORMATS_BY_BANDWIDTH;
        }
        if (i == 4) {
            return EXO_PLAYER_CONFIG_FEATURES_VERTICAL_TRANSCODE_BUGFIX;
        }
        if (i == 42) {
            return EXO_PLAYER_CONFIG_FEATURES_USE_BUFFERED_DURATION_TO_DETECT_FULL_BUFFER;
        }
        if (i != 43) {
            return null;
        }
        return EXO_PLAYER_CONFIG_FEATURES_USE_NEW_EXOPLAYER_PREPARE_API;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
