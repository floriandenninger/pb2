package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afmn implements Runnable {
    public final /* synthetic */ afmr a;
    public final /* synthetic */ dhe b;
    private final /* synthetic */ int c;

    public /* synthetic */ afmn(afmr afmrVar, dhe dheVar, int i) {
        this.c = i;
        this.a = afmrVar;
        this.b = dheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        if (this.c == 0) {
            new Handler(Looper.getMainLooper()).post(new afmn(this.a, this.b, i));
            return;
        }
        afmr afmrVar = this.a;
        dhe dheVar = this.b;
        amsx amsxVar = afmx.a;
        int lineCount = afmrVar.getLineCount();
        if (Build.VERSION.SDK_INT >= 29 && afmrVar.getText().length() == 0) {
            lineCount = afmx.a(afmrVar);
        }
        int lineHeight = afmrVar.getLineHeight();
        int i2 = afmh.f46J;
        if (dheVar.f == null) {
            return;
        }
        dheVar.h(new dlp(0, Integer.valueOf(lineCount), Integer.valueOf(lineHeight)), "updateState:SuggestEditableText.remeasureForUpdatedText");
    }
}
