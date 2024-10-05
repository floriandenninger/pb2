package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkb extends Exception {
    public final amru a;

    private tkb(String str, Throwable th, amru amruVar) {
        super(str, th);
        this.a = amruVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? a(cause) : th;
    }

    public static void b(Collection collection, Object... objArr) {
        Iterator it = collection.iterator();
        amrp amrpVar = null;
        while (it.hasNext()) {
            try {
                anaf.W((anhy) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (amrpVar == null) {
                    amrpVar = amru.f();
                }
                amrpVar.h(a(e));
            }
        }
        if (amrpVar == null) {
            return;
        }
        amru g = amrpVar.g();
        String format = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i = ((amvj) g).c;
        if (i > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 34);
            sb.append(format);
            sb.append("\n");
            sb.append(i);
            sb.append(" failure(s) in total:\n");
            String sb2 = sb.toString();
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    if (sb2 != null) {
                        try {
                            printWriter.println(sb2);
                        } catch (Throwable th) {
                            try {
                                printWriter.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    int i2 = 0;
                    while (i2 < ((amvj) g).c) {
                        Throwable th2 = (Throwable) g.get(i2);
                        i2++;
                        printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                        printWriter.println(c(th2, 1));
                    }
                    printWriter.println("-------------------------------------------");
                    format = stringWriter.toString();
                    printWriter.close();
                    stringWriter.close();
                } catch (Throwable th3) {
                    try {
                        stringWriter.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                String valueOf = String.valueOf(th4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb3.append("Failed to build string from throwables: ");
                sb3.append(valueOf);
                format = sb3.toString();
            }
        }
        throw new tkb(format, (Throwable) g.get(0), g);
    }

    private static String c(Throwable th, int i) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
        sb.append(name);
        sb.append(": ");
        sb.append(message);
        String sb2 = sb.toString();
        Throwable cause = th.getCause();
        if (cause == null) {
            return sb2;
        }
        if (i >= 5) {
            return String.valueOf(sb2).concat("\n(...)");
        }
        String c = c(cause, i + 1);
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12 + String.valueOf(c).length());
        sb3.append(sb2);
        sb3.append("\nCaused by: ");
        sb3.append(c);
        return sb3.toString();
    }
}
