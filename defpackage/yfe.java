package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfe {
    public static final String a = "yfe";
    public final ci b;
    public final azrw c;
    public final Set d = new HashSet();
    private final afsy e;
    private final rrn f;
    private final ykz g;
    private final wcf h;

    public yfe(ci ciVar, ykz ykzVar, azrw azrwVar, wcf wcfVar, afsy afsyVar, Context context) {
        this.b = ciVar;
        this.g = ykzVar;
        this.c = azrwVar;
        this.h = wcfVar;
        this.e = afsyVar;
        this.f = new rrn(context);
    }

    public final void a(aaeb aaebVar, byte[] bArr, byte[] bArr2) {
        try {
            Account a2 = this.h.a(this.e.c());
            rrn rrnVar = this.f;
            rrnVar.d(aaebVar != aaeb.PRODUCTION ? 3 : 1);
            rrnVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            rrnVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr2);
            rrnVar.b(a2);
            rrnVar.e();
            WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
            walletCustomTheme.a();
            rrnVar.c(walletCustomTheme);
            this.g.a(rrnVar.a(), 1901, new yfd(this));
        } catch (RemoteException | qnk | qnl e) {
            zga.f(a, "Error getting signed-in account", e);
        }
    }
}
