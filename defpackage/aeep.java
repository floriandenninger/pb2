package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeep extends IOException {
    public aeep() {
        super("Transfer timed out.");
    }

    public aeep(Throwable th) {
        super("[Offline] Thumbnail transfer timed out.", th);
    }
}
