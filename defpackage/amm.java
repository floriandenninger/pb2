package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amm extends hm {
    public final amk a;
    private final TextView b;

    public amm(TextView textView) {
        this.b = textView;
        this.a = new amk(textView);
    }

    @Override // defpackage.hm
    public final void d() {
        TransformationMethod transformationMethod = this.b.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
            return;
        }
        TextView textView = this.b;
        if (!(transformationMethod instanceof amq)) {
            transformationMethod = new amq(transformationMethod);
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
