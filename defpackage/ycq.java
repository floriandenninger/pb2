package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycq {
    public final ci a;
    public final azrw b;
    final Set c = new HashSet();
    private final afsy d;
    private final rrm e;
    private final acpl f;
    private final ykz g;
    private final wcf h;

    public ycq(ci ciVar, ykz ykzVar, azrw azrwVar, wcf wcfVar, afsy afsyVar, Context context, acpl acplVar) {
        this.a = ciVar;
        this.g = ykzVar;
        this.b = azrwVar;
        this.h = wcfVar;
        this.d = afsyVar;
        this.e = new rrm(context);
        this.f = acplVar;
    }

    public final void a(aaeb aaebVar, byte[] bArr, byte[] bArr2) {
        rrm rrmVar = this.e;
        rrmVar.d(aaebVar != aaeb.PRODUCTION ? 0 : 1);
        rrmVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        rrmVar.b(this.h.b(this.d.c()));
        rrmVar.e();
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a();
        rrmVar.c(walletCustomTheme);
        Intent a = rrmVar.a();
        b(bArr2, 2);
        this.g.a(a, 1900, new ycp(this, bArr2));
    }

    public final void b(byte[] bArr, int i) {
        if (bArr != null) {
            aone createBuilder = awft.a.createBuilder();
            aomf x = aomf.x(bArr);
            createBuilder.copyOnWrite();
            awft awftVar = (awft) createBuilder.instance;
            awftVar.b |= 2;
            awftVar.d = x;
            createBuilder.copyOnWrite();
            awft awftVar2 = (awft) createBuilder.instance;
            awftVar2.c = i - 1;
            awftVar2.b |= 1;
            awft awftVar3 = (awft) createBuilder.build();
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).cx(awftVar3);
            this.f.c((arpp) a.build());
        }
    }
}
