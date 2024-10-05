package defpackage;

import j$.net.URLDecoder;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axrm {
    public static final Pattern e = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    public static final Pattern f = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    public static final Pattern g = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger h = Logger.getLogger(axrm.class.getName());
    public final String i;
    public volatile ServerSocket j;
    public Thread k;
    protected final axrb l = new axrb();

    public axrm(String str) {
        this.i = str;
    }

    public static axrj i(axrh axrhVar, String str, InputStream inputStream, long j) {
        return new axrj(axrhVar, str, inputStream, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String j(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            h.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e2);
            return null;
        }
    }

    public static final void l(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e2) {
                h.log(Level.SEVERE, "Could not close", (Throwable) e2);
            }
        }
    }

    public static axrj n(axrh axrhVar, String str) {
        byte[] bArr;
        Pattern pattern = axqz.a;
        String str2 = "text/plain";
        String a = axqz.a("text/plain", axqz.a, "", 1);
        String a2 = axqz.a("text/plain", axqz.b, null, 2);
        if ("multipart/form-data".equalsIgnoreCase(a)) {
            axqz.a("text/plain", axqz.c, null, 2);
        }
        if (str == null) {
            return i(axrhVar, "text/plain", new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(axqz.b(a2)).newEncoder().canEncode(str) && a2 == null) {
                String a3 = axqz.a("text/plain; charset=UTF-8", axqz.a, "", 1);
                String a4 = axqz.a("text/plain; charset=UTF-8", axqz.b, null, 2);
                if ("multipart/form-data".equalsIgnoreCase(a3)) {
                    axqz.a("text/plain; charset=UTF-8", axqz.c, null, 2);
                }
                a2 = a4;
                str2 = "text/plain; charset=UTF-8";
            }
            bArr = str.getBytes(axqz.b(a2));
        } catch (UnsupportedEncodingException e2) {
            h.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e2);
            bArr = new byte[0];
        }
        return i(axrhVar, str2, new ByteArrayInputStream(bArr), bArr.length);
    }

    public axrj a(axrf axrfVar) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public final synchronized void k() {
        f();
    }

    public final boolean m() {
        return (this.j == null || this.k == null || this.j.isClosed() || !this.k.isAlive()) ? false : true;
    }
}
