package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfk extends anez {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new anfj());
        }
        try {
            c = unsafe.objectFieldOffset(anfm.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(anfm.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(anfm.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(anfl.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(anfl.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e3) {
            amnz.f(e3);
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.anez
    public final void a(anfl anflVar, anfl anflVar2) {
        a.putObject(anflVar, f, anflVar2);
    }

    @Override // defpackage.anez
    public final void b(anfl anflVar, Thread thread) {
        a.putObject(anflVar, e, thread);
    }

    @Override // defpackage.anez
    public final boolean c(anfm anfmVar, anfd anfdVar, anfd anfdVar2) {
        return a.compareAndSwapObject(anfmVar, b, anfdVar, anfdVar2);
    }

    @Override // defpackage.anez
    public final boolean d(anfm anfmVar, Object obj, Object obj2) {
        return a.compareAndSwapObject(anfmVar, d, obj, obj2);
    }

    @Override // defpackage.anez
    public final boolean e(anfm anfmVar, anfl anflVar, anfl anflVar2) {
        return a.compareAndSwapObject(anfmVar, c, anflVar, anflVar2);
    }
}
