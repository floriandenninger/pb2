package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azsy implements Serializable, azsq, aztb {
    private final azsq completion;

    public azsy(azsq azsqVar) {
        this.completion = azsqVar;
    }

    public azsq create(Object obj, azsq azsqVar) {
        azsqVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.aztb
    public aztb getCallerFrame() {
        azsq azsqVar = this.completion;
        if (true != (azsqVar instanceof aztb)) {
            azsqVar = null;
        }
        return (aztb) azsqVar;
    }

    public final azsq getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aztb
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        aztc aztcVar = (aztc) getClass().getAnnotation(aztc.class);
        if (aztcVar == null) {
            return null;
        }
        int a = aztcVar.a();
        if (a <= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.getClass();
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (true != (obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            int i2 = i >= 0 ? aztcVar.e()[i] : -1;
            aztd aztdVar = azte.b;
            if (aztdVar == null) {
                try {
                    aztd aztdVar2 = new aztd(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    azte.b = aztdVar2;
                    aztdVar = aztdVar2;
                } catch (Exception unused2) {
                    aztdVar = azte.a;
                    azte.b = aztdVar;
                }
            }
            if (aztdVar != azte.a && (method = aztdVar.a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aztdVar.b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
                Method method3 = aztdVar.c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                r1 = true == (invoke3 instanceof String) ? invoke3 : null;
            }
            if (r1 == null) {
                str = aztcVar.b();
            } else {
                str = r1 + '/' + aztcVar.b();
            }
            return new StackTraceElement(str, aztcVar.d(), aztcVar.c(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.").toString());
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // defpackage.azsq
    public final void resumeWith(Object obj) {
        azsy azsyVar = this;
        while (true) {
            azsq azsqVar = azsyVar.completion;
            azsqVar.getClass();
            try {
                obj = azsyVar.invokeSuspend(obj);
                if (obj == azsx.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = aype.l(th);
            }
            azsyVar.releaseIntercepted();
            if (azsqVar instanceof azsy) {
                azsyVar = (azsy) azsqVar;
            } else {
                azsqVar.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public azsq create(azsq azsqVar) {
        azsqVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
}
