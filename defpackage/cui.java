package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cui implements cuc {
    private final File b;
    private coy d;
    private final cug c = new cug();
    private final cup a = new cup();

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public cui(File file) {
        this.b = file;
    }

    private final synchronized coy c() {
        if (this.d == null) {
            File file = this.b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    coy.f(file2, file3, false);
                }
            }
            coy coyVar = new coy(file);
            if (coyVar.b.exists()) {
                try {
                    coyVar.d();
                    coy.c(coyVar.c);
                    Iterator it = coyVar.g.values().iterator();
                    while (it.hasNext()) {
                        cow cowVar = (cow) it.next();
                        if (cowVar.f == null) {
                            for (int i = 0; i < coyVar.d; i = 1) {
                                coyVar.e += cowVar.b[0];
                            }
                        } else {
                            cowVar.f = null;
                            for (int i2 = 0; i2 < coyVar.d; i2 = 1) {
                                coy.c(cowVar.c());
                                coy.c(cowVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    String valueOf = String.valueOf(file);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    coyVar.close();
                    cpb.b(coyVar.a);
                }
                this.d = coyVar;
            }
            file.mkdirs();
            coyVar = new coy(file);
            coyVar.e();
            this.d = coyVar;
        }
        return this.d;
    }

    @Override // defpackage.cuc
    public final File a(cqi cqiVar) {
        try {
            cox a = c().a(this.a.a(cqiVar));
            if (a != null) {
                return a.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.cuc
    public final void b(cqi cqiVar, crz crzVar) {
        cuf cufVar;
        cug cugVar;
        coy c;
        File d;
        String a = this.a.a(cqiVar);
        cug cugVar2 = this.c;
        synchronized (cugVar2) {
            cufVar = (cuf) cugVar2.a.get(a);
            if (cufVar == null) {
                akau akauVar = cugVar2.b;
                synchronized (akauVar.a) {
                    cufVar = (cuf) akauVar.a.poll();
                }
                if (cufVar == null) {
                    cufVar = new cuf();
                }
                cugVar2.a.put(a, cufVar);
            }
            cufVar.b++;
        }
        cufVar.a.lock();
        try {
            try {
                c = c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (c.a(a) == null) {
                cov i = c.i(a);
                if (i == null) {
                    throw new IllegalStateException(a.length() != 0 ? "Had two simultaneous puts for: ".concat(a) : new String("Had two simultaneous puts for: "));
                }
                try {
                    synchronized (i.d) {
                        cow cowVar = i.a;
                        if (cowVar.f == i) {
                            if (!cowVar.e) {
                                i.b[0] = true;
                            }
                            d = cowVar.d();
                            i.d.a.mkdirs();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (crzVar.a.a(crzVar.b, d, crzVar.c)) {
                        i.d.b(i, true);
                        i.c = true;
                    }
                    cugVar = this.c;
                    cugVar.a(a);
                } finally {
                    i.b();
                }
            }
            cugVar = this.c;
            cugVar.a(a);
        } catch (Throwable th) {
            this.c.a(a);
            throw th;
        }
    }
}
