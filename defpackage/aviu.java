package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aviu implements aonq {
    TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN(0),
    TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING(1),
    TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING(2),
    TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE(3),
    TRANSCRIPT_SEARCH_STATE_VALUE_FAILED(4);

    public final int f;

    aviu(int i) {
        this.f = i;
    }

    public static aons a() {
        return avhw.d;
    }

    public static aviu b(int i) {
        if (i == 0) {
            return TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN;
        }
        if (i == 1) {
            return TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING;
        }
        if (i == 2) {
            return TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING;
        }
        if (i == 3) {
            return TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE;
        }
        if (i != 4) {
            return null;
        }
        return TRANSCRIPT_SEARCH_STATE_VALUE_FAILED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
