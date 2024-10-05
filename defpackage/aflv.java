package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflv implements swv {
    public final sxd a;
    private final /* synthetic */ int b;

    public aflv(sxd sxdVar, int i) {
        this.b = i;
        this.a = sxdVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        final String str;
        final String str2;
        int i = this.b;
        if (i == 0) {
            final aqdm aqdmVar = (aqdm) obj;
            if ((aqdmVar.c & 2) != 0) {
                str = aqdmVar.e;
            } else {
                awpu awpuVar = swuVar.e;
                if (awpuVar != null && (awpuVar.pY(awoq.b) || awpuVar.pY(awud.b))) {
                    if (awpuVar.pY(awoq.b)) {
                        awnd awndVar = ((awoq) awpuVar.pX(awoq.b)).d;
                        if (awndVar == null) {
                            awndVar = awnd.a;
                        }
                        str = awndVar.c;
                    } else {
                        str = ((awud) awpuVar.pX(awud.b)).j;
                    }
                } else {
                    return ayph.f();
                }
            }
            return ayph.t(new ayrm() { // from class: aflu
                @Override // defpackage.ayrm
                public final void a() {
                    int i2;
                    aflv aflvVar = aflv.this;
                    String str3 = str;
                    aqdm aqdmVar2 = aqdmVar;
                    int i3 = 0;
                    int codePointCount = str3.codePointCount(0, str3.length());
                    if (codePointCount != 0) {
                        i3 = codePointCount;
                    } else if (!aqdmVar2.g) {
                        i2 = 3;
                        sxd sxdVar = aflvVar.a;
                        String str4 = aqdmVar2.d;
                        aone createBuilder = awqm.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awqm awqmVar = (awqm) createBuilder.instance;
                        awqmVar.b |= 1;
                        awqmVar.c = i3;
                        createBuilder.copyOnWrite();
                        awqm awqmVar2 = (awqm) createBuilder.instance;
                        awqmVar2.d = i2 - 1;
                        awqmVar2.b |= 2;
                        sxdVar.b(str4, ((awqm) createBuilder.build()).toByteArray());
                    }
                    i2 = i3 > aqdmVar2.f ? 4 : 2;
                    sxd sxdVar2 = aflvVar.a;
                    String str42 = aqdmVar2.d;
                    aone createBuilder2 = awqm.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    awqm awqmVar3 = (awqm) createBuilder2.instance;
                    awqmVar3.b |= 1;
                    awqmVar3.c = i3;
                    createBuilder2.copyOnWrite();
                    awqm awqmVar22 = (awqm) createBuilder2.instance;
                    awqmVar22.d = i2 - 1;
                    awqmVar22.b |= 2;
                    sxdVar2.b(str42, ((awqm) createBuilder2.build()).toByteArray());
                }
            });
        }
        final byte[] bArr = null;
        if (i == 1) {
            final awpw awpwVar = (awpw) obj;
            return ayph.t(new ayrm(awpwVar, bArr) { // from class: sua
                public final /* synthetic */ awpw a;

                @Override // defpackage.ayrm
                public final void a() {
                    aflv aflvVar = aflv.this;
                    awpw awpwVar2 = this.a;
                    aflvVar.a.b(awpwVar2.c, awpwVar2.d.I());
                }
            });
        }
        if (i == 2) {
            final avel avelVar = (avel) obj;
            awpu awpuVar2 = swuVar.e;
            if (awpuVar2 != null) {
                awnd awndVar2 = ((awoq) awpuVar2.pX(awoq.b)).d;
                if (awndVar2 == null) {
                    awndVar2 = awnd.a;
                }
                str2 = awndVar2.c;
            } else {
                str2 = null;
            }
            return adyu.F(this.a, avelVar.c).ap(adyu.E(this.a, avelVar.d), nxd.u).g(new ayrv(str2, avelVar, bArr) { // from class: afmz
                public final /* synthetic */ String a;
                public final /* synthetic */ avel b;

                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    return ayph.t(new ayrm((Pair) obj2, this.a, this.b, null) { // from class: afmy
                        public final /* synthetic */ Pair a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ avel c;

                        /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
                        @Override // defpackage.ayrm
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void a() {
                            /*
                                Method dump skipped, instructions count: 252
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.afmy.a():void");
                        }
                    });
                }
            });
        }
        final avem avemVar = (avem) obj;
        final int i2 = avemVar.c;
        return adyu.F(this.a, avemVar.d).ap(adyu.E(this.a, avemVar.e), agbc.b).g(new ayrv(i2, avemVar, bArr) { // from class: afnb
            public final /* synthetic */ int a;
            public final /* synthetic */ avem b;

            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                return ayph.t(new ayrm((Pair) obj2, this.a, this.b, null) { // from class: afna
                    public final /* synthetic */ Pair a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ avem c;

                    @Override // defpackage.ayrm
                    public final void a() {
                        aflv aflvVar = aflv.this;
                        Pair pair = this.a;
                        int i3 = this.b;
                        avem avemVar2 = this.c;
                        aven avenVar = (aven) pair.first;
                        aone builder = ((awrc) pair.second).toBuilder();
                        if (i3 >= avenVar.b.size()) {
                            return;
                        }
                        awrc awrcVar = (awrc) builder.instance;
                        if ((awrcVar.b & 4) == 0 || awrcVar.d != i3) {
                            builder.copyOnWrite();
                            awrc awrcVar2 = (awrc) builder.instance;
                            awrcVar2.b |= 4;
                            awrcVar2.d = i3;
                        } else {
                            ArrayList arrayList = new ArrayList(avenVar.b);
                            arrayList.remove(i3);
                            aone builder2 = avenVar.toBuilder();
                            builder2.copyOnWrite();
                            ((aven) builder2.instance).b = aonm.emptyProtobufList();
                            builder2.copyOnWrite();
                            aven avenVar2 = (aven) builder2.instance;
                            avenVar2.a();
                            aolo.addAll((Iterable) arrayList, (List) avenVar2.b);
                            aven avenVar3 = (aven) builder2.build();
                            aflvVar.a.b(avemVar2.d, avenVar3.toByteArray());
                            aony aonyVar = avenVar3.b;
                            aven avenVar4 = avemVar2.f;
                            if (avenVar4 == null) {
                                avenVar4 = aven.a;
                            }
                            boolean G = adyu.G(aonyVar, avenVar4.b);
                            ArrayList arrayList2 = new ArrayList(avenVar3.b);
                            if (!((awrc) builder.instance).c.isEmpty()) {
                                arrayList2.add(((awrc) builder.instance).c);
                            }
                            int H = adyu.H(arrayList2);
                            builder.copyOnWrite();
                            awrc awrcVar3 = (awrc) builder.instance;
                            awrcVar3.b |= 16;
                            awrcVar3.e = G;
                            builder.copyOnWrite();
                            awrc awrcVar4 = (awrc) builder.instance;
                            awrcVar4.f = H - 1;
                            awrcVar4.b |= 64;
                            builder.copyOnWrite();
                            awrc awrcVar5 = (awrc) builder.instance;
                            awrcVar5.b &= -5;
                            awrcVar5.d = 0;
                        }
                        aflvVar.a.b(avemVar2.e, ((awrc) builder.build()).toByteArray());
                    }
                });
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.b;
        if (i == 0) {
            return aqdm.b;
        }
        if (i != 1) {
            return i != 2 ? avem.b : avel.b;
        }
        return awpw.b;
    }
}
