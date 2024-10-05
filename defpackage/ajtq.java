package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajtq implements afwx {
    final /* synthetic */ ajce a;
    final /* synthetic */ boolean b;
    final /* synthetic */ apxf c;
    final /* synthetic */ ajug d;
    final /* synthetic */ ajtz e;

    public ajtq(ajtz ajtzVar, ajce ajceVar, boolean z, apxf apxfVar, ajug ajugVar) {
        this.e = ajtzVar;
        this.a = ajceVar;
        this.b = z;
        this.c = apxfVar;
        this.d = ajugVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        ajce ajceVar = this.a;
        ajtz ajtzVar = this.e;
        if (ajceVar != ajtzVar.A) {
            return;
        }
        ajtzVar.A = null;
        this.d.b(cnqVar, this.a);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ajcf ajcfVar = (ajcf) obj;
        ajce ajceVar = this.a;
        ajtz ajtzVar = this.e;
        if (ajceVar != ajtzVar.A) {
            return;
        }
        ajtzVar.A = null;
        if (this.b) {
            this.e.y.clear();
        }
        if (ajcfVar == null) {
            this.e.w.remove(this.a.a());
        } else {
            if (this.e.U() != null) {
                ajsn U = this.e.U();
                ajce ajceVar2 = this.a;
                apxf apxfVar = this.c;
                ajss ajssVar = U.a;
                int i = U.b;
                ajssVar.x.t();
                if (ajceVar2.a() == ajcd.RELOAD) {
                    ajssVar.x.d(acsb.b(i), apxfVar, null);
                }
                ajtz ajtzVar2 = this.e;
                Iterator it = ajtzVar2.z.iterator();
                while (it.hasNext()) {
                    ajtzVar2.x.n((acsa) it.next());
                }
            }
            ajtz ajtzVar3 = this.e;
            if (ajcfVar.b() != null) {
                byte[] d = ajcfVar.d();
                ajtzVar3.y.add(d);
                if (d != null) {
                    ajtzVar3.x.D(new acqx(d));
                }
            }
        }
        ajtu ajtuVar = this.e.F;
        if (ajtuVar != null) {
            ajtuVar.a(ajcfVar);
        }
        this.d.a(ajcfVar.b(), this.a.a());
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
