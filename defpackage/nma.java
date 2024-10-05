package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nma implements fze {
    final /* synthetic */ nmb a;
    private final String b;
    private final byte[] c;

    public nma(nmb nmbVar, String str, byte[] bArr) {
        this.a = nmbVar;
        str.getClass();
        this.b = str;
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_flag_playlist;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.flag_playlist_menu;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
    }

    @Override // defpackage.fze
    public final boolean m() {
        final glq glqVar = this.a.e;
        final String str = this.b;
        final byte[] bArr = this.c;
        new AlertDialog.Builder(glqVar.a).setMessage(glqVar.a.getString(R.string.report_playlist_confirmation)).setPositiveButton(R.string.report_button, new DialogInterface.OnClickListener() { // from class: gll
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                glq glqVar2 = glq.this;
                String str2 = str;
                byte[] bArr2 = bArr;
                aaxc d = glqVar2.g.d();
                d.a = str2;
                d.m(bArr2);
                glqVar2.g.e(d, new glp(glqVar2, 0));
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
        return true;
    }
}
