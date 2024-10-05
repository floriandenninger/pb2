package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqsb implements aonq {
    EMBEDS_AD_EVENT_TYPE_UNKNOWN(0),
    EMBEDS_AD_EVENT_TYPE_AD_STARTED(1),
    EMBEDS_AD_EVENT_TYPE_AD_COMPLETED(2),
    EMBEDS_AD_EVENT_TYPE_AD_SKIPPED(3),
    EMBEDS_AD_EVENT_TYPE_AD_CLICKED(4),
    EMBEDS_AD_EVENT_TYPE_AD_PAUSED(5),
    EMBEDS_AD_EVENT_TYPE_AD_RESUMED(6),
    EMBEDS_AD_EVENT_TYPE_AD_SUSPENDED(7);

    public final int i;

    aqsb(int i) {
        this.i = i;
    }

    public static aons a() {
        return aqkw.u;
    }

    public static aqsb b(int i) {
        switch (i) {
            case 0:
                return EMBEDS_AD_EVENT_TYPE_UNKNOWN;
            case 1:
                return EMBEDS_AD_EVENT_TYPE_AD_STARTED;
            case 2:
                return EMBEDS_AD_EVENT_TYPE_AD_COMPLETED;
            case 3:
                return EMBEDS_AD_EVENT_TYPE_AD_SKIPPED;
            case 4:
                return EMBEDS_AD_EVENT_TYPE_AD_CLICKED;
            case 5:
                return EMBEDS_AD_EVENT_TYPE_AD_PAUSED;
            case 6:
                return EMBEDS_AD_EVENT_TYPE_AD_RESUMED;
            case 7:
                return EMBEDS_AD_EVENT_TYPE_AD_SUSPENDED;
            default:
                return null;
        }
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
