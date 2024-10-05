package defpackage;

import android.os.Parcel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class quj implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ qty b;
    final /* synthetic */ qul c;

    public quj(qul qulVar, Map map, qty qtyVar) {
        this.c = qulVar;
        this.a = map;
        this.b = qtyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        try {
            if (this.c.c != null) {
                quo quoVar = this.c.c;
                Map map = this.a;
                Parcel pn = quoVar.pn();
                pn.writeMap(map);
                Parcel po = quoVar.po(2, pn);
                bArr = po.createByteArray();
                po.recycle();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                this.c.a = oba.V("Received null");
                bArr = this.c.a;
            }
        } catch (Exception e) {
            qul qulVar = this.c;
            String valueOf = String.valueOf(e.toString());
            qulVar.a = oba.V(valueOf.length() != 0 ? "Snapshot failed: ".concat(valueOf) : new String("Snapshot failed: "));
            bArr = this.c.a;
            this.c.b();
        }
        qty qtyVar = this.b;
        if (!qtyVar.b) {
            qtyVar.b = true;
            qtyVar.a.offer(bArr);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
