package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public enum xce {
    VIDEO_ENDED("1"),
    VIDEO_ERROR("2"),
    AD_VIDEO_TIMEOUT("2"),
    USER_SKIPPED("3"),
    USER_MUTED("4"),
    SURVEY_ENDED("5"),
    ENDCAP_ENDED("6"),
    AD_CHOICE_INTRO_ENDED("7"),
    AUTO_SKIPPED_ON_ENTER("8"),
    NO_AD("9");

    public final String k;

    xce(String str) {
        this.k = str;
    }
}
