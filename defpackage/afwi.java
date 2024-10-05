package defpackage;

import j$.util.function.Supplier;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afwi implements afvz {
    private static final amxj a = amxj.l("com/google/android/libraries/youtube/net/retries/NetworkRetryControllerTypeScriptBridge");
    private final Supplier b;
    private final anib c;

    public afwi(anib anibVar, final afwa afwaVar, final awxc awxcVar, final avlr avlrVar) {
        this.c = anibVar;
        final amnv x = amkq.x(new amnv() { // from class: afwg
            @Override // defpackage.amnv
            public final Object get() {
                afwa afwaVar2 = afwa.this;
                awxc awxcVar2 = awxcVar;
                avlr avlrVar2 = avlrVar;
                barv a2 = afwaVar2.a();
                aone createBuilder = awww.a.createBuilder();
                createBuilder.copyOnWrite();
                awww awwwVar = (awww) createBuilder.instance;
                awwwVar.c = awxcVar2;
                awwwVar.b |= 1;
                createBuilder.copyOnWrite();
                awww awwwVar2 = (awww) createBuilder.instance;
                awwwVar2.d = avlrVar2;
                awwwVar2.b |= 2;
                awww awwwVar3 = (awww) createBuilder.build();
                a2.b();
                a2.c();
                aopf parserForType = awwx.a.getParserForType();
                try {
                    NativeBindingRouter nativeBindingRouter = a2.a;
                    String str = a2.c;
                    aomf byteString = awwwVar3.toByteString();
                    try {
                        aong aongVar = (aong) awkg.a.createBuilder();
                        aone createBuilder2 = awkr.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awkr awkrVar = (awkr) createBuilder2.instance;
                        awkrVar.b |= 2;
                        awkrVar.c = str;
                        createBuilder2.copyOnWrite();
                        awkr awkrVar2 = (awkr) createBuilder2.instance;
                        awkrVar2.b |= 4;
                        awkrVar2.d = 27285591;
                        createBuilder2.copyOnWrite();
                        awkr awkrVar3 = (awkr) createBuilder2.instance;
                        awkrVar3.b |= 8;
                        awkrVar3.e = byteString;
                        aongVar.copyOnWrite();
                        awkg awkgVar = (awkg) aongVar.instance;
                        awkr awkrVar4 = (awkr) createBuilder2.build();
                        awkrVar4.getClass();
                        awkgVar.c = awkrVar4;
                        awkgVar.b = 4;
                        return a2;
                    } catch (aoob e) {
                        throw new bars(e);
                    }
                } catch (aoob e2) {
                    throw new bars(e2);
                }
            }
        });
        x.getClass();
        this.b = new Supplier() { // from class: afwh
            @Override // j$.util.function.Supplier
            public final Object get() {
                return (barv) amnv.this.get();
            }
        };
    }

    @Override // defpackage.afvz
    public final anhy a(awyx awyxVar) {
        try {
            barv barvVar = (barv) this.b.get();
            aone createBuilder = awxa.a.createBuilder();
            createBuilder.copyOnWrite();
            awxa awxaVar = (awxa) createBuilder.instance;
            awyxVar.getClass();
            awxaVar.c = awyxVar;
            awxaVar.b |= 1;
            awxa awxaVar2 = (awxa) createBuilder.build();
            barvVar.b();
            barvVar.c();
            return anfq.h(barvVar.a(1244083700, awxaVar2, awxb.a.getParserForType()), adpv.s, this.c);
        } catch (bars e) {
            ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/youtube/net/retries/NetworkRetryControllerTypeScriptBridge", "onNonSuccessStatus", 'a', "NetworkRetryControllerTypeScriptBridge.java")).q("Blocks Exception while trying to update request");
            return anaf.N(e);
        }
    }

    @Override // defpackage.afvz
    public final anhy b(int i) {
        try {
            barv barvVar = (barv) this.b.get();
            aone createBuilder = awwy.a.createBuilder();
            createBuilder.copyOnWrite();
            awwy awwyVar = (awwy) createBuilder.instance;
            awwyVar.c = i - 1;
            awwyVar.b |= 1;
            awwy awwyVar2 = (awwy) createBuilder.build();
            barvVar.b();
            barvVar.c();
            return anfq.h(barvVar.a(718355788, awwyVar2, awwz.a.getParserForType()), adpv.r, this.c);
        } catch (bars e) {
            ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/youtube/net/retries/NetworkRetryControllerTypeScriptBridge", "onNetworkError", 'Q', "NetworkRetryControllerTypeScriptBridge.java")).q("Blocks Exception while trying to update request");
            return anaf.N(e);
        }
    }
}
