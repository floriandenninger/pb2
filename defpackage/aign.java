package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aign {
    NEW,
    PLAYBACK_PENDING,
    PLAYBACK_LOADED,
    PLAYBACK_INTERRUPTED,
    INTERSTITIAL_REQUESTED,
    INTERSTITIAL_PLAYING,
    READY,
    VIDEO_REQUESTED,
    VIDEO_PLAYING,
    ENDED;

    public final boolean a(aign... aignVarArr) {
        for (aign aignVar : aignVarArr) {
            if (this == aignVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return a(INTERSTITIAL_REQUESTED, VIDEO_REQUESTED, PLAYBACK_PENDING);
    }

    public final boolean c(aign aignVar) {
        return ordinal() >= aignVar.ordinal();
    }

    public final boolean d() {
        return a(INTERSTITIAL_PLAYING, VIDEO_PLAYING);
    }

    public final boolean e() {
        return d() || b();
    }

    public final boolean f() {
        return a(VIDEO_REQUESTED, VIDEO_PLAYING);
    }

    public final boolean g() {
        return a(PLAYBACK_INTERRUPTED) || h();
    }

    public final boolean h() {
        return a(INTERSTITIAL_REQUESTED, INTERSTITIAL_PLAYING);
    }
}
