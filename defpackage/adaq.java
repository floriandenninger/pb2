package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaq extends bv {
    adao ae;

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new AlertDialog.Builder(C()).setMessage(Html.fromHtml(P(R.string.mdx_pref_delete_tv_codes_remove_confirmation, this.m.getString("screenName"))).toString()).setPositiveButton(R.string.mdx_pref_delete_tv_codes_remove_tv, new DialogInterface.OnClickListener() { // from class: adap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                adaq adaqVar = adaq.this;
                adao adaoVar = adaqVar.ae;
                String string = adaqVar.m.getString("deviceId");
                final adat adatVar = adaoVar.a;
                final int i2 = 1;
                final int i3 = 0;
                ynm.n(adatVar.a, adatVar.c.a(new adfs(string)), new zfi() { // from class: adan
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            adat adatVar2 = adatVar;
                            adatVar2.a();
                            if (adatVar2.d.b() == 0) {
                                adyu.ca(adatVar2.a.C(), PairWithTvActivity.class, 0);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(adatVar.a.C(), R.string.mdx_pref_delete_tv_codes_remove_error, 1).show();
                    }
                }, new zfi() { // from class: adan
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            adat adatVar2 = adatVar;
                            adatVar2.a();
                            if (adatVar2.d.b() == 0) {
                                adyu.ca(adatVar2.a.C(), PairWithTvActivity.class, 0);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(adatVar.a.C(), R.string.mdx_pref_delete_tv_codes_remove_error, 1).show();
                    }
                });
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }
}
