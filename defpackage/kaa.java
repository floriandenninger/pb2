package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kaa implements kbj {
    private final jti a;
    private final fjs b;
    private final axzf c;

    public kaa(jti jtiVar, fjs fjsVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = jtiVar;
        this.b = fjsVar;
        this.c = axzfVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aqnf aqnfVar;
        int i;
        aqmz aqmzVar;
        int q = this.c.q();
        if (!juaVar.b.h()) {
            aqnf b = aqnf.b(((aqng) juaVar.c.instance).c);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
            aqnfVar = b;
            i = q;
        } else {
            aqnd aqndVar = (aqnd) juaVar.b.c();
            if (aqndVar.b == 2) {
                aqmzVar = (aqmz) aqndVar.c;
            } else {
                aqmzVar = aqmz.a;
            }
            aqnfVar = aqnf.b(aqmzVar.d);
            if (aqnfVar == null) {
                aqnfVar = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
            i = aqmzVar.e;
        }
        aone createBuilder = askb.a.createBuilder();
        askh askhVar = (askh) this.a.g(fjs.class, askh.class, this.b, amrz.l("downloads_page_filter_type", Integer.valueOf(aqnfVar.e), "downloads_page_downloads_section_items_to_show", Integer.valueOf(i)));
        askhVar.getClass();
        createBuilder.copyOnWrite();
        askb askbVar = (askb) createBuilder.instance;
        askhVar.getClass();
        askbVar.g = askhVar;
        askbVar.b |= 16;
        return amru.r(new kbh((askb) createBuilder.build()));
    }
}
