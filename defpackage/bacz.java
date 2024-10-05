package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bacz {
    static {
        Logger.getLogger(bacz.class.getName());
    }

    private bacz() {
    }

    public static bacw a(badh badhVar) {
        return new badd(badhVar);
    }

    public static badh b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new bacy(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
