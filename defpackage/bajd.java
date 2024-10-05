package defpackage;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajd implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine a;

    public bajd(ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new baja(this.a);
        }
        return null;
    }
}
