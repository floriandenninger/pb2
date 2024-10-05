package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dor {
    private static int i;
    public dos a;
    public double e;
    public final doq b = new doq();
    public final doq c = new doq();
    public final doq d = new doq();
    public boolean f = true;
    public double g = 0.0d;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public dor() {
        i++;
        this.a = dos.a;
    }

    public final boolean a() {
        if (Math.abs(this.b.b) <= 0.005d) {
            if (Math.abs(this.e - this.b.a) <= 0.005d || this.a.d == 0.0d) {
                return true;
            }
        }
        return false;
    }

    public final void b(double d) {
        if (this.e == d && a()) {
            return;
        }
        this.e = d;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((dot) it.next()).c();
        }
    }
}
