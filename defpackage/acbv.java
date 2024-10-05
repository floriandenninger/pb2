package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbv {
    public final ByteBuffer a;
    public final acba c;
    public final acbw d;
    public final abzz e;
    public long g;
    public long h;
    public final String i;
    public boolean j;
    public final boolean k;
    public Thread l;
    public volatile boolean m;
    public acbu n;
    public Handler o;
    public final boolean p;
    public boolean q;
    public int r;
    public final Object s;
    private final SocketChannel t;
    private final acbb u;
    private int v;
    private int w;
    private final byte[] x;
    private final byte[] y;
    public final acaz b = new acaz();
    public int f = 128;

    public acbv(Context context, SocketChannel socketChannel, abzz abzzVar, boolean z, long j, acbw acbwVar, acbb acbbVar, acba acbaVar) {
        ByteBuffer.allocate(128);
        this.v = 256;
        boolean z2 = false;
        this.w = 0;
        this.j = true;
        this.s = new Object();
        this.x = new byte[3];
        this.y = new byte[8192];
        this.u = acbbVar;
        this.c = acbaVar;
        abzzVar.getClass();
        this.e = abzzVar;
        this.k = z;
        socketChannel.getClass();
        this.t = socketChannel;
        this.d = acbwVar;
        ByteBuffer allocate = ByteBuffer.allocate(36);
        this.a = allocate;
        allocate.order(ByteOrder.BIG_ENDIAN);
        this.q = false;
        if (acbaVar != null && acbbVar != null) {
            z2 = true;
        }
        this.p = z2;
        this.i = adyu.cN(context, "RTMP", j, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void i(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        k(byteBuffer, 0, i);
        boolean c = acbq.c(i2);
        if (c) {
            byteBuffer.put((byte) -1);
            byteBuffer.put((byte) -1);
            byteBuffer.put((byte) -1);
        } else {
            byteBuffer.put((byte) ((i2 >> 16) & PrivateKeyType.INVALID));
            byteBuffer.put((byte) ((i2 >> 8) & PrivateKeyType.INVALID));
            byteBuffer.put((byte) (i2 & PrivateKeyType.INVALID));
        }
        if (!acbq.d(i3)) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Invalid length for RTMP message: ");
            sb.append(i3);
            throw new ProtocolException(sb.toString());
        }
        byteBuffer.put((byte) ((i3 >> 16) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) ((i3 >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (i3 & PrivateKeyType.INVALID));
        byteBuffer.put((byte) i4);
        byteBuffer.put((byte) i5);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        if (c) {
            byteBuffer.putInt(i2);
        }
    }

    private final synchronized void j(final Throwable th) {
        Handler handler = this.o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: acbs
                @Override // java.lang.Runnable
                public final void run() {
                    acbv acbvVar = acbv.this;
                    Throwable th2 = th;
                    acbu acbuVar = acbvVar.n;
                    if (acbuVar != null) {
                        Log.e("RtmpConnection", "RTMP output stream experienced an error", th2);
                        acbc acbcVar = ((acbd) acbuVar).b;
                        if (acbcVar != null) {
                            acbcVar.p();
                        }
                    }
                }
            });
        }
    }

    private static final void k(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put((byte) ((i << 6) | i2));
    }

    public final void a() {
        OutputStream outputStream;
        if (this.t.socket() == null || (outputStream = this.t.socket().getOutputStream()) == null) {
            return;
        }
        outputStream.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[Catch: all -> 0x007f, TryCatch #7 {all -> 0x007f, blocks: (B:49:0x004e, B:51:0x0052, B:36:0x0068, B:38:0x006c, B:39:0x0071, B:3:0x000c, B:5:0x0010, B:7:0x0019, B:8:0x002a, B:10:0x0032, B:12:0x0036, B:14:0x003c), top: B:2:0x000c, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            java.lang.String r0 = "Exception closing piped input: "
            java.lang.String r1 = "RtmpOutputStream"
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)
        Lc:
            boolean r5 = r7.m     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            if (r5 != 0) goto L42
            acba r5 = r7.c     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            r6 = 0
            int r5 = r5.read(r3, r6, r2)     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            if (r5 < 0) goto L42
            java.nio.Buffer r6 = r4.position(r6)     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            java.nio.Buffer r6 = r4.limit(r5)     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            int r6 = r7.r     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            int r6 = r6 + r5
            r7.r = r6     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
        L2a:
            java.nio.channels.SocketChannel r5 = r7.t     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            boolean r5 = r5.isConnected()     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            if (r5 == 0) goto Lc
            boolean r5 = r7.m     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            if (r5 != 0) goto Lc
            int r5 = r4.remaining()     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            if (r5 <= 0) goto Lc
            java.nio.channels.SocketChannel r5 = r7.t     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            r5.write(r4)     // Catch: java.lang.Throwable -> L4d java.io.InterruptedIOException -> L65 java.nio.channels.ClosedByInterruptException -> L67
            goto L2a
        L42:
            acba r2 = r7.c     // Catch: java.lang.Exception -> L48
            r2.close()     // Catch: java.lang.Exception -> L48
            return
        L48:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
            return
        L4d:
            r2 = move-exception
            boolean r3 = r7.m     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L5a
            java.lang.String r3 = "Unexpected throwable in writer loop: "
            android.util.Log.e(r1, r3, r2)     // Catch: java.lang.Throwable -> L7f
            r7.j(r2)     // Catch: java.lang.Throwable -> L7f
        L5a:
            acba r2 = r7.c     // Catch: java.lang.Exception -> L60
            r2.close()     // Catch: java.lang.Exception -> L60
            return
        L60:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
            return
        L65:
            r2 = move-exception
            goto L68
        L67:
            r2 = move-exception
        L68:
            boolean r3 = r7.m     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L71
            java.lang.String r3 = "IO exception in network thread: "
            android.util.Log.e(r1, r3, r2)     // Catch: java.lang.Throwable -> L7f
        L71:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7f
            acba r2 = r7.c     // Catch: java.lang.Exception -> L7a
            r2.close()     // Catch: java.lang.Exception -> L7a
            return
        L7a:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
            return
        L7f:
            r2 = move-exception
            acba r3 = r7.c     // Catch: java.lang.Exception -> L86
            r3.close()     // Catch: java.lang.Exception -> L86
            goto L8a
        L86:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
        L8a:
            goto L8c
        L8b:
            throw r2
        L8c:
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbv.b():void");
    }

    public final void c(ByteBuffer byteBuffer, byte[] bArr, int i, int i2, int i3) {
        int length = bArr.length;
        int remaining = byteBuffer.remaining() + length;
        if (byteBuffer.position() != 0) {
            remaining += 4;
        }
        i(this.a, i, i3, remaining, i2, 1);
        int i4 = length + 4;
        if (this.f <= i4) {
            throw new ProtocolException("Chunk size is too small to hold FLV control tag and size");
        }
        this.a.put(bArr);
        int remaining2 = byteBuffer.remaining();
        if (byteBuffer.position() != 0) {
            this.a.putInt(remaining2);
            length = i4;
        }
        g(this.a);
        k(this.a, 3, i);
        while (remaining2 > 0) {
            int min = Math.min(remaining2, this.f - length);
            g(byteBuffer);
            remaining2 -= min;
            if (remaining2 > 0) {
                g(this.a);
            }
            length = 0;
        }
        f(remaining);
    }

    public final void d(int i, int i2) {
        if (i < 256) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Ignoring small window size: ");
            sb.append(i);
            Log.e("RtmpOutputStream", sb.toString());
            return;
        }
        if (i2 == 2) {
            if (this.w != 0) {
                return;
            } else {
                i2 = 0;
            }
        }
        if (i2 == 0) {
            this.v = i;
        } else if (i2 == 1) {
            this.v = Math.min(this.v, i);
        } else {
            Log.e("RtmpOutputStream", "Ignoring unrecognized window size limit type");
            return;
        }
        this.w = i2;
        amkq.E(true);
        i(this.a, 2, 0, 4, 5, 0);
        this.a.putInt(i);
        g(this.a);
        f(4);
    }

    public final void e(ByteBuffer byteBuffer) {
        byteBuffer.get(this.x, 0, 3);
        byte[] bArr = this.x;
        if (bArr[0] != 0 || bArr[1] != 0) {
            return;
        }
        byte b = bArr[2];
        if (b == 1) {
            return;
        }
        if (b != 0) {
        } else if (byteBuffer.get() != 1) {
            throw new ProtocolException("Unexpected value in NALU header");
        }
    }

    public final void f(int i) {
        this.g += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ByteBuffer byteBuffer) {
        if (!this.q || !this.p) {
            while (!this.m && byteBuffer.remaining() > 0) {
                if (this.t.isConnected()) {
                    this.t.write(byteBuffer);
                } else {
                    throw new IOException("socket closed");
                }
            }
            return;
        }
        while (!this.m && byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), 8192);
            byteBuffer.get(this.y, 0, min);
            this.u.write(this.y, 0, min);
        }
    }

    public final void h(int i) {
        this.a.putInt(i);
        g(this.a);
    }
}
