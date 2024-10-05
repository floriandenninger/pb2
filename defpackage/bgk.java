package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgk extends atb {
    private final byte[] a;
    private final DatagramPacket b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private InetSocketAddress g;
    private boolean h;
    private int i;

    public bgk() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.b = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.i == 0) {
            try {
                this.d.receive(this.b);
                int length = this.b.getLength();
                this.i = length;
                c(length);
            } catch (SocketTimeoutException e) {
                throw new bgj(e, 2002);
            } catch (IOException e2) {
                throw new bgj(e2, 2001);
            }
        }
        int length2 = this.b.getLength();
        int i3 = this.i;
        int min = Math.min(i3, i2);
        System.arraycopy(this.a, length2 - i3, bArr, i, min);
        this.i -= min;
        return min;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        Uri uri = athVar.a;
        this.c = uri;
        String host = uri.getHost();
        int port = this.c.getPort();
        e(athVar);
        try {
            this.f = InetAddress.getByName(host);
            this.g = new InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.g);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                this.d = new DatagramSocket(this.g);
            }
            this.d.setSoTimeout(8000);
            this.h = true;
            f(athVar);
            return -1L;
        } catch (IOException e) {
            throw new bgj(e, 2001);
        } catch (SecurityException e2) {
            throw new bgj(e2, 2006);
        }
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.c;
    }

    @Override // defpackage.ate
    public final void j() {
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f);
            } catch (IOException unused) {
            }
            this.e = null;
        }
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.g = null;
        this.i = 0;
        if (this.h) {
            this.h = false;
            d();
        }
    }
}
