package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmo implements afwx {
    public final azrw a;
    public final nmn b;
    public final String c;
    public final aahv d;
    public ajpd e;
    private final zaw f;
    private final ajox g;
    private final Activity h;

    public nmo(azrw azrwVar, zaw zawVar, ajoy ajoyVar, final ajyg ajygVar, ypa ypaVar, aahv aahvVar, final ogx ogxVar, final Activity activity, final nmn nmnVar, String str, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.f = zawVar;
        this.h = activity;
        this.b = nmnVar;
        this.c = str;
        this.d = aahvVar;
        final nmm nmmVar = new nmm(this, ypaVar);
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(atdh.class, new ajoq() { // from class: nmi
            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                Activity activity2 = activity;
                ajyg ajygVar2 = ajygVar;
                final nmn nmnVar2 = nmnVar;
                return new mqk(activity2, ajygVar2, new ajyc() { // from class: nmk
                    @Override // defpackage.ajyc
                    public final void oC(aong aongVar) {
                        nmn.this.aL(false);
                    }
                });
            }
        });
        final byte[] bArr3 = null;
        ajnqVar.f(auap.class, new ajoq(nmmVar, bArr3, bArr3) { // from class: nmj
            public final /* synthetic */ nmm a;

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                ogx ogxVar2 = ogx.this;
                nmm nmmVar2 = this.a;
                Activity activity2 = (Activity) ogxVar2.c.get();
                activity2.getClass();
                aahd aahdVar = (aahd) ogxVar2.b.get();
                aahdVar.getClass();
                ypa ypaVar2 = (ypa) ogxVar2.d.get();
                ypaVar2.getClass();
                ajut ajutVar = (ajut) ogxVar2.a.get();
                ajutVar.getClass();
                viewGroup.getClass();
                return new niv(activity2, aahdVar, ypaVar2, ajutVar, nmmVar2, viewGroup);
            }
        });
        ajnqVar.f(ajny.class, new ajoq() { // from class: nmh
            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                return new ajnz(activity);
            }
        });
        this.g = ajoyVar.a(ajnqVar);
    }

    public final void d(String str, final int i) {
        Collection.EL.stream(this.e).filter(nty.b).map(mjq.m).filter(new opz(str, 1)).findFirst().ifPresent(new Consumer() { // from class: nml
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                nmo nmoVar = nmo.this;
                int i2 = i;
                auap auapVar = (auap) obj;
                aong aongVar = (aong) auapVar.toBuilder();
                aongVar.copyOnWrite();
                auap auapVar2 = (auap) aongVar.instance;
                auapVar2.e = i2 - 1;
                auapVar2.b |= 16;
                nmoVar.e.o(auapVar, (auap) aongVar.build());
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error adding video to playlist", cnqVar);
        this.b.aL(true);
        whu.L(this.h, this.f.b(cnqVar), 0);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aozw aozwVar;
        for (arzl arzlVar : ((arzk) obj).c) {
            if (arzlVar.b == 88978004) {
                this.e = new ajpd();
                if (arzlVar.b == 88978004) {
                    aozwVar = (aozw) arzlVar.c;
                } else {
                    aozwVar = aozw.a;
                }
                ajpd ajpdVar = this.e;
                for (aozu aozuVar : aozwVar.c) {
                    if ((aozuVar.b & 4) != 0) {
                        atdh atdhVar = aozuVar.c;
                        if (atdhVar == null) {
                            atdhVar = atdh.a;
                        }
                        ajpdVar.add(atdhVar);
                    }
                }
                ajpdVar.add(new ajny());
                for (aozv aozvVar : aozwVar.b) {
                    if (aozvVar.b == 74079946) {
                        ajpdVar.add((auap) aozvVar.c);
                    }
                }
                this.g.h(this.e);
                iwn iwnVar = (iwn) this.b;
                iwnVar.am = this.g;
                if (iwnVar.an) {
                    iwnVar.aK();
                    return;
                }
                return;
            }
        }
        this.b.aL(true);
        whu.K(this.h, R.string.get_add_to_playlist_failed, 0);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
