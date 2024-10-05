package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aycg {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        return this == UNARY || this == SERVER_STREAMING;
    }
}
