package com.google.android.libraries.youtube.offline.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.preference.Preference;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import com.google.android.youtube.R;
import defpackage.aghv;
import defpackage.agsg;
import defpackage.amru;
import defpackage.awwg;
import defpackage.brz;
import defpackage.ci;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DownloadNetworkSelectionDialogPreference extends Preference {
    public static final amru a = amru.t(awwg.UNMETERED_WIFI, awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE, awwg.ANY);
    public static final /* synthetic */ int f = 0;
    public final Context b;
    public final ci c;
    public final agsg d;
    public final String e;
    private final int g;

    public DownloadNetworkSelectionDialogPreference(Context context, ci ciVar, agsg agsgVar, int i) {
        super(context);
        this.b = context;
        this.c = ciVar;
        this.d = agsgVar;
        this.g = i;
        this.e = "https://support.google.com/youtube/answer/6308116";
        I(aghv.DOWNLOAD_NETWORK_PREFERENCE);
        Z();
        L(R.string.download_network_preference_title);
        this.o = new brz() { // from class: agyd
            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                final DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = DownloadNetworkSelectionDialogPreference.this;
                final int i2 = 0;
                final int i3 = 1;
                new AlertDialog.Builder(downloadNetworkSelectionDialogPreference.b).setTitle(R.string.download_network_preference_title).setSingleChoiceItems(R.array.download_network_preference_entries, DownloadNetworkSelectionDialogPreference.a.indexOf(downloadNetworkSelectionDialogPreference.d.w()), new DialogInterface.OnClickListener() { // from class: agyc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        if (i2 != 0) {
                            DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference2 = downloadNetworkSelectionDialogPreference;
                            if (downloadNetworkSelectionDialogPreference2.c.isDestroyed()) {
                                return;
                            }
                            downloadNetworkSelectionDialogPreference2.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(downloadNetworkSelectionDialogPreference2.e)));
                            return;
                        }
                        DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference3 = downloadNetworkSelectionDialogPreference;
                        if (i4 < 0 || i4 >= ((amvj) DownloadNetworkSelectionDialogPreference.a).c) {
                            return;
                        }
                        awwg awwgVar = (awwg) DownloadNetworkSelectionDialogPreference.a.get(i4);
                        downloadNetworkSelectionDialogPreference3.Q(awwgVar);
                        ynm.n(downloadNetworkSelectionDialogPreference3.c, downloadNetworkSelectionDialogPreference3.d.t(awwgVar), adpt.g, ynm.b);
                        downloadNetworkSelectionDialogPreference3.n(downloadNetworkSelectionDialogPreference3.b.getResources().getStringArray(R.array.download_network_preference_summaries)[i4]);
                        dialogInterface.dismiss();
                    }
                }).setNegativeButton(R.string.download_network_preference_learn_more, new DialogInterface.OnClickListener() { // from class: agyc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        if (i3 != 0) {
                            DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference2 = downloadNetworkSelectionDialogPreference;
                            if (downloadNetworkSelectionDialogPreference2.c.isDestroyed()) {
                                return;
                            }
                            downloadNetworkSelectionDialogPreference2.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(downloadNetworkSelectionDialogPreference2.e)));
                            return;
                        }
                        DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference3 = downloadNetworkSelectionDialogPreference;
                        if (i4 < 0 || i4 >= ((amvj) DownloadNetworkSelectionDialogPreference.a).c) {
                            return;
                        }
                        awwg awwgVar = (awwg) DownloadNetworkSelectionDialogPreference.a.get(i4);
                        downloadNetworkSelectionDialogPreference3.Q(awwgVar);
                        ynm.n(downloadNetworkSelectionDialogPreference3.c, downloadNetworkSelectionDialogPreference3.d.t(awwgVar), adpt.g, ynm.b);
                        downloadNetworkSelectionDialogPreference3.n(downloadNetworkSelectionDialogPreference3.b.getResources().getStringArray(R.array.download_network_preference_summaries)[i4]);
                        dialogInterface.dismiss();
                    }
                }).setPositiveButton(R.string.cancel, hgs.j).create().show();
                return true;
            }
        };
        J(i);
        n(context.getResources().getStringArray(R.array.download_network_preference_summaries)[a.indexOf(agsgVar.w())]);
    }
}
