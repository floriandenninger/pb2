package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajuf extends ajtz {
    public final Object G;
    public final ajtt H;
    public ajtz I;

    public ajuf(ajxe ajxeVar, aasm aasmVar, ypa ypaVar, Object obj, zaw zawVar, acra acraVar, Queue queue) {
        super(ajxeVar, aasmVar, ypaVar, obj, zawVar, acraVar, new qmq(4), queue);
        this.G = obj;
        this.H = new ajtt() { // from class: ajue
            @Override // defpackage.ajtt
            public final void a(cnq cnqVar, ajce ajceVar) {
                ajtt ajttVar = ajuf.this.E;
                if (ajttVar != null) {
                    ajttVar.a(cnqVar, ajceVar);
                }
            }
        };
    }

    @Override // defpackage.ajtz
    public final ajce W(ajcd ajcdVar) {
        if (this.I == null || ajcdVar != ajcd.NEXT) {
            return super.W(ajcdVar);
        }
        return this.I.W(ajcdVar);
    }

    @Override // defpackage.ajtz
    public final Object Y() {
        return this.G;
    }

    @Override // defpackage.ajtz
    public final boolean ai(ajcd ajcdVar) {
        if (this.I == null || ajcdVar != ajcd.NEXT) {
            return super.ai(ajcdVar);
        }
        return this.I.ai(ajcdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ak(ajtz ajtzVar) {
        ajtz ajtzVar2 = this.I;
        if (ajtzVar2 != null) {
            return !ajtzVar2.ai(ajcd.NEXT);
        }
        if (super.ai(ajcd.NEXT)) {
            return !ajtzVar.ai(ajcd.NEXT) ? false : false;
        }
        return true;
    }

    @Override // defpackage.ajtz
    public final void lF(ajcd ajcdVar) {
        ajtz ajtzVar;
        if (ajcdVar != ajcd.NEXT || (ajtzVar = this.I) == null || ajtzVar.W(ajcd.NEXT) == null) {
            super.lF(ajcdVar);
        } else {
            this.I.lF(ajcdVar);
        }
    }
}
