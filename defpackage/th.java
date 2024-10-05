package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class th {
    public TextClassifier a;
    private final TextView b;

    public th(TextView textView) {
        this.b = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.b.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
