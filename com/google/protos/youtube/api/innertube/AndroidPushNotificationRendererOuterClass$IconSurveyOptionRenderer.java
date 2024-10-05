package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.arfs;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer extends aonm implements aooz {
    public static final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a;
    private static volatile aopf f;
    public static final aonk iconSurveyOptionRenderer;
    public int b;
    public arfs c;
    public apxf d;
    public apxf e;
    private byte g = 2;

    static {
        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
        a = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
        aonm.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer);
        iconSurveyOptionRenderer = aonm.newSingularGeneratedExtension(aulq.a, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer, null, 202680135, aoqn.MESSAGE, AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class);
    }

    private AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class) {
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
