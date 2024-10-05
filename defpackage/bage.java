package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bage extends ICronetEngineBuilder {
    private static final Pattern o = Pattern.compile("^[0-9\\.]*$");
    public final Context a;
    public boolean d;
    public String e;
    public String f;
    public boolean j;
    public int k;
    public long l;
    public String m;
    public boolean n;
    public final List b = new LinkedList();
    public final List c = new LinkedList();
    private int p = 20;
    public boolean g = true;
    public boolean h = true;
    public boolean i = false;

    public bage(Context context) {
        this.a = context.getApplicationContext();
        e(0, 0L);
        this.n = false;
        this.d = true;
    }

    public final int a(int i) {
        int i2 = this.p;
        return i2 == 20 ? i : i2;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        c(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        d(str, i, i2);
        return this;
    }

    public baim b() {
        return null;
    }

    public final void d(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
        }
        this.b.add(new bagd(str, i, i2));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        e(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.n = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public void f(CronetEngine.Builder.LibraryLoader libraryLoader) {
    }

    public final void g(String str) {
        if (new File(str).isDirectory()) {
            this.f = str;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return baik.a(this.a);
    }

    public final void h(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.p = i;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.m = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        f(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        g(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        h(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r6, long r7) {
        /*
            r5 = this;
            r0 = 3
            r1 = 2
            if (r6 == r0) goto L15
            if (r6 != r1) goto L8
            r6 = 2
            goto L15
        L8:
            java.lang.String r2 = r5.f
            if (r2 != 0) goto Ld
            goto L19
        Ld:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Storage path must not be set"
            r6.<init>(r7)
            throw r6
        L15:
            java.lang.String r2 = r5.f
            if (r2 == 0) goto L42
        L19:
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L23
            if (r6 != r1) goto L21
            r6 = 2
            goto L23
        L21:
            r4 = 0
            goto L24
        L23:
            r4 = 1
        L24:
            r5.j = r4
            r5.l = r7
            if (r6 == 0) goto L3f
            if (r6 == r3) goto L3c
            if (r6 == r1) goto L39
            if (r6 != r0) goto L31
            goto L39
        L31:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unknown cache mode"
            r6.<init>(r7)
            throw r6
        L39:
            r5.k = r3
            return
        L3c:
            r5.k = r1
            return
        L3f:
            r5.k = r2
            return
        L42:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Storage path must be set"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bage.e(int, long):void");
    }

    public final void c(String str, Set set, boolean z, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        }
        if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        }
        if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        }
        if (o.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
        try {
            String ascii = IDN.toASCII(str, 2);
            HashMap hashMap = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr != null && bArr.length == 32) {
                    hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                } else {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
            }
            this.c.add(new bagc(ascii, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()]), z, date));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }
}
