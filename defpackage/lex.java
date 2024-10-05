package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lex implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ avwg a;
    final /* synthetic */ lfa b;

    public lex(lfa lfaVar, avwg avwgVar) {
        this.b = lfaVar;
        this.a = avwgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        aqyg aqygVar;
        avwg avwgVar = this.a;
        if ((avwgVar.b & 8) != 0) {
            aqygVar = avwgVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if (!TextUtils.isEmpty(b)) {
            int lineCount = this.b.j.getLineCount();
            lfa lfaVar = this.b;
            lfaVar.d.a(b, R.id.author).setLines(lfaVar.c - lineCount);
        }
        this.b.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
