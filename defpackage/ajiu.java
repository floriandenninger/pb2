package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajiu implements swv {
    private final Context a;

    public ajiu(Context context) {
        this.a = context;
    }

    private final void e(int i) {
        Toast.makeText(this.a, this.a.getString(i), 1).show();
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awro.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final awro awroVar = (awro) obj;
        return ayph.t(new ayrm() { // from class: ajit
            @Override // defpackage.ayrm
            public final void a() {
                ajiu.this.d(awroVar);
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(awro awroVar) {
        String str = awroVar.c;
        if (TextUtils.isEmpty(str)) {
            e(R.string.error_link_cannot_be_opened);
            return;
        }
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", wbs.aj(str)).setFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            e(R.string.error_browser_not_found);
        }
    }
}
