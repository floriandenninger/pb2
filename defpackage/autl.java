package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum autl implements aonq {
    SHORTS_CREATION_SURFACE_UNKNOWN(0),
    SHORTS_CREATION_SURFACE_VOD_WATCH_PAGE(1),
    SHORTS_CREATION_SURFACE_PIVOT(2),
    SHORTS_CREATION_SURFACE_GLOBAL(3),
    SHORTS_CREATION_SURFACE_SHORTS_PLAYER(4),
    SHORTS_CREATION_SURFACE_SHORTS_SHELF(5),
    SHORTS_CREATION_SURFACE_ZERO_STATE_UPLOADS(6),
    SHORTS_CREATION_SURFACE_BOTTOM_SHEET_CAMERA(7),
    SHORTS_CREATION_SURFACE_BOTTOM_SHEET_UPLOAD(8),
    SHORTS_CREATION_SURFACE_DEEP_LINKS(9),
    SHORTS_CREATION_SURFACE_PROMO(10),
    SHORTS_CREATION_SURFACE_HASHTAG_PIVOT(11),
    SHORTS_CREATION_SURFACE_MULTIMIX_SOUND(12),
    SHORTS_CREATION_SURFACE_MULTIMIX_COLLAB(13),
    SHORTS_CREATION_SURFACE_MULTIMIX_GREEN_SCREEN(14),
    SHORTS_CREATION_SURFACE_MULTIMIX_SPLICE(15);

    public final int q;

    autl(int i) {
        this.q = i;
    }

    public static aons a() {
        return auqy.j;
    }

    public static autl b(int i) {
        switch (i) {
            case 0:
                return SHORTS_CREATION_SURFACE_UNKNOWN;
            case 1:
                return SHORTS_CREATION_SURFACE_VOD_WATCH_PAGE;
            case 2:
                return SHORTS_CREATION_SURFACE_PIVOT;
            case 3:
                return SHORTS_CREATION_SURFACE_GLOBAL;
            case 4:
                return SHORTS_CREATION_SURFACE_SHORTS_PLAYER;
            case 5:
                return SHORTS_CREATION_SURFACE_SHORTS_SHELF;
            case 6:
                return SHORTS_CREATION_SURFACE_ZERO_STATE_UPLOADS;
            case 7:
                return SHORTS_CREATION_SURFACE_BOTTOM_SHEET_CAMERA;
            case 8:
                return SHORTS_CREATION_SURFACE_BOTTOM_SHEET_UPLOAD;
            case 9:
                return SHORTS_CREATION_SURFACE_DEEP_LINKS;
            case 10:
                return SHORTS_CREATION_SURFACE_PROMO;
            case 11:
                return SHORTS_CREATION_SURFACE_HASHTAG_PIVOT;
            case 12:
                return SHORTS_CREATION_SURFACE_MULTIMIX_SOUND;
            case 13:
                return SHORTS_CREATION_SURFACE_MULTIMIX_COLLAB;
            case 14:
                return SHORTS_CREATION_SURFACE_MULTIMIX_GREEN_SCREEN;
            case 15:
                return SHORTS_CREATION_SURFACE_MULTIMIX_SPLICE;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
