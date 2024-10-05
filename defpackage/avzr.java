package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avzr implements aonq {
    VIDEO_QUALITY_SETTING_UNKNOWN(0),
    VIDEO_QUALITY_SETTING_HIGHER_QUALITY(1),
    VIDEO_QUALITY_SETTING_DATA_SAVER(2),
    VIDEO_QUALITY_SETTING_ADVANCED_MENU(3);

    public final int e;

    avzr(int i) {
        this.e = i;
    }

    public static aons a() {
        return avya.d;
    }

    public static avzr b(int i) {
        if (i == 0) {
            return VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        if (i == 1) {
            return VIDEO_QUALITY_SETTING_HIGHER_QUALITY;
        }
        if (i == 2) {
            return VIDEO_QUALITY_SETTING_DATA_SAVER;
        }
        if (i != 3) {
            return null;
        }
        return VIDEO_QUALITY_SETTING_ADVANCED_MENU;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
