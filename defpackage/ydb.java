package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydb {
    public final aahd a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final SeekBar f;
    public final ajyf g;
    public final ajyf h;
    public final Dialog i;
    public avqh j;
    public int k = 0;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;

    public ydb(Context context, ajyg ajygVar, aahd aahdVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_pause_membership_dialog, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.subtitle);
        this.e = (TextView) inflate.findViewById(R.id.description);
        this.l = (TextView) inflate.findViewById(R.id.pause_period);
        this.m = (TextView) inflate.findViewById(R.id.pause_end);
        this.f = (SeekBar) inflate.findViewById(R.id.pause_period_slider);
        TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
        this.n = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.cancel);
        this.o = textView2;
        this.g = ajygVar.a(textView);
        this.h = ajygVar.a(textView2);
        Dialog dialog = new Dialog(context);
        this.i = dialog;
        dialog.setContentView(inflate);
    }

    public static Spanned a(Spanned[] spannedArr, int i) {
        if (spannedArr.length > i) {
            return spannedArr[i];
        }
        return null;
    }

    public final void b() {
        avqh avqhVar = this.j;
        if (avqhVar == null) {
            return;
        }
        TextView textView = this.l;
        aqyg aqygVar = ((avqg) avqhVar.d.get(this.k)).b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.m;
        avqh avqhVar2 = this.j;
        aqyg aqygVar2 = ((avqg) avqhVar2.d.get(this.k)).c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        SeekBar seekBar = this.f;
        avqh avqhVar3 = this.j;
        aots aotsVar = ((avqg) avqhVar3.d.get(this.k)).d;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        seekBar.setContentDescription(aotsVar.c);
    }
}
