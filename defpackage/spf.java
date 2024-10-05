package defpackage;

import android.text.TextUtils;
import android.widget.EditText;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spf extends dha {

    @dnt(a = 14)
    private final spe A;

    @dnt(a = 13)
    sww a;

    @dnt(a = 13)
    sxc b;

    @dnt(a = 13)
    axos c;

    @dnt(a = 3)
    boolean d;

    @dnt(a = 13)
    syd e;

    @dnt(a = 13)
    szx f;

    @dnt(a = 13)
    szx g;

    @dnt(a = 13)
    szx v;

    @dnt(a = 13)
    szx w;

    @dnt(a = 13)
    szx x;

    @dnt(a = 13)
    Map y;

    @dnt(a = 13)
    szl z;

    public spf() {
        super("EditableText");
        this.A = new spe();
    }

    public static diy a(dhe dheVar, szx szxVar) {
        return H(spf.class, dheVar, 378376578, new Object[]{dheVar, szxVar});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        spi.f(baqlVar, baqlVar2);
        Object obj = baqlVar.a;
        if (obj != null) {
            this.A.b = (sph) obj;
        }
        Object obj2 = baqlVar2.a;
        if (obj2 != null) {
            this.A.a = (AtomicBoolean) obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        spe speVar = (spe) dlqVar;
        spe speVar2 = (spe) dlqVar2;
        speVar2.a = speVar.a;
        speVar2.b = speVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        return spi.e(dheVar, this.c, this.g, this.v, this.w, this.f, this.x, this.z, this.e, this.a, this.b, this.y, this.A.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.A;
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        switch (diyVar.b) {
            case -1974694341:
                djd djdVar = (djd) obj;
                dji djiVar = diyVar.a;
                Object[] objArr = diyVar.c;
                spf spfVar = (spf) djiVar;
                spi.c((szx) objArr[1], (szx) objArr[2], djdVar.a, djdVar.b, spfVar.a, spfVar.b);
                return null;
            case -1048037474:
                N((dhe) diyVar.c[0], (diw) obj);
                return null;
            case 378110312:
                dto dtoVar = (dto) obj;
                dji djiVar2 = diyVar.a;
                Object[] objArr2 = diyVar.c;
                szx szxVar = (szx) objArr2[1];
                szx szxVar2 = (szx) objArr2[2];
                EditText editText = dtoVar.a;
                String str = dtoVar.b;
                spf spfVar2 = (spf) djiVar2;
                sww swwVar = spfVar2.a;
                sxc sxcVar = spfVar2.b;
                sph sphVar = spfVar2.A.b;
                String str2 = spi.a;
                synchronized (sphVar) {
                    sphVar.a.add(0, str);
                }
                if (szxVar != null) {
                    swwVar.b(szxVar.a(), spi.a(editText, sxcVar.u)).Q();
                }
                if (TextUtils.isEmpty(str) && szxVar2 != null) {
                    swwVar.b(szxVar2.a(), spi.a(editText, sxcVar.u)).Q();
                }
                return null;
            case 378376578:
                dji djiVar3 = diyVar.a;
                Object[] objArr3 = diyVar.c;
                spf spfVar3 = (spf) djiVar3;
                return Boolean.valueOf(spi.b((szx) objArr3[1], ((drb) obj).a, spfVar3.a, spfVar3.b));
            case 1803022739:
                dji djiVar4 = diyVar.a;
                spf spfVar4 = (spf) djiVar4;
                spi.d(spfVar4.c, spfVar4.A.a, ((dmy) obj).b);
                return null;
            default:
                return null;
        }
    }
}
