package com.google.android.apps.youtube.app.fragments.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.apps.tiktok.account.AccountId;
import defpackage.ameq;
import defpackage.amkq;
import defpackage.axql;
import defpackage.ce;
import defpackage.zga;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PanelFragmentDescriptor implements PanelDescriptor {
    public static PanelFragmentDescriptor e(Class cls) {
        return new AutoValue_PanelFragmentDescriptor(cls, null);
    }

    public abstract AccountId a();

    public abstract Class b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final Optional c() {
        try {
            ce ceVar = (ce) b().getConstructor(new Class[0]).newInstance(new Object[0]);
            if (a() != null) {
                AccountId a = a();
                a.getClass();
                amkq.J(ceVar instanceof axql, "Fragment %s is not a TikTok Fragment", ceVar);
                amkq.J(((axql) ceVar).lL() instanceof ameq, "Fragment %s is not a TikTok account Fragment", ceVar);
                ameq.a(ceVar, a);
            }
            return Optional.of(ceVar);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zga.d("Failed to create Fragment: ", e);
            return Optional.empty();
        }
    }

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final String d() {
        return b().getName();
    }
}
