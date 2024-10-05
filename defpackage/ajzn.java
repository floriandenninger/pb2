package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzn extends dha {

    @dnt(a = 13)
    szo a;

    @dnt(a = 14)
    private final ajzm b;

    public ajzn() {
        super("LazilyConvertedElementSize");
        this.b = new ajzm();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha G(dhe dheVar, int i, int i2) {
        szo szoVar = this.a;
        ajzm ajzmVar = this.b;
        AtomicReference atomicReference = ajzmVar.a;
        AtomicReference atomicReference2 = ajzmVar.b;
        sxc sxcVar = (sxc) atomicReference2.get();
        dha dhaVar = (dha) atomicReference.get();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (sxcVar.c.intValue() != size || sxcVar.d.intValue() != size2 || dhaVar == null) {
            sxb e = sxcVar.e();
            e.b = Integer.valueOf(size);
            e.c = Integer.valueOf(size2);
            sxc a = e.a();
            atomicReference2.set(a);
            dhaVar = szoVar.a(dheVar, a);
            atomicReference.set(dhaVar);
        }
        return dhaVar.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baqlVar.a = new AtomicReference();
        sxb a = sxc.a();
        a.b = 0;
        a.c = 0;
        baqlVar2.a = new AtomicReference(a.a());
        ajzm ajzmVar = this.b;
        ajzmVar.a = (AtomicReference) baqlVar.a;
        ajzmVar.b = (AtomicReference) baqlVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ajzm ajzmVar = (ajzm) dlqVar;
        ajzm ajzmVar2 = (ajzm) dlqVar2;
        ajzmVar2.a = ajzmVar.a;
        ajzmVar2.b = ajzmVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.b;
    }
}
