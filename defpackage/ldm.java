package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldm extends ldk {
    private final TextView l;

    public ldm(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, Handler handler, ajut ajutVar, int i, ViewGroup viewGroup) {
        super(context, ajjzVar, aahdVar, ajuwVar, handler, ajutVar, i, viewGroup);
        this.l = (TextView) this.g.findViewById(R.id.header);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ldk
    public final void f(aptm aptmVar) {
        super.f(aptmVar);
        TextView textView = this.l;
        aqyg aqygVar = aptmVar.j;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
    }
}
