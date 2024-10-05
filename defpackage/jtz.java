package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtz implements aasm {
    public final kbf a;
    public final ajoy b;
    private final Executor c;
    private final Executor e;

    public jtz(ajoy ajoyVar, Executor executor, Executor executor2, kbf kbfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = ajoyVar;
        this.c = executor;
        this.e = executor2;
        this.a = kbfVar;
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        ajoy ajoyVar = this.b;
        ammv ak = mcy.ak(ajceVar);
        if (ak.h()) {
            int i = ((aqnd) ak.c()).b;
            if (i == 3) {
                return new jua("downloads_page_recommendations_item_section_identifier", aqng.a.createBuilder(), ajoyVar, ak, null, null, null);
            }
            if (i == 4) {
                return new jua("downloads_page_smart_downloads_item_section_identifier", aqng.a.createBuilder(), ajoyVar, ak, null, null, null);
            }
            if (i == 5) {
                return new jua("downloads_page_disclaimer_item_section_identifier", aqng.a.createBuilder(), ajoyVar, ak, null, null, null);
            }
        }
        return new jua("downloads_page_downloads_item_section_identifier", aqng.a.createBuilder(), ajoyVar, ak, null, null, null);
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, final afwx afwxVar) {
        if (aaruVar instanceof jua) {
            final int i = 0;
            final int i2 = 1;
            ayqj.C(new jtx(this, (jua) aaruVar, 0)).M(azre.b(this.c)).I(azre.b(this.e)).W(new ayrs() { // from class: jtw
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 != 0) {
                        afwxVar.kZ((jty) obj);
                    } else {
                        afwxVar.kY(new cnq((Throwable) obj));
                    }
                }
            }, new ayrs() { // from class: jtw
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i != 0) {
                        afwxVar.kZ((jty) obj);
                    } else {
                        afwxVar.kY(new cnq((Throwable) obj));
                    }
                }
            });
        }
    }
}
