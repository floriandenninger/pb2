package defpackage;

import android.accounts.Account;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vjx implements vjv {
    private final trp a;

    public vjx(trp trpVar, byte[] bArr, byte[] bArr2) {
        this.a = trpVar;
    }

    @Override // defpackage.vjv
    public final Account[] a() {
        rpt b;
        try {
            b = rqr.c(qde.m(this.a.a));
        } catch (RemoteException | qnk | qnl e) {
            b = rqr.b(e);
        }
        return (Account[]) b.g();
    }
}
