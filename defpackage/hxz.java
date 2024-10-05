package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hxz extends ce implements icq, hxy {
    private hxx a;
    public efi aA;

    @Override // defpackage.hxy
    public final hxx h() {
        yjk.f();
        if (this.a == null) {
            efi efiVar = this.aA;
            efz efzVar = efiVar.a;
            ehu ehuVar = efiVar.c;
            this.a = new efk(efzVar, efiVar.b, this);
        }
        return this.a;
    }
}
