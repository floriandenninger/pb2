package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajxn extends uys {
    public ajxn(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uys
    public final Object a(int i, View view) {
        if (((uyu) getItem(i)) instanceof ajxo) {
            return new ajxm(view);
        }
        return super.a(i, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uys
    public final void b(int i, Object obj) {
        uyu uyuVar = (uyu) getItem(i);
        if (uyuVar instanceof ajxo) {
            ajxo ajxoVar = (ajxo) uyuVar;
            ajxm ajxmVar = (ajxm) obj;
            ajxmVar.a.setText(ajxoVar.c);
            if (!TextUtils.isEmpty(ajxoVar.h)) {
                TextView textView = ajxmVar.b;
                if (textView == null) {
                    ajxmVar.a.append(ajxoVar.h);
                } else {
                    textView.setText(ajxoVar.h);
                }
            }
            ColorStateList colorStateList = ajxoVar.d;
            if (colorStateList != null) {
                ajxmVar.a.setTextColor(colorStateList);
            } else {
                ajxmVar.a.setTextColor(wbs.W(getContext(), R.attr.ytTextPrimary).orElse(0));
            }
            Drawable drawable = ajxoVar.e;
            if (drawable != null) {
                ajxmVar.c.setImageDrawable(drawable);
                ajxmVar.c.setVisibility(0);
            } else {
                ajxmVar.c.setVisibility(8);
            }
            Drawable drawable2 = ajxoVar.f;
            if (drawable2 != null) {
                ajxmVar.d.setImageDrawable(drawable2);
                ajxmVar.d.setVisibility(0);
            } else {
                ajxmVar.d.setVisibility(8);
            }
            ajxmVar.a.setAccessibilityDelegate(new ajxl(ajxoVar));
            return;
        }
        super.b(i, obj);
    }
}
