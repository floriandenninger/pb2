package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymf implements Closeable {
    public final File a;
    public Writer c;
    public int d;
    private final File e;
    private final File f;
    private final long h;
    private long i = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long k = 0;
    private final ExecutorService l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable m = new Callable() { // from class: yma
        @Override // java.util.concurrent.Callable
        public final Object call() {
            ymf ymfVar = ymf.this;
            synchronized (ymfVar) {
                if (ymfVar.c == null) {
                    return null;
                }
                ymfVar.i();
                if (ymfVar.j()) {
                    ymfVar.h();
                    ymfVar.d = 0;
                }
                return null;
            }
        }
    };
    private final int g = 538181937;
    public final int b = 1;

    static {
        Charset.forName("UTF-8");
    }

    private ymf(File file, long j) {
        this.a = file;
        this.e = new File(file, "journal");
        this.f = new File(file, "journal.tmp");
        this.h = j;
    }

    public static String b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    f(file2);
                }
                if (!file2.delete()) {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
        sb2.append("not a directory: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static ymf l(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        ymf ymfVar = new ymf(file, j);
        if (ymfVar.e.exists()) {
            try {
                ymfVar.p();
                o(ymfVar.f);
                Iterator it = ymfVar.j.values().iterator();
                while (it.hasNext()) {
                    ymd ymdVar = (ymd) it.next();
                    if (ymdVar.d == null) {
                        for (int i = 0; i < ymfVar.b; i = 1) {
                            ymfVar.i += ymdVar.b[0];
                        }
                    } else {
                        ymdVar.d = null;
                        for (int i2 = 0; i2 < ymfVar.b; i2 = 1) {
                            o(ymdVar.a(0));
                            o(ymdVar.d());
                        }
                        it.remove();
                    }
                }
                ymfVar.c = new BufferedWriter(new FileWriter(ymfVar.e, true), 8192);
                return ymfVar;
            } catch (IOException e) {
                zga.n("Disk cache journal is corrupt", e);
                ymfVar.e();
            }
        }
        file.mkdirs();
        ymf ymfVar2 = new ymf(file, j);
        ymfVar2.h();
        return ymfVar2;
    }

    private final void n() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void o(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        if (r0.length() == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        r0 = "unexpected journal line: ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        throw new java.io.IOException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
    
        r0 = new java.lang.String("unexpected journal line: ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymf.p():void");
    }

    private static final void q(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
            sb.append("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final synchronized yme a(String str) {
        n();
        q(str);
        ymd ymdVar = (ymd) this.j.get(str);
        if (ymdVar == null) {
            return null;
        }
        if (!ymdVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.b];
        for (int i = 0; i < this.b; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(ymdVar.a(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.d++;
        Writer writer = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append("READ ");
        sb.append(str);
        sb.append('\n');
        writer.append((CharSequence) sb.toString());
        if (j()) {
            this.l.submit(this.m);
        }
        return new yme(inputStreamArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.j.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ymc ymcVar = ((ymd) arrayList.get(i)).d;
            if (ymcVar != null) {
                ymcVar.a();
            }
        }
        i();
        this.c.close();
        this.c = null;
    }

    public final synchronized void d(ymc ymcVar, boolean z) {
        ymd ymdVar = ymcVar.a;
        if (ymdVar.d != ymcVar) {
            throw new IllegalStateException();
        }
        if (z && !ymdVar.c) {
            for (int i = 0; i < this.b; i = 1) {
                if (!ymdVar.d().exists()) {
                    ymcVar.a();
                    throw new IllegalStateException("edit didn't create file 0");
                }
            }
        }
        for (int i2 = 0; i2 < this.b; i2 = 1) {
            File d = ymdVar.d();
            if (z) {
                if (d.exists()) {
                    File a = ymdVar.a(0);
                    d.renameTo(a);
                    long j = ymdVar.b[0];
                    long length = a.length();
                    ymdVar.b[0] = length;
                    this.i = (this.i - j) + length;
                }
            } else {
                o(d);
            }
        }
        this.d++;
        ymdVar.d = null;
        if (!ymdVar.c) {
            if (!z) {
                this.j.remove(ymdVar.a);
                Writer writer = this.c;
                String str = ymdVar.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                sb.append("REMOVE ");
                sb.append(str);
                sb.append('\n');
                writer.write(sb.toString());
                g();
                if (this.i <= this.h || j()) {
                    this.l.submit(this.m);
                }
                return;
            }
            z = true;
        }
        ymdVar.c = true;
        Writer writer2 = this.c;
        String str2 = ymdVar.a;
        String b = ymdVar.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(b).length());
        sb2.append("CLEAN ");
        sb2.append(str2);
        sb2.append(b);
        sb2.append('\n');
        writer2.write(sb2.toString());
        if (z) {
            this.k++;
        }
        g();
        if (this.i <= this.h) {
        }
        this.l.submit(this.m);
    }

    public final void e() {
        close();
        f(this.a);
    }

    public final synchronized void g() {
        n();
        i();
        this.c.flush();
    }

    public final synchronized void h() {
        Writer writer = this.c;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f), 8192);
        bufferedWriter.write("com.google.android.libraries.youtube.common.cache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (ymd ymdVar : this.j.values()) {
            if (ymdVar.d == null) {
                String str = ymdVar.a;
                String b = ymdVar.b();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(b).length());
                sb.append("CLEAN ");
                sb.append(str);
                sb.append(b);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                String str2 = ymdVar.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                sb2.append("DIRTY ");
                sb2.append(str2);
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        this.f.renameTo(this.e);
        this.c = new BufferedWriter(new FileWriter(this.e, true), 8192);
    }

    public final void i() {
        while (this.i > this.h) {
            m((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean j() {
        int i = this.d;
        return i >= 2000 && i >= this.j.size();
    }

    public final synchronized ymc k(String str) {
        n();
        q(str);
        ymd ymdVar = (ymd) this.j.get(str);
        if (ymdVar == null) {
            ymdVar = new ymd(this, str);
            this.j.put(str, ymdVar);
        } else if (ymdVar.d != null) {
            return null;
        }
        ymc ymcVar = new ymc(this, ymdVar);
        ymdVar.d = ymcVar;
        Writer writer = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("DIRTY ");
        sb.append(str);
        sb.append('\n');
        writer.write(sb.toString());
        this.c.flush();
        return ymcVar;
    }

    public final synchronized void m(String str) {
        n();
        q(str);
        ymd ymdVar = (ymd) this.j.get(str);
        if (ymdVar == null || ymdVar.d != null) {
            return;
        }
        for (int i = 0; i < this.b; i = 1) {
            File a = ymdVar.a(0);
            if (a.delete()) {
                long j = this.i;
                long[] jArr = ymdVar.b;
                this.i = j - jArr[0];
                jArr[0] = 0;
            } else {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
        this.d++;
        Writer writer = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8);
        sb2.append("REMOVE ");
        sb2.append(str);
        sb2.append('\n');
        writer.append((CharSequence) sb2.toString());
        this.j.remove(str);
        if (j()) {
            this.l.submit(this.m);
        }
    }
}
