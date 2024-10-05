package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import defpackage.amkq;
import defpackage.amru;
import defpackage.hvf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ReelEditModel extends ReelEditModel {
    public final amru a;
    public final int b;
    public final ReelEditModel.DeletedItem c;

    public AutoValue_ReelEditModel(amru amruVar, int i, ReelEditModel.DeletedItem deletedItem) {
        this.a = amruVar;
        this.b = i;
        this.c = deletedItem;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel
    public final hvf b() {
        return new hvf(this);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel
    public final ReelEditModel.DeletedItem c() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel
    public final amru d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ReelEditModel.DeletedItem deletedItem;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReelEditModel) {
            ReelEditModel reelEditModel = (ReelEditModel) obj;
            if (amkq.aV(this.a, reelEditModel.d()) && this.b == reelEditModel.a() && ((deletedItem = this.c) != null ? deletedItem.equals(reelEditModel.c()) : reelEditModel.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        ReelEditModel.DeletedItem deletedItem = this.c;
        return hashCode ^ (deletedItem == null ? 0 : deletedItem.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("ReelEditModel{reelItems=");
        sb.append(valueOf);
        sb.append(", currentIndex=");
        sb.append(i);
        sb.append(", lastDeletedItem=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
