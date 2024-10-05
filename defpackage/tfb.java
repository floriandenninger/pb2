package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfb extends tei {
    public final tey a;

    public tfb(tey teyVar) {
        this.a = teyVar;
    }

    @Override // defpackage.tei
    public final void a(tey teyVar, tfa tfaVar) {
        tdy tdyVar = teyVar.f;
        if (tdyVar == null) {
            tdyVar = new tdy(0.0d, 0.0d, null, null, null, null);
        }
        c(teyVar, new VisibilityChangeEventData(tdyVar, teyVar.o, teyVar.b().booleanValue()), tfaVar);
        teyVar.m();
    }

    @Override // defpackage.tei
    public final void b() {
        this.a.m();
    }
}
