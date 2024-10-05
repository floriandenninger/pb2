package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hmn implements Runnable {
    public final /* synthetic */ hmw a;
    private final /* synthetic */ int b;

    public /* synthetic */ hmn(hmw hmwVar, int i) {
        this.b = i;
        this.a = hmwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            hmw hmwVar = this.a;
            hmg hmgVar = hmwVar.c;
            if (hmgVar.e) {
                hmgVar.g = 0L;
                hmgVar.d = false;
                hmgVar.h = 0L;
                pom pomVar = hmgVar.k;
                if (pomVar != null) {
                    pomVar.J();
                }
            }
            hmwVar.c();
            return;
        }
        hmw hmwVar2 = this.a;
        afsi.b(2, 6, "[ShortsCreation][Android][Music]No usable audio streams found in selected music. ");
        hmwVar2.f.mM().u(new acqx(acsb.c(123970)), null);
        Toast.makeText(hmwVar2.d, R.string.reel_generic_error_message, 1).show();
        hmwVar2.c();
    }
}
