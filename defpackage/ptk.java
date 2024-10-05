package defpackage;

import java.util.Collections;
import java.util.PriorityQueue;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptk {
    private final Object a = new Object();
    private final PriorityQueue b = new PriorityQueue(10, Collections.reverseOrder());
    private int c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            int i2 = this.c;
            if (i2 != i) {
                throw new ptj(i, i2);
            }
        }
    }

    public final void c(int i) {
        int intValue;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                intValue = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            } else {
                Integer num = (Integer) this.b.peek();
                int i2 = pts.a;
                intValue = num.intValue();
            }
            this.c = intValue;
            this.a.notifyAll();
        }
    }

    public final void d() {
        synchronized (this.a) {
            while (this.c != -10) {
                this.a.wait();
            }
        }
    }
}
