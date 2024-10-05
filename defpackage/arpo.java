package defpackage;

import com.google.cardboard.sdk.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arpo {
    ACCOUNT_STATE_CHANGE_SIGNED_IN,
    ACCOUNT_STATE_CHANGE_SIGNED_OUT,
    DELAYED_EVENT_METRIC_CAPTURED,
    LATENCY_ACTION_BASELINED,
    LATENCY_ACTION_INFO,
    LATENCY_ACTION_TICKED,
    OFFLINE_TRANSFER_STATUS_CHANGED,
    OFFLINE_IMAGE_DOWNLOAD,
    PLAYBACK_START_STATE_CHANGED,
    SYSTEM_HEALTH_CAPTURED,
    MANGO_ONBOARDING_COMPLETED,
    MANGO_PUSH_NOTIFICATION_RECEIVED,
    MANGO_UNFORK_DB_MIGRATION_ERROR,
    MANGO_UNFORK_DB_MIGRATION_SUMMARY,
    MANGO_UNFORK_DB_MIGRATION_PREUNFORK_DB_VERSION_NUMBER,
    MANGO_UNFORK_DB_MIGRATION_PHONE_METADATA,
    MANGO_UNFORK_DB_MIGRATION_PHONE_STORAGE,
    MANGO_UNFORK_DB_MIGRATION_STEP,
    MANGO_ASYNC_API_MIGRATION_EVENT,
    MANGO_DOWNLOAD_VIDEO_RESULT,
    MANGO_HOMEPAGE_VIDEO_COUNT,
    MANGO_HOME_V3_STATE,
    MANGO_IMAGE_CLIENT_CACHE_HIT_EVENT,
    SD_CARD_STATUS_CHANGED,
    FRAMES_DROPPED,
    THUMBNAIL_HOVERED,
    DEVICE_RETENTION_INFO_CAPTURED,
    THUMBNAIL_LOADED,
    BACK_TO_APP_EVENT,
    STREAMING_STATS_CAPTURED,
    OFFLINE_VIDEO_SHARED,
    APP_CRASHED,
    YOU_THERE,
    OFFLINE_STATE_SNAPSHOT,
    MDX_SESSION_STARTED,
    MDX_SESSION_CONNECTED,
    MDX_SESSION_DISCONNECTED,
    BEDROCK_RESOURCE_CONSUMPTION_SNAPSHOT,
    NEXT_GEN_WATCH_WATCH_SWIPED,
    KIDS_ACCOUNTS_SNAPSHOT,
    ZERO_STEP_CHANNEL_CREATED,
    TVHTML5_SEARCH_COMPLETED,
    OFFLINE_SHARE_PAIRING,
    OFFLINE_SHARE_UNLOCK,
    MDX_ROUTE_DISTRIBUTION_SNAPSHOT,
    BEDROCK_REPETITIVE_ACTION_TIMED,
    UNPLUGGED_DEGRADATION_INFO,
    UPLOAD_MP4_HEADER_MOVED,
    UPLOAD_VIDEO_TRANSCODED,
    UPLOAD_PROCESSOR_STARTED,
    UPLOAD_PROCESSOR_ENDED,
    UPLOAD_PROCESSOR_READY,
    UPLOAD_PROCESSOR_REQUIREMENT_PENDING,
    UPLOAD_PROCESSOR_INTERRUPTED,
    UPLOAD_FRONTEND_EVENT,
    ASSET_PACK_DOWNLOAD_STARTED,
    ASSET_PACK_DOWNLOADED,
    ASSET_PACK_APPLIED,
    ASSET_PACK_DELETED,
    PLAYBACK_SESSION_STOPPED,
    AD_BLOCKER_MESSAGING_SHOWN,
    DISTRIBUTION_CHANNEL_CAPTURED,
    DATA_PLAN_CPID_REQUESTED,
    DETAILED_NETWORK_TYPE_CAPTURED,
    SEND_STATE_UPDATED,
    RECEIVE_STATE_UPDATED,
    SEND_DEBUG_STATE_UPDATED,
    RECEIVE_DEBUG_STATE_UPDATED,
    KIDS_ERRORED,
    MDX_MSN_SESSION_STATS_FINISHED,
    APP_SETTINGS_CAPTURED,
    MDX_WEB_SOCKET_SERVER_HTTP_ERROR,
    MDX_WEB_SOCKET_SERVER,
    STARTUP_CRASHES_DETECTED,
    OFFLINE_PLAYBACK_STARTED,
    LIVE_CHAT_MESSAGE_SENT,
    LIVE_CREATION_CAMERA_UPDATED,
    LIVE_CREATION_ENCODING_CAPTURED,
    LIVE_CREATION_ERROR,
    LIVE_CREATION_HEALTH_UPDATED,
    LIVE_CREATION_VIDEO_EFFECTS_CAPTURED,
    LIVE_CREATION_STAGE_OCCURED,
    LIVE_CREATION_BROADCAST_SCHEDULED,
    LIVE_CREATION_ARCHIVE_REPLACEMENT,
    LIVE_CREATION_STREAM_WEBRTC_STATS,
    MDX_SESSION_RECOVERY_STARTED,
    MDX_SESSION_RECOVERY_COMPLETED,
    MDX_SESSION_RECOVERY_STOPPED,
    VISUAL_ELEMENT_SHOWN,
    VISUAL_ELEMENT_HIDDEN,
    VISUAL_ELEMENT_GESTURED,
    VISUAL_ELEMENT_STATE_CHANGED,
    SCREEN_CREATED,
    PLAYBACK_ASSOCIATED,
    VISUAL_ELEMENT_ATTACHED,
    PLAYBACK_CONTEXT_EVENT,
    CLOUD_CASTING_PLAYBACK_STARTED,
    WEB_PLAYER_API_CALLED,
    TVHTML5_ACCOUNT_DIALOG_OPENED,
    FOREGROUND_HEARTBEAT,
    FOREGROUND_HEARTBEAT_SCREEN_ASSOCIATED,
    KIDS_OFFLINE_SNAPSHOT,
    MDX_ENCRYPTION_SESSION_STATS_FINISHED,
    PLAYER_REQUEST_COMPLETED,
    LITE_SCHEDULER_STATISTICS,
    MDX_SIGN_IN,
    SPACECAST_METADATA_LOOKUP_REQUESTED,
    SPACECAST_BATCH_LOOKUP_REQUESTED,
    SPACECAST_SUMMARY_REQUESTED,
    SPACECAST_PLAYBACK,
    SPACECAST_DISCOVERY,
    TVHTML5_LAUNCH_URL_COMPONENT_CHANGED,
    MDX_BACKGROUND_PLAYBACK_REQUEST_COMPLETED,
    MDX_BROKEN_ADDITIONAL_DATA_DEVICE_DETECTED,
    TVHTML5_LOCAL_STORAGE,
    TVHTML5_DEVICE_STORAGE_STATUS,
    AUTO_CAPTIONS_AVAILABLE,
    PLAYBACK_SCRUBBING_EVENT,
    FLEXY_STATE,
    INTERFACE_ORIENTATION_CAPTURED,
    MAIN_APP_BROWSE_FRAGMENT_CACHE,
    OFFLINE_CACHE_VERIFICATION_FAILURE,
    OFFLINE_PLAYBACK_EXCEPTION_DIGEST,
    VR_COPRESENCE_STATS,
    VR_COPRESENCE_SYNC_STATS,
    VR_COPRESENCE_COMMS_STATS,
    VR_COPRESENCE_PARTY_STATS,
    VR_COPRESENCE_EMOJI_STATS,
    VR_COPRESENCE_EVENT,
    VR_COPRESENCE_FLOW_TRANSIT_EVENT,
    VR_PLAYBACK_EVENT,
    KIDS_AGE_GATE_TRACKING,
    OFFLINE_DELAY_ALLOWED_TRACKING,
    MAIN_APP_AUTO_OFFLINE_STATE,
    VIDEO_AS_THUMBNAIL_DOWNLOAD,
    VIDEO_AS_THUMBNAIL_PLAYBACK,
    LITE_SHOW_MORE,
    RENDERING_ERROR,
    KIDS_PROFILE_PIN_GATE_TRACKING,
    ABR_TRAJECTORY,
    SCROLL_EVENT,
    STREAMZ_INCREMENTED,
    KIDS_PROFILE_SWITCHER_TRACKING,
    KIDS_PROFILE_CREATION_TRACKING,
    BUY_FLOW_STARTED,
    MBS_CONNECTION_INITIATED,
    MBS_PLAYBACK_INITIATED,
    MBS_LOAD_CHILDREN,
    LITE_PROFILE_FETCHER,
    MDX_REMOTE_TRANSACTION,
    REEL_PLAYBACK_ERROR,
    REACHABILITY_DETECTION_EVENT,
    MOBILE_PLAYBACK_EVENT,
    COURTSIDE_PLAYER_STATE_CHANGED,
    MUSIC_PERSISTENT_CACHE_CHECKED,
    MUSIC_PERSISTENT_CACHE_CLEARED,
    PLAYBACK_INTERRUPTED,
    PLAYBACK_INTERRUPTION_RESOLVED,
    FIX_FOP_FLOW,
    ANR_DETECTION,
    BACKSTAGE_POST_CREATION_FLOW_ENDED,
    CLIENT_ERROR,
    GAMING_ACCOUNT_LINK_STATUS_CHANGED,
    LITE_HOUSEWARMING,
    BUY_FLOW_EVENT,
    KIDS_PARENTAL_GATE_TRACKING,
    YPC_UPGRADE_FLOW,
    YONGLE_STUDY,
    YPC_UPDATE_FLOW_STARTED,
    YPC_UPDATE_FLOW_CANCELLED,
    YPC_UPDATE_FLOW_SUCCEEDED,
    YPC_UPDATE_FLOW_FAILED,
    LITE_GROWTHKIT_PROMO,
    PAYMENT_FLOW_STARTED,
    TRANSACTION_FLOW_SHOW_PAYMENT_DIALOG,
    TRANSACTION_FLOW_STARTED,
    TRANSACTION_FLOW_SECONDARY_DEVICE_STARTED,
    TRANSACTION_FLOW_SECONDARY_DEVICE_SIGNED_OUT_STARTED,
    TRANSACTION_FLOW_CANCELLED,
    TRANSACTION_FLOW_PAYMENT_CALL_BACK_RECEIVED,
    TRANSACTION_FLOW_PAYMENT_SUCCEEDED,
    TRANSACTION_FLOW_SUCCEEDED,
    TRANSACTION_FLOW_FAILED,
    LITE_VIDEO_QUALITY_CHANGED,
    WATCH_BREAK_ENABLEMENT_SETTING_EVENT,
    WATCH_BREAK_FREQUENCY_SETTING_EVENT,
    VIDEO_EFFECTS_CAMERA_PERFORMANCE_METRICS,
    AD_NOTIFY,
    STARTUP_TELEMETRY,
    PLAYBACK_OFFLINE_FALLBACK_USED,
    IOS_OUT_OF_MEMORY,
    YPC_PAUSE_FLOW_STARTED,
    YPC_PAUSE_FLOW_CANCELLED,
    YPC_PAUSE_FLOW_SUCCEEDED,
    YPC_PAUSE_FLOW_FAILED,
    UPLOAD_FILE_SELECTED,
    YPC_RESUME_FLOW_STARTED,
    YPC_RESUME_FLOW_CANCELLED,
    YPC_RESUME_FLOW_SUCCEEDED,
    YPC_RESUME_FLOW_FAILED,
    ADS_CLIENT_STATE_CHANGE,
    YPC_CANCEL_FLOW_STARTED,
    YPC_CANCEL_FLOW_CANCELLED,
    YPC_CANCEL_FLOW_SUCCEEDED,
    YPC_CANCEL_FLOW_FAILED,
    YPC_CANCEL_FLOW_GO_TO_PAYMENT_PROCESSOR,
    YPC_DEACTIVATE_FLOW_STARTED,
    YPC_REDEEM_FLOW_STARTED,
    YPC_REDEEM_FLOW_CANCELLED,
    YPC_REDEEM_FLOW_SUCCEEDED,
    YPC_REDEEM_FLOW_FAILED,
    YPC_FAMILY_CREATE_FLOW_STARTED,
    YPC_FAMILY_CREATE_FLOW_CANCELLED,
    YPC_FAMILY_CREATE_FLOW_SUCCEEDED,
    YPC_FAMILY_CREATE_FLOW_FAILED,
    YPC_FAMILY_MANAGE_FLOW_STARTED,
    YPC_FAMILY_MANAGE_FLOW_CANCELLED,
    YPC_FAMILY_MANAGE_FLOW_SUCCEEDED,
    YPC_FAMILY_MANAGE_FLOW_FAILED,
    SHOPPING_CHECKOUT_STARTED,
    SHOPPING_CHECKOUT_CANCELLED,
    SHOPPING_CHECKOUT_SUCCEEDED,
    SHOPPING_CHECKOUT_FAILED,
    RESTORE_CONTEXT_EVENT,
    EMBEDS_AD_EVENT,
    AUTOPLAY_TRIGGERED,
    CLIENT_DATA_ERROR_EVENT,
    EXPERIMENTAL_VSS_VALIDATION,
    TVHTML5_TRIGGERED_EVENT,
    TVHTML5_FRAMEWORKS_FIELD_TRIAL_RESULT,
    TVHTML5_FRAMEWORKS_FIELD_TRIAL_START,
    MUSIC_OFFLINE_PREFERENCES,
    WATCH_TIME_SEGMENT,
    APP_WIDTH_LAYOUT_ERROR,
    ACCOUNT_REGISTRY_CHANGE,
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT,
    DOWNLOAD_RECOMMENDATION_ENABLEMENT_SETTING_EVENT,
    MUSIC_PLAYBACK_CONTENT_MODE_CHANGE_EVENT,
    OFFLINE_DB_OPEN_COMPLETED,
    KIDS_FLOW_EVENT,
    KIDS_FLOW_CORPUS_SELECTED_EVENT,
    VIDEO_EFFECTS_EVENT,
    UNPLUGGED_OPS_EOG_ANALYTICS_EVENT,
    PLAYBACK_AUDIO_ROUTE_EVENT,
    INTERACTION_LOGGING_DEBUG_MODE_ERROR,
    OFFLINE_YTB_REFRESHED,
    KIDS_FLOW_ERROR,
    MUSIC_AUTOPLAY_ON_LAUNCH_ATTEMPTED,
    DEVICE_CONTEXT_ACTIVITY_EVENT,
    DEVICE_CONTEXT_EVENT,
    TEMPLATE_RESOLUTION_EXCEPTION,
    MUSIC_SIDELOADED_PLAYLIST_SERVICE_CALLED,
    EMBEDS_STORAGE_ACCESS_NOT_CHECKED,
    EMBEDS_HAS_STORAGE_ACCESS_RESULT,
    EMBEDS_ITP_PLAYED_ON_RELOAD,
    EMBEDS_REQUEST_STORAGE_ACCESS_RESULT,
    EMBEDS_SHOULD_REQUEST_STORAGE_ACCESS_RESULT,
    EMBEDS_REQUEST_STORAGE_ACCESS_STATE,
    EMBEDS_REQUEST_STORAGE_ACCESS_FAILED_STATE,
    EMBEDS_ITP_WATCH_LATER_RESULT,
    SEARCH_SUGGEST_DECODING_PAYLOAD_FAILURE,
    SIRI_SHORTCUT_ACTIVATED,
    TVHTML5_KEYBOARD_PERFORMANCE,
    LATENCY_ACTION_SPAN,
    ELEMENTS_LOG,
    YTB_FILE_OPENED,
    TFLITE_MODEL_ERROR,
    TVHTML5_API_TEST,
    YONGLE_USB_SETUP,
    TOU_STRIKE_INTERSTITIAL_EVENT,
    LITE_STREAM_TO_SAVE,
    APP_BUNDLE_CLIENT_EVENT,
    YTB_FILE_CREATION_FAILED,
    AD_NOTIFY_FAILURE,
    YTB_TRANSFER_FAILED,
    BLOCKING_REQUEST_FAILED,
    LITE_ACCOUNT_SELECTOR,
    LITE_ACCOUNT_UI_CALLBACKS,
    DUMMY_PAYLOAD,
    BROWSE_RESPONSE_VALIDATION_EVENT,
    ENTITIES_ERROR,
    MUSIC_IOS_BACKGROUND_FETCH,
    MDX_NOTIFICATION_EVENT,
    LAYERS_VALIDATION_ERROR,
    MUSIC_PWA_INSTALLED,
    LITE_ACCOUNT_CLEANUP,
    HTML5_PLAYER_HEALTH_EVENT,
    WATCH_RESTORE_ATTEMPT,
    LITE_ACCOUNT_SIGN_IN,
    NOTAIRE_EVENT,
    KIDS_VOICE_SEARCH_EVENT,
    AD_NOTIFY_FILLED,
    DELAYED_EVENT_DROPPED,
    ANALYTICS_SEARCH_EVENT,
    SYSTEM_DARK_THEME_OPT_OUT_EVENT,
    FLOW_EVENT,
    NETWORK_CONNECTIVITY_BASELINE_EVENT,
    YTB_FILE_IMPORTED,
    DOWNLOAD_STREAM_URL_EXPIRED,
    DIRECT_SIGN_IN_EVENT,
    LYRIC_IMPRESSION_EVENT,
    ACCESSIBILITY_STATE_EVENT,
    TOKEN_REFRESH_EVENT,
    GENERIC_ATTESTATION_EXECUTION,
    TVHTML5_VIDEO_SEEK,
    UNPLUGGED_AUTO_PAUSE,
    SCRUBBING_EVENT,
    BEDTIME_REMINDER_EVENT,
    TVHTML5_UNEXPECTED_RESTART,
    TVHTML5_WATCH_KEY_EVENT,
    VOICE_LANGUAGE_CHANGED,
    TVHTML5_LIVE_CHAT_STATUS,
    PARENT_TOOLS_CORPUS_SELECTED_EVENT,
    OFFER_ADS_ENROLLMENT_INITIATED,
    NETWORK_QUALITY_INTERVAL_EVENT,
    DEVICE_STARTUP_METRICS,
    HEARTBEAT_ACTION_PLAYER_TRANSITIONED,
    TVHTML5_LIFECYCLE,
    HEARTBEAT_ACTION_PLAYER_HALTED,
    ADAPTIVE_INLINE_MUTED_SETTING_EVENT,
    MAIN_APP_LIBRARY_LOADING_STATE,
    THIRD_PARTY_LOG_MONITORING_EVENT,
    APP_SHELL_ASSET_LOAD_REPORT,
    TVHTML5_ANDROID_ATTESTATION,
    TVHTML5_STARTUP_SOUND_EVENT,
    IOS_BACKGROUND_REFRESH_TASK,
    IOS_BACKGROUND_PROCESSING_TASK,
    SLI_EVENT_BATCH,
    POST_IMPRESSION_EVENT,
    MUSIC_SIDELOADED_PLAYLIST_EXPORT,
    IDB_UNEXPECTEDLY_CLOSED,
    VOICE_SEARCH_EVENT,
    MDX_SESSION_CAST_EVENT,
    IDB_QUOTA_EXCEEDED,
    IDB_TRANSACTION_ENDED,
    IDB_TRANSACTION_ABORTED,
    TVHTML5_KEYBOARD_LOGGING,
    IDB_IS_SUPPORTED_COMPLETED,
    CREATOR_STUDIO_MOBILE_EVENT,
    IDB_DATA_CORRUPTED,
    PARENT_TOOLS_APP_CHOSEN_EVENT,
    WEB_VIEW_BOTTOM_SHEET_RESIZED,
    ACTIVE_STATE_CONTROLLER_SCROLL_PERFORMANCE_SUMMARY,
    NAVIGATOR_VALIDATION,
    MDX_SESSION_HEARTBEAT,
    CLIENT_HINTS_POLYFILL_DIAGNOSTICS,
    CLIENT_HINTS_POLYFILL_EVENT,
    PROOF_OF_ORIGIN_TOKEN_ERROR,
    KIDS_ADDED_ACCOUNT_SUMMARY,
    MUSIC_WEARABLE_DEVICE,
    YPC_REFUND_FLOW_EVENT,
    TVHTML5_PLAYBACK_MEASUREMENT_EVENT,
    TVHTML5_WATERMARK_MEASUREMENT_EVENT,
    CLIENT_EXP_GCF_PROPAGATION_EVENT,
    MAIN_APP_REFERRER_INTENT,
    LEADER_LOCK_ENDED,
    LEADER_LOCK_ACQUIRED,
    GOOGLE_HATS_EVENT,
    PERSISTENT_LENS_LAUNCH_EVENT,
    PARENT_TOOLS_CHILD_WELCOME_CHOSEN_EVENT,
    BROWSE_THUMBNAIL_PRELOAD_EVENT,
    FINAL_PAYLOAD,
    MDX_DIAL_ADDITIONAL_DATA_UPDATE_EVENT,
    WEB_ORCHESTRATION_TASK_LIFECYCLE_RECORD,
    STARTUP_SIGNAL_EVENT,
    ACCOUNT_ERROR,
    GMS_DEVICE_CHECK_EVENT,
    ACCOUNT_SELECTOR_EVENT,
    ACCOUNT_UI_CALLBACKS,
    MDX_DIAL_ADDITIONAL_DATA_PROBE_EVENT,
    DOWNLOADS_SEARCH_ICING_API_STATS,
    DOWNLOADS_SEARCH_INDEX_UPDATED_EVENT,
    DOWNLOADS_SEARCH_INDEX_SNAPSHOT,
    DATA_PUSH_CLIENT_EVENT,
    KIDS_CATEGORY_SELECTED_EVENT,
    MDX_DEVICE_MANAGEMENT_SNAPSHOT_EVENT,
    PREFETCH_REQUESTED,
    PREFETCHABLE_COMMAND_EXECUTED,
    GEL_DEBUGGING_EVENT,
    WEB_LINK_TTS_PLAY_END,
    CLIP_VIEW_INVALID,
    PERSISTENT_STORAGE_STATE_CHECKED,
    CACHE_WIPEOUT_EVENT,
    OFFLINE_TRANSFER_STARTED,
    MUSIC_OFFLINE_MIXTAPE_PREFERENCES_CHANGED,
    MANGO_DAILY_NEW_VIDEOS_NOTIFICATION_ATTEMPT,
    MANGO_DAILY_NEW_VIDEOS_NOTIFICATION_ERROR,
    DTWS_PLAYBACK_STARTED,
    DTWS_TILE_FETCH_STARTED,
    DTWS_TILE_FETCH_COMPLETED,
    DTWS_TILE_FETCH_STATUS_CHANGED,
    DTWS_KEYFRAME_DECODER_BUFFER_SENT,
    DTWS_TILE_UNDERFLOWED_ON_NONKEYFRAME,
    DTWS_BACKFILL_FETCH_STATUS_CHANGED,
    DTWS_BACKFILL_UNDERFLOWED,
    DTWS_ADAPTIVE_LEVEL_CHANGED,
    BLOCKING_VISITOR_ID_TIMEOUT,
    LITE_SOCIAL,
    MOBILE_JS_INVOCATION,
    PAYLOAD_NOT_SET;

    public static arpo a(int i) {
        switch (i) {
            case 0:
                return PAYLOAD_NOT_SET;
            case 1:
            case 8:
            case 33:
            case 50:
            case 120:
            case 131:
            case 132:
            case 166:
            case 316:
            case 377:
            default:
                return null;
            case 2:
                return OFFLINE_TRANSFER_STATUS_CHANGED;
            case 3:
                return SYSTEM_HEALTH_CAPTURED;
            case 4:
                return OFFLINE_TRANSFER_STARTED;
            case 5:
                return LATENCY_ACTION_TICKED;
            case 6:
                return LATENCY_ACTION_BASELINED;
            case 7:
                return LATENCY_ACTION_INFO;
            case 9:
                return PLAYBACK_START_STATE_CHANGED;
            case 10:
                return MANGO_ONBOARDING_COMPLETED;
            case 11:
                return DELAYED_EVENT_METRIC_CAPTURED;
            case 12:
                return FRAMES_DROPPED;
            case 13:
                return THUMBNAIL_HOVERED;
            case 14:
                return DEVICE_RETENTION_INFO_CAPTURED;
            case 15:
                return THUMBNAIL_LOADED;
            case 16:
                return MUSIC_OFFLINE_MIXTAPE_PREFERENCES_CHANGED;
            case 17:
                return STREAMING_STATS_CAPTURED;
            case 18:
                return LITE_SOCIAL;
            case 19:
                return OFFLINE_VIDEO_SHARED;
            case 20:
                return APP_CRASHED;
            case 21:
                return YOU_THERE;
            case 22:
                return OFFLINE_STATE_SNAPSHOT;
            case 23:
                return ACCOUNT_STATE_CHANGE_SIGNED_IN;
            case 24:
                return ACCOUNT_STATE_CHANGE_SIGNED_OUT;
            case 25:
                return MDX_SESSION_STARTED;
            case 26:
                return MDX_SESSION_CONNECTED;
            case 27:
                return MDX_SESSION_DISCONNECTED;
            case 28:
                return BEDROCK_RESOURCE_CONSUMPTION_SNAPSHOT;
            case 29:
                return NEXT_GEN_WATCH_WATCH_SWIPED;
            case 30:
                return KIDS_ACCOUNTS_SNAPSHOT;
            case 31:
                return ZERO_STEP_CHANNEL_CREATED;
            case 32:
                return TVHTML5_SEARCH_COMPLETED;
            case 34:
                return OFFLINE_SHARE_PAIRING;
            case 35:
                return OFFLINE_SHARE_UNLOCK;
            case 36:
                return MDX_ROUTE_DISTRIBUTION_SNAPSHOT;
            case 37:
                return BEDROCK_REPETITIVE_ACTION_TIMED;
            case 38:
                return UPLOAD_MP4_HEADER_MOVED;
            case 39:
                return UPLOAD_VIDEO_TRANSCODED;
            case 40:
                return MANGO_DAILY_NEW_VIDEOS_NOTIFICATION_ATTEMPT;
            case 41:
                return ASSET_PACK_DOWNLOAD_STARTED;
            case 42:
                return ASSET_PACK_DOWNLOADED;
            case 43:
                return ASSET_PACK_APPLIED;
            case 44:
                return ASSET_PACK_DELETED;
            case 45:
                return PLAYBACK_SESSION_STOPPED;
            case 46:
                return UPLOAD_PROCESSOR_STARTED;
            case 47:
                return UPLOAD_PROCESSOR_ENDED;
            case 48:
                return AD_BLOCKER_MESSAGING_SHOWN;
            case 49:
                return DISTRIBUTION_CHANNEL_CAPTURED;
            case 51:
                return DATA_PLAN_CPID_REQUESTED;
            case 52:
                return DETAILED_NETWORK_TYPE_CAPTURED;
            case 53:
                return SEND_STATE_UPDATED;
            case 54:
                return RECEIVE_STATE_UPDATED;
            case 55:
                return SEND_DEBUG_STATE_UPDATED;
            case 56:
                return RECEIVE_DEBUG_STATE_UPDATED;
            case 57:
                return KIDS_ERRORED;
            case 58:
                return MDX_MSN_SESSION_STATS_FINISHED;
            case 59:
                return APP_SETTINGS_CAPTURED;
            case 60:
                return MDX_WEB_SOCKET_SERVER_HTTP_ERROR;
            case 61:
                return MDX_WEB_SOCKET_SERVER;
            case 62:
                return STARTUP_CRASHES_DETECTED;
            case 63:
                return OFFLINE_PLAYBACK_STARTED;
            case 64:
                return LIVE_CREATION_CAMERA_UPDATED;
            case 65:
                return LIVE_CREATION_ENCODING_CAPTURED;
            case 66:
                return LIVE_CREATION_ERROR;
            case 67:
                return LIVE_CREATION_HEALTH_UPDATED;
            case 68:
                return LIVE_CREATION_VIDEO_EFFECTS_CAPTURED;
            case 69:
                return MDX_SESSION_RECOVERY_STARTED;
            case 70:
                return MDX_SESSION_RECOVERY_COMPLETED;
            case 71:
                return MDX_SESSION_RECOVERY_STOPPED;
            case 72:
                return VISUAL_ELEMENT_SHOWN;
            case 73:
                return VISUAL_ELEMENT_HIDDEN;
            case 74:
                return CLOUD_CASTING_PLAYBACK_STARTED;
            case 75:
                return LIVE_CREATION_STAGE_OCCURED;
            case 76:
                return WEB_PLAYER_API_CALLED;
            case 77:
                return MANGO_DAILY_NEW_VIDEOS_NOTIFICATION_ERROR;
            case 78:
                return VISUAL_ELEMENT_GESTURED;
            case 79:
                return TVHTML5_ACCOUNT_DIALOG_OPENED;
            case 80:
                return FOREGROUND_HEARTBEAT;
            case 81:
                return KIDS_OFFLINE_SNAPSHOT;
            case 82:
                return MDX_ENCRYPTION_SESSION_STATS_FINISHED;
            case 83:
                return PLAYER_REQUEST_COMPLETED;
            case 84:
                return LITE_SCHEDULER_STATISTICS;
            case 85:
                return MDX_SIGN_IN;
            case 86:
                return SPACECAST_METADATA_LOOKUP_REQUESTED;
            case 87:
                return SPACECAST_BATCH_LOOKUP_REQUESTED;
            case 88:
                return SPACECAST_SUMMARY_REQUESTED;
            case 89:
                return SPACECAST_PLAYBACK;
            case 90:
                return SPACECAST_DISCOVERY;
            case 91:
                return TVHTML5_LAUNCH_URL_COMPONENT_CHANGED;
            case 92:
                return MDX_BACKGROUND_PLAYBACK_REQUEST_COMPLETED;
            case 93:
                return MDX_BROKEN_ADDITIONAL_DATA_DEVICE_DETECTED;
            case 94:
                return UPLOAD_PROCESSOR_READY;
            case 95:
                return UPLOAD_PROCESSOR_REQUIREMENT_PENDING;
            case 96:
                return UPLOAD_PROCESSOR_INTERRUPTED;
            case 97:
                return TVHTML5_LOCAL_STORAGE;
            case 98:
                return SD_CARD_STATUS_CHANGED;
            case 99:
                return AUTO_CAPTIONS_AVAILABLE;
            case 100:
                return FLEXY_STATE;
            case 101:
                return INTERFACE_ORIENTATION_CAPTURED;
            case 102:
                return MAIN_APP_BROWSE_FRAGMENT_CACHE;
            case 103:
                return OFFLINE_CACHE_VERIFICATION_FAILURE;
            case 104:
                return VR_COPRESENCE_STATS;
            case 105:
                return KIDS_AGE_GATE_TRACKING;
            case 106:
                return OFFLINE_DELAY_ALLOWED_TRACKING;
            case 107:
                return MAIN_APP_AUTO_OFFLINE_STATE;
            case 108:
                return VIDEO_AS_THUMBNAIL_DOWNLOAD;
            case 109:
                return VIDEO_AS_THUMBNAIL_PLAYBACK;
            case 110:
                return LITE_SHOW_MORE;
            case 111:
                return FOREGROUND_HEARTBEAT_SCREEN_ASSOCIATED;
            case 112:
                return DTWS_PLAYBACK_STARTED;
            case 113:
                return DTWS_TILE_FETCH_STARTED;
            case 114:
                return DTWS_TILE_FETCH_COMPLETED;
            case 115:
                return DTWS_KEYFRAME_DECODER_BUFFER_SENT;
            case 116:
                return DTWS_TILE_UNDERFLOWED_ON_NONKEYFRAME;
            case 117:
                return DTWS_BACKFILL_UNDERFLOWED;
            case 118:
                return RENDERING_ERROR;
            case 119:
                return KIDS_PROFILE_PIN_GATE_TRACKING;
            case 121:
                return MANGO_UNFORK_DB_MIGRATION_ERROR;
            case 122:
                return MANGO_UNFORK_DB_MIGRATION_SUMMARY;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return LIVE_CREATION_BROADCAST_SCHEDULED;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return ABR_TRAJECTORY;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return SCROLL_EVENT;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return STREAMZ_INCREMENTED;
            case 127:
                return KIDS_PROFILE_SWITCHER_TRACKING;
            case 128:
                return DTWS_ADAPTIVE_LEVEL_CHANGED;
            case 129:
                return KIDS_PROFILE_CREATION_TRACKING;
            case 130:
                return VR_COPRESENCE_SYNC_STATS;
            case 133:
                return MANGO_UNFORK_DB_MIGRATION_PREUNFORK_DB_VERSION_NUMBER;
            case 134:
                return MANGO_UNFORK_DB_MIGRATION_PHONE_METADATA;
            case 135:
                return MANGO_UNFORK_DB_MIGRATION_PHONE_STORAGE;
            case 136:
                return BUY_FLOW_STARTED;
            case 137:
                return VR_COPRESENCE_COMMS_STATS;
            case 138:
                return MBS_CONNECTION_INITIATED;
            case 139:
                return MBS_PLAYBACK_INITIATED;
            case 140:
                return MBS_LOAD_CHILDREN;
            case 141:
                return VR_COPRESENCE_EVENT;
            case 142:
                return MANGO_UNFORK_DB_MIGRATION_STEP;
            case 143:
                return DTWS_BACKFILL_FETCH_STATUS_CHANGED;
            case 144:
                return LITE_PROFILE_FETCHER;
            case 145:
                return DTWS_TILE_FETCH_STATUS_CHANGED;
            case 146:
                return MDX_REMOTE_TRANSACTION;
            case 147:
                return TVHTML5_DEVICE_STORAGE_STATUS;
            case 148:
                return REEL_PLAYBACK_ERROR;
            case 149:
                return LIVE_CREATION_ARCHIVE_REPLACEMENT;
            case 150:
                return REACHABILITY_DETECTION_EVENT;
            case 151:
                return MOBILE_PLAYBACK_EVENT;
            case 152:
                return COURTSIDE_PLAYER_STATE_CHANGED;
            case 153:
                return VR_COPRESENCE_PARTY_STATS;
            case 154:
                return MUSIC_PERSISTENT_CACHE_CHECKED;
            case 155:
                return MUSIC_PERSISTENT_CACHE_CLEARED;
            case 156:
                return SCREEN_CREATED;
            case 157:
                return PLAYBACK_INTERRUPTED;
            case 158:
                return PLAYBACK_INTERRUPTION_RESOLVED;
            case 159:
                return FIX_FOP_FLOW;
            case 160:
                return VR_COPRESENCE_FLOW_TRANSIT_EVENT;
            case 161:
                return ANR_DETECTION;
            case 162:
                return BACKSTAGE_POST_CREATION_FLOW_ENDED;
            case 163:
                return CLIENT_ERROR;
            case 164:
                return GAMING_ACCOUNT_LINK_STATUS_CHANGED;
            case 165:
                return LITE_HOUSEWARMING;
            case 167:
                return BUY_FLOW_EVENT;
            case 168:
                return KIDS_PARENTAL_GATE_TRACKING;
            case 169:
                return YPC_UPGRADE_FLOW;
            case 170:
                return YONGLE_STUDY;
            case 171:
                return YPC_UPDATE_FLOW_STARTED;
            case 172:
                return YPC_UPDATE_FLOW_CANCELLED;
            case 173:
                return YPC_UPDATE_FLOW_SUCCEEDED;
            case 174:
                return YPC_UPDATE_FLOW_FAILED;
            case 175:
                return LITE_GROWTHKIT_PROMO;
            case 176:
                return TRANSACTION_FLOW_STARTED;
            case 177:
                return TRANSACTION_FLOW_CANCELLED;
            case 178:
                return TRANSACTION_FLOW_SUCCEEDED;
            case 179:
                return TRANSACTION_FLOW_FAILED;
            case 180:
                return LITE_VIDEO_QUALITY_CHANGED;
            case 181:
                return WATCH_BREAK_ENABLEMENT_SETTING_EVENT;
            case 182:
                return WATCH_BREAK_FREQUENCY_SETTING_EVENT;
            case 183:
                return VIDEO_EFFECTS_CAMERA_PERFORMANCE_METRICS;
            case 184:
                return AD_NOTIFY;
            case 185:
                return STARTUP_TELEMETRY;
            case 186:
                return PLAYBACK_OFFLINE_FALLBACK_USED;
            case 187:
                return IOS_OUT_OF_MEMORY;
            case 188:
                return YPC_PAUSE_FLOW_STARTED;
            case 189:
                return YPC_PAUSE_FLOW_CANCELLED;
            case 190:
                return YPC_PAUSE_FLOW_SUCCEEDED;
            case 191:
                return YPC_PAUSE_FLOW_FAILED;
            case 192:
                return UPLOAD_FILE_SELECTED;
            case 193:
                return YPC_RESUME_FLOW_STARTED;
            case 194:
                return YPC_RESUME_FLOW_CANCELLED;
            case 195:
                return YPC_RESUME_FLOW_SUCCEEDED;
            case 196:
                return YPC_RESUME_FLOW_FAILED;
            case 197:
                return ADS_CLIENT_STATE_CHANGE;
            case 198:
                return YPC_CANCEL_FLOW_STARTED;
            case 199:
                return YPC_CANCEL_FLOW_CANCELLED;
            case 200:
                return YPC_CANCEL_FLOW_SUCCEEDED;
            case 201:
                return YPC_CANCEL_FLOW_FAILED;
            case 202:
                return PLAYBACK_ASSOCIATED;
            case 203:
                return YPC_REDEEM_FLOW_STARTED;
            case 204:
                return YPC_REDEEM_FLOW_CANCELLED;
            case 205:
                return YPC_REDEEM_FLOW_SUCCEEDED;
            case 206:
                return YPC_REDEEM_FLOW_FAILED;
            case 207:
                return RESTORE_CONTEXT_EVENT;
            case 208:
                return VISUAL_ELEMENT_STATE_CHANGED;
            case 209:
                return AUTOPLAY_TRIGGERED;
            case 210:
                return CLIENT_DATA_ERROR_EVENT;
            case 211:
                return EXPERIMENTAL_VSS_VALIDATION;
            case 212:
                return TVHTML5_TRIGGERED_EVENT;
            case 213:
                return VR_COPRESENCE_EMOJI_STATS;
            case 214:
                return PLAYBACK_CONTEXT_EVENT;
            case 215:
                return VISUAL_ELEMENT_ATTACHED;
            case 216:
                return TVHTML5_FRAMEWORKS_FIELD_TRIAL_RESULT;
            case 217:
                return OFFLINE_PLAYBACK_EXCEPTION_DIGEST;
            case 218:
                return MUSIC_OFFLINE_PREFERENCES;
            case 219:
                return WATCH_TIME_SEGMENT;
            case 220:
                return TVHTML5_FRAMEWORKS_FIELD_TRIAL_START;
            case 221:
                return APP_WIDTH_LAYOUT_ERROR;
            case 222:
                return TRANSACTION_FLOW_SECONDARY_DEVICE_STARTED;
            case 223:
                return MANGO_ASYNC_API_MIGRATION_EVENT;
            case 224:
                return MANGO_DOWNLOAD_VIDEO_RESULT;
            case 225:
                return LIVE_CHAT_MESSAGE_SENT;
            case 226:
                return ACCOUNT_REGISTRY_CHANGE;
            case 227:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT;
            case 228:
                return DOWNLOAD_RECOMMENDATION_ENABLEMENT_SETTING_EVENT;
            case 229:
                return UNPLUGGED_DEGRADATION_INFO;
            case 230:
                return MANGO_PUSH_NOTIFICATION_RECEIVED;
            case 231:
                return MUSIC_PLAYBACK_CONTENT_MODE_CHANGE_EVENT;
            case 232:
                return OFFLINE_DB_OPEN_COMPLETED;
            case 233:
                return KIDS_FLOW_EVENT;
            case 234:
                return KIDS_FLOW_CORPUS_SELECTED_EVENT;
            case 235:
                return VIDEO_EFFECTS_EVENT;
            case 236:
                return UNPLUGGED_OPS_EOG_ANALYTICS_EVENT;
            case 237:
                return PLAYBACK_AUDIO_ROUTE_EVENT;
            case 238:
                return INTERACTION_LOGGING_DEBUG_MODE_ERROR;
            case 239:
                return OFFLINE_YTB_REFRESHED;
            case 240:
                return KIDS_FLOW_ERROR;
            case 241:
                return UPLOAD_FRONTEND_EVENT;
            case 242:
                return MUSIC_AUTOPLAY_ON_LAUNCH_ATTEMPTED;
            case 243:
                return DEVICE_CONTEXT_ACTIVITY_EVENT;
            case 244:
                return DEVICE_CONTEXT_EVENT;
            case 245:
                return TEMPLATE_RESOLUTION_EXCEPTION;
            case 246:
                return MUSIC_SIDELOADED_PLAYLIST_SERVICE_CALLED;
            case 247:
                return EMBEDS_STORAGE_ACCESS_NOT_CHECKED;
            case 248:
                return EMBEDS_HAS_STORAGE_ACCESS_RESULT;
            case 249:
                return EMBEDS_ITP_PLAYED_ON_RELOAD;
            case 250:
                return EMBEDS_REQUEST_STORAGE_ACCESS_RESULT;
            case 251:
                return EMBEDS_SHOULD_REQUEST_STORAGE_ACCESS_RESULT;
            case 252:
                return SEARCH_SUGGEST_DECODING_PAYLOAD_FAILURE;
            case 253:
                return SIRI_SHORTCUT_ACTIVATED;
            case 254:
                return TVHTML5_KEYBOARD_PERFORMANCE;
            case PrivateKeyType.INVALID /* 255 */:
                return LATENCY_ACTION_SPAN;
            case 256:
                return EMBEDS_REQUEST_STORAGE_ACCESS_STATE;
            case 257:
                return EMBEDS_REQUEST_STORAGE_ACCESS_FAILED_STATE;
            case 258:
                return YPC_FAMILY_CREATE_FLOW_STARTED;
            case 259:
                return YPC_FAMILY_CREATE_FLOW_CANCELLED;
            case 260:
                return YPC_FAMILY_CREATE_FLOW_SUCCEEDED;
            case 261:
                return YPC_FAMILY_CREATE_FLOW_FAILED;
            case 262:
                return YPC_FAMILY_MANAGE_FLOW_STARTED;
            case 263:
                return YPC_FAMILY_MANAGE_FLOW_CANCELLED;
            case 264:
                return YPC_FAMILY_MANAGE_FLOW_SUCCEEDED;
            case 265:
                return YPC_FAMILY_MANAGE_FLOW_FAILED;
            case 266:
                return EMBEDS_ITP_WATCH_LATER_RESULT;
            case 267:
                return ELEMENTS_LOG;
            case 268:
                return YTB_FILE_OPENED;
            case 269:
                return TFLITE_MODEL_ERROR;
            case 270:
                return TVHTML5_API_TEST;
            case 271:
                return YONGLE_USB_SETUP;
            case 272:
                return TOU_STRIKE_INTERSTITIAL_EVENT;
            case 273:
                return MANGO_IMAGE_CLIENT_CACHE_HIT_EVENT;
            case 274:
                return LITE_STREAM_TO_SAVE;
            case 275:
                return APP_BUNDLE_CLIENT_EVENT;
            case 276:
                return YTB_FILE_CREATION_FAILED;
            case 277:
                return BLOCKING_VISITOR_ID_TIMEOUT;
            case 278:
                return AD_NOTIFY_FAILURE;
            case 279:
                return MANGO_HOMEPAGE_VIDEO_COUNT;
            case 280:
                return YTB_TRANSFER_FAILED;
            case 281:
                return BLOCKING_REQUEST_FAILED;
            case 282:
                return LITE_ACCOUNT_SELECTOR;
            case 283:
                return LITE_ACCOUNT_UI_CALLBACKS;
            case 284:
                return DUMMY_PAYLOAD;
            case 285:
                return BROWSE_RESPONSE_VALIDATION_EVENT;
            case 286:
                return ENTITIES_ERROR;
            case 287:
                return MUSIC_IOS_BACKGROUND_FETCH;
            case 288:
                return LIVE_CREATION_STREAM_WEBRTC_STATS;
            case 289:
                return MDX_NOTIFICATION_EVENT;
            case 290:
                return LAYERS_VALIDATION_ERROR;
            case 291:
                return MUSIC_PWA_INSTALLED;
            case 292:
                return LITE_ACCOUNT_CLEANUP;
            case 293:
                return HTML5_PLAYER_HEALTH_EVENT;
            case 294:
                return WATCH_RESTORE_ATTEMPT;
            case 295:
                return MANGO_HOME_V3_STATE;
            case 296:
                return LITE_ACCOUNT_SIGN_IN;
            case 297:
                return MOBILE_JS_INVOCATION;
            case 298:
                return NOTAIRE_EVENT;
            case 299:
                return KIDS_VOICE_SEARCH_EVENT;
            case 300:
                return AD_NOTIFY_FILLED;
            case 301:
                return DELAYED_EVENT_DROPPED;
            case 302:
                return ANALYTICS_SEARCH_EVENT;
            case 303:
                return SYSTEM_DARK_THEME_OPT_OUT_EVENT;
            case 304:
                return FLOW_EVENT;
            case 305:
                return NETWORK_CONNECTIVITY_BASELINE_EVENT;
            case 306:
                return YTB_FILE_IMPORTED;
            case 307:
                return DOWNLOAD_STREAM_URL_EXPIRED;
            case 308:
                return DIRECT_SIGN_IN_EVENT;
            case 309:
                return LYRIC_IMPRESSION_EVENT;
            case 310:
                return ACCESSIBILITY_STATE_EVENT;
            case 311:
                return TOKEN_REFRESH_EVENT;
            case 312:
                return GENERIC_ATTESTATION_EXECUTION;
            case 313:
                return TVHTML5_VIDEO_SEEK;
            case 314:
                return UNPLUGGED_AUTO_PAUSE;
            case 315:
                return SCRUBBING_EVENT;
            case 317:
                return BEDTIME_REMINDER_EVENT;
            case 318:
                return BACK_TO_APP_EVENT;
            case 319:
                return TVHTML5_UNEXPECTED_RESTART;
            case 320:
                return YPC_DEACTIVATE_FLOW_STARTED;
            case 321:
                return TVHTML5_WATCH_KEY_EVENT;
            case 322:
                return VOICE_LANGUAGE_CHANGED;
            case 323:
                return TVHTML5_LIVE_CHAT_STATUS;
            case 324:
                return PARENT_TOOLS_CORPUS_SELECTED_EVENT;
            case 325:
                return OFFER_ADS_ENROLLMENT_INITIATED;
            case 326:
                return NETWORK_QUALITY_INTERVAL_EVENT;
            case 327:
                return EMBEDS_AD_EVENT;
            case 328:
                return DEVICE_STARTUP_METRICS;
            case 329:
                return TRANSACTION_FLOW_PAYMENT_SUCCEEDED;
            case 330:
                return HEARTBEAT_ACTION_PLAYER_TRANSITIONED;
            case 331:
                return TVHTML5_LIFECYCLE;
            case 332:
                return HEARTBEAT_ACTION_PLAYER_HALTED;
            case 333:
                return ADAPTIVE_INLINE_MUTED_SETTING_EVENT;
            case 334:
                return MAIN_APP_LIBRARY_LOADING_STATE;
            case 335:
                return OFFLINE_IMAGE_DOWNLOAD;
            case 336:
                return THIRD_PARTY_LOG_MONITORING_EVENT;
            case 337:
                return APP_SHELL_ASSET_LOAD_REPORT;
            case 338:
                return TVHTML5_ANDROID_ATTESTATION;
            case 339:
                return PLAYBACK_SCRUBBING_EVENT;
            case 340:
                return TVHTML5_STARTUP_SOUND_EVENT;
            case 341:
                return PAYMENT_FLOW_STARTED;
            case 342:
                return IOS_BACKGROUND_REFRESH_TASK;
            case 343:
                return IOS_BACKGROUND_PROCESSING_TASK;
            case 344:
                return SLI_EVENT_BATCH;
            case 345:
                return VR_PLAYBACK_EVENT;
            case 346:
                return POST_IMPRESSION_EVENT;
            case 347:
                return MUSIC_SIDELOADED_PLAYLIST_EXPORT;
            case 348:
                return IDB_UNEXPECTEDLY_CLOSED;
            case 349:
                return VOICE_SEARCH_EVENT;
            case 350:
                return MDX_SESSION_CAST_EVENT;
            case 351:
                return IDB_QUOTA_EXCEEDED;
            case 352:
                return IDB_TRANSACTION_ENDED;
            case 353:
                return IDB_TRANSACTION_ABORTED;
            case 354:
                return TVHTML5_KEYBOARD_LOGGING;
            case 355:
                return IDB_IS_SUPPORTED_COMPLETED;
            case 356:
                return CREATOR_STUDIO_MOBILE_EVENT;
            case 357:
                return IDB_DATA_CORRUPTED;
            case 358:
                return PARENT_TOOLS_APP_CHOSEN_EVENT;
            case 359:
                return WEB_VIEW_BOTTOM_SHEET_RESIZED;
            case 360:
                return ACTIVE_STATE_CONTROLLER_SCROLL_PERFORMANCE_SUMMARY;
            case 361:
                return NAVIGATOR_VALIDATION;
            case 362:
                return MDX_SESSION_HEARTBEAT;
            case 363:
                return CLIENT_HINTS_POLYFILL_DIAGNOSTICS;
            case 364:
                return CLIENT_HINTS_POLYFILL_EVENT;
            case 365:
                return PROOF_OF_ORIGIN_TOKEN_ERROR;
            case 366:
                return KIDS_ADDED_ACCOUNT_SUMMARY;
            case 367:
                return MUSIC_WEARABLE_DEVICE;
            case 368:
                return YPC_REFUND_FLOW_EVENT;
            case 369:
                return TVHTML5_PLAYBACK_MEASUREMENT_EVENT;
            case 370:
                return TVHTML5_WATERMARK_MEASUREMENT_EVENT;
            case 371:
                return CLIENT_EXP_GCF_PROPAGATION_EVENT;
            case 372:
                return MAIN_APP_REFERRER_INTENT;
            case 373:
                return LEADER_LOCK_ENDED;
            case 374:
                return LEADER_LOCK_ACQUIRED;
            case 375:
                return GOOGLE_HATS_EVENT;
            case 376:
                return PERSISTENT_LENS_LAUNCH_EVENT;
            case 378:
                return PARENT_TOOLS_CHILD_WELCOME_CHOSEN_EVENT;
            case 379:
                return BROWSE_THUMBNAIL_PRELOAD_EVENT;
            case 380:
                return FINAL_PAYLOAD;
            case 381:
                return MDX_DIAL_ADDITIONAL_DATA_UPDATE_EVENT;
            case 382:
                return WEB_ORCHESTRATION_TASK_LIFECYCLE_RECORD;
            case 383:
                return TRANSACTION_FLOW_SECONDARY_DEVICE_SIGNED_OUT_STARTED;
            case 384:
                return STARTUP_SIGNAL_EVENT;
            case 385:
                return ACCOUNT_ERROR;
            case 386:
                return GMS_DEVICE_CHECK_EVENT;
            case 387:
                return TRANSACTION_FLOW_PAYMENT_CALL_BACK_RECEIVED;
            case 388:
                return ACCOUNT_SELECTOR_EVENT;
            case 389:
                return ACCOUNT_UI_CALLBACKS;
            case 390:
                return MDX_DIAL_ADDITIONAL_DATA_PROBE_EVENT;
            case 391:
                return DOWNLOADS_SEARCH_ICING_API_STATS;
            case 392:
                return DATA_PUSH_CLIENT_EVENT;
            case 393:
                return KIDS_CATEGORY_SELECTED_EVENT;
            case 394:
                return MDX_DEVICE_MANAGEMENT_SNAPSHOT_EVENT;
            case 395:
                return PREFETCH_REQUESTED;
            case 396:
                return PREFETCHABLE_COMMAND_EXECUTED;
            case 397:
                return DOWNLOADS_SEARCH_INDEX_UPDATED_EVENT;
            case 398:
                return DOWNLOADS_SEARCH_INDEX_SNAPSHOT;
            case 399:
                return GEL_DEBUGGING_EVENT;
            case 400:
                return WEB_LINK_TTS_PLAY_END;
            case 401:
                return CLIP_VIEW_INVALID;
            case 402:
                return YPC_CANCEL_FLOW_GO_TO_PAYMENT_PROCESSOR;
            case 403:
                return PERSISTENT_STORAGE_STATE_CHECKED;
            case 404:
                return CACHE_WIPEOUT_EVENT;
            case 405:
                return TRANSACTION_FLOW_SHOW_PAYMENT_DIALOG;
            case 406:
                return SHOPPING_CHECKOUT_STARTED;
            case 407:
                return SHOPPING_CHECKOUT_CANCELLED;
            case 408:
                return SHOPPING_CHECKOUT_SUCCEEDED;
            case 409:
                return SHOPPING_CHECKOUT_FAILED;
        }
    }
}
