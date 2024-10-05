package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSController {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends JSController {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, JSControllerConfig jSControllerConfig);

        private native void nativeDestroy(long j);

        private native Status native_createController(long j, String str, String str2, String str3);

        private native Status native_destroyController(long j, String str);

        private native Status native_executeControllerMethod(long j, byte[] bArr, byte[] bArr2);

        private native StatusOr native_executeFfiFunction(long j, String str, String str2, byte[] bArr);

        private native void native_executeFunction(long j, byte[] bArr, byte[] bArr2, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

        private native void native_registerController(long j, String str, JSStateUpdateHandler jSStateUpdateHandler);

        private native void native_registerFunctionBinding(long j, int i, JSFunctionBinding jSFunctionBinding);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status createController(String str, String str2, String str3) {
            return native_createController(this.nativeRef, str, str2, str3);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status destroyController(String str) {
            return native_destroyController(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status executeControllerMethod(byte[] bArr, byte[] bArr2) {
            return native_executeControllerMethod(this.nativeRef, bArr, bArr2);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public StatusOr executeFfiFunction(String str, String str2, byte[] bArr) {
            return native_executeFfiFunction(this.nativeRef, str, str2, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void executeFunction(byte[] bArr, byte[] bArr2, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler) {
            native_executeFunction(this.nativeRef, bArr, bArr2, byteStore, jSCommandResolver, jSFutureHandler);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerController(String str, JSStateUpdateHandler jSStateUpdateHandler) {
            native_registerController(this.nativeRef, str, jSStateUpdateHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding) {
            native_registerFunctionBinding(this.nativeRef, i, jSFunctionBinding);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }
    }

    public static JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, JSControllerConfig jSControllerConfig) {
        return CppProxy.create(performanceLogger, jSModuleCache, jSControllerConfig);
    }

    public abstract Status createController(String str, String str2, String str3);

    public abstract Status destroyController(String str);

    public abstract Status executeControllerMethod(byte[] bArr, byte[] bArr2);

    public abstract StatusOr executeFfiFunction(String str, String str2, byte[] bArr);

    public abstract void executeFunction(byte[] bArr, byte[] bArr2, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

    public abstract void registerController(String str, JSStateUpdateHandler jSStateUpdateHandler);

    public abstract void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);
}
