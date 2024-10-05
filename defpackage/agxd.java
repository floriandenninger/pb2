package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agxd {
    public final Context a;
    public final AlertDialog b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final View f;
    public final View g;
    private final View h;

    public agxd(Context context, AlertDialog.Builder builder) {
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, (ViewGroup) null);
        this.h = inflate;
        this.c = (TextView) inflate.findViewById(R.id.dialog_title);
        this.d = (TextView) inflate.findViewById(R.id.dialog_message);
        this.e = (ImageView) inflate.findViewById(R.id.icon);
        this.f = inflate.findViewById(R.id.dialog_header);
        this.g = inflate.findViewById(R.id.content_separator);
        this.b = builder.setView(inflate).create();
    }

    public final void a() {
        if (this.b.isShowing()) {
            this.b.dismiss();
        }
    }
}
