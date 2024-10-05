package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwi implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public adwi(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static adwi a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new adwi(azrwVar, azrwVar2, azrwVar3);
    }

    public static amnv c(final afhs afhsVar, final affs affsVar, final affq affqVar) {
        return new amnv() { // from class: advw
            @Override // defpackage.amnv
            public final Object get() {
                afhs afhsVar2 = afhs.this;
                affs affsVar2 = affsVar;
                affq affqVar2 = affqVar;
                int bp = anaf.bp(afhsVar2.s().h);
                return (bp == 0 || bp == 1) ? affqVar2 : affsVar2;
            }
        };
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final amnv get() {
        return c((afhs) this.a.get(), (affs) this.b.get(), (affq) this.c.get());
    }
}
