package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aota;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer extends aonm implements aooz {
    public static final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    private static volatile aopf g;
    public static final aonk pendingReelUploadsBottomSheetRenderer;
    public int b;
    public aqyg c;
    public aulq d;
    public aulq e;
    private aqyg h;
    private aota i;
    private byte j = 2;
    public aomf f = aomf.b;

    static {
        PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer = new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
        a = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
        aonm.registerDefaultInstance(PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer);
        pendingReelUploadsBottomSheetRenderer = aonm.newSingularGeneratedExtension(aulq.a, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer, null, 291412923, aoqn.MESSAGE, PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class);
    }

    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
