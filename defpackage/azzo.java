package defpackage;

import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzo extends azum implements aztu {
    final /* synthetic */ Constructor a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azzo(Constructor constructor, int i) {
        super(1);
        this.b = i;
        this.a = constructor;
    }

    @Override // defpackage.aztu
    public final /* synthetic */ Object a(Object obj) {
        Object l;
        Object newInstance;
        Object l2;
        Object newInstance2;
        Object obj2;
        Object newInstance3;
        Object obj3;
        Object newInstance4;
        int i = this.b;
        if (i == 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            try {
                newInstance = this.a.newInstance(th);
            } catch (Throwable th2) {
                l = aype.l(th2);
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            l = (Throwable) newInstance;
            return (Throwable) (true != (l instanceof azsa) ? l : null);
        }
        if (i == 1) {
            Throwable th3 = (Throwable) obj;
            th3.getClass();
            try {
                newInstance2 = this.a.newInstance(th3.getMessage(), th3);
            } catch (Throwable th4) {
                l2 = aype.l(th4);
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            l2 = (Throwable) newInstance2;
            return (Throwable) (true != (l2 instanceof azsa) ? l2 : null);
        }
        if (i != 2) {
            Throwable th5 = (Throwable) obj;
            th5.getClass();
            try {
                newInstance4 = this.a.newInstance(new Object[0]);
            } catch (Throwable th6) {
                obj3 = aype.l(th6);
            }
            if (newInstance4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th7 = (Throwable) newInstance4;
            th7.initCause(th5);
            obj3 = th7;
            return (Throwable) (true != (obj3 instanceof azsa) ? obj3 : null);
        }
        Throwable th8 = (Throwable) obj;
        th8.getClass();
        try {
            newInstance3 = this.a.newInstance(th8.getMessage());
        } catch (Throwable th9) {
            obj2 = aype.l(th9);
        }
        if (newInstance3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
        Throwable th10 = (Throwable) newInstance3;
        th10.initCause(th8);
        obj2 = th10;
        return (Throwable) (true != (obj2 instanceof azsa) ? obj2 : null);
    }
}
