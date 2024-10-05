package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.quantum.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gcs implements gbj {
    private final Snackbar a;

    public gcs(Snackbar snackbar) {
        this.a = snackbar;
        snackbar.setOnClickListener(null);
        snackbar.setClickable(false);
        snackbar.setOnTouchListener(new gpm(1));
    }

    @Override // defpackage.gbj
    public final /* synthetic */ View a(gbi gbiVar, final gat gatVar) {
        final gcq gcqVar = (gcq) gbiVar;
        CharSequence charSequence = gcqVar.b;
        if (TextUtils.isEmpty(charSequence)) {
            this.a.d(gcqVar.a);
        } else {
            this.a.e(gcqVar.a, charSequence.toString(), new View.OnClickListener() { // from class: gcr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gat gatVar2 = gat.this;
                    gcq gcqVar2 = gcqVar;
                    gatVar2.a(1);
                    View.OnClickListener onClickListener = gcqVar2.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
        return this.a;
    }
}
