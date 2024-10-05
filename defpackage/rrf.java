package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rrf {
    public Intent a;
    protected Bundle b;
    private rru c;
    private rrt d;
    private final boolean e;

    public rrf(Context context, String str, String str2) {
        this(context, str, str2, true);
    }

    public final Intent a() {
        rru rruVar = this.c;
        ApplicationParameters applicationParameters = this.d.a;
        BuyFlowConfig buyFlowConfig = rruVar.a;
        buyFlowConfig.b = applicationParameters;
        if (buyFlowConfig.a == null) {
            buyFlowConfig.a = UUID.randomUUID().toString();
        }
        BuyFlowConfig buyFlowConfig2 = rruVar.a;
        this.a.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig2);
        if (this.e) {
            Account account = buyFlowConfig2.b.b;
            qip.az(account, "Buyer account is required");
            this.a.putExtra("com.google.android.gms.wallet.account", account);
        }
        if (this.a.getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L) == 0) {
            this.a.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", SystemClock.elapsedRealtime());
        }
        Intent intent = this.a;
        f();
        return intent;
    }

    public final void b(Account account) {
        this.d.a.b = account;
    }

    public final void c(WalletCustomTheme walletCustomTheme) {
        this.d.a.f = walletCustomTheme;
    }

    public final void d(int i) {
        this.d.a.a = i;
    }

    public final void e() {
        this.d.a.e = 1;
    }

    protected void f() {
        throw null;
    }

    public rrf(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent();
        this.a = intent;
        intent.setPackage("com.google.android.gms");
        this.a.setAction(str);
        this.b = new Bundle();
        rrt rrtVar = new rrt(new ApplicationParameters());
        rrtVar.a.c = this.b;
        this.d = rrtVar;
        rru rruVar = new rru(new BuyFlowConfig());
        String packageName = context.getPackageName();
        BuyFlowConfig buyFlowConfig = rruVar.a;
        buyFlowConfig.c = packageName;
        buyFlowConfig.d = str2;
        this.c = rruVar;
        this.e = z;
    }
}
