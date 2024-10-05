package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badd implements bacw {
    public final bacu a = new bacu();
    public final badh b;
    public boolean c;

    public badd(badh badhVar) {
        if (badhVar != null) {
            this.b = badhVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.badh
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.k();
    }

    @Override // defpackage.badh
    public final long e(bacu bacuVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        bacu bacuVar2 = this.a;
        if (bacuVar2.b == 0 && this.b.e(bacuVar2, 8192L) == -1) {
            return -1L;
        }
        return this.a.e(bacuVar, Math.min(8192L, this.a.b));
    }

    @Override // defpackage.bacw
    public final InputStream f() {
        return new badc(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.bacw
    public final boolean n(long j) {
        bacu bacuVar;
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                bacuVar = this.a;
                if (bacuVar.b >= j) {
                    return true;
                }
            } while (this.b.e(bacuVar, 8192L) != -1);
            return false;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        bacu bacuVar = this.a;
        if (bacuVar.b == 0 && this.b.e(bacuVar, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[SYNTHETIC] */
    @Override // defpackage.bacw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(defpackage.bacx r18) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.badd.d(bacx):long");
    }
}
