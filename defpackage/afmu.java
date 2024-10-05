package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afmu implements Runnable {
    public final /* synthetic */ afmv a;
    private final /* synthetic */ int b;

    public /* synthetic */ afmu(afmv afmvVar, int i) {
        this.b = i;
        this.a = afmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            afmv afmvVar = this.a;
            int lineCount = afmvVar.a.getLineCount();
            if (Build.VERSION.SDK_INT >= 29 && afmvVar.a.getText().length() == 0) {
                lineCount = afmx.a(afmvVar.a);
            }
            afmr afmrVar = afmvVar.a;
            afmh.av(afmrVar.b, lineCount, afmrVar.getLineHeight());
            return;
        }
        if (i == 1) {
            afmv afmvVar2 = this.a;
            if (Build.VERSION.SDK_INT >= 29) {
                afmr afmrVar2 = afmvVar2.a;
                afmh.av(afmrVar2.b, afmx.a(afmrVar2), afmvVar2.a.getLineHeight());
                return;
            }
            return;
        }
        this.a.d.c();
    }
}
