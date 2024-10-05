package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum haw {
    PUSH,
    POP;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional a(int i) {
        if (i < 0 || i >= values().length) {
            return Optional.empty();
        }
        return Optional.of(values()[i]);
    }
}
