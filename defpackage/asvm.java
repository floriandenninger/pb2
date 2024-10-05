package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvm implements aala {
    public static final aalb a = new asvl();
    private final aakv b;
    private final asvn c;

    public asvm(asvn asvnVar, aakv aakvVar) {
        this.c = asvnVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asvp markersListModel = getMarkersListModel();
        amsv amsvVar2 = new amsv();
        amxe it = ((amru) markersListModel.b()).iterator();
        while (it.hasNext()) {
            asvi asviVar = (asvi) it.next();
            amsv amsvVar3 = new amsv();
            aqyg aqygVar = asviVar.b.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            amsvVar3.j(aqyd.b(aqygVar).d(asviVar.a).a());
            avgg avggVar = asviVar.b.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            amsvVar3.j(avgj.b(avggVar).b(asviVar.a).a());
            awnw awnwVar = asviVar.b.g;
            if (awnwVar == null) {
                awnwVar = awnw.a;
            }
            awns a2 = awnt.a(awnwVar);
            aakv aakvVar = asviVar.a;
            a2.a();
            amsvVar3.j(awnt.b());
            awnw awnwVar2 = asviVar.b.h;
            if (awnwVar2 == null) {
                awnwVar2 = awnw.a;
            }
            awns a3 = awnt.a(awnwVar2);
            aakv aakvVar2 = asviVar.a;
            a3.a();
            amsvVar3.j(awnt.b());
            awnw awnwVar3 = asviVar.b.i;
            if (awnwVar3 == null) {
                awnwVar3 = awnw.a;
            }
            awns a4 = awnt.a(awnwVar3);
            aakv aakvVar3 = asviVar.a;
            a4.a();
            amsvVar3.j(awnt.b());
            amsvVar2.j(amsvVar3.g());
        }
        aqyg aqygVar2 = markersListModel.b.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        amsvVar2.j(aqyd.b(aqygVar2).d(markersListModel.a).a());
        aqyg aqygVar3 = markersListModel.b.f;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        amsvVar2.j(aqyd.b(aqygVar3).d(markersListModel.a).a());
        awnw awnwVar4 = markersListModel.b.g;
        if (awnwVar4 == null) {
            awnwVar4 = awnw.a;
        }
        awnt.a(awnwVar4).a();
        amsvVar2.j(awnt.b());
        awnw awnwVar5 = markersListModel.b.h;
        if (awnwVar5 == null) {
            awnwVar5 = awnw.a;
        }
        awnt.a(awnwVar5).a();
        amsvVar2.j(awnt.b());
        awnw awnwVar6 = markersListModel.b.i;
        if (awnwVar6 == null) {
            awnwVar6 = awnw.a;
        }
        awnt.a(awnwVar6).a();
        amsvVar2.j(awnt.b());
        amsvVar.j(amsvVar2.g());
        return amsvVar.g();
    }

    public final boolean b() {
        return (this.c.b & 8) != 0;
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
        return new asvk(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asvm) && this.c.equals(((asvm) obj).c);
    }

    public String getExternalVideoId() {
        return this.c.d;
    }

    public asvj getMarkersList() {
        asvj asvjVar = this.c.e;
        return asvjVar == null ? asvj.a : asvjVar;
    }

    public asvp getMarkersListModel() {
        asvj asvjVar = this.c.e;
        if (asvjVar == null) {
            asvjVar = asvj.a;
        }
        aone builder = asvjVar.toBuilder();
        return new asvp((asvj) builder.build(), this.b);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("MacroMarkersListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
