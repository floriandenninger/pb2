package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejn implements adxo {
    public final LruCache a = new LruCache(16);
    public final afhs b;

    public aejn(afhs afhsVar) {
        this.b = afhsVar;
    }

    @Override // defpackage.adxo
    public final boolean a(String str, String str2, long j) {
        aejc b = b(str);
        if (b == null) {
            return false;
        }
        return b.l(str, str2, j);
    }

    public final aejc b(String str) {
        aejc aejcVar = (aejc) this.a.get(str);
        if (aejcVar == null || !aejcVar.j()) {
            return null;
        }
        return aejcVar;
    }
}
