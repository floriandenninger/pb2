package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwx implements zfi {
    public final /* synthetic */ lwy a;
    private final /* synthetic */ int b;

    public /* synthetic */ lwx(lwy lwyVar, int i) {
        this.b = i;
        this.a = lwyVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            lwy lwyVar = this.a;
            AccountId accountId = (AccountId) obj;
            accountId.getClass();
            lwyVar.b.j(lwyVar.b(accountId));
            return;
        }
        lwy lwyVar2 = this.a;
        gcq gcqVar = (gcq) obj;
        if (gcqVar != null && lwyVar2.c()) {
            lwyVar2.b.j(gcqVar);
        }
        lwyVar2.g = null;
    }
}
