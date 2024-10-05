package defpackage;

import android.content.res.Configuration;
import android.view.View;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajud extends ajtz implements ajvc, ypd {
    private final ypa a;
    private boolean b;
    public final ajpd i;
    public ajvo j;
    public boolean k;
    public ajce l;

    public ajud(aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        this(aasmVar, ypaVar, zawVar, acraVar, null, new ajpd());
    }

    private final boolean k() {
        if (this.i.isEmpty()) {
            return false;
        }
        ajpd ajpdVar = this.i;
        return ajpdVar.get(ajpdVar.size() + (-1)) == this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(Object obj) {
        C(obj, this.i.size() - (k() ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C(Object obj, int i) {
        boolean z = false;
        if (i >= 0 && i <= this.i.size() - (k() ? 1 : 0)) {
            z = true;
        }
        amkq.N(z);
        this.i.add(i, obj);
        J(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(Collection collection) {
        E(collection, this.i.size() - (k() ? 1 : 0));
    }

    public final void E(Collection collection, int i) {
        this.i.addAll(i, collection);
        J(this.j);
    }

    public final void F(ajuh ajuhVar) {
        lt(ajuhVar.a());
    }

    public void G(Object obj) {
        if (obj != null) {
            this.i.remove(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(ammy ammyVar) {
        if (ammyVar != null) {
            this.i.m(ammyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return;
        }
        this.i.o(obj, obj2);
    }

    public final void J(ajvo ajvoVar) {
        if (this.k || !this.b) {
            this.i.remove(this.j);
        } else if (this.i.contains(this.j)) {
            ajvo ajvoVar2 = this.j;
            if (ajvoVar2 != ajvoVar) {
                this.i.o(ajvoVar2, ajvoVar);
            }
        } else {
            this.i.add(ajvoVar);
        }
        this.j = ajvoVar;
    }

    public final void K(boolean z) {
        if (this.b != z) {
            this.b = z;
            J(this.j);
        }
    }

    @Override // defpackage.ajtz, defpackage.zfk
    public void j() {
        super.j();
        this.a.m(this);
    }

    @Override // defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        return ahbw.m(this, obj, i);
    }

    @Override // defpackage.ajvc
    public ajng lC() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lD() {
        this.i.clear();
        B();
    }

    @Override // defpackage.ajvc
    public void lE(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final void lm(cnq cnqVar, ajce ajceVar) {
        super.lm(cnqVar, ajceVar);
        this.l = ajceVar;
    }

    @Override // defpackage.ajtz, defpackage.ajvz
    public ajxe ph() {
        return new ajuc(super.ph(), this.i, this.k, this.l, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajud(aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar, ajxe ajxeVar, ajpd ajpdVar) {
        super(ajxe.a(ajxeVar), aasmVar, ypaVar, ypa.c(), zawVar, acraVar, new qmq(4));
        ypaVar.getClass();
        this.a = ypaVar;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ajua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajud.this.lF(ajcd.NEXT);
            }
        };
        ajvp ajvpVar = new ajvp() { // from class: ajub
            @Override // defpackage.ajvp
            public final void ln() {
                ajud ajudVar = ajud.this;
                ajce ajceVar = ajudVar.l;
                if (ajceVar != null) {
                    ajudVar.lt(ajceVar);
                    ajudVar.l = null;
                }
            }
        };
        this.i = ajpdVar;
        if (ajxeVar instanceof ajuc) {
            ajuc ajucVar = (ajuc) ajxeVar;
            ajpdVar.p(ajucVar.a);
            boolean z = ajucVar.b;
            this.k = ajucVar.c;
            this.l = ajucVar.d;
            ajvn ajvnVar = new ajvn(ajucVar.e);
            ajvnVar.c = onClickListener;
            ajvnVar.d = ajvpVar;
            J(ajvnVar.a());
        } else {
            this.k = true;
            ajvn a = ajvo.a();
            a.b = Y();
            a.c = onClickListener;
            a.d = ajvpVar;
            J(a.a());
        }
        ypaVar.j(this, ajud.class, Y());
        this.b = true;
    }
}
