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
import defpackage.aqds;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoSelectedActionOuterClass$VideoSelectedAction extends aonm implements aooz {
    public static final VideoSelectedActionOuterClass$VideoSelectedAction a;
    private static volatile aopf f;
    public static final aonk videoSelectedAction;
    public boolean c;
    public aqds d;
    public aulq e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = new VideoSelectedActionOuterClass$VideoSelectedAction();
        a = videoSelectedActionOuterClass$VideoSelectedAction;
        aonm.registerDefaultInstance(VideoSelectedActionOuterClass$VideoSelectedAction.class, videoSelectedActionOuterClass$VideoSelectedAction);
        videoSelectedAction = aonm.newSingularGeneratedExtension(apxf.a, videoSelectedActionOuterClass$VideoSelectedAction, videoSelectedActionOuterClass$VideoSelectedAction, null, 154342739, aoqn.MESSAGE, VideoSelectedActionOuterClass$VideoSelectedAction.class);
    }

    private VideoSelectedActionOuterClass$VideoSelectedAction() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0003\u0003ဇ\u0001\u0004ᐉ\u0002", new Object[]{"g", "b", "e", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new VideoSelectedActionOuterClass$VideoSelectedAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (VideoSelectedActionOuterClass$VideoSelectedAction.class) {
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
