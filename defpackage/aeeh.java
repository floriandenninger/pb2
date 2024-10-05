package defpackage;

import java.security.Key;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeeh extends afit {
    private final amnv a;
    private final Key b;
    private final afhz c;
    private final aaea d;
    private final adyl e;
    private final afhs f;

    public aeeh(amnv amnvVar, Key key, afhz afhzVar, aaea aaeaVar, afhs afhsVar, adyl adylVar) {
        amnvVar.getClass();
        this.a = amnvVar;
        this.b = key;
        this.c = afhzVar;
        aaeaVar.getClass();
        this.d = aaeaVar;
        this.f = afhsVar;
        this.e = adylVar;
    }

    @Override // defpackage.afit
    public final ate a(ate ateVar) {
        bfe bglVar;
        phg phgVar = (phg) this.a.get();
        if (phgVar == null) {
            return ateVar;
        }
        atcl atclVar = this.d.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        aquv aquvVar = atclVar.c;
        if (aquvVar == null) {
            aquvVar = aquv.a;
        }
        int i = aquvVar.b;
        if (this.f.C()) {
            bglVar = new adyn(this.b.getEncoded(), new phi(phgVar, i), new byte[4096], this.e, false);
        } else {
            bglVar = new bgl(this.b.getEncoded(), new phi(phgVar, i), new byte[4096]);
        }
        return new phj(phgVar, ateVar, new bgm(this.b.getEncoded(), new pht("Cache")), bglVar, 6, this.c);
    }
}
