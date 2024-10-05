package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aohx implements aonq {
    SYSTEM_EVENT_UNSPECIFIED(0),
    LOGIN_ACCOUNTS_CHANGED(1),
    TIMEZONE_CHANGED(2),
    LOCALE_CHANGED(3),
    PHENOTYPE_CHANGED(4),
    BOOT_COMPLETED(5),
    APP_UPDATED(6),
    SCHEDULED_JOB(7);

    public final int i;

    aohx(int i) {
        this.i = i;
    }

    public static aohx a(int i) {
        switch (i) {
            case 0:
                return SYSTEM_EVENT_UNSPECIFIED;
            case 1:
                return LOGIN_ACCOUNTS_CHANGED;
            case 2:
                return TIMEZONE_CHANGED;
            case 3:
                return LOCALE_CHANGED;
            case 4:
                return PHENOTYPE_CHANGED;
            case 5:
                return BOOT_COMPLETED;
            case 6:
                return APP_UPDATED;
            case 7:
                return SCHEDULED_JOB;
            default:
                return null;
        }
    }

    public static aons b() {
        return aogu.t;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
