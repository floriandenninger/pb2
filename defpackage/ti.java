package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ti extends fh {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ tk d;

    public ti(tk tkVar, int i, int i2, WeakReference weakReference) {
        this.d = tkVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.fh
    public final void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        tk tkVar = this.d;
        WeakReference weakReference = this.c;
        if (tkVar.d) {
            tkVar.c = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (jw.aj(textView)) {
                    textView.post(new tj(textView, typeface, tkVar.b));
                } else {
                    textView.setTypeface(typeface, tkVar.b);
                }
            }
        }
    }

    @Override // defpackage.fh
    public final void e() {
    }
}
