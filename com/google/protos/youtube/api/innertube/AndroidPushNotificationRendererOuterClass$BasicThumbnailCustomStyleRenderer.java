package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.atmj;
import defpackage.atng;
import defpackage.aulq;
import defpackage.avgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer extends aonm implements aooz {
    public static final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a;
    public static final aonk basicThumbnailCustomStyleRenderer;
    private static volatile aopf i;
    public int b;
    public Object d;
    public avgg e;
    public int f;
    public boolean g;
    public int h;
    public int c = 0;
    private byte j = 2;

    static {
        AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer = new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
        a = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
        aonm.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer);
        basicThumbnailCustomStyleRenderer = aonm.newSingularGeneratedExtension(aulq.a, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, null, 179869979, aoqn.MESSAGE, AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class);
    }

    private AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ှ\u0000\u0004ဌ\u0006\u0005ဇ\u0005\u0006်\u0000\u0007်\u0000", new Object[]{"d", "c", "b", "e", "f", atng.a(), "h", atmj.e, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
