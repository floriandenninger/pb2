package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ixn implements DialogInterface.OnClickListener {
    public final /* synthetic */ ixu a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixn(ixu ixuVar, int i) {
        this.b = i;
        this.a = ixuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.dismiss();
            return;
        }
        ixu ixuVar = this.a;
        String obj = ixuVar.ar.getText().toString();
        if (TextUtils.equals(ixuVar.ao, obj)) {
            return;
        }
        ixuVar.aL(obj);
    }
}
