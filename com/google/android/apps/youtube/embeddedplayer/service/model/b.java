package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum b {
    AD_EVENT_DATA(AdEventData.CREATOR),
    ERROR_DATA(ErrorData.CREATOR),
    HOT_CONFIG_DATA(HotConfigData.CREATOR),
    FRAGMENT_KEY_DATA(FragmentKeyData.CREATOR),
    MUTED_AUTOPLAY_STATE(MutedAutoplayState.CREATOR),
    PLAYBACK_EVENT_DATA(PlaybackEventData.CREATOR),
    PLAYER_VIEW_MODE(PlayerViewModeData.CREATOR),
    RELATED_VIDEO_ITEM(RelatedVideoItem.CREATOR),
    RELATED_VIDEOS_SCREEN(RelatedVideosScreen.CREATOR);

    public final Parcelable.Creator j;

    b(Parcelable.Creator creator) {
        this.j = creator;
    }
}
