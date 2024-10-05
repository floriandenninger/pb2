package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayrf extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;

    public ayrf(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof ayrf) {
                    linkedHashSet.addAll(((ayrf) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        int size = unmodifiableList.size();
        StringBuilder sb = new StringBuilder(33);
        sb.append(size);
        sb.append(" exceptions occurred. ");
        this.b = sb.toString();
    }

    private final void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private final void b(ayrc ayrcVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        ayrcVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            ayrb ayrbVar = new ayrb();
            HashSet hashSet = new HashSet();
            ayrb ayrbVar2 = ayrbVar;
            for (Throwable th : this.a) {
                if (!hashSet.contains(th)) {
                    hashSet.add(th);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = th.getCause();
                    if (cause != null && cause != th) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th2 : arrayList) {
                        if (hashSet.contains(th2)) {
                            th = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        ayrbVar2.initCause(th);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = ayrbVar2.getCause();
                    if (cause3 != null && ayrbVar2 != cause3) {
                        do {
                            ayrbVar2 = cause3;
                            cause3 = ayrbVar2.getCause();
                            if (cause3 != null) {
                            }
                        } while (cause3 != ayrbVar2);
                    }
                }
            }
            this.c = ayrbVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new ayrd(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new ayre(printWriter));
    }

    public ayrf(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
