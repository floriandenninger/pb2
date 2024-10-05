package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ReelEditModel_DeletedItem extends ReelEditModel.DeletedItem {
    private final int a;
    private final ReelItemEditModel b;

    public AutoValue_ReelEditModel_DeletedItem(int i, ReelItemEditModel reelItemEditModel) {
        this.a = i;
        if (reelItemEditModel == null) {
            throw new NullPointerException("Null reelItemEditModel");
        }
        this.b = reelItemEditModel;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel.DeletedItem
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel.DeletedItem
    public final ReelItemEditModel b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReelEditModel.DeletedItem) {
            ReelEditModel.DeletedItem deletedItem = (ReelEditModel.DeletedItem) obj;
            if (this.a == deletedItem.a() && this.b.equals(deletedItem.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("DeletedItem{index=");
        sb.append(i);
        sb.append(", reelItemEditModel=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
