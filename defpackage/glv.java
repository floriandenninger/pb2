package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class glv extends ic {
    final /* synthetic */ glx b;

    public glv(glx glxVar) {
        this.b = glxVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.p(true);
        glw glwVar = (glw) view.getTag();
        if (glwVar != null) {
            ksVar.q(this.b.b.getSelectedItem() == glwVar.g);
        }
        String charSequence = ((TextView) view.findViewById(R.id.label)).getText().toString();
        String charSequence2 = ((TextView) view.findViewById(R.id.description)).getText().toString();
        String valueOf = String.valueOf(charSequence);
        String valueOf2 = String.valueOf(charSequence2);
        ksVar.v(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
