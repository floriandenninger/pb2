package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alan extends alad {
    private boolean a;
    private final File b;
    private volatile long c;

    public alan(File file, File file2) {
        super(new FileInputStream(file));
        this.a = false;
        this.c = -1L;
        this.b = file2;
        f();
    }

    private final int e(alam alamVar) {
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.a) {
            int a = alamVar.a();
            if (a >= 0) {
                return a;
            }
            if (System.currentTimeMillis() - currentTimeMillis < 20000) {
                try {
                    Thread.sleep(30L);
                    f();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(e.getMessage() != null ? e.getMessage() : "");
                }
            } else {
                return alamVar.a();
            }
        }
        return alamVar.a();
    }

    private final void f() {
        if (this.b.exists()) {
            this.c = this.b.length();
            this.a = true;
        }
    }

    @Override // defpackage.alad
    public final long a() {
        return this.c;
    }

    @Override // defpackage.alad
    public final boolean b() {
        if (!this.a) {
            f();
        }
        return this.c != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ int c(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ int d() {
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return e(new alam() { // from class: alak
            @Override // defpackage.alam
            public final int a() {
                return alan.this.d();
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return e(new alam() { // from class: alal
            @Override // defpackage.alam
            public final int a() {
                return alan.this.c(bArr, i, i2);
            }
        });
    }
}
