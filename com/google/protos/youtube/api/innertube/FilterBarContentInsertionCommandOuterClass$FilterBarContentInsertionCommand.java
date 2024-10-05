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
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand extends aonm implements aooz {
    public static final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a;
    public static final aonk filterBarContentInsertionCommand;
    private static volatile aopf g;
    public int b;
    public aulq c;
    public int d;
    public apxf e;
    public boolean f;
    private byte h = 2;

    static {
        FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
        a = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
        aonm.registerDefaultInstance(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
        filterBarContentInsertionCommand = aonm.newSingularGeneratedExtension(apxf.a, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, null, 362185493, aoqn.MESSAGE, FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class);
    }

    private FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0006ᐉ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class) {
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
