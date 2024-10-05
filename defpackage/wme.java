package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wme implements View.OnClickListener {
    final /* synthetic */ wmg a;
    private final /* synthetic */ int b;

    public wme(wmg wmgVar, int i) {
        this.b = i;
        this.a = wmgVar;
    }

    public /* synthetic */ wme(wmg wmgVar, int i, byte[] bArr) {
        this.b = i;
        this.a = wmgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wmg wmgVar = this.a;
            wmgVar.ag = wmgVar.e;
            wmgVar.ag = PhoneNumberUtils.formatNumberToE164(PhoneNumberUtils.normalizeNumber(wmgVar.ag), wmgVar.ae);
            if (TextUtils.isEmpty(wmgVar.ag)) {
                wmgVar.s(wmgVar.O(R.string.error_invalid_phone_number));
                return;
            }
            if (wmgVar.af != arzs.CODE_DELIVERY_METHOD_TEXT || PhoneNumberUtils.isWellFormedSmsAddress(wmgVar.ag)) {
                wmgVar.p();
                wmg wmgVar2 = this.a;
                wmf wmfVar = wmgVar2.ah;
                if (wmfVar != null) {
                    wmfVar.aM(wmgVar2.af, wmgVar2.ae, wmgVar2.ag);
                }
                this.a.b.b();
                wmg wmgVar3 = this.a;
                wkt wktVar = new wkt(wmgVar3, wmgVar3.ai);
                wmg wmgVar4 = this.a;
                arzs arzsVar = wmgVar4.af;
                String str = wmgVar4.ae;
                String str2 = wmgVar4.ag;
                atus atusVar = wmgVar4.d.g;
                if (atusVar == null) {
                    atusVar = atus.a;
                }
                apmg apmgVar = atusVar.b;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                apxf apxfVar = apmgVar.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                wktVar.c(arzsVar, str, str2, apxfVar);
                this.a.a.setEnabled(false);
                return;
            }
            wmgVar.s(wmgVar.O(R.string.error_sms_to_non_mobile));
            return;
        }
        wmg wmgVar5 = this.a;
        wmf wmfVar2 = wmgVar5.ah;
        if (wmfVar2 != null) {
            wmfVar2.a();
        }
        wmgVar5.q();
    }
}
