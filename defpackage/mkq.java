package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mkq implements View.OnClickListener, muz {
    protected final aahd a;
    protected final ajut b;
    public final View c;
    protected final ImageView d;
    protected final TextView e;
    protected apmp f;
    protected Object g;
    public ColorStateList h;
    private final ColorStateList i;
    private final ColorStateList j;
    private final ColorStateList k;
    private final ColorStateList l;
    private final ColorStateList m;

    public mkq(aahd aahdVar, ajut ajutVar, Context context, ViewGroup viewGroup, int i, mvo mvoVar) {
        this.a = aahdVar;
        this.b = ajutVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.button_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.e = textView;
        this.m = textView != null ? textView.getTextColors() : null;
        if (mvoVar != null) {
            this.i = wbs.S(context, mvoVar.a);
            this.j = wbs.S(context, mvoVar.b);
            this.k = wbs.S(context, mvoVar.a);
            this.l = wbs.S(context, mvoVar.b);
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(wbs.Q(context, R.attr.ytTextPrimary));
        this.i = valueOf;
        this.j = valueOf;
        this.k = valueOf;
        this.l = valueOf;
    }

    @Override // defpackage.muz
    public void b() {
        this.g = null;
        this.f = null;
        this.c.setOnClickListener(null);
    }

    public int c() {
        return R.color.slim_metadata_toggle_button;
    }

    public int d() {
        return R.color.slim_metadata_toggle_button_selected;
    }

    protected abstract apmp e(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkq.g():void");
    }

    public final void h(Object obj) {
        this.g = obj;
        apmp e = e(obj);
        e.getClass();
        this.f = e;
        this.c.setOnClickListener(this);
    }

    public abstract boolean i();

    @Override // defpackage.muz
    public final View oE() {
        return this.c;
    }
}
