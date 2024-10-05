package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablo implements ajom {
    protected final ajut a;
    protected final aahd b;
    protected final View c;
    protected final TextView d;
    protected final TextView e;
    protected final ImageView f;
    protected final ViewGroup g;

    public ablo(Context context, aahd aahdVar, ajut ajutVar) {
        this.b = aahdVar;
        this.a = ajutVar;
        View inflate = View.inflate(context, d(), null);
        this.c = inflate;
        this.d = j();
        this.e = i();
        this.f = h();
        this.g = g();
        Resources resources = inflate.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e());
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_metadata_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(f(), -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        inflate.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    protected abstract int d();

    protected abstract int e();

    protected abstract int f();

    protected abstract ViewGroup g();

    protected abstract ImageView h();

    protected abstract TextView i();

    protected abstract TextView j();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablo.oB(ajok, java.lang.Object):void");
    }
}
