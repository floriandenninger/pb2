package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmx extends axna {
    final Logger a;

    public axmx(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // defpackage.axna
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }

    @Override // defpackage.axna
    public final void b(String str) {
        this.a.logp(Level.SEVERE, "com.googlecode.mp4parser.util.JuliLogger", "logError", str);
    }

    @Override // defpackage.axna
    public final void c(String str) {
        this.a.logp(Level.WARNING, "com.googlecode.mp4parser.util.JuliLogger", "logWarn", str);
    }
}
