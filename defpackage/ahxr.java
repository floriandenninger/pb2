package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxr {
    private final Context a;
    private Dialog b;

    public ahxr(Context context) {
        this.a = context;
    }

    public final void a() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.dismiss();
        }
        this.b = null;
    }

    public final void b(List list, ahxs ahxsVar) {
        c(list, ahxsVar, null);
    }

    public final void c(List list, ahxs ahxsVar, acqz acqzVar) {
        InteractionLoggingScreen c;
        String string = this.a.getString(R.string.subtitles);
        ahxsVar.getClass();
        a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.a, android.R.layout.select_dialog_item, list);
        AlertDialog create = new AlertDialog.Builder(this.a).setTitle(string).setSingleChoiceItems(arrayAdapter, 0, new ahxq(arrayAdapter, ahxsVar)).create();
        this.b = create;
        create.show();
        if (acqzVar == null || (c = acqzVar.mM().c()) == null) {
            return;
        }
        acsa acsaVar = new acsa(c, acrb.CAPTIONS_QUICK_MENU);
        acqzVar.mM().D(acsaVar);
        acqzVar.mM().u(acsaVar, null);
    }
}
