package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqq implements aala {
    public static final aalb a = new asqp();
    public final aakv b;
    public final asqt c;

    public asqq(asqt asqtVar, aakv aakvVar) {
        this.c = asqtVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getMetadataTextModel().a());
        amsvVar.j(getCollapsedMetadataTextModel().a());
        for (asqm asqmVar : getPollChoiceStatesMap().values()) {
            amsv amsvVar2 = new amsv();
            aqyg aqygVar = asqmVar.b.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            amsvVar2.j(aqyd.b(aqygVar).d(asqmVar.a).a());
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
        return new asqo(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asqq) && this.c.equals(((asqq) obj).c);
    }

    public aqyg getCollapsedMetadataText() {
        aqyg aqygVar = this.c.e;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getCollapsedMetadataTextModel() {
        aqyg aqygVar = this.c.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.b);
    }

    public aqyg getMetadataText() {
        aqyg aqygVar = this.c.d;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getMetadataTextModel() {
        aqyg aqygVar = this.c.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.b);
    }

    public Map getPollChoiceStatesMap() {
        return amkq.aM(Collections.unmodifiableMap(this.c.f), new amml() { // from class: asqn
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                asqq asqqVar = asqq.this;
                aone builder = ((asqr) obj).toBuilder();
                return new asqm((asqr) builder.build(), asqqVar.b);
            }
        });
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("LiveChatPollStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
