package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asmw implements aonq {
    LENS_LAUNCH_STATUS_UNKNOWN(0),
    LENS_LAUNCH_STATUS_SUCCESS(1),
    LENS_LAUNCH_STATUS_NO_PLAYER_VIEW(2),
    LENS_LAUNCH_STATUS_NO_PLAYER_SURFACE(3),
    LENS_LAUNCH_STATUS_BAD_ANDROID_SDK_VERSION(4),
    LENS_LAUNCH_STATUS_PIXELCOPY_FAILED(5),
    LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE(6),
    LENS_LAUNCH_STATUS_BITMAP_COPY_FAILED(7),
    LENS_LAUNCH_STATUS_PLAYBACK_STOPPED(8);

    public final int j;

    asmw(int i) {
        this.j = i;
    }

    public static aons a() {
        return asje.k;
    }

    public static asmw b(int i) {
        switch (i) {
            case 0:
                return LENS_LAUNCH_STATUS_UNKNOWN;
            case 1:
                return LENS_LAUNCH_STATUS_SUCCESS;
            case 2:
                return LENS_LAUNCH_STATUS_NO_PLAYER_VIEW;
            case 3:
                return LENS_LAUNCH_STATUS_NO_PLAYER_SURFACE;
            case 4:
                return LENS_LAUNCH_STATUS_BAD_ANDROID_SDK_VERSION;
            case 5:
                return LENS_LAUNCH_STATUS_PIXELCOPY_FAILED;
            case 6:
                return LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE;
            case 7:
                return LENS_LAUNCH_STATUS_BITMAP_COPY_FAILED;
            case 8:
                return LENS_LAUNCH_STATUS_PLAYBACK_STOPPED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
