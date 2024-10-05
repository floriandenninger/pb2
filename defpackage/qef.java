package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum qef {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    ILLEGAL_ARGUMENT("IllegalArgument"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    CHALLENGE_REQUIRED("ChallengeRequired"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError");

    private final String ag;

    qef(String str) {
        this.ag = str;
    }

    public static final qef a(String str) {
        qef qefVar = UNKNOWN;
        for (qef qefVar2 : values()) {
            if (true == qefVar2.ag.equals(str)) {
                qefVar = qefVar2;
            }
        }
        return qefVar;
    }

    public static boolean b(qef qefVar) {
        return BAD_AUTHENTICATION.equals(qefVar) || CAPTCHA.equals(qefVar) || NEED_PERMISSION.equals(qefVar) || NEED_REMOTE_CONSENT.equals(qefVar) || NEEDS_BROWSER.equals(qefVar) || USER_CANCEL.equals(qefVar) || DEVICE_MANAGEMENT_REQUIRED.equals(qefVar) || DM_INTERNAL_ERROR.equals(qefVar) || DM_SYNC_DISABLED.equals(qefVar) || DM_ADMIN_BLOCKED.equals(qefVar) || DM_ADMIN_PENDING_APPROVAL.equals(qefVar) || DM_STALE_SYNC_REQUIRED.equals(qefVar) || DM_DEACTIVATED.equals(qefVar) || DM_REQUIRED.equals(qefVar) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(qefVar) || DM_SCREENLOCK_REQUIRED.equals(qefVar);
    }
}
