package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bge implements ate {
    private final ate a;
    private final bgd b;
    private boolean c;

    public bge(ate ateVar, bgd bgdVar) {
        this.a = ateVar;
        this.b = bgdVar;
    }

    @Override // defpackage.ate
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        pse.c(attVar);
        this.a.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        Long l;
        ath athVar2 = athVar;
        afcs afcsVar = (afcs) this.b;
        PlayerConfigModel c = afcsVar.c.c();
        if (c != null) {
            aqdn aqdnVar = c.c.d;
            if (aqdnVar == null) {
                aqdnVar = aqdn.a;
            }
            aqdo aqdoVar = aqdnVar.d;
            if (aqdoVar == null) {
                aqdoVar = aqdo.a;
            }
            if (aqdoVar.c) {
                if (!"/videoplayback".equals(athVar2.a.getPath())) {
                    athVar2 = new ath(athVar2.a, athVar2.b, athVar2.c, athVar2.d, afcs.a, athVar2.g, athVar2.h, athVar2.i, athVar2.j, athVar2.k);
                } else {
                    if (athVar2.d != null) {
                        afsi.b(2, 6, "AbrStateDataSpec: Unexpected http body.");
                    }
                    Object obj = athVar2.k;
                    byte[] bArr = null;
                    Long l2 = null;
                    if (true != (obj instanceof aehx)) {
                        obj = null;
                    }
                    aqdn aqdnVar2 = c.c.d;
                    if (aqdnVar2 == null) {
                        aqdnVar2 = aqdn.a;
                    }
                    aqdo aqdoVar2 = aqdnVar2.d;
                    if (aqdoVar2 == null) {
                        aqdoVar2 = aqdo.a;
                    }
                    if (aqdoVar2.f) {
                        if (obj == null) {
                            obj = aehx.a().a();
                        }
                        aehw aehwVar = new aehw((aehx) obj);
                        aehwVar.d(true);
                        obj = aehwVar.a();
                    }
                    Object obj2 = obj;
                    aqdn aqdnVar3 = c.c.d;
                    if (aqdnVar3 == null) {
                        aqdnVar3 = aqdn.a;
                    }
                    aqdo aqdoVar3 = aqdnVar3.d;
                    if (aqdoVar3 == null) {
                        aqdoVar3 = aqdo.a;
                    }
                    if (!aqdoVar3.e) {
                        if (obj2 != null) {
                            aehx aehxVar = (aehx) obj2;
                            l2 = aehxVar.d;
                            l = aehxVar.a;
                        } else {
                            l = null;
                        }
                        aone createBuilder = ovv.a.createBuilder(afcsVar.d.get());
                        aomf d = afcsVar.c.d();
                        if (d != null) {
                            createBuilder.copyOnWrite();
                            ovv ovvVar = (ovv) createBuilder.instance;
                            ovvVar.b |= 4;
                            ovvVar.e = d;
                        }
                        aone createBuilder2 = ovy.a.createBuilder();
                        ovg a = afcsVar.c.a(c, ((Boolean) afcsVar.b.get()).booleanValue(), l2 != null ? l2.longValue() : -9223372036854775807L, afcsVar.e);
                        createBuilder2.copyOnWrite();
                        ovy ovyVar = (ovy) createBuilder2.instance;
                        a.getClass();
                        ovyVar.c = a;
                        ovyVar.b |= 1;
                        ovv ovvVar2 = (ovv) createBuilder.build();
                        createBuilder2.copyOnWrite();
                        ovy ovyVar2 = (ovy) createBuilder2.instance;
                        ovvVar2.getClass();
                        ovyVar2.f = ovvVar2;
                        ovyVar2.b |= 8;
                        if ((c.O().b & 2) != 0) {
                            aqdo aqdoVar4 = c.O().d;
                            if (aqdoVar4 == null) {
                                aqdoVar4 = aqdo.a;
                            }
                            if ((aqdoVar4.b & 4) != 0) {
                                aqdo aqdoVar5 = c.O().d;
                                if (aqdoVar5 == null) {
                                    aqdoVar5 = aqdo.a;
                                }
                                aomf aomfVar = aqdoVar5.d;
                                createBuilder2.copyOnWrite();
                                ovy ovyVar3 = (ovy) createBuilder2.instance;
                                aomfVar.getClass();
                                ovyVar3.b |= 2;
                                ovyVar3.d = aomfVar;
                            }
                        }
                        if (c.ap() && l != null && l.longValue() != -9223372036854775807L) {
                            long longValue = l.longValue();
                            createBuilder2.copyOnWrite();
                            ovy ovyVar4 = (ovy) createBuilder2.instance;
                            ovyVar4.b |= 4;
                            ovyVar4.e = longValue;
                        }
                        bArr = ((ovy) createBuilder2.build()).toByteArray();
                    }
                    atg atgVar = new atg();
                    atgVar.a = athVar2.a;
                    atgVar.c = 2;
                    atgVar.d = bArr;
                    atgVar.b = athVar2.b;
                    atgVar.f = athVar2.g;
                    atgVar.g = athVar2.h;
                    atgVar.h = athVar2.i;
                    atgVar.i = athVar2.j;
                    atgVar.e = afcs.a;
                    atgVar.j = obj2;
                    athVar2 = atgVar.a();
                }
            }
        }
        this.c = true;
        return this.a.h(athVar2);
    }

    @Override // defpackage.ate
    public final Uri i() {
        Uri i = this.a.i();
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override // defpackage.ate
    public final void j() {
        if (this.c) {
            this.c = false;
            this.a.j();
        }
    }
}
