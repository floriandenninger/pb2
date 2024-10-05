package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavj extends aasw implements aasm {
    public final afsy a;
    public final aarm b;

    public aavj(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = aarmVar;
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        aavm aavmVar = new aavm(this.f, this.a.c(), null, null, null);
        aavmVar.a = ajceVar.b();
        return aavmVar;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        new aavg(this).j((aavm) aaruVar, aaslVar, afwxVar);
    }

    @Deprecated
    public final void d(String str, List list, afwx afwxVar, boolean z) {
        aavp aavpVar = new aavp(this.f, this.a.c(), null, null, null);
        aavpVar.a = str;
        aavpVar.b = list;
        aavpVar.j = z;
        aavpVar.d = 2;
        new aavi(this).i(aavpVar, afwxVar);
    }
}
