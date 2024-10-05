package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvn implements cvz {
    private final cvl a;

    public cvn(cvl cvlVar) {
        this.a = cvlVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        File file = (File) obj;
        return new cvy(new dcz(file), new cvk(file, this.a));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
