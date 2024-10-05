package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awaq implements aala {
    public static final aalb a = new awap();
    public final awar b;
    private final aakv c;

    public awaq(awar awarVar, aakv aakvVar) {
        this.b = awarVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getViewCountModel().a());
        amsvVar.j(getShortViewCountModel().a());
        amsvVar.j(getExtraShortViewCountModel().a());
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
        return new awao(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awaq) && this.b.equals(((awaq) obj).b);
    }

    public aqyg getExtraShortViewCount() {
        aqyg aqygVar = this.b.f;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getExtraShortViewCountModel() {
        aqyg aqygVar = this.b.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
    }

    public aqyg getShortViewCount() {
        aqyg aqygVar = this.b.e;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getShortViewCountModel() {
        aqyg aqygVar = this.b.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public String getUnlabeledConcurrentViewers() {
        return this.b.g;
    }

    public aqyg getViewCount() {
        aqyg aqygVar = this.b.d;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getViewCountModel() {
        aqyg aqygVar = this.b.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("ViewCountEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
