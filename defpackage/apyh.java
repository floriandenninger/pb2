package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apyh implements aala {
    public static final aalb a = new apyg();
    private final aakv b;
    private final apyi c;

    public apyh(apyi apyiVar, aakv aakvVar) {
        this.c = apyiVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amxe it = ((amru) getCustomEmojisModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(((aqsr) it.next()).a());
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
        return new apyf(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof apyh) && this.c.equals(((apyh) obj).c);
    }

    public List getCustomEmojis() {
        return this.c.d;
    }

    public List getCustomEmojisModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.d.iterator();
        while (it.hasNext()) {
            amrpVar.h(aqsr.b((aqss) it.next()).k(this.b));
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("CommentCustomEmojisEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
