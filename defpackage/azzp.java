package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzp {
    private static final int a = b(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f A[EDGE_INSN: B:50:0x010f->B:51:0x010f BREAK  A[LOOP:3: B:40:0x00b4->B:81:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:3: B:40:0x00b4->B:81:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable a(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzp.a(java.lang.Throwable):java.lang.Throwable");
    }

    private static final int b(Class cls, int i) {
        Object l;
        cls.getClass();
        azup.a(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                l = aype.l(th);
            }
        } while (cls != null);
        l = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (true == (l instanceof azsa)) {
            l = valueOf;
        }
        return ((Number) l).intValue();
    }
}
