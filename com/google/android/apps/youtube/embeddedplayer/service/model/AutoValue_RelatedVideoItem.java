package com.google.android.apps.youtube.embeddedplayer.service.model;

import defpackage.aomf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_RelatedVideoItem extends RelatedVideoItem {
    private final String b;
    private final CharSequence c;
    private final CharSequence d;
    private final CharSequence e;
    private final BitmapKey f;
    private final SelectableItemKey g;
    private final aomf h;

    public AutoValue_RelatedVideoItem(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, BitmapKey bitmapKey, SelectableItemKey selectableItemKey, aomf aomfVar) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = bitmapKey;
        this.g = selectableItemKey;
        this.h = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final BitmapKey a() {
        return this.f;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final SelectableItemKey b() {
        return this.g;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final aomf c() {
        return this.h;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final CharSequence e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RelatedVideoItem) {
            RelatedVideoItem relatedVideoItem = (RelatedVideoItem) obj;
            String str = this.b;
            if (str != null ? str.equals(relatedVideoItem.h()) : relatedVideoItem.h() == null) {
                CharSequence charSequence = this.c;
                if (charSequence != null ? charSequence.equals(relatedVideoItem.g()) : relatedVideoItem.g() == null) {
                    CharSequence charSequence2 = this.d;
                    if (charSequence2 != null ? charSequence2.equals(relatedVideoItem.e()) : relatedVideoItem.e() == null) {
                        CharSequence charSequence3 = this.e;
                        if (charSequence3 != null ? charSequence3.equals(relatedVideoItem.f()) : relatedVideoItem.f() == null) {
                            BitmapKey bitmapKey = this.f;
                            if (bitmapKey != null ? bitmapKey.equals(relatedVideoItem.a()) : relatedVideoItem.a() == null) {
                                SelectableItemKey selectableItemKey = this.g;
                                if (selectableItemKey != null ? selectableItemKey.equals(relatedVideoItem.b()) : relatedVideoItem.b() == null) {
                                    aomf aomfVar = this.h;
                                    if (aomfVar != null ? aomfVar.equals(relatedVideoItem.c()) : relatedVideoItem.c() == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final CharSequence f() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final CharSequence g() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem
    public final String h() {
        return this.b;
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 99 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("RelatedVideoItem{id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(valueOf);
        sb.append(", byline=");
        sb.append(valueOf2);
        sb.append(", timestamp=");
        sb.append(valueOf3);
        sb.append(", bitmapKey=");
        sb.append(valueOf4);
        sb.append(", selectableItemKey=");
        sb.append(valueOf5);
        sb.append(", trackingParams=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence = this.c;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.d;
        int hashCode3 = (hashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        CharSequence charSequence3 = this.e;
        int hashCode4 = (hashCode3 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        BitmapKey bitmapKey = this.f;
        int hashCode5 = (hashCode4 ^ (bitmapKey == null ? 0 : bitmapKey.hashCode())) * 1000003;
        SelectableItemKey selectableItemKey = this.g;
        int hashCode6 = (hashCode5 ^ (selectableItemKey == null ? 0 : selectableItemKey.hashCode())) * 1000003;
        aomf aomfVar = this.h;
        return hashCode6 ^ (aomfVar != null ? aomfVar.hashCode() : 0);
    }
}
