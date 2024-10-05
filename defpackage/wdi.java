package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdi implements afwx {
    final /* synthetic */ afsx a;
    final /* synthetic */ ykl b;

    public wdi(afsx afsxVar, ykl yklVar) {
        this.a = afsxVar;
        this.b = yklVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.a(this.a, cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        for (aata aataVar : ((aati) obj).c()) {
            if (aataVar.l()) {
                C$AutoValue_AccountIdentity c$AutoValue_AccountIdentity = (C$AutoValue_AccountIdentity) this.a;
                if (TextUtils.equals(c$AutoValue_AccountIdentity.c, aataVar.j()) || (TextUtils.isEmpty(c$AutoValue_AccountIdentity.c) && TextUtils.isEmpty(aataVar.j()))) {
                    this.b.b(this.a, aataVar);
                    return;
                }
            }
        }
        this.b.a(this.a, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
