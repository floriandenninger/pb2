package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avep {
    PREFETCH_CONFIG,
    CONFIG_NOT_SET;

    public static avep a(int i) {
        if (i == 0) {
            return CONFIG_NOT_SET;
        }
        if (i != 6) {
            return null;
        }
        return PREFETCH_CONFIG;
    }
}
