package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axau implements awzw {
    private final CronetEngine a;
    private final shf b;
    private final ExecutorService c;

    public axau(CronetEngine cronetEngine, shf shfVar, ExecutorService executorService) {
        this.a = cronetEngine;
        this.b = shfVar;
        executorService.getClass();
        this.c = executorService;
    }

    @Override // defpackage.awzw
    public final axam a(String str, String str2, awzx awzxVar, awzu awzuVar) {
        str.getClass();
        str2.getClass();
        return new axaz(str, str2, awzxVar, this.a, this.c, new axaw(this.c), awzuVar != null ? new axbb(this.c, awzuVar) : null);
    }
}
