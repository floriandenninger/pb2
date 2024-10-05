package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcd extends afbz {
    final /* synthetic */ afce a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcd(afce afceVar, aeru aeruVar) {
        super(aeruVar);
        this.a = afceVar;
    }

    @Override // defpackage.afbz
    public final void A(long j) {
        if (this.a.k.w()) {
            afce afceVar = this.a;
            String c = afhm.c();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 42);
            sb.append("onFallbackTransition.");
            sb.append(j);
            sb.append(".");
            sb.append(c);
            afceVar.u(sb.toString());
        }
        super.y(j);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void f() {
        yjk.f();
        if (this.a.k.w()) {
            afce afceVar = this.a;
            String valueOf = String.valueOf(afhm.c());
            afceVar.u(valueOf.length() != 0 ? "onEnded.".concat(valueOf) : new String("onEnded."));
        }
        super.f();
        this.a.m = false;
        this.a.b.post(new afcc(this, 1));
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void g(afih afihVar) {
        yjk.f();
        if (this.a.k.w()) {
            afce afceVar = this.a;
            String str = true != afihVar.n() ? "0" : "1";
            String str2 = true == afihVar.u() ? "1" : "0";
            String c = afhm.c();
            StringBuilder sb = new StringBuilder(str.length() + 10 + str2.length() + String.valueOf(c).length());
            sb.append("onError.");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            sb.append(".");
            sb.append(c);
            afceVar.u(sb.toString());
        }
        if (afihVar.n()) {
            this.a.E();
        } else if (afihVar.u()) {
            afce afceVar2 = this.a;
            afceVar2.d.addAll(0, afceVar2.c);
            if (!this.a.c.isEmpty() && ((afeb) this.a.c.get(0)).a != -1) {
                this.a.h = true;
            }
            this.a.c.clear();
            afce afceVar3 = this.a;
            if (afceVar3.h) {
                afceVar3.b.post(new afcc(this, 0));
            }
        }
        super.g(afihVar);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void j(afqu afquVar) {
        afce afceVar = this.a;
        afcb afcbVar = afceVar.j;
        if (afcbVar != null) {
            afqu afquVar2 = afceVar.i;
            boolean z = false;
            if (afquVar2 != null && !afquVar.equals(afquVar2)) {
                z = true;
            }
            afcb.a(z, afcbVar.a, afcbVar.c);
            afcb.a(z, afcbVar.b, afcbVar.d);
            this.a.j = null;
        }
        afce afceVar2 = this.a;
        afceVar2.i = afquVar;
        if (afceVar2.k.w()) {
            afce afceVar3 = this.a;
            String valueOf = String.valueOf(afhm.c());
            afceVar3.u(valueOf.length() != 0 ? "onLoaded.".concat(valueOf) : new String("onLoaded."));
        }
        super.j(afquVar);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void q() {
        yjk.f();
        if (this.a.k.w()) {
            afce afceVar = this.a;
            String valueOf = String.valueOf(afhm.c());
            afceVar.u(valueOf.length() != 0 ? "onPlaying.".concat(valueOf) : new String("onPlaying."));
        }
        super.q();
        this.a.m = false;
        this.a.b.post(new afcc(this, 2));
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void y(long j) {
        yjk.f();
        if (!this.a.c.isEmpty()) {
            if (this.a.k.w()) {
                afce afceVar = this.a;
                String c = afhm.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34);
                sb.append("onTransition.");
                sb.append(j);
                sb.append(".");
                sb.append(c);
                afceVar.u(sb.toString());
            }
            super.y(j);
            afeb afebVar = (afeb) this.a.c.remove(0);
            aerv aervVar = this.a.e;
            String str = aervVar != null ? aervVar.d : null;
            String str2 = aervVar != null ? aervVar.b.c : null;
            afbz afbzVar = (afbz) afebVar.b.a();
            if (str != null) {
                afce afceVar2 = this.a;
                afceVar2.j = new afcb(afceVar2.f, afbzVar, afebVar, true, str, str2);
            }
            afce afceVar3 = this.a;
            aerv aervVar2 = afceVar3.e;
            if (aervVar2 != null) {
                aerv aervVar3 = afebVar.b;
                aervVar2.d = aervVar3.d;
                aervVar2.b = aervVar3.b;
                aervVar2.g = aervVar3.a();
            } else {
                afceVar3.e = new aerv(afebVar.b);
            }
            afce afceVar4 = this.a;
            afceVar4.g = afceVar4.e.a;
            afceVar4.f = afbzVar;
            afceVar4.b.post(new afbx(afceVar4, 2));
            return;
        }
        super.g(new afih("player.fatalexception", this.a.g(), "onTransition without queued video"));
        this.a.F(false);
    }
}
