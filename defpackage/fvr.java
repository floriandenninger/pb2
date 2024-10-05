package defpackage;

import com.google.protos.youtube.api.innertube.CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvr implements aaha {
    public final azrw a;
    private final abde b;
    private final Executor c;
    private final /* synthetic */ int d;

    public fvr(abde abdeVar, azrw azrwVar, Executor executor, int i, byte[] bArr) {
        this.d = i;
        abdeVar.getClass();
        this.b = abdeVar;
        azrwVar.getClass();
        this.a = azrwVar;
        this.c = executor;
    }

    public fvr(abde abdeVar, azrw azrwVar, Executor executor, int i) {
        this.d = i;
        abdeVar.getClass();
        this.b = abdeVar;
        azrwVar.getClass();
        this.a = azrwVar;
        this.c = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.d == 0) {
            final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand = (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand) apxfVar.pX(EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.editSubscriptionsCollectionCommand);
            if ((editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.b & 2) != 0) {
                aahd aahdVar = (aahd) this.a.get();
                apxf apxfVar2 = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.a(apxfVar2);
            }
            abde abdeVar = this.b;
            arph arphVar = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.c;
            if (arphVar == null) {
                arphVar = arph.a;
            }
            abcz abczVar = new abcz(abdeVar.f, abdeVar.a.c(), arphVar, null, null, null);
            abczVar.l(apxfVar.c);
            abde abdeVar2 = this.b;
            ynm.k(abdeVar2.b.b(abczVar, this.c), angq.a, new ynk() { // from class: fvp
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    fvr fvrVar = fvr.this;
                    EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand2 = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
                    if ((editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand2.b & 4) != 0) {
                        aahd aahdVar2 = (aahd) fvrVar.a.get();
                        apxf apxfVar3 = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand2.e;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aahdVar2.a(apxfVar3);
                    }
                }
            }, new ynl() { // from class: fvq
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    fvr fvrVar = fvr.this;
                    arpg arpgVar = (arpg) obj;
                    if ((arpgVar.b & 2) != 0) {
                        aahd aahdVar2 = (aahd) fvrVar.a.get();
                        apxf apxfVar3 = arpgVar.d;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aahdVar2.a(apxfVar3);
                    }
                }
            });
            return;
        }
        final CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand = (CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand) apxfVar.pX(CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.createSubscriptionsCollectionCommand);
        if ((createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.b & 2) != 0) {
            aahd aahdVar2 = (aahd) this.a.get();
            apxf apxfVar3 = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.d;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar2.a(apxfVar3);
        }
        abde abdeVar3 = this.b;
        arnv arnvVar = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.c;
        if (arnvVar == null) {
            arnvVar = arnv.a;
        }
        abcy abcyVar = new abcy(abdeVar3.f, abdeVar3.a.c(), arnvVar, null, null, null);
        abcyVar.l(apxfVar.c);
        abde abdeVar4 = this.b;
        final byte[] bArr = null;
        ynm.k(abdeVar4.c.b(abcyVar, this.c), angq.a, new ynk(createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand, bArr) { // from class: fvn
            public final /* synthetic */ CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand a;

            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                fvr fvrVar = fvr.this;
                CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand2 = this.a;
                if ((createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand2.b & 4) != 0) {
                    aahd aahdVar3 = (aahd) fvrVar.a.get();
                    apxf apxfVar4 = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand2.e;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    aahdVar3.a(apxfVar4);
                }
            }
        }, new ynl(bArr) { // from class: fvo
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                fvr fvrVar = fvr.this;
                arnu arnuVar = (arnu) obj;
                if ((arnuVar.b & 2) != 0) {
                    aahd aahdVar3 = (aahd) fvrVar.a.get();
                    apxf apxfVar4 = arnuVar.d;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    aahdVar3.a(apxfVar4);
                }
            }
        });
    }
}
