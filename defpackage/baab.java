package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baab {
    private static final String a;

    static {
        Object l;
        Object l2;
        try {
            l = Class.forName("azsy").getCanonicalName();
        } catch (Throwable th) {
            l = aype.l(th);
        }
        if (azsb.a(l) != null) {
            l = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) l;
        try {
            l2 = Class.forName("baab").getCanonicalName();
        } catch (Throwable th2) {
            l2 = aype.l(th2);
        }
        if (azsb.a(l2) != null) {
            l2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }

    public static final Throwable a(Throwable th, aztb aztbVar) {
        azrz k;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause == null || !azul.c(cause.getClass(), th.getClass())) {
            k = aype.k(th, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (c(stackTrace[i2])) {
                        k = aype.k(cause, stackTrace);
                        break;
                    }
                    i2++;
                } else {
                    k = aype.k(th, new StackTraceElement[0]);
                    break;
                }
            }
        }
        Throwable th2 = (Throwable) k.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) k.b;
        Throwable a2 = azzp.a(th2);
        if (a2 == null || (!(th2 instanceof azwg) && !azul.c(a2.getMessage(), th2.getMessage()))) {
            a2 = null;
        }
        if (a2 == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = aztbVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (true != (aztbVar instanceof aztb)) {
                aztbVar = null;
            }
            aztbVar = aztbVar == null ? null : aztbVar.getCallerFrame();
            if (aztbVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = aztbVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                }
                if (c(stackTraceElementArr[i3])) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    int i5 = length3 - 1;
                    StackTraceElement stackTraceElement3 = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && azul.c(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && azul.c(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && azul.c(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3 = i5;
                }
            }
        }
        arrayDeque.addFirst(new StackTraceElement(azul.a("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1));
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        String str = a;
        int length4 = stackTrace2.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length4) {
                i6 = -1;
                break;
            }
            if (azul.c(str, stackTrace2[i6].getClassName())) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            a2.setStackTrace((StackTraceElement[]) array);
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + i6];
            if (i6 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    stackTraceElementArr2[i7] = stackTrace2[i7];
                    if (i8 >= i6) {
                        break;
                    }
                    i7 = i8;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + i6] = (StackTraceElement) it.next();
                i++;
            }
            a2.setStackTrace(stackTraceElementArr2);
        }
        return a2;
    }

    public static final Throwable b(Throwable th) {
        th.getClass();
        Throwable cause = th.getCause();
        if (cause != null && azul.c(cause.getClass(), th.getClass())) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (c(stackTraceElement)) {
                    return cause;
                }
            }
        }
        return th;
    }

    public static final boolean c(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        return className.startsWith("\b\b\b");
    }
}
