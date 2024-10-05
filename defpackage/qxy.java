package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxy {
    public int a;
    public int b;
    final /* synthetic */ qxz c;
    private final byte[] d;

    public qxy(qxz qxzVar, byte[] bArr) {
        this.c = qxzVar;
        this.d = bArr;
    }

    public final synchronized void a() {
        try {
            qxz qxzVar = this.c;
            if (qxzVar.a) {
                qya qyaVar = qxzVar.b;
                byte[] bArr = this.d;
                Parcel pn = qyaVar.pn();
                pn.writeByteArray(bArr);
                qyaVar.pp(5, pn);
                qya qyaVar2 = this.c.b;
                int i = this.a;
                Parcel pn2 = qyaVar2.pn();
                pn2.writeInt(i);
                qyaVar2.pp(6, pn2);
                qya qyaVar3 = this.c.b;
                int i2 = this.b;
                Parcel pn3 = qyaVar3.pn();
                pn3.writeInt(i2);
                qyaVar3.pp(7, pn3);
                qya qyaVar4 = this.c.b;
                Parcel pn4 = qyaVar4.pn();
                pn4.writeIntArray(null);
                qyaVar4.pp(4, pn4);
                qya qyaVar5 = this.c.b;
                qyaVar5.pp(3, qyaVar5.pn());
            }
        } catch (RemoteException unused) {
        }
    }
}
