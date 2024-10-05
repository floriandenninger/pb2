package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.widget.Button;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wlt {
    public final Context a;
    public final aqdt b;
    public final aahd c;
    public AlertDialog d;
    public ContentLoadingProgressBar e;
    public YouTubeTextView f;
    public Button g;
    public Button h;
    public final acfc i;
    private final Object j;

    public wlt(Context context, aqdt aqdtVar, aahd aahdVar, acfc acfcVar, Object obj) {
        this.a = new aaq(context, R.style.VerificationDialogStyle);
        aqdtVar.getClass();
        this.b = aqdtVar;
        this.c = aahdVar;
        this.i = acfcVar;
        this.j = obj;
    }

    private final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.j);
        hashMap.put(acrc.b, Boolean.TRUE);
        return hashMap;
    }

    public final void a() {
        AlertDialog alertDialog = this.d;
        alertDialog.getClass();
        alertDialog.dismiss();
    }

    public final void b(apmg apmgVar) {
        if (apmgVar != null) {
            int i = apmgVar.b;
            if ((32768 & i) != 0) {
                aahd aahdVar = this.c;
                apxf apxfVar = apmgVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, c());
                return;
            }
            if ((i & 16384) != 0) {
                aahd aahdVar2 = this.c;
                apxf apxfVar2 = apmgVar.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, c());
                return;
            }
            if ((i & 8192) != 0) {
                aahd aahdVar3 = this.c;
                apxf apxfVar3 = apmgVar.n;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.c(apxfVar3, c());
            }
        }
    }
}
