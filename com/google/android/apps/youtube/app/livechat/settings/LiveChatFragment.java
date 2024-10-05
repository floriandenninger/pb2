package com.google.android.apps.youtube.app.livechat.settings;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.jbn;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LiveChatFragment extends jbn {
    public akgk c;
    public SettingsDataAccess d;
    private ayqx e;

    @Override // defpackage.bsk
    public final void aH() {
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.e = this.d.g(new Runnable() { // from class: jbo
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                aqyg aqygVar;
                LiveChatFragment liveChatFragment = LiveChatFragment.this;
                if (liveChatFragment.ar() && (o = liveChatFragment.d.o(10034)) != null) {
                    ci C = liveChatFragment.C();
                    if ((o.b & 1) != 0) {
                        aqygVar = o.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    C.setTitle(ajcq.b(aqygVar));
                    liveChatFragment.c.d(liveChatFragment, o.d);
                }
            }
        });
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        azqb.f((AtomicReference) this.e);
    }
}
