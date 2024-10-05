package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpn extends dlq {

    @dnt(a = 13)
    fpy a;

    @dnt(a = 13)
    AtomicBoolean b;

    @dnt(a = 13)
    fpt c;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        if (dlpVar.a != 0) {
            return;
        }
        baql baqlVar = new baql();
        baqlVar.a = this.b;
        baqlVar.a = (AtomicBoolean) objArr[0];
        this.b = (AtomicBoolean) baqlVar.a;
    }
}
