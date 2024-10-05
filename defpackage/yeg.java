package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yeg implements aaha {
    private final Activity a;
    private final aben b;
    private final ycs c = new ycs();
    private final aahv d;
    private final afsy e;
    private final ajyw f;
    private final aoae g;

    public yeg(Activity activity, ajyw ajywVar, aahv aahvVar, afsy afsyVar, aben abenVar, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = activity;
        this.b = abenVar;
        this.f = ajywVar;
        this.g = aoaeVar;
        this.d = aahvVar;
        this.e = afsyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        CharSequence charSequence;
        asrh asrhVar;
        String str;
        byte[] bArr;
        byte[] bArr2;
        abll abllVar;
        byte[] c;
        long j = -1;
        String str2 = null;
        if (map != null) {
            abll abllVar2 = (abll) map.get("HANDLE_TRANSACTION_CALLBACK");
            str = (String) map.get("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA");
            bArr = (byte[]) map.get("SERIALIZED_WALLET_EVENT_LOGS");
            String str3 = (String) map.get("PAYMENTS_PAYLOAD");
            bArr2 = (byte[]) map.get("SERIALIZED_BACKEND_ANALYTICS_EVENT");
            j = ((Long) yjj.t(map, "PURCHASE_PRICE_MICROS", -1L)).longValue();
            charSequence = (CharSequence) yjj.u(map, "CLIENT_CHAT_MESSAGE_TEXT", String.class);
            asrhVar = (asrh) yjj.u(map, "LIVE_CHAT_RICH_MESSAGE_INPUT", asrh.class);
            abllVar = abllVar2;
            str2 = str3;
        } else {
            charSequence = "";
            asrhVar = null;
            str = null;
            bArr = null;
            bArr2 = null;
            abllVar = null;
        }
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint) apxfVar.pX(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint);
        aben abenVar = this.b;
        abel abelVar = new abel(abenVar.f, abenVar.c.c(), null, null, null);
        abelVar.m(aaef.b);
        if ((apxfVar.b & 1) != 0) {
            abelVar.l(apxfVar.c);
        }
        int i = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.b;
        if ((i & 1) != 0) {
            String str4 = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.c;
            str4.getClass();
            abelVar.b = str4;
        }
        if ((i & 2) != 0) {
            String str5 = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.d;
            str5.getClass();
            abelVar.c = str5;
        }
        if (str2 != null) {
            abelVar.d = str2;
        }
        if (str != null) {
            abelVar.s = str;
        }
        if (bArr != null) {
            abelVar.t = bArr;
        }
        if (bArr2 != null) {
            abelVar.u = bArr2;
        }
        if (asrhVar != null) {
            abelVar.w = asrhVar;
        }
        if (charSequence != null) {
            abelVar.x = charSequence;
        }
        if ((i & 8) != 0) {
            int ak = awxr.ak(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.f);
            abelVar.y = ak != 0 ? ak : 1;
        }
        if (ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.h.size() > 0) {
            aony aonyVar = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.h;
            aahu a = this.d.a(this.e.c());
            Iterator it = aonyVar.iterator();
            while (it.hasNext()) {
                aakt aaktVar = (aakt) a.f((String) it.next()).X();
                if (aaktVar != null && (c = aaktVar.c()) != null) {
                    abelVar.a.add(aomf.x(c));
                }
            }
        }
        if (!ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.g) {
            this.c.show(this.a.getFragmentManager(), ycs.a);
        }
        aben abenVar2 = this.b;
        abelVar.v = j;
        ajyw ajywVar = this.f;
        aoae aoaeVar = this.g;
        ycs ycsVar = this.c;
        zaw zawVar = (zaw) ajywVar.c.get();
        zawVar.getClass();
        acpl acplVar = (acpl) ajywVar.b.get();
        acplVar.getClass();
        aahd aahdVar = (aahd) ajywVar.a.get();
        aahdVar.getClass();
        ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.getClass();
        aoaeVar.getClass();
        abenVar2.j.e(abelVar, new yef(zawVar, acplVar, aahdVar, abllVar, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, aoaeVar, ycsVar, null, null));
    }
}
