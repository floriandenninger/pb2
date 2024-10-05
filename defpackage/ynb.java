package defpackage;

import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ynb extends Semaphore {
    public ynb() {
        super(0);
    }

    public final void a() {
        int availablePermits = availablePermits();
        int i = -availablePermits;
        if (i > 0) {
            release(i);
        } else if (i < 0) {
            reducePermits(availablePermits);
        }
    }
}
