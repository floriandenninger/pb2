package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqa implements afwx {
    final /* synthetic */ EditVideoActivity a;

    public iqa(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error while making the metadata editor request.", cnqVar);
        this.a.finish();
        whu.K(this.a, R.string.error_generic, 1);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aruy aruyVar = (aruy) obj;
        EditVideoActivity editVideoActivity = this.a;
        if (editVideoActivity.t) {
            return;
        }
        if (aruyVar == null) {
            editVideoActivity.finish();
            whu.K(this.a, R.string.error_generic, 1);
        } else {
            editVideoActivity.s = aruyVar;
            editVideoActivity.runOnUiThread(new Runnable() { // from class: ipz
                @Override // java.lang.Runnable
                public final void run() {
                    iqa.this.a.t();
                }
            });
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
