package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aosr implements aonq {
    UNKNOWN_COMPONENT(0),
    ACCOUNT_MENU_COMPONENT(1),
    SIDE_NAV_COMPONENT(2),
    SETTINGS_MENU_COMPONENT(3),
    ACCOUNT_MANAGEMENT_MENU_COMPONENT(4),
    STANDALONE_ACCOUNT_MENU_COMPONENT(5),
    NAV_WITH_ACCOUNT_MENU_COMPONENT(6),
    NAV_WITHOUT_ACCOUNT_MENU_COMPONENT(7),
    ACCOUNT_PARTICLE_DISC_COMPONENT(8),
    EXPRESS_SIGN_IN_COMPONENT(9),
    ACCOUNT_PARTICLE_COMPONENT(10),
    DEFAULT_ACCOUNT_SELECTION_COMPONENT(11),
    ACCOUNT_SNACKBAR_COMPONENT(12),
    COLLAPSED_EMBEDDED_ACCOUNT_MENU_HEADER(13),
    COLLAPSIBLE_ACCOUNT_MENU_MESPACE(14),
    OBAKE_ENTRY_POINT_COMPONENT(15),
    ADD_OR_REMOVE_ACCOUNTS_MENU_COMPONENT(16),
    OBAKE_EDUCATION_COMPONENT(17),
    INCOGNITO_LONG_PRESS_EDUCATION_COMPONENT(18),
    APD_EDUCATION_COMPONENT(19);

    public final int u;

    aosr(int i) {
        this.u = i;
    }

    public static aons a() {
        return aokr.k;
    }

    public static aosr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMPONENT;
            case 1:
                return ACCOUNT_MENU_COMPONENT;
            case 2:
                return SIDE_NAV_COMPONENT;
            case 3:
                return SETTINGS_MENU_COMPONENT;
            case 4:
                return ACCOUNT_MANAGEMENT_MENU_COMPONENT;
            case 5:
                return STANDALONE_ACCOUNT_MENU_COMPONENT;
            case 6:
                return NAV_WITH_ACCOUNT_MENU_COMPONENT;
            case 7:
                return NAV_WITHOUT_ACCOUNT_MENU_COMPONENT;
            case 8:
                return ACCOUNT_PARTICLE_DISC_COMPONENT;
            case 9:
                return EXPRESS_SIGN_IN_COMPONENT;
            case 10:
                return ACCOUNT_PARTICLE_COMPONENT;
            case 11:
                return DEFAULT_ACCOUNT_SELECTION_COMPONENT;
            case 12:
                return ACCOUNT_SNACKBAR_COMPONENT;
            case 13:
                return COLLAPSED_EMBEDDED_ACCOUNT_MENU_HEADER;
            case 14:
                return COLLAPSIBLE_ACCOUNT_MENU_MESPACE;
            case 15:
                return OBAKE_ENTRY_POINT_COMPONENT;
            case 16:
                return ADD_OR_REMOVE_ACCOUNTS_MENU_COMPONENT;
            case 17:
                return OBAKE_EDUCATION_COMPONENT;
            case 18:
                return INCOGNITO_LONG_PRESS_EDUCATION_COMPONENT;
            case 19:
                return APD_EDUCATION_COMPONENT;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
