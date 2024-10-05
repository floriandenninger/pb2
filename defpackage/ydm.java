package defpackage;

import android.content.Intent;
import com.google.android.youtube.R;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydm implements ykj {
    final /* synthetic */ ydn a;
    private final asfy b;
    private final aomf c;

    public ydm(ydn ydnVar, asfy asfyVar) {
        this.a = ydnVar;
        this.b = asfyVar;
        this.c = asfyVar.n;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        byte[] bArr;
        byte[] bArr2;
        apxf apxfVar;
        if (i != 906) {
            return;
        }
        String str = ydn.a;
        boolean z = this.b != null;
        StringBuilder sb = new StringBuilder(129);
        sb.append("Received payment result callback with resultCode: ");
        sb.append(i2);
        sb.append("Start handling payment call back, ypcGetCartResponse not null: ");
        sb.append(z);
        zga.c(str, sb.toString());
        if (this.c != null) {
            acpl acplVar = this.a.f;
            ydr ydrVar = new ydr();
            ydrVar.a = this.c;
            acplVar.c(ydrVar.c());
        } else {
            this.a.f.c(new ydr().c());
        }
        String str2 = null;
        HashMap hashMap = null;
        if (i2 == -1) {
            ydk ydkVar = this.a.k;
            if (ydkVar != null) {
                ydkVar.d();
            }
            if (this.c != null) {
                acpl acplVar2 = this.a.f;
                ydr ydrVar2 = new ydr();
                ydrVar2.a = this.c;
                acplVar2.c(ydrVar2.d());
            } else {
                this.a.f.c(new ydr().d());
            }
            if (this.b.e != 12) {
                if (intent != null) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
                    String i3 = anbp.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN"));
                    bArr2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO");
                    str2 = i3;
                    bArr = byteArrayExtra;
                } else {
                    bArr = null;
                    bArr2 = null;
                }
                this.a.f(str2, bArr2, bArr, this.b);
                return;
            }
            aahd aahdVar = (aahd) this.a.g.get();
            asfy asfyVar = this.b;
            if (asfyVar.e == 12) {
                apxfVar = (apxf) asfyVar.f;
            } else {
                apxfVar = apxf.a;
            }
            if (intent != null) {
                hashMap = new HashMap();
                hashMap.put("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA", anbp.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN")));
                hashMap.put("PAYMENTS_PAYLOAD", anbp.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")));
                hashMap.put("SERIALIZED_WALLET_EVENT_LOGS", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO"));
                hashMap.put("SERIALIZED_BACKEND_ANALYTICS_EVENT", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN"));
            }
            aahdVar.c(apxfVar, hashMap);
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                this.a.d(new Error(this.a.h.getResources().getString(R.string.payment_wallet_processing_error)));
            } else {
                this.a.d(null);
            }
            if (this.c != null) {
                acpl acplVar3 = this.a.f;
                ydr ydrVar3 = new ydr();
                ydrVar3.a = this.c;
                ydrVar3.c = 5;
                acplVar3.c(ydrVar3.b());
            }
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("WalletAPI error result with resultCode: ");
            sb2.append(i2);
            String sb3 = sb2.toString();
            String str3 = ydn.a;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 17 + String.valueOf(sb3).length());
            sb4.append("youtubePayment::");
            sb4.append(str3);
            sb4.append(" ");
            sb4.append(sb3);
            afsi.b(1, 11, sb4.toString());
            return;
        }
        if ((this.b.b & 262144) == 0) {
            this.a.c();
        } else {
            aahd aahdVar2 = (aahd) this.a.g.get();
            apxf apxfVar2 = this.b.r;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.a(apxfVar2);
        }
        byte[] byteArrayExtra2 = intent != null ? intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN") : null;
        if (byteArrayExtra2 != null) {
            ydn ydnVar = this.a;
            asfy asfyVar2 = this.b;
            aaxn aaxnVar = ydnVar.n;
            abed abedVar = new abed(aaxnVar.f, aaxnVar.a.c(), null, null, null);
            abedVar.b = asfyVar2.h;
            abedVar.a = byteArrayExtra2;
            abedVar.c = true;
            abedVar.m(asfyVar2.l.I());
            ydnVar.n.b.e(abedVar, new ydj());
        }
        if (this.c != null) {
            acpl acplVar4 = this.a.f;
            ydr ydrVar4 = new ydr();
            ydrVar4.a = this.c;
            acplVar4.c(ydrVar4.a());
        }
    }
}
