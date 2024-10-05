package defpackage;

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axrj implements Closeable {
    public final axrh a;
    public boolean c;
    private final String d;
    private final InputStream e;
    private final long f;
    private final Map g = new axrg(this);
    public final Map b = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public axrj(axrh axrhVar, String str, InputStream inputStream, long j) {
        this.a = axrhVar;
        this.d = str;
        if (inputStream == null) {
            this.e = new ByteArrayInputStream(new byte[0]);
            this.f = 0L;
        } else {
            this.e = inputStream;
            this.f = j;
        }
        this.c = true;
    }

    protected static final void d(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.b.get(str.toLowerCase());
    }

    public final void b(String str, String str2) {
        this.g.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(OutputStream outputStream) {
        String str;
        boolean z;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        try {
            if (this.a == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            Pattern pattern = axqz.a;
            String str2 = this.d;
            String str3 = "";
            if (str2 != null) {
                str3 = axqz.a(str2, axqz.a, "", 1);
                str = axqz.a(str2, axqz.b, null, 2);
            } else {
                str = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(str3)) {
                axqz.a(str2, axqz.c, null, 2);
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, axqz.b(str))), false);
            PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
            axrh axrhVar = this.a;
            int i = ((axri) axrhVar).w;
            String str4 = ((axri) axrhVar).x;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 12);
            sb.append(i);
            sb.append(" ");
            sb.append(str4);
            append.append((CharSequence) sb.toString()).append((CharSequence) " \r\n");
            String str5 = this.d;
            if (str5 != null) {
                d(printWriter, "Content-Type", str5);
            }
            if (a("date") == null) {
                d(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.g.entrySet()) {
                d(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (a("connection") == null) {
                d(printWriter, "Connection", true != this.c ? "close" : "keep-alive");
            }
            a("content-length");
            long j = this.e != null ? this.f : 0L;
            String a = a("content-length");
            if (a != null) {
                try {
                    j = Long.parseLong(a);
                } catch (NumberFormatException unused) {
                    axrm.h.severe(a.length() != 0 ? "content-length was no number ".concat(a) : new String("content-length was no number "));
                }
            }
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Content-Length: ");
            sb2.append(j);
            sb2.append("\r\n");
            printWriter.print(sb2.toString());
            printWriter.append((CharSequence) "\r\n");
            printWriter.flush();
            byte[] bArr = new byte[16384];
            boolean z2 = j == -1;
            while (true) {
                if (j > 0) {
                    z = z2;
                } else if (!z2) {
                    break;
                } else {
                    z = true;
                }
                long j2 = 16384;
                if (!z) {
                    j2 = Math.min(j, 16384L);
                }
                int read = this.e.read(bArr, 0, (int) j2);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                if (!z) {
                    j -= read;
                }
            }
            outputStream.flush();
            axrm.l(this.e);
        } catch (IOException e) {
            axrm.h.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
