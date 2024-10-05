package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avtn implements aonq {
    UPLOAD_FLOW_SOURCE_UNKNOWN(0),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY(1),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA(2),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA(3),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL(4),
    UPLOAD_FLOW_SOURCE_EXTERNAL(5),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY_REMOTE(6),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY(7),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_CAMERA(8),
    UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO(64);

    public final int k;

    avtn(int i) {
        this.k = i;
    }

    public static aons a() {
        return avhw.p;
    }

    public static avtn b(int i) {
        if (i == 64) {
            return UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO;
        }
        switch (i) {
            case 0:
                return UPLOAD_FLOW_SOURCE_UNKNOWN;
            case 1:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
            case 2:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA;
            case 3:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
            case 4:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
            case 5:
                return UPLOAD_FLOW_SOURCE_EXTERNAL;
            case 6:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY_REMOTE;
            case 7:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY;
            case 8:
                return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_CAMERA;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
