package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jkq extends ArrayAdapter {
    final /* synthetic */ jkv a;
    final /* synthetic */ psy[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkq(jkv jkvVar, Context context, psy[] psyVarArr, psy[] psyVarArr2, byte[] bArr, byte[] bArr2) {
        super(context, R.layout.dialog_chooser_item, R.id.title, psyVarArr);
        this.a = jkvVar;
        this.b = psyVarArr2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(R.id.title);
        textView.setText(this.a.a.getString(this.b[i].a));
        textView.setTextColor(wbs.W(this.a.a, R.attr.ytTextSecondary).orElse(0));
        jm.t(textView, this.b[i].b, 0);
        textView.setCompoundDrawablePadding(yjk.K(this.a.a.getResources().getDisplayMetrics(), 16));
        return view2;
    }
}
