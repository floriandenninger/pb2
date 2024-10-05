package defpackage;

import android.content.Intent;
import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lmv implements fzk {
    public final ci a;
    public final wjz b;
    public final rxm c;
    private final wjt d;
    private final wju e;
    private final afsy f;
    private final trp g;

    public lmv(ci ciVar, rxm rxmVar, trp trpVar, wjt wjtVar, wju wjuVar, afsy afsyVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ciVar.getClass();
        this.a = ciVar;
        rxmVar.getClass();
        this.c = rxmVar;
        this.g = trpVar;
        this.d = wjtVar;
        this.e = wjuVar;
        this.f = afsyVar;
        this.b = wjzVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_settings;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_settings;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setShowAsAction(0);
    }

    @Override // defpackage.fze
    public final boolean m() {
        final Intent f = this.g.f();
        if (this.e.a()) {
            ynm.n(this.a, this.d.a(this.f.c()), llq.d, new zfi() { // from class: lmu
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    lmv lmvVar = lmv.this;
                    Intent intent = f;
                    AccountId accountId = (AccountId) obj;
                    accountId.getClass();
                    alxb.a(intent, accountId);
                    lmvVar.b.b(11, 1, 25);
                    lmvVar.a.startActivity(intent.putExtra("show_offline_items", lmvVar.c.a));
                }
            });
            return true;
        }
        this.a.startActivity(f.putExtra("show_offline_items", this.c.a));
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 102;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
