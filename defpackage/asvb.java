package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvb {
    private final aakv a;
    private final asuv b;

    public asvb(asuv asuvVar, aakv aakvVar) {
        this.b = asuvVar;
        this.a = aakvVar;
    }

    public static awxk b(asuv asuvVar) {
        return new awxk(asuvVar.toBuilder());
    }

    public final amsx a() {
        arfs arfsVar;
        avgg avggVar;
        asvc asvcVar;
        amsv amsvVar = new amsv();
        asuv asuvVar = this.b;
        if (asuvVar.b == 1) {
            arfsVar = (arfs) asuvVar.c;
        } else {
            arfsVar = arfs.a;
        }
        new arfq((arfs) ((aong) arfsVar.toBuilder()).build());
        amsvVar.j(new amsv().g());
        asuv asuvVar2 = this.b;
        if (asuvVar2.b == 2) {
            avggVar = (avgg) asuvVar2.c;
        } else {
            avggVar = avgg.a;
        }
        amsvVar.j(avgj.b(avggVar).b(this.a).a());
        asuv asuvVar3 = this.b;
        if (asuvVar3.b == 3) {
            asvcVar = (asvc) asuvVar3.c;
        } else {
            asvcVar = asvc.a;
        }
        new asva((asvc) asvcVar.toBuilder().build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asvb) && this.b.equals(((asvb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("OneofIconOrThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
