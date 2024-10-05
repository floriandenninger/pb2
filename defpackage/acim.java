package defpackage;

import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acim implements abxt {
    final /* synthetic */ aciq a;

    public acim(aciq aciqVar) {
        this.a = aciqVar;
    }

    @Override // defpackage.abxt
    public final void a(arqo arqoVar) {
        if ((arqoVar.b & 4) != 0) {
            attp b = attp.b(arqoVar.f);
            if (b == null) {
                b = attp.PARTICIPANT_JOIN_STATE_UNKNOWN;
            }
            if (b == attp.PARTICIPANT_JOIN_STATE_UNKNOWN) {
                b = attp.PARTICIPANT_JOIN_STATE_PREJOIN;
            }
            aciq aciqVar = this.a;
            if (!TextUtils.isEmpty(aciqVar.ap)) {
                aone createBuilder = atto.a.createBuilder();
                String str = aciqVar.ap;
                createBuilder.copyOnWrite();
                atto attoVar = (atto) createBuilder.instance;
                str.getClass();
                attoVar.b |= 1;
                attoVar.c = str;
                createBuilder.copyOnWrite();
                atto attoVar2 = (atto) createBuilder.instance;
                attoVar2.d = b.f;
                attoVar2.b |= 2;
                attn b2 = new attl(((atto) createBuilder.build()).toBuilder()).b();
                aalc c = aciqVar.ao.c();
                c.d(b2);
                c.b().Q();
            }
            if (b == attp.PARTICIPANT_JOIN_STATE_WAITING) {
                aciq aciqVar2 = this.a;
                aciqVar2.a.postDelayed(aciqVar2.ak, 1000L);
            }
            if (b == attp.PARTICIPANT_JOIN_STATE_APPROVED) {
                this.a.aG(23);
                aciq aciqVar3 = this.a;
                aulq aulqVar = arqoVar.g;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(atgk.a)) {
                    aulq aulqVar2 = arqoVar.h;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    if (aulqVar2.pY(assw.a)) {
                        aulq aulqVar3 = arqoVar.h;
                        if (aulqVar3 == null) {
                            aulqVar3 = aulq.a;
                        }
                        assv assvVar = (assv) aulqVar3.pX(assw.a);
                        String str2 = assvVar.b;
                        String str3 = assvVar.c;
                        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                            Toast.makeText(aciqVar3.qR(), R.string.lc_add_participant_failed, 1).show();
                        }
                        aulq aulqVar4 = arqoVar.g;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        aciqVar3.e.ai((atgf) aulqVar4.pX(atgk.a), str2, str3);
                    }
                }
            }
            if (b == attp.PARTICIPANT_JOIN_STATE_REFUSED) {
                this.a.aG(24);
            }
        }
    }

    @Override // defpackage.abxt
    public final void b(int i, aqdt aqdtVar) {
        if (i == 4) {
            aciq aciqVar = this.a;
            if (aqdtVar != null) {
                aciqVar.s(aqdtVar);
                return;
            } else {
                Toast.makeText(aciqVar.qR(), R.string.lc_add_participant_failed, 1).show();
                return;
            }
        }
        aciq aciqVar2 = this.a;
        aciqVar2.a.postDelayed(aciqVar2.ak, 1000L);
    }
}
