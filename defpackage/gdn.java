package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdn implements aaha {
    public final HatsController a;
    private final Context b;
    private final trp c;

    public gdn(Context context, HatsController hatsController, trp trpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = context;
        this.a = hatsController;
        this.c = trpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand) apxfVar.pX(ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.showSystemInfoDialogCommand);
        final avcn avcnVar = (avcn) yjj.u(map, "ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", avcn.class);
        if (avcnVar == null) {
            return;
        }
        this.a.h(avcnVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        if ((showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.b & 1) != 0) {
            aqygVar = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
        trp trpVar = this.c;
        title.setMessage(new SpannableStringBuilder().append(trpVar.j(R.string.hats_free_text_system_info_overview)).append(trpVar.k(R.string.hats_free_text_installed_by_section_header)).append(trpVar.j(R.string.hats_free_text_installed_by_section_contents)).append(trpVar.k(R.string.hats_free_text_system_section_header)).append(trpVar.j(R.string.hats_free_text_system_section_contents)).append(trpVar.k(R.string.hats_free_text_network_section_header)).append(trpVar.j(R.string.hats_free_text_network_section_contents))).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gdm
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                gdn gdnVar = gdn.this;
                gdnVar.a.k(avcnVar, true);
            }
        }).create().show();
    }
}
