package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ypg implements ypb {
    public final Method a;
    private final WeakReference b;
    private final int c;

    public ypg(Object obj, Method method) {
        this.b = new WeakReference(obj);
        method.getClass();
        this.a = method;
        method.setAccessible(true);
        this.c = Arrays.hashCode(new Object[]{obj, method});
    }

    @Override // defpackage.ypb
    public final void a(Object obj) {
        Object obj2 = this.b.get();
        if (obj2 == null) {
            return;
        }
        try {
            this.a.invoke(obj2, obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ypg) {
            ypg ypgVar = (ypg) obj;
            if (ypgVar.b.get() == this.b.get() && this.a.equals(ypgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
