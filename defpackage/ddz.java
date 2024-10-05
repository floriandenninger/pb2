package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddz extends axku implements Closeable {
    static {
        axna.d(ddz.class);
    }

    public ddz(axkv axkvVar, ddx ddxVar) {
        t(axkvVar, axkvVar.c(), ddxVar);
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    public final det a() {
        for (deb debVar : i()) {
            if (debVar instanceof det) {
                return (det) debVar;
            }
        }
        return null;
    }

    @Override // defpackage.axku, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    @Override // defpackage.axku
    public final String toString() {
        String obj = this.r.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
