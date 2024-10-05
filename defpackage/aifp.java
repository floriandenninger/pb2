package defpackage;

import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifp extends Observable implements Observer {
    public final afkn a;
    public final afkn b;
    public final afkn c;
    public final afkn d;

    @Deprecated
    public aifp() {
        aifq aifqVar = aifq.a;
        throw null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        setChanged();
        if (observable == this.a) {
            notifyObservers(0);
            return;
        }
        if (observable == this.b) {
            notifyObservers(1);
        } else if (observable == this.c) {
            notifyObservers(2);
        } else if (observable == this.d) {
            notifyObservers(3);
        }
    }

    public aifp(afkn afknVar, afkn afknVar2, afkn afknVar3, afkn afknVar4) {
        this(afknVar, afknVar2, afknVar3, afknVar4, null);
    }

    public aifp(afkn afknVar, afkn afknVar2, afkn afknVar3, afkn afknVar4, byte[] bArr) {
        afknVar.getClass();
        this.a = afknVar;
        afknVar2.getClass();
        this.b = afknVar2;
        afknVar3.getClass();
        this.c = afknVar3;
        afknVar4.getClass();
        this.d = afknVar4;
        afknVar.addObserver(this);
        afknVar2.addObserver(this);
        afknVar3.addObserver(this);
        afknVar4.addObserver(this);
    }
}
