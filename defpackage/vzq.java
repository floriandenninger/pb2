package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vzq implements aftj {
    public final /* synthetic */ afti a;
    private final /* synthetic */ int b;

    public /* synthetic */ vzq(afti aftiVar, int i) {
        this.b = i;
        this.a = aftiVar;
    }

    @Override // defpackage.aftj
    public final afti a(afsx afsxVar) {
        if (this.b != 0) {
            afti aftiVar = this.a;
            amkq.N(afsxVar instanceof AccountIdentity);
            return aftiVar;
        }
        afti aftiVar2 = this.a;
        amkq.N(afsxVar instanceof AccountIdentity);
        return aftiVar2;
    }
}
