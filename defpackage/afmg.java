package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmg extends dlq {

    @dnt(a = 13)
    AtomicInteger a;

    @dnt(a = 13)
    AtomicBoolean b;

    @dnt(a = 13)
    AtomicBoolean c;

    @dnt(a = 13)
    AtomicBoolean d;

    @dnt(a = 13)
    AtomicInteger e;

    @dnt(a = 13)
    AtomicInteger f;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        int i = dlpVar.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            baql baqlVar = new baql();
            baqlVar.a = this.a;
            afmx.f(baqlVar);
            this.a = (AtomicInteger) baqlVar.a;
            return;
        }
        baql baqlVar2 = new baql();
        baqlVar2.a = this.f;
        baql baqlVar3 = new baql();
        baqlVar3.a = this.e;
        afmx.g(baqlVar2, baqlVar3, ((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
        this.f = (AtomicInteger) baqlVar2.a;
        this.e = (AtomicInteger) baqlVar3.a;
    }
}
