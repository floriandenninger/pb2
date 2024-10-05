package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxa {
    final List a;
    final int b;
    final rxi c;
    final rze d;
    final rxi e;
    final rxi f;
    final rze g;

    public rxa(List list, int i, rxi rxiVar, rze rzeVar, rxi rxiVar2, rxi rxiVar3, rze rzeVar2) {
        sbt.g(list, "data");
        sbt.g(rxiVar, "domains");
        sbt.g(rzeVar, "domainScale");
        sbt.g(rxiVar2, "measures");
        sbt.g(rxiVar3, "measureOffsets");
        sbt.g(rzeVar2, "measureScale");
        sbt.a(i <= list.size(), "Claiming to use more data than given.");
        sbt.a(i == rxiVar.c, "domain size doesn't match data");
        sbt.a(i == rxiVar2.c, "measures size doesn't match data");
        sbt.a(i == rxiVar3.c, "measureOffsets size doesn't match data");
        this.a = list;
        this.b = i;
        this.c = rxiVar;
        this.d = rzeVar;
        this.e = rxiVar2;
        this.f = rxiVar3;
        this.g = rzeVar2;
    }
}
