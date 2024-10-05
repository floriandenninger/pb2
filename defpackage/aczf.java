package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczf {
    public static final String a = zga.a("MDX.WakeOnLan");
    public final long b;
    public final adtv c;
    public final String e;
    public final Handler f;
    public DatagramPacket g;
    public volatile boolean h;
    private final Runnable i = new acze(this);
    public final aczd d = new aczc();

    public aczf(adtv adtvVar, String str, acun acunVar) {
        this.c = adtvVar;
        this.e = str;
        int i = acunVar.X;
        this.b = i > 0 ? i : 50L;
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 10);
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        synchronized (this) {
            if (this.h) {
                return;
            }
            String valueOf = String.valueOf(this.e);
            if (valueOf.length() != 0) {
                "startBroadcasting for ".concat(valueOf);
            }
            try {
                String str = this.e;
                InetAddress byName = InetAddress.getByName("255.255.255.255");
                if (str.length() != 17) {
                    throw new NumberFormatException("Mac address should be 17 characters long");
                }
                int length = (str.length() - 2) / 5;
                byte[] bArr = new byte[6];
                for (int i = 0; i < 6; i++) {
                    int i2 = i * length;
                    bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
                }
                byte[] bArr2 = new byte[102];
                for (int i3 = 0; i3 < 6; i3++) {
                    bArr2[i3] = -1;
                }
                for (int i4 = 1; i4 <= 16; i4++) {
                    System.arraycopy(bArr, 0, bArr2, i4 * 6, 6);
                }
                this.g = new DatagramPacket(bArr2, 102, byName, 9);
                this.h = true;
                this.f.post(this.i);
            } catch (UnknownHostException e) {
                zga.f(a, "Error creating magic packet", e);
            }
        }
    }

    public final void b() {
        String valueOf = String.valueOf(this.e);
        if (valueOf.length() != 0) {
            "stopBroadcasting for ".concat(valueOf);
        }
        synchronized (this) {
            this.h = false;
            this.f.removeCallbacks(this.i);
        }
    }
}
