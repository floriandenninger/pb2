package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awzb implements aonq {
    UNKNOWN_RPC(0),
    DATAMIXER_BATCHFETCH(1),
    CUSTARD_BATCHFETCH(2),
    CUSTARD_PROFILE_CARD_FETCH(3),
    CUSTARD_RECENT_INTERACTIONS_FETCH(4),
    CUSTARD_REPORTING_CHAIN_FETCH(5),
    CUSTARD_SHARED_CURRENT_LOCATION_FETCH(6),
    CUSTARD_GOOGLE_PLUS_POSTS_FETCH(7),
    CUSTARD_QUICK_ACTION_BUTTONS_FETCH(8),
    CUSTARD_GET_ENTITY_SUMMARY(25),
    OBAKE_LOCAL_IO_SAVE_EDITED_PHOTO(9),
    OBAKE_DEVICE_PHOTO_FETCH(10),
    OBAKE_GOOGLE_PHOTOS_CLUSTER_PHOTO_SUGGESTIONS(11),
    OBAKE_GOOGLE_PHOTOS_PROMOTABLE_CLUSTER_PHOTO_SUGGESTIONS(12),
    OBAKE_GOOGLE_PHOTOS_CLUSTER_SUGGESTIONS(13),
    OBAKE_GOOGLE_PHOTOS_ME_CLUSTER_PHOTO_SUGGESTIONS(14),
    OBAKE_GOOGLE_PHOTOS_PROMOTABLE_ME_CLUSTER_PHOTO_SUGGESTIONS(15),
    OBAKE_GOOGLE_PHOTOS_ALL_PHOTO_SUGGESTIONS(16),
    OBAKE_GOOGLE_PHOTOS_PROMOTABLE_ALL_PHOTO_SUGGESTIONS(17),
    OBAKE_GET_PROFILE_STATE(18),
    HOVERCARD_FETCH_HOVERCARD(19),
    OBAKE_MDI_READ(20),
    OBAKE_MDI_WRITE_PHOTO(21),
    OBAKE_MDI_REMOVE_PHOTO(22),
    OBAKE_GOOGLE_PHOTOS_PAST_PROFILE_PHOTOS(23),
    CONTACTS_IMPORT_FILE(24),
    OBAKE_ART_HOME_SUGGESTIONS(26),
    OBAKE_ART_HOME_CATEGORIES(27),
    OBAKE_ART_COLLECTION_PHOTOS(28),
    OBAKE_ART_SEARCH_INTERESTS(29),
    OBAKE_ART_SEARCH_SUGGESTIONS(30),
    OBAKE_MDI_UPDATE_PERSON_PHOTO_ME(31),
    OBAKE_MDI_DELETE_PERSON_PHOTO_ME(32),
    OBAKE_MDI_GET_PERSON_ME(33),
    OBAKE_MDI_GET_PERSON_PHOTO_ME(34),
    OBAKE_ART_SEARCH_RESULTS(35);

    public final int K;

    awzb(int i) {
        this.K = i;
    }

    public static aons a() {
        return awwu.j;
    }

    public static awzb b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RPC;
            case 1:
                return DATAMIXER_BATCHFETCH;
            case 2:
                return CUSTARD_BATCHFETCH;
            case 3:
                return CUSTARD_PROFILE_CARD_FETCH;
            case 4:
                return CUSTARD_RECENT_INTERACTIONS_FETCH;
            case 5:
                return CUSTARD_REPORTING_CHAIN_FETCH;
            case 6:
                return CUSTARD_SHARED_CURRENT_LOCATION_FETCH;
            case 7:
                return CUSTARD_GOOGLE_PLUS_POSTS_FETCH;
            case 8:
                return CUSTARD_QUICK_ACTION_BUTTONS_FETCH;
            case 9:
                return OBAKE_LOCAL_IO_SAVE_EDITED_PHOTO;
            case 10:
                return OBAKE_DEVICE_PHOTO_FETCH;
            case 11:
                return OBAKE_GOOGLE_PHOTOS_CLUSTER_PHOTO_SUGGESTIONS;
            case 12:
                return OBAKE_GOOGLE_PHOTOS_PROMOTABLE_CLUSTER_PHOTO_SUGGESTIONS;
            case 13:
                return OBAKE_GOOGLE_PHOTOS_CLUSTER_SUGGESTIONS;
            case 14:
                return OBAKE_GOOGLE_PHOTOS_ME_CLUSTER_PHOTO_SUGGESTIONS;
            case 15:
                return OBAKE_GOOGLE_PHOTOS_PROMOTABLE_ME_CLUSTER_PHOTO_SUGGESTIONS;
            case 16:
                return OBAKE_GOOGLE_PHOTOS_ALL_PHOTO_SUGGESTIONS;
            case 17:
                return OBAKE_GOOGLE_PHOTOS_PROMOTABLE_ALL_PHOTO_SUGGESTIONS;
            case 18:
                return OBAKE_GET_PROFILE_STATE;
            case 19:
                return HOVERCARD_FETCH_HOVERCARD;
            case 20:
                return OBAKE_MDI_READ;
            case 21:
                return OBAKE_MDI_WRITE_PHOTO;
            case 22:
                return OBAKE_MDI_REMOVE_PHOTO;
            case 23:
                return OBAKE_GOOGLE_PHOTOS_PAST_PROFILE_PHOTOS;
            case 24:
                return CONTACTS_IMPORT_FILE;
            case 25:
                return CUSTARD_GET_ENTITY_SUMMARY;
            case 26:
                return OBAKE_ART_HOME_SUGGESTIONS;
            case 27:
                return OBAKE_ART_HOME_CATEGORIES;
            case 28:
                return OBAKE_ART_COLLECTION_PHOTOS;
            case 29:
                return OBAKE_ART_SEARCH_INTERESTS;
            case 30:
                return OBAKE_ART_SEARCH_SUGGESTIONS;
            case 31:
                return OBAKE_MDI_UPDATE_PERSON_PHOTO_ME;
            case 32:
                return OBAKE_MDI_DELETE_PERSON_PHOTO_ME;
            case 33:
                return OBAKE_MDI_GET_PERSON_ME;
            case 34:
                return OBAKE_MDI_GET_PERSON_PHOTO_ME;
            case 35:
                return OBAKE_ART_SEARCH_RESULTS;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}
