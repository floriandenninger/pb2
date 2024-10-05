package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtt extends dlq {

    @dnt(a = 3)
    int a;

    @dnt(a = 13)
    AtomicReference b;

    @dnt(a = 13)
    AtomicReference c;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        if (dlpVar.a != 0) {
            return;
        }
        baql baqlVar = new baql();
        baqlVar.a = Integer.valueOf(this.a);
        dty.i(baqlVar);
        this.a = ((Integer) baqlVar.a).intValue();
    }
}
