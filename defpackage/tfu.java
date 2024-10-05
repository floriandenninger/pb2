package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfu {
    qlm a;
    qlm b;
    private final Context c;
    private final Executor d;

    public tfu() {
    }

    public tfu(Context context, Executor executor) {
        this.c = context;
        this.d = executor;
    }

    public final anhy b(final tft tftVar, anhy anhyVar) {
        final String str = tftVar.a;
        final aooy aooyVar = tftVar.b;
        final ammy ammyVar = new ammy() { // from class: tfw
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                tft tftVar2 = tft.this;
                qli qliVar = (qli) obj;
                ancf ancfVar = tftVar2.c;
                if (ancfVar != null) {
                    aomf byteString = ancfVar.toByteString();
                    axkl axklVar = qliVar.c;
                    axklVar.copyOnWrite();
                    ((axkm) axklVar.instance).r(byteString);
                }
                if (tftVar2.g != 1) {
                    qliVar.l = 0;
                }
                int[] iArr = tftVar2.e;
                if (!qliVar.a.f()) {
                    if (qliVar.a.f()) {
                        throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                    }
                    if (iArr != null && (iArr.length) != 0) {
                        if (qliVar.g == null) {
                            qliVar.g = new ArrayList();
                        }
                        for (int i : iArr) {
                            qliVar.g.add(Integer.valueOf(i));
                        }
                    }
                }
                int[] iArr2 = tftVar2.f;
                if (iArr2 != null) {
                    for (int i2 : iArr2) {
                        if (qliVar.e == null) {
                            qliVar.e = new ArrayList();
                        }
                        qliVar.e.add(Integer.valueOf(i2));
                    }
                }
                return true;
            }
        };
        return aney.i(anfq.i(anhyVar, new anfz() { // from class: tfx
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tfu tfuVar = tfu.this;
                final aooy aooyVar2 = aooyVar;
                ammy ammyVar2 = ammyVar;
                String str2 = str;
                tff tffVar = (tff) obj;
                qlm a = tfuVar.a(tffVar);
                if (a == null) {
                    return anaf.O(null);
                }
                aooyVar2.getClass();
                qli a2 = a.a(new qlh() { // from class: tfv
                    @Override // defpackage.qlh
                    public final aomf a() {
                        return aooy.this.toByteString();
                    }
                });
                ammyVar2.a(a2);
                amkq.v(true);
                a2.j = str2;
                a2.m = null;
                int i = tffVar.b - 1;
                if (i == 0) {
                    a2.e(tffVar.a);
                } else if (i == 1) {
                    a2.e(null);
                } else if (i != 2) {
                    throw new IllegalArgumentException("Dropped logs must not be logged.");
                }
                qoi b = a2.b();
                final SettableFuture f = SettableFuture.f();
                b.g(new qon() { // from class: tco
                    @Override // defpackage.qon
                    public final void a(qom qomVar) {
                        SettableFuture settableFuture = SettableFuture.this;
                        if (qomVar.a().g != 16) {
                            if (qomVar.a().c()) {
                                settableFuture.o(qomVar);
                                return;
                            } else if (qomVar.a().i != null) {
                                settableFuture.e(new qok(qomVar.a()));
                                return;
                            } else {
                                settableFuture.e(new qnx(qomVar.a()));
                                return;
                            }
                        }
                        settableFuture.cancel(false);
                    }
                });
                return anfq.h(f, amkq.aa(), angq.a);
            }
        }, this.d), qnx.class, jom.g, angq.a);
    }

    public final synchronized qlm a(tff tffVar) {
        int i = tffVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.a == null) {
                this.a = new qlm(this.c, null, null);
            }
            return this.a;
        }
        if (i != 2) {
            return null;
        }
        if (this.b == null) {
            this.b = qlm.d(this.c, null);
        }
        return this.b;
    }
}
