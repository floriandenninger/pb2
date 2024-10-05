package androidx.window.java.layout;

import defpackage.aype;
import defpackage.azsf;
import defpackage.azsq;
import defpackage.azsx;
import defpackage.aztc;
import defpackage.aztf;
import defpackage.azty;
import defpackage.azwo;
import defpackage.azyy;
import defpackage.azyz;
import defpackage.hw;

/* compiled from: PG */
@aztc(b = "androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1", c = "WindowInfoRepositoryCallbackAdapter.kt", d = "invokeSuspend", e = {112})
/* loaded from: classes.dex */
final class WindowInfoRepositoryCallbackAdapter$addListener$1$1 extends aztf implements azty {
    final /* synthetic */ hw $consumer;
    final /* synthetic */ azyy $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryCallbackAdapter$addListener$1$1(azyy azyyVar, hw hwVar, azsq azsqVar) {
        super(2, azsqVar);
        this.$flow = azyyVar;
        this.$consumer = hwVar;
    }

    @Override // defpackage.azsy
    public final azsq create(Object obj, azsq azsqVar) {
        return new WindowInfoRepositoryCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, azsqVar);
    }

    @Override // defpackage.azty
    public final Object invoke(azwo azwoVar, azsq azsqVar) {
        return ((WindowInfoRepositoryCallbackAdapter$addListener$1$1) create(azwoVar, azsqVar)).invokeSuspend(azsf.a);
    }

    @Override // defpackage.azsy
    public final Object invokeSuspend(Object obj) {
        azsx azsxVar = azsx.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            aype.m(obj);
            azyy azyyVar = this.$flow;
            final hw hwVar = this.$consumer;
            azyz azyzVar = new azyz() { // from class: androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // defpackage.azyz
                public Object emit(Object obj2, azsq azsqVar) {
                    hw.this.accept(obj2);
                    return azsf.a;
                }
            };
            this.label = 1;
            if (azyyVar.a(azyzVar, this) == azsxVar) {
                return azsxVar;
            }
        } else if (i == 1) {
            aype.m(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return azsf.a;
    }
}
