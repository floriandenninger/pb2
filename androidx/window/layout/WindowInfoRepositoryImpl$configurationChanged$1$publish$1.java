package androidx.window.layout;

import defpackage.azsf;
import defpackage.aztj;
import defpackage.azum;
import defpackage.azym;

/* compiled from: PG */
/* loaded from: classes.dex */
final class WindowInfoRepositoryImpl$configurationChanged$1$publish$1 extends azum implements aztj {
    final /* synthetic */ azym $channel;
    final /* synthetic */ aztj $producer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$configurationChanged$1$publish$1(azym azymVar, aztj aztjVar) {
        super(0);
        this.$channel = azymVar;
        this.$producer = aztjVar;
    }

    @Override // defpackage.aztj
    public /* bridge */ /* synthetic */ Object invoke() {
        m20invoke();
        return azsf.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m20invoke() {
        this.$channel.g(this.$producer.invoke());
    }
}
