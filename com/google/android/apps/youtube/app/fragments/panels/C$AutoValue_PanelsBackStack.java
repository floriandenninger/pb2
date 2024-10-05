package com.google.android.apps.youtube.app.fragments.panels;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.fragments.panels.$AutoValue_PanelsBackStack, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_PanelsBackStack extends PanelsBackStack {
    public final ArrayList a;

    public C$AutoValue_PanelsBackStack(ArrayList arrayList) {
        if (arrayList == null) {
            throw new NullPointerException("Null panelsConfigurationStack");
        }
        this.a = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack
    public final ArrayList a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PanelsBackStack) {
            return this.a.equals(((PanelsBackStack) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("PanelsBackStack{panelsConfigurationStack=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
