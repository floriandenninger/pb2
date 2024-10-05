package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lew extends ic {
    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        TextView textView = (TextView) view.findViewById(R.id.title);
        ksVar.D(textView.getText());
        jw.V(textView, 2);
    }
}
