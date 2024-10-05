package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydr {
    public aomf a;
    public String b = "";
    public int c;

    public final arpp a() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dO(g);
        return (arpp) a.build();
    }

    public final arpp b() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dP(g);
        return (arpp) a.build();
    }

    public final arpp c() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dQ(g);
        return (arpp) a.build();
    }

    public final arpp d() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dR(g);
        return (arpp) a.build();
    }

    public final arpp e() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dT(g);
        return (arpp) a.build();
    }

    public final arpp f() {
        arpn a = arpp.a();
        awfv g = g();
        a.copyOnWrite();
        ((arpp) a.instance).dU(g);
        return (arpp) a.build();
    }

    public final awfv g() {
        aone createBuilder = awfv.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar == null) {
            aomfVar = aomf.b;
        }
        createBuilder.copyOnWrite();
        awfv awfvVar = (awfv) createBuilder.instance;
        aomfVar.getClass();
        awfvVar.b |= 1;
        awfvVar.c = aomfVar;
        int i = this.c;
        int i2 = i != 0 ? i : 1;
        createBuilder.copyOnWrite();
        awfv awfvVar2 = (awfv) createBuilder.instance;
        awfvVar2.d = i2 - 1;
        awfvVar2.b |= 2;
        String str = this.b;
        createBuilder.copyOnWrite();
        awfv awfvVar3 = (awfv) createBuilder.instance;
        str.getClass();
        awfvVar3.b |= 64;
        awfvVar3.e = str;
        return (awfv) createBuilder.build();
    }
}
