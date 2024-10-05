package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vxi extends Thread {
    private final vxl a;
    private final WritableByteChannel b;

    public vxi(vxl vxlVar, WritableByteChannel writableByteChannel) {
        setName("Movie to Stream Thread");
        this.a = vxlVar;
        this.b = writableByteChannel;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.a.a().k(this.b);
                try {
                    this.b.close();
                } catch (IOException e) {
                    e = e;
                    vtv.f("Failed to close movie resources", e);
                    this.a.close();
                }
            } catch (IOException e2) {
                vtv.f("Failed to read movie data", e2);
                try {
                    this.b.close();
                } catch (IOException e3) {
                    e = e3;
                    vtv.f("Failed to close movie resources", e);
                    this.a.close();
                }
            }
            this.a.close();
        } catch (Throwable th) {
            try {
                this.b.close();
            } catch (IOException e4) {
                vtv.f("Failed to close movie resources", e4);
            }
            this.a.close();
            throw th;
        }
    }
}
