package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amjx extends AtomicInteger {
    public final String a;
    public final int b;
    public final amip c;
    public int d;
    public amjx e;
    public volatile int f;
    private final amjx g;

    public amjx(amjx amjxVar, String str, int i, amip amipVar) {
        this.f = 0;
        this.g = amjxVar;
        this.a = str;
        this.d = -1;
        this.b = i;
        this.c = amipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        amjx amjxVar = this.g;
        if (amjxVar == null) {
            return -1;
        }
        return amjxVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, amjx amjxVar) {
        this.d = i;
        this.e = amjxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.f != 0;
    }

    public amjx(String str, amip amipVar) {
        this.f = 0;
        this.g = null;
        this.a = str;
        this.d = 0;
        this.b = 0;
        this.c = amipVar;
        this.f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }
}
