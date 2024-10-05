package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdx extends aonm implements aooz {
    public static final apdx a;
    private static volatile aopf j;
    public int b;
    public int c;
    public apdu d;
    public boolean e;
    public boolean f;
    public aony g = aonm.emptyProtobufList();
    public apdr h;
    public apdw i;

    static {
        apdx apdxVar = new apdx();
        a = apdxVar;
        aonm.registerDefaultInstance(apdx.class, apdxVar);
    }

    private apdx() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\uf743㤸\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0005ဇ\u0005\u0006ဇ\u0006\t\u001a\u000bဉ\t\uf38c㗞ဉ\u0002\uf743㤸ဉ\b", new Object[]{"b", "c", apaf.o, "e", "f", "g", "i", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apdx();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apdx.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
