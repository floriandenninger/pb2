package com.google.android.apps.youtube.app.settings.datasaving;

import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;
import defpackage.aahu;
import defpackage.aahv;
import defpackage.aalc;
import defpackage.aalt;
import defpackage.afsy;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.awhw;
import defpackage.awhy;
import defpackage.awhz;
import defpackage.ayqi;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.aysj;
import defpackage.azqb;
import defpackage.khe;
import defpackage.khf;
import defpackage.ynl;
import defpackage.ynm;
import defpackage.ywr;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataSavingEntityController implements any {
    static final String a = aalt.f(awhz.b.a(), "app_settings_entity_identifier");
    public static final /* synthetic */ int c = 0;
    public final ywr b;
    private final aahv d;
    private final afsy e;
    private final ayqi f;
    private ayqx g;
    private ayqx h;

    public DataSavingEntityController(aahv aahvVar, afsy afsyVar, ywr ywrVar, ayqi ayqiVar) {
        this.d = aahvVar;
        this.e = afsyVar;
        this.b = ywrVar;
        this.f = ayqiVar;
    }

    public final void g(boolean z) {
        aahu a2 = this.d.a(this.e.c());
        String str = a;
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = awhz.a.createBuilder();
        createBuilder.copyOnWrite();
        awhz awhzVar = (awhz) createBuilder.instance;
        awhzVar.c |= 1;
        awhzVar.d = str;
        awhw awhwVar = new awhw(createBuilder);
        Boolean valueOf = Boolean.valueOf(z);
        aone aoneVar = awhwVar.a;
        boolean booleanValue = valueOf.booleanValue();
        aoneVar.copyOnWrite();
        awhz awhzVar2 = (awhz) aoneVar.instance;
        awhzVar2.c |= 2;
        awhzVar2.e = booleanValue;
        awhy b = awhwVar.b();
        aalc c2 = a2.c();
        c2.d(b);
        c2.c().Q();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj = this.h;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        Object obj2 = this.g;
        if (obj2 != null) {
            azqb.f((AtomicReference) obj2);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        ynm.i(this.b.a(), new ynl() { // from class: lnz
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                DataSavingEntityController.this.g(((lox) obj).l);
            }
        });
        final int i = 0;
        final int i2 = 1;
        this.h = this.d.a(this.e.c()).h(a, false).L(khf.j).Y(khe.p).L(new aysj(awhy.class)).k(awhy.class).ax(new ayrs(this) { // from class: lob
            public final /* synthetic */ DataSavingEntityController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.g(((Boolean) obj).booleanValue());
                } else {
                    final awhy awhyVar = (awhy) obj;
                    this.a.b.b(new amml() { // from class: loa
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            awhy awhyVar2 = awhy.this;
                            int i3 = DataSavingEntityController.c;
                            aone builder = ((lox) obj2).toBuilder();
                            boolean booleanValue = awhyVar2.getSelectQualityEveryVideoEnabled().booleanValue();
                            builder.copyOnWrite();
                            lox loxVar = (lox) builder.instance;
                            loxVar.b |= 512;
                            loxVar.l = booleanValue;
                            return (lox) builder.build();
                        }
                    });
                }
            }
        });
        this.g = this.b.d().A(khe.o).n().E(this.f).X(new ayrs(this) { // from class: lob
            public final /* synthetic */ DataSavingEntityController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.g(((Boolean) obj).booleanValue());
                } else {
                    final awhy awhyVar = (awhy) obj;
                    this.a.b.b(new amml() { // from class: loa
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            awhy awhyVar2 = awhy.this;
                            int i3 = DataSavingEntityController.c;
                            aone builder = ((lox) obj2).toBuilder();
                            boolean booleanValue = awhyVar2.getSelectQualityEveryVideoEnabled().booleanValue();
                            builder.copyOnWrite();
                            lox loxVar = (lox) builder.instance;
                            loxVar.b |= 512;
                            loxVar.l = booleanValue;
                            return (lox) builder.build();
                        }
                    });
                }
            }
        });
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
