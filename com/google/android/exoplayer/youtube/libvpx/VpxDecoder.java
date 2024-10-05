package com.google.android.exoplayer.youtube.libvpx;

import android.view.Surface;
import defpackage.oyp;
import defpackage.phb;
import defpackage.phc;
import defpackage.phd;
import defpackage.pkb;
import defpackage.pkc;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VpxDecoder extends phd {
    public static final boolean a;
    public final long b;
    private volatile int c;

    static {
        boolean z;
        try {
            System.loadLibrary("vpx");
            System.loadLibrary("vpxYTJNI");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }

    public VpxDecoder(int i, int i2, boolean z, int i3, int i4) {
        super(new pkc[i], new VpxOutputBuffer[i2]);
        this.c = i3;
        boolean z2 = true;
        if (i3 != 2 && i3 != 3) {
            z2 = false;
        }
        long vpxInit = vpxInit(z, z2, false, i4);
        this.b = vpxInit;
        if (vpxInit == 0) {
            throw new pkb("Failed to initialize decoder");
        }
        k(786432);
    }

    public static native String getLibvpxConfig();

    public static native String getLibvpxVersion();

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, boolean z3, int i);

    private native int vpxReleaseFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    @Override // defpackage.phd
    protected final /* bridge */ /* synthetic */ phb a() {
        return new pkc();
    }

    @Override // defpackage.phd
    protected final /* bridge */ /* synthetic */ phc b() {
        return new VpxOutputBuffer(this);
    }

    @Override // defpackage.phd
    protected final /* bridge */ /* synthetic */ Exception c(phb phbVar, phc phcVar, boolean z) {
        pkc pkcVar = (pkc) phbVar;
        VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) phcVar;
        oyp oypVar = pkcVar.a;
        vpxOutputBuffer.timestampUs = oypVar.e;
        ByteBuffer byteBuffer = oypVar.b;
        if (vpxDecode(this.b, oypVar.b, oypVar.c) != 0) {
            String valueOf = String.valueOf(vpxGetErrorMessage(this.b));
            return new pkb(valueOf.length() != 0 ? "Decode error: ".concat(valueOf) : new String("Decode error: "));
        }
        if (pkcVar.getFlag(2)) {
            return null;
        }
        vpxOutputBuffer.mode = this.c;
        int vpxGetFrame = vpxGetFrame(this.b, vpxOutputBuffer);
        if (vpxGetFrame == 1) {
            vpxOutputBuffer.setFlag(2);
        } else if (vpxGetFrame == -1) {
            return new pkb("Buffer initialization failed.");
        }
        vpxOutputBuffer.colorInfo = pkcVar.d;
        return null;
    }

    @Override // defpackage.phd
    public final void d() {
        super.d();
        vpxClose(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(VpxOutputBuffer vpxOutputBuffer) {
        if ((this.c == 2 || this.c == 3) && !vpxOutputBuffer.getFlag(2)) {
            vpxReleaseFrame(this.b, vpxOutputBuffer);
        }
        super.j(vpxOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VpxOutputBuffer vpxOutputBuffer);
}
