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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FilterChipTransformCommandOuterClass$FilterChipTransformCommand extends aonm implements aooz {
    public static final FilterChipTransformCommandOuterClass$FilterChipTransformCommand a;
    private static volatile aopf e;
    public static final aonk filterChipTransformCommand;
    public int b;
    public apxf d;
    private byte f = 2;
    public String c = "";

    static {
        FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand = new FilterChipTransformCommandOuterClass$FilterChipTransformCommand();
        a = filterChipTransformCommandOuterClass$FilterChipTransformCommand;
        aonm.registerDefaultInstance(FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class, filterChipTransformCommandOuterClass$FilterChipTransformCommand);
        filterChipTransformCommand = aonm.newSingularGeneratedExtension(apxf.a, filterChipTransformCommandOuterClass$FilterChipTransformCommand, filterChipTransformCommandOuterClass$FilterChipTransformCommand, null, 355248151, aoqn.MESSAGE, FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class);
    }

    private FilterChipTransformCommandOuterClass$FilterChipTransformCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ᐉ\u0004\u0005ဈ\u0002", new Object[]{"b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new FilterChipTransformCommandOuterClass$FilterChipTransformCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
