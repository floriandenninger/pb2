package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjk implements aala {
    public static final aalb a = new avjj();
    private final aakv b;
    private final avjm c;

    public avjk(avjm avjmVar, aakv aakvVar) {
        this.c = avjmVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amxe it = ((amru) getSegmentsDataModels()).iterator();
        while (it.hasNext()) {
            avjh avjhVar = (avjh) it.next();
            amsv amsvVar2 = new amsv();
            apxf apxfVar = avjhVar.b.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            amsvVar2.j(apxe.b(apxfVar).e(avjhVar.a).a());
            amsvVar.j(amsvVar2.g());
        }
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new avji(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avjk) && this.c.equals(((avjk) obj).c);
    }

    public List getSegmentsData() {
        return this.c.d;
    }

    public List getSegmentsDataModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.d.iterator();
        while (it.hasNext()) {
            aone builder = ((avjl) it.next()).toBuilder();
            amrpVar.h(new avjh((avjl) builder.build(), this.b));
        }
        return amrpVar.g();
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("TranscriptSegmentsDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
