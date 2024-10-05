package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagi implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;
    private final /* synthetic */ int b;

    public bagi(CronetUploadDataStream cronetUploadDataStream, int i) {
        this.b = i;
        this.a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            synchronized (this.a.g) {
                CronetUploadDataStream cronetUploadDataStream = this.a;
                if (cronetUploadDataStream.h == 0) {
                    return;
                }
                cronetUploadDataStream.e(3);
                this.a.i = 1;
                try {
                    this.a.a();
                    CronetUploadDataStream cronetUploadDataStream2 = this.a;
                    cronetUploadDataStream2.b.rewind(cronetUploadDataStream2);
                    return;
                } catch (Exception e) {
                    this.a.b(e);
                    return;
                }
            }
        }
        if (i != 1) {
            try {
                this.a.a();
                this.a.b.close();
                return;
            } catch (Exception e2) {
                badx.d(CronetUploadDataStream.a, "Exception thrown when closing", e2);
                return;
            }
        }
        synchronized (this.a.g) {
            CronetUploadDataStream cronetUploadDataStream3 = this.a;
            if (cronetUploadDataStream3.h == 0) {
                return;
            }
            cronetUploadDataStream3.e(3);
            CronetUploadDataStream cronetUploadDataStream4 = this.a;
            if (cronetUploadDataStream4.f != null) {
                cronetUploadDataStream4.i = 0;
                try {
                    this.a.a();
                    CronetUploadDataStream cronetUploadDataStream5 = this.a;
                    cronetUploadDataStream5.b.read(cronetUploadDataStream5, cronetUploadDataStream5.f);
                    return;
                } catch (Exception e3) {
                    this.a.b(e3);
                    return;
                }
            }
            throw new IllegalStateException("Unexpected readData call. Buffer is null");
        }
    }
}
