package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akae implements View.OnClickListener {
    final /* synthetic */ akaf a;
    private final /* synthetic */ int b;

    public akae(akaf akafVar, int i) {
        this.b = i;
        this.a = akafVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.C().onBackPressed();
            return;
        }
        akaf akafVar = this.a;
        if (akafVar.c) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", akafVar.C().getPackageName(), null));
            akafVar.C().startActivity(intent);
            return;
        }
        akafVar.ac(akafVar.b, 1);
    }
}
