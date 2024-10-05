package com.google.android.libraries.youtube.player.features.gl.vr;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;
import com.google.android.youtube.R;
import defpackage.ahoj;
import defpackage.ywr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrWelcomeActivity extends ahoj {
    public ywr b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vr_welcome_activity);
        ((TextView) findViewById(R.id.link)).setMovementMethod(LinkMovementMethod.getInstance());
        findViewById(R.id.continue_button).setOnClickListener(new View.OnClickListener() { // from class: ahpa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final VrWelcomeActivity vrWelcomeActivity = VrWelcomeActivity.this;
                ynm.n(vrWelcomeActivity, vrWelcomeActivity.b.b(ahbz.k), adpt.h, new zfi() { // from class: ahpb
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        VrWelcomeActivity.this.finish();
                    }
                });
            }
        });
    }
}
