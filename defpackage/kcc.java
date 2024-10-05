package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcc implements rpo {
    final /* synthetic */ String a;
    final /* synthetic */ kcd b;

    public kcc(kcd kcdVar, String str) {
        this.b = kcdVar;
        this.a = str;
    }

    @Override // defpackage.rpo
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        qob qobVar = this.b.a.get();
        String str = this.a;
        String packageName = qobVar.w.getPackageName();
        qrd b = qre.b();
        b.a = new rnw(str, packageName, 0);
        b.b = new Feature[]{rns.c};
        b.b();
        rpt t = qobVar.t(b.a());
        t.r(new rpo() { // from class: kcb
            @Override // defpackage.rpo
            public final void d(Object obj2) {
                kcc kccVar = kcc.this;
                ExperimentTokens experimentTokens = (ExperimentTokens) obj2;
                anrw anrwVar = null;
                if (experimentTokens != null) {
                    aone createBuilder = anrw.a.createBuilder();
                    int[] iArr = experimentTokens.h;
                    if (!pse.p(iArr) || !pse.p(null)) {
                        aone createBuilder2 = anrv.a.createBuilder();
                        if (iArr != null) {
                            for (int i : iArr) {
                                createBuilder2.copyOnWrite();
                                anrv anrvVar = (anrv) createBuilder2.instance;
                                aonu aonuVar = anrvVar.b;
                                if (!aonuVar.c()) {
                                    anrvVar.b = aonm.mutableCopy(aonuVar);
                                }
                                anrvVar.b.g(i);
                            }
                        }
                        aomf byteString = ((anrv) createBuilder2.build()).toByteString();
                        createBuilder.copyOnWrite();
                        anrw anrwVar2 = (anrw) createBuilder.instance;
                        anrwVar2.b |= 1;
                        anrwVar2.c = byteString;
                    }
                    byte[] bArr = experimentTokens.c;
                    if (bArr != null && bArr.length != 0) {
                        createBuilder.J(aomf.x(bArr));
                    }
                    byte[][] bArr2 = experimentTokens.i;
                    if (bArr2 != null) {
                        for (byte[] bArr3 : bArr2) {
                            if (bArr3 != null && bArr3.length != 0) {
                                createBuilder.J(aomf.x(bArr3));
                            }
                        }
                    }
                    createBuilder.copyOnWrite();
                    anrw anrwVar3 = (anrw) createBuilder.instance;
                    anrwVar3.b |= 4;
                    anrwVar3.e = false;
                    byte[][][] bArr4 = {experimentTokens.e, experimentTokens.f, experimentTokens.g};
                    for (int i2 = 0; i2 < 3; i2++) {
                        byte[][] bArr5 = bArr4[i2];
                        if (bArr5 != null) {
                            List aU = amkq.aU(Arrays.asList(bArr5), aoqr.a.e());
                            createBuilder.copyOnWrite();
                            anrw anrwVar4 = (anrw) createBuilder.instance;
                            anrwVar4.a();
                            aolo.addAll((Iterable) aU, (List) anrwVar4.d);
                        }
                    }
                    anrwVar = (anrw) createBuilder.build();
                }
                if (anrwVar != null) {
                    kccVar.b.b.put("com.youtube.mainapp.android", anrwVar);
                }
            }
        });
        t.n(new rpl() { // from class: kca
            @Override // defpackage.rpl
            public final void c(Exception exc) {
                kcc.this.b.b.remove("com.youtube.mainapp.android");
                afsi.c(1, 12, "Failed to get Heterodyne IDs for Mendel package com.youtube.mainapp.android", exc);
            }
        });
    }
}
