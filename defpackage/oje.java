package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oje implements ojf {
    public final oew a;
    private final fnv b;
    private final ajoy c;

    public oje() {
    }

    @Override // defpackage.ojf
    public final void a(aigr aigrVar) {
        int i;
        int i2;
        ofa ofaVar = this.a.c;
        if (ofaVar == null) {
            return;
        }
        if (aigrVar != null && !ofa.k(aigrVar) && (i2 = aigrVar.i) != 1 && i2 != 4 && i2 != 2) {
            aigrVar = null;
        }
        if (ofaVar.f == aigrVar) {
            i = 0;
        } else {
            ofaVar.f = aigrVar;
            i = 32;
        }
        ofaVar.e(i | (aigrVar != null ? ofaVar.a(null, null) : 0));
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        ofa ofaVar;
        if (fhfVar != null) {
            ajoy ajoyVar = this.c;
            fnt c = this.b.c(fhfVar.a());
            aarr aarrVar = (aarr) ajoyVar.a.get();
            aarrVar.getClass();
            ofaVar = new ofa(aarrVar, c);
        } else {
            ofaVar = null;
        }
        oew oewVar = this.a;
        if (amkq.b(ofaVar, oewVar.c)) {
            return;
        }
        ofa ofaVar2 = oewVar.c;
        if (ofaVar2 != null) {
            ofaVar2.h(false);
        }
        int a = oewVar.a();
        oewVar.c = ofaVar;
        if (ofaVar != null) {
            ofaVar.h(true);
        }
        int a2 = oewVar.a();
        if (a > a2) {
            Iterator it = oewVar.a.iterator();
            while (it.hasNext()) {
                ((ajnf) it.next()).d(0, 1);
            }
        } else if (a < a2) {
            Iterator it2 = oewVar.a.iterator();
            while (it2.hasNext()) {
                ((ajnf) it2.next()).pe(0, 1);
            }
        }
        for (ojx ojxVar : oewVar.b) {
            if (oewVar.c != null) {
                ojxVar.a.a();
            }
        }
    }

    public oje(fnv fnvVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = fnvVar;
        this.c = ajoyVar;
        this.a = new oew();
    }
}
