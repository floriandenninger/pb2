package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryz {
    ryv a;
    public boolean b;
    float c;
    float d;
    public ryv e;
    public boolean f;

    public ryz() {
        this.b = true;
        this.e = null;
    }

    public ryz(ryz ryzVar) {
        this.b = true;
        this.e = null;
        this.a = ryzVar.a.a();
        this.b = ryzVar.b;
        this.c = ryzVar.c;
        this.d = ryzVar.d;
        ryv ryvVar = ryzVar.e;
        if (ryvVar != null) {
            this.e = ryvVar.a();
        }
        this.f = ryzVar.f;
    }
}
