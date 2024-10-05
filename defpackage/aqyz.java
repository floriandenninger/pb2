package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyz implements aala {
    public static final aalb a = new aqyy();
    private final aakv b;
    private final aqza c;

    public aqyz(aqza aqzaVar, aakv aakvVar) {
        this.c = aqzaVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        aqyw aqywVar;
        amsv amsvVar = new amsv();
        amxe it = ((amru) getFormfillFieldResultsModels()).iterator();
        while (it.hasNext()) {
            aqyt aqytVar = (aqyt) it.next();
            amsv amsvVar2 = new amsv();
            aqyv aqyvVar = aqytVar.b;
            if (aqyvVar.c == 4) {
                aqywVar = (aqyw) aqyvVar.d;
            } else {
                aqywVar = aqyw.a;
            }
            aone builder = aqywVar.toBuilder();
            aakv aakvVar = aqytVar.a;
            new aqyu((aqyw) builder.build());
            amsvVar2.j(new amsv().g());
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
        return new aqyx(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqyz) && this.c.equals(((aqyz) obj).c);
    }

    public List getFormfillFieldResults() {
        return this.c.d;
    }

    public List getFormfillFieldResultsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.d.iterator();
        while (it.hasNext()) {
            aone builder = ((aqyv) it.next()).toBuilder();
            amrpVar.h(new aqyt((aqyv) builder.build(), this.b));
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("FormfillFieldsEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
