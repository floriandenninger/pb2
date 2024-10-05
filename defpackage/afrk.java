package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrk extends afra implements afrh {
    protected final zjl a;
    private final ajun b;

    public afrk(zjl zjlVar) {
        zjlVar.getClass();
        this.a = zjlVar;
        this.b = ahbx.w();
    }

    @Override // defpackage.afrh
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        aism aismVar = (aism) obj;
        zhq.m(aismVar.a.i());
        return ysk.b(aismVar.a.h()).a();
    }

    @Override // defpackage.afra
    protected final Object g(InputStream inputStream) {
        try {
            return ((afts) this.a.b(inputStream, this.b)).a();
        } catch (Exception e) {
            throw new zjg(e);
        }
    }
}
