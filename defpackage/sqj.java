package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqj extends dgy {
    sql a;
    private final String[] e = {"collapsedCommandFuture", "commandResolver", "conversionContext", "drawableRequester", "expandableTextType", "expandedCommandFuture", "logger", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(sqj sqjVar, dhe dheVar, sql sqlVar) {
        super.w(dheVar, sqlVar);
        sqjVar.a = sqlVar;
        sqjVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (sql) dhaVar;
    }
}
