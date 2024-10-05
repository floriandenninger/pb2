package com.google.android.libraries.youtube.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.afkp;
import defpackage.ahge;
import defpackage.aivi;
import defpackage.aivj;
import defpackage.yjj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerView extends aivi {
    public afkp d;
    public ahge e;

    public PlayerView(Context context) {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((aivj) yjj.p(context.getApplicationContext(), aivj.class)).jb(this);
        afkp afkpVar = new afkp(context, this.e);
        this.d = afkpVar;
        h(afkpVar);
    }
}
