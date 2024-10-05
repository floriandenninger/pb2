package defpackage;

import com.google.protos.youtube.api.innertube.ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifg implements aaha {
    private final ysy a;
    private final lrw b;
    private final ino c;

    public ifg(ysy ysyVar, lrw lrwVar, ino inoVar) {
        this.a = ysyVar;
        this.b = lrwVar;
        this.c = inoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [ajos, java.lang.Object] */
    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        amkq.E(apxfVar.pY(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.showBrowseElementsBottomSheetCommand));
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand = (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand) apxfVar.pX(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.showBrowseElementsBottomSheetCommand);
        if (this.c.I()) {
            this.c.z();
        }
        final ino inoVar = this.c;
        apxf apxfVar2 = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.b;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        apxf apxfVar3 = apxfVar2;
        aqyg aqygVar = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        float f = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.d;
        float f2 = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.e;
        if (apxfVar3 == null) {
            afsi.b(2, 24, "ReelBrowseElementsBottomSheet without valid command");
            return;
        }
        if (aqygVar == null) {
            afsi.b(2, 24, "ReelBrowseElementsBottomSheet without valid title");
            return;
        }
        inoVar.D(f);
        inoVar.C(f2);
        final int i = 0;
        inoVar.E(false);
        inoVar.n = aqygVar;
        inoVar.G();
        final hxp hxpVar = inoVar.b;
        final Consumer consumer = new Consumer() { // from class: inn
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return i != 0 ? Consumer.CC.$default$andThen(this, consumer2) : Consumer.CC.$default$andThen(this, consumer2);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                if (i == 0) {
                    inoVar.l((hxn) obj);
                    return;
                }
                ino inoVar2 = inoVar;
                String valueOf = String.valueOf((cnq) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("fetch browseResponseModel failed");
                sb.append(valueOf);
                afsi.b(2, 24, sb.toString());
                inoVar2.z();
            }
        };
        final int i2 = 1;
        final Consumer consumer2 = new Consumer() { // from class: inn
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer22) {
                return i2 != 0 ? Consumer.CC.$default$andThen(this, consumer22) : Consumer.CC.$default$andThen(this, consumer22);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                if (i2 == 0) {
                    inoVar.l((hxn) obj);
                    return;
                }
                ino inoVar2 = inoVar;
                String valueOf = String.valueOf((cnq) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("fetch browseResponseModel failed");
                sb.append(valueOf);
                afsi.b(2, 24, sb.toString());
                inoVar2.z();
            }
        };
        azrs aT = azrl.e().aT();
        ayqx ax = aT.aj(new ayrv() { // from class: hxl
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                hxp hxpVar2 = hxp.this;
                ammw ammwVar = (ammw) obj;
                fgh a = hxpVar2.f.a((aauc) ammwVar.a);
                return aypy.X(a.b.h(hxj.a).h(new iul(a.a, 1)).x(new hxm(ammwVar, 1)).h(hxj.b).P(), a.a.G(new hxm(ammwVar, 0)).o(iuq.b).l()).aG(gpd.f);
            }
        }).ax(new ayrs() { // from class: hxk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Consumer consumer3 = Consumer.this;
                Consumer consumer4 = consumer2;
                hxo hxoVar = (hxo) obj;
                hxoVar.a.ifPresent(consumer3);
                hxoVar.b.ifPresent(consumer4);
            }
        });
        aT.c(izr.p(hxpVar.a.e(), apxfVar3, false, hxpVar.b, hxpVar.g, hxpVar.d, hxpVar.e, hxpVar.c));
        inoVar.d = ax;
        if (!inoVar.c.isPresent()) {
            inoVar.c = Optional.of(inoVar.o.a(null, inoVar.l, inoVar.e, inoVar.k, inoVar.j.a(inoVar.k, inoVar.h.mM()), inoVar.h.mM(), inoVar.i.get(), ajxa.WI, ajwk.d, ajhb.OTHERS, inoVar.m, inoVar.g));
            ((ajwi) inoVar.c.get()).c();
        }
        ((ajwi) inoVar.c.get()).h();
        ((ajwi) inoVar.c.get()).Q();
        inoVar.a.addView(inoVar.e);
    }
}
