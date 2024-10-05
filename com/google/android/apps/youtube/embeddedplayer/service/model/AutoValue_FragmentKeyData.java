package com.google.android.apps.youtube.embeddedplayer.service.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_FragmentKeyData extends FragmentKeyData {
    private final String a;

    public AutoValue_FragmentKeyData(String str) {
        this.a = str;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FragmentKeyData) {
            return this.a.equals(((FragmentKeyData) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 29);
        sb.append("FragmentKeyData{fragmentKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
