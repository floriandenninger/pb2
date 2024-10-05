package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akeh {
    protected final Random c = new Random();
    protected final AtomicInteger a = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();

    public final String a() {
        return String.format("%04X", Integer.valueOf((char) this.a.get()));
    }

    public final String b() {
        return String.format("%04X+%02X", Integer.valueOf((char) this.a.get()), Integer.valueOf(this.b.get() & PrivateKeyType.INVALID));
    }

    public final void c() {
        this.a.set(this.c.nextInt(65536));
    }
}
