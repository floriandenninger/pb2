package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adfr {
    AUTHORIZATION_LIGHTWEIGHT_ACCOUNT,
    BIG_SCREEN_CONNECTED,
    BIG_SCREEN_ON_ERROR,
    BIG_SCREEN_PLAY_STATE_UPDATE,
    BIG_SCREEN_PLAYER_STATE_CHANGED,
    BIG_SCREEN_PLAYLIST_CONFIRMED,
    BIG_SCREEN_PLAYLIST_UPDATE,
    CLOUD_SERVICE_NO_NETWORK,
    DECLINED_PARTY,
    END_PARTY_MODE,
    GO_HOME,
    LOUNGE_SERVER_CONNECTION_ERROR,
    LOUNGE_STATUS,
    NO_ACTION,
    PARTY_VIDEO_FLING,
    PLAYSTATE_CHANGED,
    QUEUE_MODIFIED,
    QUEUE_MODIFIED_VIDEO_ADDED,
    QUEUE_MODIFIED_VIDEO_REMOVED,
    REFRESH,
    REMOTE_CALL_ERROR,
    SHARED_PLAYLIST_MODIFIED,
    SWITCH_USER;

    public final Intent a() {
        return new Intent(toString());
    }

    @Override // java.lang.Enum
    public final String toString() {
        String canonicalName = adfr.class.getCanonicalName();
        String name = name();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(name).length());
        sb.append(canonicalName);
        sb.append(".");
        sb.append(name);
        return sb.toString();
    }
}
