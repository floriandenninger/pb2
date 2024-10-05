package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yai implements ajmt {
    final /* synthetic */ yak a;
    final /* synthetic */ yal b;

    public yai(yal yalVar, yak yakVar) {
        this.b = yalVar;
        this.a = yakVar;
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        ajms b = this.b.a.b(uri);
        if (b != null) {
            this.a.j(((yaj) b).a);
        }
    }
}
