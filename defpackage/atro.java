package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atro implements aala {
    public static final aalb a = new atrn();
    private final atrp b;

    public atro(atrp atrpVar) {
        this.b = atrpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amxe it = ((amru) getStreamsProgressModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(auyq.a());
        }
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
        return new atrm(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof atro) && this.b.equals(((atro) obj).b);
    }

    public List getStreamsProgress() {
        return this.b.d;
    }

    public List getStreamsProgressModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            amrpVar.h(auyq.b((auyr) it.next()).e());
        }
        return amrpVar.g();
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("OfflineVideoStreamsEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
