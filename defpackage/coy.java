package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class coy implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cou());
    private final Callable n = new cot(this);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public coy(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(File file, File file2, boolean z) {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void k() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void l(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized cox a(String str) {
        k();
        cow cowVar = (cow) this.g.get(str);
        if (cowVar == null) {
            return null;
        }
        if (!cowVar.e) {
            return null;
        }
        File[] fileArr = cowVar.c;
        int length = fileArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!fileArr[0].exists()) {
                return null;
            }
        }
        this.h++;
        this.f.append((CharSequence) "READ");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        if (h()) {
            this.i.submit(this.n);
        }
        return new cox(cowVar.c);
    }

    public final synchronized void b(cov covVar, boolean z) {
        cow cowVar = covVar.a;
        if (cowVar.f != covVar) {
            throw new IllegalStateException();
        }
        if (z && !cowVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (covVar.b[0]) {
                    if (!cowVar.d().exists()) {
                        covVar.a();
                        return;
                    }
                } else {
                    covVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File d = cowVar.d();
            if (z) {
                if (d.exists()) {
                    File c = cowVar.c();
                    d.renameTo(c);
                    long j = cowVar.b[0];
                    long length = c.length();
                    cowVar.b[0] = length;
                    this.e = (this.e - j) + length;
                }
            } else {
                c(d);
            }
        }
        this.h++;
        cowVar.f = null;
        if (cowVar.e | z) {
            cowVar.e = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) cowVar.a);
            this.f.append((CharSequence) cowVar.a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            this.g.remove(cowVar.a);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) cowVar.a);
            this.f.append('\n');
        }
        m(this.f);
        if (this.e > this.l || h()) {
            this.i.submit(this.n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cov covVar = ((cow) arrayList.get(i)).f;
            if (covVar != null) {
                covVar.a();
            }
        }
        g();
        l(this.f);
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        if (r4.length() == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012b, code lost:
    
        r4 = "unexpected journal line: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        throw new java.io.IOException(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0130, code lost:
    
        r4 = new java.lang.String("unexpected journal line: ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coy.d():void");
    }

    public final synchronized void e() {
        Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), cpb.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (cow cowVar : this.g.values()) {
                if (cowVar.f == null) {
                    String str = cowVar.a;
                    String a = cowVar.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(a).length());
                    sb.append("CLEAN ");
                    sb.append(str);
                    sb.append(a);
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                } else {
                    String str2 = cowVar.a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                    sb2.append("DIRTY ");
                    sb2.append(str2);
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                }
            }
            l(bufferedWriter);
            if (this.b.exists()) {
                f(this.b, this.j, true);
            }
            f(this.c, this.b, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), cpb.a));
        } catch (Throwable th) {
            l(bufferedWriter);
            throw th;
        }
    }

    public final void g() {
        while (this.e > this.l) {
            j((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean h() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized cov i(String str) {
        k();
        cow cowVar = (cow) this.g.get(str);
        if (cowVar == null) {
            cowVar = new cow(this, str);
            this.g.put(str, cowVar);
        } else if (cowVar.f != null) {
            return null;
        }
        cov covVar = new cov(this, cowVar);
        cowVar.f = covVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return covVar;
    }

    public final synchronized void j(String str) {
        k();
        cow cowVar = (cow) this.g.get(str);
        if (cowVar == null || cowVar.f != null) {
            return;
        }
        for (int i = 0; i < this.d; i = 1) {
            File c = cowVar.c();
            if (c.exists() && !c.delete()) {
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
            long j = this.e;
            long[] jArr = cowVar.b;
            this.e = j - jArr[0];
            jArr[0] = 0;
        }
        this.h++;
        this.f.append((CharSequence) "REMOVE");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        this.g.remove(str);
        if (h()) {
            this.i.submit(this.n);
        }
    }
}
