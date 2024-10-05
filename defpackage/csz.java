package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csz extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private cqi c;
    private Class d;
    private String e;
    private int f;

    public csz(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List list) {
        if (th instanceof csz) {
            Iterator it = ((csz) th).b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        List list = this.b;
        csy csyVar = new csy(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                csyVar.append("Cause (");
                int i2 = i + 1;
                csyVar.append(String.valueOf(i2));
                csyVar.append(" of ");
                csyVar.append(String.valueOf(size));
                csyVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof csz) {
                    ((csz) th).e(csyVar);
                } else {
                    d(th, csyVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(cqi cqiVar, int i, Class cls) {
        this.c = cqiVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String str3 = "";
        if (cls != null) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f;
        if (i != 0) {
            String i2 = ach.i(i);
            StringBuilder sb3 = new StringBuilder(i2.length() + 2);
            sb3.append(", ");
            sb3.append(i2);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        cqi cqiVar = this.c;
        if (cqiVar != null) {
            String valueOf2 = String.valueOf(cqiVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public csz(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
