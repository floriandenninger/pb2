package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yey {
    public aomf a;
    public int b;

    public final awgd a() {
        aone createBuilder = awgd.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            awgd awgdVar = (awgd) createBuilder.instance;
            awgdVar.b |= 1;
            awgdVar.c = aomfVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awgd awgdVar2 = (awgd) createBuilder.instance;
            awgdVar2.d = i - 1;
            awgdVar2.b |= 2;
        }
        return (awgd) createBuilder.build();
    }

    public final arpp b() {
        arpn a = arpp.a();
        aone createBuilder = awgc.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            awgc awgcVar = (awgc) createBuilder.instance;
            awgcVar.b |= 1;
            awgcVar.c = aomfVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awgc awgcVar2 = (awgc) createBuilder.instance;
            awgcVar2.d = i - 1;
            awgcVar2.b |= 4;
        }
        awgc awgcVar3 = (awgc) createBuilder.build();
        a.copyOnWrite();
        ((arpp) a.instance).eD(awgcVar3);
        return (arpp) a.build();
    }

    public final awga c() {
        aone createBuilder = awga.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            awga awgaVar = (awga) createBuilder.instance;
            awgaVar.b |= 1;
            awgaVar.c = aomfVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awga awgaVar2 = (awga) createBuilder.instance;
            awgaVar2.d = i - 1;
            awgaVar2.b |= 2;
        }
        return (awga) createBuilder.build();
    }

    public final awfw d() {
        aone createBuilder = awfw.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        awfw awfwVar = (awfw) createBuilder.instance;
        aomfVar.getClass();
        awfwVar.b |= 1;
        awfwVar.c = aomfVar;
        int i = this.b;
        int i2 = i != 0 ? i : 1;
        createBuilder.copyOnWrite();
        awfw awfwVar2 = (awfw) createBuilder.instance;
        awfwVar2.d = i2 - 1;
        awfwVar2.b |= 2;
        return (awfw) createBuilder.build();
    }
}
