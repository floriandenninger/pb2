package defpackage;

import android.media.MediaFormat;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vto {
    public final Object a = new Object();
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public MediaFormat f;
    public MediaFormat g;
    public boolean h;
    public int i;
    public int j;
    public final vwa k;

    public vto(vwb vwbVar, int i) {
        String str = ((vtk) vwbVar).a.a;
        if (str == null) {
            throw new IllegalStateException("Property \"outputPath\" has not been set");
        }
        vwa vwaVar = new vwa(str);
        this.k = vwaVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        vwaVar.c(i2);
    }

    public final void a() {
        synchronized (this.a) {
            if (this.f != null && !this.c && (this.h || this.g != null)) {
                String str = "and audio";
                if (this.g == null) {
                    str = "only";
                }
                String concat = str.length() != 0 ? "with video ".concat(str) : new String("with video ");
                String valueOf = String.valueOf(concat);
                vtv.a(valueOf.length() != 0 ? "Mp4Muxer.startMuxer ".concat(valueOf) : new String("Mp4Muxer.startMuxer "));
                MediaFormat mediaFormat = this.f;
                mediaFormat.getClass();
                this.d = this.k.a(mediaFormat);
                MediaFormat mediaFormat2 = this.g;
                if (mediaFormat2 != null) {
                    this.e = this.k.a(mediaFormat2);
                }
                try {
                    this.k.d();
                    this.b = true;
                    this.a.notifyAll();
                } catch (IOException e) {
                    vtv.c("Mp4Muxer: Failed to start media muxer", e);
                    String valueOf2 = String.valueOf(concat);
                    throw new IOException(valueOf2.length() != 0 ? "Failed to start media muxer ".concat(valueOf2) : new String("Failed to start media muxer "), e);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.c = true;
            this.a.notifyAll();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }
}
