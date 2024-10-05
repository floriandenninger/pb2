package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agxa {
    public final Context a;
    public final aahd b;
    public final AlertDialog c;
    public final TextView d;
    public final TextView e;
    public acra f;
    public apmg g;
    public apmg h;
    private final View i;

    public agxa(Context context, AlertDialog.Builder builder, aahd aahdVar) {
        this.a = context;
        this.b = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, (ViewGroup) null);
        this.i = inflate;
        this.d = (TextView) inflate.findViewById(R.id.dialog_title);
        this.e = (TextView) inflate.findViewById(R.id.dialog_message);
        this.c = builder.setView(inflate).create();
    }
}
