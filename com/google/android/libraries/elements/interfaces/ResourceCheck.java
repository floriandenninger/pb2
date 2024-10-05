package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ResourceCheck {
    final String buildLabel;
    final ArrayList resourceStatuses;

    public ResourceCheck(String str, ArrayList arrayList) {
        this.buildLabel = str;
        this.resourceStatuses = arrayList;
    }

    public String getBuildLabel() {
        return this.buildLabel;
    }

    public ArrayList getResourceStatuses() {
        return this.resourceStatuses;
    }

    public String toString() {
        String str = this.buildLabel;
        String valueOf = String.valueOf(this.resourceStatuses);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(valueOf).length());
        sb.append("ResourceCheck{buildLabel=");
        sb.append(str);
        sb.append(",resourceStatuses=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
