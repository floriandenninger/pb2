package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aost implements aonq {
    UNKNOWN_EVENT(0),
    PRESENTED_ACCOUNT_MENU_EVENT(1),
    DISMISSED_ACCOUNT_MENU_EVENT(2),
    WILL_SWITCH_TO_A_DIFFERENT_ACCOUNT_EVENT(3),
    SWITCHED_TO_A_DIFFERENT_ACCOUNT_EVENT(4),
    WILL_TURN_ON_USE_WITHOUT_ACCOUNT_EVENT(5),
    WILL_TURN_ON_INCOGNITO_EVENT(6),
    TURNED_OFF_INCOGNITO_EVENT(7),
    SELECTED_SAME_ACCOUNT_EVENT(8),
    WILL_OPEN_MY_ACCOUNT_EVENT(9),
    WILL_OPEN_USE_ANOTHER_ACCOUNT_EVENT(10),
    WILL_OPEN_ACCOUNT_MANAGEMENT_EVENT(11),
    WILL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT(12),
    WILL_TOGGLE_ACCOUNT_ON_EVENT(13),
    WILL_TOGGLE_ACCOUNT_OFF_EVENT(14),
    DID_REMOVE_ACCOUNT_FROM_DEVICE_EVENT(15),
    DID_FAIL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT(16),
    WILL_OPEN_PRIVACY_POLICY_EVENT(17),
    WILL_OPEN_TERMS_OF_SERVICE_EVENT(18),
    WILL_SHOW_DIALOG_FOR_REMOVE_ACCOUNT_FROM_DEVICE_EVENT(19),
    DID_CANCEL_REMOVE_ACCOUNT_FROM_DEVICE_DIALOG_EVENT(20),
    WILL_OPEN_LICENSES_EVENT(21),
    WILL_OPEN_DEFAULT_ACCOUNT_MENU_EVENT(22),
    WILL_QUICK_SWITCH_TO_FIRST_ACCOUNT_EVENT(23),
    WILL_QUICK_SWITCH_TO_SECOND_ACCOUNT_EVENT(24),
    DID_LEFT_SWIPE_TO_SWITCH_ACCOUNT_EVENT(25),
    DID_RIGHT_SWIPE_TO_SWITCH_ACCOUNT_EVENT(26),
    WILL_SELECT_NEW_DEFAULT_IDENTITY_EVENT(27),
    DID_SELECT_NEW_DEFAULT_IDENTITY_EVENT(28),
    DID_FINALIZE_NEW_DEFAULT_IDENTITY_EVENT(29),
    DID_CONTINUE_WITHOUT_ACCOUNT_EVENT(30),
    DID_CLOSE_CONTAINER_BY_CLICKING_SCRIM(31),
    DID_TAP_TOP_RIGHT_ACCOUNT_PARTICLE_DISC_EVENT(32),
    PRESENTED_NAV_ACCOUNT_HEADER_EVENT(33),
    DISMISSED_NAV_ACCOUNT_HEADER_EVENT(34),
    DID_TAP_ACCOUNT_PARTICLE_TO_OPEN_ACCOUNT_MENU_EVENT(35),
    PRESENTED_COMPONENT_EVENT(36),
    DISMISSED_COMPONENT_EVENT(37),
    WILL_SWITCH_TO_PREVIOUS_ACCOUNT_EVENT(38),
    WILL_SWITCH_TO_NEXT_ACCOUNT_EVENT(39),
    WILL_SWITCH_TO_WORK_PROFILE_EVENT(40),
    WILL_SWITCH_TO_PERSONAL_PROFILE_EVENT(41),
    DID_SELECT_CUSTOM_ITEM_EVENT(42),
    DID_TAP_COLLAPSED_ACCOUT_MENU_HEADER(43),
    DID_TAP_EXPANDED_ACCOUT_MENU_HEADER(44),
    DID_TAP_ACCOUNT_SNACKBAR_TO_OPEN_ACCOUNT_MENU_EVENT(45),
    DID_SELECT_COMMON_ITEM_EVENT(46),
    DID_TAP_COMPONENT_EVENT(47),
    ABSORBED_CRASH_EVENT(48),
    LONG_PRESS_APD_START_EVENT(49),
    LONG_PRESS_APD_ABORT_EVENT(50),
    DID_CONTINUE_WITH_ACCOUNT_EVENT(51),
    DID_TAP_EDUCATION_APD_TOOLTIP_EVENT(52),
    DID_TAP_EDUCATION_APD_ANCHOR_VIEW_EVENT(53),
    DID_TAP_EDUCATION_APD_TOOLTIP_ACTION_BUTTON_EVENT(54),
    DID_TAP_DEACTIVATED_ACCOUNT_SWITCHING_INFO(55);

    public final int ae;

    aost(int i) {
        this.ae = i;
    }

    public static aons a() {
        return aokr.m;
    }

    public static aost b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return PRESENTED_ACCOUNT_MENU_EVENT;
            case 2:
                return DISMISSED_ACCOUNT_MENU_EVENT;
            case 3:
                return WILL_SWITCH_TO_A_DIFFERENT_ACCOUNT_EVENT;
            case 4:
                return SWITCHED_TO_A_DIFFERENT_ACCOUNT_EVENT;
            case 5:
                return WILL_TURN_ON_USE_WITHOUT_ACCOUNT_EVENT;
            case 6:
                return WILL_TURN_ON_INCOGNITO_EVENT;
            case 7:
                return TURNED_OFF_INCOGNITO_EVENT;
            case 8:
                return SELECTED_SAME_ACCOUNT_EVENT;
            case 9:
                return WILL_OPEN_MY_ACCOUNT_EVENT;
            case 10:
                return WILL_OPEN_USE_ANOTHER_ACCOUNT_EVENT;
            case 11:
                return WILL_OPEN_ACCOUNT_MANAGEMENT_EVENT;
            case 12:
                return WILL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT;
            case 13:
                return WILL_TOGGLE_ACCOUNT_ON_EVENT;
            case 14:
                return WILL_TOGGLE_ACCOUNT_OFF_EVENT;
            case 15:
                return DID_REMOVE_ACCOUNT_FROM_DEVICE_EVENT;
            case 16:
                return DID_FAIL_REMOVE_ACCOUNT_FROM_DEVICE_EVENT;
            case 17:
                return WILL_OPEN_PRIVACY_POLICY_EVENT;
            case 18:
                return WILL_OPEN_TERMS_OF_SERVICE_EVENT;
            case 19:
                return WILL_SHOW_DIALOG_FOR_REMOVE_ACCOUNT_FROM_DEVICE_EVENT;
            case 20:
                return DID_CANCEL_REMOVE_ACCOUNT_FROM_DEVICE_DIALOG_EVENT;
            case 21:
                return WILL_OPEN_LICENSES_EVENT;
            case 22:
                return WILL_OPEN_DEFAULT_ACCOUNT_MENU_EVENT;
            case 23:
                return WILL_QUICK_SWITCH_TO_FIRST_ACCOUNT_EVENT;
            case 24:
                return WILL_QUICK_SWITCH_TO_SECOND_ACCOUNT_EVENT;
            case 25:
                return DID_LEFT_SWIPE_TO_SWITCH_ACCOUNT_EVENT;
            case 26:
                return DID_RIGHT_SWIPE_TO_SWITCH_ACCOUNT_EVENT;
            case 27:
                return WILL_SELECT_NEW_DEFAULT_IDENTITY_EVENT;
            case 28:
                return DID_SELECT_NEW_DEFAULT_IDENTITY_EVENT;
            case 29:
                return DID_FINALIZE_NEW_DEFAULT_IDENTITY_EVENT;
            case 30:
                return DID_CONTINUE_WITHOUT_ACCOUNT_EVENT;
            case 31:
                return DID_CLOSE_CONTAINER_BY_CLICKING_SCRIM;
            case 32:
                return DID_TAP_TOP_RIGHT_ACCOUNT_PARTICLE_DISC_EVENT;
            case 33:
                return PRESENTED_NAV_ACCOUNT_HEADER_EVENT;
            case 34:
                return DISMISSED_NAV_ACCOUNT_HEADER_EVENT;
            case 35:
                return DID_TAP_ACCOUNT_PARTICLE_TO_OPEN_ACCOUNT_MENU_EVENT;
            case 36:
                return PRESENTED_COMPONENT_EVENT;
            case 37:
                return DISMISSED_COMPONENT_EVENT;
            case 38:
                return WILL_SWITCH_TO_PREVIOUS_ACCOUNT_EVENT;
            case 39:
                return WILL_SWITCH_TO_NEXT_ACCOUNT_EVENT;
            case 40:
                return WILL_SWITCH_TO_WORK_PROFILE_EVENT;
            case 41:
                return WILL_SWITCH_TO_PERSONAL_PROFILE_EVENT;
            case 42:
                return DID_SELECT_CUSTOM_ITEM_EVENT;
            case 43:
                return DID_TAP_COLLAPSED_ACCOUT_MENU_HEADER;
            case 44:
                return DID_TAP_EXPANDED_ACCOUT_MENU_HEADER;
            case 45:
                return DID_TAP_ACCOUNT_SNACKBAR_TO_OPEN_ACCOUNT_MENU_EVENT;
            case 46:
                return DID_SELECT_COMMON_ITEM_EVENT;
            case 47:
                return DID_TAP_COMPONENT_EVENT;
            case 48:
                return ABSORBED_CRASH_EVENT;
            case 49:
                return LONG_PRESS_APD_START_EVENT;
            case 50:
                return LONG_PRESS_APD_ABORT_EVENT;
            case 51:
                return DID_CONTINUE_WITH_ACCOUNT_EVENT;
            case 52:
                return DID_TAP_EDUCATION_APD_TOOLTIP_EVENT;
            case 53:
                return DID_TAP_EDUCATION_APD_ANCHOR_VIEW_EVENT;
            case 54:
                return DID_TAP_EDUCATION_APD_TOOLTIP_ACTION_BUTTON_EVENT;
            case 55:
                return DID_TAP_DEACTIVATED_ACCOUNT_SWITCHING_INFO;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.ae;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ae);
    }
}
