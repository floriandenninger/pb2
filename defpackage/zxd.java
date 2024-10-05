package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zxd implements ayrs {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ zxd(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.setText(((zwv) obj).d);
        } else {
            this.a.setText(((avvk) obj).getFormattedAmount());
        }
    }
}
