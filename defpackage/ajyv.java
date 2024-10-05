package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajyv implements ajom {
    public final Handler a;
    public final ViewGroup b;
    public final Runnable c = new ajys(this);
    public ajyu d;
    public EditText e;
    private final Context f;
    private final acra g;
    private final LinearLayout h;
    private final ImageView i;
    private final ImageView j;
    private final ajsa k;
    private ajnc l;

    public ajyv(Context context, acra acraVar, Handler handler, ajsa ajsaVar, ViewGroup viewGroup) {
        this.f = context;
        this.g = acraVar;
        this.a = handler;
        this.b = viewGroup;
        this.k = ajsaVar;
        this.h = (LinearLayout) viewGroup.findViewById(R.id.emoji_category_container);
        this.i = (ImageView) viewGroup.findViewById(R.id.keyboard_button);
        this.j = (ImageView) viewGroup.findViewById(R.id.backspace_button);
    }

    private final void e(aqst aqstVar, ajok ajokVar) {
        ajnc ajncVar = this.l;
        this.h.addView(ajncVar.f(ajncVar.d(ajokVar), aqstVar, this.h), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajnc ajncVar = this.l;
        if (ajncVar != null) {
            ajncVar.e(this.b);
        }
        this.h.removeAllViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x004b, code lost:
    
        if (r0.c != 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oB(defpackage.ajok r8, defpackage.aqsv r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyv.oB(ajok, aqsv):void");
    }
}
