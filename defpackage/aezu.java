package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezu implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public aezu(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static aezu b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aezu(azrwVar, azrwVar2, azrwVar3);
    }

    public static aezm c(ysy ysyVar, afeu afeuVar, afhs afhsVar) {
        return new aezm(ysyVar, afeuVar, afhsVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aezm get() {
        return c((ysy) this.a.get(), ((afev) this.b).get(), (afhs) this.c.get());
    }
}
