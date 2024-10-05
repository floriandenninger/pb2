package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axrr {
    Continuation(0),
    Text(1),
    Binary(2),
    Close(8),
    Ping(9),
    Pong(10);

    public final byte g;

    axrr(int i) {
        this.g = (byte) i;
    }

    public final boolean a() {
        return this == Close || this == Ping || this == Pong;
    }
}
