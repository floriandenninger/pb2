package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum owg implements aonq {
    AUDIO_ROUTE_UNSPECIFIED(0),
    AUDIO_ROUTE_MUSIC(1),
    AUDIO_ROUTE_ALARM(2);

    public final int d;

    owg(int i) {
        this.d = i;
    }

    public static owg a(int i) {
        if (i == 0) {
            return AUDIO_ROUTE_UNSPECIFIED;
        }
        if (i == 1) {
            return AUDIO_ROUTE_MUSIC;
        }
        if (i != 2) {
            return null;
        }
        return AUDIO_ROUTE_ALARM;
    }

    public static aons b() {
        return dvg.m;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
