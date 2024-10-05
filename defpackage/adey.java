package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adey extends bof {
    protected final bpv Y;
    public final azrw Z;

    public adey(Context context, int i, azrw azrwVar) {
        super(context, i);
        bpw.b(getContext());
        this.Y = bpw.j();
        azrwVar.getClass();
        this.Z = azrwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bof, defpackage.mi, defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.button1);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: adex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    adey adeyVar = adey.this;
                    if (adeyVar.Y.m()) {
                        ((addy) adeyVar.Z.get()).K();
                    }
                    adeyVar.dismiss();
                }
            });
        }
    }
}
