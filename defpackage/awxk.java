package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxk {
    public final aone a;

    public awxk(aone aoneVar) {
        this.a = aoneVar;
    }

    private awxk(aone aoneVar, byte[] bArr) {
        amkq.E(((ando) aoneVar.instance).d != 0);
        this.a = aoneVar;
    }

    public static awxk u(int i) {
        aone createBuilder = ando.a.createBuilder();
        createBuilder.copyOnWrite();
        ando andoVar = (ando) createBuilder.instance;
        andoVar.b |= 8;
        andoVar.d = i;
        return new awxk(createBuilder, (byte[]) null);
    }

    public final awxl a(aakv aakvVar) {
        return new awxl((awxm) this.a.build());
    }

    public final awnv b() {
        return new awnv((awoa) this.a.build());
    }

    public final awmv c(aakv aakvVar) {
        return new awmv((awnd) this.a.build(), aakvVar);
    }

    public final awjl d() {
        return new awjl((awjm) this.a.build());
    }

    public final auyq e() {
        return new auyq((auyr) this.a.build());
    }

    public final atpp f(aakv aakvVar) {
        return new atpp((atpq) this.a.build(), aakvVar);
    }

    public final atpe g(aakv aakvVar) {
        return new atpe((atpg) this.a.build());
    }

    public final atpd h() {
        return new atpd((atpf) this.a.build());
    }

    public final asvb i(aakv aakvVar) {
        return new asvb((asuv) this.a.build(), aakvVar);
    }

    public final void j() {
        new asne((asnf) this.a.build());
    }

    public final aqsr k(aakv aakvVar) {
        return new aqsr((aqss) this.a.build(), aakvVar);
    }

    public final aqnm l(aakv aakvVar) {
        return new aqnm((aqnq) this.a.build(), aakvVar);
    }

    public final void m(avgg... avggVarArr) {
        for (int i = 0; i <= 0; i++) {
            avgg avggVar = avggVarArr[i];
            aone aoneVar = this.a;
            aoneVar.copyOnWrite();
            aqnq aqnqVar = (aqnq) aoneVar.instance;
            aqnq aqnqVar2 = aqnq.a;
            avggVar.getClass();
            aony aonyVar = aqnqVar.c;
            if (!aonyVar.c()) {
                aqnqVar.c = aonm.mutableCopy(aonyVar);
            }
            aqnqVar.c.add(avggVar);
        }
    }

    public final void n(awjd awjdVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqnq aqnqVar = (aqnq) aoneVar.instance;
        aqnq aqnqVar2 = aqnq.a;
        aqnqVar.e = awjdVar.f;
        aqnqVar.b |= 1;
    }

    public final aqlk o() {
        return new aqlk((aqll) this.a.build());
    }

    public final apjp p() {
        return new apjp((apjq) this.a.build());
    }

    public final aotr q(aakv aakvVar) {
        return new aotr((aott) this.a.build(), aakvVar);
    }

    public final aotq r() {
        return new aotq((aots) this.a.build());
    }

    public final aaku s() {
        return new aaku((aqud) this.a.build());
    }

    public final void t(String str, String str2) {
        str2.getClass();
        aone aoneVar = this.a;
        aomf z = aomf.z(str2);
        aoneVar.copyOnWrite();
        aqud aqudVar = (aqud) aoneVar.instance;
        aqud aqudVar2 = aqud.a;
        aoot aootVar = aqudVar.b;
        if (!aootVar.b) {
            aqudVar.b = aootVar.a();
        }
        aqudVar.b.put(str, z);
    }

    public awxk(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = aqud.a.createBuilder();
    }

    public awxk(byte[] bArr, short[] sArr) {
        this.a = aqnq.a.createBuilder();
    }

    private awxk() {
        awxm awxmVar = awxm.a;
        throw null;
    }
}
