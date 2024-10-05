package defpackage;

import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbp {
    public Thread b;
    public volatile boolean c;
    public acbl g;
    public volatile Handler h;
    public int i;
    public int j;
    private final SocketChannel n;
    private final ByteBuffer o;
    private volatile int q;
    private boolean r;
    private final ExecutorService m = Executors.newCachedThreadPool();
    public final ByteBuffer a = ByteBuffer.allocate(11);
    public final SparseArray d = new SparseArray();
    private final SparseArray p = new SparseArray();
    public int e = 128;
    public ByteBuffer f = ByteBuffer.allocate(128);
    public final Object k = new Object();
    public final Runnable l = new acbh(this);

    public acbp(SocketChannel socketChannel) {
        this.n = socketChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        this.o = allocate;
        allocate.order(ByteOrder.BIG_ENDIAN);
    }

    public final byte a() {
        g(this.o);
        return this.o.get();
    }

    public final int b(acbm acbmVar) {
        amkq.N(this.f.capacity() == this.e);
        int i = acbmVar.g;
        if (i == 0) {
            i = acbmVar.b;
            acbmVar.g = i;
            acbmVar.f = true;
        }
        int min = Math.min(i, this.e);
        if (min > 0) {
            k(this.f, 0, min);
        }
        int i2 = acbmVar.g - min;
        acbmVar.g = i2;
        if (i2 <= 0) {
            acbmVar.g = 0;
            acbmVar.f = false;
        }
        return min;
    }

    public final int c(acbm acbmVar) {
        String str;
        if (acbmVar.g == 0) {
            acbmVar.g = acbmVar.b;
        }
        byte[] bArr = acbmVar.i;
        if (bArr == null || bArr.length < acbmVar.b) {
            acbmVar.i = new byte[acbmVar.b];
            acbmVar.j = ByteBuffer.wrap(acbmVar.i);
            acbmVar.k = new ByteArrayInputStream(acbmVar.i);
            acbmVar.l = new DataInputStream(acbmVar.k);
        }
        int min = Math.min(acbmVar.g, this.e);
        if (min > 0) {
            k(acbmVar.j, acbmVar.b - acbmVar.g, min);
        }
        int i = acbmVar.g - min;
        acbmVar.g = i;
        if (i <= 0) {
            acbmVar.g = 0;
            acbmVar.k.reset();
            DataInputStream dataInputStream = acbmVar.l;
            try {
                adyu.cA(2, dataInputStream);
                str = dataInputStream.readUTF();
            } catch (ProtocolException unused) {
                Log.e("RtmpInputStream", "Skipping AMF message without a command");
                str = null;
            }
            if ("_result".equals(str)) {
                int cx = (int) adyu.cx(dataInputStream);
                acbn acbnVar = (acbn) this.p.get(cx);
                if (acbnVar == null) {
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("No pending transaction: ");
                    sb.append(cx);
                    Log.e("RtmpInputStream", sb.toString());
                } else {
                    acbnVar.a = new acbo();
                    acbnVar.a.a = 0;
                    Object cy = adyu.cy(dataInputStream);
                    Object cy2 = adyu.cy(dataInputStream);
                    if (cy != null || !(cy2 instanceof Double)) {
                        if ((cy instanceof Map) && (cy2 instanceof Map)) {
                            Map map = (Map) cy2;
                            Object obj = map.get("level");
                            Object obj2 = map.get("code");
                            if ((obj instanceof String) && "status".equals(obj) && (obj2 instanceof String)) {
                                acbnVar.a.b = (String) obj2;
                            }
                        }
                    } else {
                        acbnVar.a.c = ((Double) cy2).intValue();
                    }
                    acbnVar.b.countDown();
                }
            } else if ("onStatus".equals(str)) {
                acbn acbnVar2 = (acbn) this.p.get(2);
                if (acbnVar2 == null) {
                    Log.e("RtmpInputStream", "No pending transaction: 2");
                } else {
                    acbnVar2.a = new acbo();
                    acbnVar2.a.a = 0;
                    adyu.cx(dataInputStream);
                    adyu.cA(5, dataInputStream);
                    adyu.cA(3, dataInputStream);
                    Map cz = adyu.cz(dataInputStream);
                    Object obj3 = cz.get("level");
                    Object obj4 = cz.get("code");
                    if ((obj3 instanceof String) && "status".equals(obj3) && (obj4 instanceof String)) {
                        acbnVar2.a.b = (String) obj4;
                    }
                    acbnVar2.b.countDown();
                }
            } else if ("_error".equals(str)) {
                acbn acbnVar3 = (acbn) this.p.get((int) adyu.cx(dataInputStream));
                if (acbnVar3 != null) {
                    acbnVar3.a = new acbo();
                    acbnVar3.a.a = 1;
                    acbnVar3.b.countDown();
                }
            } else {
                String valueOf = String.valueOf(str);
                Log.e("RtmpInputStream", valueOf.length() != 0 ? "Ignoring unrecognized AMF command: ".concat(valueOf) : new String("Ignoring unrecognized AMF command: "));
            }
        }
        return min;
    }

    public final int d() {
        g(this.o);
        return this.o.getInt();
    }

    public final Future e(int i) {
        acbn acbnVar = (acbn) this.p.get(i);
        if (acbnVar == null || acbnVar.a != null) {
            final acbn acbnVar2 = new acbn();
            acbnVar2.b = new CountDownLatch(1);
            this.p.put(i, acbnVar2);
            return this.m.submit(new Callable() { // from class: acbg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    acbn acbnVar3 = acbn.this;
                    acbnVar3.b.await();
                    return acbnVar3.a;
                }
            });
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Transaction already in progress: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void f(int i) {
        this.p.remove(i);
    }

    final void g(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() > 0) {
            if (!this.n.isConnected() || this.n.read(byteBuffer) < 0) {
                throw new IOException("socket closed");
            }
        }
    }

    public final synchronized void h(Throwable th) {
        if (this.h != null) {
            this.h.post(new acbi(this, th));
        }
    }

    public final synchronized void i(int i) {
        if (this.h != null) {
            this.h.post(new acbj(this, 0));
        }
    }

    public final synchronized void j(int i, int i2) {
        if (this.h != null) {
            this.h.post(new acbk(this, i, i2));
        }
    }

    public final void k(ByteBuffer byteBuffer, int i, int i2) {
        g(byteBuffer);
    }

    public final synchronized void l(int i) {
        this.q = i;
        this.r = false;
        m(0);
    }

    public final synchronized void m(int i) {
        int i2 = this.i + i;
        this.i = i2;
        if (i2 - this.q >= this.j && !this.r) {
            this.r = true;
            if (this.h != null) {
                this.h.post(new acbj(this, 1));
            }
        }
    }
}
