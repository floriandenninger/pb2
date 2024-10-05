package org.tensorflow.lite;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NativeInterpreterWrapper implements AutoCloseable {
    public long a;
    public long b;
    public TensorImpl[] c;
    public TensorImpl[] d;
    public boolean e;
    private long f;
    private ByteBuffer g;
    public long inferenceDurationNanoseconds = -1;
    private final List h = new ArrayList();
    private final List i = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r3 = (defpackage.banz) r4.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [banz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NativeInterpreterWrapper(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.inferenceDurationNanoseconds = r0
            r0 = 0
            r9.e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.i = r1
            org.tensorflow.lite.TensorFlowLite.a()
            if (r10 == 0) goto Ld3
            boolean r1 = r10 instanceof java.nio.MappedByteBuffer
            if (r1 != 0) goto L31
            boolean r1 = r10.isDirect()
            if (r1 == 0) goto Ld3
            java.nio.ByteOrder r1 = r10.order()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            if (r1 != r2) goto Ld3
        L31:
            r9.g = r10
            r10 = 512(0x200, float:7.17E-43)
            long r1 = createErrorReporter(r10)
            java.nio.ByteBuffer r10 = r9.g
            long r3 = createModelWithBuffer(r10, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.a = r1
            r9.f = r3
            r5 = -1
            long r3 = createInterpreter(r3, r1, r5)
            r9.b = r3
            boolean r3 = hasUnresolvedFlexOp(r3)
            if (r3 == 0) goto L93
            r3 = 0
            java.lang.String r4 = "org.tensorflow.lite.flex.FlexDelegate"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L83
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Exception -> L83
        L60:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L83
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L83
            banz r6 = (defpackage.banz) r6     // Catch: java.lang.Exception -> L83
            boolean r6 = r4.isInstance(r6)     // Catch: java.lang.Exception -> L83
            if (r6 == 0) goto L60
            goto L84
        L73:
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L83
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch: java.lang.Exception -> L83
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L83
            java.lang.Object r0 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L83
            banz r0 = (defpackage.banz) r0     // Catch: java.lang.Exception -> L83
            r3 = r0
            goto L84
        L83:
        L84:
            if (r3 == 0) goto L93
            java.util.List r0 = r9.i
            r4 = r3
            java.lang.AutoCloseable r4 = (java.lang.AutoCloseable) r4
            r0.add(r4)
            java.util.List r0 = r9.h
            r0.add(r3)
        L93:
            java.util.List r0 = r9.h
            r0.addAll(r10)
            java.util.List r10 = r9.h
            java.util.Iterator r10 = r10.iterator()
        L9e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r10.next()
            banz r0 = (defpackage.banz) r0
            long r3 = r9.b
            long r5 = r9.a
            long r7 = r0.a()
            applyDelegate(r3, r5, r7)
            goto L9e
        Lb6:
            long r3 = r9.b
            int r10 = getInputCount(r3)
            org.tensorflow.lite.TensorImpl[] r10 = new org.tensorflow.lite.TensorImpl[r10]
            r9.c = r10
            long r3 = r9.b
            int r10 = getOutputCount(r3)
            org.tensorflow.lite.TensorImpl[] r10 = new org.tensorflow.lite.TensorImpl[r10]
            r9.d = r10
            long r3 = r9.b
            allocateTensors(r3, r1)
            r10 = 1
            r9.e = r10
            return
        Ld3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content."
            r10.<init>(r0)
            goto Ldc
        Ldb:
            throw r10
        Ldc:
            goto Ldb
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.<init>(java.nio.ByteBuffer):void");
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native XnnpackDelegate createXNNPACKDelegate(long j, long j2, int i, int i2);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    public static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native void resetVariableTensors(long j, long j2);

    public static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    public static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    public final TensorImpl a(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.c;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.b;
                TensorImpl f = TensorImpl.f(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = f;
                return f;
            }
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Invalid input Tensor index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final TensorImpl b(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.d;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.b;
                TensorImpl f = TensorImpl.f(j, getOutputTensorIndex(j, i));
                tensorImplArr[i] = f;
                return f;
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Invalid output Tensor index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean c() {
        int i = 0;
        if (this.e) {
            return false;
        }
        this.e = true;
        allocateTensors(this.b, this.a);
        while (true) {
            TensorImpl[] tensorImplArr = this.d;
            if (i >= tensorImplArr.length) {
                return true;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.i();
            }
            i++;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.c;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.g();
                this.c[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.d;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.g();
                this.d[i2] = null;
            }
            i2++;
        }
        delete(this.a, this.f, this.b);
        deleteCancellationFlag(0L);
        this.a = 0L;
        this.f = 0L;
        this.b = 0L;
        this.g = null;
        this.e = false;
        this.h.clear();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            try {
                ((AutoCloseable) it.next()).close();
            } catch (Exception e) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Failed to close flex delegate: ");
                sb.append(valueOf);
                printStream.println(sb.toString());
            }
        }
        this.i.clear();
    }
}
