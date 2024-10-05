package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advb implements amnv {
    final /* synthetic */ aaea a;
    final /* synthetic */ adxx b;

    public advb(aaea aaeaVar, adxx adxxVar) {
        this.a = aaeaVar;
        this.b = adxxVar;
    }

    @Override // defpackage.amnv
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized phg get() {
        atcl atclVar = this.a.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        aquv aquvVar = atclVar.c;
        if (aquvVar == null) {
            aquvVar = aquv.a;
        }
        if (aquvVar.c) {
            return null;
        }
        return this.b.get();
    }
}
