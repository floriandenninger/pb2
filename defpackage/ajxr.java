package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajxr extends uys {
    private final ajnf a;
    private ajng b;

    public ajxr(Context context, ajng ajngVar) {
        super(context);
        ajxp ajxpVar = new ajxp(this);
        this.a = ajxpVar;
        this.b = ajnl.a;
        ajngVar.getClass();
        this.b.pf(ajxpVar);
        this.b = ajngVar;
        ajngVar.lX(ajxpVar);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uys
    public final Object a(int i, View view) {
        uyu item = getItem(i);
        if (item instanceof ajxt) {
            if (i == 0) {
                view.setLayoutDirection(getContext().getResources().getConfiguration().getLayoutDirection());
            }
            return new ajxq(view);
        }
        if (item instanceof ajxs) {
            return null;
        }
        return super.a(i, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uys
    public final void b(int i, Object obj) {
        ColorStateList S;
        uyu item = getItem(i);
        if (item instanceof ajxt) {
            ajxt ajxtVar = (ajxt) item;
            ajxq ajxqVar = (ajxq) obj;
            ajxqVar.a.setText(ajxtVar.c);
            TextView textView = ajxqVar.a;
            boolean z = ajxtVar.b;
            int i2 = R.attr.ytTextDisabled;
            int i3 = R.attr.ytTextPrimary;
            if (z) {
                S = ajxtVar.d;
                if (S == null) {
                    S = wbs.S(textView.getContext(), R.attr.ytTextPrimary);
                }
            } else {
                S = wbs.S(textView.getContext(), R.attr.ytTextDisabled);
            }
            textView.setTextColor(S);
            Drawable drawable = ajxtVar.e;
            if (drawable != null) {
                ajxqVar.b.setImageDrawable(drawable);
                ajxqVar.b.setVisibility(0);
                ImageView imageView = ajxqVar.b;
                imageView.setImageTintList(wbs.S(imageView.getContext(), true != ajxtVar.b ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
            } else {
                ajxqVar.b.setVisibility(8);
            }
            String str = ajxtVar.h;
            if (str != null) {
                ajxqVar.c.setText(str);
                ajxqVar.c.setVisibility(0);
                ajxqVar.d.setText("•");
                ajxqVar.d.setVisibility(0);
                Context context = ajxqVar.c.getContext();
                if (true == ajxtVar.b) {
                    i2 = R.attr.ytTextSecondary;
                }
                ColorStateList S2 = wbs.S(context, i2);
                ajxqVar.c.setTextColor(S2);
                ajxqVar.d.setTextColor(S2);
            } else {
                ajxqVar.c.setVisibility(8);
                ajxqVar.d.setVisibility(8);
            }
            Drawable drawable2 = ajxtVar.f;
            if (drawable2 != null) {
                ajxqVar.e.setImageDrawable(drawable2);
                ajxqVar.e.setVisibility(0);
                ImageView imageView2 = ajxqVar.e;
                Context context2 = imageView2.getContext();
                if (true != ajxtVar.b) {
                    i3 = R.attr.ytIconDisabled;
                }
                imageView2.setImageTintList(wbs.S(context2, i3));
            } else {
                ajxqVar.e.setVisibility(8);
            }
            ajxqVar.f.setBackgroundColor(ajxtVar.i);
            return;
        }
        if (item instanceof ajxs) {
            return;
        }
        super.b(i, obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final uyu getItem(int i) {
        return (uyu) this.b.c(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.a();
    }

    @Override // defpackage.uys, android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        uyu item = getItem(i);
        if (item instanceof ajxs) {
            view = ((ajxs) item).a();
        }
        return super.getView(i, view, viewGroup);
    }
}
