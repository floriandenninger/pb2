package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aulq;
import defpackage.avtx;
import defpackage.avty;
import defpackage.avtz;
import defpackage.avua;
import defpackage.avub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer extends aonm implements aooz {
    public static final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer a;
    private static volatile aopf f;
    public static final aonk uploadProgressArrowRenderer;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = new UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer();
        a = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
        aonm.registerDefaultInstance(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
        uploadProgressArrowRenderer = aonm.newSingularGeneratedExtension(aulq.a, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, null, 325110794, aoqn.MESSAGE, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class);
    }

    private UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0002\u0000\u0002\b\u0007\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0001\u0005ြ\u0001\u0006ြ\u0000\u0007ြ\u0001\bြ\u0001", new Object[]{"c", "b", "e", "d", avty.class, avtx.class, avty.class, avtz.class, avub.class, avub.class, avua.class});
            case NEW_MUTABLE_INSTANCE:
                return new UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
