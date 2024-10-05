package defpackage;

import android.os.Handler;
import android.widget.Toast;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acio {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    public final /* synthetic */ aciq c;

    public acio(aciq aciqVar, String str, int i) {
        this.c = aciqVar;
        this.a = str;
        this.b = i;
    }

    public final void a(int i, aqdt aqdtVar) {
        if (i == 4) {
            aciq aciqVar = this.c;
            if (aqdtVar != null) {
                aciqVar.s(aqdtVar);
                return;
            } else {
                Toast.makeText(aciqVar.qR(), R.string.lc_add_participant_failed, 1).show();
                return;
            }
        }
        Handler handler = this.c.a;
        final String str = this.a;
        final int i2 = this.b;
        handler.postDelayed(new Runnable() { // from class: acin
            @Override // java.lang.Runnable
            public final void run() {
                acio.this.c.o(str, i2 - 1);
            }
        }, 400L);
    }
}
