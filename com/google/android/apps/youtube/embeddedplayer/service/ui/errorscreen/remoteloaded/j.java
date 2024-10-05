package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.os.Handler;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.aa;
import defpackage.aahd;
import defpackage.aahh;
import defpackage.aahi;
import defpackage.ajck;
import defpackage.ajcq;
import defpackage.alta;
import defpackage.amkq;
import defpackage.aong;
import defpackage.apmg;
import defpackage.apmh;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aqyi;
import defpackage.aryh;
import defpackage.aryi;
import defpackage.atyq;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j implements c {
    public final b a;
    public final aahd b;
    private final Optional c;
    private atyq d;

    public j(b bVar, Optional optional, aahd aahdVar) {
        this.a = bVar;
        this.c = optional;
        this.b = aahdVar;
    }

    private final Spanned c(aqyg aqygVar) {
        Optional empty;
        if (this.b != null) {
            final aahh a = aahi.a(true);
            empty = Optional.of(new ajck() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.g
                @Override // defpackage.ajck
                public final ClickableSpan a(apxf apxfVar) {
                    return a.a(j.this.b, null, apxfVar);
                }
            });
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            return ajcq.c(aqygVar, (ajck) empty.get());
        }
        return ajcq.s(null, aqygVar, 0, null, null);
    }

    private final void d(Runnable runnable) {
        if (this.c.isPresent()) {
            ((Handler) this.c.get()).post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c
    public final void a() {
        d(new h(this.a, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c
    public final void b(aryi aryiVar, boolean z, Optional optional) {
        atyq atyqVar;
        atyq atyqVar2;
        b bVar = this.a;
        bVar.b = "";
        bVar.c = false;
        bVar.a = null;
        bVar.e = null;
        aryh aryhVar = aryiVar.g;
        if (aryhVar == null) {
            aryhVar = aryh.a;
        }
        if (aryhVar.b == 58356580) {
            atyqVar = (atyq) aryhVar.c;
        } else {
            atyqVar = atyq.a;
        }
        if ((atyqVar.b & 8) != 0) {
            alta.B("Watch-on-YouTube button is filled. Setting canRetry to false", new Object[0]);
            this.a.c = false;
        } else {
            this.a.c = z;
        }
        optional.ifPresent(new Consumer() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.i
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                aa aaVar = (aa) obj;
                b bVar2 = j.this.a;
                aaVar.getClass();
                bVar2.e = new f(aaVar);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        aryh aryhVar2 = aryiVar.g;
        if (aryhVar2 == null) {
            aryhVar2 = aryh.a;
        }
        if (aryhVar2.b == 58356580) {
            aryh aryhVar3 = aryiVar.g;
            if (aryhVar3 == null) {
                aryhVar3 = aryh.a;
            }
            if (aryhVar3.b == 58356580) {
                atyqVar2 = (atyq) aryhVar3.c;
            } else {
                atyqVar2 = atyq.a;
            }
            this.d = atyqVar2;
            if (atyqVar2 != null) {
                b bVar2 = this.a;
                aqyg aqygVar = atyqVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                bVar2.b = c(aqygVar);
                atyq atyqVar3 = this.d;
                if (atyqVar3 != null) {
                    apmh apmhVar = atyqVar3.e;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    if ((apmhVar.b & 1) != 0) {
                        apmh apmhVar2 = this.d.e;
                        if (apmhVar2 == null) {
                            apmhVar2 = apmh.a;
                        }
                        apmg apmgVar = apmhVar2.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        if ((apmgVar.b & 32768) != 0) {
                            aqyg aqygVar2 = apmgVar.i;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                            if ((aqygVar2.b & 1) != 0) {
                                b bVar3 = this.a;
                                aqyg aqygVar3 = apmgVar.i;
                                if (aqygVar3 == null) {
                                    aqygVar3 = aqyg.a;
                                }
                                amkq.E(1 == (aqygVar3.b & 1));
                                aqyg aqygVar4 = apmgVar.i;
                                if (aqygVar4 == null) {
                                    aqygVar4 = aqyg.a;
                                }
                                String str = aqygVar4.d;
                                apxf apxfVar = apmgVar.p;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aong aongVar = (aong) aqyi.a.createBuilder();
                                aongVar.copyOnWrite();
                                aqyi aqyiVar = (aqyi) aongVar.instance;
                                str.getClass();
                                aqyiVar.b = 1 | aqyiVar.b;
                                aqyiVar.c = str;
                                aongVar.copyOnWrite();
                                aqyi aqyiVar2 = (aqyi) aongVar.instance;
                                apxfVar.getClass();
                                aqyiVar2.m = apxfVar;
                                aqyiVar2.b |= 512;
                                aqyi aqyiVar3 = (aqyi) aongVar.build();
                                aong aongVar2 = (aong) aqyg.a.createBuilder();
                                aongVar2.ck(aqyiVar3);
                                bVar3.a = c((aqyg) aongVar2.build());
                            }
                        }
                        alta.C("Error UI not filled with link to YouTube app", new Object[0]);
                    }
                }
            }
        } else {
            this.a.b = aryiVar.d;
        }
        d(new h(this.a, 0));
    }
}
