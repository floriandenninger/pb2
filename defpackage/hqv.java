package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqv {
    public final /* synthetic */ hqw a;

    public hqv(hqw hqwVar) {
        this.a = hqwVar;
    }

    public final void a() {
        this.a.s(false);
        ci C = this.a.C();
        if (C != null) {
            C.runOnUiThread(new Runnable() { // from class: hqu
                @Override // java.lang.Runnable
                public final void run() {
                    zyj zyjVar = hqv.this.a.ao;
                    if (zyjVar != null) {
                        zyjVar.g();
                    }
                }
            });
        }
        hqw hqwVar = this.a;
        hos hosVar = hqwVar.az;
        hpb hpbVar = hqwVar.as;
        hpbVar.getClass();
        hosVar.a.c(hpbVar);
    }
}
