package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tj implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ Typeface b;
    final /* synthetic */ int c;

    public tj(TextView textView, Typeface typeface, int i) {
        this.a = textView;
        this.b = typeface;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setTypeface(this.b, this.c);
    }
}
