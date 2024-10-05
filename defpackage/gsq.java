package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gsq implements aaha {
    public final aahd a;
    public final gcl b;
    private final Activity c;

    public gsq(Activity activity, aahd aahdVar, gcl gclVar) {
        this.c = activity;
        this.a = aahdVar;
        this.b = gclVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String string;
        final aukp aukpVar = (aukp) apxfVar.pX(aukp.b);
        String str = aukpVar.e;
        if (!ammx.e(str)) {
            string = this.c.getString(R.string.reel_upload_snackbar_text, new Object[]{str});
        } else {
            string = this.c.getString(R.string.reel_upload_default_snackbar_text);
        }
        final gcm d = gcq.d();
        d.k(string);
        if ((aukpVar.c & 1) != 0) {
            d.m(this.c.getText(R.string.reel_upload_snackbar_action_button_text), new View.OnClickListener() { // from class: gso
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gsq gsqVar = gsq.this;
                    aukp aukpVar2 = aukpVar;
                    aahd aahdVar = gsqVar.a;
                    apxf apxfVar2 = aukpVar2.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.c(apxfVar2, null);
                }
            });
        }
        this.c.runOnUiThread(new Runnable() { // from class: gsp
            @Override // java.lang.Runnable
            public final void run() {
                gsq.this.b.j(d.b());
            }
        });
    }
}
