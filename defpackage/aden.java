package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aden implements View.OnClickListener {
    public final /* synthetic */ ader a;
    private final /* synthetic */ int b;

    public /* synthetic */ aden(ader aderVar, int i) {
        this.b = i;
        this.a = aderVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            ader aderVar = this.a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://support.google.com/youtube/answer/7640706?hl=%@"));
            aderVar.l.startActivity(intent);
            return;
        }
        ader aderVar2 = this.a;
        aderVar2.l.startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.cast.settings.CastSettingsActivity").putExtra("ACTIVITY_TYPE", "CastSettings"));
    }
}
