package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldl extends ldk {
    private final TextView l;
    private final TextView m;

    public ldl(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, Handler handler, ajut ajutVar, ViewGroup viewGroup) {
        super(context, ajjzVar, aahdVar, ajuwVar, handler, ajutVar, R.layout.clarification_item_large, viewGroup);
        this.l = (TextView) this.g.findViewById(R.id.header);
        this.m = (TextView) this.g.findViewById(R.id.section_title);
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
        TextView textView2 = this.m;
        aqyg aqygVar2 = aptmVar.k;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        WrappingTextViewForClarifyBox wrappingTextViewForClarifyBox = this.h;
        aqyg aqygVar3 = aptmVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(wrappingTextViewForClarifyBox, ajcq.b(aqygVar3));
    }

    @Override // defpackage.ldk
    public final void g(int i, boolean z) {
    }
}
