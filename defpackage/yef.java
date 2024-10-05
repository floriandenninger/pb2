package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yef implements afwx {
    private final zaw a;
    private final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint b;
    private final acpl c;
    private final aahd d;
    private final ycs e;
    private final abll f;
    private final aoae g;

    public yef(zaw zawVar, acpl acplVar, aahd aahdVar, abll abllVar, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, aoae aoaeVar, ycs ycsVar, byte[] bArr, byte[] bArr2) {
        this.a = zawVar;
        this.c = acplVar;
        this.d = aahdVar;
        this.f = abllVar;
        this.b = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        this.g = aoaeVar;
        this.e = ycsVar;
    }

    private final void d(boolean z) {
        arpp b;
        aomf aomfVar = this.b.e;
        if (aomfVar.H()) {
            return;
        }
        ydr ydrVar = new ydr();
        ydrVar.a = aomfVar;
        acpl acplVar = this.c;
        if (z) {
            b = ydrVar.f();
        } else {
            ydrVar.c = 4;
            b = ydrVar.b();
        }
        acplVar.c(b);
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (!this.b.g) {
            this.e.a();
        }
        zaw zawVar = this.a;
        zawVar.d(zawVar.b(cnqVar));
        abll abllVar = this.f;
        if (abllVar != null) {
            abllVar.a.i(cnqVar.getLocalizedMessage());
        }
        d(false);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction;
        aspb aspbVar;
        asfn asfnVar = (asfn) obj;
        if (!this.b.g) {
            this.e.a();
        }
        abll abllVar = this.f;
        if (abllVar != null) {
            if (asfnVar.c == 2) {
                completeTransactionActionOuterClass$CompleteTransactionAction = (CompleteTransactionActionOuterClass$CompleteTransactionAction) asfnVar.d;
            } else {
                completeTransactionActionOuterClass$CompleteTransactionAction = CompleteTransactionActionOuterClass$CompleteTransactionAction.a;
            }
            asgd asgdVar = completeTransactionActionOuterClass$CompleteTransactionAction.d;
            if (asgdVar == null) {
                asgdVar = asgd.a;
            }
            if (asgdVar.b != 136403337) {
                abllVar.a.j();
            } else {
                ablm ablmVar = abllVar.a;
                asgd asgdVar2 = completeTransactionActionOuterClass$CompleteTransactionAction.d;
                if (asgdVar2 == null) {
                    asgdVar2 = asgd.a;
                }
                if (asgdVar2.b == 136403337) {
                    aspbVar = (aspb) asgdVar2.c;
                } else {
                    aspbVar = aspb.a;
                }
                aqyg aqygVar = aspbVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                ablmVar.i(ajcq.b(aqygVar));
            }
        }
        if (asfnVar.c == 2) {
            CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction2 = (CompleteTransactionActionOuterClass$CompleteTransactionAction) asfnVar.d;
            this.d.b(completeTransactionActionOuterClass$CompleteTransactionAction2.e);
            if (completeTransactionActionOuterClass$CompleteTransactionAction2.f && (completeTransactionActionOuterClass$CompleteTransactionAction2.b & 1) != 0) {
                aone createBuilder = asfw.a.createBuilder();
                asfo asfoVar = completeTransactionActionOuterClass$CompleteTransactionAction2.c;
                if (asfoVar == null) {
                    asfoVar = asfo.a;
                }
                createBuilder.copyOnWrite();
                asfw asfwVar = (asfw) createBuilder.instance;
                asfoVar.getClass();
                asfwVar.d = asfoVar;
                asfwVar.b |= 2;
                this.g.n((asfw) createBuilder.build());
            }
        } else if ((asfnVar.b & 8) == 0) {
            this.g.m();
        } else {
            aahd aahdVar = this.d;
            apxf apxfVar = asfnVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
        d(true);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
