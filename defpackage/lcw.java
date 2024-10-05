package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcw extends wv {
    public final ImageView t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public akef y;
    final /* synthetic */ lcx z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcw(lcx lcxVar, View view) {
        super(view);
        this.z = lcxVar;
        this.x = view;
        this.t = (ImageView) view.findViewById(R.id.search_type_icon);
        this.u = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.edit_suggestion);
        this.v = imageView;
        this.w = (ImageView) view.findViewById(R.id.thumbnail);
        final int i = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: lcu
            public final /* synthetic */ lcw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                akef akefVar;
                akef akefVar2;
                if (i != 0) {
                    lcw lcwVar = this.a;
                    lbu lbuVar = lcwVar.z.k;
                    if (lbuVar == null || (akefVar2 = lcwVar.y) == null) {
                        return;
                    }
                    int b = lcwVar.b();
                    lbz lbzVar = lbuVar.a;
                    lbzVar.ai.b(lbzVar.aH);
                    if (evr.R(lbuVar.a.ag)) {
                        lbuVar.a.mM().I(3, new acqx(acsb.c(12453)), null);
                    }
                    lbuVar.a.aJ(akefVar2.b, b);
                    return;
                }
                lcw lcwVar2 = this.a;
                lbu lbuVar2 = lcwVar2.z.k;
                if (lbuVar2 == null || (akefVar = lcwVar2.y) == null) {
                    return;
                }
                lcwVar2.b();
                lbuVar2.a.ai.e();
                lbuVar2.a.aG();
                lbuVar2.a.aD.setText(akefVar.b);
                whu.D(lbuVar2.a.aD);
                lbuVar2.a.bh();
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: lcv
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                final akef akefVar;
                lcw lcwVar = lcw.this;
                final lbu lbuVar = lcwVar.z.k;
                if (lbuVar == null || (akefVar = lcwVar.y) == null) {
                    return false;
                }
                lcwVar.b();
                if (!akefVar.b()) {
                    return false;
                }
                new AlertDialog.Builder(lbuVar.a.ap).setTitle(akefVar.a).setMessage(R.string.delete_search_suggestion_confirmation).setPositiveButton(R.string.remove, new DialogInterface.OnClickListener() { // from class: lbt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        lbu lbuVar2 = lbu.this;
                        lbuVar2.a.s(akefVar);
                    }
                }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                return true;
            }
        });
        final int i2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lcu
            public final /* synthetic */ lcw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                akef akefVar;
                akef akefVar2;
                if (i2 != 0) {
                    lcw lcwVar = this.a;
                    lbu lbuVar = lcwVar.z.k;
                    if (lbuVar == null || (akefVar2 = lcwVar.y) == null) {
                        return;
                    }
                    int b = lcwVar.b();
                    lbz lbzVar = lbuVar.a;
                    lbzVar.ai.b(lbzVar.aH);
                    if (evr.R(lbuVar.a.ag)) {
                        lbuVar.a.mM().I(3, new acqx(acsb.c(12453)), null);
                    }
                    lbuVar.a.aJ(akefVar2.b, b);
                    return;
                }
                lcw lcwVar2 = this.a;
                lbu lbuVar2 = lcwVar2.z.k;
                if (lbuVar2 == null || (akefVar = lcwVar2.y) == null) {
                    return;
                }
                lcwVar2.b();
                lbuVar2.a.ai.e();
                lbuVar2.a.aG();
                lbuVar2.a.aD.setText(akefVar.b);
                whu.D(lbuVar2.a.aD);
                lbuVar2.a.bh();
            }
        });
    }
}
