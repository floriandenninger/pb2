package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwi implements aaha {
    private final Context a;
    private final aahd b;
    private final acra c;
    private final ajut d;
    private final ajjz e;
    private final ajdh f;

    public gwi(Context context, ajjz ajjzVar, aahd aahdVar, acra acraVar, ajut ajutVar, ajdh ajdhVar) {
        this.a = context;
        this.b = aahdVar;
        this.c = acraVar;
        this.d = ajutVar;
        this.e = ajjzVar;
        this.f = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqzx aqzxVar;
        aqzy aqzyVar;
        avgg avggVar;
        avgg avggVar2;
        avgg avggVar3;
        arfs arfsVar;
        avgg avggVar4;
        avgg avggVar5;
        avgg avggVar6;
        arfs arfsVar2;
        apxfVar.getClass();
        gwk gwkVar = new gwk(this.b, this.c, this.d, this.e, this.f);
        GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand = (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand) apxfVar.pX(GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.gamingAccountLinkConfirmDialogCommand);
        if (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand == null || (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.b & 1) == 0) {
            aqzxVar = null;
        } else {
            aulq aulqVar = gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqzxVar = (aqzx) aulqVar.pX(GamingAccountLinkConfirmDialogRendererOuterClass.gamingAccountLinkConfirmDialogRenderer);
        }
        if (aqzxVar == null) {
            GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand) apxfVar.pX(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand);
            if (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand == null || (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.b & 1) == 0) {
                aqzyVar = null;
            } else {
                aulq aulqVar2 = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqzyVar = (aqzy) aulqVar2.pX(GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer);
            }
            if (aqzyVar != null) {
                Context context = this.a;
                apmh apmhVar = aqzyVar.k;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                gwkVar.e = apmgVar;
                apmh apmhVar2 = aqzyVar.e;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                gwkVar.d = apmgVar2;
                gwkVar.f = map;
                aqyg aqygVar = aqzyVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                Spanned b = ajcq.b(aqygVar);
                aony aonyVar = aqzyVar.g;
                if ((aqzyVar.b & 16384) != 0) {
                    avgg avggVar7 = aqzyVar.i;
                    if (avggVar7 == null) {
                        avggVar7 = avgg.a;
                    }
                    avggVar = avggVar7;
                } else {
                    avggVar = null;
                }
                if ((aqzyVar.b & 8) != 0) {
                    avggVar2 = aqzyVar.d;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                } else {
                    avggVar2 = null;
                }
                if ((aqzyVar.b & 4) != 0) {
                    avgg avggVar8 = aqzyVar.c;
                    if (avggVar8 == null) {
                        avggVar8 = avgg.a;
                    }
                    avggVar3 = avggVar8;
                } else {
                    avggVar3 = null;
                }
                if ((aqzyVar.b & 32768) != 0) {
                    arfs arfsVar3 = aqzyVar.j;
                    if (arfsVar3 == null) {
                        arfsVar3 = arfs.a;
                    }
                    arfsVar = arfsVar3;
                } else {
                    arfsVar = null;
                }
                gwkVar.h(context, R.layout.linked_account_settings_dialog_main, b, aonyVar, avggVar, avggVar2, avggVar3, arfsVar, true);
                this.c.d(acsb.b(57203), apxfVar, null);
                return;
            }
            return;
        }
        this.c.d(acsb.b(57204), apxfVar, null);
        Context context2 = this.a;
        apmh apmhVar3 = aqzxVar.j;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        apmg apmgVar3 = apmhVar3.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        gwkVar.e = apmgVar3;
        apmh apmhVar4 = aqzxVar.i;
        if (apmhVar4 == null) {
            apmhVar4 = apmh.a;
        }
        apmg apmgVar4 = apmhVar4.c;
        if (apmgVar4 == null) {
            apmgVar4 = apmg.a;
        }
        gwkVar.d = apmgVar4;
        gwkVar.f = map;
        aqyg aqygVar2 = aqzxVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        aony aonyVar2 = aqzxVar.h;
        if ((aqzxVar.b & 2) != 0) {
            avgg avggVar9 = aqzxVar.d;
            if (avggVar9 == null) {
                avggVar9 = avgg.a;
            }
            avggVar4 = avggVar9;
        } else {
            avggVar4 = null;
        }
        if ((aqzxVar.b & 8) != 0) {
            avggVar5 = aqzxVar.f;
            if (avggVar5 == null) {
                avggVar5 = avgg.a;
            }
        } else {
            avggVar5 = null;
        }
        if ((aqzxVar.b & 4) != 0) {
            avgg avggVar10 = aqzxVar.e;
            if (avggVar10 == null) {
                avggVar10 = avgg.a;
            }
            avggVar6 = avggVar10;
        } else {
            avggVar6 = null;
        }
        if ((aqzxVar.b & 16) != 0) {
            arfs arfsVar4 = aqzxVar.g;
            if (arfsVar4 == null) {
                arfsVar4 = arfs.a;
            }
            arfsVar2 = arfsVar4;
        } else {
            arfsVar2 = null;
        }
        gwkVar.h(context2, R.layout.linked_account_confirmation_dialog, b2, aonyVar2, avggVar4, avggVar5, avggVar6, arfsVar2, false);
    }
}
