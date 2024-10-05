package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgz implements aala {
    public static final aalb a = new avgy();
    public final avha b;
    private final aakv c;

    public avgz(avha avhaVar, aakv aakvVar) {
        this.b = avhaVar;
        this.c = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        avgt timedListDataModel = getTimedListDataModel();
        amsv amsvVar2 = new amsv();
        amrp amrpVar = new amrp();
        Iterator it = timedListDataModel.b.b.iterator();
        while (it.hasNext()) {
            aone builder = ((avhe) it.next()).toBuilder();
            amrpVar.h(new avhd((avhe) builder.build(), timedListDataModel.a));
        }
        amxe it2 = amrpVar.g().iterator();
        while (it2.hasNext()) {
            avhd avhdVar = (avhd) it2.next();
            amsv amsvVar3 = new amsv();
            amrp amrpVar2 = new amrp();
            Iterator it3 = avhdVar.b.b.iterator();
            while (it3.hasNext()) {
                aone builder2 = ((avhg) it3.next()).toBuilder();
                aakv aakvVar = avhdVar.a;
                amrpVar2.h(new avhf((avhg) builder2.build()));
            }
            amxe it4 = amrpVar2.g().iterator();
            while (it4.hasNext()) {
                amsvVar3.j(new amsv().g());
            }
            amsvVar2.j(amsvVar3.g());
        }
        amsvVar.j(amsvVar2.g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new avgx(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avgz) && this.b.equals(((avgz) obj).b);
    }

    public avgu getTimedListData() {
        avgu avguVar = this.b.d;
        return avguVar == null ? avgu.a : avguVar;
    }

    public avgt getTimedListDataModel() {
        avgu avguVar = this.b.d;
        if (avguVar == null) {
            avguVar = avgu.a;
        }
        aone builder = avguVar.toBuilder();
        return new avgt((avgu) builder.build(), this.c);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("TimedMarkersListSyncEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
