package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum xaf {
    AD_INTERRUPT_ACQUIRED,
    AD_VIDEO_PLAY_REQUESTED,
    AD_VIDEO_PLAYING,
    AD_VIDEO_ENDED;

    public final boolean a() {
        return this == AD_INTERRUPT_ACQUIRED || this == AD_VIDEO_PLAY_REQUESTED || this == AD_VIDEO_PLAYING;
    }
}
