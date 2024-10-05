package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awiu implements aala {
    public static final aalb a = new awit();
    public final aakv b;
    public final awiw c;

    public awiu(awiw awiwVar, aakv aakvVar) {
        this.c = awiwVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awiw awiwVar = this.c;
        if ((awiwVar.c & 4) != 0) {
            amsvVar.c(awiwVar.f);
        }
        amxe it = ((amru) getDownloadsModels()).iterator();
        while (it.hasNext()) {
            awir awirVar = (awir) it.next();
            amsv amsvVar2 = new amsv();
            awiv awivVar = awirVar.a;
            if (awivVar.b == 1) {
                amsvVar2.c((String) awivVar.c);
            }
            awiv awivVar2 = awirVar.a;
            if (awivVar2.b == 2) {
                amsvVar2.c((String) awivVar2.c);
            }
            awiv awivVar3 = awirVar.a;
            if (awivVar3.b == 3) {
                amsvVar2.c((String) awivVar3.c);
            }
            amsvVar.j(amsvVar2.g());
        }
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final awis e() {
        return new awis(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awiu) && this.c.equals(((awiu) obj).c);
    }

    public List getDownloads() {
        return this.c.e;
    }

    public List getDownloadsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.e.iterator();
        while (it.hasNext()) {
            amrpVar.h(new awir((awiv) ((awiv) it.next()).toBuilder().build()));
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
        sb.append("YtMainDownloadsListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
