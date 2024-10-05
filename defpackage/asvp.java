package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvp {
    public final aakv a;
    public final asvj b;

    public asvp(asvj asvjVar, aakv aakvVar) {
        this.b = asvjVar;
        this.a = aakvVar;
    }

    public final awnw a() {
        awnw awnwVar = this.b.h;
        return awnwVar == null ? awnw.a : awnwVar;
    }

    public final List b() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            aone builder = ((asvh) it.next()).toBuilder();
            amrpVar.h(new asvi((asvh) builder.build(), this.a));
        }
        return amrpVar.g();
    }

    public final boolean c() {
        return (this.b.b & 32) != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asvp) && this.b.equals(((asvp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("MacroMarkersListMessageModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
