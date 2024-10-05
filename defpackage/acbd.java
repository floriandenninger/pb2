package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Random;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbd implements acbl, acbu {
    public SocketChannel a;
    public acbc b;
    public int c;
    public int d;
    public acbp e;
    public acbv f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public MediaFormat j;
    public MediaFormat k;
    private final Context l;
    private final abzz m;
    private final Handler n;
    private final boolean o;
    private int p;
    private final long q;

    public acbd(Context context, String str, int i, abzz abzzVar, boolean z, boolean z2, int i2, long j) {
        SocketChannel socketChannel = (SocketChannel) SocketChannel.open().configureBlocking(false);
        this.p = 10;
        this.c = -1;
        this.d = -1;
        socketChannel.getClass();
        zhq.m(str);
        this.l = context;
        this.o = z;
        this.g = z2;
        this.q = j;
        this.a = socketChannel;
        this.m = abzzVar;
        if (Looper.myLooper() != null) {
            this.n = new Handler(Looper.myLooper());
        } else {
            this.n = new Handler(Looper.getMainLooper());
        }
        Socket socket = socketChannel.socket();
        if (socket != null) {
            try {
                socket.setTcpNoDelay(true);
                socket.setTrafficClass(16);
                if (i2 > 0) {
                    socket.setSendBufferSize(i2 * 8192);
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", "Could not set socket options", e);
            }
            socket.getTrafficClass();
            socket.getTcpNoDelay();
            socket.getReceiveBufferSize();
            socket.getSendBufferSize();
            socket.getSoTimeout();
        }
        this.a.connect(new InetSocketAddress(str, i < 0 ? 1935 : i));
    }

    public final int a() {
        int i = this.p;
        this.p = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int b() {
        acbv acbvVar = this.f;
        if (acbvVar == null) {
            return -1;
        }
        int i = 0;
        if (acbvVar.p) {
            try {
                i = acbvVar.c.available();
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("RtmpOutputStream", valueOf.length() != 0 ? "Could not determine bytes available in buffer: ".concat(valueOf) : new String("Could not determine bytes available in buffer: "));
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Pair c() {
        Pair pair;
        acbv acbvVar = this.f;
        if (acbvVar == null) {
            return null;
        }
        if (acbvVar.p) {
            pair = new Pair(Integer.valueOf((int) (acbvVar.g - acbvVar.h)), Integer.valueOf(acbvVar.r));
            acbvVar.r = 0;
        } else {
            int i = (int) (acbvVar.g - acbvVar.h);
            acbvVar.r = i;
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(acbvVar.r));
        }
        acbvVar.h = acbvVar.g;
        return pair;
    }

    public final synchronized void d() {
        if (this.h) {
            return;
        }
        if (!this.a.isConnected()) {
            Selector open = Selector.open();
            this.a.register(open, 8);
            int select = open.select(8000L);
            open.close();
            if (select != 1) {
                throw new TimeoutException("RTMP connect timed out");
            }
            if (!this.a.finishConnect()) {
                throw new IOException("RTMP finish connect failed");
            }
            if (!this.a.isConnected()) {
                throw new IOException("RTMP connect failed");
            }
        }
        acbp acbpVar = new acbp(this.a);
        this.e = acbpVar;
        Handler handler = this.n;
        acbpVar.g = this;
        acbpVar.h = handler;
        boolean z = this.o && !this.g;
        Context context = this.l;
        SocketChannel socketChannel = this.a;
        abzz abzzVar = this.m;
        boolean z2 = this.g;
        long j = this.q;
        acbf a = acbf.a(context);
        acba acbaVar = z ? new acba() : null;
        acbv acbvVar = new acbv(context, socketChannel, abzzVar, z2, j, a, z ? new acbb(acbaVar) : null, acbaVar);
        this.f = acbvVar;
        Handler handler2 = this.n;
        acbvVar.n = this;
        acbvVar.o = handler2;
        this.a.configureBlocking(true);
        acbv acbvVar2 = this.f;
        acbvVar2.a.put((byte) 3);
        acbvVar2.g(acbvVar2.a);
        byte[] bArr = new byte[1528];
        acbv acbvVar3 = this.f;
        amkq.E(true);
        acbvVar3.a.putInt(0);
        acbvVar3.a.putInt(0);
        acbvVar3.g(acbvVar3.a);
        new Random(acbvVar3.e.g()).nextBytes(bArr);
        acbvVar3.g(ByteBuffer.wrap(bArr));
        this.f.a();
        this.a.configureBlocking(false);
        Selector open2 = Selector.open();
        this.a.register(open2, 1);
        if (open2.select(5000L) != 1) {
            throw new TimeoutException("RTMP handshake S0/S1 timed out");
        }
        open2.close();
        this.a.configureBlocking(true);
        byte a2 = this.e.a();
        if (a2 == 3) {
            this.a.configureBlocking(false);
            Selector open3 = Selector.open();
            this.a.register(open3, 1);
            if (open3.select(5000L) != 1) {
                throw new TimeoutException("RTMP handshake S0/S1 timed out");
            }
            open3.close();
            this.a.configureBlocking(true);
            int d = this.e.d();
            long g = this.m.g();
            this.f.h(d);
            this.f.h((int) g);
            this.e.d();
            for (int i = 8; i < 1536; i += 4) {
                this.f.h(this.e.d());
            }
            this.f.a();
            this.a.configureBlocking(false);
            Selector open4 = Selector.open();
            this.a.register(open4, 1);
            if (open4.select(5000L) != 1) {
                throw new TimeoutException("RTMP handshake S0/S1 timed out");
            }
            open4.close();
            this.a.configureBlocking(true);
            acbp acbpVar2 = this.e;
            amkq.E(true);
            int d2 = acbpVar2.d();
            if (d2 != 0) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Timestamp mismatch in S2: ");
                sb.append(d2);
                sb.append(" != 0");
                throw new ProtocolException(sb.toString());
            }
            acbpVar2.d();
            for (int i2 = 0; i2 < 1528; i2++) {
                byte a3 = acbpVar2.a();
                byte b = bArr[i2];
                if (a3 != b) {
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Data mismatch in S2: ");
                    sb2.append((int) a3);
                    sb2.append(" != ");
                    sb2.append((int) b);
                    throw new ProtocolException(sb2.toString());
                }
            }
            acbp acbpVar3 = this.e;
            synchronized (acbpVar3.k) {
                if (acbpVar3.b == null) {
                    acbpVar3.c = false;
                    acbpVar3.b = new Thread(acbpVar3.l, "rtmpInput");
                    acbpVar3.b.start();
                }
            }
            acbv acbvVar4 = this.f;
            synchronized (acbvVar4.s) {
                if (acbvVar4.l == null) {
                    if (acbvVar4.p) {
                        acbvVar4.l = new acbt(acbvVar4);
                        acbvVar4.l.start();
                        acbvVar4.q = true;
                    }
                    acbvVar4.m = false;
                }
            }
            this.h = true;
            return;
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("Unknown RTMP version: ");
        sb3.append((int) a2);
        throw new ProtocolException(sb3.toString());
    }

    public final synchronized void e() {
        if (this.h) {
            acbp acbpVar = this.e;
            synchronized (acbpVar.k) {
                acbpVar.c = true;
            }
            acbv acbvVar = this.f;
            synchronized (acbvVar.s) {
                acbvVar.m = true;
            }
            this.a.close();
            acbp acbpVar2 = this.e;
            amkq.N(acbpVar2.c);
            synchronized (acbpVar2.k) {
                if (acbpVar2.b != null) {
                    while (true) {
                        try {
                            acbpVar2.b.join(200L);
                            break;
                        } catch (InterruptedException unused) {
                        }
                    }
                    Thread thread = acbpVar2.b;
                    if (thread != null && thread.isAlive()) {
                        acbpVar2.b.interrupt();
                        while (true) {
                            try {
                                acbpVar2.b.join(200L);
                                break;
                            } catch (InterruptedException unused2) {
                            }
                        }
                        Thread thread2 = acbpVar2.b;
                        if (thread2 != null && !thread2.isAlive()) {
                            acbpVar2.b = null;
                        }
                    }
                    Thread thread3 = acbpVar2.b;
                }
            }
            acbv acbvVar2 = this.f;
            amkq.N(acbvVar2.m);
            synchronized (acbvVar2.s) {
                if (acbvVar2.l != null) {
                    while (true) {
                        try {
                            acbvVar2.l.join(200L);
                            break;
                        } catch (InterruptedException unused3) {
                        }
                    }
                    Thread thread4 = acbvVar2.l;
                    if (thread4 != null && thread4.isAlive()) {
                        acbvVar2.l.interrupt();
                        while (true) {
                            try {
                                acbvVar2.l.join(200L);
                                break;
                            } catch (InterruptedException unused4) {
                            }
                        }
                        Thread thread5 = acbvVar2.l;
                        if (thread5 != null && !thread5.isAlive()) {
                            acbvVar2.l = null;
                        }
                    }
                }
            }
            this.h = false;
            this.i = false;
        }
    }

    public final synchronized void f() {
        if (this.h) {
            e();
        }
        this.a = null;
        this.e = null;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(int i) {
        acbv acbvVar = this.f;
        if (acbvVar == null || !acbvVar.p) {
            return;
        }
        acbvVar.c.b(i);
    }
}
