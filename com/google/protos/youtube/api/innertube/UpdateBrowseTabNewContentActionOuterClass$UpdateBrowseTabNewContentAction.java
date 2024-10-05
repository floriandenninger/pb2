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
import defpackage.atvv;
import defpackage.avei;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction extends aonm implements aooz {
    public static final UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction a;
    private static volatile aopf h;
    public static final aonk updateBrowseTabNewContentAction;
    public int b;
    public avei d;
    public atvv e;
    public long f;
    public int g;
    private byte i = 2;
    public String c = "";

    static {
        UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction = new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
        a = updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction;
        aonm.registerDefaultInstance(UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction);
        updateBrowseTabNewContentAction = aonm.newSingularGeneratedExtension(apxf.a, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction, null, 102200546, aoqn.MESSAGE, UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class);
    }

    private UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
