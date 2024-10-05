package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvy implements cnd {
    private ymf a;
    private final File b;
    private final int c;

    public yvy(File file, int i) {
        this.b = new File(String.valueOf(file.getAbsolutePath()).concat("/volleyCache"));
        this.c = i;
    }

    static int g(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    static long h(InputStream inputStream) {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((255 & m(inputStream)) << 56);
    }

    static String i(InputStream inputStream) {
        return new String(n(inputStream, (int) h(inputStream)), "UTF-8");
    }

    static void j(OutputStream outputStream, int i) {
        outputStream.write(i & PrivateKeyType.INVALID);
        outputStream.write((i >> 8) & PrivateKeyType.INVALID);
        outputStream.write((i >> 16) & PrivateKeyType.INVALID);
        outputStream.write((i >> 24) & PrivateKeyType.INVALID);
    }

    static void k(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        k(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    private static int m(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static byte[] n(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected ");
        sb.append(i);
        sb.append(" bytes, read ");
        sb.append(i2);
        sb.append(" bytes");
        throw new IOException(sb.toString());
    }

    private static final String o(String str) {
        return String.valueOf(str.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    @Override // defpackage.cnd
    public final synchronized cnc a(String str) {
        InputStream inputStream;
        ymf ymfVar = this.a;
        ?? r1 = 0;
        try {
            if (ymfVar == null) {
                return null;
            }
            try {
                yme a = this.a.a(o(str));
                if (a != null) {
                    inputStream = a.a[0];
                    try {
                        yvx yvxVar = new yvx();
                        if (g(inputStream) != 538181937) {
                            throw new IOException();
                        }
                        yvxVar.a = g(inputStream);
                        yvxVar.b = i(inputStream);
                        yvxVar.c = i(inputStream);
                        if (yvxVar.c.equals("")) {
                            yvxVar.c = null;
                        }
                        yvxVar.d = h(inputStream);
                        yvxVar.e = h(inputStream);
                        yvxVar.f = h(inputStream);
                        yvxVar.g = h(inputStream);
                        int g = g(inputStream);
                        Map emptyMap = g == 0 ? Collections.emptyMap() : new adz(g);
                        for (int i = 0; i < g; i++) {
                            emptyMap.put(i(inputStream).intern(), i(inputStream).intern());
                        }
                        yvxVar.h = emptyMap;
                        if (!yvxVar.b.equals(str)) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    zga.d("VolleyDiskCache.get", e);
                                }
                            }
                            return null;
                        }
                        byte[] n = n(inputStream, yvxVar.a);
                        cnc cncVar = new cnc();
                        cncVar.a = n;
                        cncVar.b = yvxVar.c;
                        cncVar.d = yvxVar.d;
                        cncVar.c = yvxVar.e;
                        cncVar.e = yvxVar.f;
                        cncVar.f = yvxVar.g;
                        cncVar.g = yvxVar.h;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                zga.d("VolleyDiskCache.get", e2);
                            }
                        }
                        return cncVar;
                    } catch (IOException e3) {
                        e = e3;
                        zga.d("VolleyDiskCache.get", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                zga.d("VolleyDiskCache.get", e4);
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        zga.d("VolleyDiskCache.get", e6);
                    }
                }
                throw th;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = ymfVar;
        }
    }

    @Override // defpackage.cnd
    public final synchronized void b() {
        ymf ymfVar = this.a;
        if (ymfVar != null) {
            try {
                ymfVar.e();
            } catch (IOException e) {
                zga.d("VolleyDiskCache.clear", e);
            } finally {
                this.a = null;
            }
        }
    }

    @Override // defpackage.cnd
    public final synchronized void d(String str, cnc cncVar) {
        ymb ymbVar;
        if (this.a == null) {
            return;
        }
        ymb ymbVar2 = null;
        try {
            try {
                ymc k = this.a.k(o(str));
                if (k == null) {
                    zga.b("VolleyDiskCache.put failed -- could not edit cache file");
                    return;
                }
                synchronized (k.c) {
                    ymd ymdVar = k.a;
                    if (ymdVar.d != k) {
                        throw new IllegalStateException();
                    }
                    ymbVar = new ymb(k, new FileOutputStream(ymdVar.d()));
                }
                try {
                    try {
                        cncVar.g.put("VolleyDiskCache", "VolleyDiskCache");
                        yvx yvxVar = new yvx(str, cncVar);
                        try {
                            j(ymbVar, 538181937);
                            j(ymbVar, yvxVar.a);
                            l(ymbVar, yvxVar.b);
                            String str2 = yvxVar.c;
                            if (str2 == null) {
                                str2 = "";
                            }
                            l(ymbVar, str2);
                            k(ymbVar, yvxVar.d);
                            k(ymbVar, yvxVar.e);
                            k(ymbVar, yvxVar.f);
                            k(ymbVar, yvxVar.g);
                            Map map = yvxVar.h;
                            if (map != null) {
                                j(ymbVar, map.size());
                                for (Map.Entry entry : map.entrySet()) {
                                    l(ymbVar, (String) entry.getKey());
                                    l(ymbVar, (String) entry.getValue());
                                }
                            } else {
                                j(ymbVar, 0);
                            }
                            ymbVar.flush();
                        } catch (IOException unused) {
                        }
                        ymbVar.write(cncVar.a);
                        if (k.b) {
                            k.c.d(k, false);
                            k.c.m(k.a.a);
                        } else {
                            k.c.d(k, true);
                        }
                        try {
                            ymbVar.close();
                        } catch (IOException e) {
                            zga.d("VolleyDiskCache.put", e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        ymbVar2 = ymbVar;
                        if (ymbVar2 != null) {
                            try {
                                ymbVar2.close();
                            } catch (IOException e2) {
                                zga.d("VolleyDiskCache.put", e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    ymbVar2 = ymbVar;
                    zga.d("VolleyDiskCache.put", e);
                    if (ymbVar2 != null) {
                        try {
                            ymbVar2.close();
                        } catch (IOException e4) {
                            zga.d("VolleyDiskCache.put", e4);
                        }
                    }
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.cnd
    public final synchronized void e(String str) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.m(o(str));
        } catch (IOException e) {
            zga.d("VolleyDiskCache.remove", e);
        }
    }

    @Override // defpackage.cnd
    public final synchronized void f(String str) {
        cnc a = a(str);
        if (a != null) {
            a.f = 0L;
            a.e = 0L;
            d(str, a);
        }
    }

    @Override // defpackage.cnd
    public final synchronized void c() {
        if (this.a != null) {
            return;
        }
        try {
            this.a = ymf.l(this.b, this.c);
        } catch (IOException e) {
            throw new RuntimeException("Couldn't initialize volley disk cache", e);
        }
    }
}
