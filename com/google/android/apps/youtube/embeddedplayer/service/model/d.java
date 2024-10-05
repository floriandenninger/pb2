package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    public static final d a;
    public final CharSequence b;
    public final CharSequence c;
    public final Bitmap d;

    static {
        c cVar = new c();
        cVar.a = "";
        cVar.b = "";
        cVar.c = null;
        a = cVar.a();
    }

    public d() {
    }

    public d(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = bitmap;
    }

    public final c a() {
        return new c(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            CharSequence charSequence = this.b;
            if (charSequence != null ? charSequence.equals(dVar.b) : dVar.b == null) {
                CharSequence charSequence2 = this.c;
                if (charSequence2 != null ? charSequence2.equals(dVar.c) : dVar.c == null) {
                    Bitmap bitmap = this.d;
                    Bitmap bitmap2 = dVar.d;
                    if (bitmap != null ? bitmap.equals(bitmap2) : bitmap2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EmbedVideoMetadata{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", thumbnail=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.c;
        int hashCode2 = (hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        Bitmap bitmap = this.d;
        return hashCode2 ^ (bitmap != null ? bitmap.hashCode() : 0);
    }
}
