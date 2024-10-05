package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acen implements zfi {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ acen(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        final int i = 1;
        if (this.b == 0) {
            LiveCreationActivity liveCreationActivity = this.a;
            Boolean bool = (Boolean) obj;
            zxo zxoVar = new zxo(liveCreationActivity, Arrays.asList(LiveCreationActivity.c));
            zxoVar.c = new acep(liveCreationActivity, 4);
            zxoVar.d = new acen(liveCreationActivity, i);
            liveCreationActivity.L = zxoVar;
            if (TextUtils.isEmpty(liveCreationActivity.K)) {
                zxo zxoVar2 = liveCreationActivity.L;
                List asList = Arrays.asList(LiveCreationActivity.c);
                List list = liveCreationActivity.Q;
                boolean equals = Boolean.TRUE.equals(bool);
                if (zxo.d(liveCreationActivity, asList)) {
                    list = amru.q();
                } else if (equals) {
                    list = amru.q();
                }
                zxoVar2.f(list);
            }
            liveCreationActivity.L.c();
            liveCreationActivity.P = true;
            liveCreationActivity.as();
            return;
        }
        final LiveCreationActivity liveCreationActivity2 = this.a;
        if (Boolean.TRUE.equals((Boolean) obj)) {
            final acra acraVar = liveCreationActivity2.m;
            if (acraVar != null) {
                acraVar.n(new acqx(acsb.c(29220)));
                acraVar.n(new acqx(acsb.c(29221)));
            }
            final int i2 = 0;
            new AlertDialog.Builder(liveCreationActivity2).setTitle(R.string.lc_permission_allow_access_description).setMessage(R.string.lc_permission_open_settings_description).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: acem
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    LiveCreationActivity.this.onBackPressed();
                }
            }).setPositiveButton(liveCreationActivity2.getString(R.string.lc_permission_open_settings_dialog_confirm), new DialogInterface.OnClickListener() { // from class: aceu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    if (i != 0) {
                        LiveCreationActivity liveCreationActivity3 = liveCreationActivity2;
                        acra acraVar2 = acraVar;
                        if (acraVar2 != null) {
                            acraVar2.I(3, new acqx(acsb.c(29220)), null);
                        }
                        liveCreationActivity3.P = false;
                        akai.c(liveCreationActivity3);
                        return;
                    }
                    LiveCreationActivity liveCreationActivity4 = liveCreationActivity2;
                    acra acraVar3 = acraVar;
                    if (acraVar3 != null) {
                        acraVar3.I(3, new acqx(acsb.c(29221)), null);
                        liveCreationActivity4.P = false;
                        liveCreationActivity4.onBackPressed();
                    }
                }
            }).setNegativeButton(liveCreationActivity2.getString(R.string.lc_permission_open_settings_dialog_dismiss), new DialogInterface.OnClickListener() { // from class: aceu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    if (i2 != 0) {
                        LiveCreationActivity liveCreationActivity3 = liveCreationActivity2;
                        acra acraVar2 = acraVar;
                        if (acraVar2 != null) {
                            acraVar2.I(3, new acqx(acsb.c(29220)), null);
                        }
                        liveCreationActivity3.P = false;
                        akai.c(liveCreationActivity3);
                        return;
                    }
                    LiveCreationActivity liveCreationActivity4 = liveCreationActivity2;
                    acra acraVar3 = acraVar;
                    if (acraVar3 != null) {
                        acraVar3.I(3, new acqx(acsb.c(29221)), null);
                        liveCreationActivity4.P = false;
                        liveCreationActivity4.onBackPressed();
                    }
                }
            }).show();
            return;
        }
        liveCreationActivity2.as();
        liveCreationActivity2.onBackPressed();
    }
}
