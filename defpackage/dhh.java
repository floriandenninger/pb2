package defpackage;

import com.facebook.litho.TextContent;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhh implements TextContent {
    final /* synthetic */ List a;

    public dhh(List list) {
        this.a = list;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        return this.a;
    }
}
