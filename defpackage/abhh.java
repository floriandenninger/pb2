package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhh implements abqb, abij, afwx {
    public abgd a;
    public final Context b;
    private final aahd c;
    private final ajrn d;
    private final abge e;
    private final azrw f;
    private final ajdh g;

    public abhh(Context context, aahd aahdVar, ajrn ajrnVar, abge abgeVar, azrw azrwVar, ajdh ajdhVar) {
        aahdVar.getClass();
        this.c = aahdVar;
        this.d = ajrnVar;
        this.e = abgeVar;
        this.b = context;
        this.f = azrwVar;
        this.g = ajdhVar;
    }

    public static final void j(Context context, arqh arqhVar) {
        int i = arqhVar.b;
        if ((i & 4) == 0) {
            if ((i & 2) != 0) {
                return;
            }
            whu.K(context, R.string.video_is_flagged, 1);
            return;
        }
        arqf arqfVar = arqhVar.e;
        if (arqfVar == null) {
            arqfVar = arqf.a;
        }
        aqyg aqygVar = arqfVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.L(context, ajcq.b(aqygVar), 1);
    }

    @Override // defpackage.abij
    public final abgd d() {
        return this.a;
    }

    @Override // defpackage.abqb
    public final void i(atda atdaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        if (adyu.dk(atdaVar) != null) {
            this.c.c(adyu.dk(atdaVar), hashMap);
            return;
        }
        if (adyu.dl(atdaVar) != null) {
            this.c.c(adyu.dl(atdaVar), hashMap);
            return;
        }
        atde atdeVar = atdaVar.d;
        if (atdeVar == null) {
            atdeVar = atde.a;
        }
        if ((atdeVar.b & 16) != 0) {
            aahd aahdVar = this.c;
            atde atdeVar2 = atdaVar.d;
            if (atdeVar2 == null) {
                atdeVar2 = atde.a;
            }
            apxf apxfVar = atdeVar2.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        whu.K(this.b, R.string.live_chat_report_form_service_failed, 1);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        arqk arqkVar;
        asmt asmtVar;
        if (obj instanceof arzq) {
            arzr arzrVar = ((arzq) obj).c;
            if (arzrVar == null) {
                arzrVar = arzr.a;
            }
            if (arzrVar.b == 113762946) {
                this.d.c((aumb) arzrVar.c, this);
                return;
            }
            return;
        }
        if (obj instanceof arqh) {
            final arqh arqhVar = (arqh) obj;
            if (arqhVar != null) {
                if (arqhVar.g.size() > 0) {
                    this.e.a(arqhVar.g, this.a, true);
                }
                if ((arqhVar.b & 8) != 0) {
                    arqkVar = arqhVar.f;
                    if (arqkVar == null) {
                        arqkVar = arqk.a;
                    }
                } else {
                    arqkVar = null;
                }
                if (arqkVar != null && arqkVar.b == 171313147) {
                    ajrc ajrcVar = (ajrc) this.f.get();
                    if (arqkVar.b == 171313147) {
                        asmtVar = (asmt) arqkVar.c;
                    } else {
                        asmtVar = asmt.a;
                    }
                    ajrcVar.a(asmtVar, amlr.a, this);
                    return;
                }
                if (arqkVar != null && arqkVar.b == 85374086) {
                    ajdj.g(this.b, (aqvu) arqkVar.c, this.c, this.g, this);
                    return;
                }
                if ((arqhVar.b & 2) == 0) {
                    j(this.b, arqhVar);
                    return;
                }
                AlertDialog.Builder cancelable = new AlertDialog.Builder(this.b).setCancelable(true);
                aqyg aqygVar = arqhVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                View findViewById = cancelable.setMessage(ajcq.b(aqygVar)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: abhg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        abhh abhhVar = abhh.this;
                        abhh.j(abhhVar.b, arqhVar);
                    }
                }).show().findViewById(android.R.id.message);
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            return;
        }
        zga.l("Unhandled ServiceListener response received!");
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.abij
    public final afwx qM() {
        return null;
    }

    @Override // defpackage.abij
    public final asrh qN() {
        return null;
    }

    @Override // defpackage.abij
    public final String qO() {
        return null;
    }

    @Override // defpackage.abij
    public final String qP() {
        return null;
    }
}
