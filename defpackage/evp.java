package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum evp implements aonq {
    BACKGROUND_AUDIO_POLICY_UNSPECIFIED(0),
    BACKGROUND_AUDIO_POLICY_ON(1),
    BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES(2),
    BACKGROUND_AUDIO_POLICY_OFF(3);

    public final int e;

    evp(int i) {
        this.e = i;
    }

    public static evp a(int i) {
        if (i == 0) {
            return BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
        }
        if (i == 1) {
            return BACKGROUND_AUDIO_POLICY_ON;
        }
        if (i == 2) {
            return BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES;
        }
        if (i != 3) {
            return null;
        }
        return BACKGROUND_AUDIO_POLICY_OFF;
    }

    public static aons b() {
        return dvg.i;
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
