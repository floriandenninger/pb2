package com.google.android.apps.youtube.app.fragments.panels;

import com.google.apps.tiktok.account.AccountId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.fragments.panels.$AutoValue_PanelFragmentDescriptor, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_PanelFragmentDescriptor extends PanelFragmentDescriptor {
    public final Class a;
    public final AccountId b;

    public C$AutoValue_PanelFragmentDescriptor(Class cls, AccountId accountId) {
        if (cls == null) {
            throw new NullPointerException("Null fragmentClass");
        }
        this.a = cls;
        this.b = accountId;
    }

    @Override // com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor
    public final AccountId a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor
    public final Class b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        AccountId accountId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PanelFragmentDescriptor) {
            PanelFragmentDescriptor panelFragmentDescriptor = (PanelFragmentDescriptor) obj;
            if (this.a.equals(panelFragmentDescriptor.b()) && ((accountId = this.b) != null ? accountId.equals(panelFragmentDescriptor.a()) : panelFragmentDescriptor.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        AccountId accountId = this.b;
        return hashCode ^ (accountId == null ? 0 : accountId.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
        sb.append("PanelFragmentDescriptor{fragmentClass=");
        sb.append(valueOf);
        sb.append(", accountId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
