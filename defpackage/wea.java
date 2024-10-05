package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wea implements DialogInterface.OnClickListener {
    final /* synthetic */ web a;

    public wea(web webVar) {
        this.a = webVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.C().getPackageName(), null));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        this.a.ao(intent);
    }
}
