package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahx extends baig {
    public static final String a = "bahx";
    public final bahu b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public String i;
    public baiq j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public baij o;
    public String p;
    public HttpURLConnection q;
    public bahe r;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean s = new AtomicBoolean(false);
    public volatile int l = -1;

    public bahx(UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        this.h = z;
        this.b = new bahu(this, callback, executor2);
        this.c = new bahw(new bahj(executor, z2 ? i : TrafficStats.getThreadStatsTag(), z3, i2));
        this.m = str;
        this.d = str2;
    }

    private final void n() {
        int i = this.g.get();
        if (i == 0) {
            return;
        }
        throw new IllegalStateException("Request is already started. State is: " + i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0024. Please report as an issue. */
    @Override // defpackage.baig
    public final void a(String str, String str2) {
        int i;
        n();
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                    switch (charAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            i = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? 0 : i + 1;
                                            break;
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.e.containsKey(str)) {
                    this.e.remove(str);
                }
                this.e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public final Runnable b(bahy bahyVar) {
        return new bahn(this, bahyVar, 0);
    }

    public final Runnable c(bahy bahyVar) {
        return new bahn(this, bahyVar, 1);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            j();
            i();
            bahu bahuVar = this.b;
            baij baijVar = this.o;
            bahuVar.d.d();
            bahuVar.b.execute(new bahs(bahuVar, baijVar, 1));
        }
    }

    public final void d() {
        this.c.execute(new bahi(this, 0));
    }

    public final void e(CronetException cronetException) {
        int i;
        do {
            i = this.g.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!this.g.compareAndSet(i, 6));
        j();
        i();
        bahu bahuVar = this.b;
        baij baijVar = this.o;
        bahuVar.d.d();
        baht bahtVar = new baht(bahuVar, baijVar, cronetException);
        try {
            bahuVar.b.execute(bahtVar);
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = bahuVar.c;
            if (executor != null) {
                executor.execute(bahtVar);
            }
        }
    }

    public final void f(Throwable th) {
        e(new bafu("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        m(3, 1, new bahi(this, 3));
    }

    @Override // defpackage.baig
    public final void g(String str) {
        n();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method " + str);
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + i);
        }
        this.b.b.execute(new baho(new VersionSafeCallbacks$UrlRequestStatusListener(statusListener), i2, 0));
    }

    @Override // defpackage.baig
    public final void h(UploadDataProvider uploadDataProvider, Executor executor) {
        if (!this.e.containsKey("Content-Type")) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        n();
        if (this.i == null) {
            this.i = "POST";
        }
        this.j = new baiq(uploadDataProvider);
        if (this.h) {
            this.k = executor;
        } else {
            this.k = new baia(executor);
        }
    }

    public final void i() {
        if (this.j == null || !this.s.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(c(new bahk(this, 0)));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j() {
        this.c.execute(new bahi(this, 1));
    }

    public final void k() {
        this.l = 13;
        this.c.execute(b(new bahk(this, 1)));
    }

    public final void l() {
        this.c.execute(b(new bahk(this, 2)));
    }

    public final void m(int i, int i2, Runnable runnable) {
        if (!this.g.compareAndSet(i, i2)) {
            int i3 = this.g.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + i3);
        }
        runnable.run();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        ayeq.r(byteBuffer);
        ayeq.s(byteBuffer);
        m(4, 5, new bahh(this, byteBuffer));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        m(0, 1, new bahi(this, 2));
    }
}
