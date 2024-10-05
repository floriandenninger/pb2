package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awze implements aonq {
    UNKNOWN_VIEW(0),
    PEOPLESHEET(1),
    CONTACTS_DETAILS_DIALOG(2),
    OBAKE_EDIT_PHOTO_SCREEN(3),
    OBAKE_PREVIEW_SCREEN(4),
    OBAKE_CONFIRMATION_PREVIEW_SCREEN(5),
    OBAKE_SUGGESTION_HOME_SCREEN(6),
    OBAKE_MORE_CLUSTER_PHOTOS_SCREEN(7),
    OBAKE_MORE_CLUSTERS_SCREEN(8),
    OBAKE_MORE_ME_CLUSTER_SCREEN(9),
    OBAKE_MORE_SUGGESTED_PHOTOS_SCREEN(10),
    OBAKE_PAST_PROFILE_PHOTOS_SCREEN(11),
    OBAKE_GOOGLE_PHOTOS_HOME_SCREEN(12),
    OBAKE_SOURCES_SCREEN(13),
    OBAKE_CAMERA_SCREEN(14),
    OBAKE_UPLOAD_SCREEN(15),
    OBAKE_REMOVE_SCREEN(16),
    OBAKE_UPDATING_SCREEN(17),
    OBAKE_ART_HOME_SCREEN(18),
    OBAKE_ART_SEARCH_SCREEN(19),
    OBAKE_ART_COLLECTION_SCREEN(20),
    OBAKE_ART_SEARCH_RESULTS_SCREEN(21);

    public final int w;

    awze(int i) {
        this.w = i;
    }

    public static aons a() {
        return awwu.m;
    }

    public static awze b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_VIEW;
            case 1:
                return PEOPLESHEET;
            case 2:
                return CONTACTS_DETAILS_DIALOG;
            case 3:
                return OBAKE_EDIT_PHOTO_SCREEN;
            case 4:
                return OBAKE_PREVIEW_SCREEN;
            case 5:
                return OBAKE_CONFIRMATION_PREVIEW_SCREEN;
            case 6:
                return OBAKE_SUGGESTION_HOME_SCREEN;
            case 7:
                return OBAKE_MORE_CLUSTER_PHOTOS_SCREEN;
            case 8:
                return OBAKE_MORE_CLUSTERS_SCREEN;
            case 9:
                return OBAKE_MORE_ME_CLUSTER_SCREEN;
            case 10:
                return OBAKE_MORE_SUGGESTED_PHOTOS_SCREEN;
            case 11:
                return OBAKE_PAST_PROFILE_PHOTOS_SCREEN;
            case 12:
                return OBAKE_GOOGLE_PHOTOS_HOME_SCREEN;
            case 13:
                return OBAKE_SOURCES_SCREEN;
            case 14:
                return OBAKE_CAMERA_SCREEN;
            case 15:
                return OBAKE_UPLOAD_SCREEN;
            case 16:
                return OBAKE_REMOVE_SCREEN;
            case 17:
                return OBAKE_UPDATING_SCREEN;
            case 18:
                return OBAKE_ART_HOME_SCREEN;
            case 19:
                return OBAKE_ART_SEARCH_SCREEN;
            case 20:
                return OBAKE_ART_COLLECTION_SCREEN;
            case 21:
                return OBAKE_ART_SEARCH_RESULTS_SCREEN;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
