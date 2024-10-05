package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axan {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);

    public final boolean g;

    axan(boolean z) {
        this.g = z;
    }
}
