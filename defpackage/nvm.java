package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvm implements axpg {
    private final /* synthetic */ int e;
    public static final /* synthetic */ nvm d = new nvm(3);
    public static final /* synthetic */ nvm c = new nvm(2);
    public static final /* synthetic */ nvm b = new nvm(1);
    public static final /* synthetic */ nvm a = new nvm(0);

    private /* synthetic */ nvm(int i) {
        this.e = i;
    }

    @Override // defpackage.axpg
    public final Object get() {
        int i = this.e;
        if (i == 0) {
            return new ibl(2);
        }
        if (i == 1) {
            return Optional.empty();
        }
        if (i == 2) {
            return amvs.a;
        }
        uts c2 = utt.c();
        c2.b(true);
        return c2.a();
    }
}
