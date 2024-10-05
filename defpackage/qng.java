package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class qng extends qss {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public qng(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.qss
    public final byte[] pU() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = a();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
