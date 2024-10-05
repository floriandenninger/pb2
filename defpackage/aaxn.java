package defpackage;

import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aaxn extends aasw {
    public final afsy a;
    public final aasp b;

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arxe.a, aarmVar, lyk.g, iom.e);
    }

    public aaxm a() {
        return new aaxm(this.f, this.a.c(), null, null, null);
    }

    public final arxn b(aaxm aaxmVar) {
        return (arxn) this.b.d(aaxmVar);
    }

    public final aaxc d() {
        return new aaxc(this.f, this.a.c(), null, null, null);
    }

    public final void e(aaxc aaxcVar, afwx afwxVar) {
        this.b.e(aaxcVar, afwxVar);
    }

    public final aawz f() {
        return new aawz(this.f, this.a.c(), null, null, null);
    }

    public final aawk g() {
        return new aawk(this.f, this.a.c(), null, null, null);
    }

    public final void h(aawk aawkVar) {
    }

    public final wkw i(Optional optional, int i) {
        aone createBuilder = arxd.a.createBuilder();
        createBuilder.copyOnWrite();
        arxd arxdVar = (arxd) createBuilder.instance;
        arxdVar.e = i - 1;
        arxdVar.b |= 4;
        optional.ifPresent(new wkx(createBuilder, 0));
        wkw wkwVar = new wkw(this.f, this.a.c(), (arxd) createBuilder.build(), null, null, null);
        wkwVar.m(aaef.b);
        return wkwVar;
    }

    public final abdm j() {
        return new abdm(this.f, this.a.c(), null, null, null);
    }

    public final abdm k(String str) {
        return new abdm(this.f, this.a.d(str), null, null, null);
    }

    public final anhy l(aaru aaruVar) {
        return this.b.a(aaruVar);
    }

    public final asek m(abdm abdmVar) {
        yjk.e();
        try {
            return (asek) l(abdmVar).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aasx(e);
        }
    }

    public final abdh n() {
        return new abdh(this.f, this.a.c(), null, null, null);
    }

    public final void o(abdh abdhVar, afwx afwxVar) {
        this.b.e(abdhVar, afwxVar);
    }

    public final abdg p() {
        return new abdg(this.f, this.a.c(), null, null, null);
    }

    public final anhy q(abdg abdgVar) {
        return this.b.a(abdgVar);
    }

    public final anhy r(apxf apxfVar, Executor executor) {
        amkq.E(apxfVar.pY(arbr.b));
        arbr arbrVar = (arbr) apxfVar.pX(arbr.b);
        abcu abcuVar = new abcu(this.f, this.a.c(), null, null, null);
        abcuVar.a = arbrVar.c;
        abcuVar.b = arbrVar.d;
        abcuVar.l(apxfVar.c);
        abcuVar.l(aomf.b);
        return this.b.b(abcuVar, executor);
    }

    public final abdz s() {
        return new abdz(this.f, this.a.c(), null, null, null);
    }

    public final void t(abdz abdzVar, afwx afwxVar) {
        this.b.e(abdzVar, afwxVar);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arzv.a, aarmVar, lyk.u, iom.h);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asei.a, aarmVar, aatt.b, iom.i);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arjh.a, aarmVar, aatt.e, iom.m);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, char[] cArr, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(armn.a, aarmVar, aavh.i, aavd.q);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, char[] cArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arpa.a, aarmVar, aavh.k, aavd.s);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(apsv.a, aarmVar, aavh.l, aavd.t);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arqe.a, aarmVar, aavh.m, aavd.u);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arqh.a, aarmVar, aavh.n, aaxf.b);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arxg.a, aarmVar, aavh.o, aaxf.a);
    }

    protected aaxn() {
        this.b = null;
        afsy afsyVar = afta.a;
        throw null;
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arxn.a, aarmVar, aavh.q, aaxf.d);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arbm.a, aarmVar, aaxq.e, aaxf.m);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arbq.a, aarmVar, aaxq.f, aaxf.n);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(avsf.a, aarmVar, aaxq.g, aaxf.o);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arim.a, aarmVar, aaxq.l, aaxf.t);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(ariv.a, aarmVar, aaxq.m, aaxf.u);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arqo.a, aarmVar, aaxq.n, aayn.b);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arqr.a, aarmVar, aaxq.o, aayn.a);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arqx.a, aarmVar, aaxq.p, aayn.c);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrn.a, aarmVar, aaxq.q, aayn.d);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, char[] cArr, byte[] bArr5, byte[] bArr6) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(ascq.a, aarmVar, aaxq.s, aayn.f);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, char[] cArr2, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(aroy.a, aarmVar, abaa.d, aazu.l);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr, byte[] bArr4, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arwe.a, aarmVar, abaa.e, aazu.m);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, char[] cArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrr.a, aarmVar, abaa.g, aazu.o);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, char[] cArr, byte[] bArr6) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrx.a, aarmVar, abaa.h, aazu.p);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr2, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arzq.a, aarmVar, abaa.s, abax.f);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, char[] cArr2, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arsm.a, aarmVar, abce.d, abax.l);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, char[] cArr, byte[] bArr2, char[] cArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asac.a, aarmVar, abce.k, abax.s);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr, byte[] bArr5) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(ascg.a, aarmVar, abce.l, abax.t);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, short[] sArr, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asck.a, aarmVar, abce.m, abax.u);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asco.a, aarmVar, abce.n, abdk.b);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, short[] sArr, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asek.a, aarmVar, abce.p, abdk.c);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, char[] cArr) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arml.a, aarmVar, abce.s, abdk.f);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, char[] cArr2) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrk.a, aarmVar, abce.t, abdk.g);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4, char[] cArr2) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrp.a, aarmVar, abce.u, abdk.h);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, char[] cArr2) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asga.a, aarmVar, abea.b, abdk.i);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, char[] cArr) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asfk.a, aarmVar, abea.a, abdk.j);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr2) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arrv.a, aarmVar, abea.c, abdk.k);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, char[] cArr) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arut.a, aarmVar, abea.d, abdk.l);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, char[] cArr2) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arxc.a, aarmVar, abea.e, abdk.m);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, char[] cArr) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(arzx.a, aarmVar, abea.f, abdk.n);
    }

    public aaxn(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(atra.a, aarmVar, afrl.g, abxm.i);
    }
}
