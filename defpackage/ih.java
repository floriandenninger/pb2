package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ih implements ii {
    private final ContentInfo a;

    public ih(ContentInfo contentInfo) {
        gn.g(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.ii
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.ii
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.ii
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.ii
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
