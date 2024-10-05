package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Base64;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydg implements zfi {
    public final /* synthetic */ ydn a;
    public final /* synthetic */ asfy b;
    private final /* synthetic */ int c;

    public /* synthetic */ ydg(ydn ydnVar, asfy asfyVar, int i) {
        this.c = i;
        this.a = ydnVar;
        this.b = asfyVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        aomf aomfVar;
        int i = this.c;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.a.a(this.b, (aaeb) obj);
                return;
            } else {
                this.a.a(this.b, aaeb.PRODUCTION);
                return;
            }
        }
        final ydn ydnVar = this.a;
        final asfy asfyVar = this.b;
        if (!((Boolean) obj).booleanValue()) {
            if (ydnVar.i) {
                ydnVar.i = false;
                return;
            } else {
                ynm.n(ydnVar.h, ((abep) ydnVar.c.get()).c(), new ydg(ydnVar, asfyVar, 2), new ydg(ydnVar, asfyVar, i2));
                return;
            }
        }
        ydl ydlVar = ydnVar.j;
        if (ydlVar != null) {
            ydlVar.a();
        }
        final byte[] bArr = new byte[0];
        if (asfyVar.c == 7) {
            aomfVar = (aomf) asfyVar.d;
        } else {
            aomfVar = aomf.b;
        }
        String valueOf = String.valueOf(Base64.encodeToString(aomfVar.I(), 0));
        final String concat = valueOf.length() != 0 ? "FAKE_ORDER_ID_".concat(valueOf) : new String("FAKE_ORDER_ID_");
        new AlertDialog.Builder(ydnVar.h).setTitle(R.string.payment_fake_wallet_title).setMessage(R.string.payment_fake_wallet_message).setPositiveButton("Succeed", new DialogInterface.OnClickListener() { // from class: yde
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ydn ydnVar2 = ydn.this;
                String str = concat;
                byte[] bArr2 = bArr;
                asfy asfyVar2 = asfyVar;
                ydk ydkVar = ydnVar2.k;
                if (ydkVar != null) {
                    ydkVar.d();
                }
                ydnVar2.f(str, bArr2, bArr2, asfyVar2);
            }
        }).setNegativeButton("Fail", new DialogInterface.OnClickListener() { // from class: ydd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ydn.this.d(null);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ydc
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ydn.this.c();
            }
        }).create().show();
    }
}
