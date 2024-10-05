package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmf extends nky {
    public nmf(auzf auzfVar) {
        super(auzfVar);
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar;
        auzf auzfVar = (auzf) this.a;
        if ((auzfVar.b & 1) != 0) {
            aqygVar = auzfVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }
}
