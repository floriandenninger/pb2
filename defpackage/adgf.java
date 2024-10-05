package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adgf {
    ADD_VIDEO("addVideo"),
    ADD_VIDEOS("addVideos"),
    AD_PLAYING("adPlaying"),
    ON_AD_INFO_CHANGED("onAdInfoChange"),
    ON_AD_STATE_CHANGED("onAdStateChange"),
    CLEAR_PLAYLIST("clearPlaylist"),
    CONFIRM_PLAYLIST_UPDATE("confirmPlaylistUpdate"),
    INSERT_VIDEO("insertVideo"),
    INSERT_VIDEOS("insertVideos"),
    LOUNGE_STATUS("loungeStatus"),
    MOVE_VIDEO("moveVideo"),
    NEXT("next"),
    NOOP("noop"),
    NOW_PLAYING("nowPlaying"),
    NOW_PLAYING_PLAYLIST("nowPlayingPlaylist"),
    ON_SUBTITLES_TRACK_CHANGED("onSubtitlesTrackChanged"),
    PAUSE("pause"),
    PLAY("play"),
    PLAYLIST_MODIFIED("playlistModified"),
    PREVIOUS("previous"),
    REMOVE_VIDEO("removeVideo"),
    SCREEN_DISCONNECTED("loungeScreenDisconnected"),
    SEEK_TO("seekTo"),
    SET_AUDIO_TRACK("setAudioTrack"),
    SET_PLAYLIST("setPlaylist"),
    SET_SUBTITLES_TRACK("setSubtitlesTrack"),
    SET_VIDEO("setVideo"),
    SET_VOLUME("setVolume"),
    ON_VOLUME_CHANGED("onVolumeChanged"),
    SHOW_QR_CODE("showQrCode"),
    SKIP_AD("skipAd"),
    ON_STATE_CHANGED("onStateChange"),
    STOP("stopVideo"),
    NOW_AUTONAVING("nowAutoplaying"),
    AUTONAV_DISMISSED("autoplayDismissed"),
    DISMISS_AUTONAV("dismissAutoplay"),
    AUTONAV_UP_NEXT("autoplayUpNext"),
    ON_AUTONAV_MODE_CHANGED("onAutoplayModeChanged"),
    SET_AUTONAV_MODE("setAutoplayMode"),
    ON_AUDIO_TRACK_LIST_CHANGED("onAudioTrackListChanged"),
    ON_AUDIO_TRACK_CHANGED("onAudioTrackChanged"),
    ON_USER_ACTIVITY("onUserActivity"),
    ON_PLAYLIST_MODE_CHANGED("onPlaylistModeChanged"),
    SET_PLAYLIST_MODE("setPlaylistMode"),
    ON_LOOP_MODE_CHANGED("onLoopModeChanged"),
    SET_LOOP_MODE("setLoopMode"),
    GRACEFUL_RECONNECT("gracefulReconnect"),
    SEND_DEBUG_COMMAND("sendDebugCommand"),
    CUSTOM("custom"),
    MDX_SESSION_STATUS("mdxSessionStatus"),
    MDX_REMOTE_STATUS("mdxRemoteStatus"),
    ENCRYPTION("mdxEncrypted"),
    REQUEST_ASSISTED_SIGN_IN("requestAssistedSignIn"),
    VOICE_COMMAND("voiceCommand"),
    DPAD_COMMAND("dpadCommand"),
    SET_IMPACTED_SESSIONS_SERVER_EVENT("setImpactedSessionsServerEvent"),
    ON_HAS_PREVIOUS_NEXT_CHANGED("onHasPreviousNextChanged"),
    HEARTBEAT("heartbeat"),
    ON_HEARTBEAT_RECEIVED("onHeartbeatReceived"),
    START_SIGN_IN("startSignIn"),
    ON_SIGN_IN_STARTED("onSignInStarted"),
    RECEIVER_STATUS("receiverStatus"),
    GET_RECEIVER_STATUS("getReceiverStatus");

    public static final amsx al;
    public static final amsx am;
    private static final Map ao;
    public final String an;

    static {
        adgf adgfVar = NEXT;
        adgf adgfVar2 = PAUSE;
        adgf adgfVar3 = PLAY;
        adgf adgfVar4 = PREVIOUS;
        adgf adgfVar5 = SEEK_TO;
        adgf adgfVar6 = SET_AUDIO_TRACK;
        adgf adgfVar7 = SET_SUBTITLES_TRACK;
        adgf adgfVar8 = SET_VOLUME;
        adgf adgfVar9 = SKIP_AD;
        adgf adgfVar10 = STOP;
        adgf adgfVar11 = ON_USER_ACTIVITY;
        adgf adgfVar12 = SEND_DEBUG_COMMAND;
        adgf adgfVar13 = MDX_REMOTE_STATUS;
        adgf adgfVar14 = ENCRYPTION;
        adgf adgfVar15 = VOICE_COMMAND;
        adgf adgfVar16 = DPAD_COMMAND;
        ao = new HashMap();
        al = amsx.w(adgfVar, adgfVar11, adgfVar2, adgfVar3, adgfVar4, adgfVar5, adgfVar12, adgfVar8, adgfVar9, adgfVar10, adgfVar13, adgfVar14, adgfVar15, adgfVar16);
        amsx.s(adgfVar6, adgfVar7);
        am = amsx.s(adgfVar13, adgfVar14);
        for (adgf adgfVar17 : values()) {
            ao.put(adgfVar17.an, adgfVar17);
        }
    }

    adgf(String str) {
        this.an = str;
    }

    public static adgf a(String str) {
        return (adgf) ao.get(str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.an;
    }
}
