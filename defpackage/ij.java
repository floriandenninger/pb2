package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ij implements ii {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public ij(ig igVar) {
        ClipData clipData = igVar.a;
        gn.g(clipData);
        this.a = clipData;
        this.b = igVar.b;
        this.c = igVar.c;
        this.d = igVar.d;
        this.e = igVar.e;
    }

    @Override // defpackage.ii
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ii
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ii
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.ii
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        if (this.d == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + this.d.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
