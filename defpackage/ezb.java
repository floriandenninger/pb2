package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezb implements aaha {
    public final aahd a;
    public final azrw b;
    public final azrw c;
    private final agaf d;
    private final Executor e;
    private final Executor f;
    private final Set g = amsx.s(auqw.MAIN_SMART_DOWNLOADS_ENABLED, auqw.MAIN_SMART_DOWNLOADS_OPT_IN_BANNER_DISMISSED);
    private final llc h;

    public ezb(aahd aahdVar, agaf agafVar, llc llcVar, azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2) {
        this.a = aahdVar;
        this.d = agafVar;
        this.h = llcVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.e = executor;
        this.f = executor2;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
            final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) apxfVar.pX(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
            final int i = 0;
            int i2 = 0;
            for (final aupi aupiVar : setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b) {
                auqx auqxVar = aupiVar.d;
                if (auqxVar == null) {
                    auqxVar = auqx.a;
                }
                auqw b = auqw.b(auqxVar.b);
                if (b == null) {
                    b = auqw.UNKNOWN;
                }
                final int i3 = 1;
                if (!TextUtils.isEmpty(this.h.a(b.bV)) || this.g.contains(b)) {
                    auqx auqxVar2 = aupiVar.d;
                    if (auqxVar2 == null) {
                        auqxVar2 = auqx.a;
                    }
                    auqw b2 = auqw.b(auqxVar2.b);
                    if (b2 == null) {
                        b2 = auqw.UNKNOWN;
                    }
                    int ordinal = b2.ordinal();
                    if (ordinal == 30) {
                        aear.B(this.d);
                        llc llcVar = this.h;
                        auqx auqxVar3 = aupiVar.d;
                        if (auqxVar3 == null) {
                            auqxVar3 = auqx.a;
                        }
                        auqw b3 = auqw.b(auqxVar3.b);
                        if (b3 == null) {
                            b3 = auqw.UNKNOWN;
                        }
                        String a = llcVar.a(b3.bV);
                        if (!TextUtils.isEmpty(a)) {
                            this.d.a(a, aupiVar.b == 3 ? ((Boolean) aupiVar.c).booleanValue() : false);
                            i2 |= i3;
                        }
                    } else if (ordinal == 129) {
                        ynm.k(anaf.T(new anfy(this) { // from class: eza
                            public final /* synthetic */ ezb a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.anfy
                            public final anhy a() {
                                if (i3 == 0) {
                                    ezb ezbVar = this.a;
                                    aupi aupiVar2 = aupiVar;
                                    return ((ywp) ((fka) ezbVar.b.get()).c.get()).b(new fju(((afsy) ezbVar.c.get()).c().b(), aupiVar2.b == 3 ? ((Boolean) aupiVar2.c).booleanValue() : false, 1));
                                }
                                ezb ezbVar2 = this.a;
                                aupi aupiVar3 = aupiVar;
                                return ((fka) ezbVar2.b.get()).e(((afsy) ezbVar2.c.get()).c().b(), aupiVar3.b == 3 ? ((Boolean) aupiVar3.c).booleanValue() : false);
                            }
                        }, this.e), this.f, egw.i, new ynl(this) { // from class: eyz
                            public final /* synthetic */ ezb a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj) {
                                if (i3 == 0) {
                                    this.a.a.b(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c);
                                    return;
                                }
                                this.a.a.b(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c);
                            }
                        });
                    } else if (ordinal == 130) {
                        ynm.k(anaf.T(new anfy(this) { // from class: eza
                            public final /* synthetic */ ezb a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.anfy
                            public final anhy a() {
                                if (i == 0) {
                                    ezb ezbVar = this.a;
                                    aupi aupiVar2 = aupiVar;
                                    return ((ywp) ((fka) ezbVar.b.get()).c.get()).b(new fju(((afsy) ezbVar.c.get()).c().b(), aupiVar2.b == 3 ? ((Boolean) aupiVar2.c).booleanValue() : false, 1));
                                }
                                ezb ezbVar2 = this.a;
                                aupi aupiVar3 = aupiVar;
                                return ((fka) ezbVar2.b.get()).e(((afsy) ezbVar2.c.get()).c().b(), aupiVar3.b == 3 ? ((Boolean) aupiVar3.c).booleanValue() : false);
                            }
                        }, this.e), this.f, egw.j, new ynl(this) { // from class: eyz
                            public final /* synthetic */ ezb a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj) {
                                if (i == 0) {
                                    this.a.a.b(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c);
                                    return;
                                }
                                this.a.a.b(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c);
                            }
                        });
                    }
                }
                i3 = 0;
                i2 |= i3;
            }
            if (i2 != 0) {
                this.a.d(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c, map);
            }
        }
    }
}
