package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqva implements aonq {
    EXO_PLAYER_HOT_CONFIG_FEATURES_UNSPECIFIED(0),
    EXO_PLAYER_HOT_CONFIG_FEATURES_LIBVPX_ZERO_COPY(1),
    EXO_PLAYER_HOT_CONFIG_FEATURES_SNAPPED_START(2),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_CODEC_OPERATING_RATE(5),
    EXO_PLAYER_HOT_CONFIG_FEATURES_EXOV2_PRE21_HFR(6),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ALWAYS_ONESIE(7),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_MEDIALIB_CHOREOGRAPHER(8),
    EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_STOP_VIDEO(9),
    EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_BLOCKING_STOP_VIDEO(10),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_EVENT_SUPPRESSION(11),
    EXO_PLAYER_HOT_CONFIG_FEATURES_EMP_CHECK_PREPAREDNESS(12),
    EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_PRE_AUDIO_TRACK_LATENCY(14),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DOWNGRADE_ABOVE_PAS_CAP(17),
    EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING(18),
    EXO_PLAYER_HOT_CONFIG_FEATURES_EOFEXCEPTION_IS_FATAL(20),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_STUCK_MEDIA_CTMP_LOGGING(23),
    EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_VOLUME(26),
    EXO_PLAYER_HOT_CONFIG_FEATURES_SEAMLESS_SFR_FALLBACK_WITH_ABR(27),
    EXO_PLAYER_HOT_CONFIG_FEATURES_FILTER_DISPROPORTIONAL_FORMATS(28),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_SURFACE_RELEASED_RETRY(33),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_NULL_CHUNK_INDEX(35),
    EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FRAMEWORK_PLAYER(37),
    EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FIXED_CODEC_MAX_VALUES(39),
    EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_ON_SURFACE_TIMEOUT(41),
    EXO_PLAYER_HOT_CONFIG_FEATURES_BLOCK_CURRENT_DECODER_FOR_DECODER_FAILURES(43),
    EXO_PLAYER_HOT_CONFIG_FEATURES_AV1_DEBUG_LOGGING(45),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_OPTIMIZATIONS(46),
    EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FOREGROUND_SIGNAL(48),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ORDER_CACHED_FORMATS_BY_BITRATE(52),
    EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMING_FOR_OFFLINE(54),
    EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMED_DATASOURCE_CHAIN_FOR_OFFLINE(56),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_RELEASE_EXOPLAYER_ON_TIMEOUT(58),
    EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_SIMPLE_BITRATE_CAP_ABR_BW(59),
    EXO_PLAYER_HOT_CONFIG_FEATURES_MEDIA_ONLY_ONESIE_USE_REAL_STREAMING_DATA(60),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING(61),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_FORCE_WORKAROUND(62),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_SYNCHRONIZED_INTERACTIONS(63),
    EXO_PLAYER_HOT_CONFIG_FEATURES_HARD_RESET_RENDERERS(65),
    EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_CODEC_DISCARD_REASON(67),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DEPRECATE_FORMATSTREAM_COMPARATOR(68),
    EXO_PLAYER_HOT_CONFIG_FEATURES_FRAMEWORK_PLAYER_TIMEOUT_ON_STOP(69),
    EXO_PLAYER_HOT_CONFIG_FEATURES_FRAMEWORK_PLAYER_TIMEOUT_ON_DETACH_MEDIAVIEW(70),
    EXO_PLAYER_HOT_CONFIG_FEATURES_CLIENT_FORMAT_SELECTION_FOR_OFFLINE(73),
    EXO_PLAYER_HOT_CONFIG_FEATURES_RECOVERABLE_CODEC_EXCEPTION_RETRIES(74),
    EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS(76),
    EXO_PLAYER_HOT_CONFIG_FEATURES_ONESIE_SETS_SEEEK_POSITION_MS(77),
    EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION(84),
    UNRECOGNIZED(-1);

    private final int X;

    aqva(int i) {
        this.X = i;
    }

    public static aons a() {
        return aquw.d;
    }

    public static aqva b(int i) {
        if (i == 0) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_UNSPECIFIED;
        }
        if (i == 1) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_LIBVPX_ZERO_COPY;
        }
        if (i == 2) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_SNAPPED_START;
        }
        if (i == 17) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_DOWNGRADE_ABOVE_PAS_CAP;
        }
        if (i == 18) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING;
        }
        if (i == 45) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_AV1_DEBUG_LOGGING;
        }
        if (i == 46) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_OPTIMIZATIONS;
        }
        if (i == 73) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_CLIENT_FORMAT_SELECTION_FOR_OFFLINE;
        }
        if (i == 74) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_RECOVERABLE_CODEC_EXCEPTION_RETRIES;
        }
        if (i == 76) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS;
        }
        if (i == 77) {
            return EXO_PLAYER_HOT_CONFIG_FEATURES_ONESIE_SETS_SEEEK_POSITION_MS;
        }
        switch (i) {
            case 5:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_CODEC_OPERATING_RATE;
            case 6:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_EXOV2_PRE21_HFR;
            case 7:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_ALWAYS_ONESIE;
            case 8:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_MEDIALIB_CHOREOGRAPHER;
            case 9:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_STOP_VIDEO;
            case 10:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_BLOCKING_STOP_VIDEO;
            case 11:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_EVENT_SUPPRESSION;
            case 12:
                return EXO_PLAYER_HOT_CONFIG_FEATURES_EMP_CHECK_PREPAREDNESS;
            default:
                switch (i) {
                    case 14:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_PRE_AUDIO_TRACK_LATENCY;
                    case 20:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_EOFEXCEPTION_IS_FATAL;
                    case 23:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_STUCK_MEDIA_CTMP_LOGGING;
                    case 33:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_SURFACE_RELEASED_RETRY;
                    case 35:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_NULL_CHUNK_INDEX;
                    case 37:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FRAMEWORK_PLAYER;
                    case 39:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FIXED_CODEC_MAX_VALUES;
                    case 41:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_ON_SURFACE_TIMEOUT;
                    case 43:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_BLOCK_CURRENT_DECODER_FOR_DECODER_FAILURES;
                    case 48:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FOREGROUND_SIGNAL;
                    case 52:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ORDER_CACHED_FORMATS_BY_BITRATE;
                    case 54:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMING_FOR_OFFLINE;
                    case 56:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_PREWARMED_DATASOURCE_CHAIN_FOR_OFFLINE;
                    case 65:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_HARD_RESET_RENDERERS;
                    case 84:
                        return EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION;
                    default:
                        switch (i) {
                            case 26:
                                return EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_VOLUME;
                            case 27:
                                return EXO_PLAYER_HOT_CONFIG_FEATURES_SEAMLESS_SFR_FALLBACK_WITH_ABR;
                            case 28:
                                return EXO_PLAYER_HOT_CONFIG_FEATURES_FILTER_DISPROPORTIONAL_FORMATS;
                            default:
                                switch (i) {
                                    case 58:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_RELEASE_EXOPLAYER_ON_TIMEOUT;
                                    case 59:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_SIMPLE_BITRATE_CAP_ABR_BW;
                                    case 60:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_MEDIA_ONLY_ONESIE_USE_REAL_STREAMING_DATA;
                                    case 61:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING;
                                    case 62:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_FORCE_WORKAROUND;
                                    case 63:
                                        return EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_SYNCHRONIZED_INTERACTIONS;
                                    default:
                                        switch (i) {
                                            case 67:
                                                return EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_CODEC_DISCARD_REASON;
                                            case 68:
                                                return EXO_PLAYER_HOT_CONFIG_FEATURES_DEPRECATE_FORMATSTREAM_COMPARATOR;
                                            case 69:
                                                return EXO_PLAYER_HOT_CONFIG_FEATURES_FRAMEWORK_PLAYER_TIMEOUT_ON_STOP;
                                            case 70:
                                                return EXO_PLAYER_HOT_CONFIG_FEATURES_FRAMEWORK_PLAYER_TIMEOUT_ON_DETACH_MEDIAVIEW;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.X;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
