package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhu implements abdr {
    public String a = "";
    public String b = "";
    public String c = "";
    private final aaea d;

    public mhu(aaea aaeaVar) {
        this.d = aaeaVar;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        aswb aswbVar = this.d.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        String str = aswbVar.aY;
        aswb aswbVar2 = this.d.a().e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        String str2 = aswbVar2.aZ;
        if (str.isEmpty() && str2.isEmpty()) {
            return;
        }
        abduVar.x = this.a;
        abduVar.y = this.b;
        abduVar.z = this.c;
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
