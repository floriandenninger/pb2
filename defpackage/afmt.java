package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afmt implements Runnable {
    public final /* synthetic */ Editable a;
    public final /* synthetic */ ajtg b;
    private final /* synthetic */ int c;

    public /* synthetic */ afmt(Editable editable, ajtg ajtgVar, int i) {
        this.c = i;
        this.a = editable;
        this.b = ajtgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            Editable editable = this.a;
            ajtg ajtgVar = this.b;
            int spanStart = editable.getSpanStart(ajtgVar);
            int spanEnd = editable.getSpanEnd(ajtgVar);
            if (spanStart == -1 || spanEnd == -1 || spanStart >= spanEnd) {
                return;
            }
            editable.removeSpan(ajtgVar);
            editable.delete(spanStart, spanEnd);
            return;
        }
        Editable editable2 = this.a;
        ajtg ajtgVar2 = this.b;
        int spanStart2 = editable2.getSpanStart(ajtgVar2);
        int spanEnd2 = editable2.getSpanEnd(ajtgVar2);
        if (spanStart2 == -1 || spanEnd2 == -1 || spanStart2 >= spanEnd2) {
            return;
        }
        editable2.removeSpan(ajtgVar2);
        editable2.delete(spanStart2, spanEnd2);
    }
}
