package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefa implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public aefa(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static aefa b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aefa(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeez get() {
        return new aeez((aeet) this.a.get(), ((ahai) this.b).get(), (ysy) this.c.get(), (afhs) this.d.get(), (afkg) this.e.get());
    }
}
