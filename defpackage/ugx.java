package defpackage;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugx {
    private final amru a;
    private ammv b = amlr.a;

    public ugx(amru amruVar) {
        amkq.E(((amvj) amruVar).c > 0);
        this.a = amruVar;
    }

    public final void a(TextView textView, int i) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = i - (((((view.getPaddingLeft() + view.getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + textView.getPaddingLeft()) + textView.getPaddingRight());
        if (this.b.h() && paddingLeft == ((Float) this.b.c()).floatValue()) {
            return;
        }
        this.b = ammv.j(Float.valueOf(paddingLeft));
        if (paddingLeft <= 0.0f) {
            str = (String) amkq.bj(this.a);
        } else {
            TextPaint paint = textView.getPaint();
            int i2 = 0;
            while (true) {
                amru amruVar = this.a;
                if (i2 >= ((amvj) amruVar).c - 1) {
                    str = (String) amkq.bj(amruVar);
                    break;
                } else {
                    if (paint.measureText((String) amruVar.get(i2)) <= paddingLeft) {
                        str = (String) this.a.get(i2);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (str.contentEquals(textView.getText())) {
            return;
        }
        textView.setText(str);
    }
}
