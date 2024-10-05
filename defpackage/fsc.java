package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsc extends ajdd {
    private final atdc a;

    public fsc(atdc atdcVar, aahd aahdVar, ajdh ajdhVar, Object obj) {
        super(aahdVar, ajdhVar, obj, null);
        atdcVar.getClass();
        this.a = atdcVar;
    }

    @Override // defpackage.ajdd
    protected final void a(int i) {
        atda atdaVar = (atda) this.a.c.get(i);
        if (this.a.c.size() > i) {
            if (adyu.dl(atdaVar) != null) {
                this.g.c(adyu.dl(atdaVar), d());
            } else if (adyu.dk(atdaVar) != null) {
                this.g.c(adyu.dk(atdaVar), d());
            }
            i(4);
        }
    }
}
